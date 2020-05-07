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
 * JSON marshaller for POJO PortInfo
 */
class PortInfoJsonMarshaller {

    public void marshall(PortInfo portInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (portInfo.getFromPort() != null) {
            Integer fromPort = portInfo.getFromPort();
            jsonWriter.name("fromPort");
            jsonWriter.value(fromPort);
        }
        if (portInfo.getToPort() != null) {
            Integer toPort = portInfo.getToPort();
            jsonWriter.name("toPort");
            jsonWriter.value(toPort);
        }
        if (portInfo.getProtocol() != null) {
            String protocol = portInfo.getProtocol();
            jsonWriter.name("protocol");
            jsonWriter.value(protocol);
        }
        if (portInfo.getCidrs() != null) {
            java.util.List<String> cidrs = portInfo.getCidrs();
            jsonWriter.name("cidrs");
            jsonWriter.beginArray();
            for (String cidrsItem : cidrs) {
                if (cidrsItem != null) {
                    jsonWriter.value(cidrsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (portInfo.getCidrListAliases() != null) {
            java.util.List<String> cidrListAliases = portInfo.getCidrListAliases();
            jsonWriter.name("cidrListAliases");
            jsonWriter.beginArray();
            for (String cidrListAliasesItem : cidrListAliases) {
                if (cidrListAliasesItem != null) {
                    jsonWriter.value(cidrListAliasesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static PortInfoJsonMarshaller instance;

    public static PortInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PortInfoJsonMarshaller();
        return instance;
    }
}
