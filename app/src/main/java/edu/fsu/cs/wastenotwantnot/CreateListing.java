package edu.fsu.cs.wastenotwantnot;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class CreateListing extends Fragment {

    public CreateListing() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_create_listing, container, false);

        SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
        int userId = sharedPref.getInt(getString(R.string.userId), -1);
        Toast.makeText(view.getContext(), "Hello user " + userId, Toast.LENGTH_LONG).show();

        EditText title = view.findViewById(R.id.listingTitleInput);
        EditText address = view.findViewById(R.id.listingAddressInput);
        EditText description = view.findViewById(R.id.listingDescriptionInput);


        Button applyButton = view.findViewById(R.id.applyBtn);
        Button resetButton = view.findViewById(R.id.resetBtn);

        // applyButton on click listener
        applyButton.setOnClickListener(v -> {
            // Validate data has been entered
            if (title.getText().toString().equals(""))
                Toast.makeText(getActivity(), "Title is not entered", Toast.LENGTH_SHORT).show();
            if (address.getText().toString().equals(""))
                Toast.makeText(getActivity(), "Address is not entered", Toast.LENGTH_SHORT).show();
            if (description.getText().toString().equals(""))
                Toast.makeText(getActivity(), "Description is not entered", Toast.LENGTH_SHORT).show();
            
            else
            {
                // TODO: insert data to Listing database
                Toast.makeText(getActivity(), "Data successfully entered", Toast.LENGTH_SHORT).show();
            }
        });

        // resetButton on click listener
        resetButton.setOnClickListener(v -> {
            // Clear EditTexts
            title.setText("");
            address.setText("");
            description.setText("");
        });

        return view;
    }
}
