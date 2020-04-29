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

package com.amazonaws.services.awswafregional.model;

import java.io.Serializable;

public class GetSampledRequestsResult implements Serializable {
    /**
     * <p>
     * A complex type that contains detailed information about each of the
     * requests in the sample.
     * </p>
     */
    private java.util.List<SampledHTTPRequest> sampledRequests;

    /**
     * <p>
     * The total number of requests from which <code>GetSampledRequests</code>
     * got a sample of <code>MaxItems</code> requests. If
     * <code>PopulationSize</code> is less than <code>MaxItems</code>, the
     * sample includes every request that your AWS resource received during the
     * specified time range.
     * </p>
     */
    private Long populationSize;

    /**
     * <p>
     * Usually, <code>TimeWindow</code> is the time range that you specified in
     * the <code>GetSampledRequests</code> request. However, if your AWS
     * resource received more than 5,000 requests during the time range that you
     * specified in the request, <code>GetSampledRequests</code> returns the
     * time range for the first 5,000 requests. Times are in Coordinated
     * Universal Time (UTC) format.
     * </p>
     */
    private TimeWindow timeWindow;

    /**
     * <p>
     * A complex type that contains detailed information about each of the
     * requests in the sample.
     * </p>
     *
     * @return <p>
     *         A complex type that contains detailed information about each of
     *         the requests in the sample.
     *         </p>
     */
    public java.util.List<SampledHTTPRequest> getSampledRequests() {
        return sampledRequests;
    }

    /**
     * <p>
     * A complex type that contains detailed information about each of the
     * requests in the sample.
     * </p>
     *
     * @param sampledRequests <p>
     *            A complex type that contains detailed information about each
     *            of the requests in the sample.
     *            </p>
     */
    public void setSampledRequests(java.util.Collection<SampledHTTPRequest> sampledRequests) {
        if (sampledRequests == null) {
            this.sampledRequests = null;
            return;
        }

        this.sampledRequests = new java.util.ArrayList<SampledHTTPRequest>(sampledRequests);
    }

    /**
     * <p>
     * A complex type that contains detailed information about each of the
     * requests in the sample.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampledRequests <p>
     *            A complex type that contains detailed information about each
     *            of the requests in the sample.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSampledRequestsResult withSampledRequests(SampledHTTPRequest... sampledRequests) {
        if (getSampledRequests() == null) {
            this.sampledRequests = new java.util.ArrayList<SampledHTTPRequest>(
                    sampledRequests.length);
        }
        for (SampledHTTPRequest value : sampledRequests) {
            this.sampledRequests.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains detailed information about each of the
     * requests in the sample.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sampledRequests <p>
     *            A complex type that contains detailed information about each
     *            of the requests in the sample.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSampledRequestsResult withSampledRequests(
            java.util.Collection<SampledHTTPRequest> sampledRequests) {
        setSampledRequests(sampledRequests);
        return this;
    }

    /**
     * <p>
     * The total number of requests from which <code>GetSampledRequests</code>
     * got a sample of <code>MaxItems</code> requests. If
     * <code>PopulationSize</code> is less than <code>MaxItems</code>, the
     * sample includes every request that your AWS resource received during the
     * specified time range.
     * </p>
     *
     * @return <p>
     *         The total number of requests from which
     *         <code>GetSampledRequests</code> got a sample of
     *         <code>MaxItems</code> requests. If <code>PopulationSize</code> is
     *         less than <code>MaxItems</code>, the sample includes every
     *         request that your AWS resource received during the specified time
     *         range.
     *         </p>
     */
    public Long getPopulationSize() {
        return populationSize;
    }

    /**
     * <p>
     * The total number of requests from which <code>GetSampledRequests</code>
     * got a sample of <code>MaxItems</code> requests. If
     * <code>PopulationSize</code> is less than <code>MaxItems</code>, the
     * sample includes every request that your AWS resource received during the
     * specified time range.
     * </p>
     *
     * @param populationSize <p>
     *            The total number of requests from which
     *            <code>GetSampledRequests</code> got a sample of
     *            <code>MaxItems</code> requests. If <code>PopulationSize</code>
     *            is less than <code>MaxItems</code>, the sample includes every
     *            request that your AWS resource received during the specified
     *            time range.
     *            </p>
     */
    public void setPopulationSize(Long populationSize) {
        this.populationSize = populationSize;
    }

    /**
     * <p>
     * The total number of requests from which <code>GetSampledRequests</code>
     * got a sample of <code>MaxItems</code> requests. If
     * <code>PopulationSize</code> is less than <code>MaxItems</code>, the
     * sample includes every request that your AWS resource received during the
     * specified time range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param populationSize <p>
     *            The total number of requests from which
     *            <code>GetSampledRequests</code> got a sample of
     *            <code>MaxItems</code> requests. If <code>PopulationSize</code>
     *            is less than <code>MaxItems</code>, the sample includes every
     *            request that your AWS resource received during the specified
     *            time range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSampledRequestsResult withPopulationSize(Long populationSize) {
        this.populationSize = populationSize;
        return this;
    }

    /**
     * <p>
     * Usually, <code>TimeWindow</code> is the time range that you specified in
     * the <code>GetSampledRequests</code> request. However, if your AWS
     * resource received more than 5,000 requests during the time range that you
     * specified in the request, <code>GetSampledRequests</code> returns the
     * time range for the first 5,000 requests. Times are in Coordinated
     * Universal Time (UTC) format.
     * </p>
     *
     * @return <p>
     *         Usually, <code>TimeWindow</code> is the time range that you
     *         specified in the <code>GetSampledRequests</code> request.
     *         However, if your AWS resource received more than 5,000 requests
     *         during the time range that you specified in the request,
     *         <code>GetSampledRequests</code> returns the time range for the
     *         first 5,000 requests. Times are in Coordinated Universal Time
     *         (UTC) format.
     *         </p>
     */
    public TimeWindow getTimeWindow() {
        return timeWindow;
    }

    /**
     * <p>
     * Usually, <code>TimeWindow</code> is the time range that you specified in
     * the <code>GetSampledRequests</code> request. However, if your AWS
     * resource received more than 5,000 requests during the time range that you
     * specified in the request, <code>GetSampledRequests</code> returns the
     * time range for the first 5,000 requests. Times are in Coordinated
     * Universal Time (UTC) format.
     * </p>
     *
     * @param timeWindow <p>
     *            Usually, <code>TimeWindow</code> is the time range that you
     *            specified in the <code>GetSampledRequests</code> request.
     *            However, if your AWS resource received more than 5,000
     *            requests during the time range that you specified in the
     *            request, <code>GetSampledRequests</code> returns the time
     *            range for the first 5,000 requests. Times are in Coordinated
     *            Universal Time (UTC) format.
     *            </p>
     */
    public void setTimeWindow(TimeWindow timeWindow) {
        this.timeWindow = timeWindow;
    }

    /**
     * <p>
     * Usually, <code>TimeWindow</code> is the time range that you specified in
     * the <code>GetSampledRequests</code> request. However, if your AWS
     * resource received more than 5,000 requests during the time range that you
     * specified in the request, <code>GetSampledRequests</code> returns the
     * time range for the first 5,000 requests. Times are in Coordinated
     * Universal Time (UTC) format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeWindow <p>
     *            Usually, <code>TimeWindow</code> is the time range that you
     *            specified in the <code>GetSampledRequests</code> request.
     *            However, if your AWS resource received more than 5,000
     *            requests during the time range that you specified in the
     *            request, <code>GetSampledRequests</code> returns the time
     *            range for the first 5,000 requests. Times are in Coordinated
     *            Universal Time (UTC) format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSampledRequestsResult withTimeWindow(TimeWindow timeWindow) {
        this.timeWindow = timeWindow;
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
        if (getSampledRequests() != null)
            sb.append("SampledRequests: " + getSampledRequests() + ",");
        if (getPopulationSize() != null)
            sb.append("PopulationSize: " + getPopulationSize() + ",");
        if (getTimeWindow() != null)
            sb.append("TimeWindow: " + getTimeWindow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSampledRequests() == null) ? 0 : getSampledRequests().hashCode());
        hashCode = prime * hashCode
                + ((getPopulationSize() == null) ? 0 : getPopulationSize().hashCode());
        hashCode = prime * hashCode + ((getTimeWindow() == null) ? 0 : getTimeWindow().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSampledRequestsResult == false)
            return false;
        GetSampledRequestsResult other = (GetSampledRequestsResult) obj;

        if (other.getSampledRequests() == null ^ this.getSampledRequests() == null)
            return false;
        if (other.getSampledRequests() != null
                && other.getSampledRequests().equals(this.getSampledRequests()) == false)
            return false;
        if (other.getPopulationSize() == null ^ this.getPopulationSize() == null)
            return false;
        if (other.getPopulationSize() != null
                && other.getPopulationSize().equals(this.getPopulationSize()) == false)
            return false;
        if (other.getTimeWindow() == null ^ this.getTimeWindow() == null)
            return false;
        if (other.getTimeWindow() != null
                && other.getTimeWindow().equals(this.getTimeWindow()) == false)
            return false;
        return true;
    }
}
