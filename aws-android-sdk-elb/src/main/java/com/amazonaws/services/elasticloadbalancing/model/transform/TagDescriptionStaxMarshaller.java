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

import com.amazonaws.Request;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO TagDescription
 */
class TagDescriptionStaxMarshaller {

    public void marshall(TagDescription _tagDescription, Request<?> request, String _prefix) {
        String prefix;
        if (_tagDescription.getLoadBalancerName() != null) {
            prefix = _prefix + "LoadBalancerName";
            String loadBalancerName = _tagDescription.getLoadBalancerName();
            request.addParameter(prefix, StringUtils.fromString(loadBalancerName));
        }
        if (_tagDescription.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _tagDescription.getTags();
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
    }

    private static TagDescriptionStaxMarshaller instance;

    public static TagDescriptionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TagDescriptionStaxMarshaller();
        return instance;
    }
}
