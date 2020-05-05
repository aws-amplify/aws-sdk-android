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
 * JSON marshaller for POJO LaunchTemplateVersion
 */
class LaunchTemplateVersionJsonMarshaller {

    public void marshall(LaunchTemplateVersion launchTemplateVersion, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (launchTemplateVersion.getLaunchTemplateId() != null) {
            String launchTemplateId = launchTemplateVersion.getLaunchTemplateId();
            jsonWriter.name("LaunchTemplateId");
            jsonWriter.value(launchTemplateId);
        }
        if (launchTemplateVersion.getLaunchTemplateName() != null) {
            String launchTemplateName = launchTemplateVersion.getLaunchTemplateName();
            jsonWriter.name("LaunchTemplateName");
            jsonWriter.value(launchTemplateName);
        }
        if (launchTemplateVersion.getVersionNumber() != null) {
            Long versionNumber = launchTemplateVersion.getVersionNumber();
            jsonWriter.name("VersionNumber");
            jsonWriter.value(versionNumber);
        }
        if (launchTemplateVersion.getVersionDescription() != null) {
            String versionDescription = launchTemplateVersion.getVersionDescription();
            jsonWriter.name("VersionDescription");
            jsonWriter.value(versionDescription);
        }
        if (launchTemplateVersion.getCreateTime() != null) {
            java.util.Date createTime = launchTemplateVersion.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(createTime);
        }
        if (launchTemplateVersion.getCreatedBy() != null) {
            String createdBy = launchTemplateVersion.getCreatedBy();
            jsonWriter.name("CreatedBy");
            jsonWriter.value(createdBy);
        }
        if (launchTemplateVersion.getDefaultVersion() != null) {
            Boolean defaultVersion = launchTemplateVersion.getDefaultVersion();
            jsonWriter.name("DefaultVersion");
            jsonWriter.value(defaultVersion);
        }
        if (launchTemplateVersion.getLaunchTemplateData() != null) {
            ResponseLaunchTemplateData launchTemplateData = launchTemplateVersion
                    .getLaunchTemplateData();
            jsonWriter.name("LaunchTemplateData");
            ResponseLaunchTemplateDataJsonMarshaller.getInstance().marshall(launchTemplateData,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateVersionJsonMarshaller instance;

    public static LaunchTemplateVersionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateVersionJsonMarshaller();
        return instance;
    }
}
