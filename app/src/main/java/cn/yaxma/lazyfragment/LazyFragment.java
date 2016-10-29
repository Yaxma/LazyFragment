package cn.yaxma.lazyfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Yaxma on 2016/10/29.
 * Email：2678503498@qq.com
 */

public abstract class LazyFragment extends Fragment {

    private static final String TAG = "LazyFragment";

    private boolean isViewInit = false; // View是否加载完成
    private boolean isVisible = false; // Fragment是否可见
    private boolean isFirstLoad = true; // 是否第一次加载

    @Nullable @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        isViewInit = true;
        preLoadData();
        return view;
    }

    @Override public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        isVisible = isVisibleToUser;
        preLoadData();
    }

    private void preLoadData() {
        if (isViewInit && isVisible && isFirstLoad) {
            loadData();
            isFirstLoad = false;
        }
    }

    /**
     * Fragment布局ID
     */
    protected abstract int getLayoutId();

    /**
     * 数据处理
     */
    protected void loadData() {
    }

}
