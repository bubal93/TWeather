package bubal.tweather.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class TweatherAuthenticatorService extends Service {
    // Instance field that stores the authenticator object
    private TweatherAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        // Create a new authenticator object
        mAuthenticator = new TweatherAuthenticator(this);
    }

    /*
     * When the system binds to this Service to make the RPC call
     * return the authenticator's IBinder.
     */
    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}