package cookle.core.model.domain;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by huseyina on 3/18/2017.
 */
@Entity
@Table(name = "image", schema = "cookle", catalog = "")
public class ImageEntity {
    private int id;
    private byte[] data;
    private String format;
    private String iType;
    private String name;
    private long size;
    private String url;
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

    @Column(name = "data")
    @Lob
    @Basic(fetch = FetchType.LAZY)
    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Basic
    @Column(name = "format")
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Basic
    @Column(name = "i_type")
    public String getiType() {
        return iType;
    }

    public void setiType(String iType) {
        this.iType = iType;
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
    @Column(name = "size")
    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

        ImageEntity that = (ImageEntity) o;

        if (id != that.id) return false;
        if (size != that.size) return false;
        if (!Arrays.equals(data, that.data)) return false;
        if (format != null ? !format.equals(that.format) : that.format != null) return false;
        if (iType != null ? !iType.equals(that.iType) : that.iType != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Arrays.hashCode(data);
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + (iType != null ? iType.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (size ^ (size >>> 32));
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }


}
