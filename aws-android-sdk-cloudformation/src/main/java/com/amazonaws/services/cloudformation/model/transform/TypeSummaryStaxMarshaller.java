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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO TypeSummary
 */
class TypeSummaryStaxMarshaller {

    public void marshall(TypeSummary _typeSummary, Request<?> request, String _prefix) {
        String prefix;
        if (_typeSummary.getType() != null) {
            prefix = _prefix + "Type";
            String type = _typeSummary.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (_typeSummary.getTypeName() != null) {
            prefix = _prefix + "TypeName";
            String typeName = _typeSummary.getTypeName();
            request.addParameter(prefix, StringUtils.fromString(typeName));
        }
        if (_typeSummary.getDefaultVersionId() != null) {
            prefix = _prefix + "DefaultVersionId";
            String defaultVersionId = _typeSummary.getDefaultVersionId();
            request.addParameter(prefix, StringUtils.fromString(defaultVersionId));
        }
        if (_typeSummary.getTypeArn() != null) {
            prefix = _prefix + "TypeArn";
            String typeArn = _typeSummary.getTypeArn();
            request.addParameter(prefix, StringUtils.fromString(typeArn));
        }
        if (_typeSummary.getLastUpdated() != null) {
            prefix = _prefix + "LastUpdated";
            java.util.Date lastUpdated = _typeSummary.getLastUpdated();
            request.addParameter(prefix, StringUtils.fromDate(lastUpdated));
        }
        if (_typeSummary.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _typeSummary.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
    }

    private static TypeSummaryStaxMarshaller instance;

    public static TypeSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TypeSummaryStaxMarshaller();
        return instance;
    }
}
