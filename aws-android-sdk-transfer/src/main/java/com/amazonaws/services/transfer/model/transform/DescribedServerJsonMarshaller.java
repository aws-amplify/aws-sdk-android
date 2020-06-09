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

package com.amazonaws.services.transfer.model.transform;

import com.amazonaws.services.transfer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DescribedServer
 */
class DescribedServerJsonMarshaller {

    public void marshall(DescribedServer describedServer, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (describedServer.getArn() != null) {
            String arn = describedServer.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (describedServer.getCertificate() != null) {
            String certificate = describedServer.getCertificate();
            jsonWriter.name("Certificate");
            jsonWriter.value(certificate);
        }
        if (describedServer.getEndpointDetails() != null) {
            EndpointDetails endpointDetails = describedServer.getEndpointDetails();
            jsonWriter.name("EndpointDetails");
            EndpointDetailsJsonMarshaller.getInstance().marshall(endpointDetails, jsonWriter);
        }
        if (describedServer.getEndpointType() != null) {
            String endpointType = describedServer.getEndpointType();
            jsonWriter.name("EndpointType");
            jsonWriter.value(endpointType);
        }
        if (describedServer.getHostKeyFingerprint() != null) {
            String hostKeyFingerprint = describedServer.getHostKeyFingerprint();
            jsonWriter.name("HostKeyFingerprint");
            jsonWriter.value(hostKeyFingerprint);
        }
        if (describedServer.getIdentityProviderDetails() != null) {
            IdentityProviderDetails identityProviderDetails = describedServer
                    .getIdentityProviderDetails();
            jsonWriter.name("IdentityProviderDetails");
            IdentityProviderDetailsJsonMarshaller.getInstance().marshall(identityProviderDetails,
                    jsonWriter);
        }
        if (describedServer.getIdentityProviderType() != null) {
            String identityProviderType = describedServer.getIdentityProviderType();
            jsonWriter.name("IdentityProviderType");
            jsonWriter.value(identityProviderType);
        }
        if (describedServer.getLoggingRole() != null) {
            String loggingRole = describedServer.getLoggingRole();
            jsonWriter.name("LoggingRole");
            jsonWriter.value(loggingRole);
        }
        if (describedServer.getProtocols() != null) {
            java.util.List<String> protocols = describedServer.getProtocols();
            jsonWriter.name("Protocols");
            jsonWriter.beginArray();
            for (String protocolsItem : protocols) {
                if (protocolsItem != null) {
                    jsonWriter.value(protocolsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (describedServer.getServerId() != null) {
            String serverId = describedServer.getServerId();
            jsonWriter.name("ServerId");
            jsonWriter.value(serverId);
        }
        if (describedServer.getState() != null) {
            String state = describedServer.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (describedServer.getTags() != null) {
            java.util.List<Tag> tags = describedServer.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (describedServer.getUserCount() != null) {
            Integer userCount = describedServer.getUserCount();
            jsonWriter.name("UserCount");
            jsonWriter.value(userCount);
        }
        jsonWriter.endObject();
    }

    private static DescribedServerJsonMarshaller instance;

    public static DescribedServerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DescribedServerJsonMarshaller();
        return instance;
    }
}
