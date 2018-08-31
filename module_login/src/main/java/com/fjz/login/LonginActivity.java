package com.fjz.login;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.fjz.base.BaseActivity;
import com.orhanobut.logger.Logger;

@Route(path = "/login/activity")
public class LonginActivity extends BaseActivity{

    @Autowired(name = "name")
    String name;
    @Autowired(name = "id")
    int id;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ARouter.getInstance().inject(this);

        Logger.i("name = %s, id = %d", name, id);
    }
}
