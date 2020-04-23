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
 * JSON marshaller for POJO ResourceShareAssociation
 */
class ResourceShareAssociationJsonMarshaller {

    public void marshall(ResourceShareAssociation resourceShareAssociation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (resourceShareAssociation.getResourceShareArn() != null) {
            String resourceShareArn = resourceShareAssociation.getResourceShareArn();
            jsonWriter.name("resourceShareArn");
            jsonWriter.value(resourceShareArn);
        }
        if (resourceShareAssociation.getResourceShareName() != null) {
            String resourceShareName = resourceShareAssociation.getResourceShareName();
            jsonWriter.name("resourceShareName");
            jsonWriter.value(resourceShareName);
        }
        if (resourceShareAssociation.getAssociatedEntity() != null) {
            String associatedEntity = resourceShareAssociation.getAssociatedEntity();
            jsonWriter.name("associatedEntity");
            jsonWriter.value(associatedEntity);
        }
        if (resourceShareAssociation.getAssociationType() != null) {
            String associationType = resourceShareAssociation.getAssociationType();
            jsonWriter.name("associationType");
            jsonWriter.value(associationType);
        }
        if (resourceShareAssociation.getStatus() != null) {
            String status = resourceShareAssociation.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (resourceShareAssociation.getStatusMessage() != null) {
            String statusMessage = resourceShareAssociation.getStatusMessage();
            jsonWriter.name("statusMessage");
            jsonWriter.value(statusMessage);
        }
        if (resourceShareAssociation.getCreationTime() != null) {
            java.util.Date creationTime = resourceShareAssociation.getCreationTime();
            jsonWriter.name("creationTime");
            jsonWriter.value(creationTime);
        }
        if (resourceShareAssociation.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = resourceShareAssociation.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (resourceShareAssociation.getExternal() != null) {
            Boolean external = resourceShareAssociation.getExternal();
            jsonWriter.name("external");
            jsonWriter.value(external);
        }
        jsonWriter.endObject();
    }

    private static ResourceShareAssociationJsonMarshaller instance;

    public static ResourceShareAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceShareAssociationJsonMarshaller();
        return instance;
    }
}
