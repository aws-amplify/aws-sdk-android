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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Webhook
 */
class WebhookJsonUnmarshaller implements Unmarshaller<Webhook, JsonUnmarshallerContext> {

    public Webhook unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Webhook webhook = new Webhook();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("url")) {
                webhook.setUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("payloadUrl")) {
                webhook.setPayloadUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("secret")) {
                webhook.setSecret(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("branchFilter")) {
                webhook.setBranchFilter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("filterGroups")) {
                webhook.setFilterGroups(new ListUnmarshaller<java.util.List<WebhookFilter>>(
                        new ListUnmarshaller<WebhookFilter>(WebhookFilterJsonUnmarshaller
                                .getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("lastModifiedSecret")) {
                webhook.setLastModifiedSecret(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return webhook;
    }

    private static WebhookJsonUnmarshaller instance;

    public static WebhookJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WebhookJsonUnmarshaller();
        return instance;
    }
}
