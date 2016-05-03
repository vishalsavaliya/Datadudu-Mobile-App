package com.laxmisoft.datadudu;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by abc on 30-04-2016.
 */
public class Fragment_Confirm extends Fragment {

    View root;
    Button btnConfirmSetup;
    TextView txtDevice, txtSensor, txtSensor_details, txtWifi, txtWifi_details,
            txtEncrytType, txtEncrytType_details, txtPassword, txtPassword_details;
    Typeface bold, regular, black;

    public Fragment_Confirm() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_confirm, container, false);

        txtDevice = (TextView) root.findViewById(R.id.txtDevice);
        txtSensor = (TextView) root.findViewById(R.id.txtSensor);
        txtSensor_details = (TextView) root.findViewById(R.id.txtSensor_details);
        txtWifi = (TextView) root.findViewById(R.id.txtWifi);
        txtWifi_details = (TextView) root.findViewById(R.id.txtWifi_details);
        txtEncrytType = (TextView) root.findViewById(R.id.txtEncrytType);
        txtEncrytType_details = (TextView) root.findViewById(R.id.txtEncrytType_details);
        txtPassword = (TextView) root.findViewById(R.id.txtPassword);
        txtPassword_details = (TextView) root.findViewById(R.id.txtPassword_details);

        btnConfirmSetup = (Button) root.findViewById(R.id.btnConfirmSetup);


        bold = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Bold.ttf");
        regular = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Regular.ttf");
        black = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Black.ttf");

        txtDevice.setTypeface(bold);
        txtSensor.setTypeface(regular);
        txtSensor_details.setTypeface(bold);
        txtWifi.setTypeface(regular);
        txtWifi_details.setTypeface(bold);
        txtEncrytType.setTypeface(regular);
        txtEncrytType_details.setTypeface(bold);
        txtPassword.setTypeface(regular);
        txtPassword_details.setTypeface(bold);
        btnConfirmSetup.setTypeface(regular);

        btnConfirmSetup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScrollingActivity.viewPager.setCurrentItem(3);
            }
        });

        return root;
    }
}
