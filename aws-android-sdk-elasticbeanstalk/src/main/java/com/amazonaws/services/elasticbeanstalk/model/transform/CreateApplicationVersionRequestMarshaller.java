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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateApplicationVersionRequest
 */
public class CreateApplicationVersionRequestMarshaller implements
        Marshaller<Request<CreateApplicationVersionRequest>, CreateApplicationVersionRequest> {

    public Request<CreateApplicationVersionRequest> marshall(
            CreateApplicationVersionRequest createApplicationVersionRequest) {
        if (createApplicationVersionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateApplicationVersionRequest)");
        }

        Request<CreateApplicationVersionRequest> request = new DefaultRequest<CreateApplicationVersionRequest>(
                createApplicationVersionRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "CreateApplicationVersion");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (createApplicationVersionRequest.getApplicationName() != null) {
            prefix = "ApplicationName";
            String applicationName = createApplicationVersionRequest.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (createApplicationVersionRequest.getVersionLabel() != null) {
            prefix = "VersionLabel";
            String versionLabel = createApplicationVersionRequest.getVersionLabel();
            request.addParameter(prefix, StringUtils.fromString(versionLabel));
        }
        if (createApplicationVersionRequest.getDescription() != null) {
            prefix = "Description";
            String description = createApplicationVersionRequest.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (createApplicationVersionRequest.getSourceBuildInformation() != null) {
            prefix = "SourceBuildInformation";
            SourceBuildInformation sourceBuildInformation = createApplicationVersionRequest
                    .getSourceBuildInformation();
            SourceBuildInformationStaxMarshaller.getInstance().marshall(sourceBuildInformation,
                    request, prefix + ".");
        }
        if (createApplicationVersionRequest.getSourceBundle() != null) {
            prefix = "SourceBundle";
            S3Location sourceBundle = createApplicationVersionRequest.getSourceBundle();
            S3LocationStaxMarshaller.getInstance().marshall(sourceBundle, request, prefix + ".");
        }
        if (createApplicationVersionRequest.getBuildConfiguration() != null) {
            prefix = "BuildConfiguration";
            BuildConfiguration buildConfiguration = createApplicationVersionRequest
                    .getBuildConfiguration();
            BuildConfigurationStaxMarshaller.getInstance().marshall(buildConfiguration, request,
                    prefix + ".");
        }
        if (createApplicationVersionRequest.getAutoCreateApplication() != null) {
            prefix = "AutoCreateApplication";
            Boolean autoCreateApplication = createApplicationVersionRequest
                    .getAutoCreateApplication();
            request.addParameter(prefix, StringUtils.fromBoolean(autoCreateApplication));
        }
        if (createApplicationVersionRequest.getProcess() != null) {
            prefix = "Process";
            Boolean process = createApplicationVersionRequest.getProcess();
            request.addParameter(prefix, StringUtils.fromBoolean(process));
        }
        if (createApplicationVersionRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createApplicationVersionRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + ".member." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }

        return request;
    }
}
