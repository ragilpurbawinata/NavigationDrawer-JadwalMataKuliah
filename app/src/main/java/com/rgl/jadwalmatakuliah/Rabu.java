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
public class Rabu extends Fragment {


    public Rabu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rabu, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getActivity().setTitle("Rabu");

        ListView listView = (ListView) getActivity().findViewById(R.id.listrabu);
        SimpleArrayAdapter adapter;

        ArrayList<String> arrayList = new ArrayList<>();
        String[] jrabu = new String[]{
                "7.30-10 AM = Otomata"
        };

        Collections.addAll(arrayList, jrabu);
        adapter = new SimpleArrayAdapter(getContext(), android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
    }
}
