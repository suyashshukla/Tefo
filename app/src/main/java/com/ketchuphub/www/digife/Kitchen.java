package com.ketchuphub.www.digife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class Kitchen extends ReferenceActivity {

    ListView list;
    TableAdapter tableAdapter;

    public static Table table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);

        View view = getLayoutInflater().inflate(R.layout.item_order,null);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        final AlertDialog dialog = builder.setView(view).create();

        dialog.show();

        Button button = view.findViewById(R.id.alert_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });



        list = findViewById(R.id.kitchen_list);

        tableAdapter = new TableAdapter(this,R.layout.item_kitchen);

        tableAdapter.add(new Table("Table No. 15","Mr. Suyash Shukla","Rs. 156"));
        tableAdapter.add(new Table("Table No. 3","Mr. Srinjoy Dutta","Rs. 852"));
        tableAdapter.add(new Table("Table No. 1","Mr. Nikhil Pathak","Rs. 1025"));
        tableAdapter.add(new Table("Table No. 7","Master Abhyudoy Karan","Rs. 693"));
        tableAdapter.add(new Table("Table No. 5","Mr. Nobisuke Hamata","Rs. 26"));
        tableAdapter.add(new Table("Table No. 9","Ms. Depaanjali","Rs. 896"));
        tableAdapter.add(new Table("Table No. 11","Mr. Abhishek Jain","Rs. 362"));
        tableAdapter.add(new Table("Table No. 2","Mr. Arjit Shrivastava","Rs. 785"));
        tableAdapter.add(new Table("Table No. 10","Gwalior Food Explorer","Rs. 96"));
        tableAdapter.add(new Table("Table No. 12","Tulika Pencils","Rs. 500"));

        list.setAdapter(tableAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                table = tableAdapter.getItem(position);
                startActivity(new Intent(Kitchen.this,OrderDetails.class));
            }
        });



    }
}
