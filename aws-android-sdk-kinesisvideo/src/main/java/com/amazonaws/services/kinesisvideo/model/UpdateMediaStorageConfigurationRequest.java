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
 * Associates a <code>SignalingChannel</code> to a stream to store the media.
 * There are two signaling modes that can specified :
 * </p>
 * <ul>
 * <li>
 * <p>
 * If the <code>StorageStatus</code> is disabled, no data will be stored, and
 * the <code>StreamARN</code> parameter will not be needed.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the <code>StorageStatus</code> is enabled, the data will be stored in the
 * <code>StreamARN</code> provided.
 * </p>
 * </li>
 * </ul>
 * <important>
 * <p>
 * If <code>StorageStatus</code> is enabled, direct peer-to-peer (master-viewer)
 * connections no longer occur. Peers connect directly to the storage session.
 * You must call the <code>JoinStorageSession</code> API to trigger an SDP offer
 * send and establish a connection between a peer and the storage session.
 * </p>
 * </important>
 */
public class UpdateMediaStorageConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the channel.
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
     * A structure that encapsulates, or contains, the media storage
     * configuration properties.
     * </p>
     */
    private MediaStorageConfiguration mediaStorageConfiguration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the channel.
     *         </p>
     */
    public String getChannelARN() {
        return channelARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param channelARN <p>
     *            The Amazon Resource Name (ARN) of the channel.
     *            </p>
     */
    public void setChannelARN(String channelARN) {
        this.channelARN = channelARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the channel.
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
     *            The Amazon Resource Name (ARN) of the channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMediaStorageConfigurationRequest withChannelARN(String channelARN) {
        this.channelARN = channelARN;
        return this;
    }

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage
     * configuration properties.
     * </p>
     *
     * @return <p>
     *         A structure that encapsulates, or contains, the media storage
     *         configuration properties.
     *         </p>
     */
    public MediaStorageConfiguration getMediaStorageConfiguration() {
        return mediaStorageConfiguration;
    }

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage
     * configuration properties.
     * </p>
     *
     * @param mediaStorageConfiguration <p>
     *            A structure that encapsulates, or contains, the media storage
     *            configuration properties.
     *            </p>
     */
    public void setMediaStorageConfiguration(MediaStorageConfiguration mediaStorageConfiguration) {
        this.mediaStorageConfiguration = mediaStorageConfiguration;
    }

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage
     * configuration properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaStorageConfiguration <p>
     *            A structure that encapsulates, or contains, the media storage
     *            configuration properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMediaStorageConfigurationRequest withMediaStorageConfiguration(
            MediaStorageConfiguration mediaStorageConfiguration) {
        this.mediaStorageConfiguration = mediaStorageConfiguration;
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
        if (getMediaStorageConfiguration() != null)
            sb.append("MediaStorageConfiguration: " + getMediaStorageConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelARN() == null) ? 0 : getChannelARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getMediaStorageConfiguration() == null) ? 0 : getMediaStorageConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMediaStorageConfigurationRequest == false)
            return false;
        UpdateMediaStorageConfigurationRequest other = (UpdateMediaStorageConfigurationRequest) obj;

        if (other.getChannelARN() == null ^ this.getChannelARN() == null)
            return false;
        if (other.getChannelARN() != null
                && other.getChannelARN().equals(this.getChannelARN()) == false)
            return false;
        if (other.getMediaStorageConfiguration() == null
                ^ this.getMediaStorageConfiguration() == null)
            return false;
        if (other.getMediaStorageConfiguration() != null
                && other.getMediaStorageConfiguration().equals(this.getMediaStorageConfiguration()) == false)
            return false;
        return true;
    }
}
