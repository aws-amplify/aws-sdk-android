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
 * JSON marshaller for POJO VpcPeeringConnectionStateReason
 */
class VpcPeeringConnectionStateReasonJsonMarshaller {

    public void marshall(VpcPeeringConnectionStateReason vpcPeeringConnectionStateReason,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vpcPeeringConnectionStateReason.getCode() != null) {
            String code = vpcPeeringConnectionStateReason.getCode();
            jsonWriter.name("Code");
            jsonWriter.value(code);
        }
        if (vpcPeeringConnectionStateReason.getMessage() != null) {
            String message = vpcPeeringConnectionStateReason.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static VpcPeeringConnectionStateReasonJsonMarshaller instance;

    public static VpcPeeringConnectionStateReasonJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpcPeeringConnectionStateReasonJsonMarshaller();
        return instance;
    }
}
