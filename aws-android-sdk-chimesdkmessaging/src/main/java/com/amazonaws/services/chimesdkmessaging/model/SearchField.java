/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

/**
 * <p>
 * A <code>Field</code> of the channel that you want to search.
 * </p>
 */
public class SearchField implements Serializable {
    /**
     * <p>
     * An <code>enum</code> value that indicates the key to search the channel
     * on. <code>MEMBERS</code> allows you to search channels based on
     * memberships. You can use it with the <code>EQUALS</code> operator to get
     * channels whose memberships are equal to the specified values, and with
     * the <code>INCLUDES</code> operator to get channels whose memberships
     * include the specified values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEMBERS
     */
    private String key;

    /**
     * <p>
     * The values that you want to search for, a list of strings. The values
     * must be <code>AppInstanceUserArns</code> specified as a list of strings.
     * </p>
     * <note>
     * <p>
     * This operation isn't supported for <code>AppInstanceUsers</code> with
     * large number of memberships.
     * </p>
     * </note>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The operator used to compare field values, currently <code>EQUALS</code>
     * or <code>INCLUDES</code>. Use the <code>EQUALS</code> operator to find
     * channels whose memberships equal the specified values. Use the
     * <code>INCLUDES</code> operator to find channels whose memberships include
     * the specified values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, INCLUDES
     */
    private String operator;

    /**
     * <p>
     * An <code>enum</code> value that indicates the key to search the channel
     * on. <code>MEMBERS</code> allows you to search channels based on
     * memberships. You can use it with the <code>EQUALS</code> operator to get
     * channels whose memberships are equal to the specified values, and with
     * the <code>INCLUDES</code> operator to get channels whose memberships
     * include the specified values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEMBERS
     *
     * @return <p>
     *         An <code>enum</code> value that indicates the key to search the
     *         channel on. <code>MEMBERS</code> allows you to search channels
     *         based on memberships. You can use it with the <code>EQUALS</code>
     *         operator to get channels whose memberships are equal to the
     *         specified values, and with the <code>INCLUDES</code> operator to
     *         get channels whose memberships include the specified values.
     *         </p>
     * @see SearchFieldKey
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * An <code>enum</code> value that indicates the key to search the channel
     * on. <code>MEMBERS</code> allows you to search channels based on
     * memberships. You can use it with the <code>EQUALS</code> operator to get
     * channels whose memberships are equal to the specified values, and with
     * the <code>INCLUDES</code> operator to get channels whose memberships
     * include the specified values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEMBERS
     *
     * @param key <p>
     *            An <code>enum</code> value that indicates the key to search
     *            the channel on. <code>MEMBERS</code> allows you to search
     *            channels based on memberships. You can use it with the
     *            <code>EQUALS</code> operator to get channels whose memberships
     *            are equal to the specified values, and with the
     *            <code>INCLUDES</code> operator to get channels whose
     *            memberships include the specified values.
     *            </p>
     * @see SearchFieldKey
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * An <code>enum</code> value that indicates the key to search the channel
     * on. <code>MEMBERS</code> allows you to search channels based on
     * memberships. You can use it with the <code>EQUALS</code> operator to get
     * channels whose memberships are equal to the specified values, and with
     * the <code>INCLUDES</code> operator to get channels whose memberships
     * include the specified values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEMBERS
     *
     * @param key <p>
     *            An <code>enum</code> value that indicates the key to search
     *            the channel on. <code>MEMBERS</code> allows you to search
     *            channels based on memberships. You can use it with the
     *            <code>EQUALS</code> operator to get channels whose memberships
     *            are equal to the specified values, and with the
     *            <code>INCLUDES</code> operator to get channels whose
     *            memberships include the specified values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SearchFieldKey
     */
    public SearchField withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * An <code>enum</code> value that indicates the key to search the channel
     * on. <code>MEMBERS</code> allows you to search channels based on
     * memberships. You can use it with the <code>EQUALS</code> operator to get
     * channels whose memberships are equal to the specified values, and with
     * the <code>INCLUDES</code> operator to get channels whose memberships
     * include the specified values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEMBERS
     *
     * @param key <p>
     *            An <code>enum</code> value that indicates the key to search
     *            the channel on. <code>MEMBERS</code> allows you to search
     *            channels based on memberships. You can use it with the
     *            <code>EQUALS</code> operator to get channels whose memberships
     *            are equal to the specified values, and with the
     *            <code>INCLUDES</code> operator to get channels whose
     *            memberships include the specified values.
     *            </p>
     * @see SearchFieldKey
     */
    public void setKey(SearchFieldKey key) {
        this.key = key.toString();
    }

    /**
     * <p>
     * An <code>enum</code> value that indicates the key to search the channel
     * on. <code>MEMBERS</code> allows you to search channels based on
     * memberships. You can use it with the <code>EQUALS</code> operator to get
     * channels whose memberships are equal to the specified values, and with
     * the <code>INCLUDES</code> operator to get channels whose memberships
     * include the specified values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MEMBERS
     *
     * @param key <p>
     *            An <code>enum</code> value that indicates the key to search
     *            the channel on. <code>MEMBERS</code> allows you to search
     *            channels based on memberships. You can use it with the
     *            <code>EQUALS</code> operator to get channels whose memberships
     *            are equal to the specified values, and with the
     *            <code>INCLUDES</code> operator to get channels whose
     *            memberships include the specified values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SearchFieldKey
     */
    public SearchField withKey(SearchFieldKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The values that you want to search for, a list of strings. The values
     * must be <code>AppInstanceUserArns</code> specified as a list of strings.
     * </p>
     * <note>
     * <p>
     * This operation isn't supported for <code>AppInstanceUsers</code> with
     * large number of memberships.
     * </p>
     * </note>
     *
     * @return <p>
     *         The values that you want to search for, a list of strings. The
     *         values must be <code>AppInstanceUserArns</code> specified as a
     *         list of strings.
     *         </p>
     *         <note>
     *         <p>
     *         This operation isn't supported for <code>AppInstanceUsers</code>
     *         with large number of memberships.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values that you want to search for, a list of strings. The values
     * must be <code>AppInstanceUserArns</code> specified as a list of strings.
     * </p>
     * <note>
     * <p>
     * This operation isn't supported for <code>AppInstanceUsers</code> with
     * large number of memberships.
     * </p>
     * </note>
     *
     * @param values <p>
     *            The values that you want to search for, a list of strings. The
     *            values must be <code>AppInstanceUserArns</code> specified as a
     *            list of strings.
     *            </p>
     *            <note>
     *            <p>
     *            This operation isn't supported for
     *            <code>AppInstanceUsers</code> with large number of
     *            memberships.
     *            </p>
     *            </note>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The values that you want to search for, a list of strings. The values
     * must be <code>AppInstanceUserArns</code> specified as a list of strings.
     * </p>
     * <note>
     * <p>
     * This operation isn't supported for <code>AppInstanceUsers</code> with
     * large number of memberships.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The values that you want to search for, a list of strings. The
     *            values must be <code>AppInstanceUserArns</code> specified as a
     *            list of strings.
     *            </p>
     *            <note>
     *            <p>
     *            This operation isn't supported for
     *            <code>AppInstanceUsers</code> with large number of
     *            memberships.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchField withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The values that you want to search for, a list of strings. The values
     * must be <code>AppInstanceUserArns</code> specified as a list of strings.
     * </p>
     * <note>
     * <p>
     * This operation isn't supported for <code>AppInstanceUsers</code> with
     * large number of memberships.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            The values that you want to search for, a list of strings. The
     *            values must be <code>AppInstanceUserArns</code> specified as a
     *            list of strings.
     *            </p>
     *            <note>
     *            <p>
     *            This operation isn't supported for
     *            <code>AppInstanceUsers</code> with large number of
     *            memberships.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchField withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The operator used to compare field values, currently <code>EQUALS</code>
     * or <code>INCLUDES</code>. Use the <code>EQUALS</code> operator to find
     * channels whose memberships equal the specified values. Use the
     * <code>INCLUDES</code> operator to find channels whose memberships include
     * the specified values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, INCLUDES
     *
     * @return <p>
     *         The operator used to compare field values, currently
     *         <code>EQUALS</code> or <code>INCLUDES</code>. Use the
     *         <code>EQUALS</code> operator to find channels whose memberships
     *         equal the specified values. Use the <code>INCLUDES</code>
     *         operator to find channels whose memberships include the specified
     *         values.
     *         </p>
     * @see SearchFieldOperator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * <p>
     * The operator used to compare field values, currently <code>EQUALS</code>
     * or <code>INCLUDES</code>. Use the <code>EQUALS</code> operator to find
     * channels whose memberships equal the specified values. Use the
     * <code>INCLUDES</code> operator to find channels whose memberships include
     * the specified values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, INCLUDES
     *
     * @param operator <p>
     *            The operator used to compare field values, currently
     *            <code>EQUALS</code> or <code>INCLUDES</code>. Use the
     *            <code>EQUALS</code> operator to find channels whose
     *            memberships equal the specified values. Use the
     *            <code>INCLUDES</code> operator to find channels whose
     *            memberships include the specified values.
     *            </p>
     * @see SearchFieldOperator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator used to compare field values, currently <code>EQUALS</code>
     * or <code>INCLUDES</code>. Use the <code>EQUALS</code> operator to find
     * channels whose memberships equal the specified values. Use the
     * <code>INCLUDES</code> operator to find channels whose memberships include
     * the specified values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, INCLUDES
     *
     * @param operator <p>
     *            The operator used to compare field values, currently
     *            <code>EQUALS</code> or <code>INCLUDES</code>. Use the
     *            <code>EQUALS</code> operator to find channels whose
     *            memberships equal the specified values. Use the
     *            <code>INCLUDES</code> operator to find channels whose
     *            memberships include the specified values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SearchFieldOperator
     */
    public SearchField withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * <p>
     * The operator used to compare field values, currently <code>EQUALS</code>
     * or <code>INCLUDES</code>. Use the <code>EQUALS</code> operator to find
     * channels whose memberships equal the specified values. Use the
     * <code>INCLUDES</code> operator to find channels whose memberships include
     * the specified values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, INCLUDES
     *
     * @param operator <p>
     *            The operator used to compare field values, currently
     *            <code>EQUALS</code> or <code>INCLUDES</code>. Use the
     *            <code>EQUALS</code> operator to find channels whose
     *            memberships equal the specified values. Use the
     *            <code>INCLUDES</code> operator to find channels whose
     *            memberships include the specified values.
     *            </p>
     * @see SearchFieldOperator
     */
    public void setOperator(SearchFieldOperator operator) {
        this.operator = operator.toString();
    }

    /**
     * <p>
     * The operator used to compare field values, currently <code>EQUALS</code>
     * or <code>INCLUDES</code>. Use the <code>EQUALS</code> operator to find
     * channels whose memberships equal the specified values. Use the
     * <code>INCLUDES</code> operator to find channels whose memberships include
     * the specified values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQUALS, INCLUDES
     *
     * @param operator <p>
     *            The operator used to compare field values, currently
     *            <code>EQUALS</code> or <code>INCLUDES</code>. Use the
     *            <code>EQUALS</code> operator to find channels whose
     *            memberships equal the specified values. Use the
     *            <code>INCLUDES</code> operator to find channels whose
     *            memberships include the specified values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SearchFieldOperator
     */
    public SearchField withOperator(SearchFieldOperator operator) {
        this.operator = operator.toString();
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
        if (getValues() != null)
            sb.append("Values: " + getValues() + ",");
        if (getOperator() != null)
            sb.append("Operator: " + getOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchField == false)
            return false;
        SearchField other = (SearchField) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }
}
