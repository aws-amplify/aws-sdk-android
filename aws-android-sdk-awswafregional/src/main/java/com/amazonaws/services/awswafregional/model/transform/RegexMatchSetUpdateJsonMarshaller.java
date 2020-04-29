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

package com.amazonaws.services.awswafregional.model.transform;

import com.amazonaws.services.awswafregional.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RegexMatchSetUpdate
 */
class RegexMatchSetUpdateJsonMarshaller {

    public void marshall(RegexMatchSetUpdate regexMatchSetUpdate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (regexMatchSetUpdate.getAction() != null) {
            String action = regexMatchSetUpdate.getAction();
            jsonWriter.name("Action");
            jsonWriter.value(action);
        }
        if (regexMatchSetUpdate.getRegexMatchTuple() != null) {
            RegexMatchTuple regexMatchTuple = regexMatchSetUpdate.getRegexMatchTuple();
            jsonWriter.name("RegexMatchTuple");
            RegexMatchTupleJsonMarshaller.getInstance().marshall(regexMatchTuple, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RegexMatchSetUpdateJsonMarshaller instance;

    public static RegexMatchSetUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RegexMatchSetUpdateJsonMarshaller();
        return instance;
    }
}
