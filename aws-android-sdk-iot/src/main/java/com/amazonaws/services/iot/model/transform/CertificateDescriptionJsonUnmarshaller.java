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
 * JSON unmarshaller for POJO CertificateDescription
 */
class CertificateDescriptionJsonUnmarshaller implements
        Unmarshaller<CertificateDescription, JsonUnmarshallerContext> {

    public CertificateDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CertificateDescription certificateDescription = new CertificateDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("certificateArn")) {
                certificateDescription.setCertificateArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificateId")) {
                certificateDescription.setCertificateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("caCertificateId")) {
                certificateDescription.setCaCertificateId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                certificateDescription.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("certificatePem")) {
                certificateDescription.setCertificatePem(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ownedBy")) {
                certificateDescription.setOwnedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("previousOwnedBy")) {
                certificateDescription.setPreviousOwnedBy(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                certificateDescription.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedDate")) {
                certificateDescription.setLastModifiedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("customerVersion")) {
                certificateDescription.setCustomerVersion(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("transferData")) {
                certificateDescription.setTransferData(TransferDataJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("generationId")) {
                certificateDescription.setGenerationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("validity")) {
                certificateDescription.setValidity(CertificateValidityJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return certificateDescription;
    }

    private static CertificateDescriptionJsonUnmarshaller instance;

    public static CertificateDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CertificateDescriptionJsonUnmarshaller();
        return instance;
    }
}
