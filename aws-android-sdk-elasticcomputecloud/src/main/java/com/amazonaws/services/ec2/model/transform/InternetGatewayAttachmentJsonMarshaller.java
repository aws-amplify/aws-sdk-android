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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InternetGatewayAttachment
 */
class InternetGatewayAttachmentJsonMarshaller {

    public void marshall(InternetGatewayAttachment internetGatewayAttachment,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (internetGatewayAttachment.getState() != null) {
            String state = internetGatewayAttachment.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (internetGatewayAttachment.getVpcId() != null) {
            String vpcId = internetGatewayAttachment.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        jsonWriter.endObject();
    }

    private static InternetGatewayAttachmentJsonMarshaller instance;

    public static InternetGatewayAttachmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InternetGatewayAttachmentJsonMarshaller();
        return instance;
    }
}
