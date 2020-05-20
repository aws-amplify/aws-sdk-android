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
 * JSON marshaller for POJO GenericRevisionInfo
 */
class GenericRevisionInfoJsonMarshaller {

    public void marshall(GenericRevisionInfo genericRevisionInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (genericRevisionInfo.getDescription() != null) {
            String description = genericRevisionInfo.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (genericRevisionInfo.getDeploymentGroups() != null) {
            java.util.List<String> deploymentGroups = genericRevisionInfo.getDeploymentGroups();
            jsonWriter.name("deploymentGroups");
            jsonWriter.beginArray();
            for (String deploymentGroupsItem : deploymentGroups) {
                if (deploymentGroupsItem != null) {
                    jsonWriter.value(deploymentGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (genericRevisionInfo.getFirstUsedTime() != null) {
            java.util.Date firstUsedTime = genericRevisionInfo.getFirstUsedTime();
            jsonWriter.name("firstUsedTime");
            jsonWriter.value(firstUsedTime);
        }
        if (genericRevisionInfo.getLastUsedTime() != null) {
            java.util.Date lastUsedTime = genericRevisionInfo.getLastUsedTime();
            jsonWriter.name("lastUsedTime");
            jsonWriter.value(lastUsedTime);
        }
        if (genericRevisionInfo.getRegisterTime() != null) {
            java.util.Date registerTime = genericRevisionInfo.getRegisterTime();
            jsonWriter.name("registerTime");
            jsonWriter.value(registerTime);
        }
        jsonWriter.endObject();
    }

    private static GenericRevisionInfoJsonMarshaller instance;

    public static GenericRevisionInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GenericRevisionInfoJsonMarshaller();
        return instance;
    }
}
