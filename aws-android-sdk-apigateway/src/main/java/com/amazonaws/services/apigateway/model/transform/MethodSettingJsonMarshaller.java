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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MethodSetting
 */
class MethodSettingJsonMarshaller {

    public void marshall(MethodSetting methodSetting, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (methodSetting.getMetricsEnabled() != null) {
            Boolean metricsEnabled = methodSetting.getMetricsEnabled();
            jsonWriter.name("metricsEnabled");
            jsonWriter.value(metricsEnabled);
        }
        if (methodSetting.getLoggingLevel() != null) {
            String loggingLevel = methodSetting.getLoggingLevel();
            jsonWriter.name("loggingLevel");
            jsonWriter.value(loggingLevel);
        }
        if (methodSetting.getDataTraceEnabled() != null) {
            Boolean dataTraceEnabled = methodSetting.getDataTraceEnabled();
            jsonWriter.name("dataTraceEnabled");
            jsonWriter.value(dataTraceEnabled);
        }
        if (methodSetting.getThrottlingBurstLimit() != null) {
            Integer throttlingBurstLimit = methodSetting.getThrottlingBurstLimit();
            jsonWriter.name("throttlingBurstLimit");
            jsonWriter.value(throttlingBurstLimit);
        }
        if (methodSetting.getThrottlingRateLimit() != null) {
            Double throttlingRateLimit = methodSetting.getThrottlingRateLimit();
            jsonWriter.name("throttlingRateLimit");
            jsonWriter.value(throttlingRateLimit);
        }
        if (methodSetting.getCachingEnabled() != null) {
            Boolean cachingEnabled = methodSetting.getCachingEnabled();
            jsonWriter.name("cachingEnabled");
            jsonWriter.value(cachingEnabled);
        }
        if (methodSetting.getCacheTtlInSeconds() != null) {
            Integer cacheTtlInSeconds = methodSetting.getCacheTtlInSeconds();
            jsonWriter.name("cacheTtlInSeconds");
            jsonWriter.value(cacheTtlInSeconds);
        }
        if (methodSetting.getCacheDataEncrypted() != null) {
            Boolean cacheDataEncrypted = methodSetting.getCacheDataEncrypted();
            jsonWriter.name("cacheDataEncrypted");
            jsonWriter.value(cacheDataEncrypted);
        }
        if (methodSetting.getRequireAuthorizationForCacheControl() != null) {
            Boolean requireAuthorizationForCacheControl = methodSetting
                    .getRequireAuthorizationForCacheControl();
            jsonWriter.name("requireAuthorizationForCacheControl");
            jsonWriter.value(requireAuthorizationForCacheControl);
        }
        if (methodSetting.getUnauthorizedCacheControlHeaderStrategy() != null) {
            String unauthorizedCacheControlHeaderStrategy = methodSetting
                    .getUnauthorizedCacheControlHeaderStrategy();
            jsonWriter.name("unauthorizedCacheControlHeaderStrategy");
            jsonWriter.value(unauthorizedCacheControlHeaderStrategy);
        }
        jsonWriter.endObject();
    }

    private static MethodSettingJsonMarshaller instance;

    public static MethodSettingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MethodSettingJsonMarshaller();
        return instance;
    }
}
