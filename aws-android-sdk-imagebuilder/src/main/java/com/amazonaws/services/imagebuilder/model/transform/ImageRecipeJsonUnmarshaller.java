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

package com.amazonaws.services.imagebuilder.model.transform;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ImageRecipe
 */
class ImageRecipeJsonUnmarshaller implements Unmarshaller<ImageRecipe, JsonUnmarshallerContext> {

    public ImageRecipe unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ImageRecipe imageRecipe = new ImageRecipe();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("arn")) {
                imageRecipe.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                imageRecipe.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                imageRecipe.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("platform")) {
                imageRecipe.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("owner")) {
                imageRecipe.setOwner(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                imageRecipe.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("components")) {
                imageRecipe.setComponents(new ListUnmarshaller<ComponentConfiguration>(
                        ComponentConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("parentImage")) {
                imageRecipe.setParentImage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("blockDeviceMappings")) {
                imageRecipe
                        .setBlockDeviceMappings(new ListUnmarshaller<InstanceBlockDeviceMapping>(
                                InstanceBlockDeviceMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("dateCreated")) {
                imageRecipe.setDateCreated(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                imageRecipe.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return imageRecipe;
    }

    private static ImageRecipeJsonUnmarshaller instance;

    public static ImageRecipeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageRecipeJsonUnmarshaller();
        return instance;
    }
}
