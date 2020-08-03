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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Reconnects a session to an instance after it has been disconnected. Connections can be resumed for disconnected sessions, but not terminated sessions.</p> <note> <p>This command is primarily for use by client machines to automatically reconnect during intermittent network issues. It is not intended for any other use.</p> </note>
 */
public class ResumeSessionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The ID of the disconnected session to resume.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 96<br/>
     */
    private String sessionId;

    /**
     * <p>The ID of the disconnected session to resume.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 96<br/>
     *
     * @return <p>The ID of the disconnected session to resume.</p>
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * <p>The ID of the disconnected session to resume.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 96<br/>
     *
     * @param sessionId <p>The ID of the disconnected session to resume.</p>
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>The ID of the disconnected session to resume.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 96<br/>
     *
     * @param sessionId <p>The ID of the disconnected session to resume.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ResumeSessionRequest withSessionId(String sessionId) {
        this.sessionId = sessionId;
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
        if (getSessionId() != null) sb.append("SessionId: " + getSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResumeSessionRequest == false) return false;
        ResumeSessionRequest other = (ResumeSessionRequest)obj;

        if (other.getSessionId() == null ^ this.getSessionId() == null) return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false) return false;
        return true;
    }
}
