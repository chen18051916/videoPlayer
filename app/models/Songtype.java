package models;


import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by Administrator on 2016/3/26 0026.
 */
@Entity
public class Songtype extends Model {
    @Id
    @Column(name = "ID")
    public Integer id;

    @Column(name = "songtype")
    public String songtype;

    public static Finder<String, Songtype> find = new Finder<>("default", String.class, Songtype.class);

}
