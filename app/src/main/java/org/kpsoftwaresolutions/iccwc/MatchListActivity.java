package org.kpsoftwaresolutions.iccwc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MatchListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_list);
    }
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
    public void engTeam(View view) {
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
