package models;


import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by Administrator on 2016/3/26 0026.
 */
@Entity
public class Songpeoplemusic extends Model {
    @Id
    @Column(name = "ID")
    public Integer id;

    @Column(name = "songpeople")
    public String songpeople;

    public static Finder<String, Songpeoplemusic> find = new Finder<>("default", String.class, Songpeoplemusic.class);

}
