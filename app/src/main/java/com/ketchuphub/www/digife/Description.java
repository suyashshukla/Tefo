package com.ketchuphub.www.digife;

import android.os.Bundle;
import android.widget.ListView;

public class Description extends ReferenceActivity {

    DescriptionDataAdapter dataAdapter;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        list = findViewById(R.id.description_list);

        dataAdapter = new DescriptionDataAdapter(this,R.layout.item_description);

        dataAdapter.add(new DescriptionData(getResources().getString(R.string.mojito),"MOJITO",R.drawable.a));
        dataAdapter.add(new DescriptionData(getResources().getString(R.string.poha),"POHA",R.drawable.b));
        dataAdapter.add(new DescriptionData(getResources().getString(R.string.dosa),"DOSA",R.drawable.c));
        dataAdapter.add(new DescriptionData(getResources().getString(R.string.biryani),"BIRYANI",R.drawable.d));
        dataAdapter.add(new DescriptionData(getResources().getString(R.string.frappe),"FRAPPE",R.drawable.e));
        dataAdapter.add(new DescriptionData(getResources().getString(R.string.pizza),"PIZZA",R.drawable.f));
        dataAdapter.add(new DescriptionData(getResources().getString(R.string.sandwich),"SANDWICH",R.drawable.g));
        dataAdapter.add(new DescriptionData(getResources().getString(R.string.omlette),"OMLETTE",R.drawable.h));
        dataAdapter.add(new DescriptionData(getResources().getString(R.string.choco),"CHOCO",R.drawable.i));
        dataAdapter.add(new DescriptionData(getResources().getString(R.string.burger),"BURGER",R.drawable.j));


        list.setAdapter(dataAdapter);

    }
}
