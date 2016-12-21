package com.amazonaws.mobileconnectors.s3.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.util.Log;

/**
 * A Broadcast receiver to receive network connection change events.
 */
public class NetworkInfoReceiver extends BroadcastReceiver {

    private static final String TAG = "NetworkInfoReceiver";

    private final Handler handler;

    private final ConnectivityManager connectivityManager;

    private int checkFlag;

    private int disconnectFlag;

    /**
     * Constructs a NetworkInfoReceiver.
     * @param context Service context
     * @param handler a handle to send message to
     */
    public NetworkInfoReceiver(final Context context,
                               final Handler handler,
                               final int checkFlag, final int disconnectFlag) {
        this.connectivityManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        this.handler = handler;
        this.checkFlag = checkFlag;
        this.disconnectFlag = disconnectFlag;
    }

    @Override
    public void onReceive(final Context context, final Intent intent) {
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
            Type checkType = connectionCheckType;
            if (connectionCheckType == null) {
                checkType = DEFAULT_CONNECTION_CHECK_TYPE;
                Log.w(TAG, "Using default type: " + checkType.name());
            }
            boolean networkConnected = checkType.isConnected(connectivityManager);
            Log.d(TAG, "Network connected: " + networkConnected);
            handler.sendEmptyMessage(networkConnected ?
                    checkFlag : disconnectFlag);
        }
    }

    public static final Type DEFAULT_CONNECTION_CHECK_TYPE = Type.ANY;

    Type connectionCheckType = DEFAULT_CONNECTION_CHECK_TYPE;

    public void setConnectionCheckType(Type connectionCheckType) {
        this.connectionCheckType = connectionCheckType;
    }

    public boolean isNetworkConnected() {
        return connectionCheckType.isConnected(connectivityManager);
    }

    public enum Type {
        ANY("any") {
            @Override
            public boolean verify(final NetworkInfo info) {
                return info != null && info.isConnected();
            }
        },
        MOBILE_ONLY("mobile_only") {
            @Override
            public boolean verify(final NetworkInfo info) {
                return info != null && info.isConnected()
                        && info.getType() == ConnectivityManager.TYPE_MOBILE;
            }
        },
        WIFI_ONLY("wifi_only") {
            @Override
            public boolean verify(final NetworkInfo info) {
                return (info != null && info.isConnected()
                        && info.getType() == ConnectivityManager.TYPE_WIFI);
            }
        };

        private String intentKey;

        Type(String intentKey) {
            this.intentKey = intentKey;
        }

        /**
         * Gets the status of network connectivity.
         *
         * @return true if network is connected, false otherwise.
         */
        boolean isConnected(final ConnectivityManager connectivityManager) {
            return verify(connectivityManager.getActiveNetworkInfo());
        }

        protected abstract boolean verify(final NetworkInfo networkInfo);

        public static Type from(final String name) {
            if (name != null) {
                for (final Type type : values()) {
                    if (type.intentKey.toLowerCase().equals(name.toLowerCase())) {
                        return type;
                    }
                }
            }
            return null;
        }

        public static Type from(final String name, final Type defaultType) {
            Type type = from(name);
            if (type == null) {
                return defaultType;
            }
            return type;
        }
    }
}
