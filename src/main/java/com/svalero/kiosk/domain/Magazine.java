package com.svalero.kiosk.domain;

import java.util.Objects;

public class Magazine {
    private String category;
    private String code;
    private int yearPublication;
    private int numPages;
    private float price;

    public Magazine(String category, String code, int yearPublication, int numPages, float price) {
        this.category = category;
        this.code = code;
        this.yearPublication = yearPublication;
        this.numPages = numPages;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return code.equals(magazine.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "gender='" + category + '\'' +
                ", code='" + code + '\'' +
                ", yearPublication=" + yearPublication +
                ", numPages=" + numPages +
                ", price=" + price +
                '}';
    }
}
