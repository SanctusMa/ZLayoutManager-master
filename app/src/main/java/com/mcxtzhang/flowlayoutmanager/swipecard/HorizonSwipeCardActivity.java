package com.mcxtzhang.flowlayoutmanager.swipecard;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import com.mcxtzhang.commonadapter.rv.CommonAdapter;
import com.mcxtzhang.commonadapter.rv.ViewHolder;
import com.mcxtzhang.flowlayoutmanager.R;

import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

public class HorizonSwipeCardActivity extends AppCompatActivity {
    RecyclerView mRv;
    CommonAdapter<SwipeCardBean> mAdapter;
    List<SwipeCardBean> mDatas;
    int[] colors = new int[]{Color.parseColor("#27a1e5"), Color.parseColor("#f25a2b"), Color.parseColor("#999999")};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hor_layout);
        mRv = findViewById(R.id.hor_rv);
        mRv.setLayoutManager(new HorCardLayoutManager());
        mRv.setAdapter(mAdapter = new CommonAdapter<SwipeCardBean>(this, mDatas = SwipeCardBean.initDatas(), R.layout.hor_item_img) {
            public static final String TAG = "zxt/Adapter";

            @Override
            public void convert(ViewHolder viewHolder, SwipeCardBean swipeCardBean) {
                Log.d(TAG, "convert() called with: viewHolder = [" + viewHolder + "], swipeCardBean = [" + swipeCardBean + "]");
//                viewHolder.setText(R.id.tvName, swipeCardBean.getName());
//                viewHolder.setText(R.id.tvPrecent, swipeCardBean.getPostition() + " /" + mDatas.size());
//                Picasso.with(HorizonSwipeCardActivity.this).load(swipeCardBean.getUrl()).into((ImageView) viewHolder.getView(R.id.hor_iv));
                viewHolder.setText(R.id.hor_iv, swipeCardBean.getName() + "-" + swipeCardBean.getPostition());
                viewHolder.setBackgroundColor(R.id.hor_iv, colors[swipeCardBean.getPostition() % colors.length]);
            }
        });

//        初始化配置
        HorConfig.initConfig(this);
        ItemTouchHelper.Callback callback = new HorCallback(mRv, mAdapter, mDatas);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(callback);
        itemTouchHelper.attachToRecyclerView(mRv);

//        findViewById(R.id.btnRefresh).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mDatas.add(new SwipeCardBean(100, "http://news.k618.cn/tech/201604/W020160407281077548026.jpg", "增加的"));
//                mAdapter.notifyDataSetChanged();
//            }
//        });
    }
}
