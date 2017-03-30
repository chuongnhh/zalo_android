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

import chuongnh.hcm.zalo.Model.ModelTimeline;
import chuongnh.hcm.zalo.R;
import chuongnh.hcm.zalo.View.Main.Adapter.AdapterTimeline;

/**
 * Created by Nguyen Hoang Chuong on 3/30/2017.
 */

public class FragmentTimeline extends Fragment {

    private RecyclerView recyclerView;
    private AdapterTimeline adapterTimeline;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_timeline, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycle_timeline);
        List<ModelTimeline> modelWhereList = new ArrayList<>();
        ModelTimeline modelTimeline = new ModelTimeline(
                "Nguyễn Hoàng Chương",
                "",
                "2 giờ trước",
                "Chúng ta vẫn biết rằng, làm việc với một đoạn văn bản dễ đọc và rõ nghĩa dễ gây rối trí và cản trở việc tập trung vào yếu tố trình bày văn bản."
        );
        for (int i = 0; i < 100; i++) {
            modelWhereList.add(modelTimeline);
        }

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        adapterTimeline = new AdapterTimeline(getActivity(), modelWhereList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterTimeline);
        adapterTimeline.notifyDataSetChanged();

        return rootView;
    }

    // TODO: Rename and change types and number of parameters
    public static FragmentTimeline newInstance() {
        return new FragmentTimeline();
    }
}
