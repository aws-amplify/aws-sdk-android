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
 * StAX marshaller for POJO CompletedPart
 */
class CompletedPartStaxMarshaller {

    public void marshall(CompletedPart _completedPart, Request<?> request, String _prefix) {
        String prefix;
        if (_completedPart.getETag() != null) {
            prefix = _prefix + "ETag";
            String eTag = _completedPart.getETag();
            request.addParameter(prefix, StringUtils.fromString(eTag));
        }
        if (_completedPart.getPartNumber() != null) {
            prefix = _prefix + "PartNumber";
            Integer partNumber = _completedPart.getPartNumber();
            request.addParameter(prefix, StringUtils.fromInteger(partNumber));
        }
    }

    private static CompletedPartStaxMarshaller instance;

    public static CompletedPartStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CompletedPartStaxMarshaller();
        return instance;
    }
}
