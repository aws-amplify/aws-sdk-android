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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GetSavingsPlansPurchaseRecommendationRequest
 */
public class GetSavingsPlansPurchaseRecommendationRequestMarshaller
        implements
        Marshaller<Request<GetSavingsPlansPurchaseRecommendationRequest>, GetSavingsPlansPurchaseRecommendationRequest> {

    public Request<GetSavingsPlansPurchaseRecommendationRequest> marshall(
            GetSavingsPlansPurchaseRecommendationRequest getSavingsPlansPurchaseRecommendationRequest) {
        if (getSavingsPlansPurchaseRecommendationRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GetSavingsPlansPurchaseRecommendationRequest)");
        }

        Request<GetSavingsPlansPurchaseRecommendationRequest> request = new DefaultRequest<GetSavingsPlansPurchaseRecommendationRequest>(
                getSavingsPlansPurchaseRecommendationRequest, "AWSCostExplorerService");
        String target = "AWSInsightsIndexService.GetSavingsPlansPurchaseRecommendation";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (getSavingsPlansPurchaseRecommendationRequest.getSavingsPlansType() != null) {
                String savingsPlansType = getSavingsPlansPurchaseRecommendationRequest
                        .getSavingsPlansType();
                jsonWriter.name("SavingsPlansType");
                jsonWriter.value(savingsPlansType);
            }
            if (getSavingsPlansPurchaseRecommendationRequest.getTermInYears() != null) {
                String termInYears = getSavingsPlansPurchaseRecommendationRequest.getTermInYears();
                jsonWriter.name("TermInYears");
                jsonWriter.value(termInYears);
            }
            if (getSavingsPlansPurchaseRecommendationRequest.getPaymentOption() != null) {
                String paymentOption = getSavingsPlansPurchaseRecommendationRequest
                        .getPaymentOption();
                jsonWriter.name("PaymentOption");
                jsonWriter.value(paymentOption);
            }
            if (getSavingsPlansPurchaseRecommendationRequest.getAccountScope() != null) {
                String accountScope = getSavingsPlansPurchaseRecommendationRequest
                        .getAccountScope();
                jsonWriter.name("AccountScope");
                jsonWriter.value(accountScope);
            }
            if (getSavingsPlansPurchaseRecommendationRequest.getNextPageToken() != null) {
                String nextPageToken = getSavingsPlansPurchaseRecommendationRequest
                        .getNextPageToken();
                jsonWriter.name("NextPageToken");
                jsonWriter.value(nextPageToken);
            }
            if (getSavingsPlansPurchaseRecommendationRequest.getPageSize() != null) {
                Integer pageSize = getSavingsPlansPurchaseRecommendationRequest.getPageSize();
                jsonWriter.name("PageSize");
                jsonWriter.value(pageSize);
            }
            if (getSavingsPlansPurchaseRecommendationRequest.getLookbackPeriodInDays() != null) {
                String lookbackPeriodInDays = getSavingsPlansPurchaseRecommendationRequest
                        .getLookbackPeriodInDays();
                jsonWriter.name("LookbackPeriodInDays");
                jsonWriter.value(lookbackPeriodInDays);
            }
            if (getSavingsPlansPurchaseRecommendationRequest.getFilter() != null) {
                Expression filter = getSavingsPlansPurchaseRecommendationRequest.getFilter();
                jsonWriter.name("Filter");
                ExpressionJsonMarshaller.getInstance().marshall(filter, jsonWriter);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
