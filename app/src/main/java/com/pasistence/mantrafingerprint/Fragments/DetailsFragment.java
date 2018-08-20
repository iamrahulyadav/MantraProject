package com.pasistence.mantrafingerprint.Fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.pasistence.mantrafingerprint.Main.WorkerRegistrationActivity;
import com.pasistence.mantrafingerprint.Models.WorkerModel;
import com.pasistence.mantrafingerprint.R;


import java.util.ArrayList;
import java.util.zip.Inflater;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    CircleImageView circleImageView;
    ImageView imgPersonal,imgAddress,imgBank;
    TextView txtPersonalName,
            txtPersonalMobileNum,
            txtAdharNumber,
            txtGender,txtPermamanentAddress,
            txtCurrentAddress,txtCity,txtPincode,txtBankName,
            txtHolderName,txtAccoountNumber,txtIfscCode;
            Context mcomtext;
           WorkerModel workerModel;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DetailsFragment() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public DetailsFragment(WorkerModel workerModel) {
        this.workerModel= workerModel;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view= inflater.inflate(R.layout.fragment_details, container, false);
        mInit(view);
        mSetDetails();
        return view;
    }
    private void mInit(View view) {
        circleImageView = (CircleImageView)view.findViewById(R.id.circular_imgView);
        txtPersonalName = view.findViewById(R.id.txt_Name);
        txtPersonalMobileNum = view.findViewById(R.id.txt_mobileNum);
        txtAdharNumber = view.findViewById(R.id.txt_aadharNum);
        txtGender = view.findViewById(R.id.txt_gender);

        txtPermamanentAddress = view.findViewById(R.id.txt_PermanentAddress);
        txtCurrentAddress = view.findViewById(R.id.txt_CurrentAddress);
        txtCity = view.findViewById(R.id.txt_city);
        txtPincode = view.findViewById(R.id.txt_pincode);

        txtBankName = view.findViewById(R.id.txt_bankName);
        txtHolderName = view.findViewById(R.id.txt_BankHolderName);
        txtAccoountNumber = view.findViewById(R.id.txt_AccountNum);
        txtIfscCode = view.findViewById(R.id.txt_ifsc);

        imgPersonal = view.findViewById(R.id.edt_personal_details);
        imgAddress = view.findViewById(R.id.edt_address_details);
        imgBank =view.findViewById(R.id.edt_bank_details);


        imgPersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Personal Details", Toast.LENGTH_SHORT).show();

            }
        });
    }


    private void mSetDetails() {
        //circleImageView.setImageResource(workerModel.getImageUrl());
        txtPersonalName.setText(workerModel.getName());
        txtPersonalMobileNum.setText(workerModel.getContact1());
        txtAdharNumber.setText(workerModel.adharcardId);
        txtGender.setText(workerModel.getGender());

        txtPermamanentAddress.setText(workerModel.getPermanent_address());
        txtCurrentAddress.setText(workerModel.getCurrent_address());
        txtCity.setText(workerModel.getCity());
        txtPincode.setText(workerModel.getPincode());

        txtBankName.setText(workerModel.getBank_name());
        txtHolderName.setText(workerModel.getHolder_name());
        txtAccoountNumber.setText(workerModel.getAccount_number());
        txtIfscCode.setText(workerModel.getIfsc_code());


        Glide.with(getActivity())
                .load(workerModel.getImageUrl().toString())
                .into(circleImageView);
    }


}