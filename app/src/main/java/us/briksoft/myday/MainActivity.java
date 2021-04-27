package us.briksoft.myday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtEnterName;
    Button buttonInfo, buttonMovie, buttonCity, buttonTraffic, buttonMusic, buttonParks, buttonFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEnterName = (TextView) findViewById(R.id.txtEnterName);
        buttonInfo = (Button) findViewById(R.id.buttonInfo);
        buttonMovie = (Button) findViewById(R.id.buttonMovies);
        buttonCity = (Button) findViewById(R.id.buttonCities);
        buttonTraffic = (Button) findViewById(R.id.buttonTraffic);
        buttonMusic = (Button) findViewById(R.id.buttonMusic);
        buttonParks = (Button) findViewById(R.id.buttonParks);
        buttonFood = (Button) findViewById(R.id.buttonFood);


        Button buttonInfo = (Button) findViewById(R.id.buttonInfo);
        buttonInfo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Add Button Clicked", Toast.LENGTH_SHORT).show();
    }
}