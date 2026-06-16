package com.example.rolando.testapplication;
/**
 *            |    |    |
 *           )_)  )_)  )_)
 *          )___))___))___)\
 *         )____)____)_____)\\
 *      _____|____|____|____\\\__
 * -------\                   /---------
 *     ^^^^^ ^^^^^^^^^^^^^^^^^^^^^
 *     ^^^^      ^^^^     ^^^    ^^
 *           ^^^^      ^^^
 * Sir Henry Morgan is de Lord of Talamanca
 *
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Mose");
        }else{
            brands.add("Jail Pale Pale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
