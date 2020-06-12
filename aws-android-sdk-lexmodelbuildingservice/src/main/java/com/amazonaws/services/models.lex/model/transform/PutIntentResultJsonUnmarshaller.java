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
 * JSON unmarshaller for response PutIntentResult
 */
public class PutIntentResultJsonUnmarshaller implements
        Unmarshaller<PutIntentResult, JsonUnmarshallerContext> {

    public PutIntentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutIntentResult putIntentResult = new PutIntentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                putIntentResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                putIntentResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("slots")) {
                putIntentResult.setSlots(new ListUnmarshaller<Slot>(SlotJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("sampleUtterances")) {
                putIntentResult.setSampleUtterances(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("confirmationPrompt")) {
                putIntentResult.setConfirmationPrompt(PromptJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("rejectionStatement")) {
                putIntentResult.setRejectionStatement(StatementJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("followUpPrompt")) {
                putIntentResult.setFollowUpPrompt(FollowUpPromptJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("conclusionStatement")) {
                putIntentResult.setConclusionStatement(StatementJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dialogCodeHook")) {
                putIntentResult.setDialogCodeHook(CodeHookJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fulfillmentActivity")) {
                putIntentResult.setFulfillmentActivity(FulfillmentActivityJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("parentIntentSignature")) {
                putIntentResult.setParentIntentSignature(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedDate")) {
                putIntentResult.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdDate")) {
                putIntentResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                putIntentResult.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("checksum")) {
                putIntentResult.setChecksum(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createVersion")) {
                putIntentResult.setCreateVersion(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("kendraConfiguration")) {
                putIntentResult.setKendraConfiguration(KendraConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return putIntentResult;
    }

    private static PutIntentResultJsonUnmarshaller instance;

    public static PutIntentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutIntentResultJsonUnmarshaller();
        return instance;
    }
}
