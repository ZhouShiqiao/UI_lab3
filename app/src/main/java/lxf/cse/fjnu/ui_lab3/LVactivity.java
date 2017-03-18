package lxf.cse.fjnu.ui_lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LVactivity extends AppCompatActivity {


    private ListView listView;
    private SimpleAdapter simpleAdapter;

    private List<Map<String,Object>> data = new ArrayList<Map<String, Object>>();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvactivity);
        final String s[] = {"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
        int id[] = {R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,R.drawable.cat,R.drawable.elephant};
        for(int i=0; i<s.length; i++) {
            Map<String,Object> item = new HashMap<String, Object>();
            item.put("text",s[i]);
            item.put("pic",id[i]);
            data.add(item);
        }

        listView = (ListView) findViewById(R.id.listview);
        simpleAdapter = new SimpleAdapter(this, data, R.layout.item,new String[] {"text","pic"},
                new int[] {R.id.text,R.id.img});
        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(LVactivity.this,s[position],Toast.LENGTH_LONG).show();

            }
        });





    }

}
