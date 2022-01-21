/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IntegrationAssociationSummary
 */
class IntegrationAssociationSummaryJsonMarshaller {

    public void marshall(IntegrationAssociationSummary integrationAssociationSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (integrationAssociationSummary.getIntegrationAssociationId() != null) {
            String integrationAssociationId = integrationAssociationSummary
                    .getIntegrationAssociationId();
            jsonWriter.name("IntegrationAssociationId");
            jsonWriter.value(integrationAssociationId);
        }
        if (integrationAssociationSummary.getIntegrationAssociationArn() != null) {
            String integrationAssociationArn = integrationAssociationSummary
                    .getIntegrationAssociationArn();
            jsonWriter.name("IntegrationAssociationArn");
            jsonWriter.value(integrationAssociationArn);
        }
        if (integrationAssociationSummary.getInstanceId() != null) {
            String instanceId = integrationAssociationSummary.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (integrationAssociationSummary.getIntegrationType() != null) {
            String integrationType = integrationAssociationSummary.getIntegrationType();
            jsonWriter.name("IntegrationType");
            jsonWriter.value(integrationType);
        }
        if (integrationAssociationSummary.getIntegrationArn() != null) {
            String integrationArn = integrationAssociationSummary.getIntegrationArn();
            jsonWriter.name("IntegrationArn");
            jsonWriter.value(integrationArn);
        }
        if (integrationAssociationSummary.getSourceApplicationUrl() != null) {
            String sourceApplicationUrl = integrationAssociationSummary.getSourceApplicationUrl();
            jsonWriter.name("SourceApplicationUrl");
            jsonWriter.value(sourceApplicationUrl);
        }
        if (integrationAssociationSummary.getSourceApplicationName() != null) {
            String sourceApplicationName = integrationAssociationSummary.getSourceApplicationName();
            jsonWriter.name("SourceApplicationName");
            jsonWriter.value(sourceApplicationName);
        }
        if (integrationAssociationSummary.getSourceType() != null) {
            String sourceType = integrationAssociationSummary.getSourceType();
            jsonWriter.name("SourceType");
            jsonWriter.value(sourceType);
        }
        jsonWriter.endObject();
    }

    private static IntegrationAssociationSummaryJsonMarshaller instance;

    public static IntegrationAssociationSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IntegrationAssociationSummaryJsonMarshaller();
        return instance;
    }
}
