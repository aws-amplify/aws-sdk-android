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
 * JSON marshaller for POJO DeleteLaunchTemplateVersionsResponseSuccessItem
 */
class DeleteLaunchTemplateVersionsResponseSuccessItemJsonMarshaller {

    public void marshall(
            DeleteLaunchTemplateVersionsResponseSuccessItem deleteLaunchTemplateVersionsResponseSuccessItem,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (deleteLaunchTemplateVersionsResponseSuccessItem.getLaunchTemplateId() != null) {
            String launchTemplateId = deleteLaunchTemplateVersionsResponseSuccessItem
                    .getLaunchTemplateId();
            jsonWriter.name("LaunchTemplateId");
            jsonWriter.value(launchTemplateId);
        }
        if (deleteLaunchTemplateVersionsResponseSuccessItem.getLaunchTemplateName() != null) {
            String launchTemplateName = deleteLaunchTemplateVersionsResponseSuccessItem
                    .getLaunchTemplateName();
            jsonWriter.name("LaunchTemplateName");
            jsonWriter.value(launchTemplateName);
        }
        if (deleteLaunchTemplateVersionsResponseSuccessItem.getVersionNumber() != null) {
            Long versionNumber = deleteLaunchTemplateVersionsResponseSuccessItem.getVersionNumber();
            jsonWriter.name("VersionNumber");
            jsonWriter.value(versionNumber);
        }
        jsonWriter.endObject();
    }

    private static DeleteLaunchTemplateVersionsResponseSuccessItemJsonMarshaller instance;

    public static DeleteLaunchTemplateVersionsResponseSuccessItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeleteLaunchTemplateVersionsResponseSuccessItemJsonMarshaller();
        return instance;
    }
}
