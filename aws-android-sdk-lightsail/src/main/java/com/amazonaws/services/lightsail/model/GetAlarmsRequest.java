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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about the configured alarms. Specify an alarm name in
 * your request to return information about a specific alarm, or specify a
 * monitored resource name to return information about all alarms for a specific
 * resource.
 * </p>
 * <p>
 * An alarm is used to monitor a single metric for one of your resources. When a
 * metric condition is met, the alarm can notify you by email, SMS text message,
 * and a banner displayed on the Amazon Lightsail console. For more information,
 * see <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms"
 * >Alarms in Amazon Lightsail</a>.
 * </p>
 */
public class GetAlarmsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * Specify an alarm name to return information about a specific alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String alarmName;

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetAlarms</code> request.
     * If your results are paginated, the response will return a next page token
     * that you can specify as the page token in a subsequent request.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * The name of the Lightsail resource being monitored by the alarm.
     * </p>
     * <p>
     * Specify a monitored resource name to return information about all alarms
     * for a specific resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String monitoredResourceName;

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * Specify an alarm name to return information about a specific alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the alarm.
     *         </p>
     *         <p>
     *         Specify an alarm name to return information about a specific
     *         alarm.
     *         </p>
     */
    public String getAlarmName() {
        return alarmName;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * Specify an alarm name to return information about a specific alarm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param alarmName <p>
     *            The name of the alarm.
     *            </p>
     *            <p>
     *            Specify an alarm name to return information about a specific
     *            alarm.
     *            </p>
     */
    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The name of the alarm.
     * </p>
     * <p>
     * Specify an alarm name to return information about a specific alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param alarmName <p>
     *            The name of the alarm.
     *            </p>
     *            <p>
     *            Specify an alarm name to return information about a specific
     *            alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAlarmsRequest withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetAlarms</code> request.
     * If your results are paginated, the response will return a next page token
     * that you can specify as the page token in a subsequent request.
     * </p>
     *
     * @return <p>
     *         The token to advance to the next page of results from your
     *         request.
     *         </p>
     *         <p>
     *         To get a page token, perform an initial <code>GetAlarms</code>
     *         request. If your results are paginated, the response will return
     *         a next page token that you can specify as the page token in a
     *         subsequent request.
     *         </p>
     */
    public String getPageToken() {
        return pageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetAlarms</code> request.
     * If your results are paginated, the response will return a next page token
     * that you can specify as the page token in a subsequent request.
     * </p>
     *
     * @param pageToken <p>
     *            The token to advance to the next page of results from your
     *            request.
     *            </p>
     *            <p>
     *            To get a page token, perform an initial <code>GetAlarms</code>
     *            request. If your results are paginated, the response will
     *            return a next page token that you can specify as the page
     *            token in a subsequent request.
     *            </p>
     */
    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetAlarms</code> request.
     * If your results are paginated, the response will return a next page token
     * that you can specify as the page token in a subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pageToken <p>
     *            The token to advance to the next page of results from your
     *            request.
     *            </p>
     *            <p>
     *            To get a page token, perform an initial <code>GetAlarms</code>
     *            request. If your results are paginated, the response will
     *            return a next page token that you can specify as the page
     *            token in a subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAlarmsRequest withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    /**
     * <p>
     * The name of the Lightsail resource being monitored by the alarm.
     * </p>
     * <p>
     * Specify a monitored resource name to return information about all alarms
     * for a specific resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the Lightsail resource being monitored by the alarm.
     *         </p>
     *         <p>
     *         Specify a monitored resource name to return information about all
     *         alarms for a specific resource.
     *         </p>
     */
    public String getMonitoredResourceName() {
        return monitoredResourceName;
    }

    /**
     * <p>
     * The name of the Lightsail resource being monitored by the alarm.
     * </p>
     * <p>
     * Specify a monitored resource name to return information about all alarms
     * for a specific resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param monitoredResourceName <p>
     *            The name of the Lightsail resource being monitored by the
     *            alarm.
     *            </p>
     *            <p>
     *            Specify a monitored resource name to return information about
     *            all alarms for a specific resource.
     *            </p>
     */
    public void setMonitoredResourceName(String monitoredResourceName) {
        this.monitoredResourceName = monitoredResourceName;
    }

    /**
     * <p>
     * The name of the Lightsail resource being monitored by the alarm.
     * </p>
     * <p>
     * Specify a monitored resource name to return information about all alarms
     * for a specific resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param monitoredResourceName <p>
     *            The name of the Lightsail resource being monitored by the
     *            alarm.
     *            </p>
     *            <p>
     *            Specify a monitored resource name to return information about
     *            all alarms for a specific resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAlarmsRequest withMonitoredResourceName(String monitoredResourceName) {
        this.monitoredResourceName = monitoredResourceName;
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
        if (getAlarmName() != null)
            sb.append("alarmName: " + getAlarmName() + ",");
        if (getPageToken() != null)
            sb.append("pageToken: " + getPageToken() + ",");
        if (getMonitoredResourceName() != null)
            sb.append("monitoredResourceName: " + getMonitoredResourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getMonitoredResourceName() == null) ? 0 : getMonitoredResourceName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAlarmsRequest == false)
            return false;
        GetAlarmsRequest other = (GetAlarmsRequest) obj;

        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null
                && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null
                && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        if (other.getMonitoredResourceName() == null ^ this.getMonitoredResourceName() == null)
            return false;
        if (other.getMonitoredResourceName() != null
                && other.getMonitoredResourceName().equals(this.getMonitoredResourceName()) == false)
            return false;
        return true;
    }
}
