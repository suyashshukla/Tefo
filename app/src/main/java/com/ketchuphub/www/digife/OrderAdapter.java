package com.ketchuphub.www.digife;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class OrderAdapter extends ArrayAdapter<Order> {

    Context context;
    int resource;

    public OrderAdapter(Context context,int resource){

        super(context,resource);

        this.context = context;
        this.resource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView==null)
            convertView = LayoutInflater.from(context).inflate(resource,parent,false);

        Order order = getItem(position);


        TextView textView = convertView.findViewById(R.id.order_details_name);
        TextView amount = convertView.findViewById(R.id.order_details_amount);

        textView.setText(order.getName());
        amount.setText(order.getAmount());


        return convertView;
    }
}
