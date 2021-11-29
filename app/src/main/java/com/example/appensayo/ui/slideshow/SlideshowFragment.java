package com.example.appensayo.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.appensayo.R;
import com.example.appensayo.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {


    private TextView textSlide;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        textSlide =root.findViewById(R.id.text_slideshow);
        textSlide.setText("hola slide");
        return root;
    }


}