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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Activates AWS Shield Advanced for an account.
 * </p>
 * <p>
 * As part of this request you can specify <code>EmergencySettings</code> that
 * automaticaly grant the DDoS response team (DRT) needed permissions to assist
 * you during a suspected DDoS attack. For more information see <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/authorize-DRT.html"
 * >Authorize the DDoS Response Team to Create Rules and Web ACLs on Your
 * Behalf</a>.
 * </p>
 * <p>
 * To use the services of the DRT, you must be subscribed to the <a
 * href="https://aws.amazon.com/premiumsupport/business-support/">Business
 * Support plan</a> or the <a
 * href="https://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise
 * Support plan</a>.
 * </p>
 * <p>
 * When you initally create a subscription, your subscription is set to be
 * automatically renewed at the end of the existing subscription period. You can
 * change this by submitting an <code>UpdateSubscription</code> request.
 * </p>
 */
public class CreateSubscriptionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSubscriptionRequest == false)
            return false;
        CreateSubscriptionRequest other = (CreateSubscriptionRequest) obj;

        return true;
    }
}
