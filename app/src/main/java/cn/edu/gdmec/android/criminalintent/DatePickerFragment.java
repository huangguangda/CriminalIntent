package cn.edu.gdmec.android.criminalintent;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

/**
 * Created by Jack on 2017/11/9.
 */

public class DatePickerFragment extends DialogFragment{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        return new AlertDialog.Builder ( getActivity () )
                .setTitle ( R.string.date_picker_title )
                .setPositiveButton ( android.R.string.ok, null )
                .create ();
    }
}
