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
public class Fragment_Setup extends Fragment {

    View root;
    Button btnNext;
    TextView txtProcessingInfo, txtProcessingInfo_Details, txtDeviceSetup, txtStatus_details, txtStatus;
    TextView txtSensor, txtSensor_details, txtWifi, txtWifi_details, txtFail, txtFail_details,
            txtEncrytType, txtEncrytType_details, txtPassword, txtPassword_details;
    Typeface bold, regular, black;

    public Fragment_Setup() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_setup, container, false);

        txtProcessingInfo = (TextView) root.findViewById(R.id.txtProcessingInfo);
        txtProcessingInfo_Details = (TextView) root.findViewById(R.id.txtProcessingInfo_Details);
        txtStatus_details = (TextView) root.findViewById(R.id.txtStatus_details);
        txtStatus = (TextView) root.findViewById(R.id.txtStatus);
        txtDeviceSetup = (TextView) root.findViewById(R.id.txtDeviceSetup);
        txtSensor = (TextView) root.findViewById(R.id.txtSensor);
        txtSensor_details = (TextView) root.findViewById(R.id.txtSensor_details);
        txtWifi = (TextView) root.findViewById(R.id.txtWifi);
        txtWifi_details = (TextView) root.findViewById(R.id.txtWifi_details);
        txtEncrytType = (TextView) root.findViewById(R.id.txtEncrytType);
        txtEncrytType_details = (TextView) root.findViewById(R.id.txtEncrytType_details);
        txtPassword = (TextView) root.findViewById(R.id.txtPassword);
        txtPassword_details = (TextView) root.findViewById(R.id.txtPassword_details);
        txtFail = (TextView) root.findViewById(R.id.txtFail);
        txtFail_details = (TextView) root.findViewById(R.id.txtFail_details);

        btnNext = (Button) root.findViewById(R.id.btnNext);

        bold = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Bold.ttf");
        regular = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Regular.ttf");
        black = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Black.ttf");


        txtProcessingInfo.setTypeface(bold);
        txtProcessingInfo_Details.setTypeface(regular);
        txtDeviceSetup.setTypeface(bold);
        txtSensor.setTypeface(regular);
        txtSensor_details.setTypeface(bold);
        txtWifi.setTypeface(regular);
        txtWifi_details.setTypeface(bold);
        txtEncrytType.setTypeface(regular);
        txtEncrytType_details.setTypeface(bold);
        txtPassword.setTypeface(regular);
        txtPassword_details.setTypeface(bold);
        txtStatus.setTypeface(regular);
        txtStatus_details.setTypeface(bold);
        txtFail.setTypeface(bold);
        txtFail_details.setTypeface(regular);
        btnNext.setTypeface(bold);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScrollingActivity.viewPager.setCurrentItem(4);
            }
        });


        return root;
    }
}
