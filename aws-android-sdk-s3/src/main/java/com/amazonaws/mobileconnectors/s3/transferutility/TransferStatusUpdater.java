/**
 * Copyright 2015-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.os.Handler;
import android.os.Looper;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * A class that tracks active transfers. It has a static map that holds weak
 * references of {@link TransferListener}.
 */
class TransferStatusUpdater {
    private static final Log LOGGER = LogFactory.getLog(TransferStatusUpdater.class);
    /**
     * Some temporary states that should not be notified.
     */
    private static final HashSet<TransferState> STATES_NOT_TO_NOTIFY = new HashSet<TransferState>(
            Arrays.asList(TransferState.PART_COMPLETED,
                    TransferState.PENDING_CANCEL, TransferState.PENDING_PAUSE,
                    TransferState.PENDING_NETWORK_DISCONNECT));
    /**
     * The threshold to update progress in milliseconds to prevent triggering
     * listeners too often.
     */
    private static final int UPDATE_THRESHOLD_MS = 1000;

    /**
     * A map of listeners.
     */
    static final Map<Integer, List<TransferListener>> LISTENERS = new HashMap<Integer, List<TransferListener>>();

    /**
     * A map of active transfers.
     */
    private final Map<Integer, TransferRecord> transfers;
    /**
     * A map of transfer to its last update time to prevent events from being
     * fired too often.
     */
    private final Map<Integer, Long> lastUpdateTime;
    /**
     * Database util to update transfer status.
     */
    private final TransferDBUtil dbUtil;
    /**
     * The handler of main thread that runs callbacks.
     */
    private final Handler mainHandler;

    /**
     * This class is instantiated by TransferService.
     */
    TransferStatusUpdater(TransferDBUtil dbUtil) {
        this.dbUtil = dbUtil;
        mainHandler = new Handler(Looper.getMainLooper());
        transfers = new HashMap<Integer, TransferRecord>();
        lastUpdateTime = new HashMap<Integer, Long>();
    }

    /**
     * Gets all active transfers.
     *
     * @return an unmodifiable map of transfers
     */
    Map<Integer, TransferRecord> getTransfers() {
        return Collections.unmodifiableMap(transfers);
    }

    /**
     * Adds an active transfer for tracking.
     *
     * @param transfer a transfer object
     */
    void addTransfer(TransferRecord transfer) {
        transfers.put(transfer.id, transfer);
    }

    /**
     * Gets an active transfer by id.
     *
     * @param id id of the transfer
     * @return transfer if exists, null otherwise
     */
    TransferRecord getTransfer(int id) {
        return transfers.get(id);
    }

    /**
     * Removes a transfer from tracking.
     *
     * @param id id of the transfer to remove
     */
    void removeTransfer(int id) {
        transfers.remove(id);
        LISTENERS.remove(id);
        lastUpdateTime.remove(id);
    }
    
    /**
     * Removes a transfer from the persistent store.
     *
     * @param id id of the transfer to remove
     */
    void removeTransferRecordFromDB(final int id) {
        S3ClientReference.remove(id);
        dbUtil.deleteTransferRecords(id);
    }

    /**
     * Updates the state of an active transfer. If the transfer isn't tracked,
     * i.e. not active, it won't do anything. It writes the status of the
     * transfer, including current state, bytes transfer, bytes total, etc into
     * database. It then triggers
     * {@link TransferListener#onStateChanged(int, TransferState)} event of
     * associated LISTENERS if new state is different.
     * <p>
     * Note that when the newState is CANCELED, COMPLETED, or FAILED, associated
     * LISTENERS will be removed after being invoked. Make sure you call
     * throwError before changing the state to one of these, or else LISTENERS
     * won't be invoked.
     *
     * @param id id of the transfer to update
     * @param newState new state
     */
    void updateState(final int id, final TransferState newState) {
        boolean shouldNotNotify = STATES_NOT_TO_NOTIFY.contains(newState);
        final TransferRecord transfer = transfers.get(id);
        if (transfer == null) {
            // still wants to save state
            if (dbUtil.updateState(id, newState) == 0) {
                LOGGER.warn("Failed to update the status of transfer " + id);
            }
        } else {
            shouldNotNotify |= newState.equals(transfer.state);
            transfer.state = newState;
            // save to database
            if (dbUtil.updateTransferRecord(transfer) == 0) {
                LOGGER.warn("Failed to update the status of transfer " + id);
            }
        }

        if (shouldNotNotify) {
            return;
        }

        // invoke LISTENERS
        final List<TransferListener> list = LISTENERS.get(id);
        if (list == null || list.isEmpty()) {
            if (TransferState.COMPLETED.equals(newState)) {
                removeTransferRecordFromDB(id);
            }
            return;
        }

        // invoke on main thread
        mainHandler.post(new Runnable() {
            @Override
            public void run() {
                for (final TransferListener l : list) {
                    l.onStateChanged(id, newState);
                }
                // remove all LISTENERS when the transfer is in a final state so
                // as to release resources ASAP.
                if (TransferState.COMPLETED.equals(newState)
                        || TransferState.FAILED.equals(newState)
                        || TransferState.CANCELED.equals(newState)) {
                    list.clear();
                }
                
                if (TransferState.COMPLETED.equals(newState)) {
                    removeTransferRecordFromDB(id);
                }
            }
        });
    }

    /**
     * Updates the transfer progress of a transfer. It will trigger
     * {@link TransferListener#onProgressChanged(int, long, long)} of associated
     * LISTENERS if the update exceeds either time threshold.
     *
     * @param id id of the transfer
     * @param bytesCurrent current transferred bytes
     * @param bytesTotal total bytes
     */
    void updateProgress(final int id, final long bytesCurrent, final long bytesTotal) {
        final TransferRecord transfer = transfers.get(id);
        if (transfer != null) {
            transfer.bytesCurrent = bytesCurrent;
            transfer.bytesTotal = bytesTotal;
        }

        // Don't fire off the update too frequently, but still fire when it
        // comes to the last byte.
        final long timeInMillis = System.currentTimeMillis();

        // update bytes transfered so that the transfer observer may pick it
        // up.
        dbUtil.updateBytesTransferred(id, bytesCurrent);

        // invoke LISTENERS
        final List<TransferListener> list = LISTENERS.get(id);
        if (list == null || list.isEmpty()) {
            return;
        }


        if (!lastUpdateTime.containsKey(id)
                || timeInMillis - lastUpdateTime.get(id) > UPDATE_THRESHOLD_MS
                || bytesCurrent == bytesTotal) {
            lastUpdateTime.put(id, timeInMillis);

            // invoke on main thread
            mainHandler.post(new Runnable() {
                @Override
                public void run() {
                    for (final TransferListener l : list) {
                        l.onProgressChanged(id, bytesCurrent, bytesTotal);
                    }
                }
            });
        }
    }

    /**
     * Throws an error to transfer. It triggers
     * {@link TransferListener#onError(int, Exception)} of associated LISTENERS.
     *
     * @param id id of the transfer
     * @param e an exception object
     */
    void throwError(final int id, final Exception e) {
        // invoke LISTENERS
        final List<TransferListener> list = LISTENERS.get(id);
        if (list == null || list.isEmpty()) {
            return;
        }
        // invoke on main thread
        mainHandler.post(new Runnable() {
            @Override
            public void run() {
                for (final TransferListener l : list) {
                    l.onError(id, e);
                }
            }
        });
    }

    /**
     * Clears all transfers, LISTENERS, etc.
     */
    void clear() {
        LISTENERS.clear();
        transfers.clear();
        lastUpdateTime.clear();
    }

    /**
     * Registers a {@link TransferListener} to a transfer.
     *
     * @param id id of the transfer
     * @param listener a listener object
     */
    static void registerListener(int id, TransferListener listener) {
        if (listener == null) {
            throw new IllegalArgumentException("Listener can't be null");
        }
        synchronized (LISTENERS) {
            List<TransferListener> list = LISTENERS.get(id);
            if (list == null) {
                list = new CopyOnWriteArrayList<TransferListener>();
                list.add(listener);
                LISTENERS.put(id, list);
            } else {
                // don't add the same listener more than once
                if (!list.contains(listener)) {
                    list.add(listener);
                }
            }
        }
    }

    /**
     * Unregisters the listener from the transfer.
     *
     * @param id id of the transfer
     * @param listener a listener object
     */
    static void unregisterListener(int id, TransferListener listener) {
        if (listener == null) {
            throw new IllegalArgumentException("Listener can't be null");
        }
        final List<TransferListener> list = LISTENERS.get(id);
        if (list == null || list.isEmpty()) {
            return;
        }
        list.remove(listener);
    }

    /**
     * A helper class that updates transfer progress.
     */
    private class TransferProgressListener implements ProgressListener {

        private final TransferRecord transfer;
        /*
         * Current transfer progress per task. In a multipart upload, this value
         * is per upload part task. The purpose is to reset the progress upon a
         * reset event.
         */
        private long bytesCurrent;

        public TransferProgressListener(TransferRecord transfer) {
            this.transfer = transfer;
        }

        @Override
        public synchronized void progressChanged(ProgressEvent progressEvent) {
            if (progressEvent.getEventCode() == ProgressEvent.RESET_EVENT_CODE) {
                // Reset will discard what's been transferred, so subtract the
                // bytes transferred in this task from the total progress.
                transfer.bytesCurrent -= bytesCurrent;
                bytesCurrent = 0;
            } else {
                bytesCurrent += progressEvent.getBytesTransferred();
                transfer.bytesCurrent += progressEvent.getBytesTransferred();
            }
            updateProgress(transfer.id, transfer.bytesCurrent, transfer.bytesTotal);
        }
    }

    /**
     * Creates a {@link ProgressListener} for the given transfer with current
     * transferred bytes and total bytes.
     *
     * @param id id of the transfer
     * @return a progress listener
     */
    ProgressListener newProgressListener(int id) {
        final TransferRecord transfer = getTransfer(id);
        if (transfer == null) {
            throw new IllegalArgumentException("transfer " + id + " doesn't exist");
        }
        return new TransferProgressListener(transfer);
    }
}
