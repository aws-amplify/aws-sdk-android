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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceDataSyncSource
 */
class ResourceDataSyncSourceJsonMarshaller {

    public void marshall(ResourceDataSyncSource resourceDataSyncSource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (resourceDataSyncSource.getSourceType() != null) {
            String sourceType = resourceDataSyncSource.getSourceType();
            jsonWriter.name("SourceType");
            jsonWriter.value(sourceType);
        }
        if (resourceDataSyncSource.getAwsOrganizationsSource() != null) {
            ResourceDataSyncAwsOrganizationsSource awsOrganizationsSource = resourceDataSyncSource
                    .getAwsOrganizationsSource();
            jsonWriter.name("AwsOrganizationsSource");
            ResourceDataSyncAwsOrganizationsSourceJsonMarshaller.getInstance().marshall(
                    awsOrganizationsSource, jsonWriter);
        }
        if (resourceDataSyncSource.getSourceRegions() != null) {
            java.util.List<String> sourceRegions = resourceDataSyncSource.getSourceRegions();
            jsonWriter.name("SourceRegions");
            jsonWriter.beginArray();
            for (String sourceRegionsItem : sourceRegions) {
                if (sourceRegionsItem != null) {
                    jsonWriter.value(sourceRegionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (resourceDataSyncSource.getIncludeFutureRegions() != null) {
            Boolean includeFutureRegions = resourceDataSyncSource.getIncludeFutureRegions();
            jsonWriter.name("IncludeFutureRegions");
            jsonWriter.value(includeFutureRegions);
        }
        jsonWriter.endObject();
    }

    private static ResourceDataSyncSourceJsonMarshaller instance;

    public static ResourceDataSyncSourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceDataSyncSourceJsonMarshaller();
        return instance;
    }
}
