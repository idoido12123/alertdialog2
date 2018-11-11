package com.example.idoid.alertdialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder bul;
    Random rnd = new Random();
    int r, g, b;
    LinearLayout Li;
    Intent t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Li = (LinearLayout) findViewById(R.id.linear);


    }

    public void onclick1(View view) {
        bul = new AlertDialog.Builder(this);
        bul.setTitle("hello Albert");
        bul.setMessage("how are you?");
        AlertDialog ar = bul.create();
        ar.show();

    }

    public void onclick2(View view) {
        bul = new AlertDialog.Builder(this);
        bul.setTitle("hello Albert");
        bul.setMessage("how are you?");
        bul.setIcon(R.drawable.ic_launcher_background);
        AlertDialog ar = bul.create();
        ar.show();

    }

    public void onclick3(View view) {
        bul = new AlertDialog.Builder(this);
        bul.setTitle("hello Albert");
        bul.setMessage("how are you?");
        bul.setIcon(R.drawable.ic_launcher_background);
        bul.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog ar = bul.create();
        ar.show();
    }

    public void onclick4(View view) {
        bul = new AlertDialog.Builder(this);
        bul.setTitle("hello Albert");
        bul.setMessage("how are you?");
        bul.setIcon(R.drawable.ic_launcher_background);
        bul.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        bul.setPositiveButton("change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                r = rnd.nextInt() * 256;
                g = rnd.nextInt() * 256;
                b = rnd.nextInt() * 256;
                Li.setBackgroundColor(Color.rgb(r, g, b));
            }
        });
        AlertDialog ar = bul.create();
        ar.show();

    }

    public void onclick5(View view) {
        bul = new AlertDialog.Builder(this);
        bul.setTitle("hello Albert");
        bul.setMessage("how are you?");
        bul.setIcon(R.drawable.ic_launcher_background);
        bul.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        bul.setPositiveButton("change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                r = rnd.nextInt() * 256;
                g = rnd.nextInt() * 256;
                b = rnd.nextInt() * 256;
                Li.setBackgroundColor(Color.rgb(r, g, b));
            }
        });
        bul.setNeutralButton("reset", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Li.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ar = bul.create();
        ar.show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String st = item.getTitle().toString();
        if (st.equals("credits")) {
           t=new Intent(this,Main2Activity.class);
           startActivity(t);
        }
        return super.onOptionsItemSelected(item);
    }
}
