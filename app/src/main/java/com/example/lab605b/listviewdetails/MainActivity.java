package com.example.lab605b.listviewdetails;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import org.w3c.dom.Text;
import java.lang.reflect.Array;

public class MainActivity extends ListActivity {

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Storing string resources into Array
        String[] car_names = getResources().getStringArray(R.array.carNames);
        final String[] car_detail = getResources().getStringArray(R.array.carDetails);

        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item,R.id.label, car_names));


        // Calling getListView method from class ListActivity to create a listView
        ListView lv = getListView();

        // Listing to single list item on click
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Launching new Activity on selecting single List Item
                Intent i = new Intent(getApplicationContext(), carDetails.class);

                // Selected item
                String car = ((TextView) view).getText().toString();
                //int pos = (int) parent.getItemAtPosition(position);
                String detail = car_detail[position];

                //Sending data to new activity
                i.putExtra("CAR", car);
                i.putExtra("DETAIL", detail);
                startActivity(i);
            }
        });
    }
}
