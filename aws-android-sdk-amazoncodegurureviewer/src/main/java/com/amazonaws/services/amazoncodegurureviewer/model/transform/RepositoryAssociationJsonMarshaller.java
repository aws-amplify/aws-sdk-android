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

package com.amazonaws.services.amazoncodegurureviewer.model.transform;

import com.amazonaws.services.amazoncodegurureviewer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RepositoryAssociation
 */
class RepositoryAssociationJsonMarshaller {

    public void marshall(RepositoryAssociation repositoryAssociation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (repositoryAssociation.getAssociationId() != null) {
            String associationId = repositoryAssociation.getAssociationId();
            jsonWriter.name("AssociationId");
            jsonWriter.value(associationId);
        }
        if (repositoryAssociation.getAssociationArn() != null) {
            String associationArn = repositoryAssociation.getAssociationArn();
            jsonWriter.name("AssociationArn");
            jsonWriter.value(associationArn);
        }
        if (repositoryAssociation.getName() != null) {
            String name = repositoryAssociation.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (repositoryAssociation.getOwner() != null) {
            String owner = repositoryAssociation.getOwner();
            jsonWriter.name("Owner");
            jsonWriter.value(owner);
        }
        if (repositoryAssociation.getProviderType() != null) {
            String providerType = repositoryAssociation.getProviderType();
            jsonWriter.name("ProviderType");
            jsonWriter.value(providerType);
        }
        if (repositoryAssociation.getState() != null) {
            String state = repositoryAssociation.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (repositoryAssociation.getStateReason() != null) {
            String stateReason = repositoryAssociation.getStateReason();
            jsonWriter.name("StateReason");
            jsonWriter.value(stateReason);
        }
        if (repositoryAssociation.getLastUpdatedTimeStamp() != null) {
            java.util.Date lastUpdatedTimeStamp = repositoryAssociation.getLastUpdatedTimeStamp();
            jsonWriter.name("LastUpdatedTimeStamp");
            jsonWriter.value(lastUpdatedTimeStamp);
        }
        if (repositoryAssociation.getCreatedTimeStamp() != null) {
            java.util.Date createdTimeStamp = repositoryAssociation.getCreatedTimeStamp();
            jsonWriter.name("CreatedTimeStamp");
            jsonWriter.value(createdTimeStamp);
        }
        jsonWriter.endObject();
    }

    private static RepositoryAssociationJsonMarshaller instance;

    public static RepositoryAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RepositoryAssociationJsonMarshaller();
        return instance;
    }
}
