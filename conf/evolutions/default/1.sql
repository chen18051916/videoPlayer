# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table collection (
  id                            integer auto_increment not null,
  collectionaccount             varchar(255),
  collectionnmae                varchar(255),
  collectionsong                varchar(255),
  constraint pk_collection primary key (id)
);

create table collection_name (
  id                            integer auto_increment not null,
  collectionname                varchar(255),
  constraint pk_collection_name primary key (id)
);

create table history (
  id                            integer auto_increment not null,
  historyaccount                varchar(255),
  historyname                   varchar(255),
  historymusic                  varchar(255),
  constraint pk_history primary key (id)
);

create table musiclibrary (
  id                            integer auto_increment not null,
  songnmae                      varchar(255),
  songpeople                    varchar(255),
  songtype                      varchar(255),
  songalbum                     varchar(255),
  songlyric                     varchar(255),
  songimg                       varchar(255),
  songnum                       integer,
  songadress                    varchar(255),
  constraint pk_musiclibrary primary key (id)
);

create table songpeoplemusic (
  id                            integer auto_increment not null,
  songpeople                    varchar(255),
  constraint pk_songpeoplemusic primary key (id)
);

create table songtype (
  id                            integer auto_increment not null,
  songtype                      varchar(255),
  constraint pk_songtype primary key (id)
);

create table upload (
  id                            integer auto_increment not null,
  uploadaccount                 varchar(255),
  uploadmusic                   varchar(255),
  uploadtype                    varchar(255),
  uploadexplain                 varchar(255),
  uploadtime                    datetime(6),
  constraint pk_upload primary key (id)
);

create table user (
  id                            integer auto_increment not null,
  accountnumber                 varchar(255),
  password                      varchar(255),
  tel                           varchar(255),
  email                         varchar(255),
  landingfrequency              integer,
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists collection;

drop table if exists collection_name;

drop table if exists history;

drop table if exists musiclibrary;

drop table if exists songpeoplemusic;

drop table if exists songtype;

drop table if exists upload;

drop table if exists user;

