package per.gehu.common.log;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created by huguoyin on 17/4/24.
 */
public class DALog {

    private static final String TAG = "DevelopAssistant_Log";

    /**
     * 是否打印日志
     */
    private static boolean mIsLogcat = true;

    public static boolean isLogcat(){
        return mIsLogcat;
    }

    public static void e(String msg) {
        if(mIsLogcat) {
            Log.e(TAG, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (mIsLogcat) {
            Log.e(tag, msg == null ? "" : msg);
        }
    }

    public static void w(String msg) {
        if (mIsLogcat) {
            Log.w(TAG, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (mIsLogcat) {
            Log.w(tag, msg == null ? "" : msg);
        }
    }

    public static void i(String msg) {
        if (mIsLogcat) {
            Log.i(TAG, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (mIsLogcat && !TextUtils.isEmpty(msg)) {
            Log.i(tag, msg);
        }
    }

    public static void d(String msg) {
        if (mIsLogcat && !TextUtils.isEmpty(msg)) {
            Log.d(TAG, msg);
        }
    }
    public static void d(String tag, String msg) {
        if (mIsLogcat) {
            Log.d(tag, msg+"");//msg为null时会报java.lang.NullPointerException: println needs a message
        }
    }
}
