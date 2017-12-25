package sunyandong.bawei.com.sunyandong_demo1.Model;

import okhttp3.OkHttpClient;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import sunyandong.bawei.com.sunyandong_demo1.Bean.Beanf;
import sunyandong.bawei.com.sunyandong_demo1.utils.API;
import sunyandong.bawei.com.sunyandong_demo1.utils.RetrofitUnitl;
import sunyandong.bawei.com.sunyandong_demo1.utils.URL;

/**
 * Created by 悻 on 2017/12/25.
 */

public class IModel {

    ScuMod scuMod;

    public void setScuMod(ScuMod scuMod) {
        this.scuMod = scuMod;
    }

    public void Zuoday(){
        OkHttpClient okHttpClient=new OkHttpClient.Builder()
                .build();

        RetrofitUnitl.getInstance(URL.FRISTA_1,okHttpClient)
                .setCreate(API.class)
                .Bean()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<Beanf>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Beanf beanf) {
                        scuMod.ZC(beanf);
                    }
                });

    }

    public interface ScuMod{
        void ZC(Beanf beanf);
    }
}
