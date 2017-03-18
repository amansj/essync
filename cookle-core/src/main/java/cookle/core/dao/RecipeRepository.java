package cookle.core.dao;


import cookle.core.model.domain.RecipeEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by huseyina on 9/28/2016.
 */
public interface RecipeRepository extends CrudRepository<RecipeEntity, String> {
}
