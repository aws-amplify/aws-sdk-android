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
 * StAX marshaller for POJO JobManifestSpec
 */
class JobManifestSpecStaxMarshaller {

    public void marshall(JobManifestSpec _jobManifestSpec, Request<?> request, String _prefix) {
        String prefix;
        if (_jobManifestSpec.getFormat() != null) {
            prefix = _prefix + "Format";
            String format = _jobManifestSpec.getFormat();
            request.addParameter(prefix, StringUtils.fromString(format));
        }
        if (_jobManifestSpec.getFields() != null) {
            prefix = _prefix + "Fields";
            java.util.List<String> fields = _jobManifestSpec.getFields();
            int fieldsIndex = 1;
            String fieldsPrefix = prefix;
            for (String fieldsItem : fields) {
                prefix = fieldsPrefix + ".member." + fieldsIndex;
                if (fieldsItem != null) {
            request.addParameter(prefix, StringUtils.fromString(fieldsItem));
                    }
                fieldsIndex ++;
            }
            prefix = fieldsPrefix;
        }
    }

    private static JobManifestSpecStaxMarshaller instance;
    public static JobManifestSpecStaxMarshaller getInstance() {
        if (instance == null) instance = new JobManifestSpecStaxMarshaller();
        return instance;
    }
}
