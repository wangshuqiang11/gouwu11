package com.bwei.wsq.gouwu11.model;


import com.bwei.wsq.gouwu11.bean.AddCartBean;
import com.bwei.wsq.gouwu11.bean.ProductDetailBean;
import com.bwei.wsq.gouwu11.net.OnNetListener;

/**
 * Created by dell on 2018-01-09  10:59
 */

public interface IProductDetaiModell {
    public void getDetail(String pid, OnNetListener<ProductDetailBean> onNetListener);

    public void addCart(String uid, String pid, OnNetListener<AddCartBean> onNetListener);
}
