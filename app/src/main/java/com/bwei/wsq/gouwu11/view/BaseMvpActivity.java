package com.bwei.wsq.gouwu11.view;

import android.support.v7.app.AppCompatActivity;

import com.bwei.wsq.gouwu11.presenter.BasePresenter;

/**
 * Created by WSQ on 2018/1/9 0009.
 */

public abstract class BaseMvpActivity extends AppCompatActivity{
    private BasePresenter presenter = null;

    /**
     * 绑定presenter，主要用于销毁工作
     *
     * @return
     */
    protected abstract BasePresenter bindPresenter();

    /**
     * 如果重写了此方法，一定要调用super.onDestroy();
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.detachView();
            presenter = null;

        }
    }
}
