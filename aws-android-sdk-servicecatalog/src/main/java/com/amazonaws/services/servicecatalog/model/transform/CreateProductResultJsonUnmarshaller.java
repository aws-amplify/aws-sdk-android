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
 * JSON unmarshaller for response CreateProductResult
 */
public class CreateProductResultJsonUnmarshaller implements
        Unmarshaller<CreateProductResult, JsonUnmarshallerContext> {

    public CreateProductResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateProductResult createProductResult = new CreateProductResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ProductViewDetail")) {
                createProductResult.setProductViewDetail(ProductViewDetailJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProvisioningArtifactDetail")) {
                createProductResult
                        .setProvisioningArtifactDetail(ProvisioningArtifactDetailJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                createProductResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createProductResult;
    }

    private static CreateProductResultJsonUnmarshaller instance;

    public static CreateProductResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateProductResultJsonUnmarshaller();
        return instance;
    }
}
