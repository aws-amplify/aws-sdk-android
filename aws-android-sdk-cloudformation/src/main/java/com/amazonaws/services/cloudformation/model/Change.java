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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>Change</code> structure describes the changes AWS CloudFormation
 * will perform if you execute the change set.
 * </p>
 */
public class Change implements Serializable {
    /**
     * <p>
     * The type of entity that AWS CloudFormation changes. Currently, the only
     * entity type is <code>Resource</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Resource
     */
    private String type;

    /**
     * <p>
     * A <code>ResourceChange</code> structure that describes the resource and
     * action that AWS CloudFormation will perform.
     * </p>
     */
    private ResourceChange resourceChange;

    /**
     * <p>
     * The type of entity that AWS CloudFormation changes. Currently, the only
     * entity type is <code>Resource</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Resource
     *
     * @return <p>
     *         The type of entity that AWS CloudFormation changes. Currently,
     *         the only entity type is <code>Resource</code>.
     *         </p>
     * @see ChangeType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of entity that AWS CloudFormation changes. Currently, the only
     * entity type is <code>Resource</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Resource
     *
     * @param type <p>
     *            The type of entity that AWS CloudFormation changes. Currently,
     *            the only entity type is <code>Resource</code>.
     *            </p>
     * @see ChangeType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of entity that AWS CloudFormation changes. Currently, the only
     * entity type is <code>Resource</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Resource
     *
     * @param type <p>
     *            The type of entity that AWS CloudFormation changes. Currently,
     *            the only entity type is <code>Resource</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeType
     */
    public Change withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of entity that AWS CloudFormation changes. Currently, the only
     * entity type is <code>Resource</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Resource
     *
     * @param type <p>
     *            The type of entity that AWS CloudFormation changes. Currently,
     *            the only entity type is <code>Resource</code>.
     *            </p>
     * @see ChangeType
     */
    public void setType(ChangeType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of entity that AWS CloudFormation changes. Currently, the only
     * entity type is <code>Resource</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Resource
     *
     * @param type <p>
     *            The type of entity that AWS CloudFormation changes. Currently,
     *            the only entity type is <code>Resource</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeType
     */
    public Change withType(ChangeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A <code>ResourceChange</code> structure that describes the resource and
     * action that AWS CloudFormation will perform.
     * </p>
     *
     * @return <p>
     *         A <code>ResourceChange</code> structure that describes the
     *         resource and action that AWS CloudFormation will perform.
     *         </p>
     */
    public ResourceChange getResourceChange() {
        return resourceChange;
    }

    /**
     * <p>
     * A <code>ResourceChange</code> structure that describes the resource and
     * action that AWS CloudFormation will perform.
     * </p>
     *
     * @param resourceChange <p>
     *            A <code>ResourceChange</code> structure that describes the
     *            resource and action that AWS CloudFormation will perform.
     *            </p>
     */
    public void setResourceChange(ResourceChange resourceChange) {
        this.resourceChange = resourceChange;
    }

    /**
     * <p>
     * A <code>ResourceChange</code> structure that describes the resource and
     * action that AWS CloudFormation will perform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceChange <p>
     *            A <code>ResourceChange</code> structure that describes the
     *            resource and action that AWS CloudFormation will perform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Change withResourceChange(ResourceChange resourceChange) {
        this.resourceChange = resourceChange;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getResourceChange() != null)
            sb.append("ResourceChange: " + getResourceChange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getResourceChange() == null) ? 0 : getResourceChange().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Change == false)
            return false;
        Change other = (Change) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getResourceChange() == null ^ this.getResourceChange() == null)
            return false;
        if (other.getResourceChange() != null
                && other.getResourceChange().equals(this.getResourceChange()) == false)
            return false;
        return true;
    }
}
