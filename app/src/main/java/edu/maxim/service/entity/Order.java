package edu.maxim.service.entity;

import java.util.Date;

import edu.maxim.service.Type.TypeOfProduct;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    private TypeOfProduct typeOfProduct;

    @ManyToOne
    private Castomer castromer;

    @Column
    private Date date;

    public Order() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfProduct getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(TypeOfProduct typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public Castomer getCastromer() {
        return castromer;
    }

    public void setCastromer(Castomer castromer) {
        this.castromer = castromer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((typeOfProduct == null) ? 0 : typeOfProduct.hashCode());
        result = prime * result + ((castromer == null) ? 0 : castromer.hashCode());
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (typeOfProduct != other.typeOfProduct)
            return false;
        if (castromer == null) {
            if (other.castromer != null)
                return false;
        } else if (!castromer.equals(other.castromer))
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", name=" + name + ", typeOfProduct=" + typeOfProduct + ", castromer=" + castromer
                + ", date=" + date + "]";
    }

    

}
