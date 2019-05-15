package com.example.stockapp;

public class Product {
    int prodId;
    String description;
    int small;
    int medium;
    int large;
    int xlarge;

    public Product(int prodId, String description, int small, int medium, int large, int xlarge) {
        this.prodId = prodId;
        this.description = description;
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.xlarge = xlarge;
    }

    public int getProdId() { return prodId; }
    public void setProdId(int prodId) { this.prodId = prodId; }

    public String getDescription() {return description;}
    public void setDescription(String description) { this.description = description; }

    public int getSmall() {return small;}
    public void setSmall(int small) {this.small = small;}

    public int getMedium() {return medium;}
    public void setMedium(int medium) {this.medium = medium;}

    public int getLarge() {return large;
    }

    public void setLarge(int large) {
        this.large = large;
    }

    public int getXlarge() {
        return xlarge;
    }

    public void setXlarge(int xlarge) {
        this.xlarge = xlarge;
    }

    @Override
    public String toString() {
        return "Product:" + prodId + "\n"+
                "Description:'" + description + "\n"+
                "Small:" + small + "\n"+
                "Medium:" + medium + "\n"+
                "Large:" + large + "\n"+
                "Extra Large:" + xlarge + "\n"+
                '}';
    }
}
