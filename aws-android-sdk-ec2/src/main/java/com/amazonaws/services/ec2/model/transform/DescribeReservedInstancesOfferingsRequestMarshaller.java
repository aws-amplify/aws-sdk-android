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

package com.amazonaws.services.ec2.model.transform;

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
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for DescribeReservedInstancesOfferingsRequest
 */
public class DescribeReservedInstancesOfferingsRequestMarshaller
        implements
        Marshaller<Request<DescribeReservedInstancesOfferingsRequest>, DescribeReservedInstancesOfferingsRequest> {

    public Request<DescribeReservedInstancesOfferingsRequest> marshall(
            DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest) {
        if (describeReservedInstancesOfferingsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeReservedInstancesOfferingsRequest)");
        }

        Request<DescribeReservedInstancesOfferingsRequest> request = new DefaultRequest<DescribeReservedInstancesOfferingsRequest>(
                describeReservedInstancesOfferingsRequest, "AmazonElasticComputeCloud");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (describeReservedInstancesOfferingsRequest.getAvailabilityZone() != null) {
                String availabilityZone = describeReservedInstancesOfferingsRequest
                        .getAvailabilityZone();
                jsonWriter.name("AvailabilityZone");
                jsonWriter.value(availabilityZone);
            }
            if (describeReservedInstancesOfferingsRequest.getFilters() != null) {
                java.util.List<Filter> filters = describeReservedInstancesOfferingsRequest
                        .getFilters();
                jsonWriter.name("Filters");
                jsonWriter.beginArray();
                for (Filter filtersItem : filters) {
                    if (filtersItem != null) {
                        FilterJsonMarshaller.getInstance().marshall(filtersItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (describeReservedInstancesOfferingsRequest.getIncludeMarketplace() != null) {
                Boolean includeMarketplace = describeReservedInstancesOfferingsRequest
                        .getIncludeMarketplace();
                jsonWriter.name("IncludeMarketplace");
                jsonWriter.value(includeMarketplace);
            }
            if (describeReservedInstancesOfferingsRequest.getInstanceType() != null) {
                String instanceType = describeReservedInstancesOfferingsRequest.getInstanceType();
                jsonWriter.name("InstanceType");
                jsonWriter.value(instanceType);
            }
            if (describeReservedInstancesOfferingsRequest.getMaxDuration() != null) {
                Long maxDuration = describeReservedInstancesOfferingsRequest.getMaxDuration();
                jsonWriter.name("MaxDuration");
                jsonWriter.value(maxDuration);
            }
            if (describeReservedInstancesOfferingsRequest.getMaxInstanceCount() != null) {
                Integer maxInstanceCount = describeReservedInstancesOfferingsRequest
                        .getMaxInstanceCount();
                jsonWriter.name("MaxInstanceCount");
                jsonWriter.value(maxInstanceCount);
            }
            if (describeReservedInstancesOfferingsRequest.getMinDuration() != null) {
                Long minDuration = describeReservedInstancesOfferingsRequest.getMinDuration();
                jsonWriter.name("MinDuration");
                jsonWriter.value(minDuration);
            }
            if (describeReservedInstancesOfferingsRequest.getOfferingClass() != null) {
                String offeringClass = describeReservedInstancesOfferingsRequest.getOfferingClass();
                jsonWriter.name("OfferingClass");
                jsonWriter.value(offeringClass);
            }
            if (describeReservedInstancesOfferingsRequest.getProductDescription() != null) {
                String productDescription = describeReservedInstancesOfferingsRequest
                        .getProductDescription();
                jsonWriter.name("ProductDescription");
                jsonWriter.value(productDescription);
            }
            if (describeReservedInstancesOfferingsRequest.getReservedInstancesOfferingIds() != null) {
                java.util.List<String> reservedInstancesOfferingIds = describeReservedInstancesOfferingsRequest
                        .getReservedInstancesOfferingIds();
                jsonWriter.name("ReservedInstancesOfferingIds");
                jsonWriter.beginArray();
                for (String reservedInstancesOfferingIdsItem : reservedInstancesOfferingIds) {
                    if (reservedInstancesOfferingIdsItem != null) {
                        jsonWriter.value(reservedInstancesOfferingIdsItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (describeReservedInstancesOfferingsRequest.getDryRun() != null) {
                Boolean dryRun = describeReservedInstancesOfferingsRequest.getDryRun();
                jsonWriter.name("DryRun");
                jsonWriter.value(dryRun);
            }
            if (describeReservedInstancesOfferingsRequest.getInstanceTenancy() != null) {
                String instanceTenancy = describeReservedInstancesOfferingsRequest
                        .getInstanceTenancy();
                jsonWriter.name("InstanceTenancy");
                jsonWriter.value(instanceTenancy);
            }
            if (describeReservedInstancesOfferingsRequest.getMaxResults() != null) {
                Integer maxResults = describeReservedInstancesOfferingsRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (describeReservedInstancesOfferingsRequest.getNextToken() != null) {
                String nextToken = describeReservedInstancesOfferingsRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (describeReservedInstancesOfferingsRequest.getOfferingType() != null) {
                String offeringType = describeReservedInstancesOfferingsRequest.getOfferingType();
                jsonWriter.name("OfferingType");
                jsonWriter.value(offeringType);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
