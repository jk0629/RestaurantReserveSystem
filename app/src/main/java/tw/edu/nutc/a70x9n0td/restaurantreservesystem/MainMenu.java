package tw.edu.nutc.a70x9n0td.restaurantreservesystem; //主畫面

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        setTitle("餐廳訂位系統"); //變更活動標題為餐廳訂位系統
    }
}
