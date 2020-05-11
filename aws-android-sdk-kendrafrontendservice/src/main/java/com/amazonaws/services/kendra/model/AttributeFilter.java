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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Provides filtering the query results based on document attributes.
 * </p>
 * <p>
 * When you use the <code>AndAllFilters</code> or <code>OrAllFilters</code>,
 * filters you can use 2 layers under the first attribute filter. For example,
 * you can use:
 * </p>
 * <p>
 * <code>&lt;AndAllFilters&gt;</code>
 * </p>
 * <ol>
 * <li>
 * <p>
 * <code> &lt;OrAllFilters&gt;</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> &lt;EqualTo&gt;</code>
 * </p>
 * </li>
 * </ol>
 * <p>
 * If you use more than 2 layers, you receive a <code>ValidationException</code>
 * exception with the message "<code>AttributeFilter</code> cannot have a depth
 * of more than 2."
 * </p>
 */
public class AttributeFilter implements Serializable {
    /**
     * <p>
     * Performs a logical <code>AND</code> operation on all supplied filters.
     * </p>
     */
    private java.util.List<AttributeFilter> andAllFilters;

    /**
     * <p>
     * Performs a logical <code>OR</code> operation on all supplied filters.
     * </p>
     */
    private java.util.List<AttributeFilter> orAllFilters;

    /**
     * <p>
     * Performs a logical <code>NOT</code> operation on all supplied filters.
     * </p>
     */
    private AttributeFilter notFilter;

    /**
     * <p>
     * Performs an equals operation on two document attributes.
     * </p>
     */
    private DocumentAttribute equalsTo;

    /**
     * <p>
     * Returns true when a document contains all of the specified document
     * attributes. This filter is only appicable to <code>StringListValue</code>
     * metadata.
     * </p>
     */
    private DocumentAttribute containsAll;

    /**
     * <p>
     * Returns true when a document contains any of the specified document
     * attributes.This filter is only appicable to <code>StringListValue</code>
     * metadata.
     * </p>
     */
    private DocumentAttribute containsAny;

    /**
     * <p>
     * Performs a greater than operation on two document attributes. Use with a
     * document attribute of type <code>Integer</code> or <code>Long</code>.
     * </p>
     */
    private DocumentAttribute greaterThan;

    /**
     * <p>
     * Performs a greater or equals than operation on two document attributes.
     * Use with a document attribute of type <code>Integer</code> or
     * <code>Long</code>.
     * </p>
     */
    private DocumentAttribute greaterThanOrEquals;

    /**
     * <p>
     * Performs a less than operation on two document attributes. Use with a
     * document attribute of type <code>Integer</code> or <code>Long</code>.
     * </p>
     */
    private DocumentAttribute lessThan;

    /**
     * <p>
     * Performs a less than or equals operation on two document attributes. Use
     * with a document attribute of type <code>Integer</code> or
     * <code>Long</code>.
     * </p>
     */
    private DocumentAttribute lessThanOrEquals;

    /**
     * <p>
     * Performs a logical <code>AND</code> operation on all supplied filters.
     * </p>
     *
     * @return <p>
     *         Performs a logical <code>AND</code> operation on all supplied
     *         filters.
     *         </p>
     */
    public java.util.List<AttributeFilter> getAndAllFilters() {
        return andAllFilters;
    }

    /**
     * <p>
     * Performs a logical <code>AND</code> operation on all supplied filters.
     * </p>
     *
     * @param andAllFilters <p>
     *            Performs a logical <code>AND</code> operation on all supplied
     *            filters.
     *            </p>
     */
    public void setAndAllFilters(java.util.Collection<AttributeFilter> andAllFilters) {
        if (andAllFilters == null) {
            this.andAllFilters = null;
            return;
        }

        this.andAllFilters = new java.util.ArrayList<AttributeFilter>(andAllFilters);
    }

    /**
     * <p>
     * Performs a logical <code>AND</code> operation on all supplied filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param andAllFilters <p>
     *            Performs a logical <code>AND</code> operation on all supplied
     *            filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeFilter withAndAllFilters(AttributeFilter... andAllFilters) {
        if (getAndAllFilters() == null) {
            this.andAllFilters = new java.util.ArrayList<AttributeFilter>(andAllFilters.length);
        }
        for (AttributeFilter value : andAllFilters) {
            this.andAllFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Performs a logical <code>AND</code> operation on all supplied filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param andAllFilters <p>
     *            Performs a logical <code>AND</code> operation on all supplied
     *            filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeFilter withAndAllFilters(java.util.Collection<AttributeFilter> andAllFilters) {
        setAndAllFilters(andAllFilters);
        return this;
    }

    /**
     * <p>
     * Performs a logical <code>OR</code> operation on all supplied filters.
     * </p>
     *
     * @return <p>
     *         Performs a logical <code>OR</code> operation on all supplied
     *         filters.
     *         </p>
     */
    public java.util.List<AttributeFilter> getOrAllFilters() {
        return orAllFilters;
    }

    /**
     * <p>
     * Performs a logical <code>OR</code> operation on all supplied filters.
     * </p>
     *
     * @param orAllFilters <p>
     *            Performs a logical <code>OR</code> operation on all supplied
     *            filters.
     *            </p>
     */
    public void setOrAllFilters(java.util.Collection<AttributeFilter> orAllFilters) {
        if (orAllFilters == null) {
            this.orAllFilters = null;
            return;
        }

        this.orAllFilters = new java.util.ArrayList<AttributeFilter>(orAllFilters);
    }

    /**
     * <p>
     * Performs a logical <code>OR</code> operation on all supplied filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param orAllFilters <p>
     *            Performs a logical <code>OR</code> operation on all supplied
     *            filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeFilter withOrAllFilters(AttributeFilter... orAllFilters) {
        if (getOrAllFilters() == null) {
            this.orAllFilters = new java.util.ArrayList<AttributeFilter>(orAllFilters.length);
        }
        for (AttributeFilter value : orAllFilters) {
            this.orAllFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Performs a logical <code>OR</code> operation on all supplied filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param orAllFilters <p>
     *            Performs a logical <code>OR</code> operation on all supplied
     *            filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeFilter withOrAllFilters(java.util.Collection<AttributeFilter> orAllFilters) {
        setOrAllFilters(orAllFilters);
        return this;
    }

    /**
     * <p>
     * Performs a logical <code>NOT</code> operation on all supplied filters.
     * </p>
     *
     * @return <p>
     *         Performs a logical <code>NOT</code> operation on all supplied
     *         filters.
     *         </p>
     */
    public AttributeFilter getNotFilter() {
        return notFilter;
    }

    /**
     * <p>
     * Performs a logical <code>NOT</code> operation on all supplied filters.
     * </p>
     *
     * @param notFilter <p>
     *            Performs a logical <code>NOT</code> operation on all supplied
     *            filters.
     *            </p>
     */
    public void setNotFilter(AttributeFilter notFilter) {
        this.notFilter = notFilter;
    }

    /**
     * <p>
     * Performs a logical <code>NOT</code> operation on all supplied filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notFilter <p>
     *            Performs a logical <code>NOT</code> operation on all supplied
     *            filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeFilter withNotFilter(AttributeFilter notFilter) {
        this.notFilter = notFilter;
        return this;
    }

    /**
     * <p>
     * Performs an equals operation on two document attributes.
     * </p>
     *
     * @return <p>
     *         Performs an equals operation on two document attributes.
     *         </p>
     */
    public DocumentAttribute getEqualsTo() {
        return equalsTo;
    }

    /**
     * <p>
     * Performs an equals operation on two document attributes.
     * </p>
     *
     * @param equalsTo <p>
     *            Performs an equals operation on two document attributes.
     *            </p>
     */
    public void setEqualsTo(DocumentAttribute equalsTo) {
        this.equalsTo = equalsTo;
    }

    /**
     * <p>
     * Performs an equals operation on two document attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param equalsTo <p>
     *            Performs an equals operation on two document attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeFilter withEqualsTo(DocumentAttribute equalsTo) {
        this.equalsTo = equalsTo;
        return this;
    }

    /**
     * <p>
     * Returns true when a document contains all of the specified document
     * attributes. This filter is only appicable to <code>StringListValue</code>
     * metadata.
     * </p>
     *
     * @return <p>
     *         Returns true when a document contains all of the specified
     *         document attributes. This filter is only appicable to
     *         <code>StringListValue</code> metadata.
     *         </p>
     */
    public DocumentAttribute getContainsAll() {
        return containsAll;
    }

    /**
     * <p>
     * Returns true when a document contains all of the specified document
     * attributes. This filter is only appicable to <code>StringListValue</code>
     * metadata.
     * </p>
     *
     * @param containsAll <p>
     *            Returns true when a document contains all of the specified
     *            document attributes. This filter is only appicable to
     *            <code>StringListValue</code> metadata.
     *            </p>
     */
    public void setContainsAll(DocumentAttribute containsAll) {
        this.containsAll = containsAll;
    }

    /**
     * <p>
     * Returns true when a document contains all of the specified document
     * attributes. This filter is only appicable to <code>StringListValue</code>
     * metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containsAll <p>
     *            Returns true when a document contains all of the specified
     *            document attributes. This filter is only appicable to
     *            <code>StringListValue</code> metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeFilter withContainsAll(DocumentAttribute containsAll) {
        this.containsAll = containsAll;
        return this;
    }

    /**
     * <p>
     * Returns true when a document contains any of the specified document
     * attributes.This filter is only appicable to <code>StringListValue</code>
     * metadata.
     * </p>
     *
     * @return <p>
     *         Returns true when a document contains any of the specified
     *         document attributes.This filter is only appicable to
     *         <code>StringListValue</code> metadata.
     *         </p>
     */
    public DocumentAttribute getContainsAny() {
        return containsAny;
    }

    /**
     * <p>
     * Returns true when a document contains any of the specified document
     * attributes.This filter is only appicable to <code>StringListValue</code>
     * metadata.
     * </p>
     *
     * @param containsAny <p>
     *            Returns true when a document contains any of the specified
     *            document attributes.This filter is only appicable to
     *            <code>StringListValue</code> metadata.
     *            </p>
     */
    public void setContainsAny(DocumentAttribute containsAny) {
        this.containsAny = containsAny;
    }

    /**
     * <p>
     * Returns true when a document contains any of the specified document
     * attributes.This filter is only appicable to <code>StringListValue</code>
     * metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containsAny <p>
     *            Returns true when a document contains any of the specified
     *            document attributes.This filter is only appicable to
     *            <code>StringListValue</code> metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeFilter withContainsAny(DocumentAttribute containsAny) {
        this.containsAny = containsAny;
        return this;
    }

    /**
     * <p>
     * Performs a greater than operation on two document attributes. Use with a
     * document attribute of type <code>Integer</code> or <code>Long</code>.
     * </p>
     *
     * @return <p>
     *         Performs a greater than operation on two document attributes. Use
     *         with a document attribute of type <code>Integer</code> or
     *         <code>Long</code>.
     *         </p>
     */
    public DocumentAttribute getGreaterThan() {
        return greaterThan;
    }

    /**
     * <p>
     * Performs a greater than operation on two document attributes. Use with a
     * document attribute of type <code>Integer</code> or <code>Long</code>.
     * </p>
     *
     * @param greaterThan <p>
     *            Performs a greater than operation on two document attributes.
     *            Use with a document attribute of type <code>Integer</code> or
     *            <code>Long</code>.
     *            </p>
     */
    public void setGreaterThan(DocumentAttribute greaterThan) {
        this.greaterThan = greaterThan;
    }

    /**
     * <p>
     * Performs a greater than operation on two document attributes. Use with a
     * document attribute of type <code>Integer</code> or <code>Long</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param greaterThan <p>
     *            Performs a greater than operation on two document attributes.
     *            Use with a document attribute of type <code>Integer</code> or
     *            <code>Long</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeFilter withGreaterThan(DocumentAttribute greaterThan) {
        this.greaterThan = greaterThan;
        return this;
    }

    /**
     * <p>
     * Performs a greater or equals than operation on two document attributes.
     * Use with a document attribute of type <code>Integer</code> or
     * <code>Long</code>.
     * </p>
     *
     * @return <p>
     *         Performs a greater or equals than operation on two document
     *         attributes. Use with a document attribute of type
     *         <code>Integer</code> or <code>Long</code>.
     *         </p>
     */
    public DocumentAttribute getGreaterThanOrEquals() {
        return greaterThanOrEquals;
    }

    /**
     * <p>
     * Performs a greater or equals than operation on two document attributes.
     * Use with a document attribute of type <code>Integer</code> or
     * <code>Long</code>.
     * </p>
     *
     * @param greaterThanOrEquals <p>
     *            Performs a greater or equals than operation on two document
     *            attributes. Use with a document attribute of type
     *            <code>Integer</code> or <code>Long</code>.
     *            </p>
     */
    public void setGreaterThanOrEquals(DocumentAttribute greaterThanOrEquals) {
        this.greaterThanOrEquals = greaterThanOrEquals;
    }

    /**
     * <p>
     * Performs a greater or equals than operation on two document attributes.
     * Use with a document attribute of type <code>Integer</code> or
     * <code>Long</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param greaterThanOrEquals <p>
     *            Performs a greater or equals than operation on two document
     *            attributes. Use with a document attribute of type
     *            <code>Integer</code> or <code>Long</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeFilter withGreaterThanOrEquals(DocumentAttribute greaterThanOrEquals) {
        this.greaterThanOrEquals = greaterThanOrEquals;
        return this;
    }

    /**
     * <p>
     * Performs a less than operation on two document attributes. Use with a
     * document attribute of type <code>Integer</code> or <code>Long</code>.
     * </p>
     *
     * @return <p>
     *         Performs a less than operation on two document attributes. Use
     *         with a document attribute of type <code>Integer</code> or
     *         <code>Long</code>.
     *         </p>
     */
    public DocumentAttribute getLessThan() {
        return lessThan;
    }

    /**
     * <p>
     * Performs a less than operation on two document attributes. Use with a
     * document attribute of type <code>Integer</code> or <code>Long</code>.
     * </p>
     *
     * @param lessThan <p>
     *            Performs a less than operation on two document attributes. Use
     *            with a document attribute of type <code>Integer</code> or
     *            <code>Long</code>.
     *            </p>
     */
    public void setLessThan(DocumentAttribute lessThan) {
        this.lessThan = lessThan;
    }

    /**
     * <p>
     * Performs a less than operation on two document attributes. Use with a
     * document attribute of type <code>Integer</code> or <code>Long</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lessThan <p>
     *            Performs a less than operation on two document attributes. Use
     *            with a document attribute of type <code>Integer</code> or
     *            <code>Long</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeFilter withLessThan(DocumentAttribute lessThan) {
        this.lessThan = lessThan;
        return this;
    }

    /**
     * <p>
     * Performs a less than or equals operation on two document attributes. Use
     * with a document attribute of type <code>Integer</code> or
     * <code>Long</code>.
     * </p>
     *
     * @return <p>
     *         Performs a less than or equals operation on two document
     *         attributes. Use with a document attribute of type
     *         <code>Integer</code> or <code>Long</code>.
     *         </p>
     */
    public DocumentAttribute getLessThanOrEquals() {
        return lessThanOrEquals;
    }

    /**
     * <p>
     * Performs a less than or equals operation on two document attributes. Use
     * with a document attribute of type <code>Integer</code> or
     * <code>Long</code>.
     * </p>
     *
     * @param lessThanOrEquals <p>
     *            Performs a less than or equals operation on two document
     *            attributes. Use with a document attribute of type
     *            <code>Integer</code> or <code>Long</code>.
     *            </p>
     */
    public void setLessThanOrEquals(DocumentAttribute lessThanOrEquals) {
        this.lessThanOrEquals = lessThanOrEquals;
    }

    /**
     * <p>
     * Performs a less than or equals operation on two document attributes. Use
     * with a document attribute of type <code>Integer</code> or
     * <code>Long</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lessThanOrEquals <p>
     *            Performs a less than or equals operation on two document
     *            attributes. Use with a document attribute of type
     *            <code>Integer</code> or <code>Long</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttributeFilter withLessThanOrEquals(DocumentAttribute lessThanOrEquals) {
        this.lessThanOrEquals = lessThanOrEquals;
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
        if (getAndAllFilters() != null)
            sb.append("AndAllFilters: " + getAndAllFilters() + ",");
        if (getOrAllFilters() != null)
            sb.append("OrAllFilters: " + getOrAllFilters() + ",");
        if (getNotFilter() != null)
            sb.append("NotFilter: " + getNotFilter() + ",");
        if (getEqualsTo() != null)
            sb.append("EqualsTo: " + getEqualsTo() + ",");
        if (getContainsAll() != null)
            sb.append("ContainsAll: " + getContainsAll() + ",");
        if (getContainsAny() != null)
            sb.append("ContainsAny: " + getContainsAny() + ",");
        if (getGreaterThan() != null)
            sb.append("GreaterThan: " + getGreaterThan() + ",");
        if (getGreaterThanOrEquals() != null)
            sb.append("GreaterThanOrEquals: " + getGreaterThanOrEquals() + ",");
        if (getLessThan() != null)
            sb.append("LessThan: " + getLessThan() + ",");
        if (getLessThanOrEquals() != null)
            sb.append("LessThanOrEquals: " + getLessThanOrEquals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAndAllFilters() == null) ? 0 : getAndAllFilters().hashCode());
        hashCode = prime * hashCode
                + ((getOrAllFilters() == null) ? 0 : getOrAllFilters().hashCode());
        hashCode = prime * hashCode + ((getNotFilter() == null) ? 0 : getNotFilter().hashCode());
        hashCode = prime * hashCode + ((getEqualsTo() == null) ? 0 : getEqualsTo().hashCode());
        hashCode = prime * hashCode
                + ((getContainsAll() == null) ? 0 : getContainsAll().hashCode());
        hashCode = prime * hashCode
                + ((getContainsAny() == null) ? 0 : getContainsAny().hashCode());
        hashCode = prime * hashCode
                + ((getGreaterThan() == null) ? 0 : getGreaterThan().hashCode());
        hashCode = prime * hashCode
                + ((getGreaterThanOrEquals() == null) ? 0 : getGreaterThanOrEquals().hashCode());
        hashCode = prime * hashCode + ((getLessThan() == null) ? 0 : getLessThan().hashCode());
        hashCode = prime * hashCode
                + ((getLessThanOrEquals() == null) ? 0 : getLessThanOrEquals().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeFilter == false)
            return false;
        AttributeFilter other = (AttributeFilter) obj;

        if (other.getAndAllFilters() == null ^ this.getAndAllFilters() == null)
            return false;
        if (other.getAndAllFilters() != null
                && other.getAndAllFilters().equals(this.getAndAllFilters()) == false)
            return false;
        if (other.getOrAllFilters() == null ^ this.getOrAllFilters() == null)
            return false;
        if (other.getOrAllFilters() != null
                && other.getOrAllFilters().equals(this.getOrAllFilters()) == false)
            return false;
        if (other.getNotFilter() == null ^ this.getNotFilter() == null)
            return false;
        if (other.getNotFilter() != null
                && other.getNotFilter().equals(this.getNotFilter()) == false)
            return false;
        if (other.getEqualsTo() == null ^ this.getEqualsTo() == null)
            return false;
        if (other.getEqualsTo() != null && other.getEqualsTo().equals(this.getEqualsTo()) == false)
            return false;
        if (other.getContainsAll() == null ^ this.getContainsAll() == null)
            return false;
        if (other.getContainsAll() != null
                && other.getContainsAll().equals(this.getContainsAll()) == false)
            return false;
        if (other.getContainsAny() == null ^ this.getContainsAny() == null)
            return false;
        if (other.getContainsAny() != null
                && other.getContainsAny().equals(this.getContainsAny()) == false)
            return false;
        if (other.getGreaterThan() == null ^ this.getGreaterThan() == null)
            return false;
        if (other.getGreaterThan() != null
                && other.getGreaterThan().equals(this.getGreaterThan()) == false)
            return false;
        if (other.getGreaterThanOrEquals() == null ^ this.getGreaterThanOrEquals() == null)
            return false;
        if (other.getGreaterThanOrEquals() != null
                && other.getGreaterThanOrEquals().equals(this.getGreaterThanOrEquals()) == false)
            return false;
        if (other.getLessThan() == null ^ this.getLessThan() == null)
            return false;
        if (other.getLessThan() != null && other.getLessThan().equals(this.getLessThan()) == false)
            return false;
        if (other.getLessThanOrEquals() == null ^ this.getLessThanOrEquals() == null)
            return false;
        if (other.getLessThanOrEquals() != null
                && other.getLessThanOrEquals().equals(this.getLessThanOrEquals()) == false)
            return false;
        return true;
    }
}
