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
public class Selasa extends Fragment {


    public Selasa() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selasa, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getActivity().setTitle("Selasa");

        ListView listView = (ListView) getActivity().findViewById(R.id.listselasa);
        SimpleArrayAdapter adapter;

        ArrayList<String> arrayList = new ArrayList<>();
        String[] jselasa = new String[]{
                "7.30-10 AM  = UKPL",
                "10-12 AM     = Multimedia",
                "3-5 PM        = Tek. Mobile"
        };

        Collections.addAll(arrayList, jselasa);
        adapter = new SimpleArrayAdapter(getContext(), android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
    }
}
