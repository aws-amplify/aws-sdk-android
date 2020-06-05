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
 * StAX request marshaller for RetrieveEnvironmentInfoRequest
 */
public class RetrieveEnvironmentInfoRequestMarshaller implements
        Marshaller<Request<RetrieveEnvironmentInfoRequest>, RetrieveEnvironmentInfoRequest> {

    public Request<RetrieveEnvironmentInfoRequest> marshall(
            RetrieveEnvironmentInfoRequest retrieveEnvironmentInfoRequest) {
        if (retrieveEnvironmentInfoRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RetrieveEnvironmentInfoRequest)");
        }

        Request<RetrieveEnvironmentInfoRequest> request = new DefaultRequest<RetrieveEnvironmentInfoRequest>(
                retrieveEnvironmentInfoRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "RetrieveEnvironmentInfo");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (retrieveEnvironmentInfoRequest.getEnvironmentId() != null) {
            prefix = "EnvironmentId";
            String environmentId = retrieveEnvironmentInfoRequest.getEnvironmentId();
            request.addParameter(prefix, StringUtils.fromString(environmentId));
        }
        if (retrieveEnvironmentInfoRequest.getEnvironmentName() != null) {
            prefix = "EnvironmentName";
            String environmentName = retrieveEnvironmentInfoRequest.getEnvironmentName();
            request.addParameter(prefix, StringUtils.fromString(environmentName));
        }
        if (retrieveEnvironmentInfoRequest.getInfoType() != null) {
            prefix = "InfoType";
            String infoType = retrieveEnvironmentInfoRequest.getInfoType();
            request.addParameter(prefix, StringUtils.fromString(infoType));
        }

        return request;
    }
}
