package per.gehu.assistant.utils;

import android.content.Context;
import android.content.Intent;

import per.gehu.assistant.appinfo.BrowseAppMainActivity;

/**
 * 首页导航跳转
 * Created by huguoyin on 17/4/21.
 */
public class NavigationJumpUtils {

    public static void startAppListUI(Context context){
        Intent intent = new Intent(context, BrowseAppMainActivity.class);
        context.startActivity(intent);
    }
}
