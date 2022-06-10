package com.example.class2021_2022_2_androiddevelop_course.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.class2021_2022_2_androiddevelop_course.databinding.FragmentExAlertMessageDialogBinding;
import com.example.class2021_2022_2_androiddevelop_course.fragments.dialogs.AlertMessageDialog;

public class ExAlertMessageDialog extends Fragment {
    private FragmentExAlertMessageDialogBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentExAlertMessageDialogBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertMessageDialog("这是提示消息", getContext()).show(getParentFragmentManager(), "ExAlertMessageDialogShowMessage");
            }
        });
    }
}
