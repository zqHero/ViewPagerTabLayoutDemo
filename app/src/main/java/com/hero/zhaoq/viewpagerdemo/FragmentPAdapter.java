package com.hero.zhaoq.viewpagerdemo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Package_name:com.hero.zhaoq.viewpagerdemo
 * Author:zhaoqiang
 * Email:zhaoq_hero@163.com
 * Date:2017/01/24   15/37
 */
public class FragmentPAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;
    //
    public FragmentPAdapter(Context context, FragmentManager supportFragmentManager, List<Fragment> fragments) {
        super(supportFragmentManager);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

     //TODO  实际情况中  使用 getPageTitle 设置  pager的标题
    //TODO  实际情况 使用 抽象类  baseFragment  处理 pageTitle
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return position==0?"title1":position==1?"title2":
//                    position==2?"title3":position==3?"title4":"";
//        }


}
