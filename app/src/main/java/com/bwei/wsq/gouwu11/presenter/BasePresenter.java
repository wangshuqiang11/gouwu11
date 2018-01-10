package com.bwei.wsq.gouwu11.presenter;

public interface BasePresenter {
    /**
     * 当页面销毁的时候,需要把View=null,
     * 然后调用 System.gc();//尽管不会马上回收，只是通知jvm可以回收了，等jvm高兴就会回收
     */
    void detachView();
}