package co.edu.udea.compumovil.gr01_20181.labscm20181.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import co.edu.udea.compumovil.gr01_20181.labscm20181.R;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void deployActivity(View view){
        Intent intent = new Intent(this, Menu.class);

        startActivity(intent);
    }
}
