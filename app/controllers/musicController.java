package controllers;

import models.History;
import models.Musiclibrary;
import models.Songpeoplemusic;
import models.Songtype;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import views.html.song1;
import views.html.songpeople1;
import views.html.songtype1;
import views.html.video1;

import java.util.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
//@Security.Authenticated(Secured.class)
public class musicController extends Controller {

    public Result historymusic(){
        List<History> hislist = History.find.findList();
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(History history : hislist){
            sb.append("{\"ID\":"+history.id);
            sb.append(",");
            sb.append("\"historyAccount\":"+"\""+history.historyAccount+"\"");
            sb.append(",");
            sb.append("\"historyName\":"+"\""+history.historyName+"\"");
            sb.append(",");
            sb.append("\"historyMusic\":"+"\""+history.historyMusic+"\"},");
        }
        String result =  sb.toString().substring(0,sb.toString().length()-1);
        return ok(result+"]");
    }

    public List removeDuplicateWithOrder(List list){
        //遍历新的List,取出所有不同的值
        Set set  =   new HashSet();
        List newList  =   new  ArrayList();
        for  (Iterator iter  =  list.iterator(); iter.hasNext();)   {
            Object element  =  iter.next();
            if  (set.add(element))
                newList.add(element);
        }
        list.clear();
        list.addAll(newList);

        return list;
    }

    public Result songmusic(){
        String date = "";
        ArrayList<String> list = new ArrayList<String>();
        List<Musiclibrary> musiclibraries = Musiclibrary.find.all();
        if(musiclibraries!=null){
            for (Musiclibrary e : musiclibraries){

                 list.add(String.valueOf(e.songAlbum));

            }
        }
        removeDuplicateWithOrder(list);
        Collections.sort(list);

        for (int i = 0; i<list.size(); i ++){
            if(list.get(i) != "" || list.get(i) != null){
                List<Musiclibrary> musiclibraryList = Musiclibrary.find.where().eq("songAlbum",list.get(i)).findList();
                if(musiclibraryList!=null){
                    for (Musiclibrary k : musiclibraryList){
                    date += k.songAlbum + "!" + k.id +"!" + k.songNmae + "!";
                    date += k.songPeople + "!" + k.songType + "!" + k.songImg + "!";
                    date += k.songAdress + "!" +k.songNum + "!";
                    }
                }
            }
        }
        return ok(date);
    }

    public Result song1(String aaa) {
        String title = "";
        String mp3 = "";
        String poster = "";

        Musiclibrary musiclibrary = Musiclibrary.find.byId(aaa);
        if(musiclibrary!=null){
            title = musiclibrary.songNmae;
            mp3 = musiclibrary.songAdress;
            poster = "http://221.226.0.195:8020/11111/song/photo/"+musiclibrary.songImg;
        }
        System.out.println(title+"!!!!"+mp3+"!!!!"+poster);
        return ok(song1.render(title,mp3,poster));
    }

    public Result songpeoplemusic(){
        String date = "";
        ArrayList<String> list = new ArrayList<String>();
        List<Songpeoplemusic> songpeoplemusics = Songpeoplemusic.find.all();
        if(songpeoplemusics !=null){
            for (Songpeoplemusic e : songpeoplemusics){

                list.add(String.valueOf(e.songpeople));

            }
        }

        for (int i = 0; i<3; i ++){
            if(list.get(i) != "" || list.get(i) != null){
                List<Musiclibrary> musiclibraryList = Musiclibrary.find.where().eq("songPeople",list.get(i)).findList();
                if(musiclibraryList!=null){
                    for (int k = 0 ; k < 4; k ++){
                        date += musiclibraryList.get(k).songPeople + "!" + musiclibraryList.get(k).id +"!" + musiclibraryList.get(k).songNmae + "!";
                        date += musiclibraryList.get(k).songAlbum + "!" + musiclibraryList.get(k).songType + "!" + musiclibraryList.get(k).songImg + "!";
                        date += musiclibraryList.get(k).songAdress + "!" +musiclibraryList.get(k).songNum + "!";
                    }
                }
            }
        }
        return ok(date);
    }

    public Result songpeople1(String aaa) {
        String title = "";
        String mp3 = "";
        String poster = "";

        Musiclibrary musiclibrary = Musiclibrary.find.byId(aaa);
        if(musiclibrary!=null){
            title = musiclibrary.songNmae;
            mp3 = musiclibrary.songAdress;
            poster = "http://221.226.0.195:8020/11111/song/photo/"+musiclibrary.songImg;
        }
        System.out.println(title+"!!!!"+mp3+"!!!!"+poster);

        return ok(songpeople1.render(title,mp3,poster));
    }

    public Result songtypemusic(){
        String date = "";
        ArrayList<String> list = new ArrayList<String>();
        List<Songtype> songtype = Songtype.find.all();
        if(songtype !=null){
            for (Songtype e : songtype){

                list.add(String.valueOf(e.songtype));

            }
        }

        for (int i = 0; i<3; i ++){
            if(list.get(i) != "" || list.get(i) != null){
                List<Musiclibrary> musiclibraryList = Musiclibrary.find.where().eq("songtype",list.get(i)).findList();
                if(musiclibraryList!=null){
                    for (int k = 0 ; k < 4; k ++){
                        date += musiclibraryList.get(k).songType + "!" + musiclibraryList.get(k).id +"!" + musiclibraryList.get(k).songNmae + "!";
                        date += musiclibraryList.get(k).songAlbum + "!" + musiclibraryList.get(k).songPeople + "!" + musiclibraryList.get(k).songImg + "!";
                        date += musiclibraryList.get(k).songAdress + "!" +musiclibraryList.get(k).songNum + "!";
                    }
                }
            }
        }
        return ok(date);
    }

    public Result songtype1(String aaa) {
        String title = "";
        String mp3 = "";
        String poster = "";

        Musiclibrary musiclibrary = Musiclibrary.find.byId(aaa);
        if(musiclibrary!=null){
            title = musiclibrary.songNmae;
            mp3 = musiclibrary.songAdress;
            poster = "http://221.226.0.195:8020/11111/song/photo/"+musiclibrary.songImg;
        }
        System.out.println(title+"!!!!"+mp3+"!!!!"+poster);

        return ok(songtype1.render(title,mp3,poster));
    }

    public Result music(){
        String date = "";

        List<Musiclibrary> musiclibraries = Musiclibrary.find.all();
        if(musiclibraries!=null){
            for(Musiclibrary e : musiclibraries){
                date += e.songNmae +"!" + e.songImg+"!"+e.songType+"!";
                date += e.songAlbum+"!"+e.songPeople+"!"+e.songAdress+"!";
                date += e.id+"!"+e.songNum+"!";
            }
        }
        return ok(date);
    }

    public Result musicsong1(String aaa) {
        String title = "";
        String mp3 = "";
        String poster = "";

        Musiclibrary musiclibrary = Musiclibrary.find.byId(aaa);
        if(musiclibrary!=null){
            title = musiclibrary.songNmae;
            mp3 = musiclibrary.songAdress;
            poster = "http://221.226.0.195:8020/11111/song/photo/"+musiclibrary.songImg;
        }
        System.out.println(title+"!!!!"+mp3+"!!!!"+poster);

        return ok(video1.render(title,mp3,poster));
    }
}
