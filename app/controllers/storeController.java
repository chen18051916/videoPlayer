package controllers;

import jdk.nashorn.internal.ir.Symbol;
import models.Collection;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.*;

/**
 * Created by Administrator on 2016/12/29.
 */
public class storeController extends Controller {

    public Result storelist() {
        DynamicForm form = Form.form().bindFromRequest();
        String name = form.get("name");        //用户名

        String date = "";
        //System.out.println(name);
        List<Collection> Stores = Collection.find.where().eq("collectionNmae",name).findList();
        if (Stores != null) {
            for (Collection e : Stores) {

                date += e.id + "!" + e.collectionAccount +"!" + e.collectionNmae + "!";
                date += e.collectionSong + "!";
            }

        }
        //System.out.println(date+"____________");
        return ok(date);

    }

    public Result songdel(String did) {
         //System.out.println(did);
         Collection deleletesong = Collection.find.byId(did);
         if (deleletesong != null) {
             deleletesong.delete();
         }
        return ok("删除成功！");
    }


}
