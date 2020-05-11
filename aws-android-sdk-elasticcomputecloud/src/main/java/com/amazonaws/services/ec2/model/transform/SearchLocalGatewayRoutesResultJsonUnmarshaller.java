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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response SearchLocalGatewayRoutesResult
 */
public class SearchLocalGatewayRoutesResultJsonUnmarshaller implements
        Unmarshaller<SearchLocalGatewayRoutesResult, JsonUnmarshallerContext> {

    public SearchLocalGatewayRoutesResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        SearchLocalGatewayRoutesResult searchLocalGatewayRoutesResult = new SearchLocalGatewayRoutesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Routes")) {
                searchLocalGatewayRoutesResult.setRoutes(new ListUnmarshaller<LocalGatewayRoute>(
                        LocalGatewayRouteJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                searchLocalGatewayRoutesResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return searchLocalGatewayRoutesResult;
    }

    private static SearchLocalGatewayRoutesResultJsonUnmarshaller instance;

    public static SearchLocalGatewayRoutesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchLocalGatewayRoutesResultJsonUnmarshaller();
        return instance;
    }
}
