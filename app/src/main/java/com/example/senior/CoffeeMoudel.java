package com.example.senior;

public class CoffeeMoudel {

private String name;
    private String imageUrl;
    private  int Quantity=0;
    private String prize;

    public CoffeeMoudel(String name, String imageUrl, String prize) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getQuantity() {
        return Quantity;
    }

    public String getPrize() {
        return prize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "CoffeeMoudel{" +
                "name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", Quantity=" + Quantity +
                ", prize='" + prize + '\'' +
                '}';
    }
}
