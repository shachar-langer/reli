package reli.reliapp.co.il.reli.createReli;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;

import reli.reliapp.co.il.reli.R;


public class TabsPagerAdapter extends FragmentPagerAdapter {

    private final Context ctx;

    /* ========================================================================== */

    public TabsPagerAdapter(Context ctx, FragmentManager fm) {
        super(fm);
        this.ctx = ctx;
    }

    /* ========================================================================== */

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CreateDiscussionFragment();
            case 1:
                return new CreatePollFragment();
        }
        return null;
    }

    /* ========================================================================== */

    @Override
    public int getCount() {
        return 2;
    }

    /* ========================================================================== */

    @Override
    public String getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return ctx.getString(R.string.discussion_title).toUpperCase(l);
            case 1:
                return ctx.getString(R.string.poll_title).toUpperCase(l);
        }

        return null;
    }
}

