package steveleec.com.portfolioapp;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button buttonSpotify;
    Button buttonScores;
    Button buttonLibrary;
    Button buttonBuild;
    Button buttonXyz;
    Button buttonCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final CharSequence introduction = "This button will launch my ";
        final CharSequence spotifyText = introduction + "Spotify Streamer App";
        final CharSequence scoresText = introduction +  "Scores App";
        final CharSequence libraryText = introduction +  "Library App";
        final CharSequence buildText = introduction +  "Build IT Bigger App";
        final CharSequence xyzText = introduction + "XYZ App";
        final CharSequence capstoneText = introduction + "Capstone App";

        Button buttonSpotify;
        Button buttonScores;
        Button buttonLibrary;
        Button buttonBuild;
        Button buttonXyz;
        Button buttonCapstone;

        buttonSpotify = (Button) findViewById(R.id.buttonSpotify);
        buttonScores = (Button) findViewById(R.id.buttonScores);
        buttonLibrary = (Button) findViewById(R.id.buttonLibrary);
        buttonBuild = (Button) findViewById(R.id.buttonBuild);
        buttonXyz = (Button) findViewById(R.id.buttonXyz);
        buttonCapstone = (Button) findViewById(R.id.buttonCapstone);

        buttonSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), spotifyText, Toast.LENGTH_SHORT).show();
            }
        });

        buttonScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, scoresText, Toast.LENGTH_SHORT).show();
            }
        });

        buttonLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), libraryText, Toast.LENGTH_SHORT).show();
            }
        });

        buttonBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), buildText, Toast.LENGTH_SHORT).show();
            }
        });

        buttonXyz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), xyzText, Toast.LENGTH_SHORT).show();
            }
        });

        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), capstoneText, Toast.LENGTH_SHORT).show();
            }
        });

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
