/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class ListEndpointsResult implements Serializable {
    /**
     * <p>
     * Displays a list of endpoint properties being retrieved by the service in
     * response to the request.
     * </p>
     */
    private java.util.List<EndpointProperties> endpointPropertiesList;

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * Displays a list of endpoint properties being retrieved by the service in
     * response to the request.
     * </p>
     *
     * @return <p>
     *         Displays a list of endpoint properties being retrieved by the
     *         service in response to the request.
     *         </p>
     */
    public java.util.List<EndpointProperties> getEndpointPropertiesList() {
        return endpointPropertiesList;
    }

    /**
     * <p>
     * Displays a list of endpoint properties being retrieved by the service in
     * response to the request.
     * </p>
     *
     * @param endpointPropertiesList <p>
     *            Displays a list of endpoint properties being retrieved by the
     *            service in response to the request.
     *            </p>
     */
    public void setEndpointPropertiesList(
            java.util.Collection<EndpointProperties> endpointPropertiesList) {
        if (endpointPropertiesList == null) {
            this.endpointPropertiesList = null;
            return;
        }

        this.endpointPropertiesList = new java.util.ArrayList<EndpointProperties>(
                endpointPropertiesList);
    }

    /**
     * <p>
     * Displays a list of endpoint properties being retrieved by the service in
     * response to the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointPropertiesList <p>
     *            Displays a list of endpoint properties being retrieved by the
     *            service in response to the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEndpointsResult withEndpointPropertiesList(
            EndpointProperties... endpointPropertiesList) {
        if (getEndpointPropertiesList() == null) {
            this.endpointPropertiesList = new java.util.ArrayList<EndpointProperties>(
                    endpointPropertiesList.length);
        }
        for (EndpointProperties value : endpointPropertiesList) {
            this.endpointPropertiesList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Displays a list of endpoint properties being retrieved by the service in
     * response to the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointPropertiesList <p>
     *            Displays a list of endpoint properties being retrieved by the
     *            service in response to the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEndpointsResult withEndpointPropertiesList(
            java.util.Collection<EndpointProperties> endpointPropertiesList) {
        setEndpointPropertiesList(endpointPropertiesList);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Identifies the next page of results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            Identifies the next page of results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            Identifies the next page of results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEndpointsResult withNextToken(String nextToken) {
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
        if (getEndpointPropertiesList() != null)
            sb.append("EndpointPropertiesList: " + getEndpointPropertiesList() + ",");
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
                + ((getEndpointPropertiesList() == null) ? 0 : getEndpointPropertiesList()
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

        if (obj instanceof ListEndpointsResult == false)
            return false;
        ListEndpointsResult other = (ListEndpointsResult) obj;

        if (other.getEndpointPropertiesList() == null ^ this.getEndpointPropertiesList() == null)
            return false;
        if (other.getEndpointPropertiesList() != null
                && other.getEndpointPropertiesList().equals(this.getEndpointPropertiesList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
