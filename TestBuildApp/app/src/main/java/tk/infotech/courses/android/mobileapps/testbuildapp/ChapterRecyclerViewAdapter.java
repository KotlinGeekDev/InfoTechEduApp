package tk.infotech.courses.android.mobileapps.testbuildapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import tk.infotech.courses.android.mobileapps.testbuildapp.models.Chapter;

public class ChapterRecyclerViewAdapter extends RecyclerView.Adapter<ChapterRecyclerViewAdapter.ChapterViewHolder>{

    private Context mContext;
    private List<Chapter> mChapters;
    private final LayoutInflater mLayoutInflater;

    public ChapterRecyclerViewAdapter(Context viewContext, List<Chapter> chapterList){
        this.mContext = viewContext;
        this.mChapters = chapterList;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public ChapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View chapterView = mLayoutInflater.inflate(R.layout.chapter_list_item, viewGroup, false);
        return new ChapterViewHolder(chapterView);
    }

    @Override
    public void onBindViewHolder(@NonNull ChapterViewHolder chapterHolder, int position) {
        chapterHolder.chapterName.setText(mChapters.get(position).getChapterName());
        chapterHolder.chapterImage.setImageResource(mChapters.get(position).getImageId());
    }

    @Override
    public int getItemCount() {
        return mChapters.size();
    }

    public class ChapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView chapterImage;
        TextView chapterName;

        public ChapterViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            chapterImage = itemView.findViewById(R.id.video_image);
            chapterName = itemView.findViewById(R.id.chapterName);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(mContext, "Vous avez choisi chapitre " + (getPosition()+1), Toast.LENGTH_SHORT)
                    .show();
        }
    }
}
