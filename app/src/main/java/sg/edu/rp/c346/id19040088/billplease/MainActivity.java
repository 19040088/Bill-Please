package sg.edu.rp.c346.id19040088.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Declare variables
   EditText amount;
   EditText numPax;
   ToggleButton svs;
   ToggleButton gst;
   TextView tbill;
   TextView ebill;
   Button split;
   Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = findViewById(R.id.AmtInput);
        numPax = findViewById(R.id.PaxInput);
        tbill = findViewById(R.id.totalBill);
        ebill = findViewById(R.id.eachPay);
        svs = findViewById(R.id.svs);
        gst = findViewById(R.id.gst);
        split = findViewById(R.id.split);
        reset = findViewById(R.id.reset);
        




    }
}
