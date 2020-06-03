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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the associated gateway.
 * </p>
 */
public class AssociatedGateway implements Serializable {
    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The type of associated gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>virtualPrivateGateway, transitGateway
     */
    private String type;

    /**
     * <p>
     * The ID of the AWS account that owns the associated virtual private
     * gateway or transit gateway.
     * </p>
     */
    private String ownerAccount;

    /**
     * <p>
     * The Region where the associated gateway is located.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the associated gateway.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     *
     * @param id <p>
     *            The ID of the associated gateway.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the associated gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The ID of the associated gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatedGateway withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The type of associated gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>virtualPrivateGateway, transitGateway
     *
     * @return <p>
     *         The type of associated gateway.
     *         </p>
     * @see GatewayType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of associated gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>virtualPrivateGateway, transitGateway
     *
     * @param type <p>
     *            The type of associated gateway.
     *            </p>
     * @see GatewayType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of associated gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>virtualPrivateGateway, transitGateway
     *
     * @param type <p>
     *            The type of associated gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GatewayType
     */
    public AssociatedGateway withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of associated gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>virtualPrivateGateway, transitGateway
     *
     * @param type <p>
     *            The type of associated gateway.
     *            </p>
     * @see GatewayType
     */
    public void setType(GatewayType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of associated gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>virtualPrivateGateway, transitGateway
     *
     * @param type <p>
     *            The type of associated gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GatewayType
     */
    public AssociatedGateway withType(GatewayType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the associated virtual private
     * gateway or transit gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the associated virtual
     *         private gateway or transit gateway.
     *         </p>
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the associated virtual private
     * gateway or transit gateway.
     * </p>
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account that owns the associated virtual
     *            private gateway or transit gateway.
     *            </p>
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the associated virtual private
     * gateway or transit gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account that owns the associated virtual
     *            private gateway or transit gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatedGateway withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * <p>
     * The Region where the associated gateway is located.
     * </p>
     *
     * @return <p>
     *         The Region where the associated gateway is located.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The Region where the associated gateway is located.
     * </p>
     *
     * @param region <p>
     *            The Region where the associated gateway is located.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Region where the associated gateway is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region <p>
     *            The Region where the associated gateway is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatedGateway withRegion(String region) {
        this.region = region;
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getOwnerAccount() != null)
            sb.append("ownerAccount: " + getOwnerAccount() + ",");
        if (getRegion() != null)
            sb.append("region: " + getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociatedGateway == false)
            return false;
        AssociatedGateway other = (AssociatedGateway) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null
                && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }
}
