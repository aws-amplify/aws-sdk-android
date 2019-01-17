/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateLoadBalancerRequest
 */
public class CreateLoadBalancerRequestMarshaller implements
        Marshaller<Request<CreateLoadBalancerRequest>, CreateLoadBalancerRequest> {

    public Request<CreateLoadBalancerRequest> marshall(
            CreateLoadBalancerRequest createLoadBalancerRequest) {
        if (createLoadBalancerRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateLoadBalancerRequest)");
        }

        Request<CreateLoadBalancerRequest> request = new DefaultRequest<CreateLoadBalancerRequest>(
                createLoadBalancerRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateLoadBalancer");
        request.addParameter("Version", "2012-06-01");

        String prefix;
        if (createLoadBalancerRequest.getLoadBalancerName() != null) {
            prefix = "LoadBalancerName";
            String loadBalancerName = createLoadBalancerRequest.getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (createLoadBalancerRequest.getListeners() != null) {
            prefix = "Listeners";
            java.util.List<Listener> listeners = createLoadBalancerRequest.getListeners();
            int listenersIndex = 1;
            String listenersPrefix = prefix;
            for (Listener listenersItem : listeners) {
                prefix = listenersPrefix + ".member." + listenersIndex;
                if (listenersItem != null) {
                    ListenerStaxMarshaller.getInstance().marshall(listenersItem, request,
                            prefix + ".");
                }
                listenersIndex++;
            }
            prefix = listenersPrefix;
        }
        if (createLoadBalancerRequest.getAvailabilityZones() != null) {
            prefix = "AvailabilityZones";
            java.util.List<String> availabilityZones = createLoadBalancerRequest
                    .getAvailabilityZones();
            int availabilityZonesIndex = 1;
            String availabilityZonesPrefix = prefix;
            for (String availabilityZonesItem : availabilityZones) {
                prefix = availabilityZonesPrefix + ".member." + availabilityZonesIndex;
                if (availabilityZonesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(availabilityZonesItem));
                }
                availabilityZonesIndex++;
            }
            prefix = availabilityZonesPrefix;
        }
        if (createLoadBalancerRequest.getSubnets() != null) {
            prefix = "Subnets";
            java.util.List<String> subnets = createLoadBalancerRequest.getSubnets();
            int subnetsIndex = 1;
            String subnetsPrefix = prefix;
            for (String subnetsItem : subnets) {
                prefix = subnetsPrefix + ".member." + subnetsIndex;
                if (subnetsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(subnetsItem));
                }
                subnetsIndex++;
            }
            prefix = subnetsPrefix;
        }
        if (createLoadBalancerRequest.getSecurityGroups() != null) {
            prefix = "SecurityGroups";
            java.util.List<String> securityGroups = createLoadBalancerRequest.getSecurityGroups();
            int securityGroupsIndex = 1;
            String securityGroupsPrefix = prefix;
            for (String securityGroupsItem : securityGroups) {
                prefix = securityGroupsPrefix + ".member." + securityGroupsIndex;
                if (securityGroupsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(securityGroupsItem));
                }
                securityGroupsIndex++;
            }
            prefix = securityGroupsPrefix;
        }
        if (createLoadBalancerRequest.getScheme() != null) {
            prefix = "Scheme";
            String scheme = createLoadBalancerRequest.getScheme();
            request.addParameter(prefix, StringUtils.fromString(scheme));
        }
        if (createLoadBalancerRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createLoadBalancerRequest.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + ".member." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }

        return request;
    }
}
