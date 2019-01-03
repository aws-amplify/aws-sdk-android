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
 * JSON marshaller for POJO ExplicitDeny
 */
class ExplicitDenyJsonMarshaller {

    public void marshall(ExplicitDeny explicitDeny, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (explicitDeny.getPolicies() != null) {
            java.util.List<Policy> policies = explicitDeny.getPolicies();
            jsonWriter.name("policies");
            jsonWriter.beginArray();
            for (Policy policiesItem : policies) {
                if (policiesItem != null) {
                    PolicyJsonMarshaller.getInstance().marshall(policiesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ExplicitDenyJsonMarshaller instance;

    public static ExplicitDenyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExplicitDenyJsonMarshaller();
        return instance;
    }
}
