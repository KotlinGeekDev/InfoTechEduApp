package tk.infotech.courses.android.mobileapps.testbuildapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class VideoCoursesActivity extends AppCompatActivity {

    private GridLayoutManager mVideosLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_courses);

        getSupportActionBar();

        List<Video> videoList = retrieveVideos();
        mVideosLayoutManager = new GridLayoutManager(this, 2);

        RecyclerView videosRecyclerView = findViewById(R.id.video_recycler_view);
        videosRecyclerView.setLayoutManager(mVideosLayoutManager);

        VideoRecyclerViewAdapter videoViewAdapter = new VideoRecyclerViewAdapter(this, videoList);
        videosRecyclerView.setAdapter(videoViewAdapter);
    }

    private List<Video> retrieveVideos() {
        List<Video> videos = new ArrayList<>();
        videos.add(new Video("Video 1", "04:30", R.mipmap.ic_lvideo));
        videos.add(new Video("Video 2", "02:45", R.mipmap.ic_lvideo));
        videos.add(new Video("Video 3", "05:25", R.mipmap.ic_lvideo));
        videos.add(new Video("Video 4", "04:45", R.mipmap.ic_lvideo));
        return videos;
    }
}
