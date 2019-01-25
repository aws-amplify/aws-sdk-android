/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for response PostContentResult
 */
public class PostContentResultJsonUnmarshaller implements
        Unmarshaller<PostContentResult, JsonUnmarshallerContext> {

    public PostContentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostContentResult postContentResult = new PostContentResult();

        if (context.getHeader("Content-Type") != null)
            postContentResult.setContentType(context.getHeader("Content-Type"));
        if (context.getHeader("x-amz-lex-intent-name") != null)
            postContentResult.setIntentName(context.getHeader("x-amz-lex-intent-name"));
        if (context.getHeader("x-amz-lex-slots") != null)
            postContentResult.setSlots(context.getHeader("x-amz-lex-slots"));
        if (context.getHeader("x-amz-lex-session-attributes") != null)
            postContentResult.setSessionAttributes(context
                    .getHeader("x-amz-lex-session-attributes"));
        if (context.getHeader("x-amz-lex-message") != null)
            postContentResult.setMessage(context.getHeader("x-amz-lex-message"));
        if (context.getHeader("x-amz-lex-message-format") != null)
            postContentResult.setMessageFormat(context.getHeader("x-amz-lex-message-format"));
        if (context.getHeader("x-amz-lex-dialog-state") != null)
            postContentResult.setDialogState(context.getHeader("x-amz-lex-dialog-state"));
        if (context.getHeader("x-amz-lex-slot-to-elicit") != null)
            postContentResult.setSlotToElicit(context.getHeader("x-amz-lex-slot-to-elicit"));
        if (context.getHeader("x-amz-lex-input-transcript") != null)
            postContentResult.setInputTranscript(context.getHeader("x-amz-lex-input-transcript"));
        java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            byte[] bytes = com.amazonaws.util.IOUtils.toByteArray(is);
            java.io.ByteArrayInputStream bis = new java.io.ByteArrayInputStream(bytes);
            postContentResult.setAudioStream(bis);
        }
        return postContentResult;
    }

    private static PostContentResultJsonUnmarshaller instance;

    public static PostContentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostContentResultJsonUnmarshaller();
        return instance;
    }
}
