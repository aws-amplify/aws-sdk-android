/**
 * Copyright 2015-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.IBinder;

import com.amazonaws.services.s3.AmazonS3;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
    static NetworkInfoReceiver networkInfoReceiver;

    /**
     * A flag indicates whether the service is started the first time.
     */
    boolean isReceiverNotRegistered = true;

    /**
     * Reference to the transfer database utility.
     */
    private TransferDBUtil dbUtil;

    /**
     * The status updater that updates the state and the
     * progress of the transfer in memory and persists to the
     * database.
     */
    TransferStatusUpdater updater;

    /**
     * Lock for synchronizing the pause/resume transfers. There is a need
     * to synchronize the pause/resume operation because the service could
     * get duplicate broadcasts which can fire multiple threads to do the
     * same task.
     */
    private static final Object LOCK = new Object();

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

        LOGGER.info("Starting Transfer Service to listen for network connectivity changes");

        dbUtil = new TransferDBUtil(this);
        updater = TransferStatusUpdater.getInstance(this);
        networkInfoReceiver = new NetworkInfoReceiver(getApplicationContext());

        if (isReceiverNotRegistered) {
            try {
                LOGGER.info("Registering the network receiver");
                this.registerReceiver(this.networkInfoReceiver,
                        new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
            } catch (final IllegalArgumentException iae) {
                LOGGER.warn("Ignoring the exception trying to register the receiver for connectivity change.");
            } catch (final IllegalStateException ise) {
                LOGGER.warn("Ignoring the leak in registering the receiver.");
            } finally {
                isReceiverNotRegistered = false;
            }
        }
    }

    /**
     * A Broadcast receiver to receive network connection change events.
     */
    class NetworkInfoReceiver extends BroadcastReceiver {
        private final ConnectivityManager connManager;

        /**
         * Constructs a NetworkInfoReceiver.
         *
         * @param context the android context
         */
        public NetworkInfoReceiver(Context context) {
            connManager = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
                LOGGER.info("Network connectivity changed detected.");

                final boolean networkConnected = isNetworkConnected();
                LOGGER.info("Network connected: " + networkConnected);

                /**
                 * Scanning the database for transfers and pausing/resuming
                 * them can be intensive, hence doing it in a background
                 * thread.
                 */
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        if (networkConnected) {
                            checkTransfersOnNetworkReconnect();
                        } else {
                            pauseAllForNetwork();
                        }
                    }
                }).start();
            }
        }

        /**
         * Gets the status of network connectivity.
         *
         * @return true if network is connected, false otherwise.
         */
        boolean isNetworkConnected() {
            final NetworkInfo info = connManager.getActiveNetworkInfo();
            return info != null && info.isConnected();
        }
    }

    @Override
    @SuppressWarnings("checkstyle:hiddenfield")
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (isReceiverNotRegistered) {
            try {
                LOGGER.info("Registering the network receiver");
                this.registerReceiver(this.networkInfoReceiver,
                        new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
            } catch (final IllegalArgumentException iae) {
                LOGGER.warn("Ignoring the exception trying to register the receiver for connectivity change.");
            } catch (final IllegalStateException ise) {
                LOGGER.warn("Ignoring the leak in registering the receiver.");
            } finally {
                isReceiverNotRegistered = false;
            }
        }

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        try {
            if (networkInfoReceiver != null) {
                LOGGER.info("Unregistering the network receiver");
                this.unregisterReceiver(this.networkInfoReceiver);
                isReceiverNotRegistered = true;
                networkInfoReceiver = null;
            }
        } catch (final IllegalArgumentException iae) {
            /*
             * Ignore on purpose, just in case the service stops before
             * onStartCommand where the receiver is registered.
             */
            LOGGER.warn("Exception trying to unregister the service");
        }

        super.onDestroy();
    }

    /**
     * Check for the transfers that are in WAITING_FOR_NETWORK state
     * and resume them to execution.
     */
    void checkTransfersOnNetworkReconnect() {
        if (networkInfoReceiver.isNetworkConnected()) {
            loadAndResumeTransfersFromDB(new TransferState[] {TransferState.WAITING_FOR_NETWORK});
        } else {
            LOGGER.error("Network Connect message received but not connected to network.");
        }
    }

    /**
     * Loads transfers from database. These transfers are unfinished from
     * previous session or are new transfers waiting for network. It skips any
     * transfer that is already tracked by the status updater. Also starts
     * transfers whose states indicate running but aren't.
     *
     * The transfers would start only if the AmazonS3Client is present in the
     * {@code S3ClientReference} map. If the AmazonS3Client is not present, this would
     * skip starting the transfer.
     *
     * @param transferStates The list of the transfer states
     */
    void loadAndResumeTransfersFromDB(final TransferState[] transferStates) {
        LOGGER.debug("Loading transfers from database...");
        synchronized (LOCK) {
            Cursor c = null;
            int count = 0;

            // Read the transfer ids from the cursor and store in this list.
            List<Integer> transferIds = new ArrayList<Integer>();

            // Query for the unfinished transfers and store them in a list
            try {
                c = dbUtil.queryTransfersWithTypeAndStates(TransferType.ANY,
                        transferStates);
                while (c.moveToNext()) {
                    final int id = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_ID));
                    // If the transfer status updater doesn't track it, load the transfer record
                    // from the database and add it to the updater to track
                    if (updater.getTransfer(id) == null) {
                        final TransferRecord transfer = new TransferRecord(id);
                        transfer.updateFromDB(c);
                        updater.addTransfer(transfer);
                        count++;
                    }
                    transferIds.add(id);
                }
            } finally {
                if (c != null) {
                    LOGGER.debug("Closing the cursor for loadAndResumeTransfersFromDB");
                    c.close();
                }
            }

            // Iterate over each transfer id and resume them if it's not running.
            try {
                for (final Integer id : transferIds) {
                    final AmazonS3 s3 = S3ClientReference.get(id);
                    if (s3 != null) {
                        // Check if it's running. If not, start the transfer.
                        final TransferRecord transfer = updater.getTransfer(id);
                        if (transfer != null && !transfer.isRunning()) {
                            transfer.start(s3, dbUtil, updater);
                        }
                    }
                }
            } catch (final Exception exception) {
                LOGGER.error("Error in resuming the transfers." + exception.getMessage());
            }

            LOGGER.debug(count + " transfers are loaded from database.");
        }
    }

    /**
     * Pause all running transfers and set the state to WAITING_FOR_NETWORK.
     */
    void pauseAllForNetwork() {
        synchronized (LOCK) {
            for (final TransferRecord transferRecord : updater.getTransfers().values()) {
                final AmazonS3 s3 = S3ClientReference.get(transferRecord.id);
                if (s3 != null &&
                        transferRecord != null &&
                        transferRecord.pause(s3, updater)) {
                    updater.updateState(transferRecord.id, TransferState.WAITING_FOR_NETWORK);
                }
            }
        }
    }

    @Override
    protected void dump(FileDescriptor fd, PrintWriter writer, String[] args) {
        // only available when the application is debuggable
        if ((getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE) == 0) {
            return;
        }

        writer.printf("network status: %s\n", networkInfoReceiver.isNetworkConnected());
        final Map<Integer, TransferRecord> transfers = updater.getTransfers();
        writer.printf("# of active transfers: %d\n", transfers.size());
        for (final TransferRecord transfer : transfers.values()) {
            writer.printf("bucket: %s, key: %s, status: %s, total size: %d, current: %d\n",
                    transfer.bucketName, transfer.key, transfer.state, transfer.bytesTotal,
                    transfer.bytesCurrent);
        }
        writer.flush();
    }
}
