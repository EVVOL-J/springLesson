package ru.geekbrains.homework;

public class Product {
    private int id;
    private String title;
    private int cost;

    Product(int id, String title, int cost)
    {
        this.id=id;
        this.title=title;
        this.cost=cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }
}