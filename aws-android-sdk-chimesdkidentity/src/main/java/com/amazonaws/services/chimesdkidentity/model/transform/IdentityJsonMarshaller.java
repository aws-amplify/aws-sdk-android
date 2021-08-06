/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model.transform;

import com.amazonaws.services.chimesdkidentity.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Identity
 */
class IdentityJsonMarshaller {

    public void marshall(Identity identity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (identity.getArn() != null) {
            String arn = identity.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (identity.getName() != null) {
            String name = identity.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static IdentityJsonMarshaller instance;

    public static IdentityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IdentityJsonMarshaller();
        return instance;
    }
}
