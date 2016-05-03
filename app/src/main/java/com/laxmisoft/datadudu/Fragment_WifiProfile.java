package com.laxmisoft.datadudu;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by abc on 30-04-2016.
 */
public class Fragment_WifiProfile extends Fragment {

    View root;
    LinearLayout llAddProfile;
    Button btnNext;
    TextView txtAddProfile, txtChoosewifi;
    Typeface bold, regular, black;

    public Fragment_WifiProfile() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_wifiprofile, container, false);

        llAddProfile = (LinearLayout) root.findViewById(R.id.llAddProfile);

        txtAddProfile = (TextView) root.findViewById(R.id.txtAddProfile);
        txtChoosewifi = (TextView) root.findViewById(R.id.txtChoosewifi);
        btnNext = (Button) root.findViewById(R.id.btnNext);

        bold = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Bold.ttf");
        regular = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Regular.ttf");
        black = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Black.ttf");

        txtAddProfile.setTypeface(regular);
        txtChoosewifi.setTypeface(regular);
        btnNext.setTypeface(bold);

        llAddProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddProfileActivity.class);
                startActivity(intent);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScrollingActivity.viewPager.setCurrentItem(2);
            }
        });
        return root;
    }

}
