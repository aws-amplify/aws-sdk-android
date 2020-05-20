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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TargetInstances
 */
class TargetInstancesJsonMarshaller {

    public void marshall(TargetInstances targetInstances, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (targetInstances.getTagFilters() != null) {
            java.util.List<EC2TagFilter> tagFilters = targetInstances.getTagFilters();
            jsonWriter.name("tagFilters");
            jsonWriter.beginArray();
            for (EC2TagFilter tagFiltersItem : tagFilters) {
                if (tagFiltersItem != null) {
                    EC2TagFilterJsonMarshaller.getInstance().marshall(tagFiltersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (targetInstances.getAutoScalingGroups() != null) {
            java.util.List<String> autoScalingGroups = targetInstances.getAutoScalingGroups();
            jsonWriter.name("autoScalingGroups");
            jsonWriter.beginArray();
            for (String autoScalingGroupsItem : autoScalingGroups) {
                if (autoScalingGroupsItem != null) {
                    jsonWriter.value(autoScalingGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (targetInstances.getEc2TagSet() != null) {
            EC2TagSet ec2TagSet = targetInstances.getEc2TagSet();
            jsonWriter.name("ec2TagSet");
            EC2TagSetJsonMarshaller.getInstance().marshall(ec2TagSet, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TargetInstancesJsonMarshaller instance;

    public static TargetInstancesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TargetInstancesJsonMarshaller();
        return instance;
    }
}
