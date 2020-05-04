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
 * StAX marshaller for POJO S3SetObjectTaggingOperation
 */
class S3SetObjectTaggingOperationStaxMarshaller {

    public void marshall(S3SetObjectTaggingOperation _s3SetObjectTaggingOperation, Request<?> request, String _prefix) {
        String prefix;
        if (_s3SetObjectTaggingOperation.getTagSet() != null) {
            prefix = _prefix + "TagSet";
            java.util.List<S3Tag> tagSet = _s3SetObjectTaggingOperation.getTagSet();
            int tagSetIndex = 1;
            String tagSetPrefix = prefix;
            for (S3Tag tagSetItem : tagSet) {
                prefix = tagSetPrefix + ".member." + tagSetIndex;
                if (tagSetItem != null) {
            S3TagStaxMarshaller.getInstance().marshall(tagSetItem, request, prefix + ".");
                    }
                tagSetIndex ++;
            }
            prefix = tagSetPrefix;
        }
    }

    private static S3SetObjectTaggingOperationStaxMarshaller instance;
    public static S3SetObjectTaggingOperationStaxMarshaller getInstance() {
        if (instance == null) instance = new S3SetObjectTaggingOperationStaxMarshaller();
        return instance;
    }
}
