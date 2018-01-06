package com.example.steven.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;

public class tab_icgt extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_icgt, container, false);

        final TextView tabel_tijd = (TextView) rootView.findViewById(R.id.tabel_tijd);
        final TextView tabel_veld = (TextView) rootView.findViewById(R.id.tabel_veld);
        final TextView tabel_poule = (TextView) rootView.findViewById(R.id.tabel_poule);
        final TextView tabel_wedstrijd1 = (TextView) rootView.findViewById(R.id.tabel_wedstrijd1);
        final TextView tabel_wedstrijd2 = (TextView) rootView.findViewById(R.id.tabel_wedstrijd2);
        final TextView tabel_stand = (TextView) rootView.findViewById(R.id.tabel_stand);
        final TextView tabel_nr = (TextView) rootView.findViewById(R.id.tabel_nr);


        final TextView wed1_tijd = (TextView) rootView.findViewById(R.id.wed1_tijd);
        final TextView wed1_veld = (TextView) rootView.findViewById(R.id.wed1_veld);
        final TextView wed1_poule = (TextView) rootView.findViewById(R.id.wed1_poule);
        final TextView wed1_team1 = (TextView) rootView.findViewById(R.id.wed1_team1);
        final TextView wed1_team2 = (TextView) rootView.findViewById(R.id.wed1_team2);
        final TextView wed1_stand = (TextView) rootView.findViewById(R.id.wed1_stand);
        final TextView wed1_nr = (TextView) rootView.findViewById(R.id.wed1_nr);

        final TextView wed2_tijd = (TextView) rootView.findViewById(R.id.wed2_tijd);
        final TextView wed2_veld = (TextView) rootView.findViewById(R.id.wed2_veld);
        final TextView wed2_poule = (TextView) rootView.findViewById(R.id.wed2_poule);
        final TextView wed2_team1 = (TextView) rootView.findViewById(R.id.wed2_team1);
        final TextView wed2_team2 = (TextView) rootView.findViewById(R.id.wed2_team2);
        final TextView wed2_stand = (TextView) rootView.findViewById(R.id.wed2_stand);
        final TextView wed2_nr = (TextView) rootView.findViewById(R.id.wed2_nr);

        final TextView wed11_tijd = (TextView) rootView.findViewById(R.id.wed11_tijd);
        final TextView wed11_veld = (TextView) rootView.findViewById(R.id.wed11_veld);
        final TextView wed11_poule = (TextView) rootView.findViewById(R.id.wed11_poule);
        final TextView wed11_team1 = (TextView) rootView.findViewById(R.id.wed11_team1);
        final TextView wed11_team2 = (TextView) rootView.findViewById(R.id.wed11_team2);
        final TextView wed11_stand = (TextView) rootView.findViewById(R.id.wed11_stand);

        final TextView wed11_nr = (TextView) rootView.findViewById(R.id.wed11_nr);


        FirebaseDatabase mydatabase;
        //    DatabaseReference myRef;
        DatabaseReference ref_wed1;

        mydatabase = FirebaseDatabase.getInstance();

        ref_wed1 = mydatabase.getReference("wedstrijd1");
        ref_wed1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //String value = dataSnapshot.getValue(String.class);
                Map<String,String> map = (Map<String,String>) dataSnapshot.getValue();
                wed1_tijd.setText(map.get("tijd"));
                wed1_veld.setText(map.get("veld"));
                wed1_poule.setText(map.get("poule"));
                wed1_team1.setText(map.get("team1"));
                wed1_team2.setText(map.get("team2"));
                wed1_stand.setText(map.get("stand"));

                wed1_nr.setText(map.get("wedstrijdnummer"));



//                        System.out.println("tijd: " + tijd);
//                        Log.d("Time is ", tijd);
//                        Log.d("class is  ", tijd.getClass().getName());


                //wed1_tijd.setText(map.get("tijd"));
                //TextView textView =  (TextView) findViewById(R.id.textView);
                //textView.setText(value1);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ref_wed1 = mydatabase.getReference("tabel margin");
        ref_wed1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //String value = dataSnapshot.getValue(String.class);
                Map<String,String> map = (Map<String,String>) dataSnapshot.getValue();
                tabel_tijd.setText(map.get("tijd"));
                tabel_veld.setText(map.get("veld"));
                tabel_poule.setText(map.get("poule"));
                tabel_wedstrijd1.setText(map.get("wedstrijd1"));
                tabel_wedstrijd2.setText(map.get("wedstrijd2"));
                tabel_stand.setText(map.get("stand"));
                tabel_nr.setText(map.get("wedstrijdnummer"));
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });


        ref_wed1 = mydatabase.getReference("wedstrijd2");
        ref_wed1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //String value = dataSnapshot.getValue(String.class);
                Map<String,String> map = (Map<String,String>) dataSnapshot.getValue();
                wed2_tijd.setText(map.get("tijd"));
                wed2_veld.setText(map.get("veld"));
                wed2_poule.setText(map.get("poule"));
                wed2_team1.setText(map.get("team1"));
                wed2_team2.setText(map.get("team2"));
                wed2_stand.setText(map.get("stand"));

                wed2_nr.setText(map.get("wedstrijdnummer"));
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });


        ref_wed1 = mydatabase.getReference("wedstrijd3");
        ref_wed1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //String value = dataSnapshot.getValue(String.class);
                Map<String,String> map = (Map<String,String>) dataSnapshot.getValue();
                wed11_tijd.setText(map.get("tijd"));
                wed11_veld.setText(map.get("veld"));
                wed11_poule.setText(map.get("poule"));
                wed11_team1.setText(map.get("team1"));
                wed11_team2.setText(map.get("team2"));
                wed11_stand.setText(map.get("stand"));
                wed11_nr.setText(map.get("wedstrijdnummer"));
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });


        return rootView;
    }
}