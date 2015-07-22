/**
 * This package contains helper classes for managing upload and download tasks and a public
 * class {@link com.amazonaws.mobileconnectors.s3.transferservice.transferManager}
 * which is a high level client that provides methods to control users' upload and download tasks.
 *
 * For starting transfer tasks, here is a sample usage.
 *
 * <pre>
 * // Initializes TransferUtility
 * TransferUtility transferManager = new TransferUtility(s3, getApplicationContext());
 * // Starts a download
 * TransferObserver observer = transferManager.download("bucket_name", "key", file);
 * observer.setTransferListener(new TransferListener() {
 *     public void onStateChanged(int id, String newState) {
 *         // Do something in the callback.
 *     }
 *
 *     public void onProgressChanged(int id, long bytesCurrent, long bytesTotal) {
 *         // Do something in the callback.
 *     }
 *
 *     public void onError(int id, Exception e) {
 *         // Do something in the callback.
 *     }
 * });
 * </pre>
 *
 * For pausing and resuming tasks:
 *
 * <pre>
 * // Gets id of the transfer.
 * int id = observer.getId();
 *
 * // Pauses the transfer.
 * transferManager.pause(id);
 *
 * // Resumes the transfer.
 * transferManager.resume(id);
 * </pre>
 *
 * For cancelling and deleting tasks:
 *
 * <pre>
 * // Cancels the transfer.
 * transferManager.cancel(id);
 *
 * // Deletes the transfer.
 * transferManager.delete(id);
 * </pre>
 *
 *
 * Please refer to {@link com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility} for more details.
 */

package com.amazonaws.mobileconnectors.s3.transferutility;

