package tk.infotech.courses.android.mobileapps.testbuildapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CourseChaptersActivity extends AppCompatActivity {

    private GridLayoutManager mChaptersLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_chapters);

        List<Chapter> chapterList = loadChaptersInformation();
        mChaptersLayoutManager = new GridLayoutManager(this, 3);

        RecyclerView chaptersRecyclerView = findViewById(R.id.recycler_view);
        chaptersRecyclerView.setLayoutManager(mChaptersLayoutManager);

        ChapterRecyclerViewAdapter chaptersAdapter = new ChapterRecyclerViewAdapter(this, chapterList);
        chaptersRecyclerView.setAdapter(chaptersAdapter);
    }

    private List<Chapter> loadChaptersInformation() {
        List<Chapter> chapterList = new ArrayList<>();
        chapterList.add(new Chapter("Chapitre 1", R.drawable.course_icon));
        chapterList.add(new Chapter("Chapitre 2", R.drawable.course_icon));
        chapterList.add(new Chapter("Chapitre 3", R.drawable.course_icon));
        chapterList.add(new Chapter("Chapitre 4", R.drawable.course_icon));
        chapterList.add(new Chapter("Chapitre 5", R.drawable.course_icon));
        chapterList.add(new Chapter("Chapitre 6", R.drawable.course_icon));
        chapterList.add(new Chapter("Chapitre 7", R.drawable.course_icon));

        return chapterList;
    }
}
