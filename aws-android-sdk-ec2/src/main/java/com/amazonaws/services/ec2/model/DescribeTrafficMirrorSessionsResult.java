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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class DescribeTrafficMirrorSessionsResult implements Serializable {
    /**
     * <p>
     * Describes one or more Traffic Mirror sessions. By default, all Traffic
     * Mirror sessions are described. Alternatively, you can filter the results.
     * </p>
     */
    private java.util.List<TrafficMirrorSession> trafficMirrorSessions;

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Describes one or more Traffic Mirror sessions. By default, all Traffic
     * Mirror sessions are described. Alternatively, you can filter the results.
     * </p>
     *
     * @return <p>
     *         Describes one or more Traffic Mirror sessions. By default, all
     *         Traffic Mirror sessions are described. Alternatively, you can
     *         filter the results.
     *         </p>
     */
    public java.util.List<TrafficMirrorSession> getTrafficMirrorSessions() {
        return trafficMirrorSessions;
    }

    /**
     * <p>
     * Describes one or more Traffic Mirror sessions. By default, all Traffic
     * Mirror sessions are described. Alternatively, you can filter the results.
     * </p>
     *
     * @param trafficMirrorSessions <p>
     *            Describes one or more Traffic Mirror sessions. By default, all
     *            Traffic Mirror sessions are described. Alternatively, you can
     *            filter the results.
     *            </p>
     */
    public void setTrafficMirrorSessions(
            java.util.Collection<TrafficMirrorSession> trafficMirrorSessions) {
        if (trafficMirrorSessions == null) {
            this.trafficMirrorSessions = null;
            return;
        }

        this.trafficMirrorSessions = new java.util.ArrayList<TrafficMirrorSession>(
                trafficMirrorSessions);
    }

    /**
     * <p>
     * Describes one or more Traffic Mirror sessions. By default, all Traffic
     * Mirror sessions are described. Alternatively, you can filter the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorSessions <p>
     *            Describes one or more Traffic Mirror sessions. By default, all
     *            Traffic Mirror sessions are described. Alternatively, you can
     *            filter the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrafficMirrorSessionsResult withTrafficMirrorSessions(
            TrafficMirrorSession... trafficMirrorSessions) {
        if (getTrafficMirrorSessions() == null) {
            this.trafficMirrorSessions = new java.util.ArrayList<TrafficMirrorSession>(
                    trafficMirrorSessions.length);
        }
        for (TrafficMirrorSession value : trafficMirrorSessions) {
            this.trafficMirrorSessions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Describes one or more Traffic Mirror sessions. By default, all Traffic
     * Mirror sessions are described. Alternatively, you can filter the results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficMirrorSessions <p>
     *            Describes one or more Traffic Mirror sessions. By default, all
     *            Traffic Mirror sessions are described. Alternatively, you can
     *            filter the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrafficMirrorSessionsResult withTrafficMirrorSessions(
            java.util.Collection<TrafficMirrorSession> trafficMirrorSessions) {
        setTrafficMirrorSessions(trafficMirrorSessions);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. The value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. The
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. The
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTrafficMirrorSessionsResult withNextToken(String nextToken) {
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
        if (getTrafficMirrorSessions() != null)
            sb.append("TrafficMirrorSessions: " + getTrafficMirrorSessions() + ",");
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
                + ((getTrafficMirrorSessions() == null) ? 0 : getTrafficMirrorSessions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrafficMirrorSessionsResult == false)
            return false;
        DescribeTrafficMirrorSessionsResult other = (DescribeTrafficMirrorSessionsResult) obj;

        if (other.getTrafficMirrorSessions() == null ^ this.getTrafficMirrorSessions() == null)
            return false;
        if (other.getTrafficMirrorSessions() != null
                && other.getTrafficMirrorSessions().equals(this.getTrafficMirrorSessions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
