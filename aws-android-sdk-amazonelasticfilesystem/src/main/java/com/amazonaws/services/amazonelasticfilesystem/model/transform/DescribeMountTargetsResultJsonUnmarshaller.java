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

package com.amazonaws.services.amazonelasticfilesystem.model.transform;

import com.amazonaws.services.amazonelasticfilesystem.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeMountTargetsResult
 */
public class DescribeMountTargetsResultJsonUnmarshaller implements
        Unmarshaller<DescribeMountTargetsResult, JsonUnmarshallerContext> {

    public DescribeMountTargetsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeMountTargetsResult describeMountTargetsResult = new DescribeMountTargetsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Marker")) {
                describeMountTargetsResult.setMarker(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MountTargets")) {
                describeMountTargetsResult
                        .setMountTargets(new ListUnmarshaller<MountTargetDescription>(
                                MountTargetDescriptionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextMarker")) {
                describeMountTargetsResult.setNextMarker(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeMountTargetsResult;
    }

    private static DescribeMountTargetsResultJsonUnmarshaller instance;

    public static DescribeMountTargetsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeMountTargetsResultJsonUnmarshaller();
        return instance;
    }
}
