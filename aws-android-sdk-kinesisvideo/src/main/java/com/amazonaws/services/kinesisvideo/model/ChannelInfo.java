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

/**
 * <p>
 * A structure that encapsulates a signaling channel's metadata and properties.
 * </p>
 */
public class ChannelInfo implements Serializable {
    /**
     * <p>
     * The name of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String channelName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signaling channel.
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
     * The type of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_MASTER, FULL_MESH
     */
    private String channelType;

    /**
     * <p>
     * Current status of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING
     */
    private String channelStatus;

    /**
     * <p>
     * The time at which the signaling channel was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * A structure that contains the configuration for the
     * <code>SINGLE_MASTER</code> channel type.
     * </p>
     */
    private SingleMasterConfiguration singleMasterConfiguration;

    /**
     * <p>
     * The current version of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     */
    private String version;

    /**
     * <p>
     * The name of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the signaling channel.
     *         </p>
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * <p>
     * The name of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param channelName <p>
     *            The name of the signaling channel.
     *            </p>
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name of the signaling channel.
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
     *            The name of the signaling channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelInfo withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the signaling channel.
     *         </p>
     */
    public String getChannelARN() {
        return channelARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param channelARN <p>
     *            The Amazon Resource Name (ARN) of the signaling channel.
     *            </p>
     */
    public void setChannelARN(String channelARN) {
        this.channelARN = channelARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signaling channel.
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
     *            The Amazon Resource Name (ARN) of the signaling channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelInfo withChannelARN(String channelARN) {
        this.channelARN = channelARN;
        return this;
    }

    /**
     * <p>
     * The type of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_MASTER, FULL_MESH
     *
     * @return <p>
     *         The type of the signaling channel.
     *         </p>
     * @see ChannelType
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * <p>
     * The type of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_MASTER, FULL_MESH
     *
     * @param channelType <p>
     *            The type of the signaling channel.
     *            </p>
     * @see ChannelType
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * <p>
     * The type of the signaling channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_MASTER, FULL_MESH
     *
     * @param channelType <p>
     *            The type of the signaling channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelType
     */
    public ChannelInfo withChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }

    /**
     * <p>
     * The type of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_MASTER, FULL_MESH
     *
     * @param channelType <p>
     *            The type of the signaling channel.
     *            </p>
     * @see ChannelType
     */
    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
    }

    /**
     * <p>
     * The type of the signaling channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_MASTER, FULL_MESH
     *
     * @param channelType <p>
     *            The type of the signaling channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelType
     */
    public ChannelInfo withChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
        return this;
    }

    /**
     * <p>
     * Current status of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING
     *
     * @return <p>
     *         Current status of the signaling channel.
     *         </p>
     * @see Status
     */
    public String getChannelStatus() {
        return channelStatus;
    }

    /**
     * <p>
     * Current status of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING
     *
     * @param channelStatus <p>
     *            Current status of the signaling channel.
     *            </p>
     * @see Status
     */
    public void setChannelStatus(String channelStatus) {
        this.channelStatus = channelStatus;
    }

    /**
     * <p>
     * Current status of the signaling channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING
     *
     * @param channelStatus <p>
     *            Current status of the signaling channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public ChannelInfo withChannelStatus(String channelStatus) {
        this.channelStatus = channelStatus;
        return this;
    }

    /**
     * <p>
     * Current status of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING
     *
     * @param channelStatus <p>
     *            Current status of the signaling channel.
     *            </p>
     * @see Status
     */
    public void setChannelStatus(Status channelStatus) {
        this.channelStatus = channelStatus.toString();
    }

    /**
     * <p>
     * Current status of the signaling channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, UPDATING, DELETING
     *
     * @param channelStatus <p>
     *            Current status of the signaling channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public ChannelInfo withChannelStatus(Status channelStatus) {
        this.channelStatus = channelStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the signaling channel was created.
     * </p>
     *
     * @return <p>
     *         The time at which the signaling channel was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time at which the signaling channel was created.
     * </p>
     *
     * @param creationTime <p>
     *            The time at which the signaling channel was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the signaling channel was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time at which the signaling channel was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelInfo withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * A structure that contains the configuration for the
     * <code>SINGLE_MASTER</code> channel type.
     * </p>
     *
     * @return <p>
     *         A structure that contains the configuration for the
     *         <code>SINGLE_MASTER</code> channel type.
     *         </p>
     */
    public SingleMasterConfiguration getSingleMasterConfiguration() {
        return singleMasterConfiguration;
    }

    /**
     * <p>
     * A structure that contains the configuration for the
     * <code>SINGLE_MASTER</code> channel type.
     * </p>
     *
     * @param singleMasterConfiguration <p>
     *            A structure that contains the configuration for the
     *            <code>SINGLE_MASTER</code> channel type.
     *            </p>
     */
    public void setSingleMasterConfiguration(SingleMasterConfiguration singleMasterConfiguration) {
        this.singleMasterConfiguration = singleMasterConfiguration;
    }

    /**
     * <p>
     * A structure that contains the configuration for the
     * <code>SINGLE_MASTER</code> channel type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param singleMasterConfiguration <p>
     *            A structure that contains the configuration for the
     *            <code>SINGLE_MASTER</code> channel type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelInfo withSingleMasterConfiguration(
            SingleMasterConfiguration singleMasterConfiguration) {
        this.singleMasterConfiguration = singleMasterConfiguration;
        return this;
    }

    /**
     * <p>
     * The current version of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @return <p>
     *         The current version of the signaling channel.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The current version of the signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @param version <p>
     *            The current version of the signaling channel.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The current version of the signaling channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9]+<br/>
     *
     * @param version <p>
     *            The current version of the signaling channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelInfo withVersion(String version) {
        this.version = version;
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
        if (getChannelARN() != null)
            sb.append("ChannelARN: " + getChannelARN() + ",");
        if (getChannelType() != null)
            sb.append("ChannelType: " + getChannelType() + ",");
        if (getChannelStatus() != null)
            sb.append("ChannelStatus: " + getChannelStatus() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getSingleMasterConfiguration() != null)
            sb.append("SingleMasterConfiguration: " + getSingleMasterConfiguration() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getChannelARN() == null) ? 0 : getChannelARN().hashCode());
        hashCode = prime * hashCode
                + ((getChannelType() == null) ? 0 : getChannelType().hashCode());
        hashCode = prime * hashCode
                + ((getChannelStatus() == null) ? 0 : getChannelStatus().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getSingleMasterConfiguration() == null) ? 0 : getSingleMasterConfiguration()
                        .hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelInfo == false)
            return false;
        ChannelInfo other = (ChannelInfo) obj;

        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null
                && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getChannelARN() == null ^ this.getChannelARN() == null)
            return false;
        if (other.getChannelARN() != null
                && other.getChannelARN().equals(this.getChannelARN()) == false)
            return false;
        if (other.getChannelType() == null ^ this.getChannelType() == null)
            return false;
        if (other.getChannelType() != null
                && other.getChannelType().equals(this.getChannelType()) == false)
            return false;
        if (other.getChannelStatus() == null ^ this.getChannelStatus() == null)
            return false;
        if (other.getChannelStatus() != null
                && other.getChannelStatus().equals(this.getChannelStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getSingleMasterConfiguration() == null
                ^ this.getSingleMasterConfiguration() == null)
            return false;
        if (other.getSingleMasterConfiguration() != null
                && other.getSingleMasterConfiguration().equals(this.getSingleMasterConfiguration()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
