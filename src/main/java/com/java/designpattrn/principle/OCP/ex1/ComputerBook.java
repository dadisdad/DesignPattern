package com.java.designpattrn.principle.OCP.ex1;

/**
 * @author dadisdad
 * @date 2018/3/14
 */
public class ComputerBook implements IComputerBook {

    private String name;

    private int price;

    private String author;

    private String scope;

    public ComputerBook(String name, int price, String author, String scope) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.scope = scope;
    }

    @Override
    public String getScope() {
        return this.scope;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
