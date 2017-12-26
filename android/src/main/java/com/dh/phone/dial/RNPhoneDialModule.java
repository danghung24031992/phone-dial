
package com.dh.phone.dial;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;

public class RNPhoneDialModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNPhoneDialModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNPhoneDial";
  }
  @ReactMethod
  public void immediatePhoneCall(String number) {
      number = Uri.encode(number);
      String url = "tel:" + number;
      Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(url));
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      this.reactContext.startActivity(intent);
  }
}