package com.example.class2021_2022_2_androiddevelop_course.fragments;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.class2021_2022_2_androiddevelop_course.databinding.FragmentExOtherDialogsBinding;

import java.util.Locale;

public class ExOtherDialogs extends Fragment {
    private FragmentExOtherDialogsBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentExOtherDialogsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog progressDialog = new ProgressDialog(getContext());
                progressDialog.setTitle("AlertDialog");
                progressDialog.setMessage("加载中...");
                progressDialog.setCancelable(true);
                progressDialog.setMax(5);
                progressDialog.setProgress(0);
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressDialog.show();
                progressDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialogInterface) {
                        Toast.makeText(getContext(), "ProgressDialog结束", Toast.LENGTH_LONG).show();
                    }
                });
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 5; i++) {
                            try {
                                Thread.sleep(1000);
                                progressDialog.incrementProgressBy(1);
                            } catch (Exception e) {
                                Toast.makeText(getContext(), "自增进图条进度线程捕获到错误: " + e, Toast.LENGTH_LONG).show();
                            }
                        }
                        progressDialog.dismiss();
                    }
                }).start();
            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            int y, m, d;

            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(getContext());
                datePickerDialog.setTitle("日期选择器");
                datePickerDialog.setMessage("请选择日期");
                datePickerDialog.setOnDateSetListener(new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                        y = year;
                        m = monthOfYear;
                        d = dayOfMonth;
                    }
                });
                datePickerDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialogInterface) {
                        Toast.makeText(getContext(), String.format(Locale.CHINA, "y: %d m: %d d: %d", y, m, d), Toast.LENGTH_LONG).show();
                    }
                });
                datePickerDialog.show();
            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            int h, m;

            @Override
            public void onClick(View view) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(getContext(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        h = i;
                        m = i1;
                    }
                }, h, m, true);
                timePickerDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialogInterface) {
                        Toast.makeText(getContext(), String.format(Locale.CHINA, "h: %d m: %d", h, m), Toast.LENGTH_LONG).show();
                    }
                });
                timePickerDialog.show();
            }
        });
    }
}
