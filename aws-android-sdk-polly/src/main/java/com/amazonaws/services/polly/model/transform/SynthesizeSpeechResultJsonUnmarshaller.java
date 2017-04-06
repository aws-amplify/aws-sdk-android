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

package com.amazonaws.services.polly.model.transform;

import com.amazonaws.services.polly.model.SynthesizeSpeechResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.IOUtils;

/**
 * JSON unmarshaller for response SynthesizeSpeechResult
 */
public class SynthesizeSpeechResultJsonUnmarshaller implements
        Unmarshaller<SynthesizeSpeechResult, JsonUnmarshallerContext> {

    @Override
    public SynthesizeSpeechResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        final SynthesizeSpeechResult synthesizeSpeechResult = new SynthesizeSpeechResult();

        final java.io.InputStream is = context.getHttpResponse().getContent();
        if (is != null) {
            final byte[] bytes = IOUtils.toByteArray(is);
            final java.io.ByteArrayInputStream bis = new java.io.ByteArrayInputStream(bytes);
            synthesizeSpeechResult.setAudioStream(bis);
        }
        if (context.getHeader("Content-Type") != null) {
            synthesizeSpeechResult.setContentType(context.getHeader("Content-Type"));
        }
        if (context.getHeader("x-amzn-RequestCharacters") != null) {
            synthesizeSpeechResult.setRequestCharacters(Integer.valueOf(context
                    .getHeader("x-amzn-RequestCharacters")));
        }
        return synthesizeSpeechResult;
    }

    private static SynthesizeSpeechResultJsonUnmarshaller instance;

    public static SynthesizeSpeechResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new SynthesizeSpeechResultJsonUnmarshaller();
        }
        return instance;
    }
}
