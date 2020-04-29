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
 * JSON marshaller for POJO RegexMatchSet
 */
class RegexMatchSetJsonMarshaller {

    public void marshall(RegexMatchSet regexMatchSet, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (regexMatchSet.getRegexMatchSetId() != null) {
            String regexMatchSetId = regexMatchSet.getRegexMatchSetId();
            jsonWriter.name("RegexMatchSetId");
            jsonWriter.value(regexMatchSetId);
        }
        if (regexMatchSet.getName() != null) {
            String name = regexMatchSet.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (regexMatchSet.getRegexMatchTuples() != null) {
            java.util.List<RegexMatchTuple> regexMatchTuples = regexMatchSet.getRegexMatchTuples();
            jsonWriter.name("RegexMatchTuples");
            jsonWriter.beginArray();
            for (RegexMatchTuple regexMatchTuplesItem : regexMatchTuples) {
                if (regexMatchTuplesItem != null) {
                    RegexMatchTupleJsonMarshaller.getInstance().marshall(regexMatchTuplesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RegexMatchSetJsonMarshaller instance;

    public static RegexMatchSetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RegexMatchSetJsonMarshaller();
        return instance;
    }
}
