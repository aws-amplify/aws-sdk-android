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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO AnalyticsFilter
 */
class AnalyticsFilterStaxMarshaller {

    public void marshall(AnalyticsFilter _analyticsFilter, Request<?> request, String _prefix) {
        String prefix;
        if (_analyticsFilter.getPrefix() != null) {
            prefix = _prefix + "Prefix";
            String prefix = _analyticsFilter.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
        if (_analyticsFilter.getTag() != null) {
            prefix = _prefix + "Tag";
            Tag tag = _analyticsFilter.getTag();
            TagStaxMarshaller.getInstance().marshall(tag, request, prefix + ".");
        }
        if (_analyticsFilter.getAnd() != null) {
            prefix = _prefix + "And";
            AnalyticsAndOperator and = _analyticsFilter.getAnd();
            AnalyticsAndOperatorStaxMarshaller.getInstance().marshall(and, request, prefix + ".");
        }
    }

    private static AnalyticsFilterStaxMarshaller instance;

    public static AnalyticsFilterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AnalyticsFilterStaxMarshaller();
        return instance;
    }
}
