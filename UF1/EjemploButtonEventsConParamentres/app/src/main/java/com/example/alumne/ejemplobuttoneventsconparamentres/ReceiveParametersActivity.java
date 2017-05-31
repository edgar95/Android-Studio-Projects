package com.example.alumne.ejemplobuttoneventsconparamentres;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by alumne on 10/11/16.
 */
public class ReceiveParametersActivity extends Activity {
    TextView textView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receive_form);

        Bundle bundle = this.getIntent().getExtras();
        StringBuilder s = new StringBuilder();

        if(bundle != null) {
            textView = (TextView) findViewById(R.id.textview);
            s.append("Checkbox: " + bundle.get("checkbox") + "\n");
            s.append("Checkbox state: " + bundle.get("cb") + "\n");
            s.append("Edittext: " + bundle.get("edittext") + "\n");
            s.append("Radio: " + bundle.get("radio") + "\n");
            textView.setText(s.toString());
        }

    }

}

