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
 * StAX request marshaller for CreateStorageLocationRequest
 */
public class CreateStorageLocationRequestMarshaller implements
        Marshaller<Request<CreateStorageLocationRequest>, CreateStorageLocationRequest> {

    public Request<CreateStorageLocationRequest> marshall(
            CreateStorageLocationRequest createStorageLocationRequest) {
        if (createStorageLocationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateStorageLocationRequest)");
        }

        Request<CreateStorageLocationRequest> request = new DefaultRequest<CreateStorageLocationRequest>(
                createStorageLocationRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "CreateStorageLocation");
        request.addParameter("Version", "2010-12-01");

        String prefix;

        return request;
    }
}
