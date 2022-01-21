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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SearchForPositionResult
 */
class SearchForPositionResultJsonMarshaller {

    public void marshall(SearchForPositionResult searchForPositionResult, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (searchForPositionResult.getDistance() != null) {
            Double distance = searchForPositionResult.getDistance();
            jsonWriter.name("Distance");
            jsonWriter.value(distance);
        }
        if (searchForPositionResult.getPlace() != null) {
            Place place = searchForPositionResult.getPlace();
            jsonWriter.name("Place");
            PlaceJsonMarshaller.getInstance().marshall(place, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SearchForPositionResultJsonMarshaller instance;

    public static SearchForPositionResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SearchForPositionResultJsonMarshaller();
        return instance;
    }
}
