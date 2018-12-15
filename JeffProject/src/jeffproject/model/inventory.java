/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeffproject.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author jeffreyt
 */
public class inventory {

    private static ObservableList<part> partStock = FXCollections.observableArrayList();
    private static ObservableList<product> productStock = FXCollections.observableArrayList();

    //part
    public static ObservableList<part> getParts() {
        return partStock;
    }

    public static void partAdd(part part) {
        partStock.add(part);
    }

    public static void deletePart(part part) {
        partStock.remove(part);
    }

    public static void updatePart(int partId, part part) {
        partStock.set(partId, part);
    }

    public static int partCount() {
        return partStock.size() + 1;
    }

    // product
    public static ObservableList<product> getProducts() {
        return productStock;
    }

    public static void productAdd(product product) {
        productStock.add(product);
    }

    public static void deleteProduct(product product) {
        productStock.remove(product);
    }

    public static void updateProduct(int productId, product product) {
        productStock.set(productId, product);
    }

    public int productCount() {
        return productStock.size() + 1;
    }

    // search  
    public static Integer partLookup(String sValue) {
        for (int x = 0; x < partStock.size(); x++) {
            if (sValue.equals(partStock.get(x).getName().getValue())) {
                return x;
            }
            if (isInt(sValue) == true) {
                if (Integer.parseInt(sValue) == partStock.get(x).getPartId().intValue()) {
                    return x;
                }
            }
        }
        return -1;
    }

    public static Integer productLookup(String sValue) {
        for (int x = 0; x < productStock.size(); x++) {
            if (sValue.equals(productStock.get(x).getName().getValue())) {
                return x;
            }
            if (isInt(sValue) == true) {
                if (Integer.parseInt(sValue) == productStock.get(x).getProductID().intValue()) {
                    return x;
                }
            }

        }
        return -1;
    }

    private static boolean isInt(String sValue) {
        return sValue.matches("-?\\d+") == true;
    }

    private static boolean isNumeric(String sValue) {
        return sValue.matches("-?\\d+(\\.\\d+)?") == true;
    }

    //Verification
    public static String isPartValid(String name, String price, String inv, String min,
            String max, String company, Boolean outsourced) {

        boolean validMinMax = true;
        String message = "";

        //name is required
        if (name.length() == 0) {
            message = "Part name is required.";
        }

        //price is required and must be a dobule zero or greater
        if (price.length() == 0) {
            message = message + System.lineSeparator()
                    + "Price is required.";
        } else if (isNumeric(price) == false) {
            message = message + System.lineSeparator()
                    + "Price must be numeric.";
        } else if (Double.parseDouble(price) < 0) {
            message = message + System.lineSeparator()
                    + "Price must be zero or greater.";
        }

        //Inventory is required and must be a Integer zero or greater
        if (inv.length() == 0) {
            message = message + System.lineSeparator()
                    + "Invetory is required.";
        } else if (isInt(inv) == false) {
            message = message + System.lineSeparator()
                    + "Invetory must be numeric.";
        } else if (Integer.parseInt(inv) < 0) {
            message = message + System.lineSeparator()
                    + "Invetory must be zero or greater.";
        }

        //Minimum is required and must be a Integer zero or greater
        if (min.length() == 0) {
            validMinMax = false;
            message = message + System.lineSeparator()
                    + "Invetory is required.";
        } else if (isInt(min) == false) {
            validMinMax = false;
            message = message + System.lineSeparator()
                    + "Invetory must be numeric.";
        } else if (Integer.parseInt(min) < 0) {
            validMinMax = false;
            message = message + System.lineSeparator()
                    + "Minimum must be zero or greater.";
        }

        //Maximum is required and must be a Integer zero or greater
        if (max.length() == 0) {
            validMinMax = false;
            message = message + System.lineSeparator()
                    + "Maximum is required.";
        } else if (isInt(max) == false) {
            validMinMax = false;
            message = message + System.lineSeparator()
                    + "Maximum must be numeric.";
        } else if (Integer.parseInt(max) < 0) {
            validMinMax = false;
            message = message + System.lineSeparator()
                    + "Maximum must be zero or greater.";
        }

        //Min must be less than max, only check if min and max are valid
        if (validMinMax == true) {
            if (Integer.parseInt(min) > Integer.parseInt(max)) {
                message = message + System.lineSeparator()
                        + "Minimum must be less than maximum.";
            }
        }

        //Company is required if outsourced
        if (outsourced == true) {
            if (company.length() == 0) {
                message = message + System.lineSeparator()
                        + "Company name is required.";
            }
        }

        return message;
    }

    public static String isProductValid(String name, String price, String inStock,
            String min, String max, ObservableList<part> parts) {

        double partTotal = 0;
        String message = "";
        boolean validMinMax = true;
        boolean validPrice = true;

        //name is required
        if (name.length() == 0) {
            message = "Product name is required.";
        }

        //price is required and must be a dobule zero or greater
        if (price.length() == 0) {
            validPrice = false;
            message = message + System.lineSeparator()
                    + "Price is required.";
        } else if (isNumeric(price) == false) {
            validPrice = false;
            message = message + System.lineSeparator()
                    + "Price must be numeric.";
        } else if (Double.parseDouble(price) < 0) {
            validPrice = false;
            message = message + System.lineSeparator()
                    + "Price must be zero or greater.";
        }

        //Inventory is required and must be a Integer zero or greater
        if (inStock.length() == 0) {
            message = message + System.lineSeparator()
                    + "Invetory is required.";
        } else if (isInt(inStock) == false) {
            message = message + System.lineSeparator()
                    + "Invetory must be numeric.";
        } else if (Integer.parseInt(inStock) < 0) {
            message = message + System.lineSeparator()
                    + "Invetory must be zero or greater.";
        }

        //Minimum is required and must be a Integer zero or greater
        if (min.length() == 0) {
            validMinMax = false;
            message = message + System.lineSeparator()
                    + "Invetory is required.";
        } else if (isInt(min) == false) {
            validMinMax = false;
            message = message + System.lineSeparator()
                    + "Invetory must be numeric.";
        } else if (Integer.parseInt(min) < 0) {
            validMinMax = false;
            message = message + System.lineSeparator()
                    + "Minimum must be zero or greater.";
        }

        //Maximum is required and must be a Integer zero or greater
        if (max.length() == 0) {
            validMinMax = false;
            message = message + System.lineSeparator()
                    + "Maximum is required.";
        } else if (isInt(max) == false) {
            validMinMax = false;
            message = message + System.lineSeparator()
                    + "Maximum must be numeric.";
        } else if (Integer.parseInt(max) < 0) {
            validMinMax = false;
            message = message + System.lineSeparator()
                    + "Maximum must be zero or greater.";
        }

        //Min must be less than max, only check if min and max are valid
        if (validMinMax == true) {
            if (Integer.parseInt(min) > Integer.parseInt(max)) {
                message = message + System.lineSeparator()
                        + "Minimum must be less than maximum.";
            }
        }

        //Check product cost if price is valid
        if (validPrice == true) {
            for (int x = 0; x < parts.size(); x++) {
                partTotal = partTotal + parts.get(x).getPrice().doubleValue();
            }
            if (partTotal > Double.parseDouble(price)) {
                message = message + System.lineSeparator()
                        + "Product price must be greater than the price of its parts.";
            }
        }

        return message;
    }

}
