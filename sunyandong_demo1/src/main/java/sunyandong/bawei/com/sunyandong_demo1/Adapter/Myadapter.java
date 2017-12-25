package sunyandong.bawei.com.sunyandong_demo1.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import sunyandong.bawei.com.sunyandong_demo1.Bean.Beanf;
import sunyandong.bawei.com.sunyandong_demo1.R;

/**
 * Created by 悻 on 2017/12/25.
 */

public class Myadapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<Beanf.DataBean> list=new ArrayList<>();
    private Context context;

    public Myadapter(List<Beanf.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflat= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new sViewHodler(inflat);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        sViewHodler sViewHodler= (Myadapter.sViewHodler) holder;
        sViewHodler.tv1.setText(list.get(position).getName());

    }


    @Override
    public int getItemCount() {
        return list.size();
    }
    private class sViewHodler extends RecyclerView.ViewHolder{

        private TextView tv1;
        public sViewHodler(View itemView) {
            super(itemView);
            tv1=itemView.findViewById(R.id.tv1);
        }
    }
}
