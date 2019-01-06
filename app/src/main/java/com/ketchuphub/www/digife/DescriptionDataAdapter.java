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

public class DescriptionDataAdapter extends ArrayAdapter<DescriptionData> {

    Context context;
    int resource;


    public DescriptionDataAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,  @NonNull ViewGroup parent) {

        if(convertView==null)
            convertView = LayoutInflater.from(context).inflate(R.layout.item_description,parent,false);

        DescriptionData data = getItem(position);

        TextView desc = convertView.findViewById(R.id.description_text);
        TextView name = convertView.findViewById(R.id.description_name);
        ImageView pic = convertView.findViewById(R.id.description_pic);

        desc.setText(data.getDescription());
        name.setText(data.getName());
        pic.setImageResource(data.getPic());



        return convertView;
    }
}
