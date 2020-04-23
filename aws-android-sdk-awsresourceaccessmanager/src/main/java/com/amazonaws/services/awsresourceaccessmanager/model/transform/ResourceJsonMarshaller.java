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
 * JSON marshaller for POJO Resource
 */
class ResourceJsonMarshaller {

    public void marshall(Resource resource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resource.getArn() != null) {
            String arn = resource.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (resource.getType() != null) {
            String type = resource.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (resource.getResourceShareArn() != null) {
            String resourceShareArn = resource.getResourceShareArn();
            jsonWriter.name("resourceShareArn");
            jsonWriter.value(resourceShareArn);
        }
        if (resource.getResourceGroupArn() != null) {
            String resourceGroupArn = resource.getResourceGroupArn();
            jsonWriter.name("resourceGroupArn");
            jsonWriter.value(resourceGroupArn);
        }
        if (resource.getStatus() != null) {
            String status = resource.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (resource.getStatusMessage() != null) {
            String statusMessage = resource.getStatusMessage();
            jsonWriter.name("statusMessage");
            jsonWriter.value(statusMessage);
        }
        if (resource.getCreationTime() != null) {
            java.util.Date creationTime = resource.getCreationTime();
            jsonWriter.name("creationTime");
            jsonWriter.value(creationTime);
        }
        if (resource.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = resource.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        jsonWriter.endObject();
    }

    private static ResourceJsonMarshaller instance;

    public static ResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceJsonMarshaller();
        return instance;
    }
}
