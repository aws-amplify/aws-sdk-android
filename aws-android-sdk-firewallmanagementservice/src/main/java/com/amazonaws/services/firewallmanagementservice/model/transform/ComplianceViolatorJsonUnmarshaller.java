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

package com.amazonaws.services.firewallmanagementservice.model.transform;

import com.amazonaws.services.firewallmanagementservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ComplianceViolator
 */
class ComplianceViolatorJsonUnmarshaller implements
        Unmarshaller<ComplianceViolator, JsonUnmarshallerContext> {

    public ComplianceViolator unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ComplianceViolator complianceViolator = new ComplianceViolator();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ResourceId")) {
                complianceViolator.setResourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ViolationReason")) {
                complianceViolator.setViolationReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceType")) {
                complianceViolator.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return complianceViolator;
    }

    private static ComplianceViolatorJsonUnmarshaller instance;

    public static ComplianceViolatorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComplianceViolatorJsonUnmarshaller();
        return instance;
    }
}
