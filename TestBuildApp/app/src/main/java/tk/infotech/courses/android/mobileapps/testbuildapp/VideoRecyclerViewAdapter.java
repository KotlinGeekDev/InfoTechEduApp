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

public class VideoRecyclerViewAdapter extends RecyclerView.Adapter<VideoRecyclerViewAdapter.VideoViewHolder>{

    private Context mVideoViewContext;
    private List<Video> mVideos;
    private final LayoutInflater mLayoutInflater;

    public VideoRecyclerViewAdapter(Context videoViewContext, List<Video> mVideoList) {
        this.mVideoViewContext = videoViewContext;
        this.mVideos = mVideoList;
        mLayoutInflater = LayoutInflater.from(mVideoViewContext);
    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View courseVideoView = mLayoutInflater.inflate(R.layout.video_list_item, viewGroup, false);
        return new VideoViewHolder(courseVideoView);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder videoViewHolder, int position) {
        Video video = mVideos.get(position);
        videoViewHolder.imageThumbNail.setImageResource(video.getVideoThumbNailId());
        videoViewHolder.videoName.setText(video.getVideoName());
        videoViewHolder.videoDurationView.setText(video.getDuration());
    }

    @Override
    public int getItemCount() {
        return mVideos.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageThumbNail;
        TextView videoName;
        TextView videoDurationView;

        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            imageThumbNail = itemView.findViewById(R.id.video_image);
            videoName = itemView.findViewById(R.id.videoTitle);
            videoDurationView = itemView.findViewById(R.id.videoDuration);

        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "La video " + (getPosition()+1) + "est de " + videoDurationView.getText(), Toast.LENGTH_SHORT)
                    .show();
        }
    }
}
