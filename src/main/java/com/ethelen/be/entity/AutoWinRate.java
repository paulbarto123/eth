package com.ethelen.be.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="m_auto_win_rates")
public class AutoWinRate {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;
    private String autoWinRateName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutoWinRateName() {
        return autoWinRateName;
    }

    public void setAutoWinRateName(String autoWinRateName) {
        this.autoWinRateName = autoWinRateName;
    }
}
