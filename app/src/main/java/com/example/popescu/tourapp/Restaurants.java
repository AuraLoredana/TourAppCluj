package com.example.popescu.tourapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Restaurants extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);


        context=this;
        String[] items={"1","2","3"};
        final String[] web = {
                "Camino Restaurant",
                "Roata Restaurant",
                "Baracca Restaurant"
        } ;
        ListView lstview=(ListView)findViewById(R.id.listvr);
        lstview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(context, "Restaurants in Cluj-Napoca", Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(Restaurants.this, Camino.class);
                //Get the value of the item you clicked
                String itemClicked = web[0];
                intent1.putExtra("web", itemClicked);
                startActivity(intent1);

                Intent intent2 = new Intent(Restaurants.this, Roata.class);
                //Get the value of the item you clicked
                String itemClicked2 = web[2];
                intent2.putExtra("web", itemClicked2);
                startActivity(intent2);


                Intent intent3 = new Intent(Restaurants.this, Baracca.class);
                //Get the value of the item you clicked
                String itemClicked3 = web[3];
                intent3.putExtra("web", itemClicked3);
                startActivity(intent3);


            }
        });
        Integer[] imageId = {
                R.drawable.camino, R.drawable.roatarestaurant, R.drawable.baraccacluj

        };
        LstViewAdapter adapter = new LstViewAdapter(this, R.layout.list_item, R.id.txt, items, imageId, web);
        // Bind data to the ListView
        lstview.setAdapter(adapter);


    }

    public void clickMe(View view){
        Button bt=(Button)view;
        Toast.makeText(this, "Top Attractions"+bt.getText().toString(),Toast.LENGTH_LONG).show();
    }

}

