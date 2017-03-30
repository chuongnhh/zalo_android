package chuongnh.hcm.zalo.View.Main.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import chuongnh.hcm.zalo.Model.ModelChat;
import chuongnh.hcm.zalo.Model.ModelTimeline;
import chuongnh.hcm.zalo.R;

/**
 * Created by Nguyen Hoang Chuong on 3/30/2017.
 */

public class AdapterChat extends RecyclerView.Adapter<AdapterChat.ViewHolder> {

    private Context context;
    private List<ModelChat> modelChats;

    public AdapterChat(Context context, List<ModelChat> modelChats) {
        this.context = context;
        this.modelChats = modelChats;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewUserName;
        private TextView textViewLastMessageTime;
        private TextView textViewLastMessageContent;

        private ImageView imageViewUserImage;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewUserName = (TextView) itemView.findViewById(R.id.textview_username);
            textViewLastMessageTime = (TextView) itemView.findViewById(R.id.textview_lastmessagetime);
            textViewLastMessageContent = (TextView) itemView.findViewById(R.id.textview_lastmessagecontent);
        }
    }

    @Override
    public AdapterChat.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.recycleview_chat, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AdapterChat.ViewHolder holder, int position) {
        holder.textViewUserName.setText(modelChats.get(position).getUserName());
        holder.textViewLastMessageTime.setText(modelChats.get(position).getLastMessageTime());
        holder.textViewLastMessageContent.setText(modelChats.get(position).getLastMessageContent());
    }

    @Override
    public int getItemCount() {
        return modelChats.size();
    }
}
