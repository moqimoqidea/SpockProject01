package com.moqi.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 豆瓣音乐人的 playlist bean
 *
 * @author wenbo17
 * On 9/7/19 10:48
 */

public class DoubanMusican implements Serializable {

    private List<PlaylistBean> playlist;

    public List<PlaylistBean> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<PlaylistBean> playlist) {
        this.playlist = playlist;
    }

    public static class PlaylistBean implements Serializable {
        /**
         * styles : []
         * picture : ["https://img3.doubanio.com/view/site/large/public/89c2c46f11363c5.jpg"]
         * play_length : 18:03
         * lyrics :
         * title : 【美文】《我曾经爱过的》-天街雨主播
         * is_commentable : true
         * subject_id : 0
         * rec_url : https://site.douban.com/111828/?s=433910
         * is_downloadable : true
         * artist_name : 倾听文字的声音
         * label :
         * play_count : 6697
         * url : http://mm1.doubanio.com/201909071036/ebecff96975305362a90ee1ffb54347b/view/musicianmp3/mp3/x15379249.mp3
         * is_selling : false
         * publish_date :
         * sid : 433910
         * is_collected : false
         * artist : {"picture":"https://img3.doubanio.com/view/site/large/public/89c2c46f11363c5.jpg","cover_color":["#ffb0aa","#332a29","#ee5044"],"kind":"dj","follower":201529,"id":"111828","is_royalty_artist":false,"style":"YueDu.FM","name":"倾听文字的声音","url":"https://site.douban.com/reading/","song_count":386,"genre_url":"https://music.douban.com/disc_jockeys/"}
         */

        private String play_length;
        private String lyrics;
        private String title;
        private boolean is_commentable;
        private String subject_id;
        private String rec_url;
        private boolean is_downloadable;
        private String artist_name;
        private String label;
        private String play_count;
        private String url;
        private boolean is_selling;
        private String publish_date;
        private String sid;
        private boolean is_collected;
        private ArtistBean artist;
        private List<?> styles;
        private List<String> picture;

        public String getPlay_length() {
            return play_length;
        }

        public void setPlay_length(String play_length) {
            this.play_length = play_length;
        }

        public String getLyrics() {
            return lyrics;
        }

        public void setLyrics(String lyrics) {
            this.lyrics = lyrics;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean isIs_commentable() {
            return is_commentable;
        }

        public void setIs_commentable(boolean is_commentable) {
            this.is_commentable = is_commentable;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getRec_url() {
            return rec_url;
        }

        public void setRec_url(String rec_url) {
            this.rec_url = rec_url;
        }

        public boolean isIs_downloadable() {
            return is_downloadable;
        }

        public void setIs_downloadable(boolean is_downloadable) {
            this.is_downloadable = is_downloadable;
        }

        public String getArtist_name() {
            return artist_name;
        }

        public void setArtist_name(String artist_name) {
            this.artist_name = artist_name;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getPlay_count() {
            return play_count;
        }

        public void setPlay_count(String play_count) {
            this.play_count = play_count;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isIs_selling() {
            return is_selling;
        }

        public void setIs_selling(boolean is_selling) {
            this.is_selling = is_selling;
        }

        public String getPublish_date() {
            return publish_date;
        }

        public void setPublish_date(String publish_date) {
            this.publish_date = publish_date;
        }

        public String getSid() {
            return sid;
        }

        public void setSid(String sid) {
            this.sid = sid;
        }

        public boolean isIs_collected() {
            return is_collected;
        }

        public void setIs_collected(boolean is_collected) {
            this.is_collected = is_collected;
        }

        public ArtistBean getArtist() {
            return artist;
        }

        public void setArtist(ArtistBean artist) {
            this.artist = artist;
        }

        public List<?> getStyles() {
            return styles;
        }

        public void setStyles(List<?> styles) {
            this.styles = styles;
        }

        public List<String> getPicture() {
            return picture;
        }

        public void setPicture(List<String> picture) {
            this.picture = picture;
        }

        public static class ArtistBean implements Serializable {
            /**
             * picture : https://img3.doubanio.com/view/site/large/public/89c2c46f11363c5.jpg
             * cover_color : ["#ffb0aa","#332a29","#ee5044"]
             * kind : dj
             * follower : 201529
             * id : 111828
             * is_royalty_artist : false
             * style : YueDu.FM
             * name : 倾听文字的声音
             * url : https://site.douban.com/reading/
             * song_count : 386
             * genre_url : https://music.douban.com/disc_jockeys/
             */

            private String picture;
            private String kind;
            private int follower;
            private String id;
            private boolean is_royalty_artist;
            private String style;
            private String name;
            private String url;
            private int song_count;
            private String genre_url;
            private List<String> cover_color;

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }

            public String getKind() {
                return kind;
            }

            public void setKind(String kind) {
                this.kind = kind;
            }

            public int getFollower() {
                return follower;
            }

            public void setFollower(int follower) {
                this.follower = follower;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public boolean isIs_royalty_artist() {
                return is_royalty_artist;
            }

            public void setIs_royalty_artist(boolean is_royalty_artist) {
                this.is_royalty_artist = is_royalty_artist;
            }

            public String getStyle() {
                return style;
            }

            public void setStyle(String style) {
                this.style = style;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getSong_count() {
                return song_count;
            }

            public void setSong_count(int song_count) {
                this.song_count = song_count;
            }

            public String getGenre_url() {
                return genre_url;
            }

            public void setGenre_url(String genre_url) {
                this.genre_url = genre_url;
            }

            public List<String> getCover_color() {
                return cover_color;
            }

            public void setCover_color(List<String> cover_color) {
                this.cover_color = cover_color;
            }
        }
    }
}
