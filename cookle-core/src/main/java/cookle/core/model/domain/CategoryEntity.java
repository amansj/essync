package cookle.core.model.domain;

import javax.persistence.*;

/**
 * Created by huseyina on 3/18/2017.
 */
@Entity
@Table(name = "category", schema = "cookle", catalog = "")
public class CategoryEntity {
    private int id;
    private String name;
    private RecipeEntity parent;

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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParent(RecipeEntity parent) {
        this.parent = parent;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public RecipeEntity getParent() {
        return parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


}
