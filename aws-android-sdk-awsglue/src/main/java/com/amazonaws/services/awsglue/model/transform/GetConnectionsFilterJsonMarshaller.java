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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GetConnectionsFilter
 */
class GetConnectionsFilterJsonMarshaller {

    public void marshall(GetConnectionsFilter getConnectionsFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (getConnectionsFilter.getMatchCriteria() != null) {
            java.util.List<String> matchCriteria = getConnectionsFilter.getMatchCriteria();
            jsonWriter.name("MatchCriteria");
            jsonWriter.beginArray();
            for (String matchCriteriaItem : matchCriteria) {
                if (matchCriteriaItem != null) {
                    jsonWriter.value(matchCriteriaItem);
                }
            }
            jsonWriter.endArray();
        }
        if (getConnectionsFilter.getConnectionType() != null) {
            String connectionType = getConnectionsFilter.getConnectionType();
            jsonWriter.name("ConnectionType");
            jsonWriter.value(connectionType);
        }
        jsonWriter.endObject();
    }

    private static GetConnectionsFilterJsonMarshaller instance;

    public static GetConnectionsFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GetConnectionsFilterJsonMarshaller();
        return instance;
    }
}
