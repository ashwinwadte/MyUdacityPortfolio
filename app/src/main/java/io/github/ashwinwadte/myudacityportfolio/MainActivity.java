package io.github.ashwinwadte.myudacityportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bSpotifyStreamer, bScoresApp, bLibraryApp, bBuildItBigger, bXYZReader, bCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initWidgets();
    }

    private void initWidgets() {
        bSpotifyStreamer = (Button) findViewById(R.id.bSpotifyStreamer);
        bScoresApp = (Button) findViewById(R.id.bScoresApp);
        bLibraryApp = (Button) findViewById(R.id.bLibrary);
        bBuildItBigger = (Button) findViewById(R.id.bBuildItBigger);
        bXYZReader = (Button) findViewById(R.id.bXYZReader);
        bCapstone = (Button) findViewById(R.id.bCapstone);

        bSpotifyStreamer.setOnClickListener(this);
        bScoresApp.setOnClickListener(this);
        bLibraryApp.setOnClickListener(this);
        bBuildItBigger.setOnClickListener(this);
        bXYZReader.setOnClickListener(this);
        bCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        String buttonText = ((Button) v).getText().toString();
        Toast.makeText(getApplicationContext(), "This button launches the " + buttonText, Toast.LENGTH_SHORT).show();

       /* switch (id) {
            case R.id.bSpotifyStreamer:
                Toast.makeText(getApplicationContext(), "This button will launch my Media Streamer app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bScoresApp:
                Toast.makeText(getApplicationContext(), "This button will launch my Scores app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bLibrary:
                Toast.makeText(getApplicationContext(), "This button will launch my Library app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bBuildItBigger:
                Toast.makeText(getApplicationContext(), "This button will launch my Gradle Project app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bXYZReader:
                Toast.makeText(getApplicationContext(), "This button will launch my XYZ Reader app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bCapstone:
                Toast.makeText(getApplicationContext(), "This button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
                break;
        }*/
    }
}
