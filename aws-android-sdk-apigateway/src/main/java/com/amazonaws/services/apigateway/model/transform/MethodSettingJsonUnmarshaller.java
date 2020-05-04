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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MethodSetting
 */
class MethodSettingJsonUnmarshaller implements Unmarshaller<MethodSetting, JsonUnmarshallerContext> {

    public MethodSetting unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MethodSetting methodSetting = new MethodSetting();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("metricsEnabled")) {
                methodSetting.setMetricsEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("loggingLevel")) {
                methodSetting.setLoggingLevel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dataTraceEnabled")) {
                methodSetting.setDataTraceEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("throttlingBurstLimit")) {
                methodSetting.setThrottlingBurstLimit(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("throttlingRateLimit")) {
                methodSetting.setThrottlingRateLimit(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cachingEnabled")) {
                methodSetting.setCachingEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheTtlInSeconds")) {
                methodSetting.setCacheTtlInSeconds(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cacheDataEncrypted")) {
                methodSetting.setCacheDataEncrypted(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("requireAuthorizationForCacheControl")) {
                methodSetting.setRequireAuthorizationForCacheControl(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("unauthorizedCacheControlHeaderStrategy")) {
                methodSetting.setUnauthorizedCacheControlHeaderStrategy(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return methodSetting;
    }

    private static MethodSettingJsonUnmarshaller instance;

    public static MethodSettingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MethodSettingJsonUnmarshaller();
        return instance;
    }
}
