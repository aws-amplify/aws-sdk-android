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

package com.amazonaws.services.iam.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.iam.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Position
 */
class PositionStaxMarshaller {

    public void marshall(Position _position, Request<?> request, String _prefix) {
        String prefix;
        if (_position.getLine() != null) {
            prefix = _prefix + "Line";
            Integer line = _position.getLine();
            request.addParameter(prefix, StringUtils.fromInteger(line));
        }
        if (_position.getColumn() != null) {
            prefix = _prefix + "Column";
            Integer column = _position.getColumn();
            request.addParameter(prefix, StringUtils.fromInteger(column));
        }
    }

    private static PositionStaxMarshaller instance;

    public static PositionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PositionStaxMarshaller();
        return instance;
    }
}
