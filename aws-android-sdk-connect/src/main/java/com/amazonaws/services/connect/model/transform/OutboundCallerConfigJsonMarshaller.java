/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OutboundCallerConfig
 */
class OutboundCallerConfigJsonMarshaller {

    public void marshall(OutboundCallerConfig outboundCallerConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (outboundCallerConfig.getOutboundCallerIdName() != null) {
            String outboundCallerIdName = outboundCallerConfig.getOutboundCallerIdName();
            jsonWriter.name("OutboundCallerIdName");
            jsonWriter.value(outboundCallerIdName);
        }
        if (outboundCallerConfig.getOutboundCallerIdNumberId() != null) {
            String outboundCallerIdNumberId = outboundCallerConfig.getOutboundCallerIdNumberId();
            jsonWriter.name("OutboundCallerIdNumberId");
            jsonWriter.value(outboundCallerIdNumberId);
        }
        if (outboundCallerConfig.getOutboundFlowId() != null) {
            String outboundFlowId = outboundCallerConfig.getOutboundFlowId();
            jsonWriter.name("OutboundFlowId");
            jsonWriter.value(outboundFlowId);
        }
        jsonWriter.endObject();
    }

    private static OutboundCallerConfigJsonMarshaller instance;

    public static OutboundCallerConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutboundCallerConfigJsonMarshaller();
        return instance;
    }
}
