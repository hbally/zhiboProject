package ljszjw.com.myliveshow.adapter;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;
import ljszjw.com.myliveshow.R;

/**
 * Created by Administrator on 2016/10/12.
 */

public class MyViewHolder extends RecyclerView.ViewHolder{


    public JCVideoPlayerStandard videoPlayerStandard;
    public ImageView ivLogo;
    public TextView title;

    public MyViewHolder(View itemView) {
        super(itemView);

        videoPlayerStandard = (JCVideoPlayerStandard) itemView.findViewById(R.id.video_player);
        ivLogo = (ImageView) itemView.findViewById(R.id.iv_logo);
        title = (TextView) itemView.findViewById(R.id.tv_from);
    }
}
