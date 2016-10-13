package ljszjw.com.myliveshow.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;
import ljszjw.com.myliveshow.R;
import ljszjw.com.myliveshow.VideoBean;

/**
 * Created by Administrator on 2016/10/12.
 */

public class VideoRecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<VideoBean> mDatas;
    private Context context;
    private LayoutInflater mInflater;

    public VideoRecyclerViewAdapter(Context context, List<VideoBean> mDatas){
        this.mDatas = mDatas;
        this.context = context;
        mInflater = LayoutInflater.from(context);
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = mInflater.inflate(R.layout.item_video_view,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.videoPlayerStandard.setUp(mDatas.get(position).getUrl(), JCVideoPlayerStandard.SCREEN_LAYOUT_LIST,mDatas.get(position).getTitle());
//        holder.videoPlayerStandard.setUp("http://2449.vod.myqcloud.com/2449_22ca37a6ea9011e5acaaf51d105342e3.f20.mp4"
//                , JCVideoPlayerStandard.SCREEN_LAYOUT_LIST, "嫂子闭眼睛");
        holder.title.setText(mDatas.get(position).getTitle());
        holder.ivLogo.setImageResource(mDatas.get(position).getHeadImg());
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }
}
