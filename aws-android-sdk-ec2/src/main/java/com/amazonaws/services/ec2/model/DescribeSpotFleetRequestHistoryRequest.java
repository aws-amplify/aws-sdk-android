/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeSpotFleetRequestHistoryRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSpotFleetRequestHistory(DescribeSpotFleetRequestHistoryRequest) DescribeSpotFleetRequestHistory operation}.
 * <p>
 * Describes the events for the specified Spot fleet request during the
 * specified time.
 * </p>
 * <p>
 * Spot fleet events are delayed by up to 30 seconds before they can be
 * described. This ensures that you can query by the last evaluated time
 * and not miss a recorded event.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSpotFleetRequestHistory(DescribeSpotFleetRequestHistoryRequest)
 */
public class DescribeSpotFleetRequestHistoryRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeSpotFleetRequestHistoryRequest> {

    /**
     * The ID of the Spot fleet request.
     */
    private String spotFleetRequestId;

    /**
     * The type of events to describe. By default, all events are described.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error
     */
    private String eventType;

    /**
     * The starting date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    private java.util.Date startTime;

    /**
     * The token for the next set of results.
     */
    private String nextToken;

    /**
     * The maximum number of results to return in a single call. Specify a
     * value between 1 and 1000. The default value is 1000. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     */
    private Integer maxResults;

    /**
     * The ID of the Spot fleet request.
     *
     * @return The ID of the Spot fleet request.
     */
    public String getSpotFleetRequestId() {
        return spotFleetRequestId;
    }
    
    /**
     * The ID of the Spot fleet request.
     *
     * @param spotFleetRequestId The ID of the Spot fleet request.
     */
    public void setSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
    }
    
    /**
     * The ID of the Spot fleet request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotFleetRequestId The ID of the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetRequestHistoryRequest withSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
        return this;
    }

    /**
     * The type of events to describe. By default, all events are described.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error
     *
     * @return The type of events to describe. By default, all events are described.
     *
     * @see EventType
     */
    public String getEventType() {
        return eventType;
    }
    
    /**
     * The type of events to describe. By default, all events are described.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error
     *
     * @param eventType The type of events to describe. By default, all events are described.
     *
     * @see EventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    
    /**
     * The type of events to describe. By default, all events are described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error
     *
     * @param eventType The type of events to describe. By default, all events are described.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EventType
     */
    public DescribeSpotFleetRequestHistoryRequest withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * The type of events to describe. By default, all events are described.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error
     *
     * @param eventType The type of events to describe. By default, all events are described.
     *
     * @see EventType
     */
    public void setEventType(EventType eventType) {
        this.eventType = eventType.toString();
    }
    
    /**
     * The type of events to describe. By default, all events are described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceChange, fleetRequestChange, error
     *
     * @param eventType The type of events to describe. By default, all events are described.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EventType
     */
    public DescribeSpotFleetRequestHistoryRequest withEventType(EventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * The starting date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @return The starting date and time for the events, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The starting date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @param startTime The starting date and time for the events, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The starting date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The starting date and time for the events, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetRequestHistoryRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The token for the next set of results.
     *
     * @return The token for the next set of results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token for the next set of results.
     *
     * @param nextToken The token for the next set of results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token for the next set of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token for the next set of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetRequestHistoryRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of results to return in a single call. Specify a
     * value between 1 and 1000. The default value is 1000. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     *
     * @return The maximum number of results to return in a single call. Specify a
     *         value between 1 and 1000. The default value is 1000. To retrieve the
     *         remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results to return in a single call. Specify a
     * value between 1 and 1000. The default value is 1000. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     *
     * @param maxResults The maximum number of results to return in a single call. Specify a
     *         value between 1 and 1000. The default value is 1000. To retrieve the
     *         remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results to return in a single call. Specify a
     * value between 1 and 1000. The default value is 1000. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of results to return in a single call. Specify a
     *         value between 1 and 1000. The default value is 1000. To retrieve the
     *         remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetRequestHistoryRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeSpotFleetRequestHistoryRequest> getDryRunRequest() {
        Request<DescribeSpotFleetRequestHistoryRequest> request = new DescribeSpotFleetRequestHistoryRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSpotFleetRequestId() != null) sb.append("SpotFleetRequestId: " + getSpotFleetRequestId() + ",");
        if (getEventType() != null) sb.append("EventType: " + getEventType() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode()); 
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode()); 
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSpotFleetRequestHistoryRequest == false) return false;
        DescribeSpotFleetRequestHistoryRequest other = (DescribeSpotFleetRequestHistoryRequest)obj;
        
        if (other.getSpotFleetRequestId() == null ^ this.getSpotFleetRequestId() == null) return false;
        if (other.getSpotFleetRequestId() != null && other.getSpotFleetRequestId().equals(this.getSpotFleetRequestId()) == false) return false; 
        if (other.getEventType() == null ^ this.getEventType() == null) return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        return true;
    }
    
}
    