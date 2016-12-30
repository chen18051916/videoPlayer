package models;


import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by Administrator on 2016/3/26 0026.
 */
@Entity
public class Collection extends Model {
    @Id
    @Column(name = "ID")
    public Integer id;

    @Column(name = "collectionAccount")
    public String collectionAccount;

    @Column(name = "collectionNmae")
    public String collectionNmae;

    @Column(name = "collectionSong")
    public String collectionSong;

    public static Finder<String, Collection> find = new Finder<>("default", String.class, Collection.class);

}
