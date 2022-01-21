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
 * JSON unmarshaller for POJO SearchPlaceIndexForPositionSummary
 */
class SearchPlaceIndexForPositionSummaryJsonUnmarshaller implements
        Unmarshaller<SearchPlaceIndexForPositionSummary, JsonUnmarshallerContext> {

    public SearchPlaceIndexForPositionSummary unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SearchPlaceIndexForPositionSummary searchPlaceIndexForPositionSummary = new SearchPlaceIndexForPositionSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DataSource")) {
                searchPlaceIndexForPositionSummary.setDataSource(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Language")) {
                searchPlaceIndexForPositionSummary.setLanguage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxResults")) {
                searchPlaceIndexForPositionSummary.setMaxResults(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Position")) {
                searchPlaceIndexForPositionSummary.setPosition(new ListUnmarshaller<Double>(
                        DoubleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return searchPlaceIndexForPositionSummary;
    }

    private static SearchPlaceIndexForPositionSummaryJsonUnmarshaller instance;

    public static SearchPlaceIndexForPositionSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchPlaceIndexForPositionSummaryJsonUnmarshaller();
        return instance;
    }
}
