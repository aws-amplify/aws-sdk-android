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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

public class SearchNetworkProfilesResult implements Serializable {
    /**
     * <p>
     * The network profiles that meet the specified set of filter criteria, in
     * sort order. It is a list of NetworkProfileData objects.
     * </p>
     */
    private java.util.List<NetworkProfileData> networkProfiles;

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for
     * pagination of results from this action. If this parameter is specified,
     * the response includes only results beyond the token, up to the value
     * specified by MaxResults.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The total number of network profiles returned.
     * </p>
     */
    private Integer totalCount;

    /**
     * <p>
     * The network profiles that meet the specified set of filter criteria, in
     * sort order. It is a list of NetworkProfileData objects.
     * </p>
     *
     * @return <p>
     *         The network profiles that meet the specified set of filter
     *         criteria, in sort order. It is a list of NetworkProfileData
     *         objects.
     *         </p>
     */
    public java.util.List<NetworkProfileData> getNetworkProfiles() {
        return networkProfiles;
    }

    /**
     * <p>
     * The network profiles that meet the specified set of filter criteria, in
     * sort order. It is a list of NetworkProfileData objects.
     * </p>
     *
     * @param networkProfiles <p>
     *            The network profiles that meet the specified set of filter
     *            criteria, in sort order. It is a list of NetworkProfileData
     *            objects.
     *            </p>
     */
    public void setNetworkProfiles(java.util.Collection<NetworkProfileData> networkProfiles) {
        if (networkProfiles == null) {
            this.networkProfiles = null;
            return;
        }

        this.networkProfiles = new java.util.ArrayList<NetworkProfileData>(networkProfiles);
    }

    /**
     * <p>
     * The network profiles that meet the specified set of filter criteria, in
     * sort order. It is a list of NetworkProfileData objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkProfiles <p>
     *            The network profiles that meet the specified set of filter
     *            criteria, in sort order. It is a list of NetworkProfileData
     *            objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchNetworkProfilesResult withNetworkProfiles(NetworkProfileData... networkProfiles) {
        if (getNetworkProfiles() == null) {
            this.networkProfiles = new java.util.ArrayList<NetworkProfileData>(
                    networkProfiles.length);
        }
        for (NetworkProfileData value : networkProfiles) {
            this.networkProfiles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The network profiles that meet the specified set of filter criteria, in
     * sort order. It is a list of NetworkProfileData objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkProfiles <p>
     *            The network profiles that meet the specified set of filter
     *            criteria, in sort order. It is a list of NetworkProfileData
     *            objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchNetworkProfilesResult withNetworkProfiles(
            java.util.Collection<NetworkProfileData> networkProfiles) {
        setNetworkProfiles(networkProfiles);
        return this;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for
     * pagination of results from this action. If this parameter is specified,
     * the response includes only results beyond the token, up to the value
     * specified by MaxResults.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @return <p>
     *         An optional token returned from a prior request. Use this token
     *         for pagination of results from this action. If this parameter is
     *         specified, the response includes only results beyond the token,
     *         up to the value specified by MaxResults.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for
     * pagination of results from this action. If this parameter is specified,
     * the response includes only results beyond the token, up to the value
     * specified by MaxResults.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            An optional token returned from a prior request. Use this
     *            token for pagination of results from this action. If this
     *            parameter is specified, the response includes only results
     *            beyond the token, up to the value specified by MaxResults.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for
     * pagination of results from this action. If this parameter is specified,
     * the response includes only results beyond the token, up to the value
     * specified by MaxResults.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            An optional token returned from a prior request. Use this
     *            token for pagination of results from this action. If this
     *            parameter is specified, the response includes only results
     *            beyond the token, up to the value specified by MaxResults.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchNetworkProfilesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The total number of network profiles returned.
     * </p>
     *
     * @return <p>
     *         The total number of network profiles returned.
     *         </p>
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * <p>
     * The total number of network profiles returned.
     * </p>
     *
     * @param totalCount <p>
     *            The total number of network profiles returned.
     *            </p>
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of network profiles returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalCount <p>
     *            The total number of network profiles returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchNetworkProfilesResult withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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
        if (getNetworkProfiles() != null)
            sb.append("NetworkProfiles: " + getNetworkProfiles() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getTotalCount() != null)
            sb.append("TotalCount: " + getTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNetworkProfiles() == null) ? 0 : getNetworkProfiles().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchNetworkProfilesResult == false)
            return false;
        SearchNetworkProfilesResult other = (SearchNetworkProfilesResult) obj;

        if (other.getNetworkProfiles() == null ^ this.getNetworkProfiles() == null)
            return false;
        if (other.getNetworkProfiles() != null
                && other.getNetworkProfiles().equals(this.getNetworkProfiles()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null
                && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        return true;
    }
}
