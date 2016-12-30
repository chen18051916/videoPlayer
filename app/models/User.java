package models;


import com.avaje.ebean.*;
import javax.persistence.*;


/**
 * Created by Administrator on 2016/3/26 0026.
 */
@Entity
public class User extends Model {
    @Id
    @Column(name = "ID")
    public Integer id;

    @Column(name = "accountNumber")
    public String accountNumber;

    @Column(name = "passWord")
    public String passWord;

    @Column(name = "tel")
    public String tel;

    @Column(name = "email")
    public String email;

    @Column(name = "landingFrequency")
    public Integer landingFrequency;

//    public static Finder<Integer, User> find = new Finder<Integer, User>(User.class);
    public static Finder<String, User> find = new Finder<>("default", String.class, User.class);

    public static boolean checkuser(String uname) {
        User user = find.where().eq("email", uname).findUnique();
        if (user == null) {
            return true;
        } else {
            return false;
        }
    }

    public static void createUser(User user) {
        user.save();
    }

    public static boolean loginuser(String uname, String password) {
        User user = find.where().eq("email", uname).findUnique();
        String name = user.email;
        String pwd = user.passWord;
        if (name.equals(uname) && pwd.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
