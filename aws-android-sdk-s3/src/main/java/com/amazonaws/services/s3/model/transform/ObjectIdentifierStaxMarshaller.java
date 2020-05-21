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
 * StAX marshaller for POJO ObjectIdentifier
 */
class ObjectIdentifierStaxMarshaller {

    public void marshall(ObjectIdentifier _objectIdentifier, Request<?> request, String _prefix) {
        String prefix;
        if (_objectIdentifier.getKey() != null) {
            prefix = _prefix + "Key";
            String key = _objectIdentifier.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (_objectIdentifier.getVersionId() != null) {
            prefix = _prefix + "VersionId";
            String versionId = _objectIdentifier.getVersionId();
            request.addParameter(prefix, StringUtils.fromString(versionId));
        }
    }

    private static ObjectIdentifierStaxMarshaller instance;

    public static ObjectIdentifierStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ObjectIdentifierStaxMarshaller();
        return instance;
    }
}
