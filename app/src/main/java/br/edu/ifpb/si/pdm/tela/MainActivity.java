package br.edu.ifpb.si.pdm.tela;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btn = (Button) findViewById(R.id.btn);
        this.btn.setOnClickListener(new OnClickBotao());
    }

    private class OnClickBotao implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            Intent it = new Intent(MainActivity.this, Tela1Activity.class);
            startActivity(it);
            

        }
    }


}
