package com.mycompany.myapp.domain;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * A Product.
 */
@Document(collection = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("prod_id")
    private Integer prodId;

    @Field("prod_name")
    private String prodName;

    @Field("price")
    private Double price;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public String getId() {
        return this.id;
    }

    public Product id(String id) {
        this.setId(id);
        return this;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getProdId() {
        return this.prodId;
    }

    public Product prodId(Integer prodId) {
        this.setProdId(prodId);
        return this;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return this.prodName;
    }

    public Product prodName(String prodName) {
        this.setProdName(prodName);
        return this;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Double getPrice() {
        return this.price;
    }

    public Product price(Double price) {
        this.setPrice(price);
        return this;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }
        return id != null && id.equals(((Product) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Product{" +
            "id=" + getId() +
            ", prodId=" + getProdId() +
            ", prodName='" + getProdName() + "'" +
            ", price=" + getPrice() +
            "}";
    }
}
