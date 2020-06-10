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

package com.amazonaws.services.dlm.model.transform;

import com.amazonaws.services.dlm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PolicyDetails
 */
class PolicyDetailsJsonMarshaller {

    public void marshall(PolicyDetails policyDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (policyDetails.getPolicyType() != null) {
            String policyType = policyDetails.getPolicyType();
            jsonWriter.name("PolicyType");
            jsonWriter.value(policyType);
        }
        if (policyDetails.getResourceTypes() != null) {
            java.util.List<String> resourceTypes = policyDetails.getResourceTypes();
            jsonWriter.name("ResourceTypes");
            jsonWriter.beginArray();
            for (String resourceTypesItem : resourceTypes) {
                if (resourceTypesItem != null) {
                    jsonWriter.value(resourceTypesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (policyDetails.getTargetTags() != null) {
            java.util.List<Tag> targetTags = policyDetails.getTargetTags();
            jsonWriter.name("TargetTags");
            jsonWriter.beginArray();
            for (Tag targetTagsItem : targetTags) {
                if (targetTagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(targetTagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (policyDetails.getSchedules() != null) {
            java.util.List<Schedule> schedules = policyDetails.getSchedules();
            jsonWriter.name("Schedules");
            jsonWriter.beginArray();
            for (Schedule schedulesItem : schedules) {
                if (schedulesItem != null) {
                    ScheduleJsonMarshaller.getInstance().marshall(schedulesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (policyDetails.getParameters() != null) {
            Parameters parameters = policyDetails.getParameters();
            jsonWriter.name("Parameters");
            ParametersJsonMarshaller.getInstance().marshall(parameters, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PolicyDetailsJsonMarshaller instance;

    public static PolicyDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyDetailsJsonMarshaller();
        return instance;
    }
}
