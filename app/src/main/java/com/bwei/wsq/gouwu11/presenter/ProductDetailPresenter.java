package com.bwei.wsq.gouwu11.presenter;


import com.bwei.wsq.gouwu11.bean.AddCartBean;
import com.bwei.wsq.gouwu11.bean.ProductDetailBean;
import com.bwei.wsq.gouwu11.model.IProductDetaiModell;
import com.bwei.wsq.gouwu11.model.ProductDetailModel;
import com.bwei.wsq.gouwu11.net.OnNetListener;
import com.bwei.wsq.gouwu11.view.IDetailView;

/**
 * Created by dell on 2018-01-09  10:59
 */

public class ProductDetailPresenter implements BasePresenter {

    private final IProductDetaiModell iProductDetaiModell;
    private IDetailView iDetailView;

    public ProductDetailPresenter(IDetailView iDetailView) {
        this.iDetailView = iDetailView;
        iProductDetaiModell = new ProductDetailModel();
    }

    public void getDetail() {
        iProductDetaiModell.getDetail("100", new OnNetListener<ProductDetailBean>() {
            @Override
            public void onSuccess(ProductDetailBean productDetailBean) {
                iDetailView.showDetail(productDetailBean);
            }

            @Override
            public void onFailure(Exception e) {

            }
        });
    }

    public void addCart() {
        iProductDetaiModell.addCart("71", "100", new OnNetListener<AddCartBean>() {
            @Override
            public void onSuccess(AddCartBean addCartBean) {
                iDetailView.addCart(addCartBean);
            }

            @Override
            public void onFailure(Exception e) {

            }
        });
    }

    /**
     * 当页面销毁的时候,需要把View=null,
     * 然后调用 System.gc();//尽管不会马上回收，只是通知jvm可以回收了，等jvm高兴就会回收
     */
    @Override
    public void detachView() {
        //防止内存泄露
        if (iDetailView != null) {
            iDetailView = null;
            System.gc();
        }
    }
}
