package com.example.settingsapplication;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LnguageFragment extends Fragment {
    View view;
    TextView mSettText;
    ImageView mSettImage;
    public LnguageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_lnguage, container, false);
        initViews();
        return view;

    }
    private void initViews() {

        mSettText =view.findViewById(R.id.settings_text);
       mSettImage = view.findViewById(R.id.settings_image);
////
//        Intent intent = getIntent();
//        mSettText.setText(intent.getStringExtra("itemName"));
//        mSettImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               finish();
            }
//        });
//    }

}
