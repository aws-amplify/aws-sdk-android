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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * MediaPackage Output Destination Settings
 */
public class MediaPackageOutputDestinationSettings implements Serializable {
    /**
     * ID of the channel in MediaPackage that is the destination for this output
     * group. You do not need to specify the individual inputs in MediaPackage;
     * MediaLive will handle the connection of the two MediaLive pipelines to
     * the two MediaPackage inputs. The MediaPackage channel and MediaLive
     * channel must be in the same region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String channelId;

    /**
     * ID of the channel in MediaPackage that is the destination for this output
     * group. You do not need to specify the individual inputs in MediaPackage;
     * MediaLive will handle the connection of the two MediaLive pipelines to
     * the two MediaPackage inputs. The MediaPackage channel and MediaLive
     * channel must be in the same region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return ID of the channel in MediaPackage that is the destination for
     *         this output group. You do not need to specify the individual
     *         inputs in MediaPackage; MediaLive will handle the connection of
     *         the two MediaLive pipelines to the two MediaPackage inputs. The
     *         MediaPackage channel and MediaLive channel must be in the same
     *         region.
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * ID of the channel in MediaPackage that is the destination for this output
     * group. You do not need to specify the individual inputs in MediaPackage;
     * MediaLive will handle the connection of the two MediaLive pipelines to
     * the two MediaPackage inputs. The MediaPackage channel and MediaLive
     * channel must be in the same region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param channelId ID of the channel in MediaPackage that is the
     *            destination for this output group. You do not need to specify
     *            the individual inputs in MediaPackage; MediaLive will handle
     *            the connection of the two MediaLive pipelines to the two
     *            MediaPackage inputs. The MediaPackage channel and MediaLive
     *            channel must be in the same region.
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * ID of the channel in MediaPackage that is the destination for this output
     * group. You do not need to specify the individual inputs in MediaPackage;
     * MediaLive will handle the connection of the two MediaLive pipelines to
     * the two MediaPackage inputs. The MediaPackage channel and MediaLive
     * channel must be in the same region.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param channelId ID of the channel in MediaPackage that is the
     *            destination for this output group. You do not need to specify
     *            the individual inputs in MediaPackage; MediaLive will handle
     *            the connection of the two MediaLive pipelines to the two
     *            MediaPackage inputs. The MediaPackage channel and MediaLive
     *            channel must be in the same region.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaPackageOutputDestinationSettings withChannelId(String channelId) {
        this.channelId = channelId;
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
        if (getChannelId() != null)
            sb.append("ChannelId: " + getChannelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaPackageOutputDestinationSettings == false)
            return false;
        MediaPackageOutputDestinationSettings other = (MediaPackageOutputDestinationSettings) obj;

        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null
                && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        return true;
    }
}
