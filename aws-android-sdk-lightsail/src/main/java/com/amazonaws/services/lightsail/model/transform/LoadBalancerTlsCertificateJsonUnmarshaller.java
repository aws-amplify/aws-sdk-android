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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO LoadBalancerTlsCertificate
 */
class LoadBalancerTlsCertificateJsonUnmarshaller implements
        Unmarshaller<LoadBalancerTlsCertificate, JsonUnmarshallerContext> {

    public LoadBalancerTlsCertificate unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LoadBalancerTlsCertificate loadBalancerTlsCertificate = new LoadBalancerTlsCertificate();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("name")) {
                loadBalancerTlsCertificate.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("arn")) {
                loadBalancerTlsCertificate.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("supportCode")) {
                loadBalancerTlsCertificate.setSupportCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                loadBalancerTlsCertificate.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("location")) {
                loadBalancerTlsCertificate.setLocation(ResourceLocationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                loadBalancerTlsCertificate.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                loadBalancerTlsCertificate.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("loadBalancerName")) {
                loadBalancerTlsCertificate.setLoadBalancerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("isAttached")) {
                loadBalancerTlsCertificate.setIsAttached(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                loadBalancerTlsCertificate.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("domainName")) {
                loadBalancerTlsCertificate.setDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("domainValidationRecords")) {
                loadBalancerTlsCertificate
                        .setDomainValidationRecords(new ListUnmarshaller<LoadBalancerTlsCertificateDomainValidationRecord>(
                                LoadBalancerTlsCertificateDomainValidationRecordJsonUnmarshaller
                                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("failureReason")) {
                loadBalancerTlsCertificate.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("issuedAt")) {
                loadBalancerTlsCertificate.setIssuedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("issuer")) {
                loadBalancerTlsCertificate.setIssuer(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("keyAlgorithm")) {
                loadBalancerTlsCertificate.setKeyAlgorithm(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("notAfter")) {
                loadBalancerTlsCertificate.setNotAfter(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("notBefore")) {
                loadBalancerTlsCertificate.setNotBefore(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("renewalSummary")) {
                loadBalancerTlsCertificate
                        .setRenewalSummary(LoadBalancerTlsCertificateRenewalSummaryJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("revocationReason")) {
                loadBalancerTlsCertificate.setRevocationReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("revokedAt")) {
                loadBalancerTlsCertificate.setRevokedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("serial")) {
                loadBalancerTlsCertificate.setSerial(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("signatureAlgorithm")) {
                loadBalancerTlsCertificate.setSignatureAlgorithm(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("subject")) {
                loadBalancerTlsCertificate.setSubject(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("subjectAlternativeNames")) {
                loadBalancerTlsCertificate.setSubjectAlternativeNames(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return loadBalancerTlsCertificate;
    }

    private static LoadBalancerTlsCertificateJsonUnmarshaller instance;

    public static LoadBalancerTlsCertificateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LoadBalancerTlsCertificateJsonUnmarshaller();
        return instance;
    }
}
