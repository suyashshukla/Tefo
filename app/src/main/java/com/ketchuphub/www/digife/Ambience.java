package com.ketchuphub.www.digife;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class Ambience extends ReferenceActivity {

    ViewPager viewPager;
    AmbienceAdapter ambienceAdapter;
    List<Integer> ambience;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambience);

        ambience = new ArrayList<>();

        ambience.add(R.drawable.one);
        ambience.add(R.drawable.two);
        ambience.add(R.drawable.three);
        ambience.add(R.drawable.four);
        ambience.add(R.drawable.five);
        ambience.add(R.drawable.six);
        ambience.add(R.drawable.seven);

        viewPager = findViewById(R.id.ambience_view_pager);
        ambienceAdapter = new AmbienceAdapter(this,ambience);

        viewPager.setAdapter(ambienceAdapter);

    }
}
