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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO FpgaImageAttribute
 */
class FpgaImageAttributeJsonUnmarshaller implements
        Unmarshaller<FpgaImageAttribute, JsonUnmarshallerContext> {

    public FpgaImageAttribute unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FpgaImageAttribute fpgaImageAttribute = new FpgaImageAttribute();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FpgaImageId")) {
                fpgaImageAttribute.setFpgaImageId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                fpgaImageAttribute.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                fpgaImageAttribute.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LoadPermissions")) {
                fpgaImageAttribute.setLoadPermissions(new ListUnmarshaller<LoadPermission>(
                        LoadPermissionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ProductCodes")) {
                fpgaImageAttribute.setProductCodes(new ListUnmarshaller<ProductCode>(
                        ProductCodeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return fpgaImageAttribute;
    }

    private static FpgaImageAttributeJsonUnmarshaller instance;

    public static FpgaImageAttributeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FpgaImageAttributeJsonUnmarshaller();
        return instance;
    }
}
