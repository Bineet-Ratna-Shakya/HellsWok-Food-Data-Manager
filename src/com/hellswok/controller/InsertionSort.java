/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hellswok.controller;

import com.hellswok.model.HellsWokModel;
import java.util.ArrayList;

/**
 *  * This class implements the Insertion Sort algorithm for sorting an
 * ArrayList of HellsWokModel objects.
 *
 *
 * @author soul
 */
public class InsertionSort {

    /**
     * Sorts the given ArrayList of HellsWokModel objects using the Insertion
     * Sort algorithm.
     *
     * @param list The ArrayList to be sorted.
     * @param get_data The criteria based on which the sorting is performed.
     * Possible values: "S.No", "FoodName", "FoodGroup", "Calories",
     * "ServingSize", "Price", "CountryOfOrigin", "VegOrNonVeg".
     * @return The sorted ArrayList.
     */
    public ArrayList<HellsWokModel> insertionSort
        (ArrayList<HellsWokModel> list, String get_data) {
        for (int i = 1; i < list.size(); i++) {
            HellsWokModel key = list.get(i);
            int j = i - 1;

            while (j >= 0 && compare(list.get(j), key, get_data) > 0) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }

            list.set(j + 1, key);
        }

        return list;
    }

    /**
     * Compares two HellsWokModel objects based on the specified criteria.
     *
     * @param a The first HellsWokModel object.
     * @param b The second HellsWokModel object.
     * @param get_data The criteria based on which the comparison is performed.
     * Possible values: "S.No", "FoodName", "FoodGroup", "Calories",
     * "ServingSize", "Price", "CountryOfOrigin", "VegOrNonVeg".
     * @return A negative integer, zero, or a positive integer as the first
     * argument is less than, equal to, or greater than the second.
     */

    private int compare(HellsWokModel a, HellsWokModel b, String get_data) {
        switch (get_data) {
            case "S.No":
                return Integer.compare
        (a.getSerialNumber(), b.getSerialNumber());
            case "FoodName":
                return a.getFoodName().compareTo
        (b.getFoodName());
            case "FoodGroup":
                return a.getFoodGroup().compareTo
        (b.getFoodGroup());
            case "Calories":
                return Integer.compare(a.getCalories(), b.getCalories());
            case "ServingSize":
                return a.getServingSize().compareTo
        (b.getServingSize());
            case "Price":
                return Integer.compare(a.getPrice(), b.getPrice());
            case "CountryOfOrigin":
                return a.getCountryOfOrigin().compareTo
        (b.getCountryOfOrigin());
            case "VegOrNonVeg":
                return a.getVegOrNonVeg().compareTo
        (b.getVegOrNonVeg());
            default:
                return 0;
        }
    }
}
