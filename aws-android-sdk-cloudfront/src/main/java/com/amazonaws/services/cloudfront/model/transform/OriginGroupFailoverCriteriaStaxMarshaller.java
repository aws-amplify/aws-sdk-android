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

package com.amazonaws.services.cloudfront.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO OriginGroupFailoverCriteria
 */
class OriginGroupFailoverCriteriaStaxMarshaller {

    public void marshall(OriginGroupFailoverCriteria _originGroupFailoverCriteria,
            Request<?> request, String _prefix) {
        String prefix;
        if (_originGroupFailoverCriteria.getStatusCodes() != null) {
            prefix = _prefix + "StatusCodes";
            StatusCodes statusCodes = _originGroupFailoverCriteria.getStatusCodes();
            StatusCodesStaxMarshaller.getInstance().marshall(statusCodes, request, prefix + ".");
        }
    }

    private static OriginGroupFailoverCriteriaStaxMarshaller instance;

    public static OriginGroupFailoverCriteriaStaxMarshaller getInstance() {
        if (instance == null)
            instance = new OriginGroupFailoverCriteriaStaxMarshaller();
        return instance;
    }
}
