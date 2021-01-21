package com.mcxtzhang.flowlayoutmanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mcxtzhang.flowlayoutmanager.avatar.TanTanAvatarActivity;
import com.mcxtzhang.flowlayoutmanager.gallary.GalleryActivity;
import com.mcxtzhang.flowlayoutmanager.gallery.LoopGalleryActivity;
import com.mcxtzhang.flowlayoutmanager.swipecard.HorizonSwipeCardActivity;
import com.mcxtzhang.flowlayoutmanager.swipecard.SwipeCardActivity;
import com.mcxtzhang.flowlayoutmanager.tantan.TanTanActivity;
import com.mcxtzhang.flowlayoutmanager.zuimei.ScaleCardActivity;

import androidx.appcompat.app.AppCompatActivity;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        //流式布局
        findViewById(R.id.btnFlow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LauncherActivity.this, MainActivity.class));
            }
        });
        //人人影视订阅界面
        findViewById(R.id.btnSwipeCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LauncherActivity.this, SwipeCardActivity.class));
            }
        });
        //探探界面
        findViewById(R.id.btnKing).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LauncherActivity.this, TanTanActivity.class));
            }
        });
        //折叠画廊
        findViewById(R.id.btnGallery).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LauncherActivity.this, GalleryActivity.class));
            }
        });
        //首页卡片布局
        findViewById(R.id.btnZuimeiCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LauncherActivity.this, ScaleCardActivity.class));
            }
        });
        //探探选择头像框
        findViewById(R.id.btnTantanAvatar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LauncherActivity.this, TanTanAvatarActivity.class));
            }
        });
        //横向循环视差画廊
        findViewById(R.id.btnLoopGallery).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LauncherActivity.this, LoopGalleryActivity.class));
            }
        });
        //横向卡片操作
        findViewById(R.id.btnHorSwipeCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LauncherActivity.this, HorizonSwipeCardActivity.class));
            }
        });
    }
}
