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
 * JSON marshaller for POJO SpotInstanceStatus
 */
class SpotInstanceStatusJsonMarshaller {

    public void marshall(SpotInstanceStatus spotInstanceStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (spotInstanceStatus.getCode() != null) {
            String code = spotInstanceStatus.getCode();
            jsonWriter.name("Code");
            jsonWriter.value(code);
        }
        if (spotInstanceStatus.getMessage() != null) {
            String message = spotInstanceStatus.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (spotInstanceStatus.getUpdateTime() != null) {
            java.util.Date updateTime = spotInstanceStatus.getUpdateTime();
            jsonWriter.name("UpdateTime");
            jsonWriter.value(updateTime);
        }
        jsonWriter.endObject();
    }

    private static SpotInstanceStatusJsonMarshaller instance;

    public static SpotInstanceStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SpotInstanceStatusJsonMarshaller();
        return instance;
    }
}
