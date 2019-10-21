package tk.infotech.courses.android.mobileapps.testbuildapp.models;

public class Chapter {
    private String chapterName;
    private int imageId;

    public Chapter(String chapterName, int imageId) {
        this.chapterName = chapterName;
        this.imageId = imageId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public int getImageId() {
        return imageId;
    }
}
