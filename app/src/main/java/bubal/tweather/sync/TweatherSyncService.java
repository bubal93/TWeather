package bubal.tweather.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class TweatherSyncService extends Service{

    private static final Object sSyncAdapterLock = new Object();
    private static TweatherSyncAdapter sTweatherSyncAdapter = null;

    @Override
    public void onCreate() {
        Log.d("SunshineSyncService", "onCreate - SunshineSyncService");
        synchronized (sSyncAdapterLock) {
            if (sTweatherSyncAdapter == null) {
                sTweatherSyncAdapter = new TweatherSyncAdapter(getApplicationContext(), true);
            }
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return sTweatherSyncAdapter.getSyncAdapterBinder();
    }
}
