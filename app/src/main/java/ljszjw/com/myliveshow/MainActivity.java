package ljszjw.com.myliveshow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

public class MainActivity extends AppCompatActivity {

    protected TextView texte;
    protected JCVideoPlayerStandard videoplayer;
    protected RelativeLayout activityMain;
    String url = "http://v.youku.com/v_show/id_XMTQ4MDgyMjc5Mg==.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();

        videoplayer.setUp("http://2449.vod.myqcloud.com/2449_22ca37a6ea9011e5acaaf51d105342e3.f20.mp4"
                , JCVideoPlayerStandard.SCREEN_LAYOUT_LIST, "嫂子闭眼睛");
    }


    private void initView() {
        texte = (TextView) findViewById(R.id.texte);
        videoplayer = (JCVideoPlayerStandard) findViewById(R.id.videoplayer);
        activityMain = (RelativeLayout) findViewById(R.id.activity_main);
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
