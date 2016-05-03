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
public class Fragment_Finish extends Fragment {

    View root;
    Button btnConfirm;
    TextView txtInformation, txtInformation_details, txtInstruction, txtInstruction_Details;
    Typeface bold, regular, black;

    public Fragment_Finish() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_finish, container, false);

        txtInformation = (TextView) root.findViewById(R.id.txtInformation);
        txtInformation_details = (TextView) root.findViewById(R.id.txtInformation_details);
        txtInstruction = (TextView) root.findViewById(R.id.txtInstruction);
        txtInstruction_Details = (TextView) root.findViewById(R.id.txtInstruction_Details);

        btnConfirm = (Button) root.findViewById(R.id.btnConfirm);

        bold = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Bold.ttf");
        regular = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Regular.ttf");
        black = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Black.ttf");

        txtInformation.setTypeface(bold);
        txtInformation_details.setTypeface(regular);
        txtInstruction.setTypeface(bold);
        txtInstruction_Details.setTypeface(regular);
        btnConfirm.setTypeface(bold);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScrollingActivity.viewPager.setCurrentItem(5);
            }
        });


        return root;
    }
}
