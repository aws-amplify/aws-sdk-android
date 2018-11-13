package com.amazonaws.mobileconnectors.s3.transferutility;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents the type of connection a transfer is allowed to use
 */
public enum TransferConnectionType {
    /**
     * Any connection
     */
    ANY() {
        @Override
        protected boolean verify(NetworkInfo networkInfo) {
            return networkInfo != null && networkInfo.isConnected();
        }
    },

    /**
     * Wifi only
     */
    WIFI() {
        @Override
        protected boolean verify(NetworkInfo networkInfo) {
            return networkInfo != null && networkInfo.isConnected()
                    && networkInfo.getType() == ConnectivityManager.TYPE_WIFI;
        }
    },

    /**
     * Mobile only
     */
    MOBILE() {
        @Override
        protected boolean verify(NetworkInfo networkInfo) {
            return networkInfo != null && networkInfo.isConnected()
                    && networkInfo.getType() == ConnectivityManager.TYPE_MOBILE;
        }
    };

    private static final Map<String, TransferConnectionType> MAP;
    static {
        MAP = new HashMap<String, TransferConnectionType>();
        for (final TransferConnectionType type : TransferConnectionType.values()) {
            MAP.put(type.toString(), type);
        }
    }

    private static final Log LOGGER = LogFactory.getLog(TransferConnectionType.class);

    /**
     * Gets the status of network connectivity.
     *
     * @return true if network is connected, false otherwise.
     */
    boolean isConnected(final ConnectivityManager connectivityManager) {
        return verify(connectivityManager.getActiveNetworkInfo());
    }

    protected abstract boolean verify(final NetworkInfo networkInfo);

    /**
     * Returns the connection type from string
     *
     * @param typeAsString connection type of the transfer as string.
     * @return the {@link TransferConnectionType}
     */
    public static TransferConnectionType getConnectionType(String typeAsString) {
        if(MAP.containsKey(typeAsString)) {
            return MAP.get(typeAsString);
        }

        LOGGER.error("Unknown connection type " + typeAsString
                + " transfer will have connection type set to ANY.");
        return ANY;
    }
}
