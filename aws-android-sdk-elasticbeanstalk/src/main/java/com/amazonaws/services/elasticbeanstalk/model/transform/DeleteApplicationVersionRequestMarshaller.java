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
 * StAX request marshaller for DeleteApplicationVersionRequest
 */
public class DeleteApplicationVersionRequestMarshaller implements
        Marshaller<Request<DeleteApplicationVersionRequest>, DeleteApplicationVersionRequest> {

    public Request<DeleteApplicationVersionRequest> marshall(
            DeleteApplicationVersionRequest deleteApplicationVersionRequest) {
        if (deleteApplicationVersionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeleteApplicationVersionRequest)");
        }

        Request<DeleteApplicationVersionRequest> request = new DefaultRequest<DeleteApplicationVersionRequest>(
                deleteApplicationVersionRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DeleteApplicationVersion");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (deleteApplicationVersionRequest.getApplicationName() != null) {
            prefix = "ApplicationName";
            String applicationName = deleteApplicationVersionRequest.getApplicationName();
            request.addParameter(prefix, StringUtils.fromString(applicationName));
        }
        if (deleteApplicationVersionRequest.getVersionLabel() != null) {
            prefix = "VersionLabel";
            String versionLabel = deleteApplicationVersionRequest.getVersionLabel();
            request.addParameter(prefix, StringUtils.fromString(versionLabel));
        }
        if (deleteApplicationVersionRequest.getDeleteSourceBundle() != null) {
            prefix = "DeleteSourceBundle";
            Boolean deleteSourceBundle = deleteApplicationVersionRequest.getDeleteSourceBundle();
            request.addParameter(prefix, StringUtils.fromBoolean(deleteSourceBundle));
        }

        return request;
    }
}
