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
package com.amazonaws.services.mediapackage-vod.model.transform;

import com.amazonaws.services.mediapackage-vod.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SpekeKeyProvider
 */
class SpekeKeyProviderJsonMarshaller {

    public void marshall(SpekeKeyProvider spekeKeyProvider, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (spekeKeyProvider.getRoleArn() != null) {
            String roleArn = spekeKeyProvider.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (spekeKeyProvider.getSystemIds() != null) {
            java.util.List<String> systemIds = spekeKeyProvider.getSystemIds();
            jsonWriter.name("SystemIds");
            jsonWriter.beginArray();
            for (String systemIdsItem : systemIds) {
                if (systemIdsItem != null) {
            jsonWriter.value(systemIdsItem);
                    }
            }
            jsonWriter.endArray();
        }
        if (spekeKeyProvider.getUrl() != null) {
            String url = spekeKeyProvider.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        jsonWriter.endObject();
    }

    private static SpekeKeyProviderJsonMarshaller instance;
    public static SpekeKeyProviderJsonMarshaller getInstance() {
        if (instance == null) instance = new SpekeKeyProviderJsonMarshaller();
        return instance;
    }
}
