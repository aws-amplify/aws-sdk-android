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
 * JSON unmarshaller for response ListCertificateProvidersResult
 */
public class ListCertificateProvidersResultJsonUnmarshaller implements
        Unmarshaller<ListCertificateProvidersResult, JsonUnmarshallerContext> {

    public ListCertificateProvidersResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ListCertificateProvidersResult listCertificateProvidersResult = new ListCertificateProvidersResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("certificateProviders")) {
                listCertificateProvidersResult
                        .setCertificateProviders(new ListUnmarshaller<CertificateProviderSummary>(
                                CertificateProviderSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("nextToken")) {
                listCertificateProvidersResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listCertificateProvidersResult;
    }

    private static ListCertificateProvidersResultJsonUnmarshaller instance;

    public static ListCertificateProvidersResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListCertificateProvidersResultJsonUnmarshaller();
        return instance;
    }
}
