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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ProvisionedProductDetail
 */
class ProvisionedProductDetailJsonUnmarshaller implements
        Unmarshaller<ProvisionedProductDetail, JsonUnmarshallerContext> {

    public ProvisionedProductDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProvisionedProductDetail provisionedProductDetail = new ProvisionedProductDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                provisionedProductDetail.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                provisionedProductDetail.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                provisionedProductDetail.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                provisionedProductDetail.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                provisionedProductDetail.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                provisionedProductDetail.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTime")) {
                provisionedProductDetail.setCreatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IdempotencyToken")) {
                provisionedProductDetail.setIdempotencyToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastRecordId")) {
                provisionedProductDetail.setLastRecordId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductId")) {
                provisionedProductDetail.setProductId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisioningArtifactId")) {
                provisionedProductDetail.setProvisioningArtifactId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return provisionedProductDetail;
    }

    private static ProvisionedProductDetailJsonUnmarshaller instance;

    public static ProvisionedProductDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedProductDetailJsonUnmarshaller();
        return instance;
    }
}
