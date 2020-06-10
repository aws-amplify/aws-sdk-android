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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents a resource that is under DDoS protection.
 * </p>
 */
public class Protection implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the protection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     */
    private String id;

    /**
     * <p>
     * The friendly name of the protection. For example,
     * <code>My CloudFront distributions</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[ a-zA-Z0-9_\\.\\-]*<br/>
     */
    private String name;

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the AWS resource that is protected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws.*<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * The unique identifier (ID) for the Route 53 health check that's
     * associated with the protection.
     * </p>
     */
    private java.util.List<String> healthCheckIds;

    /**
     * <p>
     * The unique identifier (ID) of the protection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the protection.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the protection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     *
     * @param id <p>
     *            The unique identifier (ID) of the protection.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the protection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     *
     * @param id <p>
     *            The unique identifier (ID) of the protection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Protection withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The friendly name of the protection. For example,
     * <code>My CloudFront distributions</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[ a-zA-Z0-9_\\.\\-]*<br/>
     *
     * @return <p>
     *         The friendly name of the protection. For example,
     *         <code>My CloudFront distributions</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The friendly name of the protection. For example,
     * <code>My CloudFront distributions</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[ a-zA-Z0-9_\\.\\-]*<br/>
     *
     * @param name <p>
     *            The friendly name of the protection. For example,
     *            <code>My CloudFront distributions</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the protection. For example,
     * <code>My CloudFront distributions</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[ a-zA-Z0-9_\\.\\-]*<br/>
     *
     * @param name <p>
     *            The friendly name of the protection. For example,
     *            <code>My CloudFront distributions</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Protection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the AWS resource that is protected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws.*<br/>
     *
     * @return <p>
     *         The ARN (Amazon Resource Name) of the AWS resource that is
     *         protected.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the AWS resource that is protected.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws.*<br/>
     *
     * @param resourceArn <p>
     *            The ARN (Amazon Resource Name) of the AWS resource that is
     *            protected.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the AWS resource that is protected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws.*<br/>
     *
     * @param resourceArn <p>
     *            The ARN (Amazon Resource Name) of the AWS resource that is
     *            protected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Protection withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * The unique identifier (ID) for the Route 53 health check that's
     * associated with the protection.
     * </p>
     *
     * @return <p>
     *         The unique identifier (ID) for the Route 53 health check that's
     *         associated with the protection.
     *         </p>
     */
    public java.util.List<String> getHealthCheckIds() {
        return healthCheckIds;
    }

    /**
     * <p>
     * The unique identifier (ID) for the Route 53 health check that's
     * associated with the protection.
     * </p>
     *
     * @param healthCheckIds <p>
     *            The unique identifier (ID) for the Route 53 health check
     *            that's associated with the protection.
     *            </p>
     */
    public void setHealthCheckIds(java.util.Collection<String> healthCheckIds) {
        if (healthCheckIds == null) {
            this.healthCheckIds = null;
            return;
        }

        this.healthCheckIds = new java.util.ArrayList<String>(healthCheckIds);
    }

    /**
     * <p>
     * The unique identifier (ID) for the Route 53 health check that's
     * associated with the protection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheckIds <p>
     *            The unique identifier (ID) for the Route 53 health check
     *            that's associated with the protection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Protection withHealthCheckIds(String... healthCheckIds) {
        if (getHealthCheckIds() == null) {
            this.healthCheckIds = new java.util.ArrayList<String>(healthCheckIds.length);
        }
        for (String value : healthCheckIds) {
            this.healthCheckIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifier (ID) for the Route 53 health check that's
     * associated with the protection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthCheckIds <p>
     *            The unique identifier (ID) for the Route 53 health check
     *            that's associated with the protection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Protection withHealthCheckIds(java.util.Collection<String> healthCheckIds) {
        setHealthCheckIds(healthCheckIds);
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
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getHealthCheckIds() != null)
            sb.append("HealthCheckIds: " + getHealthCheckIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getHealthCheckIds() == null) ? 0 : getHealthCheckIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Protection == false)
            return false;
        Protection other = (Protection) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getHealthCheckIds() == null ^ this.getHealthCheckIds() == null)
            return false;
        if (other.getHealthCheckIds() != null
                && other.getHealthCheckIds().equals(this.getHealthCheckIds()) == false)
            return false;
        return true;
    }
}
