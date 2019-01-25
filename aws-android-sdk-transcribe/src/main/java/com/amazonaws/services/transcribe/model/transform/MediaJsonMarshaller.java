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

package com.amazonaws.services.transcribe.model.transform;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Media
 */
class MediaJsonMarshaller {

    public void marshall(Media media, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (media.getMediaFileUri() != null) {
            String mediaFileUri = media.getMediaFileUri();
            jsonWriter.name("MediaFileUri");
            jsonWriter.value(mediaFileUri);
        }
        jsonWriter.endObject();
    }

    private static MediaJsonMarshaller instance;

    public static MediaJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MediaJsonMarshaller();
        return instance;
    }
}
