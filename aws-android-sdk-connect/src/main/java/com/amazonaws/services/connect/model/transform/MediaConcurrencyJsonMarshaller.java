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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MediaConcurrency
 */
class MediaConcurrencyJsonMarshaller {

    public void marshall(MediaConcurrency mediaConcurrency, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (mediaConcurrency.getChannel() != null) {
            String channel = mediaConcurrency.getChannel();
            jsonWriter.name("Channel");
            jsonWriter.value(channel);
        }
        if (mediaConcurrency.getConcurrency() != null) {
            Integer concurrency = mediaConcurrency.getConcurrency();
            jsonWriter.name("Concurrency");
            jsonWriter.value(concurrency);
        }
        jsonWriter.endObject();
    }

    private static MediaConcurrencyJsonMarshaller instance;

    public static MediaConcurrencyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MediaConcurrencyJsonMarshaller();
        return instance;
    }
}
