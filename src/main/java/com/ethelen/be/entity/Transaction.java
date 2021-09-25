package com.ethelen.be.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="m_transactions")
public class Transaction {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;
    private String userId;
    private String cheatId;
    private String autoWinRateId;
    private String spinTurboId;
    private String providerId;
    private Date transactionDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCheatId() {
        return cheatId;
    }

    public void setCheatId(String cheatId) {
        this.cheatId = cheatId;
    }

    public String getAutoWinRateId() {
        return autoWinRateId;
    }

    public void setAutoWinRateId(String autoWinRateId) {
        this.autoWinRateId = autoWinRateId;
    }

    public String getSpinTurboId() {
        return spinTurboId;
    }

    public void setSpinTurboId(String spinTurboId) {
        this.spinTurboId = spinTurboId;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
