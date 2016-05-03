package com.laxmisoft.datadudu;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by abc on 30-04-2016.
 */
public class Fragment_Mount extends Fragment {

    View root;
    Button btnAddDevice, btnDeviceman;
    TextView txtInstruction, txtInstruction_Details, txtInfo;
    Typeface bold, regular, black;

    public Fragment_Mount() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_mount, container, false);

        txtInstruction = (TextView) root.findViewById(R.id.txtInstruction);
        txtInstruction_Details = (TextView) root.findViewById(R.id.txtInstruction_Details);
        txtInfo = (TextView) root.findViewById(R.id.txtInfo);

        btnAddDevice = (Button) root.findViewById(R.id.btnAddDevice);
        btnDeviceman = (Button) root.findViewById(R.id.btnDeviceman);

        bold = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Bold.ttf");
        regular = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Regular.ttf");
        black = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Black.ttf");

        txtInstruction_Details.setTypeface(regular);
        btnAddDevice.setTypeface(regular);
        btnDeviceman.setTypeface(regular);
        txtInfo.setTypeface(bold);
        txtInstruction.setTypeface(bold);

        btnAddDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ScrollingActivity.viewPager.setCurrentItem(1);
            }
        });
        return root;
    }
}