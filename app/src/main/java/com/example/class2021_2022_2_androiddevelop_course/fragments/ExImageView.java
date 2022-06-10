package com.example.class2021_2022_2_androiddevelop_course.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.class2021_2022_2_androiddevelop_course.R;
import com.example.class2021_2022_2_androiddevelop_course.databinding.FragmentExImageViewBinding;

public class ExImageView extends Fragment {

    private FragmentExImageViewBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentExImageViewBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.imageView1.setImageDrawable(ContextCompat.getDrawable(view.getContext(), R.drawable.ic_launcher_background));
            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.imageView2.setBackground(ContextCompat.getDrawable(view.getContext(), R.drawable.ic_launcher_background));
            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.imageView1.setMaxHeight(100);
                binding.imageView1.setMinimumHeight(100);
                binding.imageView1.setAdjustViewBounds(true);
            }
        });
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewGroup.LayoutParams layoutParams = binding.imageView2.getLayoutParams();
                layoutParams.width = 100;
                layoutParams.height = 100;
                binding.imageView2.setLayoutParams(layoutParams);
            }
        });
    }
}
