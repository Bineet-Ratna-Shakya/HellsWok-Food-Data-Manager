/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hellswok.model;

/**
 * This class represents the data model for HellsWok,includes attributes such as
 * serial number, food name, food group, calories, serving size, price, country
 * of origin, and whether it is vegetarian or non-vegetarian.
 *
 * @author soul
 */
public class HellsWokModel {

    private int serialNumber;
    private String foodName;
    private String foodGroup;
    private int calories;
    private String servingSize;
    private int price;
    private String countryOfOrigin;
    private String vegOrNonVeg;

    /**
     * Constructor to initialize the HellsWokModel with provided values.
     *
     * @param serialNumber The serial number of the food item.
     * @param foodName The name of the food item.
     * @param foodGroup The food group to which the item belongs.
     * @param calories The caloric content of the item.
     * @param servingSize The serving size of the item.
     * @param price The price of the item.
     * @param countryOfOrigin The country of origin of the item.
     * @param vegOrNonVeg Whether the item is vegetarian or non-vegetarian.
     */
    public HellsWokModel(int serialNumber, String foodName, String foodGroup, int calories,
            String servingSize, int price, String countryOfOrigin, String vegOrNonVeg) {
        this.serialNumber = serialNumber;
        this.foodName = foodName;
        this.foodGroup = foodGroup;
        this.calories = calories;
        this.servingSize = servingSize;
        this.price = price;
        this.countryOfOrigin = countryOfOrigin;
        this.vegOrNonVeg = vegOrNonVeg;
    }

    /**
     * Gets the serial number of the food item.
     * 
     * @return The serial number.
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the serial number of the food item.
     * 
     * @param serialNumber The new serial number.
     */
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Gets the name of the food item.
     * 
     * @return The food name.
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * Sets the name of the food item.
     * 
     * @param foodName The new food name.
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * Gets the food group to which the item belongs.
     * 
     * @return The food group.
     */
    public String getFoodGroup() {
        return foodGroup;
    }

    /**
     * Sets the food group to which the item belongs.
     * 
     * @param foodGroup The new food group.
     */
    public void setFoodGroup(String foodGroup) {
        this.foodGroup = foodGroup;
    }

    /**
     * Gets the caloric content of the food item.
     * 
     * @return The caloric content.
     */
    public int getCalories() {
        return calories;
    }

    /**
     * Sets the caloric content of the food item.
     * 
     * @param calories The new caloric content.
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
     * Gets the serving size of the food item.
     * 
     * @return The serving size.
     */
    public String getServingSize() {
        return servingSize;
    }

    /**
     * Sets the serving size of the food item.
     * 
     * @param servingSize The new serving size.
     */
    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    /**
     * Gets the price of the food item.
     * 
     * @return The price.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the price of the food item.
     * 
     * @param price The new price.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Gets the country of origin of the food item.
     * 
     * @return The country of origin.
     */
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the country of origin of the food item.
     * 
     * @param countryOfOrigin The new country of origin.
     */
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    /**
     * Gets whether the food item is vegetarian or non-vegetarian.
     * 
     * @return "Veg" if vegetarian, "Non-Veg" if non-vegetarian.
     */
    public String getVegOrNonVeg() {
        return vegOrNonVeg;
    }

    /**
     * Sets whether the food item is vegetarian or non-vegetarian.
     * 
     * @param vegOrNonVeg The new value, either "Veg" or "Non-Veg".
     */
    public void setVegOrNonVeg(String vegOrNonVeg) {
        this.vegOrNonVeg = vegOrNonVeg;
    }
}