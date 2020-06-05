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
 * StAX marshaller for POJO ApplicationVersionDescription
 */
class ApplicationVersionDescriptionStaxMarshaller {

    public void marshall(ApplicationVersionDescription _applicationVersionDescription,
            Request<?> request, String _prefix) {
        String prefix;
        if (_applicationVersionDescription.getApplicationVersionArn() != null) {
            prefix = _prefix + "ApplicationVersionArn";
            String applicationVersionArn = _applicationVersionDescription
                    .getApplicationVersionArn();
            request.addParameter(prefix, StringUtils.fromString(applicationVersionArn));
        }
        if (_applicationVersionDescription.getApplicationName() != null) {
            prefix = _prefix + "ApplicationName";
            String applicationName = _applicationVersionDescription.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (_applicationVersionDescription.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _applicationVersionDescription.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_applicationVersionDescription.getVersionLabel() != null) {
            prefix = _prefix + "VersionLabel";
            String versionLabel = _applicationVersionDescription.getVersionLabel();
            request.addParameter(prefix, StringUtils.fromString(versionLabel));
        }
        if (_applicationVersionDescription.getSourceBuildInformation() != null) {
            prefix = _prefix + "SourceBuildInformation";
            SourceBuildInformation sourceBuildInformation = _applicationVersionDescription
                    .getSourceBuildInformation();
            SourceBuildInformationStaxMarshaller.getInstance().marshall(sourceBuildInformation,
                    request, prefix + ".");
        }
        if (_applicationVersionDescription.getBuildArn() != null) {
            prefix = _prefix + "BuildArn";
            String buildArn = _applicationVersionDescription.getBuildArn();
            request.addParameter(prefix, StringUtils.fromString(buildArn));
        }
        if (_applicationVersionDescription.getSourceBundle() != null) {
            prefix = _prefix + "SourceBundle";
            S3Location sourceBundle = _applicationVersionDescription.getSourceBundle();
            S3LocationStaxMarshaller.getInstance().marshall(sourceBundle, request, prefix + ".");
        }
        if (_applicationVersionDescription.getDateCreated() != null) {
            prefix = _prefix + "DateCreated";
            java.util.Date dateCreated = _applicationVersionDescription.getDateCreated();
            request.addParameter(prefix, StringUtils.fromDate(dateCreated));
        }
        if (_applicationVersionDescription.getDateUpdated() != null) {
            prefix = _prefix + "DateUpdated";
            java.util.Date dateUpdated = _applicationVersionDescription.getDateUpdated();
            request.addParameter(prefix, StringUtils.fromDate(dateUpdated));
        }
        if (_applicationVersionDescription.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _applicationVersionDescription.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
    }

    private static ApplicationVersionDescriptionStaxMarshaller instance;

    public static ApplicationVersionDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationVersionDescriptionStaxMarshaller();
        return instance;
    }
}
