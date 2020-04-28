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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ServiceSetting
 */
class ServiceSettingJsonMarshaller {

    public void marshall(ServiceSetting serviceSetting, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (serviceSetting.getSettingId() != null) {
            String settingId = serviceSetting.getSettingId();
            jsonWriter.name("SettingId");
            jsonWriter.value(settingId);
        }
        if (serviceSetting.getSettingValue() != null) {
            String settingValue = serviceSetting.getSettingValue();
            jsonWriter.name("SettingValue");
            jsonWriter.value(settingValue);
        }
        if (serviceSetting.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = serviceSetting.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (serviceSetting.getLastModifiedUser() != null) {
            String lastModifiedUser = serviceSetting.getLastModifiedUser();
            jsonWriter.name("LastModifiedUser");
            jsonWriter.value(lastModifiedUser);
        }
        if (serviceSetting.getARN() != null) {
            String aRN = serviceSetting.getARN();
            jsonWriter.name("ARN");
            jsonWriter.value(aRN);
        }
        if (serviceSetting.getStatus() != null) {
            String status = serviceSetting.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static ServiceSettingJsonMarshaller instance;

    public static ServiceSettingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServiceSettingJsonMarshaller();
        return instance;
    }
}
