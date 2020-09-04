/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceDataSyncSourceWithState
 */
class ResourceDataSyncSourceWithStateJsonMarshaller {

    public void marshall(ResourceDataSyncSourceWithState resourceDataSyncSourceWithState, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourceDataSyncSourceWithState.getSourceType() != null) {
            String sourceType = resourceDataSyncSourceWithState.getSourceType();
            jsonWriter.name("SourceType");
            jsonWriter.value(sourceType);
        }
        if (resourceDataSyncSourceWithState.getAwsOrganizationsSource() != null) {
            ResourceDataSyncAwsOrganizationsSource awsOrganizationsSource = resourceDataSyncSourceWithState.getAwsOrganizationsSource();
            jsonWriter.name("AwsOrganizationsSource");
            ResourceDataSyncAwsOrganizationsSourceJsonMarshaller.getInstance().marshall(awsOrganizationsSource, jsonWriter);
        }
        if (resourceDataSyncSourceWithState.getSourceRegions() != null) {
            java.util.List<String> sourceRegions = resourceDataSyncSourceWithState.getSourceRegions();
            jsonWriter.name("SourceRegions");
            jsonWriter.beginArray();
            for (String sourceRegionsItem : sourceRegions) {
                if (sourceRegionsItem != null) {
            jsonWriter.value(sourceRegionsItem);
                    }
            }
            jsonWriter.endArray();
        }
        if (resourceDataSyncSourceWithState.getIncludeFutureRegions() != null) {
            Boolean includeFutureRegions = resourceDataSyncSourceWithState.getIncludeFutureRegions();
            jsonWriter.name("IncludeFutureRegions");
            jsonWriter.value(includeFutureRegions);
        }
        if (resourceDataSyncSourceWithState.getState() != null) {
            String state = resourceDataSyncSourceWithState.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        jsonWriter.endObject();
    }

    private static ResourceDataSyncSourceWithStateJsonMarshaller instance;
    public static ResourceDataSyncSourceWithStateJsonMarshaller getInstance() {
        if (instance == null) instance = new ResourceDataSyncSourceWithStateJsonMarshaller();
        return instance;
    }
}
