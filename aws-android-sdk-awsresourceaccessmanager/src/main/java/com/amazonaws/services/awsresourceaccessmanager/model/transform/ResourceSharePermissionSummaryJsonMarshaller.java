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

package com.amazonaws.services.awsresourceaccessmanager.model.transform;

import com.amazonaws.services.awsresourceaccessmanager.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceSharePermissionSummary
 */
class ResourceSharePermissionSummaryJsonMarshaller {

    public void marshall(ResourceSharePermissionSummary resourceSharePermissionSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourceSharePermissionSummary.getArn() != null) {
            String arn = resourceSharePermissionSummary.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (resourceSharePermissionSummary.getVersion() != null) {
            String version = resourceSharePermissionSummary.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (resourceSharePermissionSummary.getDefaultVersion() != null) {
            Boolean defaultVersion = resourceSharePermissionSummary.getDefaultVersion();
            jsonWriter.name("defaultVersion");
            jsonWriter.value(defaultVersion);
        }
        if (resourceSharePermissionSummary.getName() != null) {
            String name = resourceSharePermissionSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (resourceSharePermissionSummary.getResourceType() != null) {
            String resourceType = resourceSharePermissionSummary.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (resourceSharePermissionSummary.getStatus() != null) {
            String status = resourceSharePermissionSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (resourceSharePermissionSummary.getCreationTime() != null) {
            java.util.Date creationTime = resourceSharePermissionSummary.getCreationTime();
            jsonWriter.name("creationTime");
            jsonWriter.value(creationTime);
        }
        if (resourceSharePermissionSummary.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = resourceSharePermissionSummary.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        jsonWriter.endObject();
    }

    private static ResourceSharePermissionSummaryJsonMarshaller instance;

    public static ResourceSharePermissionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceSharePermissionSummaryJsonMarshaller();
        return instance;
    }
}
