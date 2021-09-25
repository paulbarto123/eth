package com.ethelen.be.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="m_cheat_engines")
public class CheatEngine {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;
    private String cheatName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCheatName() {
        return cheatName;
    }

    public void setCheatName(String cheatName) {
        this.cheatName = cheatName;
    }
}
