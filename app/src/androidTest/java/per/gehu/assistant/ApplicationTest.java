package per.gehu.assistant;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.test.ApplicationTestCase;

import java.util.List;

import per.gehu.assistant.appinfo.AppModel;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testGetPackages(){

        List<PackageInfo> packages = AppModel.getInstalledPackages(getSystemContext());

        for (PackageInfo info : packages){
            System.out.println("gehu--hello:" + info.packageName);

        }
    }
}