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
 * Purchases the Scheduled Instances with the specified schedule.
 * </p>
 * <p>
 * Scheduled Instances enable you to purchase Amazon EC2 compute capacity by the
 * hour for a one-year term. Before you can purchase a Scheduled Instance, you
 * must call <a>DescribeScheduledInstanceAvailability</a> to check for available
 * schedules and obtain a purchase token. After you purchase a Scheduled
 * Instance, you must call <a>RunScheduledInstances</a> during each scheduled
 * time period.
 * </p>
 * <p>
 * After you purchase a Scheduled Instance, you can't cancel, modify, or resell
 * your purchase.
 * </p>
 */
public class PurchaseScheduledInstancesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Unique, case-sensitive identifier that ensures the idempotency of the
     * request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     */
    private String clientToken;

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
     * The purchase requests.
     * </p>
     */
    private java.util.List<PurchaseRequest> purchaseRequests;

    /**
     * <p>
     * Unique, case-sensitive identifier that ensures the idempotency of the
     * request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier that ensures the idempotency of
     *         the request. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *         >Ensuring Idempotency</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that ensures the idempotency of the
     * request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that ensures the idempotency
     *            of the request. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that ensures the idempotency of the
     * request. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     * >Ensuring Idempotency</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier that ensures the idempotency
     *            of the request. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html"
     *            >Ensuring Idempotency</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseScheduledInstancesRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
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
    public PurchaseScheduledInstancesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The purchase requests.
     * </p>
     *
     * @return <p>
     *         The purchase requests.
     *         </p>
     */
    public java.util.List<PurchaseRequest> getPurchaseRequests() {
        return purchaseRequests;
    }

    /**
     * <p>
     * The purchase requests.
     * </p>
     *
     * @param purchaseRequests <p>
     *            The purchase requests.
     *            </p>
     */
    public void setPurchaseRequests(java.util.Collection<PurchaseRequest> purchaseRequests) {
        if (purchaseRequests == null) {
            this.purchaseRequests = null;
            return;
        }

        this.purchaseRequests = new java.util.ArrayList<PurchaseRequest>(purchaseRequests);
    }

    /**
     * <p>
     * The purchase requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param purchaseRequests <p>
     *            The purchase requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseScheduledInstancesRequest withPurchaseRequests(
            PurchaseRequest... purchaseRequests) {
        if (getPurchaseRequests() == null) {
            this.purchaseRequests = new java.util.ArrayList<PurchaseRequest>(
                    purchaseRequests.length);
        }
        for (PurchaseRequest value : purchaseRequests) {
            this.purchaseRequests.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The purchase requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param purchaseRequests <p>
     *            The purchase requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseScheduledInstancesRequest withPurchaseRequests(
            java.util.Collection<PurchaseRequest> purchaseRequests) {
        setPurchaseRequests(purchaseRequests);
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getPurchaseRequests() != null)
            sb.append("PurchaseRequests: " + getPurchaseRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getPurchaseRequests() == null) ? 0 : getPurchaseRequests().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseScheduledInstancesRequest == false)
            return false;
        PurchaseScheduledInstancesRequest other = (PurchaseScheduledInstancesRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getPurchaseRequests() == null ^ this.getPurchaseRequests() == null)
            return false;
        if (other.getPurchaseRequests() != null
                && other.getPurchaseRequests().equals(this.getPurchaseRequests()) == false)
            return false;
        return true;
    }
}
