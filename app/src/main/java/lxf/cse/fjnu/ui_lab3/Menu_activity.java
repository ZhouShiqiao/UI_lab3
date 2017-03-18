package lxf.cse.fjnu.ui_lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Menu_activity extends AppCompatActivity {

    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_activity);
        editText = (EditText) findViewById(R.id.edittext);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.normal:
                Toast.makeText(this,"你单击了普通菜单",Toast.LENGTH_LONG).show();
                break;
            case R.id.font_10:
                editText.setTextSize(10);
                break;
            case R.id.font_16:
                editText.setTextSize(16);
                break;
            case R.id.font_20:
                editText.setTextSize(20);
                break;
            case R.id.red:
                editText.setTextColor(0xffff3333);
                break;
            case R.id.black:
                editText.setTextColor(0xff000000);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
