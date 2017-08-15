package app.qadheeb.fatimah.hijridatetime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.github.msarhan.ummalqura.calendar.UmmalquraCalendar;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView);

        UmmalquraCalendar uc = new UmmalquraCalendar();
              int year = uc.get(UmmalquraCalendar.YEAR);
              int month= uc.get(UmmalquraCalendar.MONTH);
              int day = uc.get(UmmalquraCalendar.DAY_OF_MONTH);
        try {
            textView.setText(day+"/"+(month+1)+"/"+year);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
