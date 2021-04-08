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
 * JSON unmarshaller for response PutSessionResult
 */
public class PutSessionResultJsonUnmarshaller implements
        Unmarshaller<PutSessionResult, JsonUnmarshallerContext> {

    public PutSessionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutSessionResult putSessionResult = new PutSessionResult();

        if (context.getHeader("Content-Type") != null)
            putSessionResult.setContentType(context.getHeader("Content-Type"));
        if (context.getHeader("x-amz-lex-intent-name") != null)
            putSessionResult.setIntentName(context.getHeader("x-amz-lex-intent-name"));
        if (context.getHeader("x-amz-lex-slots") != null)
            putSessionResult.setSlots(context.getHeader("x-amz-lex-slots"));
        if (context.getHeader("x-amz-lex-session-attributes") != null)
            putSessionResult
                    .setSessionAttributes(context.getHeader("x-amz-lex-session-attributes"));
        if (context.getHeader("x-amz-lex-message") != null)
            putSessionResult.setMessage(context.getHeader("x-amz-lex-message"));
        if (context.getHeader("x-amz-lex-encoded-message") != null)
            putSessionResult.setEncodedMessage(context.getHeader("x-amz-lex-encoded-message"));
        if (context.getHeader("x-amz-lex-message-format") != null)
            putSessionResult.setMessageFormat(context.getHeader("x-amz-lex-message-format"));
        if (context.getHeader("x-amz-lex-dialog-state") != null)
            putSessionResult.setDialogState(context.getHeader("x-amz-lex-dialog-state"));
        if (context.getHeader("x-amz-lex-slot-to-elicit") != null)
            putSessionResult.setSlotToElicit(context.getHeader("x-amz-lex-slot-to-elicit"));
        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            byte[] bytes = com.amazonaws.util.IOUtils.toByteArray(is);
            java.io.ByteArrayInputStream bis = new java.io.ByteArrayInputStream(bytes);
            putSessionResult.setAudioStream(bis);
        }
        if (context.getHeader("x-amz-lex-session-id") != null)
            putSessionResult.setSessionId(context.getHeader("x-amz-lex-session-id"));
        if (context.getHeader("x-amz-lex-active-contexts") != null)
            putSessionResult.setActiveContexts(context.getHeader("x-amz-lex-active-contexts"));
        return putSessionResult;
    }

    private static PutSessionResultJsonUnmarshaller instance;

    public static PutSessionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutSessionResultJsonUnmarshaller();
        return instance;
    }
}
