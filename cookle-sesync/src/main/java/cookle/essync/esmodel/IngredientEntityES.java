package cookle.essync.esmodel;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by huseyina on 3/3/2017.
 */
@Document(indexName = "recipe", type = "recipe", shards = 1, replicas = 0, refreshInterval = "-1")
public class IngredientEntityES {
    private Double quantity;
    private String unit;
    private String item;
    private String putFor;
    private String detail;

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getPutFor() {
        return putFor;
    }

    public void setPutFor(String putFor) {
        this.putFor = putFor;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
