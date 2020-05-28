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

package com.amazonaws.services.workmail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new Amazon WorkMail resource.
 * </p>
 */
public class CreateResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier associated with the organization for which the resource is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     */
    private String organizationId;

    /**
     * <p>
     * The name of the new resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[\w\-.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z0-9]{2,})?<br/>
     */
    private String name;

    /**
     * <p>
     * The type of the new resource. The available types are
     * <code>equipment</code> and <code>room</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOM, EQUIPMENT
     */
    private String type;

    /**
     * <p>
     * The identifier associated with the organization for which the resource is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @return <p>
     *         The identifier associated with the organization for which the
     *         resource is created.
     *         </p>
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * <p>
     * The identifier associated with the organization for which the resource is
     * created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier associated with the organization for which the
     *            resource is created.
     *            </p>
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier associated with the organization for which the resource is
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier associated with the organization for which the
     *            resource is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceRequest withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * <p>
     * The name of the new resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[\w\-.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z0-9]{2,})?<br/>
     *
     * @return <p>
     *         The name of the new resource.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the new resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[\w\-.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z0-9]{2,})?<br/>
     *
     * @param name <p>
     *            The name of the new resource.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[\w\-.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z0-9]{2,})?<br/>
     *
     * @param name <p>
     *            The name of the new resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of the new resource. The available types are
     * <code>equipment</code> and <code>room</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOM, EQUIPMENT
     *
     * @return <p>
     *         The type of the new resource. The available types are
     *         <code>equipment</code> and <code>room</code>.
     *         </p>
     * @see ResourceType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the new resource. The available types are
     * <code>equipment</code> and <code>room</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOM, EQUIPMENT
     *
     * @param type <p>
     *            The type of the new resource. The available types are
     *            <code>equipment</code> and <code>room</code>.
     *            </p>
     * @see ResourceType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the new resource. The available types are
     * <code>equipment</code> and <code>room</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOM, EQUIPMENT
     *
     * @param type <p>
     *            The type of the new resource. The available types are
     *            <code>equipment</code> and <code>room</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public CreateResourceRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of the new resource. The available types are
     * <code>equipment</code> and <code>room</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOM, EQUIPMENT
     *
     * @param type <p>
     *            The type of the new resource. The available types are
     *            <code>equipment</code> and <code>room</code>.
     *            </p>
     * @see ResourceType
     */
    public void setType(ResourceType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the new resource. The available types are
     * <code>equipment</code> and <code>room</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROOM, EQUIPMENT
     *
     * @param type <p>
     *            The type of the new resource. The available types are
     *            <code>equipment</code> and <code>room</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceType
     */
    public CreateResourceRequest withType(ResourceType type) {
        this.type = type.toString();
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: " + getOrganizationId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResourceRequest == false)
            return false;
        CreateResourceRequest other = (CreateResourceRequest) obj;

        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null
                && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
