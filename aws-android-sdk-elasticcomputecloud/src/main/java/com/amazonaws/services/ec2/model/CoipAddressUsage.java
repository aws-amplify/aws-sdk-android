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

/**
 * <p>
 * Describes address usage for a customer-owned address pool.
 * </p>
 */
public class CoipAddressUsage implements Serializable {
    /**
     * <p>
     * The allocation ID of the address.
     * </p>
     */
    private String allocationId;

    /**
     * <p>
     * The AWS account ID.
     * </p>
     */
    private String awsAccountId;

    /**
     * <p>
     * The AWS service.
     * </p>
     */
    private String awsService;

    /**
     * <p>
     * The customer-owned IP address.
     * </p>
     */
    private String coIp;

    /**
     * <p>
     * The allocation ID of the address.
     * </p>
     *
     * @return <p>
     *         The allocation ID of the address.
     *         </p>
     */
    public String getAllocationId() {
        return allocationId;
    }

    /**
     * <p>
     * The allocation ID of the address.
     * </p>
     *
     * @param allocationId <p>
     *            The allocation ID of the address.
     *            </p>
     */
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * The allocation ID of the address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocationId <p>
     *            The allocation ID of the address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoipAddressUsage withAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     *
     * @return <p>
     *         The AWS account ID.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     *
     * @param awsAccountId <p>
     *            The AWS account ID.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsAccountId <p>
     *            The AWS account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoipAddressUsage withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The AWS service.
     * </p>
     *
     * @return <p>
     *         The AWS service.
     *         </p>
     */
    public String getAwsService() {
        return awsService;
    }

    /**
     * <p>
     * The AWS service.
     * </p>
     *
     * @param awsService <p>
     *            The AWS service.
     *            </p>
     */
    public void setAwsService(String awsService) {
        this.awsService = awsService;
    }

    /**
     * <p>
     * The AWS service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsService <p>
     *            The AWS service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoipAddressUsage withAwsService(String awsService) {
        this.awsService = awsService;
        return this;
    }

    /**
     * <p>
     * The customer-owned IP address.
     * </p>
     *
     * @return <p>
     *         The customer-owned IP address.
     *         </p>
     */
    public String getCoIp() {
        return coIp;
    }

    /**
     * <p>
     * The customer-owned IP address.
     * </p>
     *
     * @param coIp <p>
     *            The customer-owned IP address.
     *            </p>
     */
    public void setCoIp(String coIp) {
        this.coIp = coIp;
    }

    /**
     * <p>
     * The customer-owned IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coIp <p>
     *            The customer-owned IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoipAddressUsage withCoIp(String coIp) {
        this.coIp = coIp;
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
        if (getAllocationId() != null)
            sb.append("AllocationId: " + getAllocationId() + ",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: " + getAwsAccountId() + ",");
        if (getAwsService() != null)
            sb.append("AwsService: " + getAwsService() + ",");
        if (getCoIp() != null)
            sb.append("CoIp: " + getCoIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsService() == null) ? 0 : getAwsService().hashCode());
        hashCode = prime * hashCode + ((getCoIp() == null) ? 0 : getCoIp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoipAddressUsage == false)
            return false;
        CoipAddressUsage other = (CoipAddressUsage) obj;

        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null
                && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAwsService() == null ^ this.getAwsService() == null)
            return false;
        if (other.getAwsService() != null
                && other.getAwsService().equals(this.getAwsService()) == false)
            return false;
        if (other.getCoIp() == null ^ this.getCoIp() == null)
            return false;
        if (other.getCoIp() != null && other.getCoIp().equals(this.getCoIp()) == false)
            return false;
        return true;
    }
}
