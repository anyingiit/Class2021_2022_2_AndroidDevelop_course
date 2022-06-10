package com.example.class2021_2022_2_androiddevelop_course.fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.class2021_2022_2_androiddevelop_course.R;
import com.example.class2021_2022_2_androiddevelop_course.databinding.FragmentExGalleryBinding;

public class ExGallery extends Fragment implements AdapterView.OnItemClickListener {
    private FragmentExGalleryBinding binding;

    final int[] imagesId = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_background};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentExGalleryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        BaseAdapter baseAdapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return imagesId.length;
            }

            @Override
            public Object getItem(int i) {
                return imagesId[i];
            }

            @Override
            public long getItemId(int i) {
                return i;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(imagesId[i]);

                return imageView;
            }
        };

        binding.gallery.setAdapter(baseAdapter);
        binding.gallery.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getContext(), "" + i, Toast.LENGTH_LONG).show();
        binding.imageView.setImageResource(imagesId[i]);
    }
}
