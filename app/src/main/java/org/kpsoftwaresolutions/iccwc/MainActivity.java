package org.kpsoftwaresolutions.iccwc;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.MobileAds;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    AdView mAdView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater mi = new MenuInflater(getApplicationContext());
        mi.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alb = new AlertDialog.Builder(MainActivity.this);
        alb.setTitle("Exit");
        alb.setIcon(R.drawable.question);
        alb.setMessage("Are you sure?");
        alb.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                Toast.makeText(getApplicationContext(),"Application Closed",Toast.LENGTH_SHORT).show();
            }
        });
        alb.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ald = alb.create();
        ald.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.aboutUsItem:
                intent = new Intent(getApplicationContext(),CompanyActivity.class);
                startActivity(intent);
                break;
            case R.id.privacyPolicyItem:
                intent = new Intent(getApplicationContext(),PrivacyPolicyActivity.class);
                startActivity(intent);
                break;
            case R.id.exitItem:
                onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void history(View view) {
        intent = new Intent(getApplicationContext(),HistoryListActivity.class);
        startActivity(intent);
    }
    public void team(View view) {
        intent = new Intent(getApplicationContext(),TeamListActivity.class);
        startActivity(intent);
    }
    public void fixture(View view) {
        intent = new Intent(getApplicationContext(),FixturesActivity.class);
        startActivity(intent);
    }
    public void pointsTable(View view) {
        intent = new Intent(getApplicationContext(),PointsTableActivity.class);
        startActivity(intent);
    }
}
