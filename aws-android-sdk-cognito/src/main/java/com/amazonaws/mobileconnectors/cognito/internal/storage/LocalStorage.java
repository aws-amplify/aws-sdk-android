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

package com.amazonaws.mobileconnectors.cognito.internal.storage;

import com.amazonaws.mobileconnectors.cognito.Dataset;
import com.amazonaws.mobileconnectors.cognito.DatasetMetadata;
import com.amazonaws.mobileconnectors.cognito.Record;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataStorageException;
import com.amazonaws.mobileconnectors.cognito.exceptions.DatasetNotFoundException;

import java.util.List;
import java.util.Map;

/**
 * The interface of local storage of {@link Dataset}.
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
public interface LocalStorage {

    /**
     * Retrieves the string value of a key in dataset. The value can be null
     * when the record doesn't exist or is marked as deleted.
     * 
     * @param identityId identity id
     * @param datasetName dataset name
     * @param key key of the record
     * @return string value of the record, or null if not present or deleted.
     */
    public String getValue(String identityId, String datasetName, String key);

    /**
     * Puts the value of a key in dataset. If a new value is assigned to the
     * key, the record is marked as dirty. If the value is null, then the record
     * is marked as deleted. The changed record will be synced with remote
     * storage.
     * 
     * @param identityId identity id
     * @param datasetName dataset name
     * @param key key of the record
     * @param value string value. If null, the record is marked as deleted.
     */
    public void putValue(String identityId, String datasetName, String key, String value);

    /**
     * Retrieves a key-value map from dataset, excluding marked as deleted
     * values.
     * 
     * @param identityId identity id
     * @param dataset dataset name
     * @return a key-value map of all but deleted values
     */
    public Map<String, String> getValueMap(String identityId, String datasetName);

    /**
     * Puts a key-value map into a dataset. This is optimized for batch
     * operation. It's the preferred way to put a list of records into dataset.
     * 
     * @param identityId identity id
     * @param datasetName dataset name
     * @param values a key-value map
     */
    public void putAllValues(String identityId, String datasetName, Map<String, String> values);

    /**
     * Gets a raw record from local store. If the dataset/key combo doesn't
     * exist, null will be returned.
     * 
     * @param identityId identity id
     * @param datasetName dataset name
     * @param key key of the record
     * @return a Record object if found, null otherwise.
     */
    public Record getRecord(String identityId, String datasetName, String key);

    /**
     * Gets a list of all records.
     * 
     * @param identityId identity id
     * @param datasetName the dataset name
     * @return A list of records which have been updated since lastSyncCount.
     */
    public List<Record> getRecords(String identityId, String datasetName);

    /**
     * Retrieves a list of locally modified records since last successful sync
     * operation.
     * 
     * @param identityId identity id
     * @param datasetName dataset name
     * @return a list of locally modified records
     */
    public List<Record> getModifiedRecords(String identityId, String datasetName);

    /**
     * Puts a list of raw records into dataset.
     * 
     * @param identityId identity id
     * @param datasetName dataset name
     * @param records a list of records
     */
    public void putRecords(String identityId, String datasetName, List<Record> records);
    
    /**
     * Puts a list of raw records into thet dataset if 
     * the local version hasn't changed (to be used in 
     * synchronizations). 
     * 
     * @param identityId identity id
     * @param datasetName dataset name
     * @param records a list of records to conditionally put
     * @param localRecords a list of records to check for changes
     */
    public void conditionallyPutRecords(String identityId, String datasetName, 
            List<Record> records, List<Record> localRecords);

    /**
     * Gets a list of datasets.
     * 
     * @param identityId identity id
     * @return a list of dataset metadata
     */
    public List<DatasetMetadata> getDatasets(String identityId) throws DataStorageException;

    /**
     * Deletes a dataset. It clears all records in this dataset and marked it as
     * deleted for future sync. It's still visible in {@link #getDatasets()}
     * 
     * @param identityId identity id
     * @param datasetName non empty dataset name
     */
    public void deleteDataset(String identityId, String datasetName)
            throws DatasetNotFoundException;

    /**
     * This is different from {@link #deleteDataset(String)}. Not only does it
     * clears all records in the dataset, it also remove it from metadata table.
     * It won't be visible in {@link #getDatasets()}.
     * 
     * @param identityId identity id
     * @param datasetName non empty dataset name
     */
    public void purgeDataset(String identityId, String datasetName);

    /**
     * Retrieves the metadata of a dataset.
     * 
     * @param identityId identity id
     * @param datasetName dataset name
     * @return the corresponding metadata
     * @throws DataStorageException
     */
    public DatasetMetadata getDatasetMetadata(String identityId, String datasetName)
            throws DataStorageException;

    /**
     * Retrieves the last sync count. This sync count is a counter that
     * represents when the last sync happened. The counter should be updated on
     * a successful sync.
     * 
     * @param identityId identity id
     * @param datasetName dataset name
     * @return last sync count.
     */
    public long getLastSyncCount(String identityId, String datasetName);

    /**
     * Updates the last sync count after successful sync with the remote data
     * store.
     * 
     * @param identityId identity id
     * @param datasetName dataset name
     * @param lastSyncCount new last sync count value
     */
    public void updateLastSyncCount(String identityId, String datasetName, long lastSyncCount);

    /**
     * Wipes all locally cached data including dataset metadata and records. All
     * opened dataset handler should not perform further operations to avoid
     * inconsistent state.
     */
    public void wipeData();

    /**
     * Reparent all datasets from old identity id to a new one.
     * 
     * @param oldIdentityId old identity id
     * @param newIdentityId new identity id
     */
    public void changeIdentityId(String oldIdentityId, String newIdentityId);

    /**
     * Updates local dataset metadata
     * 
     * @param identityId identity id
     * @param datasetMetadata a list of metadata to update
     */
    public void updateDatasetMetadata(String identityId, List<DatasetMetadata> datasetMetadata);
}
