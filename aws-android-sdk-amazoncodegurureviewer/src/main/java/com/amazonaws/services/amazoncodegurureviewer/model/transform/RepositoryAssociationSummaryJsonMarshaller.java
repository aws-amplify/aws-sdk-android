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
 * JSON marshaller for POJO RepositoryAssociationSummary
 */
class RepositoryAssociationSummaryJsonMarshaller {

    public void marshall(RepositoryAssociationSummary repositoryAssociationSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (repositoryAssociationSummary.getAssociationArn() != null) {
            String associationArn = repositoryAssociationSummary.getAssociationArn();
            jsonWriter.name("AssociationArn");
            jsonWriter.value(associationArn);
        }
        if (repositoryAssociationSummary.getLastUpdatedTimeStamp() != null) {
            java.util.Date lastUpdatedTimeStamp = repositoryAssociationSummary
                    .getLastUpdatedTimeStamp();
            jsonWriter.name("LastUpdatedTimeStamp");
            jsonWriter.value(lastUpdatedTimeStamp);
        }
        if (repositoryAssociationSummary.getAssociationId() != null) {
            String associationId = repositoryAssociationSummary.getAssociationId();
            jsonWriter.name("AssociationId");
            jsonWriter.value(associationId);
        }
        if (repositoryAssociationSummary.getName() != null) {
            String name = repositoryAssociationSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (repositoryAssociationSummary.getOwner() != null) {
            String owner = repositoryAssociationSummary.getOwner();
            jsonWriter.name("Owner");
            jsonWriter.value(owner);
        }
        if (repositoryAssociationSummary.getProviderType() != null) {
            String providerType = repositoryAssociationSummary.getProviderType();
            jsonWriter.name("ProviderType");
            jsonWriter.value(providerType);
        }
        if (repositoryAssociationSummary.getState() != null) {
            String state = repositoryAssociationSummary.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        jsonWriter.endObject();
    }

    private static RepositoryAssociationSummaryJsonMarshaller instance;

    public static RepositoryAssociationSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RepositoryAssociationSummaryJsonMarshaller();
        return instance;
    }
}
