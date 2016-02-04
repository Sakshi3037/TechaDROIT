package com.example.admin.techadroit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by admin on 2/2/2016.
 */
public class DesignMania extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.crossroads, container, false);
        return rootView;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView descrp = (TextView) getView().findViewById(R.id.descrp);
        descrp.setText("Design Mania will be an innovative implementation based designing challenge for building a web solution for a given theme. The event will take place in a team of two.");
        TextView date = (TextView) getView().findViewById(R.id.date);
        date.setText("Date: 6th March 2016");
        TextView time = (TextView) getView().findViewById(R.id.time);
        time.setText("Time: 9:00 AM – 1:00 PM");
    }
}
