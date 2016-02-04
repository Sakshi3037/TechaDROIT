package com.example.admin.techadroit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Codewars extends Fragment {
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
        descrp.setText("Codewars is an ultimate programming challenge with various levels of problems on the famous online competitive programming platform- Hackerearth. We intend to collaborate with hackerearth.com to provide a certification to the winners. The event will take place in a team of two.");
        TextView date = (TextView) getView().findViewById(R.id.date);
        date.setText("Date: 5th March 2016");
        TextView time = (TextView) getView().findViewById(R.id.time);
        time.setText("Time: Round 1: 9:00 AM -1:00 PM\n" +
                "Round 2: 2:00 PM – 5:00 PM");
    }
}
