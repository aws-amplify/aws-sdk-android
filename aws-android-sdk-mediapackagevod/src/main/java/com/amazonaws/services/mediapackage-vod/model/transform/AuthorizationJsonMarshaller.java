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
package com.amazonaws.services.mediapackage-vod.model.transform;

import com.amazonaws.services.mediapackage-vod.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Authorization
 */
class AuthorizationJsonMarshaller {

    public void marshall(Authorization authorization, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (authorization.getCdnIdentifierSecret() != null) {
            String cdnIdentifierSecret = authorization.getCdnIdentifierSecret();
            jsonWriter.name("CdnIdentifierSecret");
            jsonWriter.value(cdnIdentifierSecret);
        }
        if (authorization.getSecretsRoleArn() != null) {
            String secretsRoleArn = authorization.getSecretsRoleArn();
            jsonWriter.name("SecretsRoleArn");
            jsonWriter.value(secretsRoleArn);
        }
        jsonWriter.endObject();
    }

    private static AuthorizationJsonMarshaller instance;
    public static AuthorizationJsonMarshaller getInstance() {
        if (instance == null) instance = new AuthorizationJsonMarshaller();
        return instance;
    }
}
