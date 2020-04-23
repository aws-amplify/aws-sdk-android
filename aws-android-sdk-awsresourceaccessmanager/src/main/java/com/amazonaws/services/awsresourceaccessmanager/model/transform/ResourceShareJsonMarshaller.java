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
 * JSON marshaller for POJO ResourceShare
 */
class ResourceShareJsonMarshaller {

    public void marshall(ResourceShare resourceShare, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourceShare.getResourceShareArn() != null) {
            String resourceShareArn = resourceShare.getResourceShareArn();
            jsonWriter.name("resourceShareArn");
            jsonWriter.value(resourceShareArn);
        }
        if (resourceShare.getName() != null) {
            String name = resourceShare.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (resourceShare.getOwningAccountId() != null) {
            String owningAccountId = resourceShare.getOwningAccountId();
            jsonWriter.name("owningAccountId");
            jsonWriter.value(owningAccountId);
        }
        if (resourceShare.getAllowExternalPrincipals() != null) {
            Boolean allowExternalPrincipals = resourceShare.getAllowExternalPrincipals();
            jsonWriter.name("allowExternalPrincipals");
            jsonWriter.value(allowExternalPrincipals);
        }
        if (resourceShare.getStatus() != null) {
            String status = resourceShare.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (resourceShare.getStatusMessage() != null) {
            String statusMessage = resourceShare.getStatusMessage();
            jsonWriter.name("statusMessage");
            jsonWriter.value(statusMessage);
        }
        if (resourceShare.getTags() != null) {
            java.util.List<Tag> tags = resourceShare.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (resourceShare.getCreationTime() != null) {
            java.util.Date creationTime = resourceShare.getCreationTime();
            jsonWriter.name("creationTime");
            jsonWriter.value(creationTime);
        }
        if (resourceShare.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = resourceShare.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (resourceShare.getFeatureSet() != null) {
            String featureSet = resourceShare.getFeatureSet();
            jsonWriter.name("featureSet");
            jsonWriter.value(featureSet);
        }
        jsonWriter.endObject();
    }

    private static ResourceShareJsonMarshaller instance;

    public static ResourceShareJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceShareJsonMarshaller();
        return instance;
    }
}
