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

import android.util.Log;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.mobileconnectors.cognito.DatasetMetadata;
import com.amazonaws.mobileconnectors.cognito.Record;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataAccessNotAuthorizedException;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataConflictException;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataLimitExceededException;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataStorageException;
import com.amazonaws.mobileconnectors.cognito.exceptions.DatasetNotFoundException;
import com.amazonaws.mobileconnectors.cognito.exceptions.NetworkException;
import com.amazonaws.mobileconnectors.cognito.exceptions.SubscribeFailedException;
import com.amazonaws.mobileconnectors.cognito.exceptions.UnsubscribeFailedException;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitosync.AmazonCognitoSync;
import com.amazonaws.services.cognitosync.AmazonCognitoSyncClient;
import com.amazonaws.services.cognitosync.model.DeleteDatasetRequest;
import com.amazonaws.services.cognitosync.model.DescribeDatasetRequest;
import com.amazonaws.services.cognitosync.model.DescribeDatasetResult;
import com.amazonaws.services.cognitosync.model.LimitExceededException;
import com.amazonaws.services.cognitosync.model.ListDatasetsRequest;
import com.amazonaws.services.cognitosync.model.ListDatasetsResult;
import com.amazonaws.services.cognitosync.model.ListRecordsRequest;
import com.amazonaws.services.cognitosync.model.ListRecordsResult;
import com.amazonaws.services.cognitosync.model.NotAuthorizedException;
import com.amazonaws.services.cognitosync.model.Operation;
import com.amazonaws.services.cognitosync.model.RecordPatch;
import com.amazonaws.services.cognitosync.model.ResourceConflictException;
import com.amazonaws.services.cognitosync.model.ResourceNotFoundException;
import com.amazonaws.services.cognitosync.model.SubscribeToDatasetRequest;
import com.amazonaws.services.cognitosync.model.UnsubscribeFromDatasetRequest;
import com.amazonaws.services.cognitosync.model.UpdateRecordsRequest;
import com.amazonaws.services.cognitosync.model.UpdateRecordsResult;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Cognito remote storage powered by AWS Cognito Sync service
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
public class CognitoSyncStorage implements RemoteDataStorage {

    private static final String TAG = "CognitoSyncStorage";

    /**
     * Identity pool id
     */
    private final String identityPoolId;
    private final AmazonCognitoSync client;
    private final CognitoCachingCredentialsProvider provider;

    /**
     * User agent string to append to all requests
     */
    private String userAgent;

    public CognitoSyncStorage(String identityPoolId, AmazonCognitoSync client,
            CognitoCachingCredentialsProvider provider) {
        this.identityPoolId = identityPoolId;
        this.client = client;
        this.provider = provider;
        userAgent = "";
    }

    @Deprecated
    public CognitoSyncStorage(String identityPoolId, Regions region,
            CognitoCachingCredentialsProvider provider) {
        this.identityPoolId = identityPoolId;
        this.provider = provider;
        client = new AmazonCognitoSyncClient(provider);
        client.setRegion(Region.getRegion(region));
        userAgent = "";
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.cognitov2.RemoteStorage#listDatasets()
     */
    @Override
    public List<DatasetMetadata> getDatasets() {
        List<DatasetMetadata> datasets = new ArrayList<DatasetMetadata>();

        String nextToken = null;
        do {
            ListDatasetsRequest request = new ListDatasetsRequest();
            appendUserAgent(request, userAgent);
            request.setIdentityPoolId(identityPoolId);
            // a large enough number to reduce # of requests
            request.setMaxResults(64);
            request.setNextToken(nextToken);

            ListDatasetsResult result = null;
            try {
                request.setIdentityId(getIdentityId());
                result = client.listDatasets(request);
            } catch (AmazonClientException ace) {
                throw handleException(ace, "Failed to list dataset metadata");
            }
            for (com.amazonaws.services.cognitosync.model.Dataset dataset : result.getDatasets()) {
                datasets.add(modelToDatasetMetadata(dataset));
            }

            nextToken = result.getNextToken();
        } while (nextToken != null);

        return datasets;
    }

    @Override
    public DatasetUpdates listUpdates(String datasetName, long lastSyncCount) {
        DatasetUpdatesImpl.Builder builder = new DatasetUpdatesImpl.Builder(datasetName);

        String nextToken = null;
        do {
            ListRecordsRequest request = new ListRecordsRequest();
            appendUserAgent(request, userAgent);
            request.setIdentityPoolId(identityPoolId);
            request.setDatasetName(datasetName);
            request.setLastSyncCount(lastSyncCount);
            // mark it large enough to reduce # of requests
            request.setMaxResults(1024);
            request.setNextToken(nextToken);
            ListRecordsResult result = null;
            try {
                request.setIdentityId(getIdentityId());
                result = client.listRecords(request);
            } catch (AmazonClientException ace) {
                throw handleException(ace, "Failed to list records in dataset: " + datasetName);
            }
            for (com.amazonaws.services.cognitosync.model.Record remoteRecord : result.getRecords()) {
                builder.addRecord(modelToRecord(remoteRecord));
            }
            builder.syncSessionToken(result.getSyncSessionToken())
                    .syncCount(result.getDatasetSyncCount())
                    .exists(result.isDatasetExists())
                    .deleted(result.isDatasetDeletedAfterRequestedSyncCount())
                    .mergedDatasetNameList(result.getMergedDatasetNames());

            // update last evaluated key
            nextToken = result.getNextToken();
        } while (nextToken != null);

        return builder.build();
    }

    /*
     * (non-Javadoc)
     * @see com.amazonaws.cognitov2.RemoteStorage#saveRecords(java.lang.String,
     * java.util.List)
     */
    @Override
    public List<Record> putRecords(String datasetName, List<Record> records,
            String syncSessionToken, String deviceId) {
        UpdateRecordsRequest request = new UpdateRecordsRequest();
        appendUserAgent(request, userAgent);
        request.setDatasetName(datasetName);
        request.setIdentityPoolId(identityPoolId);
        request.setDeviceId(deviceId);
        request.setSyncSessionToken(syncSessionToken);
        // create patches
        List<RecordPatch> patches = new ArrayList<RecordPatch>();
        for (Record record : records) {
            patches.add(recordToPatch(record));
        }
        request.setRecordPatches(patches);
        List<Record> updatedRecords = new ArrayList<Record>();
        try {
            request.setIdentityId(getIdentityId());
            UpdateRecordsResult result = client.updateRecords(request);
            for (com.amazonaws.services.cognitosync.model.Record remoteRecord : result.getRecords()) {
                updatedRecords.add(modelToRecord(remoteRecord));
            }
        } catch (AmazonClientException ace) {
            throw handleException(ace, "Failed to update records in dataset: " + datasetName);
        }

        return updatedRecords;
    }

    @Override
    public void deleteDataset(String datasetName) {
        DeleteDatasetRequest request = new DeleteDatasetRequest();
        appendUserAgent(request, userAgent);
        request.setIdentityPoolId(identityPoolId);
        request.setDatasetName(datasetName);
        try {
            request.setIdentityId(getIdentityId());
            client.deleteDataset(request);
        } catch (AmazonClientException ace) {
            throw handleException(ace, "Failed to delete dataset: " + datasetName);
        }
    }

    /**
     * Converts a record to a RecordPatch operation.
     * 
     * @param record
     * @return
     */
    RecordPatch recordToPatch(Record record) {
        RecordPatch patch = new RecordPatch();
        patch.setKey(record.getKey());
        patch.setValue(record.getValue());
        patch.setSyncCount(record.getSyncCount());
        patch.setOp(record.getValue() == null ? Operation.Remove : Operation.Replace);
        if (record.getDeviceLastModifiedDate() != null) {
            patch.setDeviceLastModifiedDate(record.getDeviceLastModifiedDate());
        }
        return patch;
    }

    /**
     * Converts a Cognito sync service Record object to generic Record object.
     * 
     * @param model a service model object
     * @return Record object
     */
    Record modelToRecord(com.amazonaws.services.cognitosync.model.Record model) {
        return new Record.Builder(model.getKey())
                .value(model.getValue())
                .syncCount(model.getSyncCount() == null ? 0 : model.getSyncCount())
                .lastModifiedBy(model.getLastModifiedBy())
                .lastModifiedDate(model.getLastModifiedDate() == null
                        ? new Date(0)
                        : model.getLastModifiedDate())
                .deviceLastModifiedDate(model.getDeviceLastModifiedDate() == null
                        ? new Date(0)
                        : model.getDeviceLastModifiedDate())
                .modified(false)
                .build();
    }

    @Override
    public DatasetMetadata getDatasetMetadata(String datasetName) throws DataStorageException {
        DescribeDatasetRequest request = new DescribeDatasetRequest();
        appendUserAgent(request, userAgent);
        request.setIdentityPoolId(identityPoolId);
        DatasetMetadata dataset = null;
        try {
            request.setIdentityId(getIdentityId());
            request.setDatasetName(datasetName);
            DescribeDatasetResult result = client.describeDataset(request);
            dataset = modelToDatasetMetadata(result.getDataset());
        } catch (AmazonClientException ace) {
            throw handleException(ace, "Failed to get metadata of dataset: " + datasetName);
        }
        return dataset;
    }

    /**
     * Translate AmazonClientException to DataStorageException.
     * 
     * @param ace an AmazonClientException
     * @param message extra message to include
     * @return an DataStorageException
     */
    DataStorageException handleException(AmazonClientException ace, String message) {
        if (ace instanceof ResourceNotFoundException) {
            return new DatasetNotFoundException(message);
        } else if (ace instanceof ResourceConflictException) {
            return new DataConflictException(message);
        } else if (ace instanceof LimitExceededException) {
            return new DataLimitExceededException(message);
        } else if (ace instanceof NotAuthorizedException) {
            return new DataAccessNotAuthorizedException(message);
        } else if (isNetworkException(ace)) {
            return new NetworkException(message);
        } else {
            return new DataStorageException(message, ace);
        }
    }

    String getIdentityId() throws AmazonClientException, NotAuthorizedException {
        return provider.getIdentityId();
    }

    /**
     * Test whether an AmazonClientException is caused by network problem.
     * 
     * @param ace an AmazonClientException
     * @return true if the exception is caused by network problem, false
     *         otherwise.
     */
    boolean isNetworkException(AmazonClientException ace) {
        return ace.getCause() instanceof IOException;
    }

    /**
     * Sets the user agent string to append to all requests made by this client.
     * 
     * @param userAgent user agent string to append
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * Append user agent string to the request. The final string is what is set
     * in the ClientCofniguration concatenated with the given userAgent string.
     * 
     * @param request the request object to be appended
     * @param userAgent additional user agent string to append
     */
    void appendUserAgent(AmazonWebServiceRequest request, String userAgent) {
        request.getRequestClientOptions().appendUserAgent(userAgent);
    }

    @Override
    public void unsubscribeFromDataset(String datasetName, String deviceId) {
        String identityId = provider.getIdentityId();
        UnsubscribeFromDatasetRequest request = new UnsubscribeFromDatasetRequest()
                .withIdentityPoolId(provider.getIdentityPoolId())
                .withIdentityId(identityId)
                .withDatasetName(datasetName)
                .withDeviceId(deviceId);
        try {
            client.unsubscribeFromDataset(request);
        } catch (AmazonClientException ace) {
            Log.e(TAG, "Failed to unsubscribe from dataset", ace);
            throw new UnsubscribeFailedException("Failed to unsubscribe from dataset", ace);
        }
    }

    @Override
    public void subscribeToDataset(String datasetName, String deviceId) {
        String identityId = provider.getIdentityId();
        SubscribeToDatasetRequest request = new SubscribeToDatasetRequest()
                .withIdentityPoolId(provider.getIdentityPoolId())
                .withIdentityId(identityId)
                .withDatasetName(datasetName)
                .withDeviceId(deviceId);
        try {
            client.subscribeToDataset(request);
        } catch (AmazonClientException ace) {
            Log.e(TAG, "Failed to subscribe to dataset", ace);
            throw new SubscribeFailedException("Failed to subscribe to dataset", ace);
        }
    }

    private DatasetMetadata modelToDatasetMetadata(
            com.amazonaws.services.cognitosync.model.Dataset model) {
        return new DatasetMetadata.Builder(model.getDatasetName())
                .creationDate(model.getCreationDate())
                .lastModifiedDate(model.getLastModifiedDate())
                .lastModifiedBy(model.getLastModifiedBy())
                .storageSizeBytes(model.getDataStorage())
                .recordCount(model.getNumRecords())
                .build();
    }

    static class DatasetUpdatesImpl implements DatasetUpdates {
        private final String datasetName;
        private final List<Record> records;
        private final long syncCount;
        private final String syncSessionToken;
        private final boolean exists;
        private final boolean deleted;
        private final List<String> mergedDatasetNameList;

        @Override
        public String getDatasetName() {
            return datasetName;
        }

        @Override
        public List<Record> getRecords() {
            return records;
        }

        @Override
        public long getSyncCount() {
            return syncCount;
        }

        @Override
        public String getSyncSessionToken() {
            return syncSessionToken;
        }

        @Override
        public boolean isExists() {
            return exists;
        }

        @Override
        public boolean isDeleted() {
            return deleted;
        }

        @Override
        public List<String> getMergedDatasetNameList() {
            return mergedDatasetNameList;
        }

        private DatasetUpdatesImpl(Builder builder) {
            this.datasetName = builder.datasetName;
            this.records = builder.records;
            this.syncCount = builder.syncCount;
            this.syncSessionToken = builder.syncSessionToken;
            this.exists = builder.exists;
            this.deleted = builder.deleted;
            this.mergedDatasetNameList = builder.mergedDatasetNameList;
        }

        static class Builder {
            private final String datasetName;
            private final List<Record> records = new ArrayList<Record>();
            private long syncCount = 0;
            private String syncSessionToken;
            private boolean exists = true;
            private boolean deleted = false;
            private final List<String> mergedDatasetNameList = new ArrayList<String>();

            Builder(String datasetName) {
                this.datasetName = datasetName;
            }

            Builder syncSessionToken(String syncSessionToken) {
                this.syncSessionToken = syncSessionToken;
                return this;
            }

            Builder syncCount(long syncCount) {
                this.syncCount = syncCount;
                return this;
            }

            Builder exists(boolean exists) {
                this.exists = exists;
                return this;
            }

            Builder deleted(boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            Builder addRecord(Record record) {
                records.add(record);
                return this;
            }

            Builder mergedDatasetNameList(List<String> mergedDatasetNameList) {
                if (mergedDatasetNameList != null) {
                    this.mergedDatasetNameList.addAll(mergedDatasetNameList);
                }
                return this;
            }

            DatasetUpdates build() {
                return new DatasetUpdatesImpl(this);
            }
        }
    }

}
