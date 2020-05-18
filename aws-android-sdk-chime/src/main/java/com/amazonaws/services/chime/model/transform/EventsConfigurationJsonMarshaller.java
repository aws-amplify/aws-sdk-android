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

package com.amazonaws.services.chime.model.transform;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EventsConfiguration
 */
class EventsConfigurationJsonMarshaller {

    public void marshall(EventsConfiguration eventsConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eventsConfiguration.getBotId() != null) {
            String botId = eventsConfiguration.getBotId();
            jsonWriter.name("BotId");
            jsonWriter.value(botId);
        }
        if (eventsConfiguration.getOutboundEventsHTTPSEndpoint() != null) {
            String outboundEventsHTTPSEndpoint = eventsConfiguration
                    .getOutboundEventsHTTPSEndpoint();
            jsonWriter.name("OutboundEventsHTTPSEndpoint");
            jsonWriter.value(outboundEventsHTTPSEndpoint);
        }
        if (eventsConfiguration.getLambdaFunctionArn() != null) {
            String lambdaFunctionArn = eventsConfiguration.getLambdaFunctionArn();
            jsonWriter.name("LambdaFunctionArn");
            jsonWriter.value(lambdaFunctionArn);
        }
        jsonWriter.endObject();
    }

    private static EventsConfigurationJsonMarshaller instance;

    public static EventsConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventsConfigurationJsonMarshaller();
        return instance;
    }
}
