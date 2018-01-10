package com.bwei.wsq.gouwu11.net;



import com.bwei.wsq.gouwu11.bean.AddCartBean;
import com.bwei.wsq.gouwu11.bean.CartBean;
import com.bwei.wsq.gouwu11.bean.ProductDetailBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by dell on 2018-01-09  10:31
 */

public interface ServiceApi {
    //商品列表
    @GET(Urls.PRODUCTDETAIL)
    Observable<ProductDetailBean> getProductDetail(@Query("pid") String pid);

    //添加购物车
    @GET(Urls.ADDCART)
    Observable<AddCartBean> getAddCart(@Query("uid") String uid, @Query("pid") String pid);

    //查询购物车
    @GET(Urls.GETCARTS)
    Observable<CartBean> getCarts(@Query("uid") String uid);

}
