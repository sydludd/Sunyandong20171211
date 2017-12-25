package sunyandong.bawei.com.sunyandong_demo1.Persenter;

import sunyandong.bawei.com.sunyandong_demo1.Bean.Beanf;
import sunyandong.bawei.com.sunyandong_demo1.Model.IModel;
import sunyandong.bawei.com.sunyandong_demo1.View.IView;

/**
 * Created by 悻 on 2017/12/25.
 */

public class IPersenter implements IModel.ScuMod{
    IModel iModel;
    IView iView;

    public IPersenter(IView iView) {
        this.iView = iView;
        iModel=new IModel();
        iModel.setScuMod(this);

    }

    @Override
    public void ZC(Beanf beanf) {
        iView.onZuo(beanf);

    }

    public  void Shard(){

        iModel.Zuoday();
    }
}
