package tk.infotech.courses.android.mobileapps.testbuildapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class LaunchingActivity extends AppCompatActivity {

    private ImageView logo;
    private static int timeout = 4500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launching);

        logo = findViewById(R.id.imageView);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LaunchingActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, timeout);
    }
}
