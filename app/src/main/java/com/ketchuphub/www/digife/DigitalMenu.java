package com.ketchuphub.www.digife;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

public class DigitalMenu extends ReferenceActivity {

    GridView grid;
    DigitalMenuAdapter digitalMenuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_menu);

        grid = findViewById(R.id.digital_menu_grid);

        digitalMenuAdapter = new DigitalMenuAdapter(this,R.layout.item_digital_menu);

        digitalMenuAdapter.add(new DigitalMenuData("BURGER","Rs 49",R.drawable.a));
        digitalMenuAdapter.add(new DigitalMenuData("OMLETTE","Rs 99",R.drawable.b));
        digitalMenuAdapter.add(new DigitalMenuData("PIZZA","Rs 19",R.drawable.c));
        digitalMenuAdapter.add(new DigitalMenuData("SANDWICH","Rs 149",R.drawable.d));
        digitalMenuAdapter.add(new DigitalMenuData("ICE CREAM","Rs 99",R.drawable.e));
        digitalMenuAdapter.add(new DigitalMenuData("DOSA","Rs 79",R.drawable.f));
        digitalMenuAdapter.add(new DigitalMenuData("POHA","Rs 259",R.drawable.g));
        digitalMenuAdapter.add(new DigitalMenuData("FRENCH FRIES","Rs 89",R.drawable.h));
        digitalMenuAdapter.add(new DigitalMenuData("IDLI","Rs 111",R.drawable.i));
        digitalMenuAdapter.add(new DigitalMenuData("BIRYANI","Rs 236",R.drawable.j));
        digitalMenuAdapter.add(new DigitalMenuData("FRAPPE","Rs 85",R.drawable.k));
        digitalMenuAdapter.add(new DigitalMenuData("CHEESE","Rs 50",R.drawable.l));
        digitalMenuAdapter.add(new DigitalMenuData("ROLLS","Rs 96",R.drawable.m));
        digitalMenuAdapter.add(new DigitalMenuData("CURRY","Rs 45",R.drawable.n));
        digitalMenuAdapter.add(new DigitalMenuData("BREADS","Rs 69",R.drawable.o));

        grid.setAdapter(digitalMenuAdapter);


        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ImageView imageView = view.findViewById(R.id.digital_menu_done);
                ImageView imagePic = view.findViewById(R.id.digital_menu_pic);

                if(imageView.getVisibility()==View.INVISIBLE){
                    imagePic.setAlpha(0.5f);
                    imageView.setVisibility(View.VISIBLE);
                }
                else{
                    imagePic.setAlpha(1.0f);
                    imageView.setVisibility(View.INVISIBLE);
                }

            }
        });
    }
}
