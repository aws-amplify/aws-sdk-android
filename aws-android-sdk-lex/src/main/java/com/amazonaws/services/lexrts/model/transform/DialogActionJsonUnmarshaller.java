/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lexrts.model.transform;

import com.amazonaws.services.lexrts.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DialogAction
 */
class DialogActionJsonUnmarshaller implements Unmarshaller<DialogAction, JsonUnmarshallerContext> {

    public DialogAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DialogAction dialogAction = new DialogAction();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("type")) {
                dialogAction.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("intentName")) {
                dialogAction.setIntentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("slots")) {
                dialogAction.setSlots(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("slotToElicit")) {
                dialogAction.setSlotToElicit(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fulfillmentState")) {
                dialogAction.setFulfillmentState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("message")) {
                dialogAction.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("messageFormat")) {
                dialogAction.setMessageFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dialogAction;
    }

    private static DialogActionJsonUnmarshaller instance;

    public static DialogActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DialogActionJsonUnmarshaller();
        return instance;
    }
}
