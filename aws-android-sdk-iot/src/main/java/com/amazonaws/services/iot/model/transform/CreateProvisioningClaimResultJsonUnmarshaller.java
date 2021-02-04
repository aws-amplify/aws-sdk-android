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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateProvisioningClaimResult
 */
public class CreateProvisioningClaimResultJsonUnmarshaller implements
        Unmarshaller<CreateProvisioningClaimResult, JsonUnmarshallerContext> {

    public CreateProvisioningClaimResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        CreateProvisioningClaimResult createProvisioningClaimResult = new CreateProvisioningClaimResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("certificateId")) {
                createProvisioningClaimResult.setCertificateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificatePem")) {
                createProvisioningClaimResult.setCertificatePem(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("keyPair")) {
                createProvisioningClaimResult.setKeyPair(KeyPairJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("expiration")) {
                createProvisioningClaimResult.setExpiration(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createProvisioningClaimResult;
    }

    private static CreateProvisioningClaimResultJsonUnmarshaller instance;

    public static CreateProvisioningClaimResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateProvisioningClaimResultJsonUnmarshaller();
        return instance;
    }
}
