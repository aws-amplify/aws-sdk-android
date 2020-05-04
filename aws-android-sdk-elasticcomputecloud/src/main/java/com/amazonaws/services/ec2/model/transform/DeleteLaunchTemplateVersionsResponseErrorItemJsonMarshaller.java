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
 * JSON marshaller for POJO DeleteLaunchTemplateVersionsResponseErrorItem
 */
class DeleteLaunchTemplateVersionsResponseErrorItemJsonMarshaller {

    public void marshall(
            DeleteLaunchTemplateVersionsResponseErrorItem deleteLaunchTemplateVersionsResponseErrorItem,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (deleteLaunchTemplateVersionsResponseErrorItem.getLaunchTemplateId() != null) {
            String launchTemplateId = deleteLaunchTemplateVersionsResponseErrorItem
                    .getLaunchTemplateId();
            jsonWriter.name("LaunchTemplateId");
            jsonWriter.value(launchTemplateId);
        }
        if (deleteLaunchTemplateVersionsResponseErrorItem.getLaunchTemplateName() != null) {
            String launchTemplateName = deleteLaunchTemplateVersionsResponseErrorItem
                    .getLaunchTemplateName();
            jsonWriter.name("LaunchTemplateName");
            jsonWriter.value(launchTemplateName);
        }
        if (deleteLaunchTemplateVersionsResponseErrorItem.getVersionNumber() != null) {
            Long versionNumber = deleteLaunchTemplateVersionsResponseErrorItem.getVersionNumber();
            jsonWriter.name("VersionNumber");
            jsonWriter.value(versionNumber);
        }
        if (deleteLaunchTemplateVersionsResponseErrorItem.getResponseError() != null) {
            ResponseError responseError = deleteLaunchTemplateVersionsResponseErrorItem
                    .getResponseError();
            jsonWriter.name("ResponseError");
            ResponseErrorJsonMarshaller.getInstance().marshall(responseError, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DeleteLaunchTemplateVersionsResponseErrorItemJsonMarshaller instance;

    public static DeleteLaunchTemplateVersionsResponseErrorItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeleteLaunchTemplateVersionsResponseErrorItemJsonMarshaller();
        return instance;
    }
}
