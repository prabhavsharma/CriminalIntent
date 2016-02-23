package com.prabhav.criminalintent.Controller;

import android.support.v4.app.Fragment;

import com.prabhav.criminalintent.Abstract.SingleFragmentActivity;

/**
 * Created by ps292 on 1/30/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    protected Fragment createFragment()
    {
        return new CrimeListFragment();
    }
}
