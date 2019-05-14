package org.kpsoftwaresolutions.iccwc;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PointsTableActivity extends AppCompatActivity {

    Intent intent;
    DatabaseReference dbr;
    String afgM;
//    String afgM,afgW,afgL,afgTied,afgNRR,afgPts;
//    TextView afgMTxt,afgWTxt,afgLTxt,afgTiedTxt,afgNRRTxt,afgPtsTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points_table);
        dbr = FirebaseDatabase.getInstance().getReference();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
//        initializeAll();
    }
//    public void initializeAll() {
//        afgMTxt = findViewById(R.id.afgM);
//        afgWTxt = findViewById(R.id.afgW);
//        afgLTxt = findViewById(R.id.afgL);
//        afgTiedTxt = findViewById(R.id.afgTied);
//        afgNRRTxt = findViewById(R.id.afgNRR);
//        afgPtsTxt = findViewById(R.id.afgPts);
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater mi = new MenuInflater(getApplicationContext());
        mi.inflate(R.menu.menu_layout_pt,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.refreshItem:
                getAndSetData();
                Toast.makeText(getApplicationContext(),afgM,Toast.LENGTH_SHORT).show();
                break;
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

    public void getAndSetData() {
        dbr.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                afgM = dataSnapshot.child("afg").child("M").getValue(String.class);
//                afgW = dataSnapshot.child("afg").child("W").getValue(String.class);
//                afgL = dataSnapshot.child("afg").child("L").getValue(String.class);
//                afgTied = dataSnapshot.child("afg").child("Tied").getValue(String.class);
//                afgNRR = dataSnapshot.child("afg").child("NRR").getValue(String.class);
//                afgPts = dataSnapshot.child("afg").child("Pts").getValue(String.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
//        setData();
    }
//
//    public void setData() {
//        afgMTxt.setText(afgM);
//        afgWTxt.setText(afgW);
//        afgLTxt.setText(afgL);
//        afgTiedTxt.setText(afgTied);
//        afgNRRTxt.setText(afgNRR);
//        afgPtsTxt.setText(afgPts);
//    }
    public void afgTeam(View v) {
        Intent intent = new Intent(getApplicationContext(),AfgSquadActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Afghanistan",Toast.LENGTH_SHORT).show();
    }
    public void ausTeam(View v) {
        Intent intent = new Intent(getApplicationContext(),AusSquadActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Australia",Toast.LENGTH_SHORT).show();
    }
    public void banTeam(View v) {
        Intent intent = new Intent(getApplicationContext(),BanSquadActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Bangladesh",Toast.LENGTH_SHORT).show();
    }
    public void engTeam(View v) {
        Intent intent = new Intent(getApplicationContext(),EngSquadActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"England",Toast.LENGTH_SHORT).show();
    }
    public void indTeam(View v) {
        Intent intent = new Intent(getApplicationContext(),IndSquadActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"India",Toast.LENGTH_SHORT).show();
    }
    public void nzTeam(View v) {
        Intent intent = new Intent(getApplicationContext(),NzSquadActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"New Zealand",Toast.LENGTH_SHORT).show();
    }
    public void pakTeam(View v) {
        Intent intent = new Intent(getApplicationContext(),PakSquadActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Pakistan",Toast.LENGTH_SHORT).show();
    }
    public void rsaTeam(View v) {
        Intent intent = new Intent(getApplicationContext(),RsaSquadActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"South Africa",Toast.LENGTH_SHORT).show();
    }
    public void slTeam(View v) {
        Intent intent = new Intent(getApplicationContext(),SlSquadActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Sri Lanka",Toast.LENGTH_SHORT).show();
    }
    public void wiTeam(View v) {
        Intent intent = new Intent(getApplicationContext(),WiSquadActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"West Indies",Toast.LENGTH_SHORT).show();
    }
}
