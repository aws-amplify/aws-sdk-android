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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * Defines a property predicate.
 * </p>
 */
public class PropertyPredicate implements Serializable {
    /**
     * <p>
     * The key of the property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String key;

    /**
     * <p>
     * The value of the property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String value;

    /**
     * <p>
     * The comparator used to compare this property to others.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, GREATER_THAN, LESS_THAN,
     * GREATER_THAN_EQUALS, LESS_THAN_EQUALS
     */
    private String comparator;

    /**
     * <p>
     * The key of the property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The key of the property.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The key of the property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param key <p>
     *            The key of the property.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param key <p>
     *            The key of the property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PropertyPredicate withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The value of the property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The value of the property.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of the property.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param value <p>
     *            The value of the property.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the property.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param value <p>
     *            The value of the property.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PropertyPredicate withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The comparator used to compare this property to others.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, GREATER_THAN, LESS_THAN,
     * GREATER_THAN_EQUALS, LESS_THAN_EQUALS
     *
     * @return <p>
     *         The comparator used to compare this property to others.
     *         </p>
     * @see Comparator
     */
    public String getComparator() {
        return comparator;
    }

    /**
     * <p>
     * The comparator used to compare this property to others.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, GREATER_THAN, LESS_THAN,
     * GREATER_THAN_EQUALS, LESS_THAN_EQUALS
     *
     * @param comparator <p>
     *            The comparator used to compare this property to others.
     *            </p>
     * @see Comparator
     */
    public void setComparator(String comparator) {
        this.comparator = comparator;
    }

    /**
     * <p>
     * The comparator used to compare this property to others.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, GREATER_THAN, LESS_THAN,
     * GREATER_THAN_EQUALS, LESS_THAN_EQUALS
     *
     * @param comparator <p>
     *            The comparator used to compare this property to others.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Comparator
     */
    public PropertyPredicate withComparator(String comparator) {
        this.comparator = comparator;
        return this;
    }

    /**
     * <p>
     * The comparator used to compare this property to others.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, GREATER_THAN, LESS_THAN,
     * GREATER_THAN_EQUALS, LESS_THAN_EQUALS
     *
     * @param comparator <p>
     *            The comparator used to compare this property to others.
     *            </p>
     * @see Comparator
     */
    public void setComparator(Comparator comparator) {
        this.comparator = comparator.toString();
    }

    /**
     * <p>
     * The comparator used to compare this property to others.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, GREATER_THAN, LESS_THAN,
     * GREATER_THAN_EQUALS, LESS_THAN_EQUALS
     *
     * @param comparator <p>
     *            The comparator used to compare this property to others.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Comparator
     */
    public PropertyPredicate withComparator(Comparator comparator) {
        this.comparator = comparator.toString();
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getComparator() != null)
            sb.append("Comparator: " + getComparator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getComparator() == null) ? 0 : getComparator().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PropertyPredicate == false)
            return false;
        PropertyPredicate other = (PropertyPredicate) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getComparator() == null ^ this.getComparator() == null)
            return false;
        if (other.getComparator() != null
                && other.getComparator().equals(this.getComparator()) == false)
            return false;
        return true;
    }
}
