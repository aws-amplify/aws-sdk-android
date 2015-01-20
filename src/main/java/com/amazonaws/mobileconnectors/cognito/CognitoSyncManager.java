/**
 * Copyright 2013-2014 Amazon.com, 
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

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.auth.IdentityChangedListener;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataStorageException;
import com.amazonaws.mobileconnectors.cognito.exceptions.RegistrationFailedException;
import com.amazonaws.mobileconnectors.cognito.exceptions.UnsubscribeFailedException;
import com.amazonaws.mobileconnectors.cognito.internal.storage.CognitoSyncStorage;
import com.amazonaws.mobileconnectors.cognito.internal.storage.SQLiteLocalStorage;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitosync.AmazonCognitoSyncClient;
import com.amazonaws.services.cognitosync.model.RegisterDeviceRequest;
import com.amazonaws.services.cognitosync.model.RegisterDeviceResult;
import com.amazonaws.services.cognitosync.model.ResourceNotFoundException;
import com.amazonaws.util.VersionInfoUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * This saves {@link Dataset} in SQLite database. Here is a sample usage:
 * 
 * <pre>
 * CognitoCachingCredentialsProvider provider = new CognitoCachingCredentialsProvider(context,
 *         awsAccountId, identityPoolId, unauthRoleArn, authRoleArn, Regions.US_EAST_1);
 * CognitoClientManager client = new CognitoClientManager(context, Regions.US_EAST_1, provider);
 * 
 * Dataset dataset = client.openOrCreateDataset(&quot;default_dataset&quot;);
 * dataset.put(&quot;high_score&quot;, &quot;100&quot;);
 * dataset.synchronize(new SyncCallback() {
 *     // override callbacks
 * });
 * </pre>
 */

public class CognitoSyncManager {

    private static final String TAG = "CognitoSyncManager";

    /**
     * User agent string to append to all requests to the remote service
     */
    private static final String USER_AGENT = CognitoSyncManager.class.getName()
            + "/" + VersionInfoUtils.getVersion();

    /**
     * Default database name.
     */
    private static final String DATABASE_NAME = "cognito_dataset_cache.db";

    /**
     * The local storage is singleton to avoid SQLite resource leak and thread
     * contention.
     */
    private static SQLiteLocalStorage local;

    private final Context context;
    private final CognitoSyncStorage remote;
    private final CognitoCachingCredentialsProvider provider;
    private final AmazonCognitoSyncClient syncClient;
    private final String identityPoolId;

    /**
     * Constructs a CognitoSyncManager object.
     * 
     * @deprecated Please use the constructor without an identityPoolId
     * @param context a context of the app
     * @param identityPoolId Cognito identity pool id
     * @param region Cognito sync region
     * @param provider a credentials provider
     */
    @Deprecated
    public CognitoSyncManager(Context context, String identityPoolId, Regions region,
            CognitoCachingCredentialsProvider provider) {
        this(context, region, provider);
    }

    /**
     * Constructs a CognitoSyncManager object.
     * 
     * @param context a context of the app
     * @param region Cognito sync region
     * @param provider a credentials provider
     */
    public CognitoSyncManager(Context context, Regions region,
            CognitoCachingCredentialsProvider provider) {
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.context = context;
        this.provider = provider;
        this.identityPoolId = provider.getIdentityPoolId();
        synchronized (CognitoSyncManager.class) {
            if (local == null) {
                local = new SQLiteLocalStorage(context, DATABASE_NAME);
            }
        }
        syncClient = new AmazonCognitoSyncClient(provider);
        syncClient.setRegion(Region.getRegion(region));
        remote = new CognitoSyncStorage(identityPoolId, syncClient, provider);
        remote.setUserAgent(USER_AGENT);
        provider.registerIdentityChangedListener(new IdentityChangedListener() {
            @Override
            public void identityChanged(String oldIdentityId, String newIdentityId) {
                Log.i(TAG, "identity change detected");
                local.changeIdentityId(oldIdentityId == null ? DatasetUtils.UNKNOWN_IDENTITY_ID
                        : oldIdentityId, newIdentityId);
            }
        });
    }

    /**
     * Opens or creates a dataset. If the dataset doesn't exist, an empty one
     * with the given name will be created. Otherwise, dataset is loaded from
     * local storage. If a dataset is marked as deleted but hasn't been deleted
     * on remote via {@link #refreshDatasetMetadata()}, it will throw
     * {@link IllegalStateException}.
     * 
     * @param datasetName dataset name, must be [a-zA-Z0=9_.:-]+
     * @return dataset loaded from local storage
     */
    public Dataset openOrCreateDataset(String datasetName) {
        DatasetUtils.validateDatasetName(datasetName);
        local.createDataset(getIdentityId(), datasetName);
        Dataset dataset = new DefaultDataset(context, datasetName, provider, local, remote);
        return dataset;
    }

    /**
     * Retrieves a list of datasets from local storage. It may not reflects
     * latest dataset on the remote storage until refreshDatasetMetadata is
     * called.
     * 
     * @return list of datasets
     */
    public List<DatasetMetadata> listDatasets() {
        return local.getDatasets(getIdentityId());
    }

    /**
     * Refreshes dataset metadata. Dataset metadata is pulled from remote
     * storage and stored in local storage. Their record data isn't pulled down
     * until you sync each dataset. Note: this is a network request, so calling
     * this method in the main thread will result in
     * NetworkOnMainThreadException.
     * 
     * @throws DataStorageException thrown when fail to fresh dataset metadata
     */
    public void refreshDatasetMetadata() throws DataStorageException {
        List<DatasetMetadata> datasets = remote.getDatasets();
        local.updateDatasetMetadata(getIdentityId(), datasets);
    }

    /**
     * Wipes all user data cached locally, including identity id, session
     * credentials, dataset metadata, and all records. Any data that hasn't been
     * synced will be lost. This method should be called after logging out a customer.
     */
    public void wipeData() {
        provider.clear();
        local.wipeData();
        Log.i(TAG, "All data has been wiped");
    }

    String getIdentityId() {
        return DatasetUtils.getIdentityId(provider);
    }

    /**
     * Register device for push sync. Upon calling this method, the device will
     * be registered with the platform in use via Cognito, and reconcile that
     * registration with the Cognito system
     * 
     * @param platform Platform of the device, one of GCM, ADM
     * @param token Device token of the device, gotten when registered for the
     *            platform in question.
     */
    public void registerDevice(String platform, String token) {
        SharedPreferences sp = getSharedPreferences();

        if (isDeviceRegistered()) {
            Log.i(TAG, "Device is already registered");
            return;
        }

        String identityId = provider.getIdentityId();
        RegisterDeviceRequest request = new RegisterDeviceRequest()
                .withIdentityPoolId(provider.getIdentityPoolId())
                .withIdentityId(identityId)
                .withPlatform(platform)
                .withToken(token);

        try {
            RegisterDeviceResult result = syncClient.registerDevice(request);
            String deviceId = result.getDeviceId();
            sp.edit().putString("deviceId", deviceId)
                    .putString("platform", platform)
                    .putString("token", token)
                    .apply();
            Log.i(TAG, "Device is registered successfully: " + deviceId);
        } catch (AmazonClientException ace) {
            Log.e(TAG, "Failed to register device", ace);
            throw new RegistrationFailedException("Failed to register device", ace);
        }
    }

    /**
     * Checks the cache to see if the registration information is saved
     * 
     * @return true if it has, false if it hasn't
     */
    public boolean isDeviceRegistered() {
        SharedPreferences sp = getSharedPreferences();
        return !sp.getString("deviceId", "").isEmpty()
                && !sp.getString("platform", "").isEmpty()
                && !sp.getString("token", "").isEmpty();
    }

    /**
     * Unregisters the device for push sync. This will clear the local cache
     * that blocks the device from registering, but not clearing the information
     * from outside the device
     */
    public void unregisterDevice() {
        SharedPreferences sp = getSharedPreferences();
        sp.edit().remove("deviceId")
                .remove("platform")
                .remove("token")
                .apply();
    }

    /**
     * Subscribes the user to all datasets that the local device knows of for
     * push sync notifications for all datasets
     */
    public void subscribeAll() {
        List<String> datasetNames = new ArrayList<String>();
        for (DatasetMetadata dataset : this.listDatasets()) {
            datasetNames.add(dataset.getDatasetName());
        }
        subscribe(datasetNames);
    }

    /**
     * Subscribes the user to some set of datasets from the total list that the
     * device knows of, giving the user push sync notifications for all in that
     * set
     * 
     * @param datasetNames The list of names of datasets to subscribe to
     */
    public void subscribe(List<String> datasetNames) {
        for (String datasetName : datasetNames) {
            Dataset dataset = openOrCreateDataset(datasetName);
            dataset.subscribe();
        }
    }

    /**
     * Unsubscribes the user to all datasets that the local device knows of from
     * push sync notifications for all datasets
     */
    public void unsubscribeAll() {
        List<String> datasetNames = new ArrayList<String>();
        for (DatasetMetadata dataset : this.listDatasets()) {
            datasetNames.add(dataset.getDatasetName());
        }
        unsubscribe(datasetNames);
    }

    /**
     * Unsubscribes the user to some set of datasets from the total list that
     * the device knows of, ending any reception of push sync notifications
     * 
     * @param datasetNames The list of names of datasets to unsubscribe from
     */
    public void unsubscribe(List<String> datasetNames) {
        for (String datasetName : datasetNames) {
            Dataset dataset = openOrCreateDataset(datasetName);
            try {
                dataset.unsubscribe();
            } catch (UnsubscribeFailedException ufe) {
                if (ufe.getCause() instanceof ResourceNotFoundException) {
                    Log.w(TAG, "Unable to unsubscribe to dataset " + datasetName +
                            ", dataset not a subscription");
                }
                else {
                    throw ufe;
                }
            }
        }
    }

    /**
     * Converts the notification from Cognito push sync to an object that has
     * easy access to all of the relevant information.
     * 
     * @param extras the bundle returned from the intent.getExtras() call
     * @return the PushSyncUpdate that bundle is converted to
     */
    public PushSyncUpdate getPushSyncUpdate(Intent intent) {
        return new PushSyncUpdate(intent.getExtras());
    }

    private SharedPreferences getSharedPreferences() {
        return context.getSharedPreferences("com.amazonaws.mobileconnectors.cognito",
                Context.MODE_PRIVATE);
    }
}
