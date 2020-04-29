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
 * JSON marshaller for POJO XssMatchSet
 */
class XssMatchSetJsonMarshaller {

    public void marshall(XssMatchSet xssMatchSet, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (xssMatchSet.getXssMatchSetId() != null) {
            String xssMatchSetId = xssMatchSet.getXssMatchSetId();
            jsonWriter.name("XssMatchSetId");
            jsonWriter.value(xssMatchSetId);
        }
        if (xssMatchSet.getName() != null) {
            String name = xssMatchSet.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (xssMatchSet.getXssMatchTuples() != null) {
            java.util.List<XssMatchTuple> xssMatchTuples = xssMatchSet.getXssMatchTuples();
            jsonWriter.name("XssMatchTuples");
            jsonWriter.beginArray();
            for (XssMatchTuple xssMatchTuplesItem : xssMatchTuples) {
                if (xssMatchTuplesItem != null) {
                    XssMatchTupleJsonMarshaller.getInstance().marshall(xssMatchTuplesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static XssMatchSetJsonMarshaller instance;

    public static XssMatchSetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new XssMatchSetJsonMarshaller();
        return instance;
    }
}
