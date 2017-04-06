/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response TransferCertificateResult
 */
public class TransferCertificateResultJsonUnmarshaller implements
        Unmarshaller<TransferCertificateResult, JsonUnmarshallerContext> {

    public TransferCertificateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        TransferCertificateResult transferCertificateResult = new TransferCertificateResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("transferredCertificateArn")) {
                transferCertificateResult.setTransferredCertificateArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return transferCertificateResult;
    }

    private static TransferCertificateResultJsonUnmarshaller instance;

    public static TransferCertificateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransferCertificateResultJsonUnmarshaller();
        return instance;
    }
}
