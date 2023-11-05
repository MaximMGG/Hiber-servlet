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
public class Orderer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    private TypeOfProduct typeOfProduct;

    @ManyToOne
    private Castomer castomer;

    @Column
    private Date date;

    public Orderer() {}

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

    public Castomer getCastomer() {
        return castomer;
    }

    public void setCastomer(Castomer castromer) {
        this.castomer = castromer;
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
        result = prime * result + ((castomer == null) ? 0 : castomer.hashCode());
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
        Orderer other = (Orderer) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (typeOfProduct != other.typeOfProduct)
            return false;
        if (castomer == null) {
            if (other.castomer != null)
                return false;
        } else if (!castomer.equals(other.castomer))
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
        return "Order [id=" + id + ", name=" + name + ", typeOfProduct=" + typeOfProduct + ", castromer=" + castomer
                + ", date=" + date + "]";
    }

    

}
