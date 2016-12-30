package controllers;


import models.Musiclibrary;
import play.libs.*;
import play.mvc.*;

import views.html.*;

import java.util.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
//@Security.Authenticated(Secured.class)
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(video.render());
    }

    public Result upload() {
        return ok(upload.render());
    }

    public Result login() {
        return ok(login.render());
    }

    public Result reg() {
        return ok(reg.render());
    }

    public Result listen() {
        return ok(listen.render());
    }

    public Result song() {
        return ok(song.render());
    }

    public Result songlist() {
        return ok(songlist.render());
    }

    public Result history() {
        return ok(history.render());
    }

    public Result store() {
        String name="萝卜头的菜";
        return ok(store.render(name));
    }

    public Result songpeople() {
        return ok(songpeople.render());
    }

    public Result songtype() {
        return ok(songtype.render());
    }
}
