package com.leinasharon.androidlistview.app;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {




    String [] OS =new String[]  {"Android", "Bada", "Symbian", "IOS", "Windows", "Blackberry"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find view by id
        final ListView listView = (ListView) findViewById(R.id.OperatingSystems);
        ListAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, OS);

        listView.setAdapter(listAdapter);


        //ListView Onclick to do some action
        //instantiating
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                //ListView Clicked item index
                int itemPosition = position;
                //listView clicked item value
                // Toast.makeText(MainActivity.this,OS Toast.LENGTH_LONG.show[]
                // ListView Clicked item index


                // ListView Clicked item value
                String itemValue = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_LONG)
                        .show();


            }
        });


    }
        




    }


