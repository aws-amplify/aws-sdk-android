/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SecurityProfileTarget
 */
class SecurityProfileTargetJsonMarshaller {

    public void marshall(SecurityProfileTarget securityProfileTarget, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (securityProfileTarget.getArn() != null) {
            String arn = securityProfileTarget.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        jsonWriter.endObject();
    }

    private static SecurityProfileTargetJsonMarshaller instance;

    public static SecurityProfileTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SecurityProfileTargetJsonMarshaller();
        return instance;
    }
}
