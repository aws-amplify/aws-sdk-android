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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * A tag and its associated resource.
 * </p>
 */
public class TaggedResource implements Serializable {
    /**
     * <p>
     * The tag for the resource.
     * </p>
     */
    private Tag tag;

    /**
     * <p>
     * The Amazon Resource Name (ARN) with which the tag is associated, for
     * example: <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     * </p>
     */
    private String resourceName;

    /**
     * <p>
     * The type of resource with which the tag is associated. Valid resource
     * types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * CIDR/IP
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * Cluster security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Subnet group
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM connection
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM certificate
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter group
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon Redshift resource types and
     * constructing ARNs, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     * >Constructing an Amazon Redshift Amazon Resource Name (ARN)</a> in the
     * Amazon Redshift Cluster Management Guide.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The tag for the resource.
     * </p>
     *
     * @return <p>
     *         The tag for the resource.
     *         </p>
     */
    public Tag getTag() {
        return tag;
    }

    /**
     * <p>
     * The tag for the resource.
     * </p>
     *
     * @param tag <p>
     *            The tag for the resource.
     *            </p>
     */
    public void setTag(Tag tag) {
        this.tag = tag;
    }

    /**
     * <p>
     * The tag for the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tag <p>
     *            The tag for the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaggedResource withTag(Tag tag) {
        this.tag = tag;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) with which the tag is associated, for
     * example: <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) with which the tag is associated,
     *         for example:
     *         <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     *         </p>
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) with which the tag is associated, for
     * example: <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     * </p>
     *
     * @param resourceName <p>
     *            The Amazon Resource Name (ARN) with which the tag is
     *            associated, for example:
     *            <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     *            </p>
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) with which the tag is associated, for
     * example: <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceName <p>
     *            The Amazon Resource Name (ARN) with which the tag is
     *            associated, for example:
     *            <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaggedResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * <p>
     * The type of resource with which the tag is associated. Valid resource
     * types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * CIDR/IP
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * Cluster security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Subnet group
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM connection
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM certificate
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter group
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon Redshift resource types and
     * constructing ARNs, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     * >Constructing an Amazon Redshift Amazon Resource Name (ARN)</a> in the
     * Amazon Redshift Cluster Management Guide.
     * </p>
     *
     * @return <p>
     *         The type of resource with which the tag is associated. Valid
     *         resource types are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Cluster
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CIDR/IP
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EC2 security group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Snapshot
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cluster security group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Subnet group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HSM connection
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HSM certificate
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Parameter group
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about Amazon Redshift resource types and
     *         constructing ARNs, go to <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     *         >Constructing an Amazon Redshift Amazon Resource Name (ARN)</a>
     *         in the Amazon Redshift Cluster Management Guide.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of resource with which the tag is associated. Valid resource
     * types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * CIDR/IP
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * Cluster security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Subnet group
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM connection
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM certificate
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter group
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon Redshift resource types and
     * constructing ARNs, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     * >Constructing an Amazon Redshift Amazon Resource Name (ARN)</a> in the
     * Amazon Redshift Cluster Management Guide.
     * </p>
     *
     * @param resourceType <p>
     *            The type of resource with which the tag is associated. Valid
     *            resource types are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Cluster
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CIDR/IP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EC2 security group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Snapshot
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cluster security group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Subnet group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            HSM connection
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            HSM certificate
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Parameter group
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about Amazon Redshift resource types and
     *            constructing ARNs, go to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     *            >Constructing an Amazon Redshift Amazon Resource Name
     *            (ARN)</a> in the Amazon Redshift Cluster Management Guide.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource with which the tag is associated. Valid resource
     * types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cluster
     * </p>
     * </li>
     * <li>
     * <p>
     * CIDR/IP
     * </p>
     * </li>
     * <li>
     * <p>
     * EC2 security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * Cluster security group
     * </p>
     * </li>
     * <li>
     * <p>
     * Subnet group
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM connection
     * </p>
     * </li>
     * <li>
     * <p>
     * HSM certificate
     * </p>
     * </li>
     * <li>
     * <p>
     * Parameter group
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon Redshift resource types and
     * constructing ARNs, go to <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     * >Constructing an Amazon Redshift Amazon Resource Name (ARN)</a> in the
     * Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceType <p>
     *            The type of resource with which the tag is associated. Valid
     *            resource types are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Cluster
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            CIDR/IP
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EC2 security group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Snapshot
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cluster security group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Subnet group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            HSM connection
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            HSM certificate
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Parameter group
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about Amazon Redshift resource types and
     *            constructing ARNs, go to <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-overview.html#redshift-iam-access-control-specify-actions"
     *            >Constructing an Amazon Redshift Amazon Resource Name
     *            (ARN)</a> in the Amazon Redshift Cluster Management Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaggedResource withResourceType(String resourceType) {
        this.resourceType = resourceType;
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
        if (getTag() != null)
            sb.append("Tag: " + getTag() + ",");
        if (getResourceName() != null)
            sb.append("ResourceName: " + getResourceName() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTag() == null) ? 0 : getTag().hashCode());
        hashCode = prime * hashCode
                + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaggedResource == false)
            return false;
        TaggedResource other = (TaggedResource) obj;

        if (other.getTag() == null ^ this.getTag() == null)
            return false;
        if (other.getTag() != null && other.getTag().equals(this.getTag()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null
                && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }
}
