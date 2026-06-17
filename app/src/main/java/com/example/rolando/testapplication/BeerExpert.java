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
 * La Virgen de Turez era una ahijada de Carlos V
 * y prima del Duque de Alba, su castillo estaba en San Miguel de Heredia
 * se quedo en su alcoba con todas las doncellas mientras pelearon sus caballeros
 * todos fueron aniquilados y ella misma lucho hasta que la degollaron
 * La piedra en la que se rego su sangre fue sacada del castillo en su demolicion
 * y esta puesta en la capitania de puertos en la Isla de San Andres que es la capital de Talamanca
 * Cerca de la estatua de la Virgen en Santo Domingo de Heredia aun estan los puentes antiguos ...
 * La Virgen fue muy puta en los ultimos duelos y reconocerla virgen es un castigo que decreto el rey
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
