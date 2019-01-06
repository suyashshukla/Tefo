package com.ketchuphub.www.digife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends ReferenceActivity {

    GridView menuGrid;
    MenuAdapter menuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuGrid = findViewById(R.id.menu_grid);
        menuAdapter = new MenuAdapter(this,R.layout.item_menu);

        menuAdapter.add(new Menu("Digital Menu",R.drawable.description));
        menuAdapter.add(new Menu("Kitchen",R.drawable.kitchen));
        menuAdapter.add(new Menu("Ambience",R.drawable.menu));
        menuAdapter.add(new Menu("Description",R.drawable.ambience));
        menuAdapter.add(new Menu("Feedback",R.drawable.rate));
        menuAdapter.add(new Menu("Payment",R.drawable.payment));

        menuGrid.setAdapter(menuAdapter);

        menuGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){

                    case 5:
                        startActivity(new Intent(MainActivity.this,Placeholder.class).putExtra("mode","payment"));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this,Placeholder.class).putExtra("mode","rating"));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this,Ambience.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this,Description.class));
                        break;
                    case 0:
                        startActivity(new Intent(MainActivity.this,DigitalMenu.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this,Kitchen.class));
                        break;
                }
            }
        });

    }
}
