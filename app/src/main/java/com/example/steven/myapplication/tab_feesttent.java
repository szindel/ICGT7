package com.example.steven.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class tab_feesttent extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feesttent, container, false);

        final TextView tab3 = (TextView) view.findViewById(R.id.tab33);
        tab3.setText("JAAAAAAAAAAAAAAAAAAAAGODVERDOMME");
        return view;
    }
}