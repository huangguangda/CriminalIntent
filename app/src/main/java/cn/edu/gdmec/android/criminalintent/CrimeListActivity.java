package cn.edu.gdmec.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Jack on 2017/10/28.
 */

public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment ();
    }

}
