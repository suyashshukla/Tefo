package com.ketchuphub.www.digife;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class AmbienceAdapter extends PagerAdapter {

    Context context;
    List<Integer> list;
    LayoutInflater inflater;

public AmbienceAdapter(Context context, List<Integer> list){
    this.list = list;
    this.context = context;
    inflater = LayoutInflater.from(context);
}

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

    ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.item_ambience,container,false);

        ImageView imageView = viewGroup.findViewById(R.id.ambience_pic);

        imageView.setImageResource(list.get(position));

        container.addView(viewGroup);

        return viewGroup;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }
}
