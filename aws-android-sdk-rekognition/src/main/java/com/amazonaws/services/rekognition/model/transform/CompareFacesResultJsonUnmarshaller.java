/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CompareFacesResult
 */
public class CompareFacesResultJsonUnmarshaller implements
        Unmarshaller<CompareFacesResult, JsonUnmarshallerContext> {

    public CompareFacesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CompareFacesResult compareFacesResult = new CompareFacesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SourceImageFace")) {
                compareFacesResult.setSourceImageFace(ComparedSourceImageFaceJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FaceMatches")) {
                compareFacesResult.setFaceMatches(new ListUnmarshaller<CompareFacesMatch>(
                        CompareFacesMatchJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UnmatchedFaces")) {
                compareFacesResult.setUnmatchedFaces(new ListUnmarshaller<ComparedFace>(
                        ComparedFaceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SourceImageOrientationCorrection")) {
                compareFacesResult.setSourceImageOrientationCorrection(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetImageOrientationCorrection")) {
                compareFacesResult.setTargetImageOrientationCorrection(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return compareFacesResult;
    }

    private static CompareFacesResultJsonUnmarshaller instance;

    public static CompareFacesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CompareFacesResultJsonUnmarshaller();
        return instance;
    }
}
