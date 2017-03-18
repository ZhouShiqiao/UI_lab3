package lxf.cse.fjnu.ui_lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v) {

        Intent intent = new Intent(this,LVactivity.class);
        startActivity(intent);
    }
    public void click2(View v) {

        Intent intent = new Intent(this,AD_activity.class);
        startActivity(intent);
    }
    public void click3(View v) {

        Intent intent = new Intent(this,Menu_activity.class);
        startActivity(intent);
    }
    public void click4(View v) {

        Intent intent = new Intent(this,CM_activity.class);
        startActivity(intent);
    }
}
