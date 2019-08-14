package com.bablaskoding.wasisjayagorden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_TYPE = "extra_type";
    public static final String EXTRA_PRICE = "extra_price";
    public static final String EXTRA_PHOTO = "extra_photo";
    public static final String EXTRA_RATING = "extra_rating";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvDataType = findViewById(R.id.detail_type);
        TextView tvDataPrice = findViewById(R.id.detail_price);
        ImageView imgPhoto = findViewById(R.id.detail_photo);
        TextView tvDataRating = findViewById(R.id.detail_rating);

        String type = getIntent().getStringExtra(EXTRA_TYPE);
        String price = getIntent().getStringExtra(EXTRA_PRICE);
        String photo = getIntent().getStringExtra(EXTRA_PHOTO);
        String rating = getIntent().getStringExtra(EXTRA_RATING);


        setTitle("WJG " + type + " Detail");

        Glide.with(DetailActivity.this)
                .load(photo)
                .apply(new RequestOptions().override(160, 160))
                .into(imgPhoto);

        tvDataType.setText(type);
        tvDataPrice.setText(price);
        tvDataRating.setText(rating);
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
                Intent homeActivity = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(homeActivity);
                break;

            case R.id.action_about:
                Intent aboutActivity = new Intent(DetailActivity.this, AboutActivity.class);
                startActivity(aboutActivity);
                break;

        }
    }
}
