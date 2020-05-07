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

package com.amazonaws.services.appconfig.model;

import java.io.Serializable;

public class GetConfigurationResult implements Serializable {
    /**
     * <p>
     * The content of the configuration or the configuration data.
     * </p>
     */
    private java.nio.ByteBuffer content;

    /**
     * <p>
     * The configuration version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String configurationVersion;

    /**
     * <p>
     * A standard MIME type describing the format of the configuration content.
     * For more information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     * >Content-Type</a>.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The content of the configuration or the configuration data.
     * </p>
     *
     * @return <p>
     *         The content of the configuration or the configuration data.
     *         </p>
     */
    public java.nio.ByteBuffer getContent() {
        return content;
    }

    /**
     * <p>
     * The content of the configuration or the configuration data.
     * </p>
     *
     * @param content <p>
     *            The content of the configuration or the configuration data.
     *            </p>
     */
    public void setContent(java.nio.ByteBuffer content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the configuration or the configuration data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            The content of the configuration or the configuration data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConfigurationResult withContent(java.nio.ByteBuffer content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * The configuration version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The configuration version.
     *         </p>
     */
    public String getConfigurationVersion() {
        return configurationVersion;
    }

    /**
     * <p>
     * The configuration version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param configurationVersion <p>
     *            The configuration version.
     *            </p>
     */
    public void setConfigurationVersion(String configurationVersion) {
        this.configurationVersion = configurationVersion;
    }

    /**
     * <p>
     * The configuration version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param configurationVersion <p>
     *            The configuration version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConfigurationResult withConfigurationVersion(String configurationVersion) {
        this.configurationVersion = configurationVersion;
        return this;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the configuration content.
     * For more information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     * >Content-Type</a>.
     * </p>
     *
     * @return <p>
     *         A standard MIME type describing the format of the configuration
     *         content. For more information, see <a href=
     *         "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     *         >Content-Type</a>.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the configuration content.
     * For more information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     * >Content-Type</a>.
     * </p>
     *
     * @param contentType <p>
     *            A standard MIME type describing the format of the
     *            configuration content. For more information, see <a href=
     *            "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     *            >Content-Type</a>.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the configuration content.
     * For more information, see <a
     * href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     * >Content-Type</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentType <p>
     *            A standard MIME type describing the format of the
     *            configuration content. For more information, see <a href=
     *            "http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     *            >Content-Type</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConfigurationResult withContentType(String contentType) {
        this.contentType = contentType;
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
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getConfigurationVersion() != null)
            sb.append("ConfigurationVersion: " + getConfigurationVersion() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurationVersion() == null) ? 0 : getConfigurationVersion().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConfigurationResult == false)
            return false;
        GetConfigurationResult other = (GetConfigurationResult) obj;

        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getConfigurationVersion() == null ^ this.getConfigurationVersion() == null)
            return false;
        if (other.getConfigurationVersion() != null
                && other.getConfigurationVersion().equals(this.getConfigurationVersion()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }
}
