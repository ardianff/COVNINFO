package id.husni.covninfo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import id.husni.covninfo.R;

public class InfoActivity extends AppCompatActivity {
    //TODO : [FEATURE] GEJALA, PENCEGAHAN, RUMAH SAKIT
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.info);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
