package com.hardik.sidenavigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.navigationview);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.item_home){
                    Toast.makeText(MainActivity.this, "Home Clicked", Toast.LENGTH_SHORT).show();
                    drawerLayout.close();
                    return true;
                }
                if (menuItem.getItemId() == R.id.item_dashboard){
                    Toast.makeText(MainActivity.this, "Dashboard Clicked", Toast.LENGTH_SHORT).show();
                    drawerLayout.close();
                    return true;
                }
                if (menuItem.getItemId() == R.id.item_share){
                    Toast.makeText(MainActivity.this, "Share Clicked", Toast.LENGTH_SHORT).show();
                    drawerLayout.close();
                    return true;
                }
                return false;
            }
        });
    }

}