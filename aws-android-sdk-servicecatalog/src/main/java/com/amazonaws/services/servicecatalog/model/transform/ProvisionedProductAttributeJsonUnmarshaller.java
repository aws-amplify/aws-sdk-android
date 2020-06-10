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
 * JSON unmarshaller for POJO ProvisionedProductAttribute
 */
class ProvisionedProductAttributeJsonUnmarshaller implements
        Unmarshaller<ProvisionedProductAttribute, JsonUnmarshallerContext> {

    public ProvisionedProductAttribute unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProvisionedProductAttribute provisionedProductAttribute = new ProvisionedProductAttribute();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                provisionedProductAttribute.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                provisionedProductAttribute.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                provisionedProductAttribute.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                provisionedProductAttribute.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                provisionedProductAttribute.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                provisionedProductAttribute.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTime")) {
                provisionedProductAttribute.setCreatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IdempotencyToken")) {
                provisionedProductAttribute.setIdempotencyToken(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastRecordId")) {
                provisionedProductAttribute.setLastRecordId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                provisionedProductAttribute.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PhysicalId")) {
                provisionedProductAttribute.setPhysicalId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductId")) {
                provisionedProductAttribute.setProductId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisioningArtifactId")) {
                provisionedProductAttribute.setProvisioningArtifactId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserArn")) {
                provisionedProductAttribute.setUserArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserArnSession")) {
                provisionedProductAttribute.setUserArnSession(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return provisionedProductAttribute;
    }

    private static ProvisionedProductAttributeJsonUnmarshaller instance;

    public static ProvisionedProductAttributeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedProductAttributeJsonUnmarshaller();
        return instance;
    }
}
