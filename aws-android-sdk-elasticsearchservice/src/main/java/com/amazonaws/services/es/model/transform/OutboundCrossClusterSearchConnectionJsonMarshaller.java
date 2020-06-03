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
 * JSON marshaller for POJO OutboundCrossClusterSearchConnection
 */
class OutboundCrossClusterSearchConnectionJsonMarshaller {

    public void marshall(OutboundCrossClusterSearchConnection outboundCrossClusterSearchConnection,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (outboundCrossClusterSearchConnection.getSourceDomainInfo() != null) {
            DomainInformation sourceDomainInfo = outboundCrossClusterSearchConnection
                    .getSourceDomainInfo();
            jsonWriter.name("SourceDomainInfo");
            DomainInformationJsonMarshaller.getInstance().marshall(sourceDomainInfo, jsonWriter);
        }
        if (outboundCrossClusterSearchConnection.getDestinationDomainInfo() != null) {
            DomainInformation destinationDomainInfo = outboundCrossClusterSearchConnection
                    .getDestinationDomainInfo();
            jsonWriter.name("DestinationDomainInfo");
            DomainInformationJsonMarshaller.getInstance().marshall(destinationDomainInfo,
                    jsonWriter);
        }
        if (outboundCrossClusterSearchConnection.getCrossClusterSearchConnectionId() != null) {
            String crossClusterSearchConnectionId = outboundCrossClusterSearchConnection
                    .getCrossClusterSearchConnectionId();
            jsonWriter.name("CrossClusterSearchConnectionId");
            jsonWriter.value(crossClusterSearchConnectionId);
        }
        if (outboundCrossClusterSearchConnection.getConnectionAlias() != null) {
            String connectionAlias = outboundCrossClusterSearchConnection.getConnectionAlias();
            jsonWriter.name("ConnectionAlias");
            jsonWriter.value(connectionAlias);
        }
        if (outboundCrossClusterSearchConnection.getConnectionStatus() != null) {
            OutboundCrossClusterSearchConnectionStatus connectionStatus = outboundCrossClusterSearchConnection
                    .getConnectionStatus();
            jsonWriter.name("ConnectionStatus");
            OutboundCrossClusterSearchConnectionStatusJsonMarshaller.getInstance().marshall(
                    connectionStatus, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static OutboundCrossClusterSearchConnectionJsonMarshaller instance;

    public static OutboundCrossClusterSearchConnectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutboundCrossClusterSearchConnectionJsonMarshaller();
        return instance;
    }
}
