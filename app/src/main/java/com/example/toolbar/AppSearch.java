package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class AppSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Button button = (Button) findViewById(R.id.button);

       button.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.edittext);
                String search = text.getText().toString().toLowerCase();
                if(("god of war").contains(search)){
                    Intent i = new Intent(AppSearch.this, Game0.class);
                    startActivity(i);
                }else if(("call of duty").contains(search)){
                    Intent i = new Intent(AppSearch.this, Game1.class);
                    startActivity(i);
                }else if(("ghost of tsushima").contains(search)){
                     Intent i = new Intent(AppSearch.this, Game2.class);
                    startActivity(i);
                }else if(("bloodborne").contains(search)){
                    Intent i = new Intent(AppSearch.this, Game3.class);
                    startActivity(i);
                }else {
                    Intent i = new Intent(AppSearch.this, NotFound.class);
                    startActivity(i);
                }

            }
        });
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_perfil:
                Intent i = new Intent(AppSearch.this, Perfil.class);
                startActivity(i);
                return true;
            case R.id.action_buscar:
            case R.id.action_search:
                i = new Intent(AppSearch.this, AppSearch.class);
                startActivity(i);
                return true;
            case R.id.action_next:
                i = new Intent(AppSearch.this, CardView.class);
                startActivity(i);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}