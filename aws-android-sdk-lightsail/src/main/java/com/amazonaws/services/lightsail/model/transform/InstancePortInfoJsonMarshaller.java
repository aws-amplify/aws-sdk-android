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
 * JSON marshaller for POJO InstancePortInfo
 */
class InstancePortInfoJsonMarshaller {

    public void marshall(InstancePortInfo instancePortInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instancePortInfo.getFromPort() != null) {
            Integer fromPort = instancePortInfo.getFromPort();
            jsonWriter.name("fromPort");
            jsonWriter.value(fromPort);
        }
        if (instancePortInfo.getToPort() != null) {
            Integer toPort = instancePortInfo.getToPort();
            jsonWriter.name("toPort");
            jsonWriter.value(toPort);
        }
        if (instancePortInfo.getProtocol() != null) {
            String protocol = instancePortInfo.getProtocol();
            jsonWriter.name("protocol");
            jsonWriter.value(protocol);
        }
        if (instancePortInfo.getAccessFrom() != null) {
            String accessFrom = instancePortInfo.getAccessFrom();
            jsonWriter.name("accessFrom");
            jsonWriter.value(accessFrom);
        }
        if (instancePortInfo.getAccessType() != null) {
            String accessType = instancePortInfo.getAccessType();
            jsonWriter.name("accessType");
            jsonWriter.value(accessType);
        }
        if (instancePortInfo.getCommonName() != null) {
            String commonName = instancePortInfo.getCommonName();
            jsonWriter.name("commonName");
            jsonWriter.value(commonName);
        }
        if (instancePortInfo.getAccessDirection() != null) {
            String accessDirection = instancePortInfo.getAccessDirection();
            jsonWriter.name("accessDirection");
            jsonWriter.value(accessDirection);
        }
        if (instancePortInfo.getCidrs() != null) {
            java.util.List<String> cidrs = instancePortInfo.getCidrs();
            jsonWriter.name("cidrs");
            jsonWriter.beginArray();
            for (String cidrsItem : cidrs) {
                if (cidrsItem != null) {
                    jsonWriter.value(cidrsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (instancePortInfo.getCidrListAliases() != null) {
            java.util.List<String> cidrListAliases = instancePortInfo.getCidrListAliases();
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

    private static InstancePortInfoJsonMarshaller instance;

    public static InstancePortInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstancePortInfoJsonMarshaller();
        return instance;
    }
}
