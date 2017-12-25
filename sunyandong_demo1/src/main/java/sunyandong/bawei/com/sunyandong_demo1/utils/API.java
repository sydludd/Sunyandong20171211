package sunyandong.bawei.com.sunyandong_demo1.utils;

import retrofit2.http.GET;
import rx.Observable;
import sunyandong.bawei.com.sunyandong_demo1.Bean.Beanf;

/**
 * Created by 悻 on 2017/12/25.
 */

public interface API {
    @GET(URL.LAST_1)
    Observable<Beanf>  Bean();

}
