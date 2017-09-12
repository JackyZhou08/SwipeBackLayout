package cn.jackychou.gesture;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * 从左侧边缘向右滑动可以关闭当前页面
 */
public class SecondActivity4 extends AppCompatActivity {

    private SlideBackLayout mSlideBackLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSlideBackLayout = new SlideBackLayout(this);
        mSlideBackLayout.bind();


    }


}
