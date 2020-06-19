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
 * JSON marshaller for POJO LaunchTemplate
 */
class LaunchTemplateJsonMarshaller {

    public void marshall(LaunchTemplate launchTemplate, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (launchTemplate.getLaunchTemplateId() != null) {
            String launchTemplateId = launchTemplate.getLaunchTemplateId();
            jsonWriter.name("LaunchTemplateId");
            jsonWriter.value(launchTemplateId);
        }
        if (launchTemplate.getLaunchTemplateName() != null) {
            String launchTemplateName = launchTemplate.getLaunchTemplateName();
            jsonWriter.name("LaunchTemplateName");
            jsonWriter.value(launchTemplateName);
        }
        if (launchTemplate.getCreateTime() != null) {
            java.util.Date createTime = launchTemplate.getCreateTime();
            jsonWriter.name("CreateTime");
            jsonWriter.value(createTime);
        }
        if (launchTemplate.getCreatedBy() != null) {
            String createdBy = launchTemplate.getCreatedBy();
            jsonWriter.name("CreatedBy");
            jsonWriter.value(createdBy);
        }
        if (launchTemplate.getDefaultVersionNumber() != null) {
            Long defaultVersionNumber = launchTemplate.getDefaultVersionNumber();
            jsonWriter.name("DefaultVersionNumber");
            jsonWriter.value(defaultVersionNumber);
        }
        if (launchTemplate.getLatestVersionNumber() != null) {
            Long latestVersionNumber = launchTemplate.getLatestVersionNumber();
            jsonWriter.name("LatestVersionNumber");
            jsonWriter.value(latestVersionNumber);
        }
        if (launchTemplate.getTags() != null) {
            java.util.List<Tag> tags = launchTemplate.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateJsonMarshaller instance;

    public static LaunchTemplateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateJsonMarshaller();
        return instance;
    }
}
