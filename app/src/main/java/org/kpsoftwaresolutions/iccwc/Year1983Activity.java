package org.kpsoftwaresolutions.iccwc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.MobileAds;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Year1983Activity extends AppCompatActivity {

    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_1975);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-5910423341335020~4550602146");
        mAdView = findViewById(R.id.adView83);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}
