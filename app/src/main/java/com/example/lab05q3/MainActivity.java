package com.example.lab05q3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton emailBtn = findViewById(R.id.emailBtn);
        registerForContextMenu(emailBtn);
        registerForContextMenu(findViewById(R.id.msgBtn));
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()){
            case R.id.emailBtn:
                getMenuInflater().inflate(R.menu.email_menu, menu);
                break;
            case R.id.msgBtn:
                getMenuInflater().inflate(R.menu.img_menu, menu);
                break;
        }

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {


            case R.id.menuAbout:
                openDialog();
                break;
        }
        return true;
    }

    public void openDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("This is an Options Menu");
        builder.setTitle("About");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        }).show();
    }

    @Override
    public boolean onLongClick(View v) {
        switch (v.getId()){
            case R.id.emailBtn:

                break;
        }
        return false;
    }
}