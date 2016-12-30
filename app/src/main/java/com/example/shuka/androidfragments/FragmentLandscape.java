package com.example.shuka.androidfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shuka.androidfragments.R;

/**
 * Created by shuka on 12/23/2016.
 */

public class FragmentLandscape extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.landscape_fragment, container, false);
    }
}
