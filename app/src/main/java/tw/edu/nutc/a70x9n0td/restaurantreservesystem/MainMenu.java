package tw.edu.nutc.a70x9n0td.restaurantreservesystem; //主畫面

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        setTitle("餐廳訂位系統"); //變更活動標題為餐廳訂位系統
    }

    public void cvclick (View v) {
        Intent intent = new Intent();
        intent.setClass(MainMenu.this ,add_rest_MainActivity.class);
        startActivity(intent);
    }

    public void cvclick2 (View v) {
        Intent intent = new Intent();
        intent.setClass(MainMenu.this ,edit_rest_MainActivity.class);
        startActivity(intent);
    }

    public void cvclick3 (View v) {
        Intent intent = new Intent();
        intent.setClass(MainMenu.this ,rest_order_MainActivity.class);
        startActivity(intent);
    }

    public void cvclick4(View v) {
        Intent intent = new Intent();
        intent.setClass(MainMenu.this ,rest01_reserve.class);
        startActivity(intent);
    }
}

