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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FollowUpPrompt
 */
class FollowUpPromptJsonMarshaller {

    public void marshall(FollowUpPrompt followUpPrompt, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (followUpPrompt.getPrompt() != null) {
            Prompt prompt = followUpPrompt.getPrompt();
            jsonWriter.name("prompt");
            PromptJsonMarshaller.getInstance().marshall(prompt, jsonWriter);
        }
        if (followUpPrompt.getRejectionStatement() != null) {
            Statement rejectionStatement = followUpPrompt.getRejectionStatement();
            jsonWriter.name("rejectionStatement");
            StatementJsonMarshaller.getInstance().marshall(rejectionStatement, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static FollowUpPromptJsonMarshaller instance;

    public static FollowUpPromptJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FollowUpPromptJsonMarshaller();
        return instance;
    }
}
