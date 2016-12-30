package models;


import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by Administrator on 2016/3/26 0026.
 */
@Entity
public class Musiclibrary extends Model {
    @Id
    @Column(name = "ID")
    public Integer id;

    @Column(name = "songNmae")
    public String songNmae;

    @Column(name = "songPeople")
    public String songPeople;

    @Column(name = "songType")
    public String songType;

    @Column(name = "songAlbum")
    public String songAlbum;

    @Column(name = "songLyric")
    public String songLyric;

    @Column(name = "songImg")
    public String songImg;

    @Column(name = "songNum")
    public Integer songNum;

    @Column(name = "songAdress")
    public String songAdress;

    public static Finder<String, Musiclibrary> find = new Finder<>("default", String.class, Musiclibrary.class);

}
