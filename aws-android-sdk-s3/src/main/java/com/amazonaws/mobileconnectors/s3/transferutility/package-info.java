/**
 * This package contains helper classes for managing upload and download tasks and a public
 * class {@link com.amazonaws.mobileconnectors.s3.transferservice.transferUtility}
 * which is a high level client that provides methods to control users' upload and download tasks.
 *
 * For starting transfer tasks, here is a sample usage.
 *
 * <pre>
 * // Initializes TransferUtility
 * TransferUtility transferUtility = new TransferUtility(s3, getApplicationContext());
 * // Starts a download
 * TransferObserver observer = transferUtility.download("bucket_name", "key", file);
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
 * transferUtility.pause(id);
 *
 * // Resumes the transfer.
 * transferUtility.resume(id);
 * </pre>
 *
 * For cancelling and deleting tasks:
 *
 * <pre>
 * // Cancels the transfer.
 * transferUtility.cancel(id);
 *
 * // Deletes the transfer.
 * transferUtility.delete(id);
 * </pre>
 *
 * Note that the Activity or Service that instantiates and uses the
 * TransferUtility should keep a reference to the Amazon S3 client as a class
 * attribute. Failing to keep a reference may cause the TransferService to fail
 * since {@link TransferService} receives a weak reference to the AmazonS3
 * client allowing it to be garbage collected.
 */

package com.amazonaws.mobileconnectors.s3.transferutility;

