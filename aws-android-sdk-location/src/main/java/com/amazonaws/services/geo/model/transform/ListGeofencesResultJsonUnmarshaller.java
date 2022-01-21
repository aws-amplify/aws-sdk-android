/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response ListGeofencesResult
 */
public class ListGeofencesResultJsonUnmarshaller implements
        Unmarshaller<ListGeofencesResult, JsonUnmarshallerContext> {

    public ListGeofencesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListGeofencesResult listGeofencesResult = new ListGeofencesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Entries")) {
                listGeofencesResult.setEntries(new ListUnmarshaller<ListGeofenceResponseEntry>(
                        ListGeofenceResponseEntryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                listGeofencesResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listGeofencesResult;
    }

    private static ListGeofencesResultJsonUnmarshaller instance;

    public static ListGeofencesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListGeofencesResultJsonUnmarshaller();
        return instance;
    }
}
