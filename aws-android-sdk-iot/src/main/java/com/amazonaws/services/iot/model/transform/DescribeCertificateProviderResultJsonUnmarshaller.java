/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response DescribeCertificateProviderResult
 */
public class DescribeCertificateProviderResultJsonUnmarshaller implements
        Unmarshaller<DescribeCertificateProviderResult, JsonUnmarshallerContext> {

    public DescribeCertificateProviderResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeCertificateProviderResult describeCertificateProviderResult = new DescribeCertificateProviderResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("certificateProviderName")) {
                describeCertificateProviderResult.setCertificateProviderName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateProviderArn")) {
                describeCertificateProviderResult.setCertificateProviderArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("lambdaFunctionArn")) {
                describeCertificateProviderResult.setLambdaFunctionArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("accountDefaultForOperations")) {
                describeCertificateProviderResult
                        .setAccountDefaultForOperations(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("creationDate")) {
                describeCertificateProviderResult.setCreationDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedDate")) {
                describeCertificateProviderResult.setLastModifiedDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeCertificateProviderResult;
    }

    private static DescribeCertificateProviderResultJsonUnmarshaller instance;

    public static DescribeCertificateProviderResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeCertificateProviderResultJsonUnmarshaller();
        return instance;
    }
}
