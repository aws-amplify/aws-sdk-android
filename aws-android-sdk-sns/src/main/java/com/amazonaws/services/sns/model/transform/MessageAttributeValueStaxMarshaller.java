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

package com.amazonaws.services.sns.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO MessageAttributeValue
 */
class MessageAttributeValueStaxMarshaller {

    public void marshall(MessageAttributeValue _messageAttributeValue, Request<?> request,
            String _prefix) {
        String prefix;
        if (_messageAttributeValue.getDataType() != null) {
            prefix = _prefix + "DataType";
            String dataType = _messageAttributeValue.getDataType();
            request.addParameter(prefix, StringUtils.fromString(dataType));
        }
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
    }

    private static MessageAttributeValueStaxMarshaller instance;

    public static MessageAttributeValueStaxMarshaller getInstance() {
        if (instance == null)
            instance = new MessageAttributeValueStaxMarshaller();
        return instance;
    }
}
