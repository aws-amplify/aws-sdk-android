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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class ListFlywheelsResult implements Serializable {
    /**
     * <p>
     * A list of flywheel properties retrieved by the service in response to the
     * request.
     * </p>
     */
    private java.util.List<FlywheelSummary> flywheelSummaryList;

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
     * A list of flywheel properties retrieved by the service in response to the
     * request.
     * </p>
     *
     * @return <p>
     *         A list of flywheel properties retrieved by the service in
     *         response to the request.
     *         </p>
     */
    public java.util.List<FlywheelSummary> getFlywheelSummaryList() {
        return flywheelSummaryList;
    }

    /**
     * <p>
     * A list of flywheel properties retrieved by the service in response to the
     * request.
     * </p>
     *
     * @param flywheelSummaryList <p>
     *            A list of flywheel properties retrieved by the service in
     *            response to the request.
     *            </p>
     */
    public void setFlywheelSummaryList(java.util.Collection<FlywheelSummary> flywheelSummaryList) {
        if (flywheelSummaryList == null) {
            this.flywheelSummaryList = null;
            return;
        }

        this.flywheelSummaryList = new java.util.ArrayList<FlywheelSummary>(flywheelSummaryList);
    }

    /**
     * <p>
     * A list of flywheel properties retrieved by the service in response to the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flywheelSummaryList <p>
     *            A list of flywheel properties retrieved by the service in
     *            response to the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFlywheelsResult withFlywheelSummaryList(FlywheelSummary... flywheelSummaryList) {
        if (getFlywheelSummaryList() == null) {
            this.flywheelSummaryList = new java.util.ArrayList<FlywheelSummary>(
                    flywheelSummaryList.length);
        }
        for (FlywheelSummary value : flywheelSummaryList) {
            this.flywheelSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of flywheel properties retrieved by the service in response to the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flywheelSummaryList <p>
     *            A list of flywheel properties retrieved by the service in
     *            response to the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFlywheelsResult withFlywheelSummaryList(
            java.util.Collection<FlywheelSummary> flywheelSummaryList) {
        setFlywheelSummaryList(flywheelSummaryList);
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
    public ListFlywheelsResult withNextToken(String nextToken) {
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
        if (getFlywheelSummaryList() != null)
            sb.append("FlywheelSummaryList: " + getFlywheelSummaryList() + ",");
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
                + ((getFlywheelSummaryList() == null) ? 0 : getFlywheelSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFlywheelsResult == false)
            return false;
        ListFlywheelsResult other = (ListFlywheelsResult) obj;

        if (other.getFlywheelSummaryList() == null ^ this.getFlywheelSummaryList() == null)
            return false;
        if (other.getFlywheelSummaryList() != null
                && other.getFlywheelSummaryList().equals(this.getFlywheelSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
