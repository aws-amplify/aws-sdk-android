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

package com.amazonaws.services.cloudfront.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DeletePublicKey2019_03_26Request
 */
public class DeletePublicKey2019_03_26RequestMarshaller implements
        Marshaller<Request<DeletePublicKey2019_03_26Request>, DeletePublicKey2019_03_26Request> {

    public Request<DeletePublicKey2019_03_26Request> marshall(
            DeletePublicKey2019_03_26Request deletePublicKey2019_03_26Request) {
        if (deletePublicKey2019_03_26Request == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DeletePublicKey2019_03_26Request)");
        }

        Request<DeletePublicKey2019_03_26Request> request = new DefaultRequest<DeletePublicKey2019_03_26Request>(
                deletePublicKey2019_03_26Request, "AmazonCloudFront");
        request.addParameter("Action", "DeletePublicKey2019_03_26");
        request.addParameter("Version", "2019-03-26");

        String prefix;
        if (deletePublicKey2019_03_26Request.getId() != null) {
            prefix = "Id";
            String id = deletePublicKey2019_03_26Request.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (deletePublicKey2019_03_26Request.getIfMatch() != null) {
            prefix = "If-Match";
            String ifMatch = deletePublicKey2019_03_26Request.getIfMatch();
            request.addParameter(prefix, StringUtils.fromString(ifMatch));
        }

        return request;
    }
}
