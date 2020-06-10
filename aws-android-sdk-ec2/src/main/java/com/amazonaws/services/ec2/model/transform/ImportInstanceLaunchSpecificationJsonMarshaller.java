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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ImportInstanceLaunchSpecification
 */
class ImportInstanceLaunchSpecificationJsonMarshaller {

    public void marshall(ImportInstanceLaunchSpecification importInstanceLaunchSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (importInstanceLaunchSpecification.getAdditionalInfo() != null) {
            String additionalInfo = importInstanceLaunchSpecification.getAdditionalInfo();
            jsonWriter.name("AdditionalInfo");
            jsonWriter.value(additionalInfo);
        }
        if (importInstanceLaunchSpecification.getArchitecture() != null) {
            String architecture = importInstanceLaunchSpecification.getArchitecture();
            jsonWriter.name("Architecture");
            jsonWriter.value(architecture);
        }
        if (importInstanceLaunchSpecification.getGroupIds() != null) {
            java.util.List<String> groupIds = importInstanceLaunchSpecification.getGroupIds();
            jsonWriter.name("GroupIds");
            jsonWriter.beginArray();
            for (String groupIdsItem : groupIds) {
                if (groupIdsItem != null) {
                    jsonWriter.value(groupIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (importInstanceLaunchSpecification.getGroupNames() != null) {
            java.util.List<String> groupNames = importInstanceLaunchSpecification.getGroupNames();
            jsonWriter.name("GroupNames");
            jsonWriter.beginArray();
            for (String groupNamesItem : groupNames) {
                if (groupNamesItem != null) {
                    jsonWriter.value(groupNamesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (importInstanceLaunchSpecification.getInstanceInitiatedShutdownBehavior() != null) {
            String instanceInitiatedShutdownBehavior = importInstanceLaunchSpecification
                    .getInstanceInitiatedShutdownBehavior();
            jsonWriter.name("InstanceInitiatedShutdownBehavior");
            jsonWriter.value(instanceInitiatedShutdownBehavior);
        }
        if (importInstanceLaunchSpecification.getInstanceType() != null) {
            String instanceType = importInstanceLaunchSpecification.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (importInstanceLaunchSpecification.getMonitoring() != null) {
            Boolean monitoring = importInstanceLaunchSpecification.getMonitoring();
            jsonWriter.name("Monitoring");
            jsonWriter.value(monitoring);
        }
        if (importInstanceLaunchSpecification.getPlacement() != null) {
            Placement placement = importInstanceLaunchSpecification.getPlacement();
            jsonWriter.name("Placement");
            PlacementJsonMarshaller.getInstance().marshall(placement, jsonWriter);
        }
        if (importInstanceLaunchSpecification.getPrivateIpAddress() != null) {
            String privateIpAddress = importInstanceLaunchSpecification.getPrivateIpAddress();
            jsonWriter.name("PrivateIpAddress");
            jsonWriter.value(privateIpAddress);
        }
        if (importInstanceLaunchSpecification.getSubnetId() != null) {
            String subnetId = importInstanceLaunchSpecification.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (importInstanceLaunchSpecification.getUserData() != null) {
            UserData userData = importInstanceLaunchSpecification.getUserData();
            jsonWriter.name("UserData");
            UserDataJsonMarshaller.getInstance().marshall(userData, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ImportInstanceLaunchSpecificationJsonMarshaller instance;

    public static ImportInstanceLaunchSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportInstanceLaunchSpecificationJsonMarshaller();
        return instance;
    }
}
