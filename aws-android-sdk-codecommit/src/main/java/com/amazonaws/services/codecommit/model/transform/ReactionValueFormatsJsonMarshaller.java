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

package com.amazonaws.services.codecommit.model.transform;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ReactionValueFormats
 */
class ReactionValueFormatsJsonMarshaller {

    public void marshall(ReactionValueFormats reactionValueFormats, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (reactionValueFormats.getEmoji() != null) {
            String emoji = reactionValueFormats.getEmoji();
            jsonWriter.name("emoji");
            jsonWriter.value(emoji);
        }
        if (reactionValueFormats.getShortCode() != null) {
            String shortCode = reactionValueFormats.getShortCode();
            jsonWriter.name("shortCode");
            jsonWriter.value(shortCode);
        }
        if (reactionValueFormats.getUnicode() != null) {
            String unicode = reactionValueFormats.getUnicode();
            jsonWriter.name("unicode");
            jsonWriter.value(unicode);
        }
        jsonWriter.endObject();
    }

    private static ReactionValueFormatsJsonMarshaller instance;

    public static ReactionValueFormatsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReactionValueFormatsJsonMarshaller();
        return instance;
    }
}
