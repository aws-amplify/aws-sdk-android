/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about proficiency of a user.
 * </p>
 */
public class UserProficiency implements Serializable {
    /**
     * <p>
     * The name of user's proficiency. You must use name of predefined attribute
     * present in the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String attributeName;

    /**
     * <p>
     * The value of user's proficiency. You must use value of predefined
     * attribute present in the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String attributeValue;

    /**
     * <p>
     * The level of the proficiency. The valid values are 1, 2, 3, 4 and 5.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1.0 - 5.0<br/>
     */
    private Float level;

    /**
     * <p>
     * The name of user's proficiency. You must use name of predefined attribute
     * present in the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The name of user's proficiency. You must use name of predefined
     *         attribute present in the Amazon Connect instance.
     *         </p>
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <p>
     * The name of user's proficiency. You must use name of predefined attribute
     * present in the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param attributeName <p>
     *            The name of user's proficiency. You must use name of
     *            predefined attribute present in the Amazon Connect instance.
     *            </p>
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of user's proficiency. You must use name of predefined attribute
     * present in the Amazon Connect instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param attributeName <p>
     *            The name of user's proficiency. You must use name of
     *            predefined attribute present in the Amazon Connect instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserProficiency withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * <p>
     * The value of user's proficiency. You must use value of predefined
     * attribute present in the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The value of user's proficiency. You must use value of predefined
     *         attribute present in the Amazon Connect instance.
     *         </p>
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * <p>
     * The value of user's proficiency. You must use value of predefined
     * attribute present in the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param attributeValue <p>
     *            The value of user's proficiency. You must use value of
     *            predefined attribute present in the Amazon Connect instance.
     *            </p>
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The value of user's proficiency. You must use value of predefined
     * attribute present in the Amazon Connect instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param attributeValue <p>
     *            The value of user's proficiency. You must use value of
     *            predefined attribute present in the Amazon Connect instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserProficiency withAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
        return this;
    }

    /**
     * <p>
     * The level of the proficiency. The valid values are 1, 2, 3, 4 and 5.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1.0 - 5.0<br/>
     *
     * @return <p>
     *         The level of the proficiency. The valid values are 1, 2, 3, 4 and
     *         5.
     *         </p>
     */
    public Float getLevel() {
        return level;
    }

    /**
     * <p>
     * The level of the proficiency. The valid values are 1, 2, 3, 4 and 5.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1.0 - 5.0<br/>
     *
     * @param level <p>
     *            The level of the proficiency. The valid values are 1, 2, 3, 4
     *            and 5.
     *            </p>
     */
    public void setLevel(Float level) {
        this.level = level;
    }

    /**
     * <p>
     * The level of the proficiency. The valid values are 1, 2, 3, 4 and 5.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1.0 - 5.0<br/>
     *
     * @param level <p>
     *            The level of the proficiency. The valid values are 1, 2, 3, 4
     *            and 5.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserProficiency withLevel(Float level) {
        this.level = level;
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
        if (getAttributeName() != null)
            sb.append("AttributeName: " + getAttributeName() + ",");
        if (getAttributeValue() != null)
            sb.append("AttributeValue: " + getAttributeValue() + ",");
        if (getLevel() != null)
            sb.append("Level: " + getLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserProficiency == false)
            return false;
        UserProficiency other = (UserProficiency) obj;

        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null)
            return false;
        if (other.getAttributeValue() != null
                && other.getAttributeValue().equals(this.getAttributeValue()) == false)
            return false;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        return true;
    }
}
