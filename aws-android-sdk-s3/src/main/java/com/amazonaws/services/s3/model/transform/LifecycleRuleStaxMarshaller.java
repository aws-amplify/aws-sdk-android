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

import com.amazonaws.Request;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO LifecycleRule
 */
class LifecycleRuleStaxMarshaller {

    public void marshall(LifecycleRule _lifecycleRule, Request<?> request, String _prefix) {
        String prefix;
        if (_lifecycleRule.getExpiration() != null) {
            prefix = _prefix + "Expiration";
            LifecycleExpiration expiration = _lifecycleRule.getExpiration();
            LifecycleExpirationStaxMarshaller.getInstance().marshall(expiration, request,
                    prefix + ".");
        }
        if (_lifecycleRule.getID() != null) {
            prefix = _prefix + "ID";
            String iD = _lifecycleRule.getID();
            request.addParameter(prefix, StringUtils.fromString(iD));
        }
        if (_lifecycleRule.getPrefix() != null) {
            prefix = _prefix + "Prefix";
            String prefix = _lifecycleRule.getPrefix();
            request.addParameter(prefix, StringUtils.fromString(prefix));
        }
        if (_lifecycleRule.getFilter() != null) {
            prefix = _prefix + "Filter";
            LifecycleRuleFilter filter = _lifecycleRule.getFilter();
            LifecycleRuleFilterStaxMarshaller.getInstance().marshall(filter, request, prefix + ".");
        }
        if (_lifecycleRule.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _lifecycleRule.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_lifecycleRule.getTransitions() != null) {
            prefix = _prefix + "Transitions";
            java.util.List<Transition> transitions = _lifecycleRule.getTransitions();
            int transitionsIndex = 1;
            String transitionsPrefix = prefix;
            for (Transition transitionsItem : transitions) {
                prefix = transitionsPrefix + ".member." + transitionsIndex;
                if (transitionsItem != null) {
                    TransitionStaxMarshaller.getInstance().marshall(transitionsItem, request,
                            prefix + ".");
                }
                transitionsIndex++;
            }
            prefix = transitionsPrefix;
        }
        if (_lifecycleRule.getNoncurrentVersionTransitions() != null) {
            prefix = _prefix + "NoncurrentVersionTransitions";
            java.util.List<NoncurrentVersionTransition> noncurrentVersionTransitions = _lifecycleRule
                    .getNoncurrentVersionTransitions();
            int noncurrentVersionTransitionsIndex = 1;
            String noncurrentVersionTransitionsPrefix = prefix;
            for (NoncurrentVersionTransition noncurrentVersionTransitionsItem : noncurrentVersionTransitions) {
                prefix = noncurrentVersionTransitionsPrefix + ".member."
                        + noncurrentVersionTransitionsIndex;
                if (noncurrentVersionTransitionsItem != null) {
                    NoncurrentVersionTransitionStaxMarshaller.getInstance().marshall(
                            noncurrentVersionTransitionsItem, request, prefix + ".");
                }
                noncurrentVersionTransitionsIndex++;
            }
            prefix = noncurrentVersionTransitionsPrefix;
        }
        if (_lifecycleRule.getNoncurrentVersionExpiration() != null) {
            prefix = _prefix + "NoncurrentVersionExpiration";
            NoncurrentVersionExpiration noncurrentVersionExpiration = _lifecycleRule
                    .getNoncurrentVersionExpiration();
            NoncurrentVersionExpirationStaxMarshaller.getInstance().marshall(
                    noncurrentVersionExpiration, request, prefix + ".");
        }
        if (_lifecycleRule.getAbortIncompleteMultipartUpload() != null) {
            prefix = _prefix + "AbortIncompleteMultipartUpload";
            AbortIncompleteMultipartUpload abortIncompleteMultipartUpload = _lifecycleRule
                    .getAbortIncompleteMultipartUpload();
            AbortIncompleteMultipartUploadStaxMarshaller.getInstance().marshall(
                    abortIncompleteMultipartUpload, request, prefix + ".");
        }
    }

    private static LifecycleRuleStaxMarshaller instance;

    public static LifecycleRuleStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LifecycleRuleStaxMarshaller();
        return instance;
    }
}
