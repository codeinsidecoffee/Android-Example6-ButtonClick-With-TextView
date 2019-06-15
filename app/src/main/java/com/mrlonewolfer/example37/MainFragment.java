package com.mrlonewolfer.example37;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements View.OnClickListener {

    Context context;
    EditText edtName;
    Button btnSumbit;
    String myName="\n";
    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context=getActivity();
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_main, container, false);
        edtName=view.findViewById(R.id.edtName);
        btnSumbit=view.findViewById(R.id.btnSubmit);
        btnSumbit.setOnClickListener(this);

        return  view;
    }

    @Override
    public void onClick(View v) {
        myName=edtName.getText().toString();
        FragmentManager fragmentManager=getFragmentManager();
        ResultFragment resultFragment= (ResultFragment) fragmentManager.findFragmentById(R.id.fragmentResult);
        resultFragment.setMessage(myName);
        edtName.setText("");
    }
}
