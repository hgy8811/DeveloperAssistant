package per.gehu.assistant;


import android.content.Context;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;
import per.gehu.assistant.app.DAApplication;
import per.gehu.assistant.appinfo.AppModel;
import per.gehu.common.log.DALog;

/**
 * Created by huguoyin on 17/4/24.
 */
public class TestManager {

    private Context mContext;

    public TestManager() {
        mContext = DAApplication.getContext();
    }

    public void onCreate(){

    }

    public void onResume(){

        Observable.create(new ObservableOnSubscribe<Object>() {
            @Override
            public void subscribe(ObservableEmitter<Object> e) throws Exception {
                AppModel.getInstalledPackages(mContext);
                DALog.e("++++++++++++++++++++++++++++++++++");
                AppModel.getInstalledApplications(mContext);
            }
        }).subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
                .subscribe();

//        Observable.create(new Observable.OnSubscribe<Object>(){
//
//        })
    }

    public void onDestory(){

    }
}
