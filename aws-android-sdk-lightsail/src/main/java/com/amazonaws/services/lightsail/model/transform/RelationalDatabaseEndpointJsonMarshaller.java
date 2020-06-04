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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RelationalDatabaseEndpoint
 */
class RelationalDatabaseEndpointJsonMarshaller {

    public void marshall(RelationalDatabaseEndpoint relationalDatabaseEndpoint,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (relationalDatabaseEndpoint.getPort() != null) {
            Integer port = relationalDatabaseEndpoint.getPort();
            jsonWriter.name("port");
            jsonWriter.value(port);
        }
        if (relationalDatabaseEndpoint.getAddress() != null) {
            String address = relationalDatabaseEndpoint.getAddress();
            jsonWriter.name("address");
            jsonWriter.value(address);
        }
        jsonWriter.endObject();
    }

    private static RelationalDatabaseEndpointJsonMarshaller instance;

    public static RelationalDatabaseEndpointJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RelationalDatabaseEndpointJsonMarshaller();
        return instance;
    }
}
