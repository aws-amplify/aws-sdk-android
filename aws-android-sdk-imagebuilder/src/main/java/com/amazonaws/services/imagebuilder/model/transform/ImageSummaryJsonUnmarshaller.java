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
 * JSON unmarshaller for POJO ImageSummary
 */
class ImageSummaryJsonUnmarshaller implements Unmarshaller<ImageSummary, JsonUnmarshallerContext> {

    public ImageSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ImageSummary imageSummary = new ImageSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("arn")) {
                imageSummary.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                imageSummary.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                imageSummary.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("platform")) {
                imageSummary.setPlatform(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("osVersion")) {
                imageSummary.setOsVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("state")) {
                imageSummary.setState(ImageStateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("owner")) {
                imageSummary.setOwner(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dateCreated")) {
                imageSummary.setDateCreated(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("outputResources")) {
                imageSummary.setOutputResources(OutputResourcesJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                imageSummary.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return imageSummary;
    }

    private static ImageSummaryJsonUnmarshaller instance;

    public static ImageSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageSummaryJsonUnmarshaller();
        return instance;
    }
}
