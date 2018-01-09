package tw.edu.nutc.a70x9n0td.restaurantreservesystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class rest_order_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_order__main);
        setTitle("餐廳訂位"); //變更活動標題為餐廳訂位
    }

    public void cvclick (View v) {
        Intent intent = new Intent();
        intent.setClass(rest_order_MainActivity.this ,rest01_reserve.class);
        startActivity(intent);
    }
}
