package com.fitforever.fitprovider;

import android.app.Application;

import com.fitforever.fitprovider.BuildConfig;
import com.parse.Parse;

/**
 * Created by Sarvex on 9/15/2015.
 */
public class MainApplication extends Application {
  @Override
  public void onCreate() {
    Parse.enableLocalDatastore(this);

    Parse.initialize(this, BuildConfig.PARSE_APP_ID, BuildConfig.PARSE_CLIENT_KEY);
  }
}
