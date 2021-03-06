package com.crawler.r.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by hcj on 2018/4/25.
 *
 * 交易信息  关联 目标 tokenid
 */
@Entity
@Table(name = "token_transfers")
public class TokenTransfers implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * token id  例如 FDZ 的id
     */
    @Column
    private Long tokenId;

    /**
     * 合约地址
     */
    @Column
    private String token;

    /**
     * 交易时间
     */
    @Column
    private Date transfersDate;

    /**
     *  from
     */
    @Column
    private String fromToken;

    /**
     * to
     */
    @Column
    private String toToken;

    /**
     * 交易量
     */
    @Column
    private String quantity;

    @Column
    private Date createDate;

    @Column
    private String del;

    /**
     *  需要处理token类型判断标志 0 是初始值 1 已处理。
     */
    @Column
    private String flag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTransfersDate() {
        return transfersDate;
    }

    public void setTransfersDate(Date transfersDate) {
        this.transfersDate = transfersDate;
    }

    public String getFromToken() {
        return fromToken;
    }

    public void setFromToken(String fromToken) {
        this.fromToken = fromToken;
    }

    public String getToToken() {
        return toToken;
    }

    public void setToToken(String toToken) {
        this.toToken = toToken;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }

    public Long getTokenId() {
        return tokenId;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
