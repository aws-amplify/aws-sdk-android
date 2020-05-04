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
 * StAX marshaller for POJO JobManifestLocation
 */
class JobManifestLocationStaxMarshaller {

    public void marshall(JobManifestLocation _jobManifestLocation, Request<?> request, String _prefix) {
        String prefix;
        if (_jobManifestLocation.getObjectArn() != null) {
            prefix = _prefix + "ObjectArn";
            String objectArn = _jobManifestLocation.getObjectArn();
            request.addParameter(prefix, StringUtils.fromString(objectArn));
        }
        if (_jobManifestLocation.getObjectVersionId() != null) {
            prefix = _prefix + "ObjectVersionId";
            String objectVersionId = _jobManifestLocation.getObjectVersionId();
            request.addParameter(prefix, StringUtils.fromString(objectVersionId));
        }
        if (_jobManifestLocation.getETag() != null) {
            prefix = _prefix + "ETag";
            String eTag = _jobManifestLocation.getETag();
            request.addParameter(prefix, StringUtils.fromString(eTag));
        }
    }

    private static JobManifestLocationStaxMarshaller instance;
    public static JobManifestLocationStaxMarshaller getInstance() {
        if (instance == null) instance = new JobManifestLocationStaxMarshaller();
        return instance;
    }
}
