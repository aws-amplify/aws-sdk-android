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
 * JSON marshaller for POJO ResourceSharePermissionDetail
 */
class ResourceSharePermissionDetailJsonMarshaller {

    public void marshall(ResourceSharePermissionDetail resourceSharePermissionDetail,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourceSharePermissionDetail.getArn() != null) {
            String arn = resourceSharePermissionDetail.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (resourceSharePermissionDetail.getVersion() != null) {
            String version = resourceSharePermissionDetail.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (resourceSharePermissionDetail.getDefaultVersion() != null) {
            Boolean defaultVersion = resourceSharePermissionDetail.getDefaultVersion();
            jsonWriter.name("defaultVersion");
            jsonWriter.value(defaultVersion);
        }
        if (resourceSharePermissionDetail.getName() != null) {
            String name = resourceSharePermissionDetail.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (resourceSharePermissionDetail.getResourceType() != null) {
            String resourceType = resourceSharePermissionDetail.getResourceType();
            jsonWriter.name("resourceType");
            jsonWriter.value(resourceType);
        }
        if (resourceSharePermissionDetail.getPermission() != null) {
            String permission = resourceSharePermissionDetail.getPermission();
            jsonWriter.name("permission");
            jsonWriter.value(permission);
        }
        if (resourceSharePermissionDetail.getCreationTime() != null) {
            java.util.Date creationTime = resourceSharePermissionDetail.getCreationTime();
            jsonWriter.name("creationTime");
            jsonWriter.value(creationTime);
        }
        if (resourceSharePermissionDetail.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = resourceSharePermissionDetail.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        jsonWriter.endObject();
    }

    private static ResourceSharePermissionDetailJsonMarshaller instance;

    public static ResourceSharePermissionDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceSharePermissionDetailJsonMarshaller();
        return instance;
    }
}
