package com.example.jetpacknevigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Objects;

public class RootFragment extends Fragment {


    TextView tvspinner,tvwebview;
    NavController navController;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_root, container, false);
        tvspinner = view.findViewById(R.id.tvspinner);
        tvwebview = view.findViewById(R.id.tvwebview);
        navController = Navigation.findNavController(requireActivity(),R.id.hostfragment);

        tvspinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_rootFragment_to_spinnerFragment2);
            }
        });

        tvwebview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_rootFragment_to_webviewfragment);
            }
        });
        return view;
    }
}