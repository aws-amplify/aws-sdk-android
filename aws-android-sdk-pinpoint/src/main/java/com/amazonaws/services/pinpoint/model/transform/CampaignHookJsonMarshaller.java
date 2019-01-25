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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CampaignHook
 */
class CampaignHookJsonMarshaller {

    public void marshall(CampaignHook campaignHook, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (campaignHook.getLambdaFunctionName() != null) {
            String lambdaFunctionName = campaignHook.getLambdaFunctionName();
            jsonWriter.name("LambdaFunctionName");
            jsonWriter.value(lambdaFunctionName);
        }
        if (campaignHook.getMode() != null) {
            String mode = campaignHook.getMode();
            jsonWriter.name("Mode");
            jsonWriter.value(mode);
        }
        if (campaignHook.getWebUrl() != null) {
            String webUrl = campaignHook.getWebUrl();
            jsonWriter.name("WebUrl");
            jsonWriter.value(webUrl);
        }
        jsonWriter.endObject();
    }

    private static CampaignHookJsonMarshaller instance;

    public static CampaignHookJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CampaignHookJsonMarshaller();
        return instance;
    }
}
