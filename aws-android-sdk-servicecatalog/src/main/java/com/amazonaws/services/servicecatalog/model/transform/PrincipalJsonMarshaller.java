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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Principal
 */
class PrincipalJsonMarshaller {

    public void marshall(Principal principal, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (principal.getPrincipalARN() != null) {
            String principalARN = principal.getPrincipalARN();
            jsonWriter.name("PrincipalARN");
            jsonWriter.value(principalARN);
        }
        if (principal.getPrincipalType() != null) {
            String principalType = principal.getPrincipalType();
            jsonWriter.name("PrincipalType");
            jsonWriter.value(principalType);
        }
        jsonWriter.endObject();
    }

    private static PrincipalJsonMarshaller instance;

    public static PrincipalJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PrincipalJsonMarshaller();
        return instance;
    }
}
