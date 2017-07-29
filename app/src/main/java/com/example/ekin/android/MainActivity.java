package com.example.ekin.android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ArrayList<String> ALissues; // ArrayList issuelar buraya konacak
    private ArrayAdapter<String> AAissues; //ArrayAdapter
    private ListView LWissues;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize edilen tüm issue taskları
        LWissues = (ListView) findViewById(R.id.LVIssues);
        ALissues = new ArrayList<String>(); //initialize ALissues
        AAissues = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ALissues);//initialize AAissues
        LWissues.setAdapter(AAissues);

    }

    public void addIssue(View v) {
        EditText newIssue = (EditText) findViewById(R.id.addNewIssue);
        AAissues.add(newIssue.getText().toString());
        newIssue.setText(null);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


}