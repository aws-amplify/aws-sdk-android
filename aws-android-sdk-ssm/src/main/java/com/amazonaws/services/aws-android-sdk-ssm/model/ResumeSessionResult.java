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


public class ResumeSessionResult implements Serializable {
    /**
     * <p>The ID of the session.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 96<br/>
     */
    private String sessionId;

    /**
     * <p>An encrypted token value containing session and caller information. Used to authenticate the connection to the instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 300<br/>
     */
    private String tokenValue;

    /**
     * <p>A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive output from the instance. Format: <code>wss://ssmmessages.<b>region</b>.amazonaws.com/v1/data-channel/<b>session-id</b>?stream=(input|output)</code>.</p> <p> <b>region</b> represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as <code>us-east-2</code> for the US East (Ohio) Region. For a list of supported <b>region</b> values, see the <b>Region</b> column in <a href="http://docs.aws.amazon.com/general/latest/gr/ssm.html#ssm_region">Systems Manager service endpoints</a> in the <i>AWS General Reference</i>.</p> <p> <b>session-id</b> represents the ID of a Session Manager session, such as <code>1a2b3c4dEXAMPLE</code>.</p>
     */
    private String streamUrl;

    /**
     * <p>The ID of the session.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 96<br/>
     *
     * @return <p>The ID of the session.</p>
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * <p>The ID of the session.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 96<br/>
     *
     * @param sessionId <p>The ID of the session.</p>
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>The ID of the session.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 96<br/>
     *
     * @param sessionId <p>The ID of the session.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResumeSessionResult withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * <p>An encrypted token value containing session and caller information. Used to authenticate the connection to the instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 300<br/>
     *
     * @return <p>An encrypted token value containing session and caller information. Used to authenticate the connection to the instance.</p>
     */
    public String getTokenValue() {
        return tokenValue;
    }

    /**
     * <p>An encrypted token value containing session and caller information. Used to authenticate the connection to the instance.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 300<br/>
     *
     * @param tokenValue <p>An encrypted token value containing session and caller information. Used to authenticate the connection to the instance.</p>
     */
    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    /**
     * <p>An encrypted token value containing session and caller information. Used to authenticate the connection to the instance.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 300<br/>
     *
     * @param tokenValue <p>An encrypted token value containing session and caller information. Used to authenticate the connection to the instance.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResumeSessionResult withTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
        return this;
    }

    /**
     * <p>A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive output from the instance. Format: <code>wss://ssmmessages.<b>region</b>.amazonaws.com/v1/data-channel/<b>session-id</b>?stream=(input|output)</code>.</p> <p> <b>region</b> represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as <code>us-east-2</code> for the US East (Ohio) Region. For a list of supported <b>region</b> values, see the <b>Region</b> column in <a href="http://docs.aws.amazon.com/general/latest/gr/ssm.html#ssm_region">Systems Manager service endpoints</a> in the <i>AWS General Reference</i>.</p> <p> <b>session-id</b> represents the ID of a Session Manager session, such as <code>1a2b3c4dEXAMPLE</code>.</p>
     *
     * @return <p>A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive output from the instance. Format: <code>wss://ssmmessages.<b>region</b>.amazonaws.com/v1/data-channel/<b>session-id</b>?stream=(input|output)</code>.</p> <p> <b>region</b> represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as <code>us-east-2</code> for the US East (Ohio) Region. For a list of supported <b>region</b> values, see the <b>Region</b> column in <a href="http://docs.aws.amazon.com/general/latest/gr/ssm.html#ssm_region">Systems Manager service endpoints</a> in the <i>AWS General Reference</i>.</p> <p> <b>session-id</b> represents the ID of a Session Manager session, such as <code>1a2b3c4dEXAMPLE</code>.</p>
     */
    public String getStreamUrl() {
        return streamUrl;
    }

    /**
     * <p>A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive output from the instance. Format: <code>wss://ssmmessages.<b>region</b>.amazonaws.com/v1/data-channel/<b>session-id</b>?stream=(input|output)</code>.</p> <p> <b>region</b> represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as <code>us-east-2</code> for the US East (Ohio) Region. For a list of supported <b>region</b> values, see the <b>Region</b> column in <a href="http://docs.aws.amazon.com/general/latest/gr/ssm.html#ssm_region">Systems Manager service endpoints</a> in the <i>AWS General Reference</i>.</p> <p> <b>session-id</b> represents the ID of a Session Manager session, such as <code>1a2b3c4dEXAMPLE</code>.</p>
     *
     * @param streamUrl <p>A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive output from the instance. Format: <code>wss://ssmmessages.<b>region</b>.amazonaws.com/v1/data-channel/<b>session-id</b>?stream=(input|output)</code>.</p> <p> <b>region</b> represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as <code>us-east-2</code> for the US East (Ohio) Region. For a list of supported <b>region</b> values, see the <b>Region</b> column in <a href="http://docs.aws.amazon.com/general/latest/gr/ssm.html#ssm_region">Systems Manager service endpoints</a> in the <i>AWS General Reference</i>.</p> <p> <b>session-id</b> represents the ID of a Session Manager session, such as <code>1a2b3c4dEXAMPLE</code>.</p>
     */
    public void setStreamUrl(String streamUrl) {
        this.streamUrl = streamUrl;
    }

    /**
     * <p>A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive output from the instance. Format: <code>wss://ssmmessages.<b>region</b>.amazonaws.com/v1/data-channel/<b>session-id</b>?stream=(input|output)</code>.</p> <p> <b>region</b> represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as <code>us-east-2</code> for the US East (Ohio) Region. For a list of supported <b>region</b> values, see the <b>Region</b> column in <a href="http://docs.aws.amazon.com/general/latest/gr/ssm.html#ssm_region">Systems Manager service endpoints</a> in the <i>AWS General Reference</i>.</p> <p> <b>session-id</b> represents the ID of a Session Manager session, such as <code>1a2b3c4dEXAMPLE</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param streamUrl <p>A URL back to SSM Agent on the instance that the Session Manager client uses to send commands and receive output from the instance. Format: <code>wss://ssmmessages.<b>region</b>.amazonaws.com/v1/data-channel/<b>session-id</b>?stream=(input|output)</code>.</p> <p> <b>region</b> represents the Region identifier for an AWS Region supported by AWS Systems Manager, such as <code>us-east-2</code> for the US East (Ohio) Region. For a list of supported <b>region</b> values, see the <b>Region</b> column in <a href="http://docs.aws.amazon.com/general/latest/gr/ssm.html#ssm_region">Systems Manager service endpoints</a> in the <i>AWS General Reference</i>.</p> <p> <b>session-id</b> represents the ID of a Session Manager session, such as <code>1a2b3c4dEXAMPLE</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResumeSessionResult withStreamUrl(String streamUrl) {
        this.streamUrl = streamUrl;
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
        if (getSessionId() != null) sb.append("SessionId: " + getSessionId() + ",");
        if (getTokenValue() != null) sb.append("TokenValue: " + getTokenValue() + ",");
        if (getStreamUrl() != null) sb.append("StreamUrl: " + getStreamUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getTokenValue() == null) ? 0 : getTokenValue().hashCode());
        hashCode = prime * hashCode + ((getStreamUrl() == null) ? 0 : getStreamUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResumeSessionResult == false) return false;
        ResumeSessionResult other = (ResumeSessionResult)obj;

        if (other.getSessionId() == null ^ this.getSessionId() == null) return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false) return false;
        if (other.getTokenValue() == null ^ this.getTokenValue() == null) return false;
        if (other.getTokenValue() != null && other.getTokenValue().equals(this.getTokenValue()) == false) return false;
        if (other.getStreamUrl() == null ^ this.getStreamUrl() == null) return false;
        if (other.getStreamUrl() != null && other.getStreamUrl().equals(this.getStreamUrl()) == false) return false;
        return true;
    }
}
