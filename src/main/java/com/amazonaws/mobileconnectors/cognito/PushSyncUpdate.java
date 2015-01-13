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

import android.os.Bundle;

/**
 * A class to keep handy the data that is given in a push sync message, for the
 * sake of parsing the message to uniquely identify the dataset for update and
 */
public class PushSyncUpdate {
    private final String source;
    private final String identityPoolId;
    private final String identityId;
    private final String datasetName;
    private final long syncCount;

    PushSyncUpdate(Bundle extras) {
        this.source = extras.getString("source");
        this.identityPoolId = extras.getString("identityPoolId");
        this.identityId = extras.getString("identityId");
        this.datasetName = extras.getString("datasetName");
        this.syncCount = Long.parseLong(extras.getString("syncCount"));
    }

    /**
     * Gets the source of the notification, 'cognito-sync' from push sync
     */
    public String getSource() {
        return source;
    }

    /**
     * Gets the identity id for which the change was made
     */
    public String getIdentityId() {
        return identityId;
    }

    /**
     * Gets the identity pool in which the user belongs
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }

    /**
     * Gets the name of the changed datset
     */
    public String getDatasetName() {
        return datasetName;
    }

    /**
     * Gets the sync count of the changed dataset
     */
    public long getSyncCount() {
        return syncCount;
    }
}
