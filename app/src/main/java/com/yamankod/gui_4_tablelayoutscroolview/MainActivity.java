package com.yamankod.gui_4_tablelayoutscroolview;

import android.R.color;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract.Colors;
import android.text.Layout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.TableLayout;
import android.widget.TableLayout.LayoutParams;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Button button;
    private TableLayout layout;
    private Integer count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.Button01);
        layout = (TableLayout) findViewById(R.id.TableLayout01);

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                TableRow row = new TableRow(getApplicationContext());

                TextView textView = new TextView(getApplicationContext());
                CheckBox box = new CheckBox(getApplicationContext());

                row.addView(textView);
                row.addView(box);

                count++;
                textView.setText("satir " + count);
                textView.setTextColor(Color.BLUE);
                box.setText("Tamam");

                layout.addView(row, new TableLayout.LayoutParams(
                        LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            }
        });
    }
}