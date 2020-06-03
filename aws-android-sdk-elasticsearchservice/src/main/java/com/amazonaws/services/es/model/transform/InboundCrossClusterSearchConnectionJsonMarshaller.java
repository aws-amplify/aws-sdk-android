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

package com.amazonaws.services.es.model.transform;

import com.amazonaws.services.es.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InboundCrossClusterSearchConnection
 */
class InboundCrossClusterSearchConnectionJsonMarshaller {

    public void marshall(InboundCrossClusterSearchConnection inboundCrossClusterSearchConnection,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (inboundCrossClusterSearchConnection.getSourceDomainInfo() != null) {
            DomainInformation sourceDomainInfo = inboundCrossClusterSearchConnection
                    .getSourceDomainInfo();
            jsonWriter.name("SourceDomainInfo");
            DomainInformationJsonMarshaller.getInstance().marshall(sourceDomainInfo, jsonWriter);
        }
        if (inboundCrossClusterSearchConnection.getDestinationDomainInfo() != null) {
            DomainInformation destinationDomainInfo = inboundCrossClusterSearchConnection
                    .getDestinationDomainInfo();
            jsonWriter.name("DestinationDomainInfo");
            DomainInformationJsonMarshaller.getInstance().marshall(destinationDomainInfo,
                    jsonWriter);
        }
        if (inboundCrossClusterSearchConnection.getCrossClusterSearchConnectionId() != null) {
            String crossClusterSearchConnectionId = inboundCrossClusterSearchConnection
                    .getCrossClusterSearchConnectionId();
            jsonWriter.name("CrossClusterSearchConnectionId");
            jsonWriter.value(crossClusterSearchConnectionId);
        }
        if (inboundCrossClusterSearchConnection.getConnectionStatus() != null) {
            InboundCrossClusterSearchConnectionStatus connectionStatus = inboundCrossClusterSearchConnection
                    .getConnectionStatus();
            jsonWriter.name("ConnectionStatus");
            InboundCrossClusterSearchConnectionStatusJsonMarshaller.getInstance().marshall(
                    connectionStatus, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InboundCrossClusterSearchConnectionJsonMarshaller instance;

    public static InboundCrossClusterSearchConnectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InboundCrossClusterSearchConnectionJsonMarshaller();
        return instance;
    }
}
