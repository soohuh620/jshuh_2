package com.example.release.jshuh_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainchat);
        Intent newIntent = new Intent(this.getIntent());

        Button send_b = (Button)findViewById(R.id.button3);
        EditText chatting_msg = (EditText)findViewById(R.id.editText3);

        ListAdapter aaa = new ListAdapter();
        ListView listView = new ListView(this);

        listView.setAdapter(new ListAdapter(getApplicationContext()));
        String msg = chatting_msg.getText().toString();

    }
}
