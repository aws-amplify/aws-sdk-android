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

package com.amazonaws.services.awsopsworkscm.model;

import java.io.Serializable;

/**
 * <p>
 * An event that is related to the server, such as the start of maintenance or
 * backup.
 * </p>
 */
public class ServerEvent implements Serializable {
    /**
     * <p>
     * The time when the event occurred.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The name of the server on or for which the event occurred.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String serverName;

    /**
     * <p>
     * A human-readable informational or status message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String message;

    /**
     * <p>
     * The Amazon S3 URL of the event's log file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     */
    private String logUrl;

    /**
     * <p>
     * The time when the event occurred.
     * </p>
     *
     * @return <p>
     *         The time when the event occurred.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The time when the event occurred.
     * </p>
     *
     * @param createdAt <p>
     *            The time when the event occurred.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the event occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The time when the event occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerEvent withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The name of the server on or for which the event occurred.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         The name of the server on or for which the event occurred.
     *         </p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>
     * The name of the server on or for which the event occurred.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param serverName <p>
     *            The name of the server on or for which the event occurred.
     *            </p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server on or for which the event occurred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param serverName <p>
     *            The name of the server on or for which the event occurred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerEvent withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * <p>
     * A human-readable informational or status message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         A human-readable informational or status message.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A human-readable informational or status message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param message <p>
     *            A human-readable informational or status message.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A human-readable informational or status message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param message <p>
     *            A human-readable informational or status message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerEvent withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 URL of the event's log file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @return <p>
     *         The Amazon S3 URL of the event's log file.
     *         </p>
     */
    public String getLogUrl() {
        return logUrl;
    }

    /**
     * <p>
     * The Amazon S3 URL of the event's log file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param logUrl <p>
     *            The Amazon S3 URL of the event's log file.
     *            </p>
     */
    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    /**
     * <p>
     * The Amazon S3 URL of the event's log file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>(?s).*<br/>
     *
     * @param logUrl <p>
     *            The Amazon S3 URL of the event's log file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServerEvent withLogUrl(String logUrl) {
        this.logUrl = logUrl;
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getServerName() != null)
            sb.append("ServerName: " + getServerName() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getLogUrl() != null)
            sb.append("LogUrl: " + getLogUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getLogUrl() == null) ? 0 : getLogUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerEvent == false)
            return false;
        ServerEvent other = (ServerEvent) obj;

        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null
                && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getLogUrl() == null ^ this.getLogUrl() == null)
            return false;
        if (other.getLogUrl() != null && other.getLogUrl().equals(this.getLogUrl()) == false)
            return false;
        return true;
    }
}
