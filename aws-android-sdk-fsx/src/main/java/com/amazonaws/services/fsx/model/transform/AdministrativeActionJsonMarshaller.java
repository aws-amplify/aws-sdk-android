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

package com.amazonaws.services.fsx.model.transform;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AdministrativeAction
 */
class AdministrativeActionJsonMarshaller {

    public void marshall(AdministrativeAction administrativeAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (administrativeAction.getAdministrativeActionType() != null) {
            String administrativeActionType = administrativeAction.getAdministrativeActionType();
            jsonWriter.name("AdministrativeActionType");
            jsonWriter.value(administrativeActionType);
        }
        if (administrativeAction.getProgressPercent() != null) {
            Integer progressPercent = administrativeAction.getProgressPercent();
            jsonWriter.name("ProgressPercent");
            jsonWriter.value(progressPercent);
        }
        if (administrativeAction.getRequestTime() != null) {
            java.util.Date requestTime = administrativeAction.getRequestTime();
            jsonWriter.name("RequestTime");
            jsonWriter.value(requestTime);
        }
        if (administrativeAction.getStatus() != null) {
            String status = administrativeAction.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (administrativeAction.getTargetFileSystemValues() != null) {
            FileSystem targetFileSystemValues = administrativeAction.getTargetFileSystemValues();
            jsonWriter.name("TargetFileSystemValues");
            FileSystemJsonMarshaller.getInstance().marshall(targetFileSystemValues, jsonWriter);
        }
        if (administrativeAction.getFailureDetails() != null) {
            AdministrativeActionFailureDetails failureDetails = administrativeAction
                    .getFailureDetails();
            jsonWriter.name("FailureDetails");
            AdministrativeActionFailureDetailsJsonMarshaller.getInstance().marshall(failureDetails,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AdministrativeActionJsonMarshaller instance;

    public static AdministrativeActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AdministrativeActionJsonMarshaller();
        return instance;
    }
}
