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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * Detailed information about the self-service action.
 * </p>
 */
public class ServiceActionSummary implements Serializable {
    /**
     * <p>
     * The self-service action identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String id;

    /**
     * <p>
     * The self-service action name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]*<br/>
     */
    private String name;

    /**
     * <p>
     * The self-service action description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The self-service action definition type. For example,
     * <code>SSM_AUTOMATION</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSM_AUTOMATION
     */
    private String definitionType;

    /**
     * <p>
     * The self-service action identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The self-service action identifier.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The self-service action identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param id <p>
     *            The self-service action identifier.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The self-service action identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param id <p>
     *            The self-service action identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceActionSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The self-service action name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]*<br/>
     *
     * @return <p>
     *         The self-service action name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The self-service action name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]*<br/>
     *
     * @param name <p>
     *            The self-service action name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The self-service action name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]*<br/>
     *
     * @param name <p>
     *            The self-service action name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceActionSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The self-service action description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The self-service action description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The self-service action description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param description <p>
     *            The self-service action description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The self-service action description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param description <p>
     *            The self-service action description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceActionSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The self-service action definition type. For example,
     * <code>SSM_AUTOMATION</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSM_AUTOMATION
     *
     * @return <p>
     *         The self-service action definition type. For example,
     *         <code>SSM_AUTOMATION</code>.
     *         </p>
     * @see ServiceActionDefinitionType
     */
    public String getDefinitionType() {
        return definitionType;
    }

    /**
     * <p>
     * The self-service action definition type. For example,
     * <code>SSM_AUTOMATION</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSM_AUTOMATION
     *
     * @param definitionType <p>
     *            The self-service action definition type. For example,
     *            <code>SSM_AUTOMATION</code>.
     *            </p>
     * @see ServiceActionDefinitionType
     */
    public void setDefinitionType(String definitionType) {
        this.definitionType = definitionType;
    }

    /**
     * <p>
     * The self-service action definition type. For example,
     * <code>SSM_AUTOMATION</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSM_AUTOMATION
     *
     * @param definitionType <p>
     *            The self-service action definition type. For example,
     *            <code>SSM_AUTOMATION</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceActionDefinitionType
     */
    public ServiceActionSummary withDefinitionType(String definitionType) {
        this.definitionType = definitionType;
        return this;
    }

    /**
     * <p>
     * The self-service action definition type. For example,
     * <code>SSM_AUTOMATION</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSM_AUTOMATION
     *
     * @param definitionType <p>
     *            The self-service action definition type. For example,
     *            <code>SSM_AUTOMATION</code>.
     *            </p>
     * @see ServiceActionDefinitionType
     */
    public void setDefinitionType(ServiceActionDefinitionType definitionType) {
        this.definitionType = definitionType.toString();
    }

    /**
     * <p>
     * The self-service action definition type. For example,
     * <code>SSM_AUTOMATION</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSM_AUTOMATION
     *
     * @param definitionType <p>
     *            The self-service action definition type. For example,
     *            <code>SSM_AUTOMATION</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceActionDefinitionType
     */
    public ServiceActionSummary withDefinitionType(ServiceActionDefinitionType definitionType) {
        this.definitionType = definitionType.toString();
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDefinitionType() != null)
            sb.append("DefinitionType: " + getDefinitionType());
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
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDefinitionType() == null) ? 0 : getDefinitionType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceActionSummary == false)
            return false;
        ServiceActionSummary other = (ServiceActionSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefinitionType() == null ^ this.getDefinitionType() == null)
            return false;
        if (other.getDefinitionType() != null
                && other.getDefinitionType().equals(this.getDefinitionType()) == false)
            return false;
        return true;
    }
}
