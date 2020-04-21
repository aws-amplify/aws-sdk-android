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

package com.amazonaws.services.amazonroute53domains.model.transform;

import com.amazonaws.services.amazonroute53domains.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Nameserver
 */
class NameserverJsonMarshaller {

    public void marshall(Nameserver nameserver, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (nameserver.getName() != null) {
            String name = nameserver.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (nameserver.getGlueIps() != null) {
            java.util.List<String> glueIps = nameserver.getGlueIps();
            jsonWriter.name("GlueIps");
            jsonWriter.beginArray();
            for (String glueIpsItem : glueIps) {
                if (glueIpsItem != null) {
                    jsonWriter.value(glueIpsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static NameserverJsonMarshaller instance;

    public static NameserverJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NameserverJsonMarshaller();
        return instance;
    }
}
