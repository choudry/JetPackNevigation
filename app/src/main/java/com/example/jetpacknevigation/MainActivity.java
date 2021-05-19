package com.example.jetpacknevigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.about:
                Toast.makeText(context,"About",Toast.LENGTH_SHORT).show();
                break;
            case R.id.feedback:
                Toast.makeText(context,"Feedback",Toast.LENGTH_SHORT).show();
                break;
            case R.id.share:
                Toast.makeText(context,"Share",Toast.LENGTH_SHORT).show();
                break;
            case R.id.add:
                Toast.makeText(context,"New",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}