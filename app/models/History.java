package models;


import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by Administrator on 2016/3/26 0026.
 */
@Entity
public class History extends Model {
    @Id
    @Column(name = "ID")
    public Integer id;

    @Column(name = "historyAccount")
    public String historyAccount;

    @Column(name = "historyName")
    public String historyName;

    @Column(name = "historyMusic")
    public String historyMusic;

    public static Finder<String, History> find = new Finder<>("default", String.class, History.class);

}
