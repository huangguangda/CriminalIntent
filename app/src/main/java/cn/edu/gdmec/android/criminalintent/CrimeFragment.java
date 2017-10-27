package cn.edu.gdmec.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by Jack on 2017/10/27.
 */

public class CrimeFragment extends Fragment {
    private Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate ( savedInstanceState );
        mCrime = new Crime ();
    }

}
