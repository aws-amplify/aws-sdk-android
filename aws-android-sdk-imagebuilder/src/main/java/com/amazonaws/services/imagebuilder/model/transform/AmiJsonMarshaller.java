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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Ami
 */
class AmiJsonMarshaller {

    public void marshall(Ami ami, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ami.getRegion() != null) {
            String region = ami.getRegion();
            jsonWriter.name("region");
            jsonWriter.value(region);
        }
        if (ami.getImage() != null) {
            String image = ami.getImage();
            jsonWriter.name("image");
            jsonWriter.value(image);
        }
        if (ami.getName() != null) {
            String name = ami.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (ami.getDescription() != null) {
            String description = ami.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (ami.getState() != null) {
            ImageState state = ami.getState();
            jsonWriter.name("state");
            ImageStateJsonMarshaller.getInstance().marshall(state, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AmiJsonMarshaller instance;

    public static AmiJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AmiJsonMarshaller();
        return instance;
    }
}
