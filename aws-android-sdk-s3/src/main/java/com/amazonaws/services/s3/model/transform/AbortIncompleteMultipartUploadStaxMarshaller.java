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
 * StAX marshaller for POJO AbortIncompleteMultipartUpload
 */
class AbortIncompleteMultipartUploadStaxMarshaller {

    public void marshall(AbortIncompleteMultipartUpload _abortIncompleteMultipartUpload,
            Request<?> request, String _prefix) {
        String prefix;
        if (_abortIncompleteMultipartUpload.getDaysAfterInitiation() != null) {
            prefix = _prefix + "DaysAfterInitiation";
            Integer daysAfterInitiation = _abortIncompleteMultipartUpload.getDaysAfterInitiation();
            request.addParameter(prefix, StringUtils.fromInteger(daysAfterInitiation));
        }
    }

    private static AbortIncompleteMultipartUploadStaxMarshaller instance;

    public static AbortIncompleteMultipartUploadStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AbortIncompleteMultipartUploadStaxMarshaller();
        return instance;
    }
}
