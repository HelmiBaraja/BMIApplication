package helmi.branded.me.bmiapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private boolean isSelectedAsBahasaLanguage = false;
    private LogicBMI logicBMI;
    EditText heightEditText;
    EditText weightEditText ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         heightEditText = (EditText) findViewById(R.id.ETHeight);
         weightEditText = (EditText) findViewById(R.id.ETWeight);

        logicBMI = new LogicBMI();
    }

    public void languageButton(View view)
    {
        int tag = Integer.parseInt(view.getTag().toString());

        if (tag ==1)
        {
            //english
            isSelectedAsBahasaLanguage= false;
        }
        else{
            isSelectedAsBahasaLanguage = true;
        }

        changeImageBMITable();
        changeEditTextLanguage();
    }

    private void changeEditTextLanguage() {

        heightEditText.setHint(logicBMI.getStringHeightOnLanguage(isSelectedAsBahasaLanguage));
        weightEditText.setHint(logicBMI.getStringWeightOnLanguage(isSelectedAsBahasaLanguage));
    }

    private void changeImageBMITable() {
        ImageView imageView = (ImageView) findViewById(R.id.IVTableBMI);

        imageView.setImageResource(
                logicBMI.getImageIDBasedOnLanguage(
                        isSelectedAsBahasaLanguage));


    }

    public void submitButton(View view)
    {
        int height = Integer.parseInt(heightEditText.getText().toString());
        int weight = Integer.parseInt(weightEditText.getText().toString());

        Log.d("height=","he="+height);
        Log.d("weight","we="+weight);

        TextView textView = (TextView) findViewById(R.id.TVBMIResult);

        textView.setText(logicBMI.calculateBMI(height,weight)+"");
    }

}
