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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Confirms a topic rule destination. When you create a rule requiring a
 * destination, AWS IoT sends a confirmation message to the endpoint or base
 * address you specify. The message includes a token which you pass back when
 * calling <code>ConfirmTopicRuleDestination</code> to confirm that you own or
 * have access to the endpoint.
 * </p>
 */
public class ConfirmTopicRuleDestinationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The token used to confirm ownership or access to the topic rule
     * confirmation URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String confirmationToken;

    /**
     * <p>
     * The token used to confirm ownership or access to the topic rule
     * confirmation URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The token used to confirm ownership or access to the topic rule
     *         confirmation URL.
     *         </p>
     */
    public String getConfirmationToken() {
        return confirmationToken;
    }

    /**
     * <p>
     * The token used to confirm ownership or access to the topic rule
     * confirmation URL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param confirmationToken <p>
     *            The token used to confirm ownership or access to the topic
     *            rule confirmation URL.
     *            </p>
     */
    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    /**
     * <p>
     * The token used to confirm ownership or access to the topic rule
     * confirmation URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param confirmationToken <p>
     *            The token used to confirm ownership or access to the topic
     *            rule confirmation URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfirmTopicRuleDestinationRequest withConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
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
        if (getConfirmationToken() != null)
            sb.append("confirmationToken: " + getConfirmationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfirmationToken() == null) ? 0 : getConfirmationToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmTopicRuleDestinationRequest == false)
            return false;
        ConfirmTopicRuleDestinationRequest other = (ConfirmTopicRuleDestinationRequest) obj;

        if (other.getConfirmationToken() == null ^ this.getConfirmationToken() == null)
            return false;
        if (other.getConfirmationToken() != null
                && other.getConfirmationToken().equals(this.getConfirmationToken()) == false)
            return false;
        return true;
    }
}
