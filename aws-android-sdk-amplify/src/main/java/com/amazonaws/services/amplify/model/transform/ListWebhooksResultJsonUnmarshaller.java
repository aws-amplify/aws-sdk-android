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

package com.amazonaws.services.amplify.model.transform;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListWebhooksResult
 */
public class ListWebhooksResultJsonUnmarshaller implements
        Unmarshaller<ListWebhooksResult, JsonUnmarshallerContext> {

    public ListWebhooksResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListWebhooksResult listWebhooksResult = new ListWebhooksResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("webhooks")) {
                listWebhooksResult.setWebhooks(new ListUnmarshaller<Webhook>(
                        WebhookJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("nextToken")) {
                listWebhooksResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listWebhooksResult;
    }

    private static ListWebhooksResultJsonUnmarshaller instance;

    public static ListWebhooksResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListWebhooksResultJsonUnmarshaller();
        return instance;
    }
}
