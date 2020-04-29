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

package com.amazonaws.services.awswaf.model.transform;

import com.amazonaws.services.awswaf.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RegexPatternSet
 */
class RegexPatternSetJsonMarshaller {

    public void marshall(RegexPatternSet regexPatternSet, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (regexPatternSet.getRegexPatternSetId() != null) {
            String regexPatternSetId = regexPatternSet.getRegexPatternSetId();
            jsonWriter.name("RegexPatternSetId");
            jsonWriter.value(regexPatternSetId);
        }
        if (regexPatternSet.getName() != null) {
            String name = regexPatternSet.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (regexPatternSet.getRegexPatternStrings() != null) {
            java.util.List<String> regexPatternStrings = regexPatternSet.getRegexPatternStrings();
            jsonWriter.name("RegexPatternStrings");
            jsonWriter.beginArray();
            for (String regexPatternStringsItem : regexPatternStrings) {
                if (regexPatternStringsItem != null) {
                    jsonWriter.value(regexPatternStringsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RegexPatternSetJsonMarshaller instance;

    public static RegexPatternSetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RegexPatternSetJsonMarshaller();
        return instance;
    }
}
