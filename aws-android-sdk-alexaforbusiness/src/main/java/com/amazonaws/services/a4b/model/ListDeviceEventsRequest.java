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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the device event history, including device connection status, for up to
 * 30 days.
 * </p>
 */
public class ListDeviceEventsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String deviceArn;

    /**
     * <p>
     * The event type to filter device events. If EventType isn't specified,
     * this returns a list of all device events in reverse chronological order.
     * If EventType is specified, this returns a list of device events for that
     * EventType in reverse chronological order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTION_STATUS, DEVICE_STATUS
     */
    private String eventType;

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for
     * pagination of results from this action. If this parameter is specified,
     * the response only includes results beyond the token, up to the value
     * specified by MaxResults. When the end of results is reached, the response
     * has a value of null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to include in the response. The default
     * value is 50. If more results exist than the specified MaxResults value, a
     * token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ARN of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of a device.
     *         </p>
     */
    public String getDeviceArn() {
        return deviceArn;
    }

    /**
     * <p>
     * The ARN of a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param deviceArn <p>
     *            The ARN of a device.
     *            </p>
     */
    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The ARN of a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param deviceArn <p>
     *            The ARN of a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeviceEventsRequest withDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
        return this;
    }

    /**
     * <p>
     * The event type to filter device events. If EventType isn't specified,
     * this returns a list of all device events in reverse chronological order.
     * If EventType is specified, this returns a list of device events for that
     * EventType in reverse chronological order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTION_STATUS, DEVICE_STATUS
     *
     * @return <p>
     *         The event type to filter device events. If EventType isn't
     *         specified, this returns a list of all device events in reverse
     *         chronological order. If EventType is specified, this returns a
     *         list of device events for that EventType in reverse chronological
     *         order.
     *         </p>
     * @see DeviceEventType
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * <p>
     * The event type to filter device events. If EventType isn't specified,
     * this returns a list of all device events in reverse chronological order.
     * If EventType is specified, this returns a list of device events for that
     * EventType in reverse chronological order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTION_STATUS, DEVICE_STATUS
     *
     * @param eventType <p>
     *            The event type to filter device events. If EventType isn't
     *            specified, this returns a list of all device events in reverse
     *            chronological order. If EventType is specified, this returns a
     *            list of device events for that EventType in reverse
     *            chronological order.
     *            </p>
     * @see DeviceEventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The event type to filter device events. If EventType isn't specified,
     * this returns a list of all device events in reverse chronological order.
     * If EventType is specified, this returns a list of device events for that
     * EventType in reverse chronological order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTION_STATUS, DEVICE_STATUS
     *
     * @param eventType <p>
     *            The event type to filter device events. If EventType isn't
     *            specified, this returns a list of all device events in reverse
     *            chronological order. If EventType is specified, this returns a
     *            list of device events for that EventType in reverse
     *            chronological order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceEventType
     */
    public ListDeviceEventsRequest withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * <p>
     * The event type to filter device events. If EventType isn't specified,
     * this returns a list of all device events in reverse chronological order.
     * If EventType is specified, this returns a list of device events for that
     * EventType in reverse chronological order.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTION_STATUS, DEVICE_STATUS
     *
     * @param eventType <p>
     *            The event type to filter device events. If EventType isn't
     *            specified, this returns a list of all device events in reverse
     *            chronological order. If EventType is specified, this returns a
     *            list of device events for that EventType in reverse
     *            chronological order.
     *            </p>
     * @see DeviceEventType
     */
    public void setEventType(DeviceEventType eventType) {
        this.eventType = eventType.toString();
    }

    /**
     * <p>
     * The event type to filter device events. If EventType isn't specified,
     * this returns a list of all device events in reverse chronological order.
     * If EventType is specified, this returns a list of device events for that
     * EventType in reverse chronological order.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONNECTION_STATUS, DEVICE_STATUS
     *
     * @param eventType <p>
     *            The event type to filter device events. If EventType isn't
     *            specified, this returns a list of all device events in reverse
     *            chronological order. If EventType is specified, this returns a
     *            list of device events for that EventType in reverse
     *            chronological order.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeviceEventType
     */
    public ListDeviceEventsRequest withEventType(DeviceEventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for
     * pagination of results from this action. If this parameter is specified,
     * the response only includes results beyond the token, up to the value
     * specified by MaxResults. When the end of results is reached, the response
     * has a value of null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @return <p>
     *         An optional token returned from a prior request. Use this token
     *         for pagination of results from this action. If this parameter is
     *         specified, the response only includes results beyond the token,
     *         up to the value specified by MaxResults. When the end of results
     *         is reached, the response has a value of null.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for
     * pagination of results from this action. If this parameter is specified,
     * the response only includes results beyond the token, up to the value
     * specified by MaxResults. When the end of results is reached, the response
     * has a value of null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            An optional token returned from a prior request. Use this
     *            token for pagination of results from this action. If this
     *            parameter is specified, the response only includes results
     *            beyond the token, up to the value specified by MaxResults.
     *            When the end of results is reached, the response has a value
     *            of null.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for
     * pagination of results from this action. If this parameter is specified,
     * the response only includes results beyond the token, up to the value
     * specified by MaxResults. When the end of results is reached, the response
     * has a value of null.
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
     *            parameter is specified, the response only includes results
     *            beyond the token, up to the value specified by MaxResults.
     *            When the end of results is reached, the response has a value
     *            of null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeviceEventsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. The default
     * value is 50. If more results exist than the specified MaxResults value, a
     * token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The maximum number of results to include in the response. The
     *         default value is 50. If more results exist than the specified
     *         MaxResults value, a token is included in the response so that the
     *         remaining results can be retrieved.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. The default
     * value is 50. If more results exist than the specified MaxResults value, a
     * token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to include in the response. The
     *            default value is 50. If more results exist than the specified
     *            MaxResults value, a token is included in the response so that
     *            the remaining results can be retrieved.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. The default
     * value is 50. If more results exist than the specified MaxResults value, a
     * token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to include in the response. The
     *            default value is 50. If more results exist than the specified
     *            MaxResults value, a token is included in the response so that
     *            the remaining results can be retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDeviceEventsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getDeviceArn() != null)
            sb.append("DeviceArn: " + getDeviceArn() + ",");
        if (getEventType() != null)
            sb.append("EventType: " + getEventType() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeviceEventsRequest == false)
            return false;
        ListDeviceEventsRequest other = (ListDeviceEventsRequest) obj;

        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null
                && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null
                && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
