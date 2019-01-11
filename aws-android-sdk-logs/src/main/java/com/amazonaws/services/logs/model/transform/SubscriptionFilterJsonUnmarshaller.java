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

package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SubscriptionFilter
 */
class SubscriptionFilterJsonUnmarshaller implements
        Unmarshaller<SubscriptionFilter, JsonUnmarshallerContext> {

    public SubscriptionFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SubscriptionFilter subscriptionFilter = new SubscriptionFilter();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("filterName")) {
                subscriptionFilter.setFilterName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("logGroupName")) {
                subscriptionFilter.setLogGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("filterPattern")) {
                subscriptionFilter.setFilterPattern(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("destinationArn")) {
                subscriptionFilter.setDestinationArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("roleArn")) {
                subscriptionFilter.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("distribution")) {
                subscriptionFilter.setDistribution(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationTime")) {
                subscriptionFilter.setCreationTime(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return subscriptionFilter;
    }

    private static SubscriptionFilterJsonUnmarshaller instance;

    public static SubscriptionFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SubscriptionFilterJsonUnmarshaller();
        return instance;
    }
}
