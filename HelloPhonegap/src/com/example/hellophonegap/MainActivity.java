package com.example.hellophonegap;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends DroidGap{

	CordovaWebView cwv;
    @Override
	public void onCreate(Bundle savedInstanceState) {
    	super.setIntegerProperty("splashscreen", R.drawable.background);
        super.onCreate(savedInstanceState);
        super.init();
//        super.appView.getSettings().setJavaScriptEnabled(true);
//        super.appView.addJavascriptInterface(new JavascriptInterface(), "Android");
//        this.setIntegerProperty("loadUrlTimeoutValue", 50000);
//        super.setIntegerProperty("splashscreen", R.drawable.background);
        super.loadUrl("file:///android_asset/www/pageNavigation.html",10000);
    }
    
    public class JavascriptInterface {
    	@android.webkit.JavascriptInterface
    	public void sayHello() {
    		Toast.makeText(getApplicationContext(), "toast", Toast.LENGTH_LONG).show();
//    		loadUrl("javascript:alert('hello!');");
    	}
    }
}
