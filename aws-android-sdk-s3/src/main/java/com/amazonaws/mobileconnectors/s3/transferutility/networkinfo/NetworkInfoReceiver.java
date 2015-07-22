/**
 * Copyright 2015-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.s3.transferutility.networkinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * A Broadcast receiver to receive network connection change events.
 */
public class NetworkInfoReceiver extends BroadcastReceiver {

    private final List<NetworkInfoChangeListener> listeners;
    private boolean isNetworkConnected;

    /**
     * Constructs a NetworkInfoReceive with a Context which is used to get the
     * system connectivity service.
     *
     * @param context An Context object.
     */
    public NetworkInfoReceiver(Context context) {
        listeners = new ArrayList<NetworkInfoChangeListener>();
        ConnectivityManager connManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = connManager.getActiveNetworkInfo();
        isNetworkConnected = (info != null && info.isConnected());
    }

    /**
     * Adds a listener used to receive notification when network state changes.
     *
     * @param listener A listener used to receive notification.
     */
    public void addNetworkInfoListener(NetworkInfoChangeListener listener) {
        synchronized (listeners) {
            listeners.add(listener);
        }
    }

    /**
     * Removes the given listener from the listener list.
     *
     * @param listener The listener to be removed
     */
    public void removeNetworkInfoListener(NetworkInfoChangeListener listener) {
        synchronized (listeners) {
            listeners.remove(listener);
        }
    }

    /**
     * Gets Whether network is currently connected
     *
     * @return Whether network is connected.
     */
    public boolean isNetworkConnected() {
        return isNetworkConnected;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (listeners.size() == 0) {
            return;
        }
        String action = intent.getAction();
        if (action.equals(ConnectivityManager.CONNECTIVITY_ACTION)) {
            ConnectivityManager connManager = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo info = connManager.getActiveNetworkInfo();
            isNetworkConnected = (info != null && info.isConnected());
            if (isNetworkConnected) {
                for (NetworkInfoChangeListener listener : listeners) {
                    listener.onConnect();
                }
            } else {
                for (NetworkInfoChangeListener listener : listeners) {
                    listener.onDisconnect();
                }
            }
        }
    }
}
