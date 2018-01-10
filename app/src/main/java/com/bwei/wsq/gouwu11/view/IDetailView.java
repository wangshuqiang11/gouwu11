package com.bwei.wsq.gouwu11.view;


import com.bwei.wsq.gouwu11.bean.AddCartBean;
import com.bwei.wsq.gouwu11.bean.ProductDetailBean;

/**
 * Created by dell on 2018-01-09  11:44
 */

public interface IDetailView {
    public void showDetail(ProductDetailBean productDetailBean);

    public void addCart(AddCartBean addCartBean);
}
