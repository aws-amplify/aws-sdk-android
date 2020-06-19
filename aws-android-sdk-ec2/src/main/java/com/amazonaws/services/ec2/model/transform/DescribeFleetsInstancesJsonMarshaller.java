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
 * JSON marshaller for POJO DescribeFleetsInstances
 */
class DescribeFleetsInstancesJsonMarshaller {

    public void marshall(DescribeFleetsInstances describeFleetsInstances, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (describeFleetsInstances.getLaunchTemplateAndOverrides() != null) {
            LaunchTemplateAndOverridesResponse launchTemplateAndOverrides = describeFleetsInstances
                    .getLaunchTemplateAndOverrides();
            jsonWriter.name("LaunchTemplateAndOverrides");
            LaunchTemplateAndOverridesResponseJsonMarshaller.getInstance().marshall(
                    launchTemplateAndOverrides, jsonWriter);
        }
        if (describeFleetsInstances.getLifecycle() != null) {
            String lifecycle = describeFleetsInstances.getLifecycle();
            jsonWriter.name("Lifecycle");
            jsonWriter.value(lifecycle);
        }
        if (describeFleetsInstances.getInstanceIds() != null) {
            java.util.List<String> instanceIds = describeFleetsInstances.getInstanceIds();
            jsonWriter.name("InstanceIds");
            jsonWriter.beginArray();
            for (String instanceIdsItem : instanceIds) {
                if (instanceIdsItem != null) {
                    jsonWriter.value(instanceIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (describeFleetsInstances.getInstanceType() != null) {
            String instanceType = describeFleetsInstances.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (describeFleetsInstances.getPlatform() != null) {
            String platform = describeFleetsInstances.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        jsonWriter.endObject();
    }

    private static DescribeFleetsInstancesJsonMarshaller instance;

    public static DescribeFleetsInstancesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DescribeFleetsInstancesJsonMarshaller();
        return instance;
    }
}
