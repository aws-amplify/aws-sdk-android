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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TwitterParameters
 */
class TwitterParametersJsonMarshaller {

    public void marshall(TwitterParameters twitterParameters, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (twitterParameters.getQuery() != null) {
            String query = twitterParameters.getQuery();
            jsonWriter.name("Query");
            jsonWriter.value(query);
        }
        if (twitterParameters.getMaxRows() != null) {
            Integer maxRows = twitterParameters.getMaxRows();
            jsonWriter.name("MaxRows");
            jsonWriter.value(maxRows);
        }
        jsonWriter.endObject();
    }

    private static TwitterParametersJsonMarshaller instance;

    public static TwitterParametersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TwitterParametersJsonMarshaller();
        return instance;
    }
}
