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

package com.amazonaws.services.dms.model.transform;

import com.amazonaws.services.dms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EventSubscription
 */
class EventSubscriptionJsonUnmarshaller implements
        Unmarshaller<EventSubscription, JsonUnmarshallerContext> {

    public EventSubscription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EventSubscription eventSubscription = new EventSubscription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CustomerAwsId")) {
                eventSubscription.setCustomerAwsId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CustSubscriptionId")) {
                eventSubscription.setCustSubscriptionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SnsTopicArn")) {
                eventSubscription.setSnsTopicArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                eventSubscription.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubscriptionCreationTime")) {
                eventSubscription.setSubscriptionCreationTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceType")) {
                eventSubscription.setSourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceIdsList")) {
                eventSubscription.setSourceIdsList(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EventCategoriesList")) {
                eventSubscription.setEventCategoriesList(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Enabled")) {
                eventSubscription.setEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return eventSubscription;
    }

    private static EventSubscriptionJsonUnmarshaller instance;

    public static EventSubscriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventSubscriptionJsonUnmarshaller();
        return instance;
    }
}
