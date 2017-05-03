package per.gehu.assistant.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by huguoyin on 17/4/24.
 */
public class DAApplication extends Application{

    public static Context mContext;

    @Override
    protected void attachBaseContext(Context base) {

        mContext = this;
        super.attachBaseContext(base);
    }

    public static Context getContext(){
        return mContext;
    }
}
