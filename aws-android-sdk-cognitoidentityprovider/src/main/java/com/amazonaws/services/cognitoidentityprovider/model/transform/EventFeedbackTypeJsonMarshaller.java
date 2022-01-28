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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EventFeedbackType
 */
class EventFeedbackTypeJsonMarshaller {

    public void marshall(EventFeedbackType eventFeedbackType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eventFeedbackType.getFeedbackValue() != null) {
            String feedbackValue = eventFeedbackType.getFeedbackValue();
            jsonWriter.name("FeedbackValue");
            jsonWriter.value(feedbackValue);
        }
        if (eventFeedbackType.getProvider() != null) {
            String provider = eventFeedbackType.getProvider();
            jsonWriter.name("Provider");
            jsonWriter.value(provider);
        }
        if (eventFeedbackType.getFeedbackDate() != null) {
            java.util.Date feedbackDate = eventFeedbackType.getFeedbackDate();
            jsonWriter.name("FeedbackDate");
            jsonWriter.value(feedbackDate);
        }
        jsonWriter.endObject();
    }

    private static EventFeedbackTypeJsonMarshaller instance;

    public static EventFeedbackTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventFeedbackTypeJsonMarshaller();
        return instance;
    }
}
