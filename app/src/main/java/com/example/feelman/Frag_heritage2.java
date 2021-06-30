package com.example.feelman;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Frag_heritage2 extends Fragment {
    private View view;
    public static Frag_heritage2 newInstance() {
        Frag_heritage2 frag2 = new Frag_heritage2();

        return frag2;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_heritage2, container, false);

        return view;
    }
}