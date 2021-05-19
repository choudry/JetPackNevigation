package com.example.jetpacknevigation;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class SpinnerFragment extends Fragment {

    Spinner spinner;
    TextView tvoutput;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_spinner, container, false);
        context = getActivity();

        spinner = view.findViewById(R.id.spoptions);
        tvoutput = view.findViewById(R.id.tvoutput);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("--Select Options--");
        categories.add("Item 1");
        categories.add("Item 2");
        categories.add("Item 3");
        categories.add("Item 4");
        categories.add("Item 5");
        categories.add("Item 6");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_expandable_list_item_1, categories);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        tvoutput.setText("Selected item is 1");
                        break;
                    case 2:
                        tvoutput.setText("Selected item is 2");
                        break;
                    case 3:
                        tvoutput.setText("Selected item is 3");
                        break;
                    case 4:
                        tvoutput.setText("Selected item is 4");
                        break;
                    case 5:
                        tvoutput.setText("Selected item is 5");
                        break;
                    default:
                        tvoutput.setText("Selected item is ^6");

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return view;
    }
}