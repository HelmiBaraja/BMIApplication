package helmi.branded.me.bmiapplication;

import android.util.Log;

/**
 * Created by HelmiHasan on 13/05/2016.
 */
public class LogicBMI {

    public float calculateBMI(int height, int weight)
    {
        float heightInMeter = (height / 100);
        Log.d("return","bmi="+(89 / (1.8*1.8)));
        return (weight / (heightInMeter*heightInMeter));
    }

    public Integer getImageIDBasedOnLanguage(boolean isBahasa)
    {
        if (isBahasa)
        {
           return R.drawable.table_bmi_bahasa;
        }
        else{
            return  R.drawable.table_bmi_english;
        }
    }

    public String getStringHeightOnLanguage(boolean isBahasa)
    {
        if(isBahasa)
        {
            return "Tinggi";
        }
        else{
            return "Height";
        }
    }

    public String getStringWeightOnLanguage(boolean isBahasa)
    {
        if (isBahasa)
        {
            return "Berat";
        }
        else
        {
            return "Weight";
        }
    }
}
