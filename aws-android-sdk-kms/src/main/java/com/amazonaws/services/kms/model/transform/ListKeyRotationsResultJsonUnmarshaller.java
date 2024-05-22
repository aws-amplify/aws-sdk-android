/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListKeyRotationsResult
 */
public class ListKeyRotationsResultJsonUnmarshaller implements
        Unmarshaller<ListKeyRotationsResult, JsonUnmarshallerContext> {

    public ListKeyRotationsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListKeyRotationsResult listKeyRotationsResult = new ListKeyRotationsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Rotations")) {
                listKeyRotationsResult.setRotations(new ListUnmarshaller<RotationsListEntry>(
                        RotationsListEntryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextMarker")) {
                listKeyRotationsResult.setNextMarker(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Truncated")) {
                listKeyRotationsResult.setTruncated(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listKeyRotationsResult;
    }

    private static ListKeyRotationsResultJsonUnmarshaller instance;

    public static ListKeyRotationsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListKeyRotationsResultJsonUnmarshaller();
        return instance;
    }
}
