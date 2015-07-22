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

package com.amazonaws.mobileconnectors.s3.transferutility;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;

import com.amazonaws.mobileconnectors.s3.transferutility.networkinfo.NetworkInfoChangeListener;
import com.amazonaws.mobileconnectors.s3.transferutility.networkinfo.NetworkInfoReceiver;
import com.amazonaws.services.s3.AmazonS3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Performs background upload and download tasks. Uses a thread pool to manage
 * the upload and download threads and limits the concurrent running threads.
 * When there are no active tasks, TransferService will stop itself.
 */
public class TransferService extends Service {

    private static final String TAG = "TransferSerivce";
    private static final int MSG_UPDATE = 100;
    private static final int MSG_CHECK = 200;
    private static final int MINUTE_IN_MILLIS = 60 * 1000;

    private AmazonS3 s3;

    /*
     * updateHandler manages update requests in a queue. It updates transfers
     * from database and start/stop threads if needed.
     */
    private HandlerThread handlerThread;
    private Handler updateHandler;

    /*
     * mObserver listens to database changes and sends messages to updateHandler
     * to trigger updates.
     */
    private TransferContentObserver observer;

    /*
     * registers a BroadcastReceiver to receive network status change events. It
     * will update transfer records in database directly.
     */
    private NetworkInfoReceiver networkInfoReceive;

    /*
     * transfers stores the current transfer records the Service holds. It will
     * load data from database if triggered.
     */
    private Map<Integer, TransferRecord> transfers;
    private int startId;
    private TransferDBUtil dbUtil;

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Can't bind to TransferSerivce");
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(TAG, "Starting Transfer Service");

        transfers = new HashMap<Integer, TransferRecord>();

        handlerThread = new HandlerThread(TAG + "-AWSTransferUpdateHandlerThread");
        handlerThread.start();
        updateHandler = new Handler(handlerThread.getLooper(), mUpdateCallback);

        dbUtil = new TransferDBUtil(getApplicationContext());

        observer = new TransferContentObserver();
        getContentResolver().registerContentObserver(dbUtil.getContentUri(), true,
                observer);

        networkInfoReceive = new NetworkInfoReceiver(this.getApplicationContext());
        networkInfoReceive.addNetworkInfoListener(new NetworkInfoChangeListener() {
            @Override
            public void onDisconnect() {
                dbUtil.updateNetworkDisconnected();
            }

            @Override
            public void onConnect() {
                dbUtil.updateNetworkConnected();
            }
        });

        /*
         * checks network when Service is created. Makes sure previous hanging
         * transfers continue.
         */
        if (networkInfoReceive.isNetworkConnected()) {
            dbUtil.updateNetworkConnected();
        } else {
            dbUtil.updateNetworkDisconnected();
        }

        registerReceiver(networkInfoReceive, new IntentFilter(
                ConnectivityManager.CONNECTIVITY_ACTION));
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        this.startId = startId;
        String keyForS3Client = intent.getStringExtra(TransferUtility.KEY_FOR_S3_WEAK_REFERENCE);
        s3 = S3ClientWeakReference.get(keyForS3Client);
        if (s3 == null) {
            Log.w(TAG, "TransferService can't get s3 client, it will stop.");
            stopSelf();
        }

        enqueueUpdate();
        /*
         * The service will not restart if it's killed by system.
         */
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        getContentResolver().unregisterContentObserver(observer);
        unregisterReceiver(networkInfoReceive);
        handlerThread.quit();
        dbUtil.setAllRunningRecordsToPausedBeforeShutdownService();
        TransferThreadPool.closeThreadPool();
        super.onDestroy();
    }

    private final Handler.Callback mUpdateCallback = new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            final boolean isActive;
            synchronized (transfers) {
                isActive = updateTransfersFromDB();
            }
            if (isActive) {
                enqueueCheckTasksDoneLater();
            } else {
                if (msg.what == MSG_CHECK) {
                    stopSelf(startId);
                }
            }
            return true;
        }
    };

    /**
     * Removes pending updates and enqueue a update request.
     */
    private void enqueueUpdate() {
        updateHandler.removeMessages(MSG_UPDATE);
        updateHandler.obtainMessage(MSG_UPDATE, startId).sendToTarget();
    }

    /**
     * Checks if all the tasks are done after 1 minute
     */
    private void enqueueCheckTasksDoneLater() {
        updateHandler.removeMessages(MSG_CHECK);
        updateHandler.sendMessageDelayed(updateHandler.obtainMessage(MSG_CHECK, startId),
                MINUTE_IN_MILLIS);
    }

    /**
     * @return Whether there are active transfers
     */
    boolean updateTransfersFromDB() {
        boolean isActive = false;
        Set<Integer> deadTransferIds = new HashSet<Integer>(transfers.keySet());
        Cursor cursor = dbUtil.queryAllTransfersWithType(TransferType.ANY);
        while (cursor.moveToNext()) {
            int transferId = cursor.getInt(cursor
                    .getColumnIndexOrThrow(TransferTable.COLUMN_ID));
            deadTransferIds.remove(transferId);
            TransferRecord transfer = transfers.get(transferId);
            if (transfer != null) {
                transfer.updateFromDB(cursor);
            } else {
                transfer = addNewTransfer(cursor);
            }
            boolean isTransferActive = transfer.startIfReady(dbUtil);
            transfer.pauseOrCancelIfRequested(dbUtil);
            isActive |= isTransferActive;
        }
        cursor.close();

        // Clean up stale transfers that disappeared
        for (int id : deadTransferIds) {
            transfers.remove(id);
        }

        return isActive;
    }

    /**
     * Creates a TransferRecord instance with the information that the Cursor
     * provides.
     *
     * @param c A Cursor pointing to a transfer record
     * @return A TransferRecord that stores all the information of a transfer
     *         task.
     */
    private TransferRecord addNewTransfer(Cursor c) {
        TransferRecord transfer = new TransferRecord(c.getInt(c
                .getColumnIndexOrThrow(TransferTable.COLUMN_ID)), s3);
        transfer.updateFromDB(c);
        transfers.put(transfer.id, transfer);
        return transfer;
    }

    private class TransferContentObserver extends ContentObserver {
        public TransferContentObserver() {
            super(new Handler());
        }

        @Override
        public void onChange(boolean selfChange) {
            enqueueUpdate();
        }
    }
}
