package cookle.core.esmodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

/**
 * Created by huseyina on 3/3/2017.
 */

@Document(indexName = "recipe", type = "recipe", shards = 1, replicas = 0, refreshInterval = "-1")
public class RecipeEntityES {
    @Id
    private Integer id;
    private String name;
    private Double rating;
    private Integer raters;
    private String author;
    private Integer prepareTime;
    private Integer cookTime;
    private Integer forNAmount;
    private String forNUnit;
    private Integer difficulty;
    private Integer cost;
    private String presentation;
    private String recipe;
    private String tips;
    private String tricks;
    private String url;
    @Field(type = FieldType.String)
    private List<String> categories;
    private String images;
    @Field(type = FieldType.Nested)
    private List<IngredientEntityES> ingredients;
    @Version
    private Long version;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getRaters() {
        return raters;
    }

    public void setRaters(Integer raters) {
        this.raters = raters;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrepareTime() {
        return prepareTime;
    }

    public void setPrepareTime(Integer prepareTime) {
        this.prepareTime = prepareTime;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public Integer getForNAmount() {
        return forNAmount;
    }

    public void setForNAmount(Integer forNAmount) {
        this.forNAmount = forNAmount;
    }

    public String getForNUnit() {
        return forNUnit;
    }

    public void setForNUnit(String forNUnit) {
        this.forNUnit = forNUnit;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public String getTricks() {
        return tricks;
    }

    public void setTricks(String tricks) {
        this.tricks = tricks;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<IngredientEntityES> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientEntityES> ingredients) {
        this.ingredients = ingredients;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "RecipeEntityES{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
