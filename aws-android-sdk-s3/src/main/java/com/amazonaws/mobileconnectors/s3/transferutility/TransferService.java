/**
 * Copyright 2015-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;

import com.amazonaws.services.s3.AmazonS3;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Performs background upload and download tasks. Uses a thread pool to manage
 * the upload and download threads and limits the concurrent running threads.
 * When there are no active tasks, TransferService will stop itself.
 */
public class TransferService extends Service {

    private static final Log LOGGER = LogFactory.getLog(TransferService.class);
    private static final String TAG = TransferService.class.getSimpleName();

    /*
     * Constants of message sent to update handler.
     */
    static final int MSG_EXEC = 100;
    static final int MSG_CHECK = 200;
    static final int MSG_DISCONNECT = 300;
    private static final int MINUTE_IN_MILLIS = 60 * 1000;

    /*
     * Constants of intent action sent to the service.
     */
    static final String INTENT_ACTION_TRANSFER_ADD = "add_transfer";
    static final String INTENT_ACTION_TRANSFER_PAUSE = "pause_transfer";
    static final String INTENT_ACTION_TRANSFER_RESUME = "resume_transfer";
    static final String INTENT_ACTION_TRANSFER_CANCEL = "cancel_transfer";
    static final String INTENT_BUNDLE_TRANSFER_ID = "id";
    static final String INTENT_BUNDLE_S3_REFERENCE_KEY = "s3_reference_key";

    /*
     * Create a list of the transfer states depicting the transfers that
     * are unfinished.
     */
    static final TransferState[] UNFINISHED_TRANSFER_STATES = new TransferState[]{
        TransferState.WAITING,
        TransferState.WAITING_FOR_NETWORK,
        TransferState.IN_PROGRESS,
        TransferState.RESUMED_WAITING
    };

    private AmazonS3 s3;

    /*
     * updateHandler manages update requests in a queue. It updates transfers
     * from database and start/stop threads if needed.
     */
    private HandlerThread handlerThread;
    private Handler updateHandler;

    /*
     * registers a BroadcastReceiver to receive network status change events. It
     * will update transfer records in database directly.
     */
    private NetworkInfoReceiver networkInfoReceiver;
    /*
     * A flag indicates whether a database scan is necessary. This is true when
     * service starts and when network is disconnected.
     */
    private boolean shouldScan = true;
    /*
     * A flag indicates whether the service is started the first time.
     */
    private boolean isFirst = true;
    /*
     * A timestamp when the service is last known active. The service will stop
     * after a minute of inactivity.
     */
    private volatile long lastActiveTime;

    private volatile int startId;
    private TransferDBUtil dbUtil;
    TransferStatusUpdater updater;

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

        LOGGER.debug("Starting Transfer Service");
        dbUtil = new TransferDBUtil(getApplicationContext());
        updater = new TransferStatusUpdater(dbUtil);

        handlerThread = new HandlerThread(TAG + "-AWSTransferUpdateHandlerThread");
        handlerThread.start();
        setHandlerLooper(handlerThread.getLooper());
    }

    /**
     * A Broadcast receiver to receive network connection change events.
     */
    static class NetworkInfoReceiver extends BroadcastReceiver {
        private final Handler handler;
        private final ConnectivityManager connManager;

        /**
         * Constructs a NetworkInfoReceiver.
         *
         * @param handler a handle to send message to
         */
        public NetworkInfoReceiver(Context context, Handler handler) {
            this.handler = handler;
            connManager = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
                final boolean networkConnected = isNetworkConnected();
                LOGGER.debug("Network connected: " + networkConnected);
                handler.sendEmptyMessage(networkConnected ? MSG_CHECK : MSG_DISCONNECT);
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
        this.startId = startId;

        if (intent == null) {
            return START_REDELIVER_INTENT;
        }

        final String keyForS3Client = intent.getStringExtra(INTENT_BUNDLE_S3_REFERENCE_KEY);
        s3 = S3ClientReference.get(keyForS3Client);
        if (s3 == null) {
            LOGGER.warn("TransferService can't get s3 client, and it will stop.");
            stopSelf(startId);
            return START_NOT_STICKY;
        }

        updateHandler.sendMessage(updateHandler.obtainMessage(MSG_EXEC, intent));
        if (isFirst) {
            registerReceiver(networkInfoReceiver, new IntentFilter(
                    ConnectivityManager.CONNECTIVITY_ACTION));
            isFirst = false;
        }
        /*
         * The service will not restart if it's killed by system.
         */
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        try {
            unregisterReceiver(networkInfoReceiver);
        } catch (final IllegalArgumentException iae) {
            /*
             * Ignore on purpose, just in case the service stops before
             * onStartCommand where the receiver is registered.
             */
            LOGGER.warn("exception trying to destroy the service", iae);
        }
        handlerThread.quit();
        TransferThreadPool.closeThreadPool();
        S3ClientReference.clear();
        dbUtil.closeDB();
        super.onDestroy();
    }

    class UpdateHandler extends Handler {
        public UpdateHandler(Looper looper) {
            super(looper);
        }

        @Override
        public void handleMessage(Message msg) {
            if (msg.what == MSG_CHECK) {
                // remove messages of the same type
                updateHandler.removeMessages(MSG_CHECK);
                checkTransfers();
            } else if (msg.what == MSG_EXEC) {
                execCommand((Intent) msg.obj);
            } else if (msg.what == MSG_DISCONNECT) {
                pauseAllForNetwork();
            } else {
                LOGGER.error("Unknown command: " + msg.what);
            }
        }
    }

    /**
     * Checks two things: whether they are active transfers and whether a
     * database scan is necessary.
     */
    void checkTransfers() {
        // scan database for previously unfinished transfers
        if (shouldScan && networkInfoReceiver.isNetworkConnected() && s3 != null) {
            loadTransfersFromDB();
            shouldScan = false;
        }
        removeCompletedTransfers();

        // update last active time if service is active
        if (isActive()) {
            lastActiveTime = System.currentTimeMillis();
            // check after one minute
            updateHandler.sendEmptyMessageDelayed(MSG_CHECK, MINUTE_IN_MILLIS);
        } else {
            /*
             * Stop the service when it's been idled for more than a minute.
             */
            LOGGER.debug("Stop self");
            stopSelf(startId);
        }
    }

    /**
     * Executes command received by the service.
     *
     * @param intent received intent
     */
    void execCommand(Intent intent) {
        // update last active time
        lastActiveTime = System.currentTimeMillis();

        final String action = intent.getAction();
        final int id = intent.getIntExtra(INTENT_BUNDLE_TRANSFER_ID, 0);

        if (id == 0) {
            LOGGER.error("Invalid id: " + id);
            return;
        }

        if (INTENT_ACTION_TRANSFER_ADD.equals(action)) {
            if (updater.getTransfer(id) != null) {
                LOGGER.warn("Transfer has already been added: " + id);
            } else {
                /*
                 * only add transfer when network is available or else relies on
                 * the network change listener to scan the database
                 */
                final TransferRecord transfer = dbUtil.getTransferById(id);
                if (transfer != null) {
                    updater.addTransfer(transfer);
                    transfer.start(s3, dbUtil, updater, networkInfoReceiver);
                } else {
                    LOGGER.error("Can't find transfer: " + id);
                }
            }
        } else if (INTENT_ACTION_TRANSFER_PAUSE.equals(action)) {
            TransferRecord transfer = updater.getTransfer(id);
            if (transfer == null) {
                transfer = dbUtil.getTransferById(id);
            }
            if (transfer != null) {
                transfer.pause(s3, updater);
            }
        } else if (INTENT_ACTION_TRANSFER_RESUME.equals(action)) {
            TransferRecord transfer = updater.getTransfer(id);
            if (transfer == null) {
                transfer = dbUtil.getTransferById(id);
                if (transfer != null) {
                    updater.addTransfer(transfer);
                    /*
                     * @Anchorer
                     * while resuming a transfer, if the transfer is null, create a new one, and trigger a state callback instantly. (for UI display)
                     */
                    updater.updateState(id, transfer.state);
                } else {
                    LOGGER.error("Can't find transfer: " + id);
                }
            }
            if (transfer != null) {
                transfer.start(s3, dbUtil, updater, networkInfoReceiver);
            }
        } else if (INTENT_ACTION_TRANSFER_CANCEL.equals(action)) {
            TransferRecord transfer = updater.getTransfer(id);
            if (transfer == null) {
                transfer = dbUtil.getTransferById(id);
            }
            if (transfer != null) {
                transfer.cancel(s3, updater);
            }
        } else {
            LOGGER.error("Unknown action: " + action);
        }
    }

    /**
     * Checks whether the service is active. If a service is inactive, it can
     * stop itself safely.
     *
     * @return true if service active, false otherwise
     */
    private boolean isActive() {
        if (shouldScan) {
            return true;
        }
        for (final TransferRecord transfer : updater.getTransfers().values()) {
            if (transfer.isRunning()) {
                return true;
            }
        }
        return System.currentTimeMillis() - lastActiveTime < MINUTE_IN_MILLIS;
    }

    /**
     * Remove completed transfers from status updater.
     */
    private void removeCompletedTransfers() {
        final List<Integer> ids = new ArrayList<Integer>();
        for (final TransferRecord transfer : updater.getTransfers().values()) {
            if (TransferState.COMPLETED.equals(transfer.state)) {
                /*
                 * Add completed transfers to remove. Removing transfers with
                 * updater.removeTransfer(transfer.id) will result in
                 * ConcurrentModificationException
                 */
                ids.add(transfer.id);
            }
        }
        for (final Integer id : ids) {
            updater.removeTransfer(id);
        }
    }

    /**
     * Loads transfers from database. These transfers are unfinished from
     * previous session or are new transfers waiting for network. It skips any
     * transfer that is already tracked by the status updater. Also starts
     * transfers whose states indicate running but aren't.
     */
    void loadTransfersFromDB() {
        LOGGER.debug("Loading transfers from database");
        Cursor c = null;
        int count = 0;

        try {
            // Query for the unfinshed transfers
            c = dbUtil.queryTransfersWithTypeAndStates(TransferType.ANY, UNFINISHED_TRANSFER_STATES);
            while (c.moveToNext()) {
                final int id = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_ID));
                final TransferState state = TransferState.getState(c.getString(c
                        .getColumnIndexOrThrow(TransferTable.COLUMN_STATE)));
                final int partNumber = c.getInt(c.getColumnIndexOrThrow(TransferTable.COLUMN_PART_NUM));
                // add unfinished transfers
                if (partNumber == 0) {
                    if (updater.getTransfer(id) == null) {
                        final TransferRecord transfer = new TransferRecord(id);
                        transfer.updateFromDB(c);
                        if (transfer.start(s3, dbUtil, updater, networkInfoReceiver)) {
                            updater.addTransfer(transfer);
                            count++;
                        }
                    } else {
                        final TransferRecord transfer = updater.getTransfer(id);
                        if (!transfer.isRunning()) {
                            transfer.start(s3, dbUtil, updater, networkInfoReceiver);
                        }
                    }
                }
            }
        } finally {
            if (c != null) {
                c.close();
            }
        }
        LOGGER.debug(count + " transfers are loaded from database");
    }

    /**
     * Pause all running transfers and set state to WAITING_FOR_NETWORK.
     */
    void pauseAllForNetwork() {
        for (final TransferRecord transfer : updater.getTransfers().values()) {
            if (s3 != null && transfer != null && transfer.pause(s3, updater)) {
                // change status to waiting
                updater.updateState(transfer.id, TransferState.WAITING_FOR_NETWORK);
            }
        }
        shouldScan = true;
    }

    /**
     * A helper method to swap a different looper for testing purpose.
     *
     * @param looper new looper
     */
    void setHandlerLooper(Looper looper) {
        updateHandler = new UpdateHandler(looper);
        networkInfoReceiver = new NetworkInfoReceiver(getApplicationContext(), updateHandler);
    }

    @Override
    protected void dump(FileDescriptor fd, PrintWriter writer, String[] args) {
        // only available when the application is debuggable
        if ((getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE) == 0) {
            return;
        }

        writer.printf("start id: %d\n", startId);
        writer.printf("network status: %s\n", networkInfoReceiver.isNetworkConnected());
        writer.printf("lastActiveTime: %s, shouldScan: %s\n", new Date(lastActiveTime), shouldScan);
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

