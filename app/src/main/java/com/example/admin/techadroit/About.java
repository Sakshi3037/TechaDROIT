package com.example.admin.techadroit;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.WebView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setIcon(new ColorDrawable(Color.TRANSPARENT));
        getSupportActionBar().setTitle("About Us");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#403c85")));
        WebView view = (WebView) findViewById(R.id.aboutUs);
        String text;
        text = "<html>\n" +
                "<body>\n" +
                "<p align=\"justify\">\n" +
                "<font color = \"#403c85\"><b>About PEC</b></font><br>\n" +
                "PEC University of Technology (formerly Punjab Engineering College (PEC) having \n" +
                "its roots in Lahore as Mugalpura Engineering College since 1921, moved to its \n" +
                "present campus in 1953 as PEC affiliated to Panjab University. The institute \n" +
                "became Deemed University in 2003 through a MHRD notification and rechristened as \n" +
                "PEC University of Technology in 2009. It is a Grant-in-Aid institution under \n" +
                "administration of Union Territory of Chandigarh, Government of India. The \n" +
                "institute has a 146 acres sprawling and pious campus and is house of Chandigarh \n" +
                "College of Architecture also. The academic and administrative processes are \n" +
                "similar to IITs in the country.<br><br>\n" +
                "<font color = \"#403c85\"><b>About IEEE</b></font><br>\n" +
                "The IEEE is the world’s largest professional association advancing innovation \n" +
                "and technological excellence for the benefit of humanity. IEEE and its members \n" +
                "inspire a global community to innovate for a better tomorrow through its \n" +
                "highly-cited publications, conferences, technology standards, and professional \n" +
                "and educational activities. IEEE is the trusted “voice” for engineering, \n" +
                "computing and technology information around the globe. \n" +
                "There are more than 430,000 IEEE members in more than 160 countries. The IEEE \n" +
                "publishes a third of the world's technical literature in electrical \n" +
                "engineering, computer science and electronics and is a leading developer of \n" +
                "international standards that underpin many of today's telecommunications, \n" +
                "information technology and power generation products and services.<br><br>\n" +
                "<font color = \"#403c85\"><b>About IEEE PEC</b></font><br>\n" +
                "IEEE Student Branch was started in PEC in January 2001, under the guidance of \n" +
                "Dr. Gurnam Singh (in charge of IEEE, PEC Student Chapter) and Mr. Sanjeev Sofat, \n" +
                "with Mr. Mohit Aggarwal as its Chairperson. The 2003 batch of the computer \n" +
                "society consisted of 22 enthusiastic members, continuously striving to gain and \n" +
                "share technical knowledge and awareness.\n" +
                "At IEEE-PEC we strive to take the vision of IEEE forward. IEEE-PEC has been the \n" +
                "strongest and the most productive technical society in the college for years. It \n" +
                "has been serving as a knowledge provider, opportunities provider and a practice \n" +
                "platform for Computer Science, Electrical and Electronics engineers. Students \n" +
                "from other trades having overlapping interests are free to join the society. We \n" +
                "hold regular workshops by students as well as experts on various technologies \n" +
                "such as Android, JavaScript, OpenCV, MATLAB, Big Data, VLSI etc. Our students \n" +
                "participate in various inter-college competitions held in various IITs and NITs \n" +
                "and bring laurels for the college. Last year IEEE-PEC organized 5 events at \n" +
                "PECFest'15, the annual technical-cultural fest of our college that \n" +
                "attracted a huge audience with the main attraction being Hackathon-PEC, a 24-\n" +
                "hour long coding extravaganza.\n" +
                "</p>\n" +
                "</body>\n" +
                "</html>";
        view.loadData(text, "text/html; charset=UTF-8", null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        else if (id == android.R.id.home) { // app icon in action bar clicked; goto parent activity.
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
