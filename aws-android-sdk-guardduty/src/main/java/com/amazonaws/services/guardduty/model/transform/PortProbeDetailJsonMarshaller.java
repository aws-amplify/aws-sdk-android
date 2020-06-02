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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PortProbeDetail
 */
class PortProbeDetailJsonMarshaller {

    public void marshall(PortProbeDetail portProbeDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (portProbeDetail.getLocalPortDetails() != null) {
            LocalPortDetails localPortDetails = portProbeDetail.getLocalPortDetails();
            jsonWriter.name("LocalPortDetails");
            LocalPortDetailsJsonMarshaller.getInstance().marshall(localPortDetails, jsonWriter);
        }
        if (portProbeDetail.getLocalIpDetails() != null) {
            LocalIpDetails localIpDetails = portProbeDetail.getLocalIpDetails();
            jsonWriter.name("LocalIpDetails");
            LocalIpDetailsJsonMarshaller.getInstance().marshall(localIpDetails, jsonWriter);
        }
        if (portProbeDetail.getRemoteIpDetails() != null) {
            RemoteIpDetails remoteIpDetails = portProbeDetail.getRemoteIpDetails();
            jsonWriter.name("RemoteIpDetails");
            RemoteIpDetailsJsonMarshaller.getInstance().marshall(remoteIpDetails, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PortProbeDetailJsonMarshaller instance;

    public static PortProbeDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PortProbeDetailJsonMarshaller();
        return instance;
    }
}
