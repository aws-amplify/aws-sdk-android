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
 * JSON unmarshaller for POJO FpgaImage
 */
class FpgaImageJsonUnmarshaller implements Unmarshaller<FpgaImage, JsonUnmarshallerContext> {

    public FpgaImage unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FpgaImage fpgaImage = new FpgaImage();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FpgaImageId")) {
                fpgaImage.setFpgaImageId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FpgaImageGlobalId")) {
                fpgaImage.setFpgaImageGlobalId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                fpgaImage.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                fpgaImage.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ShellVersion")) {
                fpgaImage.setShellVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PciId")) {
                fpgaImage.setPciId(PciIdJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                fpgaImage.setState(FpgaImageStateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreateTime")) {
                fpgaImage.setCreateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdateTime")) {
                fpgaImage.setUpdateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerId")) {
                fpgaImage.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerAlias")) {
                fpgaImage.setOwnerAlias(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProductCodes")) {
                fpgaImage.setProductCodes(new ListUnmarshaller<ProductCode>(
                        ProductCodeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                fpgaImage.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Public")) {
                fpgaImage.setPublic(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataRetentionSupport")) {
                fpgaImage.setDataRetentionSupport(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return fpgaImage;
    }

    private static FpgaImageJsonUnmarshaller instance;

    public static FpgaImageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FpgaImageJsonUnmarshaller();
        return instance;
    }
}
