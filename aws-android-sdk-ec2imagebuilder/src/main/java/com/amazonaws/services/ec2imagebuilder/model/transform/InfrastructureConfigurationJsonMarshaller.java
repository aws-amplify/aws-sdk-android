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

package com.amazonaws.services.ec2imagebuilder.model.transform;

import com.amazonaws.services.ec2imagebuilder.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InfrastructureConfiguration
 */
class InfrastructureConfigurationJsonMarshaller {

    public void marshall(InfrastructureConfiguration infrastructureConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (infrastructureConfiguration.getArn() != null) {
            String arn = infrastructureConfiguration.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (infrastructureConfiguration.getName() != null) {
            String name = infrastructureConfiguration.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (infrastructureConfiguration.getDescription() != null) {
            String description = infrastructureConfiguration.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (infrastructureConfiguration.getInstanceTypes() != null) {
            java.util.List<String> instanceTypes = infrastructureConfiguration.getInstanceTypes();
            jsonWriter.name("instanceTypes");
            jsonWriter.beginArray();
            for (String instanceTypesItem : instanceTypes) {
                if (instanceTypesItem != null) {
                    jsonWriter.value(instanceTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (infrastructureConfiguration.getInstanceProfileName() != null) {
            String instanceProfileName = infrastructureConfiguration.getInstanceProfileName();
            jsonWriter.name("instanceProfileName");
            jsonWriter.value(instanceProfileName);
        }
        if (infrastructureConfiguration.getSecurityGroupIds() != null) {
            java.util.List<String> securityGroupIds = infrastructureConfiguration
                    .getSecurityGroupIds();
            jsonWriter.name("securityGroupIds");
            jsonWriter.beginArray();
            for (String securityGroupIdsItem : securityGroupIds) {
                if (securityGroupIdsItem != null) {
                    jsonWriter.value(securityGroupIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (infrastructureConfiguration.getSubnetId() != null) {
            String subnetId = infrastructureConfiguration.getSubnetId();
            jsonWriter.name("subnetId");
            jsonWriter.value(subnetId);
        }
        if (infrastructureConfiguration.getLogging() != null) {
            Logging logging = infrastructureConfiguration.getLogging();
            jsonWriter.name("logging");
            LoggingJsonMarshaller.getInstance().marshall(logging, jsonWriter);
        }
        if (infrastructureConfiguration.getKeyPair() != null) {
            String keyPair = infrastructureConfiguration.getKeyPair();
            jsonWriter.name("keyPair");
            jsonWriter.value(keyPair);
        }
        if (infrastructureConfiguration.getTerminateInstanceOnFailure() != null) {
            Boolean terminateInstanceOnFailure = infrastructureConfiguration
                    .getTerminateInstanceOnFailure();
            jsonWriter.name("terminateInstanceOnFailure");
            jsonWriter.value(terminateInstanceOnFailure);
        }
        if (infrastructureConfiguration.getSnsTopicArn() != null) {
            String snsTopicArn = infrastructureConfiguration.getSnsTopicArn();
            jsonWriter.name("snsTopicArn");
            jsonWriter.value(snsTopicArn);
        }
        if (infrastructureConfiguration.getDateCreated() != null) {
            String dateCreated = infrastructureConfiguration.getDateCreated();
            jsonWriter.name("dateCreated");
            jsonWriter.value(dateCreated);
        }
        if (infrastructureConfiguration.getDateUpdated() != null) {
            String dateUpdated = infrastructureConfiguration.getDateUpdated();
            jsonWriter.name("dateUpdated");
            jsonWriter.value(dateUpdated);
        }
        if (infrastructureConfiguration.getTags() != null) {
            java.util.Map<String, String> tags = infrastructureConfiguration.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static InfrastructureConfigurationJsonMarshaller instance;

    public static InfrastructureConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InfrastructureConfigurationJsonMarshaller();
        return instance;
    }
}
