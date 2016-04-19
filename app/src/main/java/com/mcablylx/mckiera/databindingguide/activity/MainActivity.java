package com.mcablylx.mckiera.databindingguide.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.mcablylx.mckiera.databindingguide.R;
import com.mcablylx.mckiera.databindingguide.bean.User;
import com.mcablylx.mckiera.databindingguide.databinding.MainActivityBinding;

/**
 * Created by Mckiera on 2016-04-19.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityBinding mab =  DataBindingUtil.setContentView(this, R.layout.main_activity);
        User user = new User("Name","Phone");
        mab.setUser(user);
        mab.setIsShow(false);
    }
}
