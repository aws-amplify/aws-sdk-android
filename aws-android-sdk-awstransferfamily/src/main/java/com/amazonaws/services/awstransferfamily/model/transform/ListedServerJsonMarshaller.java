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

package com.amazonaws.services.awstransferfamily.model.transform;

import com.amazonaws.services.awstransferfamily.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ListedServer
 */
class ListedServerJsonMarshaller {

    public void marshall(ListedServer listedServer, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (listedServer.getArn() != null) {
            String arn = listedServer.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (listedServer.getIdentityProviderType() != null) {
            String identityProviderType = listedServer.getIdentityProviderType();
            jsonWriter.name("IdentityProviderType");
            jsonWriter.value(identityProviderType);
        }
        if (listedServer.getEndpointType() != null) {
            String endpointType = listedServer.getEndpointType();
            jsonWriter.name("EndpointType");
            jsonWriter.value(endpointType);
        }
        if (listedServer.getLoggingRole() != null) {
            String loggingRole = listedServer.getLoggingRole();
            jsonWriter.name("LoggingRole");
            jsonWriter.value(loggingRole);
        }
        if (listedServer.getServerId() != null) {
            String serverId = listedServer.getServerId();
            jsonWriter.name("ServerId");
            jsonWriter.value(serverId);
        }
        if (listedServer.getState() != null) {
            String state = listedServer.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (listedServer.getUserCount() != null) {
            Integer userCount = listedServer.getUserCount();
            jsonWriter.name("UserCount");
            jsonWriter.value(userCount);
        }
        jsonWriter.endObject();
    }

    private static ListedServerJsonMarshaller instance;

    public static ListedServerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListedServerJsonMarshaller();
        return instance;
    }
}
