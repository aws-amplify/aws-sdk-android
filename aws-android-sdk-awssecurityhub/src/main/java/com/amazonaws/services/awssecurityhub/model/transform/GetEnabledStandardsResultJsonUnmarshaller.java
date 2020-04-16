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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetEnabledStandardsResult
 */
public class GetEnabledStandardsResultJsonUnmarshaller implements
        Unmarshaller<GetEnabledStandardsResult, JsonUnmarshallerContext> {

    public GetEnabledStandardsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEnabledStandardsResult getEnabledStandardsResult = new GetEnabledStandardsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("StandardsSubscriptions")) {
                getEnabledStandardsResult
                        .setStandardsSubscriptions(new ListUnmarshaller<StandardsSubscription>(
                                StandardsSubscriptionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                getEnabledStandardsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getEnabledStandardsResult;
    }

    private static GetEnabledStandardsResultJsonUnmarshaller instance;

    public static GetEnabledStandardsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetEnabledStandardsResultJsonUnmarshaller();
        return instance;
    }
}
