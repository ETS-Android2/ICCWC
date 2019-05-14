package org.kpsoftwaresolutions.iccwc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.MobileAds;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class FixturesActivity extends AppCompatActivity {

    AdView mAdView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixtures);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-5910423341335020~4550602146");
        mAdView = findViewById(R.id.adViewF);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void matches(View view) {
        intent = new Intent(getApplicationContext(),MatchListActivity.class);
        startActivity(intent);
    }
    public void wumatches(View view) {
        intent = new Intent(getApplicationContext(),WUMatchListActivity.class);
        startActivity(intent);
    }
}
