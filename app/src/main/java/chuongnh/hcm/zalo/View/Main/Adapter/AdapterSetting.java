package chuongnh.hcm.zalo.View.Main.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import chuongnh.hcm.zalo.Model.ModelTimeline;
import chuongnh.hcm.zalo.R;

/**
 * Created by Nguyen Hoang Chuong on 3/30/2017.
 */

public class AdapterSetting extends RecyclerView.Adapter<AdapterSetting.ViewHolder> {

    private Context context;
    private List<ModelTimeline> modelTimelines;

    public AdapterSetting(Context context, List<ModelTimeline> modelTimelines) {
        this.context = context;
        this.modelTimelines = modelTimelines;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewUserName;
        private TextView textViewPostTime;
        private TextView textViewPostContent;

        private ImageView imageViewUserImage;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewUserName = (TextView) itemView.findViewById(R.id.textview_username);
            textViewPostTime = (TextView) itemView.findViewById(R.id.textview_posttime);
            textViewPostContent = (TextView) itemView.findViewById(R.id.textview_postcontent);
        }
    }

    @Override
    public AdapterSetting.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.recycleview_timeline, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AdapterSetting.ViewHolder holder, int position) {
        holder.textViewUserName.setText(modelTimelines.get(position).getUsername());
        holder.textViewPostTime.setText(modelTimelines.get(position).getPostTime());
        holder.textViewPostContent.setText(modelTimelines.get(position).getPostContent());
    }

    @Override
    public int getItemCount() {
        return modelTimelines.size();
    }
}
