package com.bablaskoding.wasisjayagorden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setTitle("About Me");

        Glide.with(this)
                .load("https://lh3.googleusercontent.com/a-/AAuE7mANz1oc7OZRWaOj7VezRjW79QVID5kITn7L5ivA=s120-p-no")
                .apply(new RequestOptions().override(160, 160))
                .into((ImageView) findViewById(R.id.profile_photo));

//        https://lh3.googleusercontent.com/a-/AAuE7mANz1oc7OZRWaOj7VezRjW79QVID5kITn7L5ivA=s120-p-no
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
                Intent homeActivity = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(homeActivity);
                break;

            case R.id.action_about:
                break;

        }
    }
}
