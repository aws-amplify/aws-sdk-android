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
 * Information about the organization node.
 * </p>
 */
public class OrganizationNode implements Serializable {
    /**
     * <p>
     * The organization node type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT
     */
    private String type;

    /**
     * <p>
     * The identifier of the organization node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^[0-9]{12}$)|(^arn:aws:organizations::\d{12}:organization
     * \/o-[a-z0-9]
     * {10,32})|(^o-[a-z0-9]{10,32}$)|(^arn:aws:organizations::\d{12}
     * :ou\/o-[a-z0
     * -9]{10,32}\/ou-[0-9a-z]{4,32}-[0-9a-z]{8,32}$)|(^ou-[0-9a-z]{4
     * ,32}-[a-z0-9]{8,32}$)<br/>
     */
    private String value;

    /**
     * <p>
     * The organization node type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT
     *
     * @return <p>
     *         The organization node type.
     *         </p>
     * @see OrganizationNodeType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The organization node type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT
     *
     * @param type <p>
     *            The organization node type.
     *            </p>
     * @see OrganizationNodeType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The organization node type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT
     *
     * @param type <p>
     *            The organization node type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrganizationNodeType
     */
    public OrganizationNode withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The organization node type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT
     *
     * @param type <p>
     *            The organization node type.
     *            </p>
     * @see OrganizationNodeType
     */
    public void setType(OrganizationNodeType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The organization node type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORGANIZATION, ORGANIZATIONAL_UNIT, ACCOUNT
     *
     * @param type <p>
     *            The organization node type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrganizationNodeType
     */
    public OrganizationNode withType(OrganizationNodeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the organization node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^[0-9]{12}$)|(^arn:aws:organizations::\d{12}:organization
     * \/o-[a-z0-9]
     * {10,32})|(^o-[a-z0-9]{10,32}$)|(^arn:aws:organizations::\d{12}
     * :ou\/o-[a-z0
     * -9]{10,32}\/ou-[0-9a-z]{4,32}-[0-9a-z]{8,32}$)|(^ou-[0-9a-z]{4
     * ,32}-[a-z0-9]{8,32}$)<br/>
     *
     * @return <p>
     *         The identifier of the organization node.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The identifier of the organization node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^[0-9]{12}$)|(^arn:aws:organizations::\d{12}:organization
     * \/o-[a-z0-9]
     * {10,32})|(^o-[a-z0-9]{10,32}$)|(^arn:aws:organizations::\d{12}
     * :ou\/o-[a-z0
     * -9]{10,32}\/ou-[0-9a-z]{4,32}-[0-9a-z]{8,32}$)|(^ou-[0-9a-z]{4
     * ,32}-[a-z0-9]{8,32}$)<br/>
     *
     * @param value <p>
     *            The identifier of the organization node.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The identifier of the organization node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^[0-9]{12}$)|(^arn:aws:organizations::\d{12}:organization
     * \/o-[a-z0-9]
     * {10,32})|(^o-[a-z0-9]{10,32}$)|(^arn:aws:organizations::\d{12}
     * :ou\/o-[a-z0
     * -9]{10,32}\/ou-[0-9a-z]{4,32}-[0-9a-z]{8,32}$)|(^ou-[0-9a-z]{4
     * ,32}-[a-z0-9]{8,32}$)<br/>
     *
     * @param value <p>
     *            The identifier of the organization node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationNode withValue(String value) {
        this.value = value;
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
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationNode == false)
            return false;
        OrganizationNode other = (OrganizationNode) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
