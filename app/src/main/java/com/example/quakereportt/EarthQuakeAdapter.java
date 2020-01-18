package com.example.quakereportt;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthQuakeAdapter extends ArrayAdapter<EarthQuake> {
    private static final String LOG_TAG = EarthQuakeAdapter.class.getSimpleName();

    public EarthQuakeAdapter(Activity context, ArrayList<EarthQuake> quakes) {

        super(context, 0, quakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        final EarthQuake currentQuake = getItem(position);

        TextView magView = (TextView) listItemView.findViewById(R.id.quake_mag);
        magView.setText(currentQuake.getmMag());

        TextView placeViev = (TextView) listItemView.findViewById(R.id.quake_place);
        placeViev.setText(currentQuake.getmPlace());

        TextView dateView = (TextView) listItemView.findViewById(R.id.quake_date);
        dateView.setText(currentQuake.getmDate());
        return listItemView;
    }


}
