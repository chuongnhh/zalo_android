package chuongnh.hcm.zalo.View.Main.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import chuongnh.hcm.zalo.Model.ModelFriend;
import chuongnh.hcm.zalo.R;

/**
 * Created by Nguyen Hoang Chuong on 3/30/2017.
 */

public class AdapterFriend extends RecyclerView.Adapter<AdapterFriend.ViewHolder> {

    private Context context;
    private List<ModelFriend> modelFriends;

    public AdapterFriend(Context context, List<ModelFriend> modelFriends) {
        this.context = context;
        this.modelFriends = modelFriends;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewUserName;

        private ImageView imageViewUserImage;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewUserName = (TextView) itemView.findViewById(R.id.textview_username);
        }
    }

    @Override
    public AdapterFriend.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.recycleview_friend, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AdapterFriend.ViewHolder holder, int position) {
        holder.textViewUserName.setText(modelFriends.get(position).getUserName());
    }

    @Override
    public int getItemCount() {
        return modelFriends.size();
    }
}
