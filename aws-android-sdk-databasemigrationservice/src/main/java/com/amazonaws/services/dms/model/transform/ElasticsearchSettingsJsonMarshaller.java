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

package com.amazonaws.services.dms.model.transform;

import com.amazonaws.services.dms.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ElasticsearchSettings
 */
class ElasticsearchSettingsJsonMarshaller {

    public void marshall(ElasticsearchSettings elasticsearchSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (elasticsearchSettings.getServiceAccessRoleArn() != null) {
            String serviceAccessRoleArn = elasticsearchSettings.getServiceAccessRoleArn();
            jsonWriter.name("ServiceAccessRoleArn");
            jsonWriter.value(serviceAccessRoleArn);
        }
        if (elasticsearchSettings.getEndpointUri() != null) {
            String endpointUri = elasticsearchSettings.getEndpointUri();
            jsonWriter.name("EndpointUri");
            jsonWriter.value(endpointUri);
        }
        if (elasticsearchSettings.getFullLoadErrorPercentage() != null) {
            Integer fullLoadErrorPercentage = elasticsearchSettings.getFullLoadErrorPercentage();
            jsonWriter.name("FullLoadErrorPercentage");
            jsonWriter.value(fullLoadErrorPercentage);
        }
        if (elasticsearchSettings.getErrorRetryDuration() != null) {
            Integer errorRetryDuration = elasticsearchSettings.getErrorRetryDuration();
            jsonWriter.name("ErrorRetryDuration");
            jsonWriter.value(errorRetryDuration);
        }
        jsonWriter.endObject();
    }

    private static ElasticsearchSettingsJsonMarshaller instance;

    public static ElasticsearchSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchSettingsJsonMarshaller();
        return instance;
    }
}
