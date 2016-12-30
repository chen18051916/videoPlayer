package models;


import com.avaje.ebean.Model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by Administrator on 2016/3/26 0026.
 */
@Entity
public class Upload extends Model {
    @Id
    @Column(name = "ID")
    public Integer id;

    @Column(name = "uploadAccount")
    public String uploadAccount;

    @Column(name = "uploadMusic")
    public String uploadMusic;

    @Column(name = "uploadType")
    public String uploadType;

    @Column(name = "uploadExplain")
    public String uploadExplain;

    @Column(name = "uploadTime")
    public Date uploadTime;

//    public static Finder<Integer, User> find = new Finder<Integer, User>(User.class);
    public static Finder<String, Upload> find = new Finder<>("default", String.class, Upload.class);

}
