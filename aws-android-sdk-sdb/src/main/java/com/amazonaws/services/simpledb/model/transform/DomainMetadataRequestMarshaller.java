/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpledb.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.simpledb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Domain Metadata Request Marshaller
 */
public class DomainMetadataRequestMarshaller implements Marshaller<Request<DomainMetadataRequest>, DomainMetadataRequest> {

    public Request<DomainMetadataRequest> marshall(DomainMetadataRequest domainMetadataRequest) {

        if (domainMetadataRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DomainMetadataRequest> request = new DefaultRequest<DomainMetadataRequest>(domainMetadataRequest, "AmazonSimpleDB");
        request.addParameter("Action", "DomainMetadata");
        request.addParameter("Version", "2009-04-15");

        if (domainMetadataRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(domainMetadataRequest.getDomainName()));
        }

        return request;
    }
}
