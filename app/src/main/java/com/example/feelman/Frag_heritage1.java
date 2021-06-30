package com.example.feelman;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Frag_heritage1 extends Fragment {
    private View view;
    public static Frag_heritage1 newInstance() {
        Frag_heritage1 frag1 = new Frag_heritage1();

        return frag1;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_heritage1, container, false);

        return view;
    }
}