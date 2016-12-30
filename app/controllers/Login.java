package controllers;


import models.User;
import play.data.FormFactory;
import play.data.Form;
import play.mvc.*;
import views.html.*;
import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
//@Security.Authenticated(Secured.class)
public class Login extends Controller {
    @Inject
    FormFactory formFactory;
    public Result newUser(){
        Form<User> loginForm=formFactory.form(User.class);
        Form<User> userForm=loginForm.bindFromRequest();
        String username=userForm.get().email;
        if(User.checkuser(username)){
            User.createUser(userForm.get());
            flash("reg","*注册成功,请登录");
            return redirect(routes.HomeController.login());
        }else {
            flash("regfail","*用户名已存在");
            return redirect(routes.HomeController.login());
        }
    }
    public Result newLogin() {
        Form<User> loginForm = formFactory.form(User.class);
        Form<User> userForm = loginForm.bindFromRequest();

        String username = userForm.get().email;
        String password = userForm.get().passWord;
        String authority = "";
        Integer _id = userForm.get().id;
        if(username.equals("")){
            flash("usernull","*请输入账号");
            return redirect(routes.HomeController.login());
        }else{
            if (User.checkuser(username)) {

                flash("nouser","*账号不存在");
                return redirect(routes.HomeController.login());
            } else if (User.loginuser(username,password)){
                session().clear();
                session("user",username);

                User user = User.find.where().eq("email",username).findUnique();

                session("email",username);

                //userse=session("user");
                return redirect(routes.HomeController.index());
            } else {
                flash("loginfail","*密码不正确");
                return redirect(routes.HomeController.login());
            }
        }
    }
}
