package com.hero.zhaoq.viewpagerdemo.fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hero.zhaoq.viewpagerdemo.FragmentPAdapter;
import com.hero.zhaoq.viewpagerdemo.R;
import com.hero.zhaoq.viewpagerdemo.fragments.newsFragments.InNewsFragment;
import com.hero.zhaoq.viewpagerdemo.fragments.newsFragments.OthersNewsFragment;
import com.hero.zhaoq.viewpagerdemo.fragments.newsFragments.OutNewsFragment;

import java.util.ArrayList;
import java.util.List;

//查看效果：
public class NewsFragment extends Fragment {

    public NewsFragment() {
    }

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private List<Fragment> fragments;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_title1, container, false);

        tabLayout = (TabLayout) view.findViewById(R.id.tablayout);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);

        initFragment();
        initTablayout();

        //会  清除  tab：
        tabLayout.setupWithViewPager(viewPager);

        //手动  添加标题  必须在 setupwidthViewPager  之后  否则不行
        tabLayout.getTabAt(0).setText("国内要闻");
        tabLayout.getTabAt(1).setText("国际要闻");
        tabLayout.getTabAt(2).setText("其他");

        return view;
    }

    //初始化 fragment
    private void initFragment() {
        InNewsFragment fragment1 = new InNewsFragment();
        OutNewsFragment fragment2 = new OutNewsFragment();
        OthersNewsFragment fragment3 = new OthersNewsFragment();

        fragments = new ArrayList<>();

        fragments.add(fragment1);
        fragments.add(fragment2);
        fragments.add(fragment3);

        viewPager.setAdapter(new FragmentPAdapter(getActivity(),
                getChildFragmentManager(),fragments));
    }

    /**
     * 初始化   tablayout
     */
    private void initTablayout() {
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
    }
}
