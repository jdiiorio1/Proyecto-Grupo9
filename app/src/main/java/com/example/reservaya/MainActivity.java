package com.example.reservaya;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.reservaya.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingresar = findViewById(R.id.bt_ingresar);
        ingresar.setOnClickListener(ingresarListener);

    }
    public View.OnClickListener ingresarListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this,"estoy intentando que funcione", Toast.LENGTH_LONG).show();

           // Intent intent = new Intent(MainActivity.this, Bienvenida.class);
            Intent intentIngresar = new Intent(MainActivity.this, Bienvenida.class);
            startActivity(intentIngresar);
            //MainActivity.this.finish();
        }
    };

}