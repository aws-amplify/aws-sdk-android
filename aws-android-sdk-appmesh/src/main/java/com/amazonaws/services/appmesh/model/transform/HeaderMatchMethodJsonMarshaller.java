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

package com.amazonaws.services.appmesh.model.transform;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HeaderMatchMethod
 */
class HeaderMatchMethodJsonMarshaller {

    public void marshall(HeaderMatchMethod headerMatchMethod, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (headerMatchMethod.getExact() != null) {
            String exact = headerMatchMethod.getExact();
            jsonWriter.name("exact");
            jsonWriter.value(exact);
        }
        if (headerMatchMethod.getPrefix() != null) {
            String prefix = headerMatchMethod.getPrefix();
            jsonWriter.name("prefix");
            jsonWriter.value(prefix);
        }
        if (headerMatchMethod.getRange() != null) {
            MatchRange range = headerMatchMethod.getRange();
            jsonWriter.name("range");
            MatchRangeJsonMarshaller.getInstance().marshall(range, jsonWriter);
        }
        if (headerMatchMethod.getRegex() != null) {
            String regex = headerMatchMethod.getRegex();
            jsonWriter.name("regex");
            jsonWriter.value(regex);
        }
        if (headerMatchMethod.getSuffix() != null) {
            String suffix = headerMatchMethod.getSuffix();
            jsonWriter.name("suffix");
            jsonWriter.value(suffix);
        }
        jsonWriter.endObject();
    }

    private static HeaderMatchMethodJsonMarshaller instance;

    public static HeaderMatchMethodJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HeaderMatchMethodJsonMarshaller();
        return instance;
    }
}
