package com.ketchuphub.www.digife;

import android.os.Bundle;

public class Placeholder extends ReferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String mode = getIntent().getStringExtra("mode");

        if(mode.equals("rating"))
            setContentView(R.layout.rating_page);
        else if(mode.equals("payment"))
            setContentView(R.layout.payment_page);
    }
}
