package com.example.admin.techadroit;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class FastnFurious extends Fragment {
    Activity act;
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.act = activity;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fastnfurious, container, false);
        return mView;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView link = (TextView) getView().findViewById(R.id.link);
        link.setClickable(true);
        link.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://drive.google.com/file/d/0Bxn4qAerZYyEMkp2RW5NMEZlQXM/view?usp=sharing'> here</a>";
        link.setText(Html.fromHtml(text));
    }
}
