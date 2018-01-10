package com.bwei.wsq.gouwu11.model;


import com.bwei.wsq.gouwu11.bean.CartBean;
import com.bwei.wsq.gouwu11.net.OnNetListener;

/**
 * Created by dell on 2018-01-09  16:03
 */

public interface ICartModel {
    public void getCart(String uid, OnNetListener<CartBean> onNetListener);
}
