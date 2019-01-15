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
 * JSON marshaller for POJO BaiduChannelRequest
 */
class BaiduChannelRequestJsonMarshaller {

    public void marshall(BaiduChannelRequest baiduChannelRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (baiduChannelRequest.getApiKey() != null) {
            String apiKey = baiduChannelRequest.getApiKey();
            jsonWriter.name("ApiKey");
            jsonWriter.value(apiKey);
        }
        if (baiduChannelRequest.getEnabled() != null) {
            Boolean enabled = baiduChannelRequest.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (baiduChannelRequest.getSecretKey() != null) {
            String secretKey = baiduChannelRequest.getSecretKey();
            jsonWriter.name("SecretKey");
            jsonWriter.value(secretKey);
        }
        jsonWriter.endObject();
    }

    private static BaiduChannelRequestJsonMarshaller instance;

    public static BaiduChannelRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BaiduChannelRequestJsonMarshaller();
        return instance;
    }
}
