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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Create a new configuration in the AppConfig configuration store.
 * </p>
 */
public class CreateHostedConfigurationVersionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     */
    private String applicationId;

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     */
    private String configurationProfileId;

    /**
     * <p>
     * A description of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The content of the configuration or the configuration data.
     * </p>
     */
    private java.nio.ByteBuffer content;

    /**
     * <p>
     * A standard MIME type describing the format of the configuration content.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/https:/www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     * >Content-Type</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String contentType;

    /**
     * <p>
     * An optional locking token used to prevent race conditions from
     * overwriting configuration updates when creating a new version. To ensure
     * your data is not overwritten when creating multiple hosted configuration
     * versions in rapid succession, specify the version of the latest hosted
     * configuration version.
     * </p>
     */
    private Integer latestVersionNumber;

    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @return <p>
     *         The application ID.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param applicationId <p>
     *            The application ID.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param applicationId <p>
     *            The application ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHostedConfigurationVersionRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @return <p>
     *         The configuration profile ID.
     *         </p>
     */
    public String getConfigurationProfileId() {
        return configurationProfileId;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param configurationProfileId <p>
     *            The configuration profile ID.
     *            </p>
     */
    public void setConfigurationProfileId(String configurationProfileId) {
        this.configurationProfileId = configurationProfileId;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param configurationProfileId <p>
     *            The configuration profile ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHostedConfigurationVersionRequest withConfigurationProfileId(
            String configurationProfileId) {
        this.configurationProfileId = configurationProfileId;
        return this;
    }

    /**
     * <p>
     * A description of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         A description of the configuration.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            A description of the configuration.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            A description of the configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHostedConfigurationVersionRequest withDescription(String description) {
        this.description = description;
        return this;
    }

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
    public CreateHostedConfigurationVersionRequest withContent(java.nio.ByteBuffer content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the configuration content.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/https:/www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     * >Content-Type</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         A standard MIME type describing the format of the configuration
     *         content. For more information, see <a href=
     *         "https://docs.aws.amazon.com/https:/www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     *         >Content-Type</a>.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the configuration content.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/https:/www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     * >Content-Type</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param contentType <p>
     *            A standard MIME type describing the format of the
     *            configuration content. For more information, see <a href=
     *            "https://docs.aws.amazon.com/https:/www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     *            >Content-Type</a>.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the configuration content.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/https:/www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     * >Content-Type</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param contentType <p>
     *            A standard MIME type describing the format of the
     *            configuration content. For more information, see <a href=
     *            "https://docs.aws.amazon.com/https:/www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     *            >Content-Type</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHostedConfigurationVersionRequest withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * <p>
     * An optional locking token used to prevent race conditions from
     * overwriting configuration updates when creating a new version. To ensure
     * your data is not overwritten when creating multiple hosted configuration
     * versions in rapid succession, specify the version of the latest hosted
     * configuration version.
     * </p>
     *
     * @return <p>
     *         An optional locking token used to prevent race conditions from
     *         overwriting configuration updates when creating a new version. To
     *         ensure your data is not overwritten when creating multiple hosted
     *         configuration versions in rapid succession, specify the version
     *         of the latest hosted configuration version.
     *         </p>
     */
    public Integer getLatestVersionNumber() {
        return latestVersionNumber;
    }

    /**
     * <p>
     * An optional locking token used to prevent race conditions from
     * overwriting configuration updates when creating a new version. To ensure
     * your data is not overwritten when creating multiple hosted configuration
     * versions in rapid succession, specify the version of the latest hosted
     * configuration version.
     * </p>
     *
     * @param latestVersionNumber <p>
     *            An optional locking token used to prevent race conditions from
     *            overwriting configuration updates when creating a new version.
     *            To ensure your data is not overwritten when creating multiple
     *            hosted configuration versions in rapid succession, specify the
     *            version of the latest hosted configuration version.
     *            </p>
     */
    public void setLatestVersionNumber(Integer latestVersionNumber) {
        this.latestVersionNumber = latestVersionNumber;
    }

    /**
     * <p>
     * An optional locking token used to prevent race conditions from
     * overwriting configuration updates when creating a new version. To ensure
     * your data is not overwritten when creating multiple hosted configuration
     * versions in rapid succession, specify the version of the latest hosted
     * configuration version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latestVersionNumber <p>
     *            An optional locking token used to prevent race conditions from
     *            overwriting configuration updates when creating a new version.
     *            To ensure your data is not overwritten when creating multiple
     *            hosted configuration versions in rapid succession, specify the
     *            version of the latest hosted configuration version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHostedConfigurationVersionRequest withLatestVersionNumber(
            Integer latestVersionNumber) {
        this.latestVersionNumber = latestVersionNumber;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getConfigurationProfileId() != null)
            sb.append("ConfigurationProfileId: " + getConfigurationProfileId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType() + ",");
        if (getLatestVersionNumber() != null)
            sb.append("LatestVersionNumber: " + getLatestVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime
                * hashCode
                + ((getConfigurationProfileId() == null) ? 0 : getConfigurationProfileId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode
                + ((getLatestVersionNumber() == null) ? 0 : getLatestVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHostedConfigurationVersionRequest == false)
            return false;
        CreateHostedConfigurationVersionRequest other = (CreateHostedConfigurationVersionRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getConfigurationProfileId() == null ^ this.getConfigurationProfileId() == null)
            return false;
        if (other.getConfigurationProfileId() != null
                && other.getConfigurationProfileId().equals(this.getConfigurationProfileId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getLatestVersionNumber() == null ^ this.getLatestVersionNumber() == null)
            return false;
        if (other.getLatestVersionNumber() != null
                && other.getLatestVersionNumber().equals(this.getLatestVersionNumber()) == false)
            return false;
        return true;
    }
}
