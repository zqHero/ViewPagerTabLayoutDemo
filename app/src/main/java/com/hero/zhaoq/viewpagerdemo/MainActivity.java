package com.hero.zhaoq.viewpagerdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hero.zhaoq.viewpagerdemo.fragments.NewsFragment;
import com.hero.zhaoq.viewpagerdemo.fragments.ArmFragment;
import com.hero.zhaoq.viewpagerdemo.fragments.OthersFragment;
import com.hero.zhaoq.viewpagerdemo.fragments.WomenFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    private FragmentManager manager;
    private TabLayout tabLayout;

    private List<Fragment> fragments;

    private  ViewPager viewpager;

    private final int[] TAB_TITLES = new int[]{R.string.first,R.string.second,R.string.third,R.string.forth};
    //Tab 图片
    private final int[] TAB_IMGS = new int[]{R.drawable.menu1_selector,R.drawable.menu2_selector,R.drawable.menu3_selector,R.drawable.menu4_selector};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager  = getSupportFragmentManager();

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewpager = (ViewPager) findViewById(R.id.viewpager);

        initFragment();

        tabLayout.setupWithViewPager(viewpager);

        initTab(tabLayout,TAB_TITLES,TAB_IMGS);
    }

    //初始化 fragment
    private void initFragment() {
        fragments = new ArrayList<>();

        fragments.add(new NewsFragment());
        fragments.add(new ArmFragment());
        fragments.add(new OthersFragment());
        fragments.add(new WomenFragment());

        viewpager.setAdapter(new FragmentPAdapter(this,
                manager,fragments));
    }

    //设置   底部导航图片数据
    private void initTab(TabLayout tabLayout, int[] tabTitlees, int[] tabImgs) {
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            View view =  LayoutInflater.from(this).inflate(R.layout.tab_bottom_item_view, null);
            tabLayout.getTabAt(i).setCustomView(view);

            TextView tvTitle = (TextView) tabLayout.getTabAt(i).getCustomView().findViewById(R.id.tv_tab);
            tvTitle.setText(tabTitlees[i]);

            ImageView imgTab = (ImageView) tabLayout.getTabAt(i).getCustomView().findViewById(R.id.img_tab);
            imgTab.setImageDrawable(getResources().getDrawable(tabImgs[i]));
        }
    }

}
