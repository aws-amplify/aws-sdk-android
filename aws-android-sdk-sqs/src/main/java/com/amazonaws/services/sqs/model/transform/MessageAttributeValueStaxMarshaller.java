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

package com.amazonaws.services.sqs.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO MessageAttributeValue
 */
class MessageAttributeValueStaxMarshaller {

    public void marshall(MessageAttributeValue _messageAttributeValue, Request<?> request,
            String _prefix) {
        String prefix;
        if (_messageAttributeValue.getStringValue() != null) {
            prefix = _prefix + "StringValue";
            String stringValue = _messageAttributeValue.getStringValue();
            request.addParameter(prefix, StringUtils.fromString(stringValue));
        }
        if (_messageAttributeValue.getBinaryValue() != null) {
            prefix = _prefix + "BinaryValue";
            java.nio.ByteBuffer binaryValue = _messageAttributeValue.getBinaryValue();
            request.addParameter(prefix, StringUtils.fromByteBuffer(binaryValue));
        }
        if (_messageAttributeValue.getStringListValues() != null) {
            prefix = _prefix + "StringListValue";
            java.util.List<String> stringListValues = _messageAttributeValue.getStringListValues();
            int stringListValuesIndex = 1;
            String stringListValuesPrefix = prefix;
            for (String stringListValuesItem : stringListValues) {
                prefix = stringListValuesPrefix + "." + stringListValuesIndex;
                if (stringListValuesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(stringListValuesItem));
                }
                stringListValuesIndex++;
            }
            prefix = stringListValuesPrefix;
        }
        if (_messageAttributeValue.getBinaryListValues() != null) {
            prefix = _prefix + "BinaryListValue";
            java.util.List<java.nio.ByteBuffer> binaryListValues = _messageAttributeValue
                    .getBinaryListValues();
            int binaryListValuesIndex = 1;
            String binaryListValuesPrefix = prefix;
            for (java.nio.ByteBuffer binaryListValuesItem : binaryListValues) {
                prefix = binaryListValuesPrefix + "." + binaryListValuesIndex;
                if (binaryListValuesItem != null) {
                    request.addParameter(prefix, StringUtils.fromByteBuffer(binaryListValuesItem));
                }
                binaryListValuesIndex++;
            }
            prefix = binaryListValuesPrefix;
        }
        if (_messageAttributeValue.getDataType() != null) {
            prefix = _prefix + "DataType";
            String dataType = _messageAttributeValue.getDataType();
            request.addParameter(prefix, StringUtils.fromString(dataType));
        }
    }

    private static MessageAttributeValueStaxMarshaller instance;

    public static MessageAttributeValueStaxMarshaller getInstance() {
        if (instance == null)
            instance = new MessageAttributeValueStaxMarshaller();
        return instance;
    }
}
