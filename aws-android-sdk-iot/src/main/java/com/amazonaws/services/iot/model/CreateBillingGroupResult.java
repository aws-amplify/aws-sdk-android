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

public class CreateBillingGroupResult implements Serializable {
    /**
     * <p>
     * The name you gave to the billing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String billingGroupName;

    /**
     * <p>
     * The ARN of the billing group.
     * </p>
     */
    private String billingGroupArn;

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
     * The name you gave to the billing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name you gave to the billing group.
     *         </p>
     */
    public String getBillingGroupName() {
        return billingGroupName;
    }

    /**
     * <p>
     * The name you gave to the billing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param billingGroupName <p>
     *            The name you gave to the billing group.
     *            </p>
     */
    public void setBillingGroupName(String billingGroupName) {
        this.billingGroupName = billingGroupName;
    }

    /**
     * <p>
     * The name you gave to the billing group.
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
     *            The name you gave to the billing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBillingGroupResult withBillingGroupName(String billingGroupName) {
        this.billingGroupName = billingGroupName;
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
    public CreateBillingGroupResult withBillingGroupArn(String billingGroupArn) {
        this.billingGroupArn = billingGroupArn;
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
    public CreateBillingGroupResult withBillingGroupId(String billingGroupId) {
        this.billingGroupId = billingGroupId;
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
        if (getBillingGroupArn() != null)
            sb.append("billingGroupArn: " + getBillingGroupArn() + ",");
        if (getBillingGroupId() != null)
            sb.append("billingGroupId: " + getBillingGroupId());
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
                + ((getBillingGroupArn() == null) ? 0 : getBillingGroupArn().hashCode());
        hashCode = prime * hashCode
                + ((getBillingGroupId() == null) ? 0 : getBillingGroupId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBillingGroupResult == false)
            return false;
        CreateBillingGroupResult other = (CreateBillingGroupResult) obj;

        if (other.getBillingGroupName() == null ^ this.getBillingGroupName() == null)
            return false;
        if (other.getBillingGroupName() != null
                && other.getBillingGroupName().equals(this.getBillingGroupName()) == false)
            return false;
        if (other.getBillingGroupArn() == null ^ this.getBillingGroupArn() == null)
            return false;
        if (other.getBillingGroupArn() != null
                && other.getBillingGroupArn().equals(this.getBillingGroupArn()) == false)
            return false;
        if (other.getBillingGroupId() == null ^ this.getBillingGroupId() == null)
            return false;
        if (other.getBillingGroupId() != null
                && other.getBillingGroupId().equals(this.getBillingGroupId()) == false)
            return false;
        return true;
    }
}
