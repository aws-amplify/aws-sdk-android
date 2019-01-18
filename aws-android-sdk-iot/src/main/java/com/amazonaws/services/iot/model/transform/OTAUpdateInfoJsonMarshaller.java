/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OTAUpdateInfo
 */
class OTAUpdateInfoJsonMarshaller {

    public void marshall(OTAUpdateInfo oTAUpdateInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (oTAUpdateInfo.getOtaUpdateId() != null) {
            String otaUpdateId = oTAUpdateInfo.getOtaUpdateId();
            jsonWriter.name("otaUpdateId");
            jsonWriter.value(otaUpdateId);
        }
        if (oTAUpdateInfo.getOtaUpdateArn() != null) {
            String otaUpdateArn = oTAUpdateInfo.getOtaUpdateArn();
            jsonWriter.name("otaUpdateArn");
            jsonWriter.value(otaUpdateArn);
        }
        if (oTAUpdateInfo.getCreationDate() != null) {
            java.util.Date creationDate = oTAUpdateInfo.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (oTAUpdateInfo.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = oTAUpdateInfo.getLastModifiedDate();
            jsonWriter.name("lastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (oTAUpdateInfo.getDescription() != null) {
            String description = oTAUpdateInfo.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (oTAUpdateInfo.getTargets() != null) {
            java.util.List<String> targets = oTAUpdateInfo.getTargets();
            jsonWriter.name("targets");
            jsonWriter.beginArray();
            for (String targetsItem : targets) {
                if (targetsItem != null) {
                    jsonWriter.value(targetsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (oTAUpdateInfo.getAwsJobExecutionsRolloutConfig() != null) {
            AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig = oTAUpdateInfo
                    .getAwsJobExecutionsRolloutConfig();
            jsonWriter.name("awsJobExecutionsRolloutConfig");
            AwsJobExecutionsRolloutConfigJsonMarshaller.getInstance().marshall(
                    awsJobExecutionsRolloutConfig, jsonWriter);
        }
        if (oTAUpdateInfo.getTargetSelection() != null) {
            String targetSelection = oTAUpdateInfo.getTargetSelection();
            jsonWriter.name("targetSelection");
            jsonWriter.value(targetSelection);
        }
        if (oTAUpdateInfo.getOtaUpdateFiles() != null) {
            java.util.List<OTAUpdateFile> otaUpdateFiles = oTAUpdateInfo.getOtaUpdateFiles();
            jsonWriter.name("otaUpdateFiles");
            jsonWriter.beginArray();
            for (OTAUpdateFile otaUpdateFilesItem : otaUpdateFiles) {
                if (otaUpdateFilesItem != null) {
                    OTAUpdateFileJsonMarshaller.getInstance().marshall(otaUpdateFilesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (oTAUpdateInfo.getOtaUpdateStatus() != null) {
            String otaUpdateStatus = oTAUpdateInfo.getOtaUpdateStatus();
            jsonWriter.name("otaUpdateStatus");
            jsonWriter.value(otaUpdateStatus);
        }
        if (oTAUpdateInfo.getAwsIotJobId() != null) {
            String awsIotJobId = oTAUpdateInfo.getAwsIotJobId();
            jsonWriter.name("awsIotJobId");
            jsonWriter.value(awsIotJobId);
        }
        if (oTAUpdateInfo.getAwsIotJobArn() != null) {
            String awsIotJobArn = oTAUpdateInfo.getAwsIotJobArn();
            jsonWriter.name("awsIotJobArn");
            jsonWriter.value(awsIotJobArn);
        }
        if (oTAUpdateInfo.getErrorInfo() != null) {
            ErrorInfo errorInfo = oTAUpdateInfo.getErrorInfo();
            jsonWriter.name("errorInfo");
            ErrorInfoJsonMarshaller.getInstance().marshall(errorInfo, jsonWriter);
        }
        if (oTAUpdateInfo.getAdditionalParameters() != null) {
            java.util.Map<String, String> additionalParameters = oTAUpdateInfo
                    .getAdditionalParameters();
            jsonWriter.name("additionalParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> additionalParametersEntry : additionalParameters
                    .entrySet()) {
                String additionalParametersValue = additionalParametersEntry.getValue();
                if (additionalParametersValue != null) {
                    jsonWriter.name(additionalParametersEntry.getKey());
                    jsonWriter.value(additionalParametersValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static OTAUpdateInfoJsonMarshaller instance;

    public static OTAUpdateInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OTAUpdateInfoJsonMarshaller();
        return instance;
    }
}
