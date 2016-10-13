package ljszjw.com.myliveshow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import ljszjw.com.myliveshow.adapter.VideoRecyclerViewAdapter;

public class MainActivity extends AppCompatActivity {

    /*protected TextView texte;
    protected JCVideoPlayerStandard videoplayer;
    protected RelativeLayout activityMain;
    String url = "http://v.youku.com/v_show/id_XMTQ4MDgyMjc5Mg==.html";
*/

    private RecyclerView mRadioRecyclerView;
    private List<VideoBean> mList;
    private VideoRecyclerViewAdapter mVideoRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initDatas();
        
        initView();
        
//        videoplayer.setUp("http://2449.vod.myqcloud.com/2449_22ca37a6ea9011e5acaaf51d105342e3.f20.mp4"
//                , JCVideoPlayerStandard.SCREEN_LAYOUT_LIST, "嫂子闭眼睛");

    }

    private void initDatas() {
        mList = new ArrayList<VideoBean>();
        for(int i = 0;i<10;i++){
            mList.add(new VideoBean("http://2449.vod.myqcloud.com/2449_22ca37a6ea9011e5acaaf51d105342e3.f20.mp4",R.mipmap.ic_launcher,"嫂子闭眼睛"+i));
        }
    }


    private void initView() {
//        texte = (TextView) findViewById(R.id.texte);
//        videoplayer = (JCVideoPlayerStandard) findViewById(R.id.videoplayer);
//        activityMain = (RelativeLayout) findViewById(R.id.activity_main);
        mRadioRecyclerView = (RecyclerView) findViewById(R.id.video_view);
        mVideoRecyclerViewAdapter = new VideoRecyclerViewAdapter(this,mList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRadioRecyclerView.setAdapter(mVideoRecyclerViewAdapter);
        mRadioRecyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void onBackPressed() {
        if (JCVideoPlayer.backPress()) {
            return;
        }
        super.onBackPressed();
    }
    @Override
    protected void onPause() {
        super.onPause();
        JCVideoPlayer.releaseAllVideos();
    }
}
