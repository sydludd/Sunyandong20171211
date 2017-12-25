package sunyandong.bawei.com.sunyandong_demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import sunyandong.bawei.com.sunyandong_demo1.Adapter.Myadapter;
import sunyandong.bawei.com.sunyandong_demo1.Bean.Beanf;
import sunyandong.bawei.com.sunyandong_demo1.Persenter.IPersenter;
import sunyandong.bawei.com.sunyandong_demo1.View.IView;

public class MainActivity extends AppCompatActivity implements IView{

    private RecyclerView rec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IPersenter iPersenter=new IPersenter(this);
        iPersenter.Shard();
        init();
    }

    private void init() {
        rec = (RecyclerView) findViewById(R.id.rec);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        rec.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void onZuo(Beanf beanf) {
        rec.setAdapter(new Myadapter(beanf.getData(),MainActivity.this));

    }
}
