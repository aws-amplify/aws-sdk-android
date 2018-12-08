/**
 * Copyright 2013-2018 Amazon.com, 
 * Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Amazon Software License (the "License"). 
 * You may not use this file except in compliance with the 
 * License. A copy of the License is located at
 * 
 *     http://aws.amazon.com/asl/
 * 
 * or in the "license" file accompanying this file. This file is 
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, express or implied. See the License 
 * for the specific language governing permissions and 
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognito;

import com.amazonaws.mobileconnectors.cognito.exceptions.DataStorageException;

import java.util.List;
import java.util.Map;

/**
 * Dataset is the container of {@link Record}s. It can have up to 1k
 * {@link Record} or 1 MB in size. A typical use of {@link Dataset} is the
 * following.
 * 
 * <pre>
 * // open or create dataset
 * Dataset dataset = cognitoClient.openOrCreate(&quot;new dataset&quot;);
 * // synchronize. It pulls down latest changes from remote storage
 * // and push local changes to remote storage
 * dataset.synchronize(syncCallback);
 * // reads value
 * String highScore = dataset.getValue(&quot;high_score&quot;);
 * String name = dataset.getValue(&quot;name&quot;);
 * // sets value
 * dataset.put(&quot;high_score&quot;, &quot;90&quot;);
 * dataset.put(&quot;name&quot;, &quot;John&quot;);
 * // push changes to remote if needed
 * dataset.synchronizesyncCallback);
 * </pre>
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
public interface Dataset {

    /**
     * Retrieves the associated {@link DatasetMetadata} from local storage.
     * 
     * @return metadata
     */
    DatasetMetadata getDatasetMetadata();

    /**
     * Synchronize {@link Dataset} between local storage and remote storage.
     * 
     * @param callback call back
     */
    void synchronize(SyncCallback callback);

    /**
     * Attempt to synchronize {@link Dataset} when connectivity is available. If
     * the connectivity is available right away, it behaves the same as
     * {@link #synchronize(SyncCallback)}. Otherwise it listens to connectivity
     * changes, and will do a sync once the connectivity is back. Note that if
     * this method is called multiple times, only the last synchronize request
     * is kept and only the last callback will fire. If either the dataset or
     * the callback is garbage collected, this method will not perform a sync
     * and the callback won't fire.
     * 
     * @param callback call back
     */
    void synchronizeOnConnectivity(SyncCallback callback);

    /**
     * Gets the value of a {@link Record} with the given key. If the
     * {@link Record} doesn't exist or is marked deleted, null will be returned.
     * 
     * @param key key of the record in the dataset.
     * @return the string value of the record, or null if the record doesn't
     *         exist or is marked deleted.
     */
    String get(String key);

    /**
     * Puts a {@link Record} with the given key and value into the
     * {@link Dataset}. If a {@link Record} with the same key exists, its value
     * will be overwritten. If a {@link Record} is marked as deleted previously,
     * then it will be resurrected with new value while the sync count continues
     * with previous value. No matter whether the value changes or not, the
     * record is considered as updated, and it will be written to Cognito Sync
     * service on next synchronize operation. If value is null, a
     * {@link NullPointerException} will be thrown.
     * 
     * @param key key of the record
     * @param value string value of a {@link Record} to be put into the
     *            {@link Dataset}
     */
    void put(String key, String value);

    /**
     * @param values to be added to the dataset 
     */
    void putAll(Map<String, String> values);

    /**
     * Marks a {@link Record} with the given key as deleted. Nothing happens if
     * the {@link Record} doesn't exist or is deleted already.
     * 
     * @param key for the Record to be removed
     */
    void remove(String key);

    /**
     * Saves resolved conflicting {@link Record}s into local storage. This is
     * used inside {@link SyncCallback#onConflict(Dataset, List)} after you
     * resolve all conflicts.
     * 
     * @param resolvedConflicts a list of records to save into local storage
     */
    void resolve(List<Record> resolvedConflicts);

    /**
     * Retrieves all raw records, marked deleted or not, from local storage.
     * 
     * @return a list of all raw records
     */
    List<Record> getAllRecords();

    /**
     * Gets the key-value representation of all records of this dataset. Marked
     * as deleted records are excluded.
     * 
     * @return key-value representation of all records, excluding deleted ones
     */
    Map<String, String> getAll();

    /**
     * Gets the total size in bytes of this dataset. Records that are marked as
     * deleted don't contribute to the total size.
     * 
     * @return size in bytes
     */
    long getTotalSizeInBytes();

    /**
     * Gets the size of a record with the given key. If the key is deleted, -1
     * will be returned.
     * 
     * @param key the key of a record
     * @return size in bytes
     */
    long getSizeInBytes(String key);

    /**
     * Retrieves the status of a record.
     * 
     * @param key the key of a record
     * @return True if it is modified locally. False otherwise
     */
    boolean isChanged(String key);

    /**
     * Delete this {@link Dataset}. No more following operations on this
     * dataset, or else {@link IllegalStateException} will be thrown.
     */
    void delete();

    /**
     * Get the last sync count of this {@link Dataset}.
     * 
     * @return last sync count
     */
    long getLastSyncCount();

    /**
     * Subscribes the user to update notifications for a dataset. This should
     * only be called after the device has been registered.
     */
    void subscribe();

    /**
     * Unsubscribe the user from receiving notifications on updates to a dataset
     * which has previously been subscribed to.
     */
    void unsubscribe();

    /**
     * This is the callback used in {@link Dataset#synchronize(SyncCallback)}.
     */
    interface SyncCallback {
        /**
         * This is called after remote changes are downloaded to local storage
         * and local changes are uploaded to remote storage. Updated records
         * from remote storage are passed in the callback. If conflicts occur
         * during synchronize and are resolved in {@link #onConflict} after
         * several retries, then updatedRecords will be what are pulled down
         * from remote in the last retry.
         * 
         * @param dataset the dataset that performed sync
         * @param updatedRecords new records from remote storage that are
         *            downloaded
         */
        void onSuccess(Dataset dataset, List<Record> updatedRecords);

        /**
         * This can be triggered during two phases. One is when the remote
         * changes are about to be written to local storage. The other is when
         * local changes are uploaded to remote storage and got rejected. Here
         * is an example:
         * 
         * <pre>
         * List&lt;Record&gt; resolved = new ArrayList&lt;Record&gt;();
         * for (SyncConflict conflict : conflicts) {
         *     resolved.add(conflicts.resolveWithRemoteRecord());
         * }
         * dataset.save(resolved);
         * return true; // so that synchronize() can retry
         * </pre>
         * 
         * If you prefer to add additional logic when resolving conflict, you
         * can use {@link SyncConflict#resolveWithValue(String)}
         * 
         * <pre>
         * int remoteMoney = Integer.valueOf(conflicts.getRemote().getValue());
         * int localMoney = Integer.valueOf(conflicts.getLocal().getValue());
         * int total = remoteMoney + localMoney;
         * Record resolve = conflicts.resolveWithValue(String.valueOf(total));
         * </pre>
         * 
         * @param dataset the dataset that performed sync
         * @param conflicts conflicting records
         * @return true if conflicts are resolved so that synchronize will
         *         retry, false otherwise.
         */
        boolean onConflict(Dataset dataset, List<SyncConflict> conflicts);

        /**
         * This is triggered when the given dataset is deleted remotely. Return
         * true if you want to remove local dataset, or false if you want to
         * keep it.
         * 
         * @param dataset dataset handler
         * @param datasetName the name of the dataset that is deleted remotely
         * @return true to remove local dataset, or false to keep it
         */
        boolean onDatasetDeleted(Dataset dataset, String datasetName);

        /**
         * If two or more datasets are merged as a result of identity merge,
         * this will be triggered. A list of names of merged datasets' is passed
         * in. The merged dataset name will be appended with its old identity
         * id. One can open the merged dataset, synchronize the content,
         * reconcile with the current dataset, and remove it. This callback will
         * fire off until the merged dataset is removed.
         * 
         * @param dataset dataset handler
         * @param datasetNames a list of names of merged datasets'
         * @return true if the merge is resolved so that synchronize will retry, false otherwise.
         */
        boolean onDatasetsMerged(Dataset dataset, List<String> datasetNames);

        /**
         * This is called when an exception occurs during sync.
         * 
         * @param dse exception
         */
        void onFailure(DataStorageException dse);
    }

}
