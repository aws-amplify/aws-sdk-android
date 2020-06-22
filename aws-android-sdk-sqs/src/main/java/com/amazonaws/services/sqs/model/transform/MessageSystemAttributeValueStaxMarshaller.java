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

package com.amazonaws.services.sqs.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO MessageSystemAttributeValue
 */
class MessageSystemAttributeValueStaxMarshaller {

    public void marshall(MessageSystemAttributeValue _messageSystemAttributeValue,
            Request<?> request, String _prefix) {
        String prefix;
        if (_messageSystemAttributeValue.getStringValue() != null) {
            prefix = _prefix + "StringValue";
            String stringValue = _messageSystemAttributeValue.getStringValue();
            request.addParameter(prefix, StringUtils.fromString(stringValue));
        }
        if (_messageSystemAttributeValue.getBinaryValue() != null) {
            prefix = _prefix + "BinaryValue";
            java.nio.ByteBuffer binaryValue = _messageSystemAttributeValue.getBinaryValue();
            request.addParameter(prefix, StringUtils.fromByteBuffer(binaryValue));
        }
        if (_messageSystemAttributeValue.getStringListValues() != null) {
            prefix = _prefix + "StringListValue";
            java.util.List<String> stringListValues = _messageSystemAttributeValue
                    .getStringListValues();
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
        if (_messageSystemAttributeValue.getBinaryListValues() != null) {
            prefix = _prefix + "BinaryListValue";
            java.util.List<java.nio.ByteBuffer> binaryListValues = _messageSystemAttributeValue
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
        if (_messageSystemAttributeValue.getDataType() != null) {
            prefix = _prefix + "DataType";
            String dataType = _messageSystemAttributeValue.getDataType();
            request.addParameter(prefix, StringUtils.fromString(dataType));
        }
    }

    private static MessageSystemAttributeValueStaxMarshaller instance;

    public static MessageSystemAttributeValueStaxMarshaller getInstance() {
        if (instance == null)
            instance = new MessageSystemAttributeValueStaxMarshaller();
        return instance;
    }
}
