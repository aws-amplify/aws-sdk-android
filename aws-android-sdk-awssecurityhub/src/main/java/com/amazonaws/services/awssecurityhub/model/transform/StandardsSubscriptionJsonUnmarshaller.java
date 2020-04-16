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
 * JSON unmarshaller for POJO StandardsSubscription
 */
class StandardsSubscriptionJsonUnmarshaller implements
        Unmarshaller<StandardsSubscription, JsonUnmarshallerContext> {

    public StandardsSubscription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StandardsSubscription standardsSubscription = new StandardsSubscription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("StandardsSubscriptionArn")) {
                standardsSubscription.setStandardsSubscriptionArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StandardsArn")) {
                standardsSubscription.setStandardsArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StandardsInput")) {
                standardsSubscription.setStandardsInput(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("StandardsStatus")) {
                standardsSubscription.setStandardsStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return standardsSubscription;
    }

    private static StandardsSubscriptionJsonUnmarshaller instance;

    public static StandardsSubscriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StandardsSubscriptionJsonUnmarshaller();
        return instance;
    }
}
