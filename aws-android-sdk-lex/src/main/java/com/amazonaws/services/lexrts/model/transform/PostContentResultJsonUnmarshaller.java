/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.lexrts.model.PostContentResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.Base64;
import com.amazonaws.util.IOUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * JSON unmarshaller for response PostContentResult
 */
public class PostContentResultJsonUnmarshaller implements
        Unmarshaller<PostContentResult, JsonUnmarshallerContext> {

    @Override
    public PostContentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        final PostContentResult postContentResult = new PostContentResult();
        final Gson gson = new Gson();

        if (context.getHeader("Content-Type") != null) {
            postContentResult.setContentType(context.getHeader("Content-Type"));
        }
        if (context.getHeader("x-amz-lex-intent-name") != null) {
            postContentResult.setIntentName(context.getHeader("x-amz-lex-intent-name"));
        }
        if (context.getHeader("x-amz-lex-slots") != null) {
            final Type mapType = new TypeToken<Map<String, String>>() {
            }.getType();
            final Map<String, String> slots = gson.fromJson(
                    new String(Base64.decode(context.getHeader("x-amz-lex-slots"))),
                    mapType);
            postContentResult.setSlots(slots);
        }
        if (context.getHeader("x-amz-lex-session-attributes") != null) {
            final Type sessionAttributesType = new TypeToken<Map<String, String>>() {
            }.getType();
            final Map<String, String> sessionAttributes = gson.fromJson(
                    new String(Base64
                            .decode(context.getHeader("x-amz-lex-session-attributes"))),
                    sessionAttributesType);
            postContentResult.setSessionAttributes(sessionAttributes);
        }
        if (context.getHeader("x-amz-lex-message") != null) {
            postContentResult.setMessage(context.getHeader("x-amz-lex-message"));
        }
        if (context.getHeader("x-amz-lex-dialog-state") != null) {
            postContentResult.setDialogState(context.getHeader("x-amz-lex-dialog-state"));
        }
        if (context.getHeader("x-amz-lex-slot-to-elicit") != null) {
            postContentResult.setSlotToElicit(context.getHeader("x-amz-lex-slot-to-elicit"));
        }
        final java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            final byte[] bytes = IOUtils.toByteArray(is);
            final java.io.ByteArrayInputStream bis = new java.io.ByteArrayInputStream(bytes);
            postContentResult.setAudioStream(bis);
        }
        return postContentResult;
    }

    private static PostContentResultJsonUnmarshaller instance;

    public static PostContentResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new PostContentResultJsonUnmarshaller();
        }
        return instance;
    }
}
