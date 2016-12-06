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
public class Jumat extends Fragment {


    public Jumat() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jumat, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getActivity().setTitle("Jumat");

        ListView listView = (ListView) getActivity().findViewById(R.id.listjumat);
        SimpleArrayAdapter adapter;

        ArrayList<String> arrayList = new ArrayList<>();
        String[] jjumat = new String[]{
                "8-10 AM = Etika Profesi"
        };

        Collections.addAll(arrayList, jjumat);
        adapter = new SimpleArrayAdapter(getContext(), android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
    }
}
