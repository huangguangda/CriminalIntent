package cn.edu.gdmec.android.criminalintent;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;

/**
 * Created by Jack on 2017/11/16.
 */

public class PictureUtils {
    //编写合理大的缩放方法
    public static Bitmap getScaledBitmap(String path, Activity activity){
        Point size = new Point (  );
        activity.getWindowManager ().getDefaultDisplay ()
                .getSize ( size );
        return getScaledBitmap ( path, size.x, size.y );
    }


    public static Bitmap getScaledBitmap(String path, int destWidth, int destHeight){
        BitmapFactory.Options options = new BitmapFactory.Options ();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile ( path, options );

        float srcWidth = options.outWidth;
        float srcHeight = options.outHeight;

        int inSmapleSize = 1;
        if (srcHeight > destHeight || srcWidth > destWidth){
            if (srcWidth > srcHeight){
                inSmapleSize = Math.round ( srcHeight / destHeight );
            }else {
                inSmapleSize = Math.round ( srcWidth / destWidth );
            }
        }
        options = new BitmapFactory.Options ();
        options.inSampleSize = inSmapleSize;

        return BitmapFactory.decodeFile ( path, options );
    }
}
