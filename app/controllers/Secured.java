//package controllers;
//
//
//import play.mvc.Http;
//import play.mvc.Result;
//import play.mvc.Security;
//
///**
// * Created by Administrator on 2016/3/29 0029.
// */
//public class Secured extends Security.Authenticator {
//    @Override//Code-Override Methods-Authenticator重写Authenticator方法
//    public String getUsername(Http.Context ctx) {
//        return ctx.session().get("user");
//    }
//
//    @Override
//    public Result onUnauthorized(Http.Context ctx) {
//        return redirect(routes.HomeController.login());
//    }
//}