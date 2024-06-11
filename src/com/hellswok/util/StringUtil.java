/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hellswok.util;

import com.hellswok.model.HellsWokModel;
import com.hellswok.view.HellsWok;
import java.util.List;

/**
 *
 * @author soul
 */
public class StringUtil {

    public static final String VALIDATION_EXCEPTION = "is required";
    public static final String SEARCH_ERROR = "No matching data found.";

    public static final String buildSearchResultMessage(List<HellsWokModel> searchedModel) {
        StringBuilder messageBuilder = new StringBuilder("Search Result:\n");

        for (HellsWokModel model : searchedModel) {
            messageBuilder.append("S.No ").append(model.getSerialNumber()).append("\n")
                    .append("Food Name: ").append(model.getFoodName()).append("\n")
                    .append("Food Group: ").append(model.getFoodGroup()).append("\n")
                    .append("Calories: ").append(model.getCalories()).append("\n")
                    .append("Serving Size: ").append(model.getServingSize()).append("\n")
                    .append("Price: ").append(model.getPrice()).append("\n")
                    .append("Country Of Origin: ").append(model.getCountryOfOrigin()).append("\n")
                    .append("Veg/Non-veg: ").append(model.getVegOrNonVeg()).append("\n");
        }

        return messageBuilder.toString();
    }
    public static final String SEARCH_RESULT = " Search Result";
    public static final String NEITHER = "Please select either Veg or Non-Veg.";
    public static final String BOTH = "Please select either Veg or Non-Veg.";
    public static final String EXISTING = "Food Name already exists in the table. Please enter a unique Food Name.";
    public static final String CALORIES_PRICE_ERROR = "Please enter a valid number for Calories or Price.";
    public static final String VALID_FIELDS_ERROR = "Please enter valid fields";
    public static final String SNO_FOOD_NAME_ERROR = "Please enter both S.No and Food Name.";
    public static final String DELETE_CONFIRMATION = "Are you sure you want to delete this row?\n\n";
    public static final String DELETE_SUCCESSION = "Row Deleted Successfully";
    public static final String DATA_NOT_FOUND = "Row with entered S.No and Food Name not found.";
    public static final String SNO_ERROR = "S.No not found.";
    public static final String EMPTY_FEILDS = "Multiple Fields Empty";
    public static final String INVALID_SELECTION = "Veg/Non-veg field is not filled";
    public static final String DUPLICATE_FOODNAME = "Food Name already exists in the table. Please enter a unique Food Name.";
    public static final String UPDATE_SUCCESS = "Successful Update";

}
