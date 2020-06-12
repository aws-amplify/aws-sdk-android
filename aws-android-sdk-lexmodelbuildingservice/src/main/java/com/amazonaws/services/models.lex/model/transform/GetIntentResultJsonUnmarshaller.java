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
 * JSON unmarshaller for response GetIntentResult
 */
public class GetIntentResultJsonUnmarshaller implements
        Unmarshaller<GetIntentResult, JsonUnmarshallerContext> {

    public GetIntentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetIntentResult getIntentResult = new GetIntentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                getIntentResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                getIntentResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("slots")) {
                getIntentResult.setSlots(new ListUnmarshaller<Slot>(SlotJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("sampleUtterances")) {
                getIntentResult.setSampleUtterances(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("confirmationPrompt")) {
                getIntentResult.setConfirmationPrompt(PromptJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("rejectionStatement")) {
                getIntentResult.setRejectionStatement(StatementJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("followUpPrompt")) {
                getIntentResult.setFollowUpPrompt(FollowUpPromptJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("conclusionStatement")) {
                getIntentResult.setConclusionStatement(StatementJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("dialogCodeHook")) {
                getIntentResult.setDialogCodeHook(CodeHookJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("fulfillmentActivity")) {
                getIntentResult.setFulfillmentActivity(FulfillmentActivityJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("parentIntentSignature")) {
                getIntentResult.setParentIntentSignature(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedDate")) {
                getIntentResult.setLastUpdatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdDate")) {
                getIntentResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                getIntentResult.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("checksum")) {
                getIntentResult.setChecksum(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("kendraConfiguration")) {
                getIntentResult.setKendraConfiguration(KendraConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getIntentResult;
    }

    private static GetIntentResultJsonUnmarshaller instance;

    public static GetIntentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetIntentResultJsonUnmarshaller();
        return instance;
    }
}
