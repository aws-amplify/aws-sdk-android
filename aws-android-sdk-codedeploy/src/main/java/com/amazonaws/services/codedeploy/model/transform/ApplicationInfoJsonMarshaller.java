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
 * JSON marshaller for POJO ApplicationInfo
 */
class ApplicationInfoJsonMarshaller {

    public void marshall(ApplicationInfo applicationInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (applicationInfo.getApplicationId() != null) {
            String applicationId = applicationInfo.getApplicationId();
            jsonWriter.name("applicationId");
            jsonWriter.value(applicationId);
        }
        if (applicationInfo.getApplicationName() != null) {
            String applicationName = applicationInfo.getApplicationName();
            jsonWriter.name("applicationName");
            jsonWriter.value(applicationName);
        }
        if (applicationInfo.getCreateTime() != null) {
            java.util.Date createTime = applicationInfo.getCreateTime();
            jsonWriter.name("createTime");
            jsonWriter.value(createTime);
        }
        if (applicationInfo.getLinkedToGitHub() != null) {
            Boolean linkedToGitHub = applicationInfo.getLinkedToGitHub();
            jsonWriter.name("linkedToGitHub");
            jsonWriter.value(linkedToGitHub);
        }
        if (applicationInfo.getGitHubAccountName() != null) {
            String gitHubAccountName = applicationInfo.getGitHubAccountName();
            jsonWriter.name("gitHubAccountName");
            jsonWriter.value(gitHubAccountName);
        }
        if (applicationInfo.getComputePlatform() != null) {
            String computePlatform = applicationInfo.getComputePlatform();
            jsonWriter.name("computePlatform");
            jsonWriter.value(computePlatform);
        }
        jsonWriter.endObject();
    }

    private static ApplicationInfoJsonMarshaller instance;

    public static ApplicationInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationInfoJsonMarshaller();
        return instance;
    }
}
