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

package com.amazonaws.services.awsmediatailor.model.transform;

import com.amazonaws.services.awsmediatailor.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DashConfiguration
 */
class DashConfigurationJsonMarshaller {

    public void marshall(DashConfiguration dashConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dashConfiguration.getManifestEndpointPrefix() != null) {
            String manifestEndpointPrefix = dashConfiguration.getManifestEndpointPrefix();
            jsonWriter.name("ManifestEndpointPrefix");
            jsonWriter.value(manifestEndpointPrefix);
        }
        if (dashConfiguration.getMpdLocation() != null) {
            String mpdLocation = dashConfiguration.getMpdLocation();
            jsonWriter.name("MpdLocation");
            jsonWriter.value(mpdLocation);
        }
        if (dashConfiguration.getOriginManifestType() != null) {
            String originManifestType = dashConfiguration.getOriginManifestType();
            jsonWriter.name("OriginManifestType");
            jsonWriter.value(originManifestType);
        }
        jsonWriter.endObject();
    }

    private static DashConfigurationJsonMarshaller instance;

    public static DashConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DashConfigurationJsonMarshaller();
        return instance;
    }
}
