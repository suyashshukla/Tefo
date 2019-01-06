package com.ketchuphub.www.digife;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class OrderDetails extends ReferenceActivity {

    ListView list;
    OrderAdapter orderAdapter;
    TextView table;
    TextView amount;
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        Table reference = Kitchen.table;

        table = findViewById(R.id.details_table_no);
        amount = findViewById(R.id.details_table_amount);
        name = findViewById(R.id.details_table_name);
        list = findViewById(R.id.details_list);

        table.setText(reference.getTable());
        amount.setText(reference.getAmount());
        name.setText(reference.getName());

        orderAdapter = new OrderAdapter(this,R.layout.item_order_details);

        orderAdapter.add(new Order("Momos","Rs. 50"));
        orderAdapter.add(new Order("Dosa","Rs. 80"));
        orderAdapter.add(new Order("Ice Cream","Rs. 20"));
        orderAdapter.add(new Order("Curry","Rs. 130"));
        orderAdapter.add(new Order("Bread","Rs. 40"));

        list.setAdapter(orderAdapter);



    }
}
