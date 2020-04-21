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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

public class ListPublishingDestinationsResult implements Serializable {
    /**
     * <p>
     * A <code>Destinations</code> object that includes information about each
     * publishing destination returned.
     * </p>
     */
    private java.util.List<Destination> destinations;

    /**
     * <p>
     * A token to use for paginating results that are returned in the response.
     * Set the value of this parameter to null for the first request to a list
     * action. For subsequent calls, use the <code>NextToken</code> value
     * returned from the previous request to continue listing results after the
     * first page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A <code>Destinations</code> object that includes information about each
     * publishing destination returned.
     * </p>
     *
     * @return <p>
     *         A <code>Destinations</code> object that includes information
     *         about each publishing destination returned.
     *         </p>
     */
    public java.util.List<Destination> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * A <code>Destinations</code> object that includes information about each
     * publishing destination returned.
     * </p>
     *
     * @param destinations <p>
     *            A <code>Destinations</code> object that includes information
     *            about each publishing destination returned.
     *            </p>
     */
    public void setDestinations(java.util.Collection<Destination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<Destination>(destinations);
    }

    /**
     * <p>
     * A <code>Destinations</code> object that includes information about each
     * publishing destination returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations <p>
     *            A <code>Destinations</code> object that includes information
     *            about each publishing destination returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPublishingDestinationsResult withDestinations(Destination... destinations) {
        if (getDestinations() == null) {
            this.destinations = new java.util.ArrayList<Destination>(destinations.length);
        }
        for (Destination value : destinations) {
            this.destinations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A <code>Destinations</code> object that includes information about each
     * publishing destination returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinations <p>
     *            A <code>Destinations</code> object that includes information
     *            about each publishing destination returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPublishingDestinationsResult withDestinations(
            java.util.Collection<Destination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response.
     * Set the value of this parameter to null for the first request to a list
     * action. For subsequent calls, use the <code>NextToken</code> value
     * returned from the previous request to continue listing results after the
     * first page.
     * </p>
     *
     * @return <p>
     *         A token to use for paginating results that are returned in the
     *         response. Set the value of this parameter to null for the first
     *         request to a list action. For subsequent calls, use the
     *         <code>NextToken</code> value returned from the previous request
     *         to continue listing results after the first page.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response.
     * Set the value of this parameter to null for the first request to a list
     * action. For subsequent calls, use the <code>NextToken</code> value
     * returned from the previous request to continue listing results after the
     * first page.
     * </p>
     *
     * @param nextToken <p>
     *            A token to use for paginating results that are returned in the
     *            response. Set the value of this parameter to null for the
     *            first request to a list action. For subsequent calls, use the
     *            <code>NextToken</code> value returned from the previous
     *            request to continue listing results after the first page.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response.
     * Set the value of this parameter to null for the first request to a list
     * action. For subsequent calls, use the <code>NextToken</code> value
     * returned from the previous request to continue listing results after the
     * first page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token to use for paginating results that are returned in the
     *            response. Set the value of this parameter to null for the
     *            first request to a list action. For subsequent calls, use the
     *            <code>NextToken</code> value returned from the previous
     *            request to continue listing results after the first page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPublishingDestinationsResult withNextToken(String nextToken) {
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
        if (getDestinations() != null)
            sb.append("Destinations: " + getDestinations() + ",");
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
                + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPublishingDestinationsResult == false)
            return false;
        ListPublishingDestinationsResult other = (ListPublishingDestinationsResult) obj;

        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null
                && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
