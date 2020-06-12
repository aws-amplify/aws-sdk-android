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

package com.amazonaws.services.models.lex.model.transform;

import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateIntentVersionResult
 */
public class CreateIntentVersionResultJsonUnmarshaller implements
        Unmarshaller<CreateIntentVersionResult, JsonUnmarshallerContext> {

    public CreateIntentVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateIntentVersionResult createIntentVersionResult = new CreateIntentVersionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                createIntentVersionResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                createIntentVersionResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("slots")) {
                createIntentVersionResult.setSlots(new ListUnmarshaller<Slot>(SlotJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("sampleUtterances")) {
                createIntentVersionResult.setSampleUtterances(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("confirmationPrompt")) {
                createIntentVersionResult.setConfirmationPrompt(PromptJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("rejectionStatement")) {
                createIntentVersionResult.setRejectionStatement(StatementJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("followUpPrompt")) {
                createIntentVersionResult.setFollowUpPrompt(FollowUpPromptJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("conclusionStatement")) {
                createIntentVersionResult.setConclusionStatement(StatementJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("dialogCodeHook")) {
                createIntentVersionResult.setDialogCodeHook(CodeHookJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fulfillmentActivity")) {
                createIntentVersionResult
                        .setFulfillmentActivity(FulfillmentActivityJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("parentIntentSignature")) {
                createIntentVersionResult.setParentIntentSignature(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedDate")) {
                createIntentVersionResult.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdDate")) {
                createIntentVersionResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                createIntentVersionResult.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("checksum")) {
                createIntentVersionResult.setChecksum(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("kendraConfiguration")) {
                createIntentVersionResult
                        .setKendraConfiguration(KendraConfigurationJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createIntentVersionResult;
    }

    private static CreateIntentVersionResultJsonUnmarshaller instance;

    public static CreateIntentVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateIntentVersionResultJsonUnmarshaller();
        return instance;
    }
}
