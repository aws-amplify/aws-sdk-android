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
 * StAX marshaller for POJO Statement
 */
class StatementStaxMarshaller {

    public void marshall(Statement _statement, Request<?> request, String _prefix) {
        String prefix;
        if (_statement.getSourcePolicyId() != null) {
            prefix = _prefix + "SourcePolicyId";
            String sourcePolicyId = _statement.getSourcePolicyId();
            request.addParameter(prefix, StringUtils.fromString(sourcePolicyId));
        }
        if (_statement.getSourcePolicyType() != null) {
            prefix = _prefix + "SourcePolicyType";
            String sourcePolicyType = _statement.getSourcePolicyType();
            request.addParameter(prefix, StringUtils.fromString(sourcePolicyType));
        }
        if (_statement.getStartPosition() != null) {
            prefix = _prefix + "StartPosition";
            Position startPosition = _statement.getStartPosition();
            PositionStaxMarshaller.getInstance().marshall(startPosition, request, prefix + ".");
        }
        if (_statement.getEndPosition() != null) {
            prefix = _prefix + "EndPosition";
            Position endPosition = _statement.getEndPosition();
            PositionStaxMarshaller.getInstance().marshall(endPosition, request, prefix + ".");
        }
    }

    private static StatementStaxMarshaller instance;

    public static StatementStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StatementStaxMarshaller();
        return instance;
    }
}
