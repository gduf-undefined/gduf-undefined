package cn.itcast.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单
 */
public class Order implements Serializable {

    private String orderid;
    private int goodsid;
    private String goodsname;
    private String buyername;
    private String buyeropenid;
    private String sellername;
    private String selleropenid;
    private String address;
    private String phone;
    private Date time;
    private String comments;//留言
    private int flag;//是否同意卖


    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public int getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(int goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getBuyername() {
        return buyername;
    }

    public void setBuyername(String buyername) {
        this.buyername = buyername;
    }

    public String getBuyeropenid() {
        return buyeropenid;
    }

    public void setBuyeropenid(String buyeropenid) {
        this.buyeropenid = buyeropenid;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
    }

    public String getSelleropenid() {
        return selleropenid;
    }

    public void setSelleropenid(String selleropenid) {
        this.selleropenid = selleropenid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid='" + orderid + '\'' +
                ", goodsid=" + goodsid +
                ", goodsname='" + goodsname + '\'' +
                ", buyername='" + buyername + '\'' +
                ", buyeropenid='" + buyeropenid + '\'' +
                ", sellername='" + sellername + '\'' +
                ", selleropenid='" + selleropenid + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", time=" + time +
                ", comments='" + comments + '\'' +
                ", flag=" + flag +
                '}';
    }
}
