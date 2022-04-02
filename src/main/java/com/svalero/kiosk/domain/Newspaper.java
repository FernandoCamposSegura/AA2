package com.svalero.kiosk.domain;

import java.util.Objects;

public class Newspaper {
    private String gender;
    private String editorial;
    private String code;
    private int yearPublication;
    private float price;

    public Newspaper(String gender, String editorial, String code, int yearPublication, float price) {
        this.gender = gender;
        this.editorial = editorial;
        this.code = code;
        this.yearPublication = yearPublication;
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
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
        Newspaper newspaper = (Newspaper) o;
        return code.equals(newspaper.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
