package com.anders.threading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThreadsActivity extends AppCompatActivity {

    TextView textView;
    String a,b,c,d,e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threads);

        textView = (TextView) findViewById(R.id.text);
        a = "";
        b = "";
        c = "";
        d = "";
        e = "";

        Runnable runnableMaster = new Runnable() {
            @Override
            public void run() {

                SmallRunnable classA = new SmallRunnable();
                classA.run();
                SmallRunnable classB = new SmallRunnable();
                classB.run();
                SmallRunnable classC = new SmallRunnable();
                classC.run();
                SmallRunnable classD = new SmallRunnable();
                classD.run();
                SmallRunnable classE = new SmallRunnable();
                classE.run();

            }
        };
        runnableMaster.run();
        textView.setText(a + b + c + d + e);
    }

    public class SmallRunnable implements Runnable {
        @Override
        public void run() {
            if (a.equals("")) {
                a = "a";
            }
            else if (b.equals("")) {
                b = "b";
            }
            else if (c.equals("")) {
                c = "c";
            }
            else if (d.equals("")) {
                d = "d";
            }
            else if (e.equals("")) {
                e = "e";
            }
        }
    }
}
