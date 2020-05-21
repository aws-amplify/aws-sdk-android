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

package com.amazonaws.services.s3.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for SelectObjectContentRequest
 */
public class SelectObjectContentRequestMarshaller implements
        Marshaller<Request<SelectObjectContentRequest>, SelectObjectContentRequest> {

    public Request<SelectObjectContentRequest> marshall(
            SelectObjectContentRequest selectObjectContentRequest) {
        if (selectObjectContentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(SelectObjectContentRequest)");
        }

        Request<SelectObjectContentRequest> request = new DefaultRequest<SelectObjectContentRequest>(
                selectObjectContentRequest, "AmazonSimpleStorageService");
        request.addParameter("Action", "SelectObjectContent");
        request.addParameter("Version", "2006-03-01");

        String prefix;
        if (selectObjectContentRequest.getBucket() != null) {
            prefix = "Bucket";
            String bucket = selectObjectContentRequest.getBucket();
            request.addParameter(prefix, StringUtils.fromString(bucket));
        }
        if (selectObjectContentRequest.getKey() != null) {
            prefix = "Key";
            String key = selectObjectContentRequest.getKey();
            request.addParameter(prefix, StringUtils.fromString(key));
        }
        if (selectObjectContentRequest.getSSECustomerAlgorithm() != null) {
            prefix = "x-amz-server-side-encryption-customer-algorithm";
            String sSECustomerAlgorithm = selectObjectContentRequest.getSSECustomerAlgorithm();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerAlgorithm));
        }
        if (selectObjectContentRequest.getSSECustomerKey() != null) {
            prefix = "x-amz-server-side-encryption-customer-key";
            String sSECustomerKey = selectObjectContentRequest.getSSECustomerKey();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerKey));
        }
        if (selectObjectContentRequest.getSSECustomerKeyMD5() != null) {
            prefix = "x-amz-server-side-encryption-customer-key-MD5";
            String sSECustomerKeyMD5 = selectObjectContentRequest.getSSECustomerKeyMD5();
            request.addParameter(prefix, StringUtils.fromString(sSECustomerKeyMD5));
        }
        if (selectObjectContentRequest.getExpression() != null) {
            prefix = "Expression";
            String expression = selectObjectContentRequest.getExpression();
            request.addParameter(prefix, StringUtils.fromString(expression));
        }
        if (selectObjectContentRequest.getExpressionType() != null) {
            prefix = "ExpressionType";
            String expressionType = selectObjectContentRequest.getExpressionType();
            request.addParameter(prefix, StringUtils.fromString(expressionType));
        }
        if (selectObjectContentRequest.getRequestProgress() != null) {
            prefix = "RequestProgress";
            RequestProgress requestProgress = selectObjectContentRequest.getRequestProgress();
            RequestProgressStaxMarshaller.getInstance().marshall(requestProgress, request,
                    prefix + ".");
        }
        if (selectObjectContentRequest.getInputSerialization() != null) {
            prefix = "InputSerialization";
            InputSerialization inputSerialization = selectObjectContentRequest
                    .getInputSerialization();
            InputSerializationStaxMarshaller.getInstance().marshall(inputSerialization, request,
                    prefix + ".");
        }
        if (selectObjectContentRequest.getOutputSerialization() != null) {
            prefix = "OutputSerialization";
            OutputSerialization outputSerialization = selectObjectContentRequest
                    .getOutputSerialization();
            OutputSerializationStaxMarshaller.getInstance().marshall(outputSerialization, request,
                    prefix + ".");
        }
        if (selectObjectContentRequest.getScanRange() != null) {
            prefix = "ScanRange";
            ScanRange scanRange = selectObjectContentRequest.getScanRange();
            ScanRangeStaxMarshaller.getInstance().marshall(scanRange, request, prefix + ".");
        }

        return request;
    }
}
