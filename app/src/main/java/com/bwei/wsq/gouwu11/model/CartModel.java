package com.bwei.wsq.gouwu11.model;



import com.bwei.wsq.gouwu11.bean.CartBean;
import com.bwei.wsq.gouwu11.net.OnNetListener;
import com.bwei.wsq.gouwu11.net.RetrofitHelper;
import com.bwei.wsq.gouwu11.net.ServiceApi;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by dell on 2018-01-09  16:02
 */

public class CartModel implements ICartModel {
    @Override
    public void getCart(String uid, final OnNetListener<CartBean> onNetListener) {
        ServiceApi serviceApi = RetrofitHelper.getAPI();
        serviceApi.getCarts(uid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CartBean>() {
                    @Override
                    public void accept(CartBean cartBean) throws Exception {
                        onNetListener.onSuccess(cartBean);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        onNetListener.onFailure((Exception) throwable);
                    }
                });
    }
}
