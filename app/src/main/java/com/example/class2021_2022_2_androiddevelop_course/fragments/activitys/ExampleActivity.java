package com.example.class2021_2022_2_androiddevelop_course.fragments.activitys;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.class2021_2022_2_androiddevelop_course.R;
import com.example.class2021_2022_2_androiddevelop_course.databinding.ActivityExampleActivityBinding;

public class ExampleActivity extends Activity {
    private ActivityExampleActivityBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExampleActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.textView.setText(getResources().getText(R.string.live_for_yourself));
    }

}
