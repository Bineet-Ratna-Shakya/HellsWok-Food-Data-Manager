/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hellswok.controller;

/**
 * This class implements the Binary Search algorithm for searching a sorted
 * ArrayList of HellsWokModel objects based on a specified key and attribute for
 * sorting.
 *
 * @author soul
 */
import com.hellswok.model.HellsWokModel;
import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {

    /**
     * Performs a binary search on the given sorted ArrayList of HellsWokModel
     * objects based on the specified key and attribute for sorting.
     *
     * @param searchList The ArrayList to be searched (must be presorted).
     * @param key The value to be searched for.
     * @param sortBy The attribute based on which the ArrayList is sorted.
     * Possible values: "FoodName", "FoodGroup", and others.
     * @return An ArrayList containing the searched HellsWokModel objects. If
     * the key is not found, an empty ArrayList is returned.
     */
    public ArrayList<HellsWokModel> binarySearch
        (ArrayList<HellsWokModel> searchList, String key, String sortBy) {
        // Sort the list by the specified attribute
        InsertionSort insertionSort = new InsertionSort();
        ArrayList<HellsWokModel> sortedList = insertionSort.insertionSort
        (searchList, sortBy);

        // Perform binary search
        int result = binarySearchHelper(sortedList, key, sortBy);

        // Create a new list to store the searched models
        ArrayList<HellsWokModel> searchedModels = new ArrayList<>();

        // If the result is not -1, add the corresponding model to the list
        if (result != -1) {
            searchedModels.add(sortedList.get(result));
        }

        return searchedModels;
    }

    /**
     * Helper method for performing binary search on the sorted ArrayList.
     *
     * @param sortedList The sorted ArrayList to be searched.
     * @param key The value to be searched for.
     * @param sortBy The attribute based on which the ArrayList is sorted.
     * @return The index of the found key in the ArrayList, or -1 if the key is
     * not found.
     */
    private int binarySearchHelper
        (ArrayList<HellsWokModel> sortedList, String key, String sortBy) {
        int low = 0;
        int high = sortedList.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            String midValue = getValue(sortedList.get(mid), sortBy);

            int compareResult = midValue.compareToIgnoreCase(key);

            if (compareResult == 0) {
                // Key found, but check for duplicates
                int leftIndex = mid - 1;
                while (leftIndex >= 0 && getValue
        (sortedList.get(leftIndex), sortBy).equalsIgnoreCase
        (key)) {
                    leftIndex--;
                }

                // Return the leftmost index of the key
                return leftIndex + 1;
            } else if (compareResult < 0) {
                // Key is greater, ignore the left half
                low = mid + 1;
            } else {
                // Key is smaller, ignore the right half
                high = mid - 1;
            }
        }

        // Key not found
        return -1;
    }

    /**
     * Gets the value of the specified attribute for a given HellsWokModel.
     *
     * @param model The HellsWokModel object.
     * @param sortBy The attribute based on which the value is retrieved.
     * @return The value of the specified attribute.
     */

    private String getValue(HellsWokModel model, String sortBy) {
        switch (sortBy) {
            case "FoodName":
                return model.getFoodName().toLowerCase();
            case "FoodGroup":
                return model.getFoodGroup().toLowerCase();
            default:
                return ""; // Handle unknown sortBy value
        }
    }
}

