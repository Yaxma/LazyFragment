package cn.yaxma.lazyfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Yaxma on 2016/10/29.
 * Email：2678503498@qq.com
 */
public class FirstFragment extends LazyFragment {

    private static final String TAG = "LazyFragment";

    @Nullable @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "FirstFragment onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override protected int getLayoutId() {
        return R.layout.fragment_first;
    }

    @Override protected void loadData() {
        super.loadData();
        Log.d(TAG, "FirstFragment loadData");
    }
}
