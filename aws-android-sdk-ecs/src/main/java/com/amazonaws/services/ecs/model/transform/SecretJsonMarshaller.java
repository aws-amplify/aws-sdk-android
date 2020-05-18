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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Secret
 */
class SecretJsonMarshaller {

    public void marshall(Secret secret, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (secret.getName() != null) {
            String name = secret.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (secret.getValueFrom() != null) {
            String valueFrom = secret.getValueFrom();
            jsonWriter.name("valueFrom");
            jsonWriter.value(valueFrom);
        }
        jsonWriter.endObject();
    }

    private static SecretJsonMarshaller instance;

    public static SecretJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SecretJsonMarshaller();
        return instance;
    }
}
