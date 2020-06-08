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

public class GetSubscriptionStateResult implements Serializable {
    /**
     * <p>
     * The status of the subscription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     */
    private String subscriptionState;

    /**
     * <p>
     * The status of the subscription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @return <p>
     *         The status of the subscription.
     *         </p>
     * @see SubscriptionState
     */
    public String getSubscriptionState() {
        return subscriptionState;
    }

    /**
     * <p>
     * The status of the subscription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param subscriptionState <p>
     *            The status of the subscription.
     *            </p>
     * @see SubscriptionState
     */
    public void setSubscriptionState(String subscriptionState) {
        this.subscriptionState = subscriptionState;
    }

    /**
     * <p>
     * The status of the subscription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param subscriptionState <p>
     *            The status of the subscription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SubscriptionState
     */
    public GetSubscriptionStateResult withSubscriptionState(String subscriptionState) {
        this.subscriptionState = subscriptionState;
        return this;
    }

    /**
     * <p>
     * The status of the subscription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param subscriptionState <p>
     *            The status of the subscription.
     *            </p>
     * @see SubscriptionState
     */
    public void setSubscriptionState(SubscriptionState subscriptionState) {
        this.subscriptionState = subscriptionState.toString();
    }

    /**
     * <p>
     * The status of the subscription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param subscriptionState <p>
     *            The status of the subscription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SubscriptionState
     */
    public GetSubscriptionStateResult withSubscriptionState(SubscriptionState subscriptionState) {
        this.subscriptionState = subscriptionState.toString();
        return this;
    }

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
        if (getSubscriptionState() != null)
            sb.append("SubscriptionState: " + getSubscriptionState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSubscriptionState() == null) ? 0 : getSubscriptionState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSubscriptionStateResult == false)
            return false;
        GetSubscriptionStateResult other = (GetSubscriptionStateResult) obj;

        if (other.getSubscriptionState() == null ^ this.getSubscriptionState() == null)
            return false;
        if (other.getSubscriptionState() != null
                && other.getSubscriptionState().equals(this.getSubscriptionState()) == false)
            return false;
        return true;
    }
}
