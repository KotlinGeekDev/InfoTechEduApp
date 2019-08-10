package tk.infotech.courses.android.mobileapps.testbuildapp;

public class Video {
    private String videoName;
    private String duration;
    private int videoThumbNailId;

    public Video(String videoName, String videoDuration, int videoThumbNailId){
        this.videoName = videoName;
        this.duration = videoDuration;
        this.videoThumbNailId = videoThumbNailId;
    }

    public int getVideoThumbNailId() {
        return videoThumbNailId;
    }

    public String getDuration() {
        return duration;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setVideoThumbNailId(int videoThumbNailId) {
        this.videoThumbNailId = videoThumbNailId;
    }
}
