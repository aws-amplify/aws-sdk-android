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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Describes a filter for Session Manager information.</p>
 */
public class SessionFilter implements Serializable {
    /**
     * <p>The name of the filter.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvokedAfter, InvokedBefore, Target, Owner, Status
     */
    private String key;

    /**
     * <p>The filter value. Valid values for each filter key are as follows:</p> <ul> <li> <p>InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started August 29, 2018, and later.</p> </li> <li> <p>InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started before August 29, 2018.</p> </li> <li> <p>Target: Specify an instance to which session connections have been made.</p> </li> <li> <p>Owner: Specify an AWS user account to see a list of sessions started by that user.</p> </li> <li> <p>Status: Specify a valid session status to see a list of all sessions with that status. Status values you can specify include:</p> <ul> <li> <p>Connected</p> </li> <li> <p>Connecting</p> </li> <li> <p>Disconnected</p> </li> <li> <p>Terminated</p> </li> <li> <p>Terminating</p> </li> <li> <p>Failed</p> </li> </ul> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     */
    private String value;

    /**
     * <p>The name of the filter.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvokedAfter, InvokedBefore, Target, Owner, Status
     *
     * @return <p>The name of the filter.</p>
     *
     * @see SessionFilterKey
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>The name of the filter.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvokedAfter, InvokedBefore, Target, Owner, Status
     *
     * @param key <p>The name of the filter.</p>
     *
     * @see SessionFilterKey
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>The name of the filter.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvokedAfter, InvokedBefore, Target, Owner, Status
     *
     * @param key <p>The name of the filter.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see SessionFilterKey
     */
    public SessionFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>The name of the filter.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvokedAfter, InvokedBefore, Target, Owner, Status
     *
     * @param key <p>The name of the filter.</p>
     *
     * @see SessionFilterKey
     */
    public void setKey(SessionFilterKey key) {
        this.key = key.toString();
    }

    /**
     * <p>The name of the filter.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InvokedAfter, InvokedBefore, Target, Owner, Status
     *
     * @param key <p>The name of the filter.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see SessionFilterKey
     */
    public SessionFilter withKey(SessionFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>The filter value. Valid values for each filter key are as follows:</p> <ul> <li> <p>InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started August 29, 2018, and later.</p> </li> <li> <p>InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started before August 29, 2018.</p> </li> <li> <p>Target: Specify an instance to which session connections have been made.</p> </li> <li> <p>Owner: Specify an AWS user account to see a list of sessions started by that user.</p> </li> <li> <p>Status: Specify a valid session status to see a list of all sessions with that status. Status values you can specify include:</p> <ul> <li> <p>Connected</p> </li> <li> <p>Connecting</p> </li> <li> <p>Disconnected</p> </li> <li> <p>Terminated</p> </li> <li> <p>Terminating</p> </li> <li> <p>Failed</p> </li> </ul> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     *
     * @return <p>The filter value. Valid values for each filter key are as follows:</p> <ul> <li> <p>InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started August 29, 2018, and later.</p> </li> <li> <p>InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started before August 29, 2018.</p> </li> <li> <p>Target: Specify an instance to which session connections have been made.</p> </li> <li> <p>Owner: Specify an AWS user account to see a list of sessions started by that user.</p> </li> <li> <p>Status: Specify a valid session status to see a list of all sessions with that status. Status values you can specify include:</p> <ul> <li> <p>Connected</p> </li> <li> <p>Connecting</p> </li> <li> <p>Disconnected</p> </li> <li> <p>Terminated</p> </li> <li> <p>Terminating</p> </li> <li> <p>Failed</p> </li> </ul> </li> </ul>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>The filter value. Valid values for each filter key are as follows:</p> <ul> <li> <p>InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started August 29, 2018, and later.</p> </li> <li> <p>InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started before August 29, 2018.</p> </li> <li> <p>Target: Specify an instance to which session connections have been made.</p> </li> <li> <p>Owner: Specify an AWS user account to see a list of sessions started by that user.</p> </li> <li> <p>Status: Specify a valid session status to see a list of all sessions with that status. Status values you can specify include:</p> <ul> <li> <p>Connected</p> </li> <li> <p>Connecting</p> </li> <li> <p>Disconnected</p> </li> <li> <p>Terminated</p> </li> <li> <p>Terminating</p> </li> <li> <p>Failed</p> </li> </ul> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     *
     * @param value <p>The filter value. Valid values for each filter key are as follows:</p> <ul> <li> <p>InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started August 29, 2018, and later.</p> </li> <li> <p>InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started before August 29, 2018.</p> </li> <li> <p>Target: Specify an instance to which session connections have been made.</p> </li> <li> <p>Owner: Specify an AWS user account to see a list of sessions started by that user.</p> </li> <li> <p>Status: Specify a valid session status to see a list of all sessions with that status. Status values you can specify include:</p> <ul> <li> <p>Connected</p> </li> <li> <p>Connecting</p> </li> <li> <p>Disconnected</p> </li> <li> <p>Terminated</p> </li> <li> <p>Terminating</p> </li> <li> <p>Failed</p> </li> </ul> </li> </ul>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>The filter value. Valid values for each filter key are as follows:</p> <ul> <li> <p>InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started August 29, 2018, and later.</p> </li> <li> <p>InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started before August 29, 2018.</p> </li> <li> <p>Target: Specify an instance to which session connections have been made.</p> </li> <li> <p>Owner: Specify an AWS user account to see a list of sessions started by that user.</p> </li> <li> <p>Status: Specify a valid session status to see a list of all sessions with that status. Status values you can specify include:</p> <ul> <li> <p>Connected</p> </li> <li> <p>Connecting</p> </li> <li> <p>Disconnected</p> </li> <li> <p>Terminated</p> </li> <li> <p>Terminating</p> </li> <li> <p>Failed</p> </li> </ul> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 400<br/>
     *
     * @param value <p>The filter value. Valid values for each filter key are as follows:</p> <ul> <li> <p>InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started August 29, 2018, and later.</p> </li> <li> <p>InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-08-29T00:00:00Z to see sessions that started before August 29, 2018.</p> </li> <li> <p>Target: Specify an instance to which session connections have been made.</p> </li> <li> <p>Owner: Specify an AWS user account to see a list of sessions started by that user.</p> </li> <li> <p>Status: Specify a valid session status to see a list of all sessions with that status. Status values you can specify include:</p> <ul> <li> <p>Connected</p> </li> <li> <p>Connecting</p> </li> <li> <p>Disconnected</p> </li> <li> <p>Terminated</p> </li> <li> <p>Terminating</p> </li> <li> <p>Failed</p> </li> </ul> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SessionFilter withValue(String value) {
        this.value = value;
        return this;
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
        if (getKey() != null) sb.append("key: " + getKey() + ",");
        if (getValue() != null) sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SessionFilter == false) return false;
        SessionFilter other = (SessionFilter)obj;

        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false;
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false;
        return true;
    }
}
