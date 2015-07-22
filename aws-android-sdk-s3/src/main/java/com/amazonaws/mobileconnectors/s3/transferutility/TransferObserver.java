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

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

import java.util.Arrays;
import java.util.HashSet;

/**
 * TransferObserver is used to track state and progress of a transfer.
 * Applications can set a listener and will get notified when progress or state
 * changes.
 */
public class TransferObserver {

    /**
     * Some temporary states that should not be notified.
     */
    private static HashSet<TransferState> STATES_NOT_TO_NOTIFY = new HashSet<TransferState>(
            Arrays.asList(TransferState.PART_COMPLETED,
                    TransferState.PENDING_CANCEL, TransferState.PENDING_PAUSE,
                    TransferState.PENDING_NETWORK_DISCONNECT));

    private final Context context;
    private final TransferContentObserver observer;
    private final int id;
    private long bytesTotal;
    private long bytesTransferred;
    private TransferState transferState;
    private String filePath;
    private TransferListener transferListener;
    private final TransferDBUtil dbUtil;

    /**
     * Constructs a TransferObserver and initializes fields with the given
     * arguments.
     *
     * @param id The transfer id of the transfer to be observed.
     * @param context A Context instance.
     * @param bytesTotal Total bytes to be transferred.
     */
    public TransferObserver(int id, Context context, long bytesTotal) {
        this.id = id;
        this.context = context;
        this.bytesTotal = bytesTotal;
        transferState = TransferState.WAITING;
        dbUtil = new TransferDBUtil(this.context);
        refresh();
        observer = new TransferContentObserver();
    }

    /**
     * Refresh fields in the TransferObserver from the running transfer task. If
     * TransferListener is set, then there's no need to call this method.
     */
    public void refresh() {
        Cursor c = dbUtil.queryTransferById(id);
        if (c != null) {
            c.moveToFirst();
            bytesTotal = c.getLong(c.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL));
            bytesTransferred = c.getLong(c
                    .getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_CURRENT));
            transferState = TransferState.getState(c.getString(c
                    .getColumnIndexOrThrow(TransferTable.COLUMN_STATE)));
            filePath = c.getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_FILE));
            c.close();
        }
    }

    /**
     * Sets a listener used to receive notification when state or progress
     * changes.
     *
     * @param listener A TransferListener used to receive notification.
     */
    public void setTransferListener(TransferListener listener) {
        if (listener == null) {
            cleanTransferListener();
            return;
        }
        transferListener = listener;
        context.getContentResolver().registerContentObserver(dbUtil.getRecordUri(id),
                true, observer);
    }

    /**
     * Gets the transfer id of the record.
     *
     * @return The transfer id.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the total bytes to transfer.
     *
     * @return The total bytes of the transfer.
     */
    public long getBytesTotal() {
        return bytesTotal;
    }

    /**
     * Gets the absolute path of file to transfer.
     *
     * @return The absolute path of the file transferred.
     */
    public String getAbsoluteFilePath() {
        return filePath;
    }

    /**
     * Gets the bytes transferred currently.
     *
     * @return The bytes currently transferred.
     */
    public long getBytesTransferred() {
        return bytesTransferred;
    }

    /**
     * Gets the state of the transfer task.
     *
     * @return The current state of the transfer.
     */
    public TransferState getState() {
        return transferState;
    }

    /**
     * Cleans the transfer listener.
     */
    public void cleanTransferListener() {
        context.getContentResolver().unregisterContentObserver(observer);
    }

    /**
     * An inner class extending ContentObserver, used to listen to changes of a
     * specific transfer record in the database.
     */
    private class TransferContentObserver extends ContentObserver {
        public TransferContentObserver() {
            super(new Handler());
        }

        @Override
        public void onChange(boolean selfChange) {
            if (transferListener == null) {
                return;
            }
            Cursor c = dbUtil.queryTransferById(id);

            if (c == null) {
                transferListener.onError(id,
                        new IllegalStateException("Transfer record not found."));
                return;
            } else if (!c.moveToFirst()) {
                // Transfer was deleted
                return;
            }

            // Check state
            String stateString = c.getString(c.getColumnIndexOrThrow(TransferTable.COLUMN_STATE));
            TransferState state = null;
            if (stateString != null && !stateString.equalsIgnoreCase("")) {
                state = TransferState.getState(stateString);
            }

            if (state != null && !state.equals(transferState)) {
                transferState = state;
                if (!STATES_NOT_TO_NOTIFY.contains(state)) {
                    transferListener.onStateChanged(id, transferState);
                }
                if (TransferState.FAILED.equals(transferState)) {
                    // TODO: get error message from database.
                    transferListener.onError(id, new IllegalStateException("Transfer failed."));
                }
            }
            // Check bytes transferred and total bytes
            if (TransferState.IN_PROGRESS.equals(state)
                    || TransferState.COMPLETED.equals(state)) {
                long bytesCurrent = c.getLong(c
                        .getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_CURRENT));
                long bytesTotal = c.getLong(c
                        .getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL));
                if (TransferObserver.this.bytesTotal != bytesTotal) {
                    TransferObserver.this.bytesTotal = bytesTotal;
                }
                if (bytesTransferred != bytesCurrent) {
                    bytesTransferred = bytesCurrent;
                    transferListener.onProgressChanged(id, bytesTransferred,
                            TransferObserver.this.bytesTotal);
                }
            }
            c.close();
        }
    }
}
