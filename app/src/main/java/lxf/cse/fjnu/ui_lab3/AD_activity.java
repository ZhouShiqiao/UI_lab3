package lxf.cse.fjnu.ui_lab3;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class AD_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_activity);
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        final View textEntryView = layoutInflater.inflate(R.layout.dialog,null);


        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(this);
        alertDialogBuilder.setView(textEntryView)
        .show();
    }
}
