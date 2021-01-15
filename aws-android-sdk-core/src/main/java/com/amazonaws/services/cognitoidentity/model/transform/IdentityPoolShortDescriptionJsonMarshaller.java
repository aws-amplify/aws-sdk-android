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

package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IdentityPoolShortDescription
 */
class IdentityPoolShortDescriptionJsonMarshaller {

    public void marshall(IdentityPoolShortDescription identityPoolShortDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (identityPoolShortDescription.getIdentityPoolId() != null) {
            String identityPoolId = identityPoolShortDescription.getIdentityPoolId();
            jsonWriter.name("IdentityPoolId");
            jsonWriter.value(identityPoolId);
        }
        if (identityPoolShortDescription.getIdentityPoolName() != null) {
            String identityPoolName = identityPoolShortDescription.getIdentityPoolName();
            jsonWriter.name("IdentityPoolName");
            jsonWriter.value(identityPoolName);
        }
        jsonWriter.endObject();
    }

    private static IdentityPoolShortDescriptionJsonMarshaller instance;

    public static IdentityPoolShortDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IdentityPoolShortDescriptionJsonMarshaller();
        return instance;
    }
}
