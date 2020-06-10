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

public class GetAlarmsResult implements Serializable {
    /**
     * <p>
     * An array of objects that describe the alarms.
     * </p>
     */
    private java.util.List<Alarm> alarms;

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetAlarms</code>
     * request and specify the next page token using the <code>pageToken</code>
     * parameter.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of objects that describe the alarms.
     * </p>
     *
     * @return <p>
     *         An array of objects that describe the alarms.
     *         </p>
     */
    public java.util.List<Alarm> getAlarms() {
        return alarms;
    }

    /**
     * <p>
     * An array of objects that describe the alarms.
     * </p>
     *
     * @param alarms <p>
     *            An array of objects that describe the alarms.
     *            </p>
     */
    public void setAlarms(java.util.Collection<Alarm> alarms) {
        if (alarms == null) {
            this.alarms = null;
            return;
        }

        this.alarms = new java.util.ArrayList<Alarm>(alarms);
    }

    /**
     * <p>
     * An array of objects that describe the alarms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarms <p>
     *            An array of objects that describe the alarms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAlarmsResult withAlarms(Alarm... alarms) {
        if (getAlarms() == null) {
            this.alarms = new java.util.ArrayList<Alarm>(alarms.length);
        }
        for (Alarm value : alarms) {
            this.alarms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the alarms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarms <p>
     *            An array of objects that describe the alarms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAlarmsResult withAlarms(java.util.Collection<Alarm> alarms) {
        setAlarms(alarms);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetAlarms</code>
     * request and specify the next page token using the <code>pageToken</code>
     * parameter.
     * </p>
     *
     * @return <p>
     *         The token to advance to the next page of resutls from your
     *         request.
     *         </p>
     *         <p>
     *         A next page token is not returned if there are no more results to
     *         display.
     *         </p>
     *         <p>
     *         To get the next page of results, perform another
     *         <code>GetAlarms</code> request and specify the next page token
     *         using the <code>pageToken</code> parameter.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetAlarms</code>
     * request and specify the next page token using the <code>pageToken</code>
     * parameter.
     * </p>
     *
     * @param nextPageToken <p>
     *            The token to advance to the next page of resutls from your
     *            request.
     *            </p>
     *            <p>
     *            A next page token is not returned if there are no more results
     *            to display.
     *            </p>
     *            <p>
     *            To get the next page of results, perform another
     *            <code>GetAlarms</code> request and specify the next page token
     *            using the <code>pageToken</code> parameter.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of resutls from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to
     * display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetAlarms</code>
     * request and specify the next page token using the <code>pageToken</code>
     * parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextPageToken <p>
     *            The token to advance to the next page of resutls from your
     *            request.
     *            </p>
     *            <p>
     *            A next page token is not returned if there are no more results
     *            to display.
     *            </p>
     *            <p>
     *            To get the next page of results, perform another
     *            <code>GetAlarms</code> request and specify the next page token
     *            using the <code>pageToken</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAlarmsResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getAlarms() != null)
            sb.append("alarms: " + getAlarms() + ",");
        if (getNextPageToken() != null)
            sb.append("nextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarms() == null) ? 0 : getAlarms().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAlarmsResult == false)
            return false;
        GetAlarmsResult other = (GetAlarmsResult) obj;

        if (other.getAlarms() == null ^ this.getAlarms() == null)
            return false;
        if (other.getAlarms() != null && other.getAlarms().equals(this.getAlarms()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
