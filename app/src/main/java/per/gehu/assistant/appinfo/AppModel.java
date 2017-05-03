package per.gehu.assistant.appinfo;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import per.gehu.common.log.DALog;

/**
 * Created by huguoyin on 17/4/24.
 */
public class AppModel {

    public static List<AppInfo>  getInstalledPackages(Context context){
        ArrayList<AppInfo> appList = new ArrayList<AppInfo>();
        PackageManager packageManager = context.getPackageManager();
        if(packageManager == null){
            return appList;
        }

        AppInfo appInfo;
        List<PackageInfo> packages = packageManager.getInstalledPackages(0);

        for(PackageInfo packageInfo : packages){
            DALog.i("getInstalledPackages " + packageInfo.toString());
            appInfo = new AppInfo();
            appInfo.setAppName(packageInfo.applicationInfo.loadLabel(packageManager).toString());
            appInfo.setPkgName(packageInfo.packageName);
            appInfo.setVersionName(packageInfo.versionName);
            appInfo.setVersionCode(packageInfo.versionCode);
            appInfo.setAppIcon(packageInfo.applicationInfo.loadIcon(packageManager));
            appInfo.setInstallLocation(packageInfo.installLocation);
            appList.add(appInfo);
        }

        return appList;
    }


    public static List<AppInfo>  getInstalledApplications(Context context){
        ArrayList<AppInfo> appList = new ArrayList<AppInfo>();
        PackageManager packageManager = context.getPackageManager();
        if(packageManager == null){
            return appList;
        }

        AppInfo appInfo;
        // 查询已经安装的应用程序
        List<ApplicationInfo> applicationInfos = packageManager
                         .getInstalledApplications(PackageManager.GET_UNINSTALLED_PACKAGES);

        // 排序
        Collections.sort(applicationInfos, new ApplicationInfo.DisplayNameComparator(packageManager));

        for(ApplicationInfo applicationInfo : applicationInfos){
            DALog.i("getInstalledApplications " + applicationInfo.toString());

            appInfo = new AppInfo();
            appInfo.setAppName(applicationInfo.loadLabel(packageManager).toString());
            appInfo.setPkgName(applicationInfo.packageName);
            appInfo.setAppIcon(applicationInfo.loadIcon(packageManager));

            appList.add(appInfo);
        }

        return appList;
    }

}
