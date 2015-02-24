/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * Attribute Value Marshaller
 */
public class AttributeValueJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(AttributeValue attributeValue, AwsJsonWriter jsonWriter) {
        if (attributeValue == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.beginObject();

            if (attributeValue.getS() != null) {
                jsonWriter.name("S").value(attributeValue.getS());
            }
            if (attributeValue.getN() != null) {
                jsonWriter.name("N").value(attributeValue.getN());
            }
            if (attributeValue.getB() != null) {
                jsonWriter.name("B").value(attributeValue.getB());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> sSList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(attributeValue.getSS());
            if (sSList != null && !(sSList.isAutoConstruct() && sSList.isEmpty())) {

                jsonWriter.name("SS");
                jsonWriter.beginArray();

                for (String sSListValue : sSList) {
                    if (sSListValue != null) {
                        jsonWriter.value(sSListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> nSList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(attributeValue.getNS());
            if (nSList != null && !(nSList.isAutoConstruct() && nSList.isEmpty())) {

                jsonWriter.name("NS");
                jsonWriter.beginArray();

                for (String nSListValue : nSList) {
                    if (nSListValue != null) {
                        jsonWriter.value(nSListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<java.nio.ByteBuffer> bSList = (com.amazonaws.internal.ListWithAutoConstructFlag<java.nio.ByteBuffer>)(attributeValue.getBS());
            if (bSList != null && !(bSList.isAutoConstruct() && bSList.isEmpty())) {

                jsonWriter.name("BS");
                jsonWriter.beginArray();

                for (java.nio.ByteBuffer bSListValue : bSList) {
                    if (bSListValue != null) {
                        jsonWriter.value(bSListValue);
                    }
                }
                jsonWriter.endArray();
            }
            if (attributeValue.getM() != null) {
                jsonWriter.name("M");
                jsonWriter.beginObject();
                for (Map.Entry<String, AttributeValue> mListValue : attributeValue.getM().entrySet()) {
                    if (mListValue.getValue() != null) {
                        jsonWriter.name(mListValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(mListValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue> lList = (com.amazonaws.internal.ListWithAutoConstructFlag<AttributeValue>)(attributeValue.getL());
            if (lList != null && !(lList.isAutoConstruct() && lList.isEmpty())) {

                jsonWriter.name("L");
                jsonWriter.beginArray();

                for (AttributeValue lListValue : lList) {
                    if (lListValue != null) {
                        AttributeValueJsonMarshaller.getInstance().marshall(lListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (attributeValue.isNULL() != null) {
                jsonWriter.name("NULL").value(attributeValue.isNULL());
            }
            if (attributeValue.isBOOL() != null) {
                jsonWriter.name("BOOL").value(attributeValue.isBOOL());
            }

            jsonWriter.endObject();
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AttributeValueJsonMarshaller instance;
    public static AttributeValueJsonMarshaller getInstance() {
        if (instance == null) instance = new AttributeValueJsonMarshaller();
        return instance;
    }
}
