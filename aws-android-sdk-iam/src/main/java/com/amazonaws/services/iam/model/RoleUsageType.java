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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * An object that contains details about how a service-linked role is used, if
 * that information is returned by the service.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <a>GetServiceLinkedRoleDeletionStatus</a> operation.
 * </p>
 */
public class RoleUsageType implements Serializable {
    /**
     * <p>
     * The name of the Region where the service-linked role is being used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String region;

    /**
     * <p>
     * The name of the resource that is using the service-linked role.
     * </p>
     */
    private java.util.List<String> resources;

    /**
     * <p>
     * The name of the Region where the service-linked role is being used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the Region where the service-linked role is being
     *         used.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The name of the Region where the service-linked role is being used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param region <p>
     *            The name of the Region where the service-linked role is being
     *            used.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The name of the Region where the service-linked role is being used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param region <p>
     *            The name of the Region where the service-linked role is being
     *            used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoleUsageType withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The name of the resource that is using the service-linked role.
     * </p>
     *
     * @return <p>
     *         The name of the resource that is using the service-linked role.
     *         </p>
     */
    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * The name of the resource that is using the service-linked role.
     * </p>
     *
     * @param resources <p>
     *            The name of the resource that is using the service-linked
     *            role.
     *            </p>
     */
    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * The name of the resource that is using the service-linked role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            The name of the resource that is using the service-linked
     *            role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoleUsageType withResources(String... resources) {
        if (getResources() == null) {
            this.resources = new java.util.ArrayList<String>(resources.length);
        }
        for (String value : resources) {
            this.resources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The name of the resource that is using the service-linked role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            The name of the resource that is using the service-linked
     *            role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoleUsageType withResources(java.util.Collection<String> resources) {
        setResources(resources);
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
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoleUsageType == false)
            return false;
        RoleUsageType other = (RoleUsageType) obj;

        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null
                && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }
}
