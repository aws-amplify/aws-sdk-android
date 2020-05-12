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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a gateway, which is a virtual or edge device that delivers industrial
 * data streams from local servers to AWS IoT SiteWise. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/gateway-connector.html"
 * >Ingesting data using a gateway</a> in the <i>AWS IoT SiteWise User
 * Guide</i>.
 * </p>
 */
public class CreateGatewayRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique, friendly name for the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     */
    private String gatewayName;

    /**
     * <p>
     * The gateway's platform. You can only specify one platform in a gateway.
     * </p>
     */
    private GatewayPlatform gatewayPlatform;

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the gateway. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique, friendly name for the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @return <p>
     *         A unique, friendly name for the gateway.
     *         </p>
     */
    public String getGatewayName() {
        return gatewayName;
    }

    /**
     * <p>
     * A unique, friendly name for the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param gatewayName <p>
     *            A unique, friendly name for the gateway.
     *            </p>
     */
    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    /**
     * <p>
     * A unique, friendly name for the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^\u0000-\u001F\u007F]+<br/>
     *
     * @param gatewayName <p>
     *            A unique, friendly name for the gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGatewayRequest withGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }

    /**
     * <p>
     * The gateway's platform. You can only specify one platform in a gateway.
     * </p>
     *
     * @return <p>
     *         The gateway's platform. You can only specify one platform in a
     *         gateway.
     *         </p>
     */
    public GatewayPlatform getGatewayPlatform() {
        return gatewayPlatform;
    }

    /**
     * <p>
     * The gateway's platform. You can only specify one platform in a gateway.
     * </p>
     *
     * @param gatewayPlatform <p>
     *            The gateway's platform. You can only specify one platform in a
     *            gateway.
     *            </p>
     */
    public void setGatewayPlatform(GatewayPlatform gatewayPlatform) {
        this.gatewayPlatform = gatewayPlatform;
    }

    /**
     * <p>
     * The gateway's platform. You can only specify one platform in a gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gatewayPlatform <p>
     *            The gateway's platform. You can only specify one platform in a
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGatewayRequest withGatewayPlatform(GatewayPlatform gatewayPlatform) {
        this.gatewayPlatform = gatewayPlatform;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the gateway. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of key-value pairs that contain metadata for the gateway.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     *         >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT
     *         SiteWise User Guide</i>.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the gateway. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     *
     * @param tags <p>
     *            A list of key-value pairs that contain metadata for the
     *            gateway. For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     *            >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT
     *            SiteWise User Guide</i>.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the gateway. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of key-value pairs that contain metadata for the
     *            gateway. For more information, see <a href=
     *            "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     *            >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT
     *            SiteWise User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGatewayRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the gateway. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html"
     * >Tagging your AWS IoT SiteWise resources</a> in the <i>AWS IoT SiteWise
     * User Guide</i>.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateGatewayRequest addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateGatewayRequest cleartagsEntries() {
        this.tags = null;
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
        if (getGatewayName() != null)
            sb.append("gatewayName: " + getGatewayName() + ",");
        if (getGatewayPlatform() != null)
            sb.append("gatewayPlatform: " + getGatewayPlatform() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGatewayName() == null) ? 0 : getGatewayName().hashCode());
        hashCode = prime * hashCode
                + ((getGatewayPlatform() == null) ? 0 : getGatewayPlatform().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGatewayRequest == false)
            return false;
        CreateGatewayRequest other = (CreateGatewayRequest) obj;

        if (other.getGatewayName() == null ^ this.getGatewayName() == null)
            return false;
        if (other.getGatewayName() != null
                && other.getGatewayName().equals(this.getGatewayName()) == false)
            return false;
        if (other.getGatewayPlatform() == null ^ this.getGatewayPlatform() == null)
            return false;
        if (other.getGatewayPlatform() != null
                && other.getGatewayPlatform().equals(this.getGatewayPlatform()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
