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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

public class ListAdaptersResult implements Serializable {
    /**
     * <p>
     * A list of adapters that matches the filtering criteria specified when
     * calling ListAdapters.
     * </p>
     */
    private java.util.List<AdapterOverview> adapters;

    /**
     * <p>
     * Identifies the next page of results to return when listing adapters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of adapters that matches the filtering criteria specified when
     * calling ListAdapters.
     * </p>
     *
     * @return <p>
     *         A list of adapters that matches the filtering criteria specified
     *         when calling ListAdapters.
     *         </p>
     */
    public java.util.List<AdapterOverview> getAdapters() {
        return adapters;
    }

    /**
     * <p>
     * A list of adapters that matches the filtering criteria specified when
     * calling ListAdapters.
     * </p>
     *
     * @param adapters <p>
     *            A list of adapters that matches the filtering criteria
     *            specified when calling ListAdapters.
     *            </p>
     */
    public void setAdapters(java.util.Collection<AdapterOverview> adapters) {
        if (adapters == null) {
            this.adapters = null;
            return;
        }

        this.adapters = new java.util.ArrayList<AdapterOverview>(adapters);
    }

    /**
     * <p>
     * A list of adapters that matches the filtering criteria specified when
     * calling ListAdapters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adapters <p>
     *            A list of adapters that matches the filtering criteria
     *            specified when calling ListAdapters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAdaptersResult withAdapters(AdapterOverview... adapters) {
        if (getAdapters() == null) {
            this.adapters = new java.util.ArrayList<AdapterOverview>(adapters.length);
        }
        for (AdapterOverview value : adapters) {
            this.adapters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of adapters that matches the filtering criteria specified when
     * calling ListAdapters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adapters <p>
     *            A list of adapters that matches the filtering criteria
     *            specified when calling ListAdapters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAdaptersResult withAdapters(java.util.Collection<AdapterOverview> adapters) {
        setAdapters(adapters);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return when listing adapters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Identifies the next page of results to return when listing
     *         adapters.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return when listing adapters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextToken <p>
     *            Identifies the next page of results to return when listing
     *            adapters.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return when listing adapters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextToken <p>
     *            Identifies the next page of results to return when listing
     *            adapters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAdaptersResult withNextToken(String nextToken) {
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
        if (getAdapters() != null)
            sb.append("Adapters: " + getAdapters() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdapters() == null) ? 0 : getAdapters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAdaptersResult == false)
            return false;
        ListAdaptersResult other = (ListAdaptersResult) obj;

        if (other.getAdapters() == null ^ this.getAdapters() == null)
            return false;
        if (other.getAdapters() != null && other.getAdapters().equals(this.getAdapters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
