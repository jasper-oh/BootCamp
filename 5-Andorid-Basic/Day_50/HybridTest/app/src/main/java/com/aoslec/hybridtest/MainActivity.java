package com.aoslec.hybridtest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    Button btn_hello, btn_image, btn_imagebig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.web_view);
        btn_hello = findViewById(R.id.btn_hello);
        btn_image = findViewById(R.id.btn_image);
        btn_imagebig = findViewById(R.id.btn_imagebig);


        btn_hello.setOnClickListener(onClickListener);
        btn_image.setOnClickListener(onClickListener);
        btn_imagebig.setOnClickListener(onClickListener);


        //web Setting start

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);



        // 내 생각에 지금은 이거 필요 없을듯
        webView.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);

            }


            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);


            }
        });


    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btn_hello:
                    btnHelloClick();
                    break;

                case R.id.btn_image:
                    btnImageClick();
                    break;


                case R.id.btn_imagebig:
                    btnImageBigClick();
                    break;
            }

        }
    };

    private void btnImageBigClick() {
//        webView.loadUrl("http://192.168.35.80:8080/test/exercise1.html");

        String htmlData = "<html>" + "<head>" + "<meta name = \"viewport\" content=\"width=divice-width, initial-scale=3.0\">" + "</head>" +
                "<body>" + "<img src="+"\"http://192.168.35.80:8080/test/me.jpg\""+ "height=\"400\" weight=\"500\">" + "</body>" + "</html>";

        webView.loadData(htmlData,"text/html","UTF-8");
    }


    public void btnHelloClick(){
        String htmlData = "<html>" + "<head>" + "<meta name = \"viewport\" content=\"width=divice-width, initial-scale=3.0\">" + "</head>" +
                "<body>" + "Hello World!" + "</body>" + "</html>";
        webView.loadData(htmlData,"text/html","UTF-8");
    }

    public void btnImageClick(){
        String htmlData = "<html>" + "<head>" + "<meta name = \"viewport\" content=\"width=divice-width, initial-scale=3.0\">" + "</head>" +
                "<body>" + "<img src="+"http://192.168.35.80:8080/test/me.jpg"+ ">" + "</body>" + "</html>";

        webView.loadData(htmlData,"text/html","UTF-8");

//        webView.loadUrl("http://192.168.35.80:8080/test/exercise.html");
    }

}