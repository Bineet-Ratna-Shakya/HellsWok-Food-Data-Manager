/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hellswok.controller;

/**
 * This class implements the MergeSort algorithm for sorting an ArrayList of
 * HellsWokModel objects.
 *
 * @author soul
 */
import com.hellswok.model.HellsWokModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeSort {

    /**
     * Sorts the given ArrayList of HellsWokModel objects using the MergeSort
     * algorithm.
     *
     * @param list The ArrayList to be sorted.
     * @param get_data The criteria based on which the sorting is
     * performed.Possible values: "S.No", "FoodName", "FoodGroup", "Calories",
     * "ServingSize", "Price", "CountryOfOrigin", "VegOrNonVeg".
     * @return The sorted ArrayList.
     *
     */
    public ArrayList<HellsWokModel> mergeSort(ArrayList<HellsWokModel> list, String get_data) {
        if (list.size() <= 1) {
            return list;
        }

        int middle = list.size() / 2;
        ArrayList<HellsWokModel> left = new ArrayList<>(list.subList(0, middle));
        ArrayList<HellsWokModel> right = new ArrayList<>(list.subList(middle, list.size()));

        left = mergeSort(left, get_data);
        right = mergeSort(right, get_data);

        return merge(left, right, get_data);
    }

    /**
     * Merges two sorted ArrayLists into a single sorted ArrayList based on the
     * specified criteria.
     *
     * @param left The left ArrayList to be merged.
     * @param right The right ArrayList to be merged.
     * @param get_data The criteria based on which the merging is performed.
     * Possible values: "S.No", "FoodName", "FoodGroup", "Calories",
     * "ServingSize", "Price", "CountryOfOrigin", "VegOrNonVeg".
     * @return The merged and sorted ArrayList.
     */

    private ArrayList<HellsWokModel> merge(ArrayList<HellsWokModel> left, ArrayList<HellsWokModel> right, String get_data) {
        ArrayList<HellsWokModel> result = new ArrayList<>();
        int leftIndex = 0, rightIndex = 0;
        int value = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {

            switch (get_data) {
                case "S.No" ->
                    value = Integer.compare(left.get(leftIndex).getSerialNumber(), right.get(rightIndex).getSerialNumber());
                case "FoodName" ->
                    value = left.get(leftIndex).getFoodName().compareTo(right.get(rightIndex).getFoodName());
                case "FoodGroup" ->
                    value = left.get(leftIndex).getFoodGroup().compareTo(right.get(rightIndex).getFoodGroup());
                case "Calories" ->
                    value = Integer.compare(left.get(leftIndex).getCalories(), right.get(rightIndex).getCalories());
                case "ServingSize" ->
                    value = left.get(leftIndex).getServingSize().compareTo(right.get(rightIndex).getServingSize());
                case "Price" ->
                    value = Integer.compare(left.get(leftIndex).getPrice(), right.get(rightIndex).getPrice());
                case "CountryOfOrigin" ->
                    value = left.get(leftIndex).getCountryOfOrigin().compareTo(right.get(rightIndex).getCountryOfOrigin());
                case "VegOrNonVeg" ->
                    value = left.get(leftIndex).getVegOrNonVeg().compareTo(right.get(rightIndex).getVegOrNonVeg());
            }
            if (value < 0) {
                result.add(left.get(leftIndex));
                leftIndex++;
            } else {
                result.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        result.addAll(left.subList(leftIndex, left.size()));
        result.addAll(right.subList(rightIndex, right.size()));

        return result;
    }
}
