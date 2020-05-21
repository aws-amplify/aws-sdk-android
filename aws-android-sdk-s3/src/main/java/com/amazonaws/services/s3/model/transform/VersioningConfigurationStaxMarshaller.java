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
 * StAX marshaller for POJO VersioningConfiguration
 */
class VersioningConfigurationStaxMarshaller {

    public void marshall(VersioningConfiguration _versioningConfiguration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_versioningConfiguration.getMFADelete() != null) {
            prefix = _prefix + "MfaDelete";
            String mFADelete = _versioningConfiguration.getMFADelete();
            request.addParameter(prefix, StringUtils.fromString(mFADelete));
        }
        if (_versioningConfiguration.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _versioningConfiguration.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
    }

    private static VersioningConfigurationStaxMarshaller instance;

    public static VersioningConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new VersioningConfigurationStaxMarshaller();
        return instance;
    }
}
