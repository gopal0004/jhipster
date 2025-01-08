package com.mycompany.myapp.domain;

import java.io.Serializable;
import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * A Customer.
 */
@Document(collection = "customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("cust_id")
    private Integer custId;

    @Field("cust_name")
    private String custName;

    @Field("email")
    private String email;

    @Field("phone_no")
    private String phoneNo;

    @Field("address")
    private String address;

    @Field("order_date")
    private LocalDate orderDate;

    @Field("product")
    private Product product;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public String getId() {
        return this.id;
    }

    public Customer id(String id) {
        this.setId(id);
        return this;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCustId() {
        return this.custId;
    }

    public Customer custId(Integer custId) {
        this.setCustId(custId);
        return this;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return this.custName;
    }

    public Customer custName(String custName) {
        this.setCustName(custName);
        return this;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return this.email;
    }

    public Customer email(String email) {
        this.setEmail(email);
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public Customer phoneNo(String phoneNo) {
        this.setPhoneNo(phoneNo);
        return this;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return this.address;
    }

    public Customer address(String address) {
        this.setAddress(address);
        return this;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getOrderDate() {
        return this.orderDate;
    }

    public Customer orderDate(LocalDate orderDate) {
        this.setOrderDate(orderDate);
        return this;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer product(Product product) {
        this.setProduct(product);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Customer)) {
            return false;
        }
        return id != null && id.equals(((Customer) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Customer{" +
            "id=" + getId() +
            ", custId=" + getCustId() +
            ", custName='" + getCustName() + "'" +
            ", email='" + getEmail() + "'" +
            ", phoneNo='" + getPhoneNo() + "'" +
            ", address='" + getAddress() + "'" +
            ", orderDate='" + getOrderDate() + "'" +
            "}";
    }
}
