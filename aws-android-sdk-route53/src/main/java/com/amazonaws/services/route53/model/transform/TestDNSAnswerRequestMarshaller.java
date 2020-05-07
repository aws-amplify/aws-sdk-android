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

package com.amazonaws.services.route53.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for TestDNSAnswerRequest
 */
public class TestDNSAnswerRequestMarshaller implements
        Marshaller<Request<TestDNSAnswerRequest>, TestDNSAnswerRequest> {

    public Request<TestDNSAnswerRequest> marshall(TestDNSAnswerRequest testDNSAnswerRequest) {
        if (testDNSAnswerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(TestDNSAnswerRequest)");
        }

        Request<TestDNSAnswerRequest> request = new DefaultRequest<TestDNSAnswerRequest>(
                testDNSAnswerRequest, "AmazonRoute53");
        request.addParameter("Action", "TestDNSAnswer");
        request.addParameter("Version", "2013-04-01");

        String prefix;
        if (testDNSAnswerRequest.getHostedZoneId() != null) {
            prefix = "hostedzoneid";
            String hostedZoneId = testDNSAnswerRequest.getHostedZoneId();
            request.addParameter(prefix, StringUtils.fromString(hostedZoneId));
        }
        if (testDNSAnswerRequest.getRecordName() != null) {
            prefix = "recordname";
            String recordName = testDNSAnswerRequest.getRecordName();
            request.addParameter(prefix, StringUtils.fromString(recordName));
        }
        if (testDNSAnswerRequest.getRecordType() != null) {
            prefix = "recordtype";
            String recordType = testDNSAnswerRequest.getRecordType();
            request.addParameter(prefix, StringUtils.fromString(recordType));
        }
        if (testDNSAnswerRequest.getResolverIP() != null) {
            prefix = "resolverip";
            String resolverIP = testDNSAnswerRequest.getResolverIP();
            request.addParameter(prefix, StringUtils.fromString(resolverIP));
        }
        if (testDNSAnswerRequest.getEDNS0ClientSubnetIP() != null) {
            prefix = "edns0clientsubnetip";
            String eDNS0ClientSubnetIP = testDNSAnswerRequest.getEDNS0ClientSubnetIP();
            request.addParameter(prefix, StringUtils.fromString(eDNS0ClientSubnetIP));
        }
        if (testDNSAnswerRequest.getEDNS0ClientSubnetMask() != null) {
            prefix = "edns0clientsubnetmask";
            String eDNS0ClientSubnetMask = testDNSAnswerRequest.getEDNS0ClientSubnetMask();
            request.addParameter(prefix, StringUtils.fromString(eDNS0ClientSubnetMask));
        }

        return request;
    }
}
