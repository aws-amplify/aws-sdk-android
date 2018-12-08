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

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataConflictException;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataStorageException;
import com.amazonaws.mobileconnectors.cognito.exceptions.DatasetNotFoundException;
import com.amazonaws.mobileconnectors.cognito.exceptions.NetworkException;
import com.amazonaws.mobileconnectors.cognito.internal.storage.CognitoSyncStorage;
import com.amazonaws.mobileconnectors.cognito.internal.storage.LocalStorage;
import com.amazonaws.mobileconnectors.cognito.internal.storage.RemoteDataStorage;
import com.amazonaws.mobileconnectors.cognito.internal.storage.RemoteDataStorage.DatasetUpdates;
import com.amazonaws.mobileconnectors.cognito.internal.storage.SQLiteLocalStorage;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.amazonaws.mobileconnectors.cognito.internal.util.StringUtils;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

/**
 * Default implementation of {@link Dataset}. It uses {@link CognitoSyncStorage}
 * as remote storage and {@link SQLiteLocalStorage} as local storage.
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
class DefaultDataset implements Dataset {

    private static final Log LOGGER = LogFactory.getLog(DefaultDataset.class);
    
    /**
     * Max number of retries during synchronize before it gives up.
     */
    private static final int MAX_RETRY = 3;

    /**
     * Context that the dataset is attached to
     */
    private final Context context;

    /**
     * Non empty dataset name
     */
    private final String datasetName;
    /**
     * Local storage
     */
    private final LocalStorage local;
    /**
     * Remote storage
     */
    private final RemoteDataStorage remote;
    /**
     * Identity id
     */
    private final CognitoCachingCredentialsProvider provider;

    /**
     * Constructs a DefaultDataset object
     * 
     * @param context context of this dataset
     * @param datasetName non empty dataset name
     * @param provider the credentials provider
     * @param local an instance of LocalStorage
     * @param remote an instance of RemoteDataStorage
     */
    public DefaultDataset(Context context, String datasetName,
            CognitoCachingCredentialsProvider provider,
            LocalStorage local, RemoteDataStorage remote) {
        this.context = context;
        this.datasetName = datasetName;
        this.provider = provider;
        this.local = local;
        this.remote = remote;
    }

    @Override
    public void put(String key, String value) {
        local.putValue(getIdentityId(), datasetName,
                DatasetUtils.validateRecordKey(key), value);
    }

    @Override
    public void remove(String key) {
        local.putValue(getIdentityId(), datasetName,
                DatasetUtils.validateRecordKey(key), null);
    }

    @Override
    public String get(String key) {
        return local.getValue(getIdentityId(), datasetName,
                DatasetUtils.validateRecordKey(key));
    }

    @Override
    public void synchronize(final SyncCallback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("callback can't be null");
        }

        if (!isNetworkAvailable(context)) {
            callback.onFailure(new NetworkException("Network connectivity unavailable."));
            return;
        }

        discardPendingSyncRequest();

        new Thread(new Runnable() {
            @Override
            public void run() {
                LOGGER.debug("start to synchronize " + datasetName);

                boolean result = false;
                try {
                    List<String> mergedDatasets = getLocalMergedDatasets();
                    boolean doSync = true;
                    if (!mergedDatasets.isEmpty()) {
                        LOGGER.info("detected merge datasets " + datasetName);
                        doSync = callback.onDatasetsMerged(DefaultDataset.this, mergedDatasets);
                    }
                    if (doSync) {
                        result = synchronizeInternal(callback, MAX_RETRY);
                    }
                } catch (Exception e) {
                    callback.onFailure(new DataStorageException("Unknown exception", e));
                }

                if (result) {
                    LOGGER.debug("successfully synchronize " + datasetName);
                } else {
                    LOGGER.debug("failed to synchronize " + datasetName);
                }
            }
        }).start();
    }

    /**
     * Deletes the remote dataset, and purges the local dataset.
     * 
     * @param callback
     * @return Success or failure
     */
    boolean deleteLocalAndPurgeRemoteDataset(final SyncCallback callback) {
        try {
            try {
                remote.deleteDataset(datasetName);
            } catch (DatasetNotFoundException e) {
                // This exception will fire if this was a local-only dataset and
                // should be ignored
                LOGGER.debug("Possibly a local-only dataset", e);
            }
            local.purgeDataset(getIdentityId(), datasetName);
            callback.onSuccess(DefaultDataset.this, Collections.<Record>emptyList());
            return true;
        } catch (DataStorageException dse) {
            callback.onFailure(dse);
            return false;
        }
    }

    /**
     * Performs the merge callback, and resumes or cancels depending on the
     * response
     * 
     * @param callback the SyncCallback
     * @param datasetUpdates The current updates from the remote
     * @param retry The current retry count
     * @return If the synchronization succeeded
     */
    boolean handleDatasetMerge(final SyncCallback callback,
            final DatasetUpdates datasetUpdates, int retry) {
        boolean resume = callback.onDatasetsMerged(DefaultDataset.this,
                new ArrayList<String>(datasetUpdates.getMergedDatasetNameList()));
        if (resume) {
            return synchronizeInternal(callback, --retry);
        } else {
            callback.onFailure(new DataStorageException("Manual cancel"));
            return false;
        }
    }

    /**
     * Deletes and purges the local dataset if the client wants to continue the
     * synchronization upon the remote dataset being deleted, and calls
     * appropriate callbacks
     * 
     * @param callback the SyncCallback
     * @param datasetUpdates The updates from the remote
     * @return The result of the client onDatasetDeleted callback
     */
    boolean removeLocalDataset(final SyncCallback callback,
            final DatasetUpdates datasetUpdates) {
        boolean resume = callback
                .onDatasetDeleted(DefaultDataset.this, datasetUpdates.getDatasetName());
        if (resume) {
            // remove both records and metadata
            local.deleteDataset(getIdentityId(), datasetName);
            local.purgeDataset(getIdentityId(), datasetName);
            callback.onSuccess(DefaultDataset.this, Collections.<Record>emptyList());
            return true;
        } else {
            callback.onFailure(new DataStorageException("Manual cancel"));
            return false;
        }
    }

    /**
     * Handles remote records (if there are any) by A. Handling conflicts B.
     * Updating the local store with new remote records C. Updating the local
     * sync count
     * 
     * @param callback
     * @param datasetUpdates
     * @return True, unless the developer does not want to continue syncing upon
     *         a sync conflict
     */
    boolean handleRemoteRecords(final SyncCallback callback,
            final DatasetUpdates datasetUpdates) {
        List<Record> remoteRecords = datasetUpdates.getRecords();

        if (!remoteRecords.isEmpty()) {

            // if conflict, prompt developer/user with callback
            List<SyncConflict> conflicts = new ArrayList<SyncConflict>();
            Iterator<Record> iter = remoteRecords.iterator();
            while (iter.hasNext()) {
                Record remoteRecord = iter.next();
                Record localRecord = local.getRecord(getIdentityId(),
                        datasetName,
                        remoteRecord.getKey());
                // only when local is changed and its value is different
                if (localRecord != null && localRecord.isModified()
                        && localRecord.getSyncCount() != remoteRecord.getSyncCount()
                        && !StringUtils.equals(localRecord.getValue(), remoteRecord.getValue())) {
                    conflicts.add(new SyncConflict(remoteRecord, localRecord));
                    // remove it from remote changes, it has been marked as a
                    // conflict
                    // and will be updated by conflict resolution
                    iter.remove();
                }
            }
            if (!conflicts.isEmpty()) {
                LOGGER.info(String.format("%d records in conflict!", conflicts.size()));
                if (!callback.onConflict(DefaultDataset.this, conflicts)) {
                    // if they didn't want to continue on resolving conflicts
                    // return
                    return false;
                }
            }

            // if there are non-conflicting records from the remote, update them
            // in local
            if (!remoteRecords.isEmpty()) {
                LOGGER.info(String.format("save %d records to local", remoteRecords.size()));
                local.putRecords(getIdentityId(), datasetName, remoteRecords);
            }
            // new last sync count
            LOGGER.info(String.format("updated sync count %d", datasetUpdates.getSyncCount()));
            local.updateLastSyncCount(getIdentityId(), datasetName,
                    datasetUpdates.getSyncCount());
        }

        return true;
    }

    /**
     * Handles local modifications by: A. Pushing local changes to remote B.
     * Putting the result of the remote push to the local store C. Updating the
     * last sync count
     * 
     * @param callback the SyncCallback
     * @param datasetUpdates The updates from the remote store
     * @param retry The current retry count
     * @return If this portion of the synchronization was successful
     */
    boolean handleLocalModifications(final SyncCallback callback,
            final DatasetUpdates datasetUpdates, int retry) {

        // push changes to remote
        List<Record> localChanges = getModifiedRecords();

        if (!localChanges.isEmpty()) {

            long lastSyncCount = datasetUpdates.getSyncCount();

            long maxPatchSyncCount = 0;
            for (Record record : localChanges) {
                if (record.getSyncCount() > maxPatchSyncCount) {
                    maxPatchSyncCount = record.getSyncCount();
                }
            }

            LOGGER.info(String.format("push %d records to remote", localChanges.size()));
            List<Record> result = null;
            try {
                SharedPreferences sp = getSharedPreferences();
                String deviceId = sp.getString(namespaceIdPlatform("deviceId"), null);
                result = remote.putRecords(datasetName, localChanges,
                        datasetUpdates.getSyncSessionToken(), deviceId);
            } catch (DataConflictException dce) {
                LOGGER.info("conflicts detected when pushing changes to remote.");
                if (lastSyncCount > maxPatchSyncCount) {
                    local.updateLastSyncCount(getIdentityId(), datasetName, maxPatchSyncCount);
                }
                return synchronizeInternal(callback, --retry);
            } catch (DataStorageException dse) {
                callback.onFailure(dse);
                return false;
            }

            // update local meta data
            local.conditionallyPutRecords(getIdentityId(), datasetName, result, localChanges);

            // verify the server sync count is increased exactly by one, meaning
            // no
            // other updates were made during this update.
            long newSyncCount = 0;
            for (Record record : result) {
                newSyncCount = newSyncCount < record.getSyncCount()
                        ? record.getSyncCount()
                        : newSyncCount;
            }

            if (newSyncCount == lastSyncCount + 1) {
                LOGGER.info(String.format("updated sync count %d", newSyncCount));
                local.updateLastSyncCount(getIdentityId(), datasetName,
                        newSyncCount);
            }
        }

        // call back
        callback.onSuccess(DefaultDataset.this, datasetUpdates.getRecords());
        return true;
    }

    /**
     * Internal method for synchronization.
     * 
     * @param callback callback during synchronization
     * @param retry number of retries before it's considered failure
     * @return true if synchronize successfully, false otherwise
     */
    synchronized boolean synchronizeInternal(final SyncCallback callback, int retry) {
        if (retry < 0) {
            LOGGER.error("Synchronize failed because it exceeded the maximum retries");
            callback.onFailure(new DataStorageException(
                    "Synchronize failed because it exceeded the maximum retries"));
            return false;
        }

        long lastSyncCount = local.getLastSyncCount(getIdentityId(), datasetName);

        // if dataset is deleted locally, push it to remote
        if (lastSyncCount == -1) {
            return deleteLocalAndPurgeRemoteDataset(callback);
        }

        // get latest modified records from remote
        LOGGER.debug("get latest modified records since " + lastSyncCount);
        DatasetUpdates datasetUpdates = null;
        try {
            datasetUpdates = remote.listUpdates(datasetName, lastSyncCount);
        } catch (DataStorageException e) {
            callback.onFailure(e);
            return false;
        }

        if (!datasetUpdates.getMergedDatasetNameList().isEmpty()) {
            return handleDatasetMerge(callback, datasetUpdates, retry);
        }

        // if the dataset doesn't exist or is deleted, trigger onDelete
        if (lastSyncCount != 0 && !datasetUpdates.isExists()
                || datasetUpdates.isDeleted()) {
            return removeLocalDataset(callback, datasetUpdates);
        }

        if (!handleRemoteRecords(callback, datasetUpdates)) {
            return false;
        }

        return handleLocalModifications(callback, datasetUpdates, retry);
    }

    @Override
    public List<Record> getAllRecords() {
        return local.getRecords(getIdentityId(), datasetName);
    }

    @Override
    public long getTotalSizeInBytes() {
        long size = 0;
        for (Record record : local.getRecords(getIdentityId(), datasetName)) {
            size += DatasetUtils.computeRecordSize(record);
        }
        return size;
    }

    @Override
    public long getSizeInBytes(String key) {
        return DatasetUtils.computeRecordSize(local.getRecord(getIdentityId(),
                datasetName, DatasetUtils.validateRecordKey(key)));
    }

    @Override
    public boolean isChanged(String key) {
        Record record = local.getRecord(getIdentityId(), datasetName,
                DatasetUtils.validateRecordKey(key));
        return (record != null && record.isModified());
    }

    @Override
    public void delete() {
        local.deleteDataset(getIdentityId(), datasetName);
    }

    @Override
    public DatasetMetadata getDatasetMetadata() {
        return local.getDatasetMetadata(getIdentityId(), datasetName);
    }

    @Override
    public void resolve(List<Record> remoteRecords) {
        local.putRecords(getIdentityId(), datasetName, remoteRecords);
    }

    @Override
    public void putAll(Map<String, String> values) {
        for (String key : values.keySet()) {
            DatasetUtils.validateRecordKey(key);
        }
        local.putAllValues(getIdentityId(), datasetName, values);
    }

    @Override
    public Map<String, String> getAll() {
        Map<String, String> map = new HashMap<String, String>();
        for (Record record : local.getRecords(getIdentityId(), datasetName)) {
            if (!record.isDeleted()) {
                map.put(record.getKey(), record.getValue());
            }
        }
        return map;
    }

    String getIdentityId() {
        return DatasetUtils.getIdentityId(provider);
    }

    /**
     * Gets a list of records that have been modified (marking as deleted
     * included).
     * 
     * @return a list of locally modified records
     */
    List<Record> getModifiedRecords() {
        return local.getModifiedRecords(getIdentityId(), datasetName);
    }

    /**
     * Gets a list of merged datasets that are marked as merged but haven't been
     * processed.
     * 
     * @param datasetName dataset name
     * @return a list dataset names that are marked as merged
     */
    List<String> getLocalMergedDatasets() {
        List<String> mergedDatasets = new ArrayList<String>();
        String prefix = datasetName + ".";
        for (DatasetMetadata dataset : local.getDatasets(getIdentityId())) {
            if (dataset.getDatasetName().startsWith(prefix)) {
                mergedDatasets.add(dataset.getDatasetName());
            }
        }
        return mergedDatasets;
    }

    /**
     * Pending sync request, set when connectivity is unavailable
     */
    private SyncOnConnectivity pendingSyncRequest = null;

    /**
     * This customized broadcast receiver will perform a sync once the
     * connectivity is back.
     */
    static class SyncOnConnectivity extends BroadcastReceiver {
        WeakReference<Dataset> datasetRef;
        WeakReference<SyncCallback> callbackRef;

        SyncOnConnectivity(Dataset dataset, SyncCallback callback) {
            datasetRef = new WeakReference<Dataset>(dataset);
            callbackRef = new WeakReference<Dataset.SyncCallback>(callback);
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if (!DefaultDataset.isNetworkAvailable(context)) {
                LOGGER.debug("Connectivity is unavailable.");
                return;
            }
            LOGGER.debug("Connectivity is available. Try synchronizing.");
            context.unregisterReceiver(this);

            // dereference dataset and callback
            Dataset dataset = datasetRef.get();
            SyncCallback callback = callbackRef.get();
            // make sure they are valid
            if (dataset == null || callback == null) {
                LOGGER.warn("Abort syncOnConnectivity because either dataset "
                        + "or callback was garbage collected");
            } else {
                dataset.synchronize(callback);
            }
        }
    }

    @Override
    public void synchronizeOnConnectivity(SyncCallback callback) {
        if (isNetworkAvailable(context)) {
            synchronize(callback);
        } else {
            discardPendingSyncRequest();
            LOGGER.debug("Connectivity is unavailable. "
                    + "Scheduling synchronize for when connectivity is resumed.");
            pendingSyncRequest = new SyncOnConnectivity(this, callback);
            // listen to only connectivity change
            context.registerReceiver(pendingSyncRequest,
                    new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
        }
    }

    void discardPendingSyncRequest() {
        if (pendingSyncRequest != null) {
            LOGGER.debug("Discard previous pending sync request");
            synchronized (this) {
                try {
                    context.unregisterReceiver(pendingSyncRequest);
                } catch (IllegalArgumentException e) {
                    // ignore in case it has been unregistered
                    LOGGER.debug("SyncOnConnectivity has been unregistered.");
                }
                pendingSyncRequest = null;
            }
        }
    }

    static boolean isNetworkAvailable(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cm == null) {
            return false;
        }
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnected();
    }

    @Override
    public long getLastSyncCount() {
        return local.getLastSyncCount(getIdentityId(), datasetName);
    }

    @Override
    public void unsubscribe() {
        String deviceId = getSharedPreferences().getString(namespaceIdPlatform("deviceId"), "");
        if (deviceId.isEmpty()) {
            throw new IllegalStateException("Device hasn't been registered yet");
        }
        remote.unsubscribeFromDataset(datasetName, deviceId);
    }

    @Override
    public void subscribe() {
        String deviceId = getSharedPreferences().getString(namespaceIdPlatform("deviceId"), "");
        if (deviceId.isEmpty()) {
            throw new IllegalStateException("Device hasn't been registered yet");
        }
        remote.subscribeToDataset(datasetName, deviceId);
    }

    private SharedPreferences getSharedPreferences() {
        return context.getSharedPreferences("com.amazonaws.mobileconnectors.cognito",
                Context.MODE_PRIVATE);
    }
    
    // prefix the key with identity id and platform
    String namespaceIdPlatform(String key) {
        String platform = getSharedPreferences().getString(namespaceId("platform"), "");
        return namespaceId(platform) + "." + key;
    }
    
    // prefix the name with the cached identity id
    String namespaceId(String key) {
        // This is always called by something requiring a separate thread, the get
        // id call checks the cache first, and it's called in sync after pulling from 
        // remote (which would require an id). As a result, we use get id, not the cache.
        return provider.getIdentityId() + "." + key;
    }
}
