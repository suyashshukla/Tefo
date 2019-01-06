package com.ketchuphub.www.digife;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DigitalMenuAdapter extends ArrayAdapter<DigitalMenuData> {

    Context context;
    int resource;

    public DigitalMenuAdapter( @NonNull Context context, int resource) {
        super(context, resource);

        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position,  @Nullable View convertView,@NonNull ViewGroup parent) {

        if(convertView==null)
            convertView = LayoutInflater.from(context).inflate(resource,parent,false);

        DigitalMenuData data = getItem(position);

        TextView name = convertView.findViewById(R.id.digital_menu_name);
        TextView amount = convertView.findViewById(R.id.digital_menu_price);
        ImageView pic = convertView.findViewById(R.id.digital_menu_pic);

        name.setText(data.getName());
        amount.setText(data.getAmount());
        pic.setImageResource(data.getResource());

        return convertView;
    }
}
