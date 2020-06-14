package com.base.module.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.base.module.home.AppHomeActivity;
import com.base.module.login.AppLoginActivity;
import com.base.module.order.AppOrderActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final static int ID_SM_LOGIN = 11; // 登陆
    private final static int ID_SM_HOME = 12; // 首页
    private final static int ID_SM_ORDER = 13; // 我的订单
    private FlowLayout mFlowLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFlowLayout = findViewById(R.id.flow_layout);

        initView();
    }

    private void initView() {
        mFlowLayout.addView(getItemView("Login-登陆", ID_SM_LOGIN));
        mFlowLayout.addView(getItemView("Home-首页", ID_SM_HOME));
        mFlowLayout.addView(getItemView("Orders-订单", ID_SM_ORDER));
    }

    private View getItemView(String content, int viewId) {
        return ViewItemUtil.generateItemView(this, content, viewId, this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case ID_SM_LOGIN: // 登陆
                intent = new Intent(this, AppLoginActivity.class);
                break;
            case ID_SM_HOME: // 首页
                intent = new Intent(this, AppHomeActivity.class);
                break;
            case ID_SM_ORDER: // 订单
                intent = new Intent(this, AppOrderActivity.class);
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
