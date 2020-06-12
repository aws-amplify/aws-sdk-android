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
 * JSON unmarshaller for POJO ImageRecipeSummary
 */
class ImageRecipeSummaryJsonUnmarshaller implements
        Unmarshaller<ImageRecipeSummary, JsonUnmarshallerContext> {

    public ImageRecipeSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ImageRecipeSummary imageRecipeSummary = new ImageRecipeSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("arn")) {
                imageRecipeSummary.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                imageRecipeSummary.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("platform")) {
                imageRecipeSummary.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("owner")) {
                imageRecipeSummary.setOwner(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("parentImage")) {
                imageRecipeSummary.setParentImage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dateCreated")) {
                imageRecipeSummary.setDateCreated(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                imageRecipeSummary.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return imageRecipeSummary;
    }

    private static ImageRecipeSummaryJsonUnmarshaller instance;

    public static ImageRecipeSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageRecipeSummaryJsonUnmarshaller();
        return instance;
    }
}
