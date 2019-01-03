/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO OutgoingCertificate
 */
class OutgoingCertificateJsonUnmarshaller implements
        Unmarshaller<OutgoingCertificate, JsonUnmarshallerContext> {

    public OutgoingCertificate unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        OutgoingCertificate outgoingCertificate = new OutgoingCertificate();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("certificateArn")) {
                outgoingCertificate.setCertificateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateId")) {
                outgoingCertificate.setCertificateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("transferredTo")) {
                outgoingCertificate.setTransferredTo(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("transferDate")) {
                outgoingCertificate.setTransferDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("transferMessage")) {
                outgoingCertificate.setTransferMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                outgoingCertificate.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return outgoingCertificate;
    }

    private static OutgoingCertificateJsonUnmarshaller instance;

    public static OutgoingCertificateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OutgoingCertificateJsonUnmarshaller();
        return instance;
    }
}
