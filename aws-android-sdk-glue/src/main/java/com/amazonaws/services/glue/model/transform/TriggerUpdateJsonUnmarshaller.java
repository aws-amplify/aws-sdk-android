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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TriggerUpdate
 */
class TriggerUpdateJsonUnmarshaller implements Unmarshaller<TriggerUpdate, JsonUnmarshallerContext> {

    public TriggerUpdate unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TriggerUpdate triggerUpdate = new TriggerUpdate();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                triggerUpdate.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                triggerUpdate.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Schedule")) {
                triggerUpdate.setSchedule(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Actions")) {
                triggerUpdate.setActions(new ListUnmarshaller<Action>(ActionJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Predicate")) {
                triggerUpdate.setPredicate(PredicateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return triggerUpdate;
    }

    private static TriggerUpdateJsonUnmarshaller instance;

    public static TriggerUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TriggerUpdateJsonUnmarshaller();
        return instance;
    }
}
