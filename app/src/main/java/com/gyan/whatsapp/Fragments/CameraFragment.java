package com.gyan.whatsapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;

import com.gyan.whatsapp.R;
import com.gyan.whatsapp.databinding.FragmentCameraBinding;

public class CameraFragment extends Fragment {

    public CameraFragment() {
        // Required empty public constructor
    }

    FragmentCameraBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_camera, container, false);


        return view;
    }

}