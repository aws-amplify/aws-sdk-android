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

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.amazonaws.services.s3.AmazonS3;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * A Broadcast receiver to receive network connection change events.
 */
@SuppressWarnings("checkstyle:finalclass")
public class TransferNetworkLossHandler extends BroadcastReceiver {

    /**
     * Logger for this class.
     */
    private static final Log LOGGER = LogFactory.getLog(TransferNetworkLossHandler.class);

    /**
     * An Android Networking utility that gives network specific information.
     */
    private final ConnectivityManager connManager;

    /**
     * Reference to the transfer database utility.
     */
    private TransferDBUtil dbUtil;

    /**
     * The status updater that updates the state and the progress of the transfer in
     * memory and persists to the database.
     */
    TransferStatusUpdater updater;

    /**
     * The Singleton instance.
     */
    private static TransferNetworkLossHandler transferNetworkLossHandler;

    /**
     * Constructs a TransferNetworkLossHandler.
     *
     * @param context the application context
     */
    private TransferNetworkLossHandler(Context context) {
        connManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        dbUtil = new TransferDBUtil(context);
        updater = TransferStatusUpdater.getInstance(context);
    }

    /**
     * Return the singleton instance of the receiver.
     *
     * @param context the application context
     * @return handler object
     */
    public static synchronized TransferNetworkLossHandler getInstance(Context context) {
        if (transferNetworkLossHandler == null) {
            transferNetworkLossHandler = new TransferNetworkLossHandler(context);
        }
        return transferNetworkLossHandler;
    }

    /**
     * Return the singleton instance of the handler.
     *
     * @return handler object
     * @throws TransferUtilityException when the singleton instance is null.
     */
    public static synchronized TransferNetworkLossHandler getInstance() 
            throws TransferUtilityException {
        if (transferNetworkLossHandler == null) {
            final String errorMessage = "TransferNetworkLossHandler is not created. "
                    + "Please call `TransferNetworkLossHandler.getInstance(Context)` to "
                    + "instantiate it before retrieving";
            LOGGER.error(errorMessage);
            throw new TransferUtilityException(errorMessage);
        }
        return transferNetworkLossHandler;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
            LOGGER.info("Network connectivity changed detected.");

            final boolean networkConnected = isNetworkConnected();
            LOGGER.info("Network connected: " + networkConnected);

            /**
             * Scanning the database for transfers and pausing/resuming them can be
             * intensive, hence doing it in a background thread.
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

    /**
     * Check for the transfers that are in WAITING_FOR_NETWORK state and resume them
     * to execution.
     */
    private void checkTransfersOnNetworkReconnect() {
        if (isNetworkConnected()) {
            loadAndResumeTransfersFromDB(new TransferState[] {TransferState.WAITING_FOR_NETWORK});
        } else {
            LOGGER.error("Network Connect message received but not connected to network.");
        }
    }

    /**
     * Loads transfers from database. These transfers are unfinished from previous
     * session or are new transfers waiting for network. It skips any transfer that
     * is already tracked by the status updater. Also starts transfers whose states
     * indicate running but aren't.
     *
     * The transfers would start only if the AmazonS3Client is present in the
     * {@code S3ClientReference} map. If the AmazonS3Client is not present, this
     * would skip starting the transfer.
     *
     * @param transferStates The list of the transfer states
     */
    private synchronized void loadAndResumeTransfersFromDB(final TransferState[] transferStates) {
        LOGGER.debug("Loading transfers from database...");
        Cursor c = null;
        int count = 0;

        // Read the transfer ids from the cursor and store in this list.
        List<Integer> transferIds = new ArrayList<Integer>();

        // Query for the unfinished transfers and store them in a list
        try {
            c = dbUtil.queryTransfersWithTypeAndStates(TransferType.ANY, transferStates);
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

    /**
     * Pause all running transfers and set the state to WAITING_FOR_NETWORK.
     */
    private void pauseAllForNetwork() {
        for (final TransferRecord transferRecord : updater.getTransfers().values()) {
            final AmazonS3 s3 = S3ClientReference.get(transferRecord.id);
            if (s3 != null && transferRecord != null && transferRecord.pause(s3, updater)) {
                updater.updateState(transferRecord.id, TransferState.WAITING_FOR_NETWORK);
            }
        }
    }
}
