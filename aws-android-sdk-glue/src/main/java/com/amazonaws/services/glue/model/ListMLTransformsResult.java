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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class ListMLTransformsResult implements Serializable {
    /**
     * <p>
     * The identifiers of all the machine learning transforms in the account, or
     * the machine learning transforms with the specified tags.
     * </p>
     */
    private java.util.List<String> transformIds;

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifiers of all the machine learning transforms in the account, or
     * the machine learning transforms with the specified tags.
     * </p>
     *
     * @return <p>
     *         The identifiers of all the machine learning transforms in the
     *         account, or the machine learning transforms with the specified
     *         tags.
     *         </p>
     */
    public java.util.List<String> getTransformIds() {
        return transformIds;
    }

    /**
     * <p>
     * The identifiers of all the machine learning transforms in the account, or
     * the machine learning transforms with the specified tags.
     * </p>
     *
     * @param transformIds <p>
     *            The identifiers of all the machine learning transforms in the
     *            account, or the machine learning transforms with the specified
     *            tags.
     *            </p>
     */
    public void setTransformIds(java.util.Collection<String> transformIds) {
        if (transformIds == null) {
            this.transformIds = null;
            return;
        }

        this.transformIds = new java.util.ArrayList<String>(transformIds);
    }

    /**
     * <p>
     * The identifiers of all the machine learning transforms in the account, or
     * the machine learning transforms with the specified tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transformIds <p>
     *            The identifiers of all the machine learning transforms in the
     *            account, or the machine learning transforms with the specified
     *            tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMLTransformsResult withTransformIds(String... transformIds) {
        if (getTransformIds() == null) {
            this.transformIds = new java.util.ArrayList<String>(transformIds.length);
        }
        for (String value : transformIds) {
            this.transformIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of all the machine learning transforms in the account, or
     * the machine learning transforms with the specified tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transformIds <p>
     *            The identifiers of all the machine learning transforms in the
     *            account, or the machine learning transforms with the specified
     *            tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMLTransformsResult withTransformIds(java.util.Collection<String> transformIds) {
        setTransformIds(transformIds);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     *
     * @return <p>
     *         A continuation token, if the returned list does not contain the
     *         last metric available.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if the returned list does not contain
     *            the last metric available.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last
     * metric available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if the returned list does not contain
     *            the last metric available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMLTransformsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getTransformIds() != null)
            sb.append("TransformIds: " + getTransformIds() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransformIds() == null) ? 0 : getTransformIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMLTransformsResult == false)
            return false;
        ListMLTransformsResult other = (ListMLTransformsResult) obj;

        if (other.getTransformIds() == null ^ this.getTransformIds() == null)
            return false;
        if (other.getTransformIds() != null
                && other.getTransformIds().equals(this.getTransformIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
