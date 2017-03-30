package chuongnh.hcm.zalo.View.Main.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import chuongnh.hcm.zalo.R;

/**
 * Created by Nguyen Hoang Chuong on 3/30/2017.
 */

public class FragmentSetting extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_setting, container, false);
        return rootView;
    }

    // TODO: Rename and change types and number of parameters
    public static FragmentSetting newInstance() {
        return new FragmentSetting();
    }
}
