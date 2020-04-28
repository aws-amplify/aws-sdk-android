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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for OutputDestinationSettings
 */
public class OutputDestinationSettings implements Serializable {
    /**
     * key used to extract the password from EC2 Parameter store
     */
    private String passwordParam;

    /**
     * Stream name for RTMP destinations (URLs of type rtmp://)
     */
    private String streamName;

    /**
     * A URL specifying a destination
     */
    private String url;

    /**
     * username for destination
     */
    private String username;

    /**
     * key used to extract the password from EC2 Parameter store
     *
     * @return key used to extract the password from EC2 Parameter store
     */
    public String getPasswordParam() {
        return passwordParam;
    }

    /**
     * key used to extract the password from EC2 Parameter store
     *
     * @param passwordParam key used to extract the password from EC2 Parameter
     *            store
     */
    public void setPasswordParam(String passwordParam) {
        this.passwordParam = passwordParam;
    }

    /**
     * key used to extract the password from EC2 Parameter store
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param passwordParam key used to extract the password from EC2 Parameter
     *            store
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDestinationSettings withPasswordParam(String passwordParam) {
        this.passwordParam = passwordParam;
        return this;
    }

    /**
     * Stream name for RTMP destinations (URLs of type rtmp://)
     *
     * @return Stream name for RTMP destinations (URLs of type rtmp://)
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * Stream name for RTMP destinations (URLs of type rtmp://)
     *
     * @param streamName Stream name for RTMP destinations (URLs of type
     *            rtmp://)
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * Stream name for RTMP destinations (URLs of type rtmp://)
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streamName Stream name for RTMP destinations (URLs of type
     *            rtmp://)
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDestinationSettings withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * A URL specifying a destination
     *
     * @return A URL specifying a destination
     */
    public String getUrl() {
        return url;
    }

    /**
     * A URL specifying a destination
     *
     * @param url A URL specifying a destination
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * A URL specifying a destination
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url A URL specifying a destination
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDestinationSettings withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * username for destination
     *
     * @return username for destination
     */
    public String getUsername() {
        return username;
    }

    /**
     * username for destination
     *
     * @param username username for destination
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * username for destination
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param username username for destination
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputDestinationSettings withUsername(String username) {
        this.username = username;
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
        if (getPasswordParam() != null)
            sb.append("PasswordParam: " + getPasswordParam() + ",");
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getUrl() != null)
            sb.append("Url: " + getUrl() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPasswordParam() == null) ? 0 : getPasswordParam().hashCode());
        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputDestinationSettings == false)
            return false;
        OutputDestinationSettings other = (OutputDestinationSettings) obj;

        if (other.getPasswordParam() == null ^ this.getPasswordParam() == null)
            return false;
        if (other.getPasswordParam() != null
                && other.getPasswordParam().equals(this.getPasswordParam()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }
}
