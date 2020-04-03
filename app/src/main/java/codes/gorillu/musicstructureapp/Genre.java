package codes.gorillu.musicstructureapp;

public class Genre {

    private String mGenreName;
    private int mGenreImageId;
    private int mCoverImgId;


    public Genre(String name, int genreImageId, int coverImageId) {
        this.mGenreName = name;
        this.mGenreImageId = genreImageId;
        this.mCoverImgId = coverImageId;
    }

    public String getGenreName() {
        return mGenreName;
    }

    public int getGenreImageId() {
        return mGenreImageId;
    }

    public int getCoverImageId() { return this.mCoverImgId;}

}
