package com.bwei.wsq.gouwu11.presenter;


import com.bwei.wsq.gouwu11.bean.CartBean;
import com.bwei.wsq.gouwu11.model.CartModel;
import com.bwei.wsq.gouwu11.model.ICartModel;
import com.bwei.wsq.gouwu11.net.OnNetListener;
import com.bwei.wsq.gouwu11.view.ICartView;

/**
 * Created by dell on 2018-01-09  16:05
 */

public class CartPresenter implements BasePresenter {

    private final ICartModel iCartModel;
    private ICartView iCartView;

    public CartPresenter(ICartView iCartView) {
        this.iCartView = iCartView;
        iCartModel = new CartModel();
    }

    public void getCarts() {
        iCartModel.getCart("71", new OnNetListener<CartBean>() {
            @Override
            public void onSuccess(CartBean cartBean) {
                iCartView.getCarts(cartBean);
            }

            @Override
            public void onFailure(Exception e) {

            }
        });
    }

    @Override
    public void detachView() {
        //防止内存泄露
        if (iCartView != null) {
            iCartView = null;
            System.gc();
        }
    }
}
