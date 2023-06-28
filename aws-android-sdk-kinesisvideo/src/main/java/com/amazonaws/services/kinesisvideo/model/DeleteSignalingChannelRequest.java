/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a specified signaling channel. <code>DeleteSignalingChannel</code> is
 * an asynchronous operation. If you don't specify the channel's current
 * version, the most recent version is deleted.
 * </p>
 */
public class DeleteSignalingChannelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signaling channel that you want to
     * delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     */
    private String channelARN;

    /**
     * <p>
     * The current version of the signaling channel that you want to delete. You
     * can obtain the current version by invoking the
     * <code>DescribeSignalingChannel</code> or
     * <code>ListSignalingChannels</code> API operations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     */
    private String currentVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signaling channel that you want to
     * delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the signaling channel that you
     *         want to delete.
     *         </p>
     */
    public String getChannelARN() {
        return channelARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signaling channel that you want to
     * delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param channelARN <p>
     *            The Amazon Resource Name (ARN) of the signaling channel that
     *            you want to delete.
     *            </p>
     */
    public void setChannelARN(String channelARN) {
        this.channelARN = channelARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signaling channel that you want to
     * delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param channelARN <p>
     *            The Amazon Resource Name (ARN) of the signaling channel that
     *            you want to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteSignalingChannelRequest withChannelARN(String channelARN) {
        this.channelARN = channelARN;
        return this;
    }

    /**
     * <p>
     * The current version of the signaling channel that you want to delete. You
     * can obtain the current version by invoking the
     * <code>DescribeSignalingChannel</code> or
     * <code>ListSignalingChannels</code> API operations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @return <p>
     *         The current version of the signaling channel that you want to
     *         delete. You can obtain the current version by invoking the
     *         <code>DescribeSignalingChannel</code> or
     *         <code>ListSignalingChannels</code> API operations.
     *         </p>
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    /**
     * <p>
     * The current version of the signaling channel that you want to delete. You
     * can obtain the current version by invoking the
     * <code>DescribeSignalingChannel</code> or
     * <code>ListSignalingChannels</code> API operations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @param currentVersion <p>
     *            The current version of the signaling channel that you want to
     *            delete. You can obtain the current version by invoking the
     *            <code>DescribeSignalingChannel</code> or
     *            <code>ListSignalingChannels</code> API operations.
     *            </p>
     */
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The current version of the signaling channel that you want to delete. You
     * can obtain the current version by invoking the
     * <code>DescribeSignalingChannel</code> or
     * <code>ListSignalingChannels</code> API operations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @param currentVersion <p>
     *            The current version of the signaling channel that you want to
     *            delete. You can obtain the current version by invoking the
     *            <code>DescribeSignalingChannel</code> or
     *            <code>ListSignalingChannels</code> API operations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteSignalingChannelRequest withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
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
        if (getChannelARN() != null)
            sb.append("ChannelARN: " + getChannelARN() + ",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: " + getCurrentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelARN() == null) ? 0 : getChannelARN().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSignalingChannelRequest == false)
            return false;
        DeleteSignalingChannelRequest other = (DeleteSignalingChannelRequest) obj;

        if (other.getChannelARN() == null ^ this.getChannelARN() == null)
            return false;
        if (other.getChannelARN() != null
                && other.getChannelARN().equals(this.getChannelARN()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null
                && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        return true;
    }
}
