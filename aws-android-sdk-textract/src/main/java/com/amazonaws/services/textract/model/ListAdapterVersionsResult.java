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

public class ListAdapterVersionsResult implements Serializable {
    /**
     * <p>
     * Adapter versions that match the filtering criteria specified when calling
     * ListAdapters.
     * </p>
     */
    private java.util.List<AdapterVersionOverview> adapterVersions;

    /**
     * <p>
     * Identifies the next page of results to return when listing adapter
     * versions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Adapter versions that match the filtering criteria specified when calling
     * ListAdapters.
     * </p>
     *
     * @return <p>
     *         Adapter versions that match the filtering criteria specified when
     *         calling ListAdapters.
     *         </p>
     */
    public java.util.List<AdapterVersionOverview> getAdapterVersions() {
        return adapterVersions;
    }

    /**
     * <p>
     * Adapter versions that match the filtering criteria specified when calling
     * ListAdapters.
     * </p>
     *
     * @param adapterVersions <p>
     *            Adapter versions that match the filtering criteria specified
     *            when calling ListAdapters.
     *            </p>
     */
    public void setAdapterVersions(java.util.Collection<AdapterVersionOverview> adapterVersions) {
        if (adapterVersions == null) {
            this.adapterVersions = null;
            return;
        }

        this.adapterVersions = new java.util.ArrayList<AdapterVersionOverview>(adapterVersions);
    }

    /**
     * <p>
     * Adapter versions that match the filtering criteria specified when calling
     * ListAdapters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adapterVersions <p>
     *            Adapter versions that match the filtering criteria specified
     *            when calling ListAdapters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAdapterVersionsResult withAdapterVersions(AdapterVersionOverview... adapterVersions) {
        if (getAdapterVersions() == null) {
            this.adapterVersions = new java.util.ArrayList<AdapterVersionOverview>(
                    adapterVersions.length);
        }
        for (AdapterVersionOverview value : adapterVersions) {
            this.adapterVersions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Adapter versions that match the filtering criteria specified when calling
     * ListAdapters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adapterVersions <p>
     *            Adapter versions that match the filtering criteria specified
     *            when calling ListAdapters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAdapterVersionsResult withAdapterVersions(
            java.util.Collection<AdapterVersionOverview> adapterVersions) {
        setAdapterVersions(adapterVersions);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return when listing adapter
     * versions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Identifies the next page of results to return when listing
     *         adapter versions.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return when listing adapter
     * versions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextToken <p>
     *            Identifies the next page of results to return when listing
     *            adapter versions.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return when listing adapter
     * versions.
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
     *            adapter versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAdapterVersionsResult withNextToken(String nextToken) {
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
        if (getAdapterVersions() != null)
            sb.append("AdapterVersions: " + getAdapterVersions() + ",");
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
                + ((getAdapterVersions() == null) ? 0 : getAdapterVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAdapterVersionsResult == false)
            return false;
        ListAdapterVersionsResult other = (ListAdapterVersionsResult) obj;

        if (other.getAdapterVersions() == null ^ this.getAdapterVersions() == null)
            return false;
        if (other.getAdapterVersions() != null
                && other.getAdapterVersions().equals(this.getAdapterVersions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
