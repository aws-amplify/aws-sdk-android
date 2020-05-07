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
 * JSON marshaller for POJO InstancePortState
 */
class InstancePortStateJsonMarshaller {

    public void marshall(InstancePortState instancePortState, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instancePortState.getFromPort() != null) {
            Integer fromPort = instancePortState.getFromPort();
            jsonWriter.name("fromPort");
            jsonWriter.value(fromPort);
        }
        if (instancePortState.getToPort() != null) {
            Integer toPort = instancePortState.getToPort();
            jsonWriter.name("toPort");
            jsonWriter.value(toPort);
        }
        if (instancePortState.getProtocol() != null) {
            String protocol = instancePortState.getProtocol();
            jsonWriter.name("protocol");
            jsonWriter.value(protocol);
        }
        if (instancePortState.getState() != null) {
            String state = instancePortState.getState();
            jsonWriter.name("state");
            jsonWriter.value(state);
        }
        if (instancePortState.getCidrs() != null) {
            java.util.List<String> cidrs = instancePortState.getCidrs();
            jsonWriter.name("cidrs");
            jsonWriter.beginArray();
            for (String cidrsItem : cidrs) {
                if (cidrsItem != null) {
                    jsonWriter.value(cidrsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (instancePortState.getCidrListAliases() != null) {
            java.util.List<String> cidrListAliases = instancePortState.getCidrListAliases();
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

    private static InstancePortStateJsonMarshaller instance;

    public static InstancePortStateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstancePortStateJsonMarshaller();
        return instance;
    }
}
