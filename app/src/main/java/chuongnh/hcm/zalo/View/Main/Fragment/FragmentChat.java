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

import chuongnh.hcm.zalo.Model.ModelChat;
import chuongnh.hcm.zalo.R;
import chuongnh.hcm.zalo.View.Main.Adapter.AdapterChat;

/**
 * Created by Nguyen Hoang Chuong on 3/30/2017.
 */

public class FragmentChat extends Fragment {
    private RecyclerView recyclerView;
    private AdapterChat adapterChat;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_chat, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycle_chat);

        List<ModelChat> modelChats = new ArrayList<>();
        ModelChat modelChat = new ModelChat(
                "",
                "Nguyễn Hoàng Chương",
                "Anh biết rồi nè",
                "5 giờ"
        );
        for (int i = 0; i < 100; i++) {
            modelChats.add(modelChat);
        }

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        adapterChat = new AdapterChat(getActivity(), modelChats);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterChat);
        adapterChat.notifyDataSetChanged();

        return rootView;
    }

    // TODO: Rename and change types and number of parameters
    public static FragmentChat newInstance() {
        return new FragmentChat();
    }
}
