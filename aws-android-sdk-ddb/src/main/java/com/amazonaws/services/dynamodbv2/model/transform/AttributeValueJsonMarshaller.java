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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AttributeValue
 */
class AttributeValueJsonMarshaller {

    public void marshall(AttributeValue attributeValue, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (attributeValue.getS() != null) {
            String s = attributeValue.getS();
            jsonWriter.name("S");
            jsonWriter.value(s);
        }
        if (attributeValue.getN() != null) {
            String n = attributeValue.getN();
            jsonWriter.name("N");
            jsonWriter.value(n);
        }
        if (attributeValue.getB() != null) {
            java.nio.ByteBuffer b = attributeValue.getB();
            jsonWriter.name("B");
            jsonWriter.value(b);
        }
        if (attributeValue.getSS() != null) {
            java.util.List<String> sS = attributeValue.getSS();
            jsonWriter.name("SS");
            jsonWriter.beginArray();
            for (String sSItem : sS) {
                if (sSItem != null) {
                    jsonWriter.value(sSItem);
                }
            }
            jsonWriter.endArray();
        }
        if (attributeValue.getNS() != null) {
            java.util.List<String> nS = attributeValue.getNS();
            jsonWriter.name("NS");
            jsonWriter.beginArray();
            for (String nSItem : nS) {
                if (nSItem != null) {
                    jsonWriter.value(nSItem);
                }
            }
            jsonWriter.endArray();
        }
        if (attributeValue.getBS() != null) {
            java.util.List<java.nio.ByteBuffer> bS = attributeValue.getBS();
            jsonWriter.name("BS");
            jsonWriter.beginArray();
            for (java.nio.ByteBuffer bSItem : bS) {
                if (bSItem != null) {
                    jsonWriter.value(bSItem);
                }
            }
            jsonWriter.endArray();
        }
        if (attributeValue.getM() != null) {
            java.util.Map<String, AttributeValue> m = attributeValue.getM();
            jsonWriter.name("M");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, AttributeValue> mEntry : m.entrySet()) {
                AttributeValue mValue = mEntry.getValue();
                if (mValue != null) {
                    jsonWriter.name(mEntry.getKey());
                    AttributeValueJsonMarshaller.getInstance().marshall(mValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (attributeValue.getL() != null) {
            java.util.List<AttributeValue> l = attributeValue.getL();
            jsonWriter.name("L");
            jsonWriter.beginArray();
            for (AttributeValue lItem : l) {
                if (lItem != null) {
                    AttributeValueJsonMarshaller.getInstance().marshall(lItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (attributeValue.getNULL() != null) {
            Boolean nULL = attributeValue.getNULL();
            jsonWriter.name("NULL");
            jsonWriter.value(nULL);
        }
        if (attributeValue.getBOOL() != null) {
            Boolean bOOL = attributeValue.getBOOL();
            jsonWriter.name("BOOL");
            jsonWriter.value(bOOL);
        }
        jsonWriter.endObject();
    }

    private static AttributeValueJsonMarshaller instance;

    public static AttributeValueJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttributeValueJsonMarshaller();
        return instance;
    }
}
