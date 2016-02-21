package com.policeestebi.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void showApp(View view) {

        String message = getResources().getString(R.string.display_app_message) + " ";

        switch (view.getId()){
            case R.id.btn_spotifyStreamer:
                message += getResources().getString(R.string.app_spotify_streamer_name).toLowerCase();
                break;
            case R.id.btn_scoresApp:
                message += getResources().getString(R.string.app_scores_name).toLowerCase();
                break;
            case R.id.btn_libraryApp:
                message += getResources().getString(R.string.app_library_name).toLowerCase();
                break;
            case R.id.btn_buildItApp:
                message += getResources().getString(R.string.app_build_it_bigger_name).toLowerCase();
                break;
            case R.id.btn_xyzReaderApp:
                message += getResources().getString(R.string.app_xyz_reader_name).toLowerCase();
                break;
            case R.id.btn_capstoneAppp:
                message += getResources().getString(R.string.app_capstone_my_own_app_name).toLowerCase();
                break;
            default:
                break;
        }

        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

        return super.onOptionsItemSelected(item);
    }
}
