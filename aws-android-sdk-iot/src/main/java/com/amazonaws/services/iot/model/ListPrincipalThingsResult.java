/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The output from the ListPrincipalThings operation.
 * </p>
 */
public class ListPrincipalThingsResult implements Serializable {
    /**
     * <p>
     * The things.
     * </p>
     */
    private java.util.List<String> things;

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The things.
     * </p>
     *
     * @return <p>
     *         The things.
     *         </p>
     */
    public java.util.List<String> getThings() {
        return things;
    }

    /**
     * <p>
     * The things.
     * </p>
     *
     * @param things <p>
     *            The things.
     *            </p>
     */
    public void setThings(java.util.Collection<String> things) {
        if (things == null) {
            this.things = null;
            return;
        }

        this.things = new java.util.ArrayList<String>(things);
    }

    /**
     * <p>
     * The things.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param things <p>
     *            The things.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPrincipalThingsResult withThings(String... things) {
        if (getThings() == null) {
            this.things = new java.util.ArrayList<String>(things.length);
        }
        for (String value : things) {
            this.things.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The things.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param things <p>
     *            The things.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPrincipalThingsResult withThings(java.util.Collection<String> things) {
        setThings(things);
        return this;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     *
     * @return <p>
     *         The token used to get the next set of results, or <b>null</b> if
     *         there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            The token used to get the next set of results, or <b>null</b>
     *            if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token used to get the next set of results, or <b>null</b>
     *            if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPrincipalThingsResult withNextToken(String nextToken) {
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
        if (getThings() != null)
            sb.append("things: " + getThings() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThings() == null) ? 0 : getThings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPrincipalThingsResult == false)
            return false;
        ListPrincipalThingsResult other = (ListPrincipalThingsResult) obj;

        if (other.getThings() == null ^ this.getThings() == null)
            return false;
        if (other.getThings() != null && other.getThings().equals(this.getThings()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
