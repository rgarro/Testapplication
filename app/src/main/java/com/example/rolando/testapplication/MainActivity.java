package com.example.rolando.testapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Spinner;
import android.view.View;
import android.widget.TextView;

import java.util.List;

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
 * Love , Gold and Adventure
 * The Night is fair the wind is down
 * The english dog still barks !!!
 * Morgan is a yellow dog
 * God Save the King!
 *
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class MainActivity extends Activity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view){
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());
        brands.setText(beerType);
        //get extra recommendations
        List<String> brandsList = expert.getBrands(beerType);
    }
}
