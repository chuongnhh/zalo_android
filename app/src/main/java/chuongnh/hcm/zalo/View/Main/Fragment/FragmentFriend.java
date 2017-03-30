package chuongnh.hcm.zalo.View.Main.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import chuongnh.hcm.zalo.Model.ModelFriend;
import chuongnh.hcm.zalo.R;
import chuongnh.hcm.zalo.View.Main.Adapter.AdapterFriend;

/**
 * Created by Nguyen Hoang Chuong on 3/30/2017.
 */

public class FragmentFriend extends Fragment {

    private RecyclerView recyclerView;
    private AdapterFriend adapterFriend;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_friend, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycle_friend);

        List<ModelFriend> modelFriends = new ArrayList<>();
        ModelFriend modelFriend = new ModelFriend(
                "",
                "Nguyễn Hoàng Chương"
        );
        for (int i = 0; i < 100; i++) {
            modelFriends.add(modelFriend);
        }

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        adapterFriend = new AdapterFriend(getActivity(), modelFriends);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterFriend);
        adapterFriend.notifyDataSetChanged();

        return rootView;
    }

    // TODO: Rename and change types and number of parameters
    public static FragmentFriend newInstance() {
        return new FragmentFriend();
    }
}
