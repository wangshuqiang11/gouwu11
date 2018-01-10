package com.bwei.wsq.gouwu11;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.bwei.wsq.gouwu11.bean.AddCartBean;
import com.bwei.wsq.gouwu11.bean.ProductDetailBean;
import com.bwei.wsq.gouwu11.presenter.BasePresenter;
import com.bwei.wsq.gouwu11.presenter.ProductDetailPresenter;
import com.bwei.wsq.gouwu11.view.BaseMvpActivity;
import com.bwei.wsq.gouwu11.view.IDetailView;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, IDetailView {

    private SimpleDraweeView mSdv;
    /**
     * ￥19.90
     */
    private TextView mTvDetailPrice;
    /**
     * ￥10000.0
     */
    private TextView mTvDetailYuPrice;
    /**
     * 全球购 新款Apple MacBook Pro 苹果笔记本电脑 银色VP2新13英寸Bar i5/8G/256G
     */
    private TextView mTvDetailTitle;
    /**
     * 购买电脑办公部分商品满1元返火车票5元优惠券（返完即止）
     */
    private TextView mTvDetailSubhead;
    private TextView mTvCarts;
    /**
     * 加入购物车
     */
    private Button mBtAddcart;
    private ProductDetailPresenter productDetailPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        productDetailPresenter = new ProductDetailPresenter(this);
        productDetailPresenter.getDetail();
    }

    private void initView() {
        mSdv = (SimpleDraweeView) findViewById(R.id.sdv);
        mTvDetailPrice = (TextView) findViewById(R.id.tv_detail_price);
        mTvDetailYuPrice = (TextView) findViewById(R.id.tv_detail_yu_price);
        mTvDetailTitle = (TextView) findViewById(R.id.tv_detail_title);
        mTvDetailSubhead = (TextView) findViewById(R.id.tv_detail_subhead);
        mTvCarts = (TextView) findViewById(R.id.tv_carts);
        mBtAddcart = (Button) findViewById(R.id.bt_addcart);
        mBtAddcart.setOnClickListener(this);
        mSdv.setOnClickListener(this);
        mTvDetailPrice.setOnClickListener(this);
        mTvDetailYuPrice.setOnClickListener(this);
        mTvDetailTitle.setOnClickListener(this);
        mTvDetailSubhead.setOnClickListener(this);
        mTvCarts.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.bt_addcart:
                //添加购物车
                productDetailPresenter.addCart();
                break;
            case R.id.sdv:
                break;
            case R.id.tv_detail_price:
                break;
            case R.id.tv_detail_yu_price:
                break;
            case R.id.tv_detail_title:
                break;
            case R.id.tv_detail_subhead:
                break;
            case R.id.tv_carts:
                //跳转到购物车
                Intent intent = new Intent(MainActivity.this, CartActivity.class);
                startActivity(intent);
                break;
        }
    }



    @Override
    public void showDetail(ProductDetailBean productDetailBean) {
        String images = productDetailBean.getData().getImages();
        String[] strings = images.split("\\|");
        mSdv.setImageURI(strings[0]);
        mTvDetailPrice.setText("￥" + productDetailBean.getData().getBargainPrice());
        mTvDetailYuPrice.setText("￥" + productDetailBean.getData().getPrice());
        //添加删除线
        mTvDetailYuPrice.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        mTvDetailTitle.setText(productDetailBean.getData().getTitle());
        mTvDetailSubhead.setText(productDetailBean.getData().getSubhead());
    }

    @Override
    public void addCart(AddCartBean addCartBean) {
        if ("0".equals(addCartBean.getCode())) {
            Toast.makeText(getApplicationContext(), addCartBean.getMsg(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), addCartBean.getMsg(), Toast.LENGTH_SHORT).show();
        }
    }
}
