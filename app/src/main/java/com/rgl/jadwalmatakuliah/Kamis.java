package com.rgl.jadwalmatakuliah;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;


/**
 * A simple {@link Fragment} subclass.
 */
public class Kamis extends Fragment {


    public Kamis() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kamis, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getActivity().setTitle("Kamis");

        ListView listView = (ListView) getActivity().findViewById(R.id.listkamis);
        SimpleArrayAdapter adapter;

        ArrayList<String> arrayList = new ArrayList<>();
        String[] jkamis = new String[]{
                "8-10 AM   = Prak. Multimedia",
                "10-12 AM = PAM",
                "1-5 PM     = Prak. PAW"
        };

        Collections.addAll(arrayList, jkamis);
        adapter = new SimpleArrayAdapter(getContext(), android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
    }
}
