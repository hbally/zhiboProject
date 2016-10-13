package ljszjw.com.myliveshow;

/**
 * Created by Administrator on 2016/10/12.
 */

public class VideoBean {

    public VideoBean(String url,int headImage,String title){
        this.url = url;
        this.headImg = headImage;
        this.title = title;
    }

    private String url;
    private int headImg ;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getHeadImg() {
        return headImg;
    }

    public void setHeadImg(int headImg) {
        this.headImg = headImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;
}
