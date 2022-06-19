package com.gyan.whatsapp.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.gyan.whatsapp.R;
import com.gyan.whatsapp.databinding.FragmentCallsBinding;
import com.gyan.whatsapp.databinding.FragmentChatsBinding;

public class CallsFragment extends Fragment {

    public CallsFragment() {
        // Required empty public constructor
    }

    FragmentCallsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentCallsBinding.inflate(inflater, container, false);

        setHasOptionsMenu(true);

        return binding.getRoot();
    }


    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.callsfragmentmenu,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.search:
                Toast.makeText(getContext(), "Search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.clearcalllog:
                Toast.makeText(getContext(), "Clear", Toast.LENGTH_SHORT).show();
                break;
            case R.id.settings:
                Toast.makeText(getContext(), "Settings", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

}