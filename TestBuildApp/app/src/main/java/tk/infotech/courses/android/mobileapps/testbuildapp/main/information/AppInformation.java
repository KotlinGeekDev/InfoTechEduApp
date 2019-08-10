package tk.infotech.courses.android.mobileapps.testbuildapp.main.information;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import tk.infotech.courses.android.mobileapps.testbuildapp.R;

public class AppInformation extends AppCompatActivity {

    private TextView appInfoDescription, webpageInfoDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_information);

        getSupportActionBar();

        appInfoDescription = findViewById(R.id.developer_info);
        webpageInfoDescription = findViewById(R.id.company_webpage_info);

    }
}
