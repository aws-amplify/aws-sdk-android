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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves the device position history from a tracker resource within a
 * specified range of time.
 * </p>
 * <note>
 * <p>
 * Device positions are deleted after 30 days.
 * </p>
 * </note>
 */
public class GetDevicePositionHistoryRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The device whose position history you want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     */
    private String deviceId;

    /**
     * <p>
     * Specify the end time for the position history in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the
     * value will be the time that the request is made.
     * </p>
     * <p>
     * Requirement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The time specified for <code>EndTimeExclusive</code> must be after the
     * time for <code>StartTimeInclusive</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date endTimeExclusive;

    /**
     * <p>
     * The pagination token specifying which page of results to return in the
     * response. If no token is provided, the default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Specify the start time for the position history in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the
     * value will be 24 hours prior to the time that the request is made.
     * </p>
     * <p>
     * Requirement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The time specified for <code>StartTimeInclusive</code> must be before
     * <code>EndTimeExclusive</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date startTimeInclusive;

    /**
     * <p>
     * The tracker resource receiving the request for the device position
     * history.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     */
    private String trackerName;

    /**
     * <p>
     * The device whose position history you want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     *
     * @return <p>
     *         The device whose position history you want to retrieve.
     *         </p>
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * <p>
     * The device whose position history you want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     *
     * @param deviceId <p>
     *            The device whose position history you want to retrieve.
     *            </p>
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The device whose position history you want to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\p{L}\p{N}]+$<br/>
     *
     * @param deviceId <p>
     *            The device whose position history you want to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDevicePositionHistoryRequest withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * <p>
     * Specify the end time for the position history in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the
     * value will be the time that the request is made.
     * </p>
     * <p>
     * Requirement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The time specified for <code>EndTimeExclusive</code> must be after the
     * time for <code>StartTimeInclusive</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specify the end time for the position history in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *         ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By
     *         default, the value will be the time that the request is made.
     *         </p>
     *         <p>
     *         Requirement:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The time specified for <code>EndTimeExclusive</code> must be
     *         after the time for <code>StartTimeInclusive</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Date getEndTimeExclusive() {
        return endTimeExclusive;
    }

    /**
     * <p>
     * Specify the end time for the position history in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the
     * value will be the time that the request is made.
     * </p>
     * <p>
     * Requirement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The time specified for <code>EndTimeExclusive</code> must be after the
     * time for <code>StartTimeInclusive</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param endTimeExclusive <p>
     *            Specify the end time for the position history in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By
     *            default, the value will be the time that the request is made.
     *            </p>
     *            <p>
     *            Requirement:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The time specified for <code>EndTimeExclusive</code> must be
     *            after the time for <code>StartTimeInclusive</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setEndTimeExclusive(java.util.Date endTimeExclusive) {
        this.endTimeExclusive = endTimeExclusive;
    }

    /**
     * <p>
     * Specify the end time for the position history in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the
     * value will be the time that the request is made.
     * </p>
     * <p>
     * Requirement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The time specified for <code>EndTimeExclusive</code> must be after the
     * time for <code>StartTimeInclusive</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTimeExclusive <p>
     *            Specify the end time for the position history in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By
     *            default, the value will be the time that the request is made.
     *            </p>
     *            <p>
     *            Requirement:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The time specified for <code>EndTimeExclusive</code> must be
     *            after the time for <code>StartTimeInclusive</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDevicePositionHistoryRequest withEndTimeExclusive(java.util.Date endTimeExclusive) {
        this.endTimeExclusive = endTimeExclusive;
        return this;
    }

    /**
     * <p>
     * The pagination token specifying which page of results to return in the
     * response. If no token is provided, the default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         The pagination token specifying which page of results to return
     *         in the response. If no token is provided, the default page is the
     *         first page.
     *         </p>
     *         <p>
     *         Default value: <code>null</code>
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination token specifying which page of results to return in the
     * response. If no token is provided, the default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param nextToken <p>
     *            The pagination token specifying which page of results to
     *            return in the response. If no token is provided, the default
     *            page is the first page.
     *            </p>
     *            <p>
     *            Default value: <code>null</code>
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token specifying which page of results to return in the
     * response. If no token is provided, the default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param nextToken <p>
     *            The pagination token specifying which page of results to
     *            return in the response. If no token is provided, the default
     *            page is the first page.
     *            </p>
     *            <p>
     *            Default value: <code>null</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDevicePositionHistoryRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Specify the start time for the position history in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the
     * value will be 24 hours prior to the time that the request is made.
     * </p>
     * <p>
     * Requirement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The time specified for <code>StartTimeInclusive</code> must be before
     * <code>EndTimeExclusive</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specify the start time for the position history in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">
     *         ISO 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By
     *         default, the value will be 24 hours prior to the time that the
     *         request is made.
     *         </p>
     *         <p>
     *         Requirement:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The time specified for <code>StartTimeInclusive</code> must be
     *         before <code>EndTimeExclusive</code>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Date getStartTimeInclusive() {
        return startTimeInclusive;
    }

    /**
     * <p>
     * Specify the start time for the position history in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the
     * value will be 24 hours prior to the time that the request is made.
     * </p>
     * <p>
     * Requirement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The time specified for <code>StartTimeInclusive</code> must be before
     * <code>EndTimeExclusive</code>.
     * </p>
     * </li>
     * </ul>
     *
     * @param startTimeInclusive <p>
     *            Specify the start time for the position history in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By
     *            default, the value will be 24 hours prior to the time that the
     *            request is made.
     *            </p>
     *            <p>
     *            Requirement:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The time specified for <code>StartTimeInclusive</code> must be
     *            before <code>EndTimeExclusive</code>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStartTimeInclusive(java.util.Date startTimeInclusive) {
        this.startTimeInclusive = startTimeInclusive;
    }

    /**
     * <p>
     * Specify the start time for the position history in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     * 8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By default, the
     * value will be 24 hours prior to the time that the request is made.
     * </p>
     * <p>
     * Requirement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The time specified for <code>StartTimeInclusive</code> must be before
     * <code>EndTimeExclusive</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTimeInclusive <p>
     *            Specify the start time for the position history in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html"> ISO
     *            8601</a> format: <code>YYYY-MM-DDThh:mm:ss.sssZ</code>. By
     *            default, the value will be 24 hours prior to the time that the
     *            request is made.
     *            </p>
     *            <p>
     *            Requirement:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The time specified for <code>StartTimeInclusive</code> must be
     *            before <code>EndTimeExclusive</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDevicePositionHistoryRequest withStartTimeInclusive(java.util.Date startTimeInclusive) {
        this.startTimeInclusive = startTimeInclusive;
        return this;
    }

    /**
     * <p>
     * The tracker resource receiving the request for the device position
     * history.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @return <p>
     *         The tracker resource receiving the request for the device
     *         position history.
     *         </p>
     */
    public String getTrackerName() {
        return trackerName;
    }

    /**
     * <p>
     * The tracker resource receiving the request for the device position
     * history.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param trackerName <p>
     *            The tracker resource receiving the request for the device
     *            position history.
     *            </p>
     */
    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The tracker resource receiving the request for the device position
     * history.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[-._\w]+$<br/>
     *
     * @param trackerName <p>
     *            The tracker resource receiving the request for the device
     *            position history.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDevicePositionHistoryRequest withTrackerName(String trackerName) {
        this.trackerName = trackerName;
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
        if (getDeviceId() != null)
            sb.append("DeviceId: " + getDeviceId() + ",");
        if (getEndTimeExclusive() != null)
            sb.append("EndTimeExclusive: " + getEndTimeExclusive() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getStartTimeInclusive() != null)
            sb.append("StartTimeInclusive: " + getStartTimeInclusive() + ",");
        if (getTrackerName() != null)
            sb.append("TrackerName: " + getTrackerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode
                + ((getEndTimeExclusive() == null) ? 0 : getEndTimeExclusive().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getStartTimeInclusive() == null) ? 0 : getStartTimeInclusive().hashCode());
        hashCode = prime * hashCode
                + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDevicePositionHistoryRequest == false)
            return false;
        GetDevicePositionHistoryRequest other = (GetDevicePositionHistoryRequest) obj;

        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getEndTimeExclusive() == null ^ this.getEndTimeExclusive() == null)
            return false;
        if (other.getEndTimeExclusive() != null
                && other.getEndTimeExclusive().equals(this.getEndTimeExclusive()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStartTimeInclusive() == null ^ this.getStartTimeInclusive() == null)
            return false;
        if (other.getStartTimeInclusive() != null
                && other.getStartTimeInclusive().equals(this.getStartTimeInclusive()) == false)
            return false;
        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null
                && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        return true;
    }
}
