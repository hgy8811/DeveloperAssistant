package per.gehu.assistant.appinfo;

import android.content.Intent;
import android.graphics.drawable.Drawable;

//Model类 ，用来存储应用程序信息
public class AppInfo {

	private String appName;
	private Drawable appIcon ;  //应用程序图像
	private String pkgName ;    //应用程序所对应的包名
	private int versionCode;
	private String versionName;
	private int installLocation;
	private Intent intent ;     //启动应用程序的Intent ，一般是Action为Main和Category为Lancher的Activity

	public AppInfo(){}

	public int getInstallLocation() {
		return installLocation;
	}

	public void setInstallLocation(int installLocation) {
		this.installLocation = installLocation;
	}

	public int getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(int versionCode) {
		this.versionCode = versionCode;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Drawable getAppIcon() {
		return appIcon;
	}
	public void setAppIcon(Drawable appIcon) {
		this.appIcon = appIcon;
	}
	public Intent getIntent() {
		return intent;
	}
	public void setIntent(Intent intent) {
		this.intent = intent;
	}
	public String getPkgName(){
		return pkgName ;
	}
	public void setPkgName(String pkgName){
		this.pkgName=pkgName ;
	}
}
