package com.hero.zhaoq.viewpagerdemo.fragments.newsFragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hero.zhaoq.viewpagerdemo.R;

public class OutNewsFragment extends Fragment {


    public OutNewsFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_out_news, container, false);
    }

}
