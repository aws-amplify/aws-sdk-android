/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Delete Domain Request Marshaller
 */
public class DeleteDomainRequestMarshaller implements Marshaller<Request<DeleteDomainRequest>, DeleteDomainRequest> {

    public Request<DeleteDomainRequest> marshall(DeleteDomainRequest deleteDomainRequest) {

        if (deleteDomainRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteDomainRequest> request = new DefaultRequest<DeleteDomainRequest>(deleteDomainRequest, "AmazonSimpleDB");
        request.addParameter("Action", "DeleteDomain");
        request.addParameter("Version", "2009-04-15");

        if (deleteDomainRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(deleteDomainRequest.getDomainName()));
        }

        return request;
    }
}
