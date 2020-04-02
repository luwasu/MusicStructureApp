package codes.gorillu.musicstructureapp;

public class Genre {

    private String mGenreName;
    private int mGenreImageId;
    private int mCoverImgId;


    public Genre(String name, int genreImageId) {
        this.mGenreName = name;
        this.mGenreImageId = genreImageId;
    }

    public String getGenreName() {
        return mGenreName;
    }

    public int getGenreImageId() {
        return mGenreImageId;
    }

}
