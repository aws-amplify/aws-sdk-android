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

public class DescribeBillingGroupResult implements Serializable {
    /**
     * <p>
     * The name of the billing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String billingGroupName;

    /**
     * <p>
     * The ID of the billing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     */
    private String billingGroupId;

    /**
     * <p>
     * The ARN of the billing group.
     * </p>
     */
    private String billingGroupArn;

    /**
     * <p>
     * The version of the billing group.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The properties of the billing group.
     * </p>
     */
    private BillingGroupProperties billingGroupProperties;

    /**
     * <p>
     * Additional information about the billing group.
     * </p>
     */
    private BillingGroupMetadata billingGroupMetadata;

    /**
     * <p>
     * The name of the billing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the billing group.
     *         </p>
     */
    public String getBillingGroupName() {
        return billingGroupName;
    }

    /**
     * <p>
     * The name of the billing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param billingGroupName <p>
     *            The name of the billing group.
     *            </p>
     */
    public void setBillingGroupName(String billingGroupName) {
        this.billingGroupName = billingGroupName;
    }

    /**
     * <p>
     * The name of the billing group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param billingGroupName <p>
     *            The name of the billing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBillingGroupResult withBillingGroupName(String billingGroupName) {
        this.billingGroupName = billingGroupName;
        return this;
    }

    /**
     * <p>
     * The ID of the billing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @return <p>
     *         The ID of the billing group.
     *         </p>
     */
    public String getBillingGroupId() {
        return billingGroupId;
    }

    /**
     * <p>
     * The ID of the billing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param billingGroupId <p>
     *            The ID of the billing group.
     *            </p>
     */
    public void setBillingGroupId(String billingGroupId) {
        this.billingGroupId = billingGroupId;
    }

    /**
     * <p>
     * The ID of the billing group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]+<br/>
     *
     * @param billingGroupId <p>
     *            The ID of the billing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBillingGroupResult withBillingGroupId(String billingGroupId) {
        this.billingGroupId = billingGroupId;
        return this;
    }

    /**
     * <p>
     * The ARN of the billing group.
     * </p>
     *
     * @return <p>
     *         The ARN of the billing group.
     *         </p>
     */
    public String getBillingGroupArn() {
        return billingGroupArn;
    }

    /**
     * <p>
     * The ARN of the billing group.
     * </p>
     *
     * @param billingGroupArn <p>
     *            The ARN of the billing group.
     *            </p>
     */
    public void setBillingGroupArn(String billingGroupArn) {
        this.billingGroupArn = billingGroupArn;
    }

    /**
     * <p>
     * The ARN of the billing group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param billingGroupArn <p>
     *            The ARN of the billing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBillingGroupResult withBillingGroupArn(String billingGroupArn) {
        this.billingGroupArn = billingGroupArn;
        return this;
    }

    /**
     * <p>
     * The version of the billing group.
     * </p>
     *
     * @return <p>
     *         The version of the billing group.
     *         </p>
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the billing group.
     * </p>
     *
     * @param version <p>
     *            The version of the billing group.
     *            </p>
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the billing group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version of the billing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBillingGroupResult withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The properties of the billing group.
     * </p>
     *
     * @return <p>
     *         The properties of the billing group.
     *         </p>
     */
    public BillingGroupProperties getBillingGroupProperties() {
        return billingGroupProperties;
    }

    /**
     * <p>
     * The properties of the billing group.
     * </p>
     *
     * @param billingGroupProperties <p>
     *            The properties of the billing group.
     *            </p>
     */
    public void setBillingGroupProperties(BillingGroupProperties billingGroupProperties) {
        this.billingGroupProperties = billingGroupProperties;
    }

    /**
     * <p>
     * The properties of the billing group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param billingGroupProperties <p>
     *            The properties of the billing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBillingGroupResult withBillingGroupProperties(
            BillingGroupProperties billingGroupProperties) {
        this.billingGroupProperties = billingGroupProperties;
        return this;
    }

    /**
     * <p>
     * Additional information about the billing group.
     * </p>
     *
     * @return <p>
     *         Additional information about the billing group.
     *         </p>
     */
    public BillingGroupMetadata getBillingGroupMetadata() {
        return billingGroupMetadata;
    }

    /**
     * <p>
     * Additional information about the billing group.
     * </p>
     *
     * @param billingGroupMetadata <p>
     *            Additional information about the billing group.
     *            </p>
     */
    public void setBillingGroupMetadata(BillingGroupMetadata billingGroupMetadata) {
        this.billingGroupMetadata = billingGroupMetadata;
    }

    /**
     * <p>
     * Additional information about the billing group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param billingGroupMetadata <p>
     *            Additional information about the billing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeBillingGroupResult withBillingGroupMetadata(
            BillingGroupMetadata billingGroupMetadata) {
        this.billingGroupMetadata = billingGroupMetadata;
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
        if (getBillingGroupName() != null)
            sb.append("billingGroupName: " + getBillingGroupName() + ",");
        if (getBillingGroupId() != null)
            sb.append("billingGroupId: " + getBillingGroupId() + ",");
        if (getBillingGroupArn() != null)
            sb.append("billingGroupArn: " + getBillingGroupArn() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getBillingGroupProperties() != null)
            sb.append("billingGroupProperties: " + getBillingGroupProperties() + ",");
        if (getBillingGroupMetadata() != null)
            sb.append("billingGroupMetadata: " + getBillingGroupMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBillingGroupName() == null) ? 0 : getBillingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getBillingGroupId() == null) ? 0 : getBillingGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getBillingGroupArn() == null) ? 0 : getBillingGroupArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getBillingGroupProperties() == null) ? 0 : getBillingGroupProperties()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getBillingGroupMetadata() == null) ? 0 : getBillingGroupMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBillingGroupResult == false)
            return false;
        DescribeBillingGroupResult other = (DescribeBillingGroupResult) obj;

        if (other.getBillingGroupName() == null ^ this.getBillingGroupName() == null)
            return false;
        if (other.getBillingGroupName() != null
                && other.getBillingGroupName().equals(this.getBillingGroupName()) == false)
            return false;
        if (other.getBillingGroupId() == null ^ this.getBillingGroupId() == null)
            return false;
        if (other.getBillingGroupId() != null
                && other.getBillingGroupId().equals(this.getBillingGroupId()) == false)
            return false;
        if (other.getBillingGroupArn() == null ^ this.getBillingGroupArn() == null)
            return false;
        if (other.getBillingGroupArn() != null
                && other.getBillingGroupArn().equals(this.getBillingGroupArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getBillingGroupProperties() == null ^ this.getBillingGroupProperties() == null)
            return false;
        if (other.getBillingGroupProperties() != null
                && other.getBillingGroupProperties().equals(this.getBillingGroupProperties()) == false)
            return false;
        if (other.getBillingGroupMetadata() == null ^ this.getBillingGroupMetadata() == null)
            return false;
        if (other.getBillingGroupMetadata() != null
                && other.getBillingGroupMetadata().equals(this.getBillingGroupMetadata()) == false)
            return false;
        return true;
    }
}
