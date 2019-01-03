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
 * Creates a billing group.
 * </p>
 */
public class CreateBillingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name you wish to give to the billing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String billingGroupName;

    /**
     * <p>
     * The properties of the billing group.
     * </p>
     */
    private BillingGroupProperties billingGroupProperties;

    /**
     * <p>
     * Metadata which can be used to manage the billing group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name you wish to give to the billing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name you wish to give to the billing group.
     *         </p>
     */
    public String getBillingGroupName() {
        return billingGroupName;
    }

    /**
     * <p>
     * The name you wish to give to the billing group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param billingGroupName <p>
     *            The name you wish to give to the billing group.
     *            </p>
     */
    public void setBillingGroupName(String billingGroupName) {
        this.billingGroupName = billingGroupName;
    }

    /**
     * <p>
     * The name you wish to give to the billing group.
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
     *            The name you wish to give to the billing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBillingGroupRequest withBillingGroupName(String billingGroupName) {
        this.billingGroupName = billingGroupName;
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
    public CreateBillingGroupRequest withBillingGroupProperties(
            BillingGroupProperties billingGroupProperties) {
        this.billingGroupProperties = billingGroupProperties;
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the billing group.
     * </p>
     *
     * @return <p>
     *         Metadata which can be used to manage the billing group.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the billing group.
     * </p>
     *
     * @param tags <p>
     *            Metadata which can be used to manage the billing group.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage the billing group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the billing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBillingGroupRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the billing group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the billing group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBillingGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getBillingGroupProperties() != null)
            sb.append("billingGroupProperties: " + getBillingGroupProperties() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBillingGroupName() == null) ? 0 : getBillingGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getBillingGroupProperties() == null) ? 0 : getBillingGroupProperties()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBillingGroupRequest == false)
            return false;
        CreateBillingGroupRequest other = (CreateBillingGroupRequest) obj;

        if (other.getBillingGroupName() == null ^ this.getBillingGroupName() == null)
            return false;
        if (other.getBillingGroupName() != null
                && other.getBillingGroupName().equals(this.getBillingGroupName()) == false)
            return false;
        if (other.getBillingGroupProperties() == null ^ this.getBillingGroupProperties() == null)
            return false;
        if (other.getBillingGroupProperties() != null
                && other.getBillingGroupProperties().equals(this.getBillingGroupProperties()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
