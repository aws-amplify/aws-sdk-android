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
 * StAX marshaller for POJO CompletedMultipartUpload
 */
class CompletedMultipartUploadStaxMarshaller {

    public void marshall(CompletedMultipartUpload _completedMultipartUpload, Request<?> request,
            String _prefix) {
        String prefix;
        if (_completedMultipartUpload.getParts() != null) {
            prefix = _prefix + "Parts";
            java.util.List<CompletedPart> parts = _completedMultipartUpload.getParts();
            int partsIndex = 1;
            String partsPrefix = prefix;
            for (CompletedPart partsItem : parts) {
                prefix = partsPrefix + ".member." + partsIndex;
                if (partsItem != null) {
                    CompletedPartStaxMarshaller.getInstance().marshall(partsItem, request,
                            prefix + ".");
                }
                partsIndex++;
            }
            prefix = partsPrefix;
        }
    }

    private static CompletedMultipartUploadStaxMarshaller instance;

    public static CompletedMultipartUploadStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CompletedMultipartUploadStaxMarshaller();
        return instance;
    }
}
