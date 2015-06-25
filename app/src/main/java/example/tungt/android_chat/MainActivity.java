package example.tungt.android_chat;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_scene_layout);

        final EditText inputName = (EditText)findViewById(R.id.name_input);
        Button btnJoin = (Button)findViewById(R.id.btn_join);
        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputName.getText().equals("")) return;
                else{
                    Intent in = new Intent(MainActivity.this, ChatActivity.class);
                    in.putExtra("name",inputName.getText());
                    startActivity(in);
                }
            }
        });

    }
}
