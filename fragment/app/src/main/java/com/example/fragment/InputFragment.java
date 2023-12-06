package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class InputFragment extends Fragment {
    public InputFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_input, container, false);

        // Find the Button within the inflated view
        Button btnSubmit = view.findViewById(R.id.btnSubmit);

        // Set an onClickListener for the button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Process the input and get the result
                String result = processInput();

                // Load the ResultFragment with the result
                ResultFragment resultFragment = new ResultFragment();
                loadFragment(resultFragment, result);
            }
        });

        return view;
    }
 
    // Define a method to process the user input
    private String processInput() {
        // Replace this with your actual logic to process the input and get the result
        return "Processed Result";
    }

    // Define a method to load the ResultFragment with the result
    private void loadFragment(Fragment fragment, String result) {
        if (fragment != null) {
            // Example of passing result as an argument
            Bundle bundle = new Bundle();
            bundle.putString("result", result);
            fragment.setArguments(bundle);

            // Use getActivity() if you are calling this from a Fragment
            ((MainActivity) requireActivity()).loadFragment(fragment);
        }
    }

}
