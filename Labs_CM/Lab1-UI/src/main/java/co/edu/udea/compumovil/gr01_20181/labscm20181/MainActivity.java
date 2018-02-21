package co.edu.udea.compumovil.gr01_20181.labscm20181;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button Request;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign inputs to variables
       /* Request = findViewById(R.id.Request);*/

        //Call method onclick
        /*Request.setOnClickListener(this);*/


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            /*case R.id.Request:
                Intent intent = new Intent(this, Menu.class);
                startActivity(intent);
                break;*/
        }

    }
}
