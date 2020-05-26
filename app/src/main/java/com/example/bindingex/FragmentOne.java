package com.example.bindingex;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.bindingex.databinding.FragmentOneBinding;

import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    private FragmentOneBinding binding;

    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Objects.requireNonNull(getActivity()).setTitle("fragment");
        // Inflate the layout for this fragment
        binding=FragmentOneBinding.inflate(inflater, container, false);
        View view=binding.getRoot();

        binding.toastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"first fragment",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
