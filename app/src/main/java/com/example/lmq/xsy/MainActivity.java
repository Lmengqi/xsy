package com.example.lmq.xsy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private final static String NAME ="name";
private final static String CLASS ="class";
private final static String NO ="no";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names ={"卢梦琪","刘天心","徐慧"};
        String[] classes ={"计科1506","软工1503","计科1505"};
        String[] nos = {"2015011425","2015011424","2015011329"};

      List<Map<String,Object>> items = new ArrayList<Map<String,Object>>();
      for(int i=0;i<names.length;i++){
          Map<String,Object> item = new HashMap<String,Object>();
          item.put(NAME,names[i]);
          item.put(CLASS,classes[i]);
          item.put(NO,nos[i]);
          items.add(item);
      }
        SimpleAdapter adapter = new SimpleAdapter(this,items,R.layout.item,new String[]{NAME,CLASS,NO},new int[]{R.id.txtName,R.id.txtClass,R.id.txtNo});
        ListView list=(ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
    }

}