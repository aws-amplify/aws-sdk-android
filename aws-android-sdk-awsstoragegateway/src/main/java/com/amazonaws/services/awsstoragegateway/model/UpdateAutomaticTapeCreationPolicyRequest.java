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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the automatic tape creation policy of a gateway. Use this to update
 * the policy with a new set of automatic tape creation rules. This is only
 * supported for tape gateways.
 * </p>
 * <p>
 * By default, there is no automatic tape creation policy.
 * </p>
 * <note>
 * <p>
 * A gateway can have only one automatic tape creation policy.
 * </p>
 * </note>
 */
public class UpdateAutomaticTapeCreationPolicyRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * An automatic tape creation policy consists of a list of automatic tape
     * creation rules. The rules determine when and how to automatically create
     * new tapes.
     * </p>
     */
    private java.util.List<AutomaticTapeCreationRule> automaticTapeCreationRules;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * An automatic tape creation policy consists of a list of automatic tape
     * creation rules. The rules determine when and how to automatically create
     * new tapes.
     * </p>
     *
     * @return <p>
     *         An automatic tape creation policy consists of a list of automatic
     *         tape creation rules. The rules determine when and how to
     *         automatically create new tapes.
     *         </p>
     */
    public java.util.List<AutomaticTapeCreationRule> getAutomaticTapeCreationRules() {
        return automaticTapeCreationRules;
    }

    /**
     * <p>
     * An automatic tape creation policy consists of a list of automatic tape
     * creation rules. The rules determine when and how to automatically create
     * new tapes.
     * </p>
     *
     * @param automaticTapeCreationRules <p>
     *            An automatic tape creation policy consists of a list of
     *            automatic tape creation rules. The rules determine when and
     *            how to automatically create new tapes.
     *            </p>
     */
    public void setAutomaticTapeCreationRules(
            java.util.Collection<AutomaticTapeCreationRule> automaticTapeCreationRules) {
        if (automaticTapeCreationRules == null) {
            this.automaticTapeCreationRules = null;
            return;
        }

        this.automaticTapeCreationRules = new java.util.ArrayList<AutomaticTapeCreationRule>(
                automaticTapeCreationRules);
    }

    /**
     * <p>
     * An automatic tape creation policy consists of a list of automatic tape
     * creation rules. The rules determine when and how to automatically create
     * new tapes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param automaticTapeCreationRules <p>
     *            An automatic tape creation policy consists of a list of
     *            automatic tape creation rules. The rules determine when and
     *            how to automatically create new tapes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAutomaticTapeCreationPolicyRequest withAutomaticTapeCreationRules(
            AutomaticTapeCreationRule... automaticTapeCreationRules) {
        if (getAutomaticTapeCreationRules() == null) {
            this.automaticTapeCreationRules = new java.util.ArrayList<AutomaticTapeCreationRule>(
                    automaticTapeCreationRules.length);
        }
        for (AutomaticTapeCreationRule value : automaticTapeCreationRules) {
            this.automaticTapeCreationRules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An automatic tape creation policy consists of a list of automatic tape
     * creation rules. The rules determine when and how to automatically create
     * new tapes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param automaticTapeCreationRules <p>
     *            An automatic tape creation policy consists of a list of
     *            automatic tape creation rules. The rules determine when and
     *            how to automatically create new tapes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAutomaticTapeCreationPolicyRequest withAutomaticTapeCreationRules(
            java.util.Collection<AutomaticTapeCreationRule> automaticTapeCreationRules) {
        setAutomaticTapeCreationRules(automaticTapeCreationRules);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for
     *         your account and AWS Region.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAutomaticTapeCreationPolicyRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
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
        if (getAutomaticTapeCreationRules() != null)
            sb.append("AutomaticTapeCreationRules: " + getAutomaticTapeCreationRules() + ",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAutomaticTapeCreationRules() == null) ? 0 : getAutomaticTapeCreationRules()
                        .hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAutomaticTapeCreationPolicyRequest == false)
            return false;
        UpdateAutomaticTapeCreationPolicyRequest other = (UpdateAutomaticTapeCreationPolicyRequest) obj;

        if (other.getAutomaticTapeCreationRules() == null
                ^ this.getAutomaticTapeCreationRules() == null)
            return false;
        if (other.getAutomaticTapeCreationRules() != null
                && other.getAutomaticTapeCreationRules().equals(
                        this.getAutomaticTapeCreationRules()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        return true;
    }
}
