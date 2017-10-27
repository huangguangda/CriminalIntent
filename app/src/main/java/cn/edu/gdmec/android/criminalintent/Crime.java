package cn.edu.gdmec.android.criminalintent;

import java.util.UUID;

/**
 * Created by Jack on 2017/10/27.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID ();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle=title;
    }
}
