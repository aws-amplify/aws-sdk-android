/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdatePlaceIndexResult
 */
public class UpdatePlaceIndexResultJsonUnmarshaller implements
        Unmarshaller<UpdatePlaceIndexResult, JsonUnmarshallerContext> {

    public UpdatePlaceIndexResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdatePlaceIndexResult updatePlaceIndexResult = new UpdatePlaceIndexResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("IndexArn")) {
                updatePlaceIndexResult.setIndexArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IndexName")) {
                updatePlaceIndexResult.setIndexName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdateTime")) {
                updatePlaceIndexResult.setUpdateTime(DateJsonUnmarshaller.getInstance(
                        TimestampFormat.ISO_8601)
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updatePlaceIndexResult;
    }

    private static UpdatePlaceIndexResultJsonUnmarshaller instance;

    public static UpdatePlaceIndexResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdatePlaceIndexResultJsonUnmarshaller();
        return instance;
    }
}
