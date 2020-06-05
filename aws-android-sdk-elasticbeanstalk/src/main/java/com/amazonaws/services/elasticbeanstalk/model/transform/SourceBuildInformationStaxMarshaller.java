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

package com.amazonaws.services.elasticbeanstalk.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO SourceBuildInformation
 */
class SourceBuildInformationStaxMarshaller {

    public void marshall(SourceBuildInformation _sourceBuildInformation, Request<?> request,
            String _prefix) {
        String prefix;
        if (_sourceBuildInformation.getSourceType() != null) {
            prefix = _prefix + "SourceType";
            String sourceType = _sourceBuildInformation.getSourceType();
            request.addParameter(prefix, StringUtils.fromString(sourceType));
        }
        if (_sourceBuildInformation.getSourceRepository() != null) {
            prefix = _prefix + "SourceRepository";
            String sourceRepository = _sourceBuildInformation.getSourceRepository();
            request.addParameter(prefix, StringUtils.fromString(sourceRepository));
        }
        if (_sourceBuildInformation.getSourceLocation() != null) {
            prefix = _prefix + "SourceLocation";
            String sourceLocation = _sourceBuildInformation.getSourceLocation();
            request.addParameter(prefix, StringUtils.fromString(sourceLocation));
        }
    }

    private static SourceBuildInformationStaxMarshaller instance;

    public static SourceBuildInformationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SourceBuildInformationStaxMarshaller();
        return instance;
    }
}
