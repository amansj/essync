package cookle.essync.job;

import cookle.core.dao.RecipeRepository;
import cookle.core.model.domain.CategoryEntity;
import cookle.core.model.domain.IngredientEntity;
import cookle.core.model.domain.RecipeEntity;
import cookle.essync.esdao.RecipeRepositoryES;
import cookle.essync.esmodel.IngredientEntityES;
import cookle.essync.esmodel.RecipeEntityES;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.stream.Collectors;

/**
 * Created by huseyina on 3/4/2017.
 */
@Component
public class MysqlESSync {

    private static final Logger logger = LoggerFactory.getLogger(MysqlESSync.class);

    @Autowired
    private RecipeRepositoryES recipeRepositoryES;

    @Autowired
    private RecipeRepository recipeRepository;

    @Transactional
    public void run() throws Exception {
        logger.info("Sync started");
        int nrecords = 0;
        for (RecipeEntity recipeEntity : recipeRepository.findAll()) {
            nrecords++;

            RecipeEntityES recipeEntityES = new RecipeEntityES();
            recipeEntityES.setAuthor(recipeEntity.getAuthor());
            recipeEntityES.setCategories(recipeEntity.getCategories().stream().map(CategoryEntity::getName).collect(Collectors.toList()));
            recipeEntityES.setImages(recipeEntity.getImages().getUrl());
            recipeEntityES.setCookTime(recipeEntity.getCookTime());
            recipeEntityES.setCost(recipeEntity.getCost());
            recipeEntityES.setDifficulty(recipeEntity.getDifficulty());
            recipeEntityES.setForNAmount(recipeEntity.getFornamount());
            recipeEntityES.setForNUnit(recipeEntity.getFornunit());
            recipeEntityES.setId(recipeEntity.getId());
            recipeEntityES.setIngredients(recipeEntity.getIngredients().stream().map(this::ingredientJpa2ES).collect(Collectors.toList()));
            recipeEntityES.setName(recipeEntity.getName());
            recipeEntityES.setPrepareTime(recipeEntity.getPrepareTime());
            recipeEntityES.setPresentation(recipeEntity.getPresentation());
            recipeEntityES.setRaters(recipeEntity.getRaters());
            recipeEntityES.setRating(recipeEntity.getRating());
            recipeEntityES.setRecipe(recipeEntity.getRecipe());
            recipeEntityES.setTips(recipeEntity.getTips());
            recipeEntityES.setTricks(recipeEntity.getTricks());
            recipeEntityES.setUrl(recipeEntity.getUrl());

            recipeRepositoryES.save(recipeEntityES);

            logger.info("Record {} saved", recipeEntityES);
        }

        logger.info("Sync ended with {} records", nrecords);
    }

    private IngredientEntityES ingredientJpa2ES(IngredientEntity ingredientEntity) {
        IngredientEntityES ingredientEntityES = new IngredientEntityES();
        ingredientEntityES.setDetail(ingredientEntity.getDetail());
        ingredientEntityES.setItem(ingredientEntity.getItem());
        ingredientEntityES.setPutFor(ingredientEntity.getPutFor());
        ingredientEntityES.setQuantity(ingredientEntity.getQuantity());
        ingredientEntityES.setUnit(ingredientEntity.getUnit());

        return ingredientEntityES;
    }
}
