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
 * StAX marshaller for POJO JobManifest
 */
class JobManifestStaxMarshaller {

    public void marshall(JobManifest _jobManifest, Request<?> request, String _prefix) {
        String prefix;
        if (_jobManifest.getSpec() != null) {
            prefix = _prefix + "Spec";
            JobManifestSpec spec = _jobManifest.getSpec();
            JobManifestSpecStaxMarshaller.getInstance().marshall(spec, request, prefix + ".");
        }
        if (_jobManifest.getLocation() != null) {
            prefix = _prefix + "Location";
            JobManifestLocation location = _jobManifest.getLocation();
            JobManifestLocationStaxMarshaller.getInstance().marshall(location, request, prefix + ".");
        }
    }

    private static JobManifestStaxMarshaller instance;
    public static JobManifestStaxMarshaller getInstance() {
        if (instance == null) instance = new JobManifestStaxMarshaller();
        return instance;
    }
}
