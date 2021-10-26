/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

public class ListAppInstanceUserEndpointsResult implements Serializable {
    /**
     * <p>
     * The information for each requested <code>AppInstanceUserEndpoint</code>.
     * </p>
     */
    private java.util.List<AppInstanceUserEndpointSummary> appInstanceUserEndpoints;

    /**
     * <p>
     * The token passed by previous API calls until all requested endpoints are
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The information for each requested <code>AppInstanceUserEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The information for each requested
     *         <code>AppInstanceUserEndpoint</code>.
     *         </p>
     */
    public java.util.List<AppInstanceUserEndpointSummary> getAppInstanceUserEndpoints() {
        return appInstanceUserEndpoints;
    }

    /**
     * <p>
     * The information for each requested <code>AppInstanceUserEndpoint</code>.
     * </p>
     *
     * @param appInstanceUserEndpoints <p>
     *            The information for each requested
     *            <code>AppInstanceUserEndpoint</code>.
     *            </p>
     */
    public void setAppInstanceUserEndpoints(
            java.util.Collection<AppInstanceUserEndpointSummary> appInstanceUserEndpoints) {
        if (appInstanceUserEndpoints == null) {
            this.appInstanceUserEndpoints = null;
            return;
        }

        this.appInstanceUserEndpoints = new java.util.ArrayList<AppInstanceUserEndpointSummary>(
                appInstanceUserEndpoints);
    }

    /**
     * <p>
     * The information for each requested <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appInstanceUserEndpoints <p>
     *            The information for each requested
     *            <code>AppInstanceUserEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAppInstanceUserEndpointsResult withAppInstanceUserEndpoints(
            AppInstanceUserEndpointSummary... appInstanceUserEndpoints) {
        if (getAppInstanceUserEndpoints() == null) {
            this.appInstanceUserEndpoints = new java.util.ArrayList<AppInstanceUserEndpointSummary>(
                    appInstanceUserEndpoints.length);
        }
        for (AppInstanceUserEndpointSummary value : appInstanceUserEndpoints) {
            this.appInstanceUserEndpoints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The information for each requested <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appInstanceUserEndpoints <p>
     *            The information for each requested
     *            <code>AppInstanceUserEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAppInstanceUserEndpointsResult withAppInstanceUserEndpoints(
            java.util.Collection<AppInstanceUserEndpointSummary> appInstanceUserEndpoints) {
        setAppInstanceUserEndpoints(appInstanceUserEndpoints);
        return this;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested endpoints are
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The token passed by previous API calls until all requested
     *         endpoints are returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested endpoints are
     * returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            The token passed by previous API calls until all requested
     *            endpoints are returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested endpoints are
     * returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            The token passed by previous API calls until all requested
     *            endpoints are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAppInstanceUserEndpointsResult withNextToken(String nextToken) {
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
        if (getAppInstanceUserEndpoints() != null)
            sb.append("AppInstanceUserEndpoints: " + getAppInstanceUserEndpoints() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAppInstanceUserEndpoints() == null) ? 0 : getAppInstanceUserEndpoints()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppInstanceUserEndpointsResult == false)
            return false;
        ListAppInstanceUserEndpointsResult other = (ListAppInstanceUserEndpointsResult) obj;

        if (other.getAppInstanceUserEndpoints() == null
                ^ this.getAppInstanceUserEndpoints() == null)
            return false;
        if (other.getAppInstanceUserEndpoints() != null
                && other.getAppInstanceUserEndpoints().equals(this.getAppInstanceUserEndpoints()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
