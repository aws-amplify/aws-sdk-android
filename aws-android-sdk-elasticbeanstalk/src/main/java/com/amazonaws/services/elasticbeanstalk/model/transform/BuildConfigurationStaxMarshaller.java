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
 * StAX marshaller for POJO BuildConfiguration
 */
class BuildConfigurationStaxMarshaller {

    public void marshall(BuildConfiguration _buildConfiguration, Request<?> request, String _prefix) {
        String prefix;
        if (_buildConfiguration.getArtifactName() != null) {
            prefix = _prefix + "ArtifactName";
            String artifactName = _buildConfiguration.getArtifactName();
            request.addParameter(prefix, StringUtils.fromString(artifactName));
        }
        if (_buildConfiguration.getCodeBuildServiceRole() != null) {
            prefix = _prefix + "CodeBuildServiceRole";
            String codeBuildServiceRole = _buildConfiguration.getCodeBuildServiceRole();
            request.addParameter(prefix, StringUtils.fromString(codeBuildServiceRole));
        }
        if (_buildConfiguration.getComputeType() != null) {
            prefix = _prefix + "ComputeType";
            String computeType = _buildConfiguration.getComputeType();
            request.addParameter(prefix, StringUtils.fromString(computeType));
        }
        if (_buildConfiguration.getImage() != null) {
            prefix = _prefix + "Image";
            String image = _buildConfiguration.getImage();
            request.addParameter(prefix, StringUtils.fromString(image));
        }
        if (_buildConfiguration.getTimeoutInMinutes() != null) {
            prefix = _prefix + "TimeoutInMinutes";
            Integer timeoutInMinutes = _buildConfiguration.getTimeoutInMinutes();
            request.addParameter(prefix, StringUtils.fromInteger(timeoutInMinutes));
        }
    }

    private static BuildConfigurationStaxMarshaller instance;

    public static BuildConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new BuildConfigurationStaxMarshaller();
        return instance;
    }
}
