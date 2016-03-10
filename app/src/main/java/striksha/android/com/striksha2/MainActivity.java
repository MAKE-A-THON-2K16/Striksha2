package striksha.android.com.striksha2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

//import striksha2.android.com.striksha2.Activity2;

public class MainActivity extends AppCompatActivity {

    private TextView textView1,textView2;
    private SeekBar seekbar;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        seekbar = (SeekBar)findViewById(R.id.seekBar);
        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        button = (Button)findViewById(R.id.button1);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(progress==1)
                {
                    textView2.setText("You have Selected first category, 0-11 Years");
                }
                else
                if(progress==2)
                {
                    textView2.setText("You have Selected second category, 12-21 Years");
                }
                else
                if(progress==3)
                {
                    textView2.setText("You have Selected third category, 22-45 Years");
                }
                else
                if(progress==4)
                {
                    textView2.setText("You have Selected fourth category, 45 & above Years");
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(seekbar.getProgress()==1) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(i);
                }
                else
                if(seekbar.getProgress()==2) {
                    Intent i = new Intent(MainActivity.this,Activity3.class);
                    startActivity(i);
                }
                else
                if(seekbar.getProgress()==3) {
                    Intent i = new Intent(MainActivity.this,Activity4.class);
                    startActivity(i);
                }
                else
                if(seekbar.getProgress()==4) {
                    Intent i = new Intent(MainActivity.this,Activity5.class);
                    startActivity(i);
                }
                }

        });


       }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
