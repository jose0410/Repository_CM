package co.edu.udea.compumovil.gr01_20181.labscm20181.views;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;
import com.github.clans.fab.FloatingActionButton;

import java.util.Timer;
import java.util.TimerTask;

import co.edu.udea.compumovil.gr01_20181.labscm20181.R;
import co.edu.udea.compumovil.gr01_20181.labscm20181.SplashActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private FloatingActionMenu materialDesignFAM;
    private FloatingActionButton fabDish, fabDrink;
    long Delay = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materialDesignFAM = findViewById(R.id.request);
        fabDish = findViewById(R.id.addDish);
        fabDrink = findViewById(R.id.addDrink);

        fabDish.setOnClickListener(this);
        fabDrink.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent;
        switch(view.getId()){
            case R.id.addDish:
                intent = new Intent(this,Dish.class);
                startActivity(intent);
                break;
            case R.id.addDrink:
                intent = new Intent(this,Drink.class);
                startActivity(intent);
                break;

        }

    }


    public void deployActivity(View view){
        Intent intent = new Intent(this, Menu.class);

        startActivity(intent);

    }
}
