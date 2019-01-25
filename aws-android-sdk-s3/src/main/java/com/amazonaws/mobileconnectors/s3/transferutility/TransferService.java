/**
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * <p>
 * http://aws.amazon.com/apache2.0
 * <p>
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.s3.transferutility;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.IBinder;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;

/**
 * TransferService is limited to the following functionality:
 * Registers a listener with Android OS for network connectivity
 * changes. When network goes offline, the active transfers are
 * paused. When network come back online, the paused transfers
 * are resumed. This works both in foreground as well as background.
 */
public class TransferService extends Service {

    private static final Log LOGGER = LogFactory.getLog(TransferService.class);

    /**
     * registers a BroadcastReceiver to receive network status change events. It
     * will update transfer records in database directly.
     */
    static TransferNetworkLossHandler transferNetworkLossHandler;

    /**
     * A flag indicates whether the service is started the first time.
     */
    boolean isReceiverNotRegistered = true;

    /**
     * The identifier used for the notification.
     */
    private int ongoingNotificationId = 0;

    /**
     * This flag determines if the notification needs to be removed
     * when the service is moved out of the foreground state.
     */
    private boolean removeNotification = true;

    /**
     * Constant for Android Oreo.
     */
    private static final int ANDROID_OREO = 26;

    /**
     * The key that identifies the Notification object that will be displayed
     * when the service moves to foreground.
     */
    public static final String INTENT_KEY_NOTIFICATION = "notification";

    /**
     * The key that identifies the identifier for the ongoing notification that
     * will be displayed when the service moves to foreground.
     */
    public static final String INTENT_KEY_NOTIFICATION_ID = "ongoing-notification-id";

    /**
     * The key that identifies the flag, that determines if the notification
     * needs to be removed when the service is moved out of the foreground state.
     */
    public static final String INTENT_KEY_REMOVE_NOTIFICATION = "remove-notification";

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Can't bind to TransferService");
    }

    /**
     * <ul>
     * <li>The service starts upon intents from transfer utility.</li>
     * <li>It remains alive when there are active transfers.</li>
     * <li>It also stays alive when network is disconnected and there are
     * transfers waiting.</li>
     * </ul>
     */
    @Override
    public void onCreate() {
        super.onCreate();

        LOGGER.info("Starting Transfer Service to listen for network connectivity changes.");

        transferNetworkLossHandler = TransferNetworkLossHandler.getInstance(getApplicationContext());

        synchronized (this) {
            if (isReceiverNotRegistered) {
                try {
                    LOGGER.info("Registering the network receiver");
                    this.registerReceiver(this.transferNetworkLossHandler,
                            new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
                    isReceiverNotRegistered = false;
                } catch (final IllegalArgumentException iae) {
                    LOGGER.warn("Ignoring the exception trying to register the receiver for connectivity change.");
                } catch (final IllegalStateException ise) {
                    LOGGER.warn("Ignoring the leak in registering the receiver.");
                }
            }
        }
    }

    @Override
    @SuppressWarnings("checkstyle:hiddenfield")
    public int onStartCommand(Intent intent, int flags, int startId) {
        /**
         * Starting Android Oreo, service cannot be invoked when the application is in background
         * due to the background limitations imposed by Android. If the Android version is Oreo and
         * above, the service will be moved from the background state to foreground state.
         *
         * To move the service to foreground, an ongoing Notification needs to be displayed. There
         * are three pieces of information we expect from the intent. a) A valid notification object
         * b) An identifier for the ongoing notification c) Flag that determines if the notification
         * needs to be removed when the service is moved out of the foreground state.
         */
        if (Build.VERSION.SDK_INT >= ANDROID_OREO) {
            try {
                synchronized (this) {
                    final Notification userProvidedNotification = (Notification) intent.getParcelableExtra(INTENT_KEY_NOTIFICATION);
                    if (userProvidedNotification != null) {
                        // Get the notification Id from the intent, if it's null, the default notification Id will be returned.
                        ongoingNotificationId = (int) intent.getIntExtra(INTENT_KEY_NOTIFICATION_ID, ongoingNotificationId);
                        
                        // Get removeNotification from the intent, if it's null, removeNotification will be returned.
                        removeNotification = (boolean) intent.getBooleanExtra(INTENT_KEY_REMOVE_NOTIFICATION, removeNotification);

                        // Put the service in foreground state
                        LOGGER.info("Putting the service in Foreground state.");
                        startForeground(ongoingNotificationId, userProvidedNotification);
                    } else {
                        LOGGER.error("No notification is passed in the intent. "
                            + "Unable to transition to foreground.");
                    }
                }
            } catch (Exception ex) {
                LOGGER.error("Error in moving the service to foreground state: " + ex);
            }
        }

        synchronized (this) {
            if (isReceiverNotRegistered) {
                try {
                    LOGGER.info("Registering the network receiver");
                    this.registerReceiver(this.transferNetworkLossHandler,
                            new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
                    isReceiverNotRegistered = false;
                } catch (final IllegalArgumentException iae) {
                    LOGGER.warn("Ignoring the exception trying to register the receiver for connectivity change.");
                } catch (final IllegalStateException ise) {
                    LOGGER.warn("Ignoring the leak in registering the receiver.");
                }
            }
        }

        // service can be restarted
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        /**
         * removeNotification determines if the notification will be removed
         * when the service is moved out of the foreground state.
         */
        try {
            if (Build.VERSION.SDK_INT >= ANDROID_OREO) {
                LOGGER.info("Moving the service out of the Foreground state.");
                synchronized (this) {
                    stopForeground(removeNotification);
                }
            }
        } catch (final Exception ex) {
            LOGGER.error("Error in moving the service out of the foreground state: " + ex);
        }

        try {
            LOGGER.info("De-registering the network receiver.");
            synchronized (this) {
                if (!isReceiverNotRegistered) {
                    this.unregisterReceiver(this.transferNetworkLossHandler);
                    isReceiverNotRegistered = true;
                    transferNetworkLossHandler = null;
                }
            }
        } catch (final IllegalArgumentException iae) {
            /*
             * Ignore on purpose, just in case the service stops before
             * onStartCommand where the receiver is registered.
             */
            LOGGER.warn("Exception trying to de-register the network receiver");
        }

        super.onDestroy();
    }

    @Override
    protected void dump(FileDescriptor fd, PrintWriter writer, String[] args) {
        // only available when the application is debuggable
        if ((getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE) == 0) {
            return;
        }

        writer.printf("network status: %s\n", transferNetworkLossHandler.isNetworkConnected());
        final Map<Integer, TransferRecord> transfers = TransferStatusUpdater.getInstance(this).getTransfers();
        writer.printf("# of active transfers: %d\n", transfers.size());
        for (final TransferRecord transfer : transfers.values()) {
            writer.printf("bucket: %s, key: %s, status: %s, total size: %d, current: %d\n",
                    transfer.bucketName, transfer.key, transfer.state, transfer.bytesTotal,
                    transfer.bytesCurrent);
        }
        writer.flush();
    }
}
