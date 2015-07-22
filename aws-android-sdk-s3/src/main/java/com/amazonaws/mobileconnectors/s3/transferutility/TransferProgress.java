
package com.amazonaws.mobileconnectors.s3.transferutility;

import android.util.Log;

/**
 * Describes the progress of a transfer.
 */
final class TransferProgress {

    private static final String TAG = "TransferProgress";
    private volatile long bytesTransferred = 0;
    private volatile long totalBytesToTransfer = -1;

    /**
     * Returns the number of bytes completed in the associated transfer.
     *
     * @return The number of bytes completed in the associated transfer.
     */
    public long getBytesTransferred() {
        return bytesTransferred;
    }

    /**
     * Returns the total size in bytes of the associated transfer, or -1 if the
     * total size isn't known.
     *
     * @return The total size in bytes of the associated transfer. Returns or -1
     *         if the total size of the associated transfer isn't known yet.
     */
    public long getTotalBytesToTransfer() {
        return totalBytesToTransfer;
    }

    /**
     * Returns a percentage of the number of bytes transferred out of the total
     * number of bytes to transfer.
     *
     * @return A percentage of the number of bytes transferred out of the total
     *         number of bytes to transfer.
     */
    public synchronized double getPercentTransferred() {
        if (getBytesTransferred() < 0)
            return 0;

        return totalBytesToTransfer < 0
                ? -1.0
                : ((double) bytesTransferred / (double) totalBytesToTransfer) * 100;
    }

    public synchronized void updateProgress(long bytes) {
        this.bytesTransferred += bytes;
        if (totalBytesToTransfer > -1
                && this.bytesTransferred > this.totalBytesToTransfer) {
            this.bytesTransferred = this.totalBytesToTransfer;
            Log.d(TAG,
                    "Number of bytes transfered is more than the actual total bytes to transfer. Total number of bytes to Transfer : "
                            + totalBytesToTransfer
                            + ". Bytes Transferred: "
                            + (bytesTransferred + bytes));
        }
    }

    public void setTotalBytesToTransfer(long totalBytesToTransfer) {
        this.totalBytesToTransfer = totalBytesToTransfer;
    }
}
