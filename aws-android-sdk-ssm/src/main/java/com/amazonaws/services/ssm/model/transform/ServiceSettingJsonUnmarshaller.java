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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ServiceSetting
 */
class ServiceSettingJsonUnmarshaller implements
        Unmarshaller<ServiceSetting, JsonUnmarshallerContext> {

    public ServiceSetting unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ServiceSetting serviceSetting = new ServiceSetting();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SettingId")) {
                serviceSetting.setSettingId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SettingValue")) {
                serviceSetting.setSettingValue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                serviceSetting.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedUser")) {
                serviceSetting.setLastModifiedUser(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ARN")) {
                serviceSetting.setARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                serviceSetting.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return serviceSetting;
    }

    private static ServiceSettingJsonUnmarshaller instance;

    public static ServiceSettingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceSettingJsonUnmarshaller();
        return instance;
    }
}
