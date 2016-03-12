package com.notecardgame.isayyuhh.notecardgame.fragment_item;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.View;

import com.notecardgame.isayyuhh.notecardgame.activity.ActivityCallback;

/**
 * Created by isayyuhh on 2/17/16.
 */
public abstract class ItemFragment extends Fragment {

    /**
     * Fields
     */
    protected ActivityCallback ac;

    /**
     * On attach fragment to activity
     *
     * @param activity Activity to attach to
     */
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.ac = (ActivityCallback) activity;
    }

    /**
     * Sets on-click listener and adapter to listview
     *
     * @param view Inflated view
     */
    protected abstract void setItemView(View view);
}
