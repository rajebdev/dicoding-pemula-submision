package com.bablaskoding.wasisjayagorden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvGordens;
    private ArrayList<Gorden> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGordens = findViewById(R.id.rv_gorden);
        rvGordens.setHasFixedSize(true);

        list.addAll(GordenData.getListData());
        showRecyclerList();
    }

    private void  showRecyclerList()
    {
        rvGordens.setLayoutManager(new LinearLayoutManager(this));
        ListGordenAdapter listGordenAdapter = new ListGordenAdapter(list);
        rvGordens.setAdapter(listGordenAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_home:
                break;

            case R.id.action_about:
                Intent aboutActivity = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutActivity);
                break;

        }
    }
}
