package com.fjz.mymoduledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

public class MyModuleDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_module_demo);
    }

    public void onLogin(View view) {
        ARouter.getInstance().build("/login/activity")
                .withInt("id", 3)
                .withString("name", "testingname")
                .navigation();
    }
}
