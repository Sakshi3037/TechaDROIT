package com.example.admin.techadroit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CrossRoads extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fastnfurious, container, false);
        return rootView;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView descrp = (TextView) getView().findViewById(R.id.description);
        descrp.setText("CrossRoads is a time bound autonomous bot based arena challenge wherein participants are required to complete a given maze in given time. The event will take place in a team of three.");
        TextView date = (TextView) getView().findViewById(R.id.date_event);
        date.setText("Date: 6th March 2016");
        TextView time = (TextView) getView().findViewById(R.id.time_event);
        time.setText("Time: 9:00 AM – 6:00 PM");
        TextView link = (TextView) getView().findViewById(R.id.link);
        link.setClickable(true);
        link.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://drive.google.com/file/d/0Bxn4qAerZYyESFNCblgxdDZYc1E/view?ts=56be092e'> here</a>";
        link.setText(Html.fromHtml(text));
    }
}
