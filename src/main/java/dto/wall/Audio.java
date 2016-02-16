package dto.wall;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author sala
 */
public class Audio {
    private long id;
    private long owner_id;
    private String artist;
    private String title;
    private int duration;
    private String url;
    private int lyrics_id;
    private int album_id;
    private int genre_id;
    private long date;
    private int no_search;

    public Audio(@JsonProperty("id") long id,
                 @JsonProperty("owner_id") long owner_id,
                 @JsonProperty("artist") String artist,
                 @JsonProperty("title") String title,
                 @JsonProperty("duration") int duration,
                 @JsonProperty("url") String url,
                 @JsonProperty("lyrics_id") int lyrics_id,
                 @JsonProperty("album_id") int album_id,
                 @JsonProperty("genre_id") int genre_id,
                 @JsonProperty("date") long date) {
        this.id = id;
        this.owner_id = owner_id;
        this.artist = artist;
        this.title = title;
        this.duration = duration;
        this.url = url;
        this.lyrics_id = lyrics_id;
        this.album_id = album_id;
        this.genre_id = genre_id;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public long getOwner_id() {
        return owner_id;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getUrl() {
        return url;
    }

    public int getLyrics_id() {
        return lyrics_id;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public int getGenre_id() {
        return genre_id;
    }

    public long getDate() {
        return date;
    }

    public int getNo_search() {
        return no_search;
    }

    public void setNo_search(int no_search) {
        this.no_search = no_search;
    }
}
