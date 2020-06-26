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
 * JSON marshaller for POJO SupportedEndpointType
 */
class SupportedEndpointTypeJsonMarshaller {

    public void marshall(SupportedEndpointType supportedEndpointType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (supportedEndpointType.getEngineName() != null) {
            String engineName = supportedEndpointType.getEngineName();
            jsonWriter.name("EngineName");
            jsonWriter.value(engineName);
        }
        if (supportedEndpointType.getSupportsCDC() != null) {
            Boolean supportsCDC = supportedEndpointType.getSupportsCDC();
            jsonWriter.name("SupportsCDC");
            jsonWriter.value(supportsCDC);
        }
        if (supportedEndpointType.getEndpointType() != null) {
            String endpointType = supportedEndpointType.getEndpointType();
            jsonWriter.name("EndpointType");
            jsonWriter.value(endpointType);
        }
        if (supportedEndpointType.getReplicationInstanceEngineMinimumVersion() != null) {
            String replicationInstanceEngineMinimumVersion = supportedEndpointType
                    .getReplicationInstanceEngineMinimumVersion();
            jsonWriter.name("ReplicationInstanceEngineMinimumVersion");
            jsonWriter.value(replicationInstanceEngineMinimumVersion);
        }
        if (supportedEndpointType.getEngineDisplayName() != null) {
            String engineDisplayName = supportedEndpointType.getEngineDisplayName();
            jsonWriter.name("EngineDisplayName");
            jsonWriter.value(engineDisplayName);
        }
        jsonWriter.endObject();
    }

    private static SupportedEndpointTypeJsonMarshaller instance;

    public static SupportedEndpointTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SupportedEndpointTypeJsonMarshaller();
        return instance;
    }
}
