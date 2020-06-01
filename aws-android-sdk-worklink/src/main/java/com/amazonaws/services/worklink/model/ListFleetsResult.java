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

package com.amazonaws.services.worklink.model;

import java.io.Serializable;

public class ListFleetsResult implements Serializable {
    /**
     * <p>
     * The summary list of the fleets.
     * </p>
     */
    private java.util.List<FleetSummary> fleetSummaryList;

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this
     * operation. If there are no more pages, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The summary list of the fleets.
     * </p>
     *
     * @return <p>
     *         The summary list of the fleets.
     *         </p>
     */
    public java.util.List<FleetSummary> getFleetSummaryList() {
        return fleetSummaryList;
    }

    /**
     * <p>
     * The summary list of the fleets.
     * </p>
     *
     * @param fleetSummaryList <p>
     *            The summary list of the fleets.
     *            </p>
     */
    public void setFleetSummaryList(java.util.Collection<FleetSummary> fleetSummaryList) {
        if (fleetSummaryList == null) {
            this.fleetSummaryList = null;
            return;
        }

        this.fleetSummaryList = new java.util.ArrayList<FleetSummary>(fleetSummaryList);
    }

    /**
     * <p>
     * The summary list of the fleets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fleetSummaryList <p>
     *            The summary list of the fleets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFleetsResult withFleetSummaryList(FleetSummary... fleetSummaryList) {
        if (getFleetSummaryList() == null) {
            this.fleetSummaryList = new java.util.ArrayList<FleetSummary>(fleetSummaryList.length);
        }
        for (FleetSummary value : fleetSummaryList) {
            this.fleetSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The summary list of the fleets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fleetSummaryList <p>
     *            The summary list of the fleets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFleetsResult withFleetSummaryList(java.util.Collection<FleetSummary> fleetSummaryList) {
        setFleetSummaryList(fleetSummaryList);
        return this;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this
     * operation. If there are no more pages, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @return <p>
     *         The pagination token used to retrieve the next page of results
     *         for this operation. If there are no more pages, this value is
     *         null.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this
     * operation. If there are no more pages, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param nextToken <p>
     *            The pagination token used to retrieve the next page of results
     *            for this operation. If there are no more pages, this value is
     *            null.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this
     * operation. If there are no more pages, this value is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param nextToken <p>
     *            The pagination token used to retrieve the next page of results
     *            for this operation. If there are no more pages, this value is
     *            null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFleetsResult withNextToken(String nextToken) {
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
        if (getFleetSummaryList() != null)
            sb.append("FleetSummaryList: " + getFleetSummaryList() + ",");
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
                + ((getFleetSummaryList() == null) ? 0 : getFleetSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFleetsResult == false)
            return false;
        ListFleetsResult other = (ListFleetsResult) obj;

        if (other.getFleetSummaryList() == null ^ this.getFleetSummaryList() == null)
            return false;
        if (other.getFleetSummaryList() != null
                && other.getFleetSummaryList().equals(this.getFleetSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
