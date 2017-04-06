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
 * Put Attributes Request Marshaller
 */
public class PutAttributesRequestMarshaller implements Marshaller<Request<PutAttributesRequest>, PutAttributesRequest> {

    public Request<PutAttributesRequest> marshall(PutAttributesRequest putAttributesRequest) {

        if (putAttributesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutAttributesRequest> request = new DefaultRequest<PutAttributesRequest>(putAttributesRequest, "AmazonSimpleDB");
        request.addParameter("Action", "PutAttributes");
        request.addParameter("Version", "2009-04-15");

        if (putAttributesRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(putAttributesRequest.getDomainName()));
        }
        if (putAttributesRequest.getItemName() != null) {
            request.addParameter("ItemName", StringUtils.fromString(putAttributesRequest.getItemName()));
        }

        java.util.List<ReplaceableAttribute> attributesList = putAttributesRequest.getAttributes();
        int attributesListIndex = 1;

        for (ReplaceableAttribute attributesListValue : attributesList) {
            ReplaceableAttribute replaceableAttributeMember = attributesListValue;
            if (replaceableAttributeMember != null) {
                if (replaceableAttributeMember.getName() != null) {
                    request.addParameter("Attribute." + attributesListIndex + ".Name", StringUtils.fromString(replaceableAttributeMember.getName()));
                }
                if (replaceableAttributeMember.getValue() != null) {
                    request.addParameter("Attribute." + attributesListIndex + ".Value", StringUtils.fromString(replaceableAttributeMember.getValue()));
                }
                if (replaceableAttributeMember.isReplace() != null) {
                    request.addParameter("Attribute." + attributesListIndex + ".Replace", StringUtils.fromBoolean(replaceableAttributeMember.isReplace()));
                }
            }

            attributesListIndex++;
        }
        UpdateCondition updateConditionExpected = putAttributesRequest.getExpected();
        if (updateConditionExpected != null) {
            if (updateConditionExpected.getName() != null) {
                request.addParameter("Expected.Name", StringUtils.fromString(updateConditionExpected.getName()));
            }
            if (updateConditionExpected.getValue() != null) {
                request.addParameter("Expected.Value", StringUtils.fromString(updateConditionExpected.getValue()));
            }
            if (updateConditionExpected.isExists() != null) {
                request.addParameter("Expected.Exists", StringUtils.fromBoolean(updateConditionExpected.isExists()));
            }
        }

        return request;
    }
}
