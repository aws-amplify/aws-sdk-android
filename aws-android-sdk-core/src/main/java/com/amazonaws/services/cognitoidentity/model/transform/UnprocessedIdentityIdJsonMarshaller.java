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
 * JSON marshaller for POJO UnprocessedIdentityId
 */
class UnprocessedIdentityIdJsonMarshaller {

    public void marshall(UnprocessedIdentityId unprocessedIdentityId, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (unprocessedIdentityId.getIdentityId() != null) {
            String identityId = unprocessedIdentityId.getIdentityId();
            jsonWriter.name("IdentityId");
            jsonWriter.value(identityId);
        }
        if (unprocessedIdentityId.getErrorCode() != null) {
            String errorCode = unprocessedIdentityId.getErrorCode();
            jsonWriter.name("ErrorCode");
            jsonWriter.value(errorCode);
        }
        jsonWriter.endObject();
    }

    private static UnprocessedIdentityIdJsonMarshaller instance;

    public static UnprocessedIdentityIdJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UnprocessedIdentityIdJsonMarshaller();
        return instance;
    }
}
