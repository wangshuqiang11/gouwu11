package com.bwei.wsq.gouwu11.model;


import com.bwei.wsq.gouwu11.bean.AddCartBean;
import com.bwei.wsq.gouwu11.bean.ProductDetailBean;
import com.bwei.wsq.gouwu11.net.OnNetListener;
import com.bwei.wsq.gouwu11.net.RetrofitHelper;
import com.bwei.wsq.gouwu11.net.ServiceApi;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by dell on 2018-01-09  10:58
 */

public class ProductDetailModel implements IProductDetaiModell {

    @Override
    public void getDetail(String pid, final OnNetListener<ProductDetailBean> onNetListener) {
        ServiceApi serviceApi = RetrofitHelper.getAPI();
        serviceApi.getProductDetail(pid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ProductDetailBean>() {
                    @Override
                    public void accept(ProductDetailBean productDetailBean) throws Exception {
                        onNetListener.onSuccess(productDetailBean);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        onNetListener.onFailure((Exception) throwable);
                    }
                });
    }

    @Override
    public void addCart(String uid, String pid, final OnNetListener<AddCartBean> onNetListener) {
        ServiceApi serviceApi = RetrofitHelper.getAPI();
        serviceApi.getAddCart(uid, pid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<AddCartBean>() {
                    @Override
                    public void accept(AddCartBean addCartBean) throws Exception {
                        onNetListener.onSuccess(addCartBean);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        onNetListener.onFailure((Exception) throwable);
                    }
                });

    }
}
