package com.example.cst2335lab8;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set Toolbar
        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("CST2335 - Lab 8");
        setSupportActionBar(toolbar);

        // Set Navigation Drawer
        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // Add Drawer Toggle
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.nav_home) {
            Toast.makeText(this, "Home selected", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.nav_dadjoke) {
            startActivity(new Intent(this, DadJokeActivity.class));
        } else if (itemId == R.id.nav_exit) {
            finishAffinity();  // Exits the app
        }

        drawerLayout.closeDrawers();  // Close the navigation drawer
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.item1) {
            Toast.makeText(this, "You clicked on item 1", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.item2) {
            Toast.makeText(this, "You clicked on item 2", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
