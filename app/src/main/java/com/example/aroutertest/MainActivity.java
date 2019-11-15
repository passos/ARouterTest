package com.example.aroutertest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ARouter.init(getApplication());

    findViewById(R.id.hello).setOnClickListener(v -> {
      ARouter.getInstance().build("/test/activity").navigation();
    });
  }
}
