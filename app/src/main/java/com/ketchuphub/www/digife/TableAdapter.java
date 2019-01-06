package com.ketchuphub.www.digife;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class TableAdapter extends ArrayAdapter<Table> {

        int resource;
        Context context;

        public TableAdapter(Context context,int resource){
            super(context,resource);
            this.context = context;
            this.resource = resource;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            if(convertView==null)
                convertView = LayoutInflater.from(context).inflate(resource,parent,false);

            Table table = getItem(position);

            TextView textView = convertView.findViewById(R.id.table_no);
            TextView amount = convertView.findViewById(R.id.table_amount);
            TextView name = convertView.findViewById(R.id.table_name);

            textView.setText(table.getTable());
            amount.setText(table.getAmount());
            name.setText(table.getName());

            return convertView;
        }
    }
