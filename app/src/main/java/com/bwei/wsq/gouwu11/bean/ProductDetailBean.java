package com.bwei.wsq.gouwu11.bean;

/**
 * Created by dell on 2018-01-09  10:58
 */

public class ProductDetailBean {

    /**
     * msg :
     * seller : {"description":"我是商家11","icon":"http://120.27.23.105/images/icon.png","name":"商家11","productNums":999,"score":5,"sellerid":11}
     * code : 0
     * data : {"bargainPrice":159,"createtime":"2017-10-14T21:49:15","detailUrl":"https://item.m.jd.com/product/5061723.html?utm_source=androidapp&utm_medium=appshare&utm_campaign=t_335139774&utm_term=QQfriends","images":"https://m.360buyimg.com/n0/jfs/t8716/197/1271594444/173291/2f40bb4f/59b743bcN8509428e.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t8347/264/1286771527/92188/5cf5ec04/59b7420fN65378e9e.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t7363/165/3000956253/190883/179a372/59b743bfNd0c79d93.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t7399/112/2935531768/183594/b77c7d4a/59b7441aNc3d40133.jpg!q70.jpg","itemtype":0,"pid":100,"price":2200,"pscid":112,"salenum":456,"sellerid":11,"subhead":"针织针织闪闪闪亮你的眼","title":"维迩旎 2017秋冬新款长袖针织连衣裙韩版气质中长款名媛包臀A字裙 zx179709 黑色 XL"}
     */

    private String msg;
    private SellerBean seller;
    private String code;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public SellerBean getSeller() {
        return seller;
    }

    public void setSeller(SellerBean seller) {
        this.seller = seller;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class SellerBean {
        /**
         * description : 我是商家11
         * icon : http://120.27.23.105/images/icon.png
         * name : 商家11
         * productNums : 999
         * score : 5
         * sellerid : 11
         */

        private String description;
        private String icon;
        private String name;
        private int productNums;
        private int score;
        private int sellerid;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getProductNums() {
            return productNums;
        }

        public void setProductNums(int productNums) {
            this.productNums = productNums;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getSellerid() {
            return sellerid;
        }

        public void setSellerid(int sellerid) {
            this.sellerid = sellerid;
        }
    }

    public static class DataBean {
        /**
         * bargainPrice : 159
         * createtime : 2017-10-14T21:49:15
         * detailUrl : https://item.m.jd.com/product/5061723.html?utm_source=androidapp&utm_medium=appshare&utm_campaign=t_335139774&utm_term=QQfriends
         * images : https://m.360buyimg.com/n0/jfs/t8716/197/1271594444/173291/2f40bb4f/59b743bcN8509428e.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t8347/264/1286771527/92188/5cf5ec04/59b7420fN65378e9e.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t7363/165/3000956253/190883/179a372/59b743bfNd0c79d93.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t7399/112/2935531768/183594/b77c7d4a/59b7441aNc3d40133.jpg!q70.jpg
         * itemtype : 0
         * pid : 100
         * price : 2200
         * pscid : 112
         * salenum : 456
         * sellerid : 11
         * subhead : 针织针织闪闪闪亮你的眼
         * title : 维迩旎 2017秋冬新款长袖针织连衣裙韩版气质中长款名媛包臀A字裙 zx179709 黑色 XL
         */

        private int bargainPrice;
        private String createtime;
        private String detailUrl;
        private String images;
        private int itemtype;
        private int pid;
        private int price;
        private int pscid;
        private int salenum;
        private int sellerid;
        private String subhead;
        private String title;

        public int getBargainPrice() {
            return bargainPrice;
        }

        public void setBargainPrice(int bargainPrice) {
            this.bargainPrice = bargainPrice;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public String getDetailUrl() {
            return detailUrl;
        }

        public void setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
        }

        public String getImages() {
            return images;
        }

        public void setImages(String images) {
            this.images = images;
        }

        public int getItemtype() {
            return itemtype;
        }

        public void setItemtype(int itemtype) {
            this.itemtype = itemtype;
        }

        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getPscid() {
            return pscid;
        }

        public void setPscid(int pscid) {
            this.pscid = pscid;
        }

        public int getSalenum() {
            return salenum;
        }

        public void setSalenum(int salenum) {
            this.salenum = salenum;
        }

        public int getSellerid() {
            return sellerid;
        }

        public void setSellerid(int sellerid) {
            this.sellerid = sellerid;
        }

        public String getSubhead() {
            return subhead;
        }

        public void setSubhead(String subhead) {
            this.subhead = subhead;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
