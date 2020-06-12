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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GenerateClientCertificateResult
 */
public class GenerateClientCertificateResultJsonUnmarshaller implements
        Unmarshaller<GenerateClientCertificateResult, JsonUnmarshallerContext> {

    public GenerateClientCertificateResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GenerateClientCertificateResult generateClientCertificateResult = new GenerateClientCertificateResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("clientCertificateId")) {
                generateClientCertificateResult.setClientCertificateId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                generateClientCertificateResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("pemEncodedCertificate")) {
                generateClientCertificateResult.setPemEncodedCertificate(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdDate")) {
                generateClientCertificateResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("expirationDate")) {
                generateClientCertificateResult.setExpirationDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                generateClientCertificateResult.setTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return generateClientCertificateResult;
    }

    private static GenerateClientCertificateResultJsonUnmarshaller instance;

    public static GenerateClientCertificateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GenerateClientCertificateResultJsonUnmarshaller();
        return instance;
    }
}
