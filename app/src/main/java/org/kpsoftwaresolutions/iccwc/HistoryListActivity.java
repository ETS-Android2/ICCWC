package org.kpsoftwaresolutions.iccwc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.MobileAds;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class HistoryListActivity extends AppCompatActivity {

    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_list);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-5910423341335020~4550602146");
        mAdView = findViewById(R.id.adViewH);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
    public void year2015(View view) {
        Intent intent = new Intent(getApplicationContext(), Year2015Activity.class);
        startActivity(intent);
    }
    public void year2011(View view) {
        Intent intent = new Intent(getApplicationContext(), Year2011Activity.class);
        startActivity(intent);
    }
    public void year2007(View view) {
        Intent intent = new Intent(getApplicationContext(), Year2007Activity.class);
        startActivity(intent);
    }
    public void year2003(View view) {
        Intent intent = new Intent(getApplicationContext(), Year2003Activity.class);
        startActivity(intent);
    }
    public void year1999(View view) {
        Intent intent = new Intent(getApplicationContext(), Year1999Activity.class);
        startActivity(intent);
    }
    public void year1996(View view) {
        Intent intent = new Intent(getApplicationContext(), Year1996Activity.class);
        startActivity(intent);
    }
    public void year1992(View view) {
        Intent intent = new Intent(getApplicationContext(), Year1992Activity.class);
        startActivity(intent);
    }
    public void year1987(View view) {
        Intent intent = new Intent(getApplicationContext(), Year1987Activity.class);
        startActivity(intent);
    }
    public void year1983(View view) {
        Intent intent = new Intent(getApplicationContext(), Year1983Activity.class);
        startActivity(intent);
    }
    public void year1979(View view) {
        Intent intent = new Intent(getApplicationContext(), Year1979Activity.class);
        startActivity(intent);
    }
    public void year1975(View view) {
        Intent intent = new Intent(getApplicationContext(), Year1975Activity.class);
        startActivity(intent);
    }
}
