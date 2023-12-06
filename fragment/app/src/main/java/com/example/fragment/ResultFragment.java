package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ResultFragment extends Fragment {
    public ResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, container, false);

        // Find the TextView within the inflated view
        TextView textViewResult = view.findViewById(R.id.textViewResult);

        // Get the entered text from the arguments
        String userInput = getArguments().getString("userInput");

        // Update the TextView with the entered text
        textViewResult.setText(userInput);

        return view;
    }

}
