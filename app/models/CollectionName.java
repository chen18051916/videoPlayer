package models;


import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by Administrator on 2016/3/26 0026.
 */
@Entity
public class CollectionName extends Model {
    @Id
    @Column(name = "ID")
    public Integer id;

    @Column(name = "collectionname")
    public String collectionname;

    public static Finder<String, CollectionName> find = new Finder<>("default", String.class, CollectionName.class);

}
