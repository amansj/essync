package cookle.core.model.domain;

import javax.persistence.*;

/**
 * Created by huseyina on 3/18/2017.
 */
@Entity
@Table(name = "ingredient", schema = "cookle", catalog = "")
public class IngredientEntity {
    private int id;
    private String detail;
    private String item;
    private String putFor;
    private double quantity;
    private String unit;
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
    @Column(name = "detail")
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Basic
    @Column(name = "item")
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Basic
    @Column(name = "put_for")
    public String getPutFor() {
        return putFor;
    }

    public void setPutFor(String putFor) {
        this.putFor = putFor;
    }

    @Basic
    @Column(name = "quantity")
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setParent(RecipeEntity parent) {
        this.parent = parent;
    }

    @ManyToOne
    public RecipeEntity getParent() {
        return parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IngredientEntity that = (IngredientEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.quantity, quantity) != 0) return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;
        if (item != null ? !item.equals(that.item) : that.item != null) return false;
        if (putFor != null ? !putFor.equals(that.putFor) : that.putFor != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (putFor != null ? putFor.hashCode() : 0);
        temp = Double.doubleToLongBits(quantity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }


}
