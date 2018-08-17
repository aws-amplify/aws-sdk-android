/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SyntaxToken
 */
class SyntaxTokenJsonUnmarshaller implements Unmarshaller<SyntaxToken, JsonUnmarshallerContext> {

    public SyntaxToken unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SyntaxToken syntaxToken = new SyntaxToken();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TokenId")) {
                syntaxToken.setTokenId(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Text")) {
                syntaxToken.setText(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BeginOffset")) {
                syntaxToken.setBeginOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndOffset")) {
                syntaxToken.setEndOffset(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PartOfSpeech")) {
                syntaxToken.setPartOfSpeech(PartOfSpeechTagJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return syntaxToken;
    }

    private static SyntaxTokenJsonUnmarshaller instance;

    public static SyntaxTokenJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SyntaxTokenJsonUnmarshaller();
        return instance;
    }
}
