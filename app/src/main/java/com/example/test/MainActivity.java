package com.example.test;

import android.os.Bundle;
import android.view.View;
import java.util.Calendar;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Calendar calendar = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm aa");
        String syd24hr = "" + sdf.format(calendar.getTime());
        display(syd24hr);

        TimeZone etTimeZone = TimeZone.getTimeZone("America/New_York");
        sdf.setTimeZone(etTimeZone);
        String NYCTime = "" + sdf.format(calendar.getTime());
        displayNYC(NYCTime);

        TimeZone tokyoTimeZone = TimeZone.getTimeZone("Asia/Tokyo");
        sdf.setTimeZone(tokyoTimeZone);
        String TokyoTime = "" + sdf.format(calendar.getTime());
        displayTokyo(TokyoTime);

        TimeZone londonTimeZone = TimeZone.getTimeZone("Europe/London");
        sdf.setTimeZone(londonTimeZone);
        String londonTime = "" + sdf.format(calendar.getTime());
        displayLondon(londonTime);

        TimeZone parisTimeZone = TimeZone.getTimeZone("Europe/Paris");
        sdf.setTimeZone(parisTimeZone);
        String parisTime = "" + sdf.format(calendar.getTime());
        displayParis(parisTime);
    }

    public void getCurrent24Time(View view) {
        SimpleDateFormat mdformat = new SimpleDateFormat("HH:mm:ss");
        String sydTime = "" + mdformat.format(calendar.getTime());
        display(sydTime);

        TimeZone etTimeZone = TimeZone.getTimeZone("America/New_York");
        mdformat.setTimeZone(etTimeZone);
        String NYCTime = "" + mdformat.format(calendar.getTime());
        displayNYC(NYCTime);

        TimeZone tokyoTimeZone = TimeZone.getTimeZone("Asia/Tokyo");
        mdformat.setTimeZone(tokyoTimeZone);
        String tokyoTime = "" + mdformat.format(calendar.getTime());
        displayTokyo(tokyoTime);

        TimeZone londonTimeZone = TimeZone.getTimeZone("Europe/London");
        mdformat.setTimeZone(londonTimeZone);
        String londonTime = "" + mdformat.format(calendar.getTime());
        displayLondon(londonTime);

        TimeZone parisTimeZone = TimeZone.getTimeZone("Europe/Paris");
        mdformat.setTimeZone(parisTimeZone);
        String parisTime = "" + mdformat.format(calendar.getTime());
        displayParis(parisTime);
    }

    public void getCurrent12Time(View view) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm aa");
        String syd12hr = "" + sdf.format(calendar.getTime());
        display(syd12hr);

        TimeZone etTimeZone = TimeZone.getTimeZone("America/New_York");
        sdf.setTimeZone(etTimeZone);
        String NYCTime = "" + sdf.format(calendar.getTime());
        displayNYC(NYCTime);

        TimeZone tokyoTimeZone = TimeZone.getTimeZone("Asia/Tokyo");
        sdf.setTimeZone(tokyoTimeZone);
        String TokyoTime = "" + sdf.format(calendar.getTime());
        displayTokyo(TokyoTime);

        TimeZone londonTimeZone = TimeZone.getTimeZone("Europe/London");
        sdf.setTimeZone(londonTimeZone);
        String londonTime = "" + sdf.format(calendar.getTime());
        displayLondon(londonTime);

        TimeZone parisTimeZone = TimeZone.getTimeZone("Europe/Paris");
        sdf.setTimeZone(parisTimeZone);
        String parisTime = "" + sdf.format(calendar.getTime());
        displayParis(parisTime);
    }

    public void display(String num) {
        TextView textView = findViewById(R.id.sydTimeView);
        textView.setText(num);
    }

    public void displayNYC(String num) {
        TextView textView = findViewById(R.id.nycTimeView);
        textView.setText(num);
    }

    public void displayTokyo(String num) {
        TextView textView = findViewById(R.id.tokyoTimeView);
        textView.setText(num);
    }

    public void displayLondon(String num) {
        TextView textView = findViewById(R.id.londonTimeView);
        textView.setText(num);

    }
    public void displayParis(String num) {
        TextView textView = findViewById(R.id.parisTimeView);
        textView.setText(num);
    }
}