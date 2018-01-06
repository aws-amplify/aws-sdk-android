/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO CACertificateDescription
 */
class CACertificateDescriptionJsonUnmarshaller implements
        Unmarshaller<CACertificateDescription, JsonUnmarshallerContext> {

    public CACertificateDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CACertificateDescription cACertificateDescription = new CACertificateDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("certificateArn")) {
                cACertificateDescription.setCertificateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateId")) {
                cACertificateDescription.setCertificateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                cACertificateDescription.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificatePem")) {
                cACertificateDescription.setCertificatePem(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ownedBy")) {
                cACertificateDescription.setOwnedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                cACertificateDescription.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("autoRegistrationStatus")) {
                cACertificateDescription.setAutoRegistrationStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return cACertificateDescription;
    }

    private static CACertificateDescriptionJsonUnmarshaller instance;

    public static CACertificateDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CACertificateDescriptionJsonUnmarshaller();
        return instance;
    }
}
