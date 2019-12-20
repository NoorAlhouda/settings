package com.example.settingsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class editProfileActivity extends AppCompatActivity {
    TextView mSettText;
    ImageView mSettImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        mSettText = findViewById(R.id.settings_text);
        mSettImage = findViewById(R.id.settings_image);

//        Intent intent = getIntent();
//        mSettText.setText(intent.getStringExtra("itemName"));
//        mSettImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });
    }
}
