$(document).ready(function(){


  var playlist = [{
      title:"我的第一首歌曲Hidden",
      artist:"Miaow",
      mp3:"http://demo.lanrenzhijia.com/2014/music0917/images/i1.mp3",
      //oga:"http://www.jplayer.org/audio/ogg/Miaow-02-Hidden.ogg",
      poster: "http://33.media.tumblr.com/0b35eb42176eedbf4a96e52efa760875/tumblr_mxp7a0v3fr1rqx86wo1_500.png"
    },{
      title:"我的第二首歌曲Cro Magnon Man",
      artist:"The Stark Palace",
      mp3:"http://demo.lanrenzhijia.com/2014/music0917/images/i2.mp3",
      //oga:"http://www.jplayer.org/audio/ogg/TSP-01-Cro_magnon_man.ogg",
      poster: "http://33.media.tumblr.com/bf9dc125a47dcca91ce5b3575bc3ba92/tumblr_nbmb3j8nU51sq3g2zo1_500.png"
    },{
      title:"我的第三首歌曲Bubble",
      m4a: "http://www.jplayer.org/audio/m4a/Miaow-07-Bubble.m4a",
      oga: "http://www.jplayer.org/audio/ogg/Miaow-07-Bubble.ogg",
      poster: "http://31.media.tumblr.com/810b1125a8b9e9f192d009ef58dceb07/tumblr_nbe8wsmKuz1rknpqyo1_500.jpg"
  }];
  
  var cssSelector = {
    //jPlayer: "#jquery_jplayer",
    //cssSelectorAncestor: ".music-player"
    jPlayer: "#jplayer_N",
    cssSelectorAncestor: "#jp_container_N"
  };
  
  var options = {
    swfPath: "Jplayer.swf",
    supplied: "ogv, m4v, oga, mp3"
  };
  
  var myPlaylist = new jPlayerPlaylist(cssSelector, playlist, options);
  
});