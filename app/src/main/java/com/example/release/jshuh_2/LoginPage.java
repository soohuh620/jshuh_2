package com.example.release.jshuh_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by release on 2017. 5. 26..
 */

public class LoginPage extends Activity {
    ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        imgView = (ImageView)findViewById(R.id.imageView);
        

        Button login_b = (Button)findViewById(R.id.button2);
        final EditText edit_t = (EditText)findViewById(R.id.editText2);

        login_b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent one = new Intent(getApplicationContext(),MainActivity.class);
                String ID = edit_t.getText().toString();
                one.putExtra("login_id", ID);
                startActivity(one);
            }

        });



    }
}
