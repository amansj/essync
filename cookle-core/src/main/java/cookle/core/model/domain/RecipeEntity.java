package cookle.core.model.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by huseyina on 3/18/2017.
 */
@Entity
@Table(name = "recipe", schema = "cookle", catalog = "")
public class RecipeEntity {
    private int id;
    private String author;
    private Integer cookTime;
    private Integer difficulty;
    private Integer fornamount;
    private String fornunit;
    private Date imported;
    private String name;
    private Integer prepareTime;
    private String presentation;
    private Date published;
    private Integer raters;
    private double rating;
    private String recipe;
    private String tips;
    private String tricks;
    private Date updated;
    private String url;
    private Integer cost;
    private ImageEntity images;
    private List<CategoryEntity> categories;
    private List<IngredientEntity> ingredients;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "cook_time")
    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    @Basic
    @Column(name = "difficulty")
    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    @Basic
    @Column(name = "fornamount")
    public Integer getFornamount() {
        return fornamount;
    }

    public void setFornamount(Integer fornamount) {
        this.fornamount = fornamount;
    }

    @Basic
    @Column(name = "fornunit")
    public String getFornunit() {
        return fornunit;
    }

    public void setFornunit(String fornunit) {
        this.fornunit = fornunit;
    }

    @Basic
    @Column(name = "imported")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getImported() {
        return imported;
    }

    public void setImported(Date imported) {
        this.imported = imported;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "prepare_time")
    public Integer getPrepareTime() {
        return prepareTime;
    }

    public void setPrepareTime(Integer prepareTime) {
        this.prepareTime = prepareTime;
    }

    @Basic
    @Column(name = "presentation")
    @Lob
    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    @Basic
    @Column(name = "published",updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    @Basic
    @Column(name = "raters")
    public Integer getRaters() {
        return raters;
    }

    public void setRaters(Integer raters) {
        this.raters = raters;
    }

    @Basic
    @Column(name = "rating")
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "recipe")
    @Lob
    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    @Basic
    @Column(name = "tips")
    @Lob
    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    @Basic
    @Column(name = "tricks")
    @Lob
    public String getTricks() {
        return tricks;
    }

    public void setTricks(String tricks) {
        this.tricks = tricks;
    }

    @Basic
    @Column(name = "updated")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "cost")
    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public void setImages(ImageEntity images) {
        this.images = images;
    }

    @OneToOne(mappedBy = "parent", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public ImageEntity getImages() {
        return images;
    }

    @OneToMany(mappedBy = "parent", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<CategoryEntity> getCategories() {
        return categories;
    }


    public void setCategories(List<CategoryEntity> categories) {
        this.categories = categories;
    }

    public void setIngredients(List<IngredientEntity> ingredients) {
        this.ingredients = ingredients;
    }

    @OneToMany(mappedBy = "parent", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<IngredientEntity> getIngredients() {
        return ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecipeEntity that = (RecipeEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.rating, rating) != 0) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (cookTime != null ? !cookTime.equals(that.cookTime) : that.cookTime != null) return false;
        if (difficulty != null ? !difficulty.equals(that.difficulty) : that.difficulty != null) return false;
        if (fornamount != null ? !fornamount.equals(that.fornamount) : that.fornamount != null) return false;
        if (fornunit != null ? !fornunit.equals(that.fornunit) : that.fornunit != null) return false;
        if (imported != null ? !imported.equals(that.imported) : that.imported != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (prepareTime != null ? !prepareTime.equals(that.prepareTime) : that.prepareTime != null) return false;
        if (presentation != null ? !presentation.equals(that.presentation) : that.presentation != null) return false;
        if (published != null ? !published.equals(that.published) : that.published != null) return false;
        if (raters != null ? !raters.equals(that.raters) : that.raters != null) return false;
        if (recipe != null ? !recipe.equals(that.recipe) : that.recipe != null) return false;
        if (tips != null ? !tips.equals(that.tips) : that.tips != null) return false;
        if (tricks != null ? !tricks.equals(that.tricks) : that.tricks != null) return false;
        if (updated != null ? !updated.equals(that.updated) : that.updated != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (cost != null ? !cost.equals(that.cost) : that.cost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (cookTime != null ? cookTime.hashCode() : 0);
        result = 31 * result + (difficulty != null ? difficulty.hashCode() : 0);
        result = 31 * result + (fornamount != null ? fornamount.hashCode() : 0);
        result = 31 * result + (fornunit != null ? fornunit.hashCode() : 0);
        result = 31 * result + (imported != null ? imported.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (prepareTime != null ? prepareTime.hashCode() : 0);
        result = 31 * result + (presentation != null ? presentation.hashCode() : 0);
        result = 31 * result + (published != null ? published.hashCode() : 0);
        result = 31 * result + (raters != null ? raters.hashCode() : 0);
        temp = Double.doubleToLongBits(rating);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (recipe != null ? recipe.hashCode() : 0);
        result = 31 * result + (tips != null ? tips.hashCode() : 0);
        result = 31 * result + (tricks != null ? tricks.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        return result;
    }


}
