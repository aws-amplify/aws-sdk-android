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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the physical requirements for a connection.
 * </p>
 */
public class PhysicalConnectionRequirements implements Serializable {
    /**
     * <p>
     * The subnet ID used by the connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String subnetId;

    /**
     * <p>
     * The security group ID list used by the connection.
     * </p>
     */
    private java.util.List<String> securityGroupIdList;

    /**
     * <p>
     * The connection's Availability Zone. This field is redundant because the
     * specified subnet implies the Availability Zone to be used. Currently the
     * field must be populated, but it will be deprecated in the future.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String availabilityZone;

    /**
     * <p>
     * The subnet ID used by the connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The subnet ID used by the connection.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The subnet ID used by the connection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param subnetId <p>
     *            The subnet ID used by the connection.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID used by the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param subnetId <p>
     *            The subnet ID used by the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhysicalConnectionRequirements withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * The security group ID list used by the connection.
     * </p>
     *
     * @return <p>
     *         The security group ID list used by the connection.
     *         </p>
     */
    public java.util.List<String> getSecurityGroupIdList() {
        return securityGroupIdList;
    }

    /**
     * <p>
     * The security group ID list used by the connection.
     * </p>
     *
     * @param securityGroupIdList <p>
     *            The security group ID list used by the connection.
     *            </p>
     */
    public void setSecurityGroupIdList(java.util.Collection<String> securityGroupIdList) {
        if (securityGroupIdList == null) {
            this.securityGroupIdList = null;
            return;
        }

        this.securityGroupIdList = new java.util.ArrayList<String>(securityGroupIdList);
    }

    /**
     * <p>
     * The security group ID list used by the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIdList <p>
     *            The security group ID list used by the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhysicalConnectionRequirements withSecurityGroupIdList(String... securityGroupIdList) {
        if (getSecurityGroupIdList() == null) {
            this.securityGroupIdList = new java.util.ArrayList<String>(securityGroupIdList.length);
        }
        for (String value : securityGroupIdList) {
            this.securityGroupIdList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The security group ID list used by the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroupIdList <p>
     *            The security group ID list used by the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhysicalConnectionRequirements withSecurityGroupIdList(
            java.util.Collection<String> securityGroupIdList) {
        setSecurityGroupIdList(securityGroupIdList);
        return this;
    }

    /**
     * <p>
     * The connection's Availability Zone. This field is redundant because the
     * specified subnet implies the Availability Zone to be used. Currently the
     * field must be populated, but it will be deprecated in the future.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The connection's Availability Zone. This field is redundant
     *         because the specified subnet implies the Availability Zone to be
     *         used. Currently the field must be populated, but it will be
     *         deprecated in the future.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The connection's Availability Zone. This field is redundant because the
     * specified subnet implies the Availability Zone to be used. Currently the
     * field must be populated, but it will be deprecated in the future.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param availabilityZone <p>
     *            The connection's Availability Zone. This field is redundant
     *            because the specified subnet implies the Availability Zone to
     *            be used. Currently the field must be populated, but it will be
     *            deprecated in the future.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The connection's Availability Zone. This field is redundant because the
     * specified subnet implies the Availability Zone to be used. Currently the
     * field must be populated, but it will be deprecated in the future.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param availabilityZone <p>
     *            The connection's Availability Zone. This field is redundant
     *            because the specified subnet implies the Availability Zone to
     *            be used. Currently the field must be populated, but it will be
     *            deprecated in the future.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PhysicalConnectionRequirements withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
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
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getSecurityGroupIdList() != null)
            sb.append("SecurityGroupIdList: " + getSecurityGroupIdList() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroupIdList() == null) ? 0 : getSecurityGroupIdList().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhysicalConnectionRequirements == false)
            return false;
        PhysicalConnectionRequirements other = (PhysicalConnectionRequirements) obj;

        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getSecurityGroupIdList() == null ^ this.getSecurityGroupIdList() == null)
            return false;
        if (other.getSecurityGroupIdList() != null
                && other.getSecurityGroupIdList().equals(this.getSecurityGroupIdList()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        return true;
    }
}
