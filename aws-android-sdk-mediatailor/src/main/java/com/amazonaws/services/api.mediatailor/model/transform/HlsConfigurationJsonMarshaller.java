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

package com.amazonaws.services.api.mediatailor.model.transform;

import com.amazonaws.services.api.mediatailor.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HlsConfiguration
 */
class HlsConfigurationJsonMarshaller {

    public void marshall(HlsConfiguration hlsConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hlsConfiguration.getManifestEndpointPrefix() != null) {
            String manifestEndpointPrefix = hlsConfiguration.getManifestEndpointPrefix();
            jsonWriter.name("ManifestEndpointPrefix");
            jsonWriter.value(manifestEndpointPrefix);
        }
        jsonWriter.endObject();
    }

    private static HlsConfigurationJsonMarshaller instance;

    public static HlsConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsConfigurationJsonMarshaller();
        return instance;
    }
}
