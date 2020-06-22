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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Accepts the Convertible Reserved Instance exchange quote described in the
 * <a>GetReservedInstancesExchangeQuote</a> call.
 * </p>
 */
public class AcceptReservedInstancesExchangeQuoteRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The IDs of the Convertible Reserved Instances to exchange for another
     * Convertible Reserved Instance of the same or higher value.
     * </p>
     */
    private java.util.List<String> reservedInstanceIds;

    /**
     * <p>
     * The configuration of the target Convertible Reserved Instance to exchange
     * for your current Convertible Reserved Instances.
     * </p>
     */
    private java.util.List<TargetConfigurationRequest> targetConfigurations;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptReservedInstancesExchangeQuoteRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The IDs of the Convertible Reserved Instances to exchange for another
     * Convertible Reserved Instance of the same or higher value.
     * </p>
     *
     * @return <p>
     *         The IDs of the Convertible Reserved Instances to exchange for
     *         another Convertible Reserved Instance of the same or higher
     *         value.
     *         </p>
     */
    public java.util.List<String> getReservedInstanceIds() {
        return reservedInstanceIds;
    }

    /**
     * <p>
     * The IDs of the Convertible Reserved Instances to exchange for another
     * Convertible Reserved Instance of the same or higher value.
     * </p>
     *
     * @param reservedInstanceIds <p>
     *            The IDs of the Convertible Reserved Instances to exchange for
     *            another Convertible Reserved Instance of the same or higher
     *            value.
     *            </p>
     */
    public void setReservedInstanceIds(java.util.Collection<String> reservedInstanceIds) {
        if (reservedInstanceIds == null) {
            this.reservedInstanceIds = null;
            return;
        }

        this.reservedInstanceIds = new java.util.ArrayList<String>(reservedInstanceIds);
    }

    /**
     * <p>
     * The IDs of the Convertible Reserved Instances to exchange for another
     * Convertible Reserved Instance of the same or higher value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstanceIds <p>
     *            The IDs of the Convertible Reserved Instances to exchange for
     *            another Convertible Reserved Instance of the same or higher
     *            value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptReservedInstancesExchangeQuoteRequest withReservedInstanceIds(
            String... reservedInstanceIds) {
        if (getReservedInstanceIds() == null) {
            this.reservedInstanceIds = new java.util.ArrayList<String>(reservedInstanceIds.length);
        }
        for (String value : reservedInstanceIds) {
            this.reservedInstanceIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Convertible Reserved Instances to exchange for another
     * Convertible Reserved Instance of the same or higher value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstanceIds <p>
     *            The IDs of the Convertible Reserved Instances to exchange for
     *            another Convertible Reserved Instance of the same or higher
     *            value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptReservedInstancesExchangeQuoteRequest withReservedInstanceIds(
            java.util.Collection<String> reservedInstanceIds) {
        setReservedInstanceIds(reservedInstanceIds);
        return this;
    }

    /**
     * <p>
     * The configuration of the target Convertible Reserved Instance to exchange
     * for your current Convertible Reserved Instances.
     * </p>
     *
     * @return <p>
     *         The configuration of the target Convertible Reserved Instance to
     *         exchange for your current Convertible Reserved Instances.
     *         </p>
     */
    public java.util.List<TargetConfigurationRequest> getTargetConfigurations() {
        return targetConfigurations;
    }

    /**
     * <p>
     * The configuration of the target Convertible Reserved Instance to exchange
     * for your current Convertible Reserved Instances.
     * </p>
     *
     * @param targetConfigurations <p>
     *            The configuration of the target Convertible Reserved Instance
     *            to exchange for your current Convertible Reserved Instances.
     *            </p>
     */
    public void setTargetConfigurations(
            java.util.Collection<TargetConfigurationRequest> targetConfigurations) {
        if (targetConfigurations == null) {
            this.targetConfigurations = null;
            return;
        }

        this.targetConfigurations = new java.util.ArrayList<TargetConfigurationRequest>(
                targetConfigurations);
    }

    /**
     * <p>
     * The configuration of the target Convertible Reserved Instance to exchange
     * for your current Convertible Reserved Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetConfigurations <p>
     *            The configuration of the target Convertible Reserved Instance
     *            to exchange for your current Convertible Reserved Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptReservedInstancesExchangeQuoteRequest withTargetConfigurations(
            TargetConfigurationRequest... targetConfigurations) {
        if (getTargetConfigurations() == null) {
            this.targetConfigurations = new java.util.ArrayList<TargetConfigurationRequest>(
                    targetConfigurations.length);
        }
        for (TargetConfigurationRequest value : targetConfigurations) {
            this.targetConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The configuration of the target Convertible Reserved Instance to exchange
     * for your current Convertible Reserved Instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetConfigurations <p>
     *            The configuration of the target Convertible Reserved Instance
     *            to exchange for your current Convertible Reserved Instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceptReservedInstancesExchangeQuoteRequest withTargetConfigurations(
            java.util.Collection<TargetConfigurationRequest> targetConfigurations) {
        setTargetConfigurations(targetConfigurations);
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getReservedInstanceIds() != null)
            sb.append("ReservedInstanceIds: " + getReservedInstanceIds() + ",");
        if (getTargetConfigurations() != null)
            sb.append("TargetConfigurations: " + getTargetConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getReservedInstanceIds() == null) ? 0 : getReservedInstanceIds().hashCode());
        hashCode = prime * hashCode
                + ((getTargetConfigurations() == null) ? 0 : getTargetConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptReservedInstancesExchangeQuoteRequest == false)
            return false;
        AcceptReservedInstancesExchangeQuoteRequest other = (AcceptReservedInstancesExchangeQuoteRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getReservedInstanceIds() == null ^ this.getReservedInstanceIds() == null)
            return false;
        if (other.getReservedInstanceIds() != null
                && other.getReservedInstanceIds().equals(this.getReservedInstanceIds()) == false)
            return false;
        if (other.getTargetConfigurations() == null ^ this.getTargetConfigurations() == null)
            return false;
        if (other.getTargetConfigurations() != null
                && other.getTargetConfigurations().equals(this.getTargetConfigurations()) == false)
            return false;
        return true;
    }
}
