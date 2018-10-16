package com.huatec.layouttest_lesson4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private ImageButton button_home;
    private ImageButton button_category;
    private ImageButton button_cart;
    private ImageButton button_personal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_home = findViewById(R.id.tab_item_home);
        button_category =  findViewById(R.id.tab_item_category);
        button_cart = findViewById(R.id.tab_item_cart);
        button_personal = findViewById(R.id.tab_item_personal);

        //设置四个按钮默认的状态
        button_home.setImageResource(R.drawable.tab_item_home_normal);
        button_category.setImageResource(R.drawable.tab_item_category_focus);
        button_cart.setImageResource(R.drawable.tab_item_cart_focus);
        button_personal.setImageResource(R.drawable.tab_item_personal_focus);

        //监听四个按钮的点击情况
        button_home.setOnClickListener(this);
        button_category.setOnClickListener(this);
        button_cart.setOnClickListener(this);
        button_personal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id){
            case R.id.tab_item_home:
                button_home.setImageResource(R.drawable.tab_item_home_normal);
                button_category.setImageResource(R.drawable.tab_item_category_focus);
                button_cart.setImageResource(R.drawable.tab_item_cart_focus);
                button_personal.setImageResource(R.drawable.tab_item_personal_focus);
                break;
            case R.id.tab_item_category:
                button_category.setImageResource(R.drawable.tab_item_category_normal);
                button_home.setImageResource(R.drawable.tab_item_home_focus);
                button_cart.setImageResource(R.drawable.tab_item_cart_focus);
                button_personal.setImageResource(R.drawable.tab_item_personal_focus);
                break;
            case R.id.tab_item_cart:
                button_cart.setImageResource(R.drawable.tab_item_cart_normal);
                button_home.setImageResource(R.drawable.tab_item_home_focus);
                button_category.setImageResource(R.drawable.tab_item_category_focus);
                button_personal.setImageResource(R.drawable.tab_item_personal_focus);
                break;
            case R.id.tab_item_personal:
                button_personal.setImageResource(R.drawable.tab_item_personal_normal);
                button_home.setImageResource(R.drawable.tab_item_home_focus);
                button_category.setImageResource(R.drawable.tab_item_category_focus);
                button_cart.setImageResource(R.drawable.tab_item_cart_focus);
                break;
        }
    }
}
