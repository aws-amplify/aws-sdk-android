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
 * Creates a signaling channel.
 * </p>
 * <p>
 * <code>CreateSignalingChannel</code> is an asynchronous operation.
 * </p>
 */
public class CreateSignalingChannelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A name for the signaling channel that you are creating. It must be unique
     * for each Amazon Web Services account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String channelName;

    /**
     * <p>
     * A type of the signaling channel that you are creating. Currently,
     * <code>SINGLE_MASTER</code> is the only supported channel type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_MASTER, FULL_MESH
     */
    private String channelType;

    /**
     * <p>
     * A structure containing the configuration for the
     * <code>SINGLE_MASTER</code> channel type.
     * </p>
     */
    private SingleMasterConfiguration singleMasterConfiguration;

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to associate with this
     * channel.
     * </p>
     */
    private java.util.List<Tag> tags = new java.util.ArrayList<Tag>();

    /**
     * <p>
     * A name for the signaling channel that you are creating. It must be unique
     * for each Amazon Web Services account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         A name for the signaling channel that you are creating. It must
     *         be unique for each Amazon Web Services account and Amazon Web
     *         Services Region.
     *         </p>
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * <p>
     * A name for the signaling channel that you are creating. It must be unique
     * for each Amazon Web Services account and Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param channelName <p>
     *            A name for the signaling channel that you are creating. It
     *            must be unique for each Amazon Web Services account and Amazon
     *            Web Services Region.
     *            </p>
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * A name for the signaling channel that you are creating. It must be unique
     * for each Amazon Web Services account and Amazon Web Services Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param channelName <p>
     *            A name for the signaling channel that you are creating. It
     *            must be unique for each Amazon Web Services account and Amazon
     *            Web Services Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSignalingChannelRequest withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * <p>
     * A type of the signaling channel that you are creating. Currently,
     * <code>SINGLE_MASTER</code> is the only supported channel type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_MASTER, FULL_MESH
     *
     * @return <p>
     *         A type of the signaling channel that you are creating. Currently,
     *         <code>SINGLE_MASTER</code> is the only supported channel type.
     *         </p>
     * @see ChannelType
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * <p>
     * A type of the signaling channel that you are creating. Currently,
     * <code>SINGLE_MASTER</code> is the only supported channel type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_MASTER, FULL_MESH
     *
     * @param channelType <p>
     *            A type of the signaling channel that you are creating.
     *            Currently, <code>SINGLE_MASTER</code> is the only supported
     *            channel type.
     *            </p>
     * @see ChannelType
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * <p>
     * A type of the signaling channel that you are creating. Currently,
     * <code>SINGLE_MASTER</code> is the only supported channel type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_MASTER, FULL_MESH
     *
     * @param channelType <p>
     *            A type of the signaling channel that you are creating.
     *            Currently, <code>SINGLE_MASTER</code> is the only supported
     *            channel type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelType
     */
    public CreateSignalingChannelRequest withChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }

    /**
     * <p>
     * A type of the signaling channel that you are creating. Currently,
     * <code>SINGLE_MASTER</code> is the only supported channel type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_MASTER, FULL_MESH
     *
     * @param channelType <p>
     *            A type of the signaling channel that you are creating.
     *            Currently, <code>SINGLE_MASTER</code> is the only supported
     *            channel type.
     *            </p>
     * @see ChannelType
     */
    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
    }

    /**
     * <p>
     * A type of the signaling channel that you are creating. Currently,
     * <code>SINGLE_MASTER</code> is the only supported channel type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_MASTER, FULL_MESH
     *
     * @param channelType <p>
     *            A type of the signaling channel that you are creating.
     *            Currently, <code>SINGLE_MASTER</code> is the only supported
     *            channel type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelType
     */
    public CreateSignalingChannelRequest withChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
        return this;
    }

    /**
     * <p>
     * A structure containing the configuration for the
     * <code>SINGLE_MASTER</code> channel type.
     * </p>
     *
     * @return <p>
     *         A structure containing the configuration for the
     *         <code>SINGLE_MASTER</code> channel type.
     *         </p>
     */
    public SingleMasterConfiguration getSingleMasterConfiguration() {
        return singleMasterConfiguration;
    }

    /**
     * <p>
     * A structure containing the configuration for the
     * <code>SINGLE_MASTER</code> channel type.
     * </p>
     *
     * @param singleMasterConfiguration <p>
     *            A structure containing the configuration for the
     *            <code>SINGLE_MASTER</code> channel type.
     *            </p>
     */
    public void setSingleMasterConfiguration(SingleMasterConfiguration singleMasterConfiguration) {
        this.singleMasterConfiguration = singleMasterConfiguration;
    }

    /**
     * <p>
     * A structure containing the configuration for the
     * <code>SINGLE_MASTER</code> channel type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param singleMasterConfiguration <p>
     *            A structure containing the configuration for the
     *            <code>SINGLE_MASTER</code> channel type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSignalingChannelRequest withSingleMasterConfiguration(
            SingleMasterConfiguration singleMasterConfiguration) {
        this.singleMasterConfiguration = singleMasterConfiguration;
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to associate with this
     * channel.
     * </p>
     *
     * @return <p>
     *         A set of tags (key-value pairs) that you want to associate with
     *         this channel.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to associate with this
     * channel.
     * </p>
     *
     * @param tags <p>
     *            A set of tags (key-value pairs) that you want to associate
     *            with this channel.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to associate with this
     * channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A set of tags (key-value pairs) that you want to associate
     *            with this channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSignalingChannelRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to associate with this
     * channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A set of tags (key-value pairs) that you want to associate
     *            with this channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSignalingChannelRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getChannelName() != null)
            sb.append("ChannelName: " + getChannelName() + ",");
        if (getChannelType() != null)
            sb.append("ChannelType: " + getChannelType() + ",");
        if (getSingleMasterConfiguration() != null)
            sb.append("SingleMasterConfiguration: " + getSingleMasterConfiguration() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode
                + ((getChannelType() == null) ? 0 : getChannelType().hashCode());
        hashCode = prime
                * hashCode
                + ((getSingleMasterConfiguration() == null) ? 0 : getSingleMasterConfiguration()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSignalingChannelRequest == false)
            return false;
        CreateSignalingChannelRequest other = (CreateSignalingChannelRequest) obj;

        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null
                && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getChannelType() == null ^ this.getChannelType() == null)
            return false;
        if (other.getChannelType() != null
                && other.getChannelType().equals(this.getChannelType()) == false)
            return false;
        if (other.getSingleMasterConfiguration() == null
                ^ this.getSingleMasterConfiguration() == null)
            return false;
        if (other.getSingleMasterConfiguration() != null
                && other.getSingleMasterConfiguration().equals(this.getSingleMasterConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
