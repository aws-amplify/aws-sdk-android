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
package com.amazonaws.services.s3-control.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.s3-control.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO S3SetObjectLegalHoldOperation
 */
class S3SetObjectLegalHoldOperationStaxMarshaller {

    public void marshall(S3SetObjectLegalHoldOperation _s3SetObjectLegalHoldOperation, Request<?> request, String _prefix) {
        String prefix;
        if (_s3SetObjectLegalHoldOperation.getLegalHold() != null) {
            prefix = _prefix + "LegalHold";
            S3ObjectLockLegalHold legalHold = _s3SetObjectLegalHoldOperation.getLegalHold();
            S3ObjectLockLegalHoldStaxMarshaller.getInstance().marshall(legalHold, request, prefix + ".");
        }
    }

    private static S3SetObjectLegalHoldOperationStaxMarshaller instance;
    public static S3SetObjectLegalHoldOperationStaxMarshaller getInstance() {
        if (instance == null) instance = new S3SetObjectLegalHoldOperationStaxMarshaller();
        return instance;
    }
}
