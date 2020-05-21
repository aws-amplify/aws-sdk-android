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
 * StAX marshaller for POJO NoncurrentVersionTransition
 */
class NoncurrentVersionTransitionStaxMarshaller {

    public void marshall(NoncurrentVersionTransition _noncurrentVersionTransition,
            Request<?> request, String _prefix) {
        String prefix;
        if (_noncurrentVersionTransition.getNoncurrentDays() != null) {
            prefix = _prefix + "NoncurrentDays";
            Integer noncurrentDays = _noncurrentVersionTransition.getNoncurrentDays();
            request.addParameter(prefix, StringUtils.fromInteger(noncurrentDays));
        }
        if (_noncurrentVersionTransition.getStorageClass() != null) {
            prefix = _prefix + "StorageClass";
            String storageClass = _noncurrentVersionTransition.getStorageClass();
            request.addParameter(prefix, StringUtils.fromString(storageClass));
        }
    }

    private static NoncurrentVersionTransitionStaxMarshaller instance;

    public static NoncurrentVersionTransitionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new NoncurrentVersionTransitionStaxMarshaller();
        return instance;
    }
}
