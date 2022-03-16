package com.example.lap05;

public class Food {
    private int id;
    private String name;
    private String review;
    private String price;
    private int imgFood;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getReview() {
        return review;
    }

    public String getPrice() {
        return price;
    }

    public int getImgFood() {
        return imgFood;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImgFood(int imgFood) {
        this.imgFood = imgFood;
    }

    public Food(int id, String name, String review, String price, int imgFood) {
        this.id = id;
        this.name = name;
        this.review = review;
        this.price = price;
        this.imgFood = imgFood;
    }
}
