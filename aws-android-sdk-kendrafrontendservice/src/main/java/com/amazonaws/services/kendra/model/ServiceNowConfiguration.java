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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Provides configuration information required to connect to a ServiceNow data
 * source.
 * </p>
 */
public class ServiceNowConfiguration implements Serializable {
    /**
     * <p>
     * The ServiceNow instance that the data source connects to. The host
     * endpoint should look like the following:
     * <code>{instance}.service-now.com.</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>^(?!(^(https?|ftp|file):\/\/))[a-z0-9-]+(\.service-now\.com)$<br/>
     */
    private String hostUrl;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secret Manager secret that
     * contains the user name and password required to connect to the ServiceNow
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String secretArn;

    /**
     * <p>
     * The identifier of the release that the ServiceNow host is running. If the
     * host is not running the <code>LONDON</code> release, use
     * <code>OTHERS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LONDON, OTHERS
     */
    private String serviceNowBuildVersion;

    /**
     * <p>
     * Provides configuration information for crawling knowledge articles in the
     * ServiceNow site.
     * </p>
     */
    private ServiceNowKnowledgeArticleConfiguration knowledgeArticleConfiguration;

    /**
     * <p>
     * Provides configuration information for crawling service catalogs in the
     * ServiceNow site.
     * </p>
     */
    private ServiceNowServiceCatalogConfiguration serviceCatalogConfiguration;

    /**
     * <p>
     * The ServiceNow instance that the data source connects to. The host
     * endpoint should look like the following:
     * <code>{instance}.service-now.com.</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>^(?!(^(https?|ftp|file):\/\/))[a-z0-9-]+(\.service-now\.com)$<br/>
     *
     * @return <p>
     *         The ServiceNow instance that the data source connects to. The
     *         host endpoint should look like the following:
     *         <code>{instance}.service-now.com.</code>
     *         </p>
     */
    public String getHostUrl() {
        return hostUrl;
    }

    /**
     * <p>
     * The ServiceNow instance that the data source connects to. The host
     * endpoint should look like the following:
     * <code>{instance}.service-now.com.</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>^(?!(^(https?|ftp|file):\/\/))[a-z0-9-]+(\.service-now\.com)$<br/>
     *
     * @param hostUrl <p>
     *            The ServiceNow instance that the data source connects to. The
     *            host endpoint should look like the following:
     *            <code>{instance}.service-now.com.</code>
     *            </p>
     */
    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
    }

    /**
     * <p>
     * The ServiceNow instance that the data source connects to. The host
     * endpoint should look like the following:
     * <code>{instance}.service-now.com.</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>^(?!(^(https?|ftp|file):\/\/))[a-z0-9-]+(\.service-now\.com)$<br/>
     *
     * @param hostUrl <p>
     *            The ServiceNow instance that the data source connects to. The
     *            host endpoint should look like the following:
     *            <code>{instance}.service-now.com.</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceNowConfiguration withHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secret Manager secret that
     * contains the user name and password required to connect to the ServiceNow
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Secret Manager secret
     *         that contains the user name and password required to connect to
     *         the ServiceNow instance.
     *         </p>
     */
    public String getSecretArn() {
        return secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secret Manager secret that
     * contains the user name and password required to connect to the ServiceNow
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param secretArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Secret Manager
     *            secret that contains the user name and password required to
     *            connect to the ServiceNow instance.
     *            </p>
     */
    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secret Manager secret that
     * contains the user name and password required to connect to the ServiceNow
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1284<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param secretArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Secret Manager
     *            secret that contains the user name and password required to
     *            connect to the ServiceNow instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceNowConfiguration withSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }

    /**
     * <p>
     * The identifier of the release that the ServiceNow host is running. If the
     * host is not running the <code>LONDON</code> release, use
     * <code>OTHERS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LONDON, OTHERS
     *
     * @return <p>
     *         The identifier of the release that the ServiceNow host is
     *         running. If the host is not running the <code>LONDON</code>
     *         release, use <code>OTHERS</code>.
     *         </p>
     * @see ServiceNowBuildVersionType
     */
    public String getServiceNowBuildVersion() {
        return serviceNowBuildVersion;
    }

    /**
     * <p>
     * The identifier of the release that the ServiceNow host is running. If the
     * host is not running the <code>LONDON</code> release, use
     * <code>OTHERS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LONDON, OTHERS
     *
     * @param serviceNowBuildVersion <p>
     *            The identifier of the release that the ServiceNow host is
     *            running. If the host is not running the <code>LONDON</code>
     *            release, use <code>OTHERS</code>.
     *            </p>
     * @see ServiceNowBuildVersionType
     */
    public void setServiceNowBuildVersion(String serviceNowBuildVersion) {
        this.serviceNowBuildVersion = serviceNowBuildVersion;
    }

    /**
     * <p>
     * The identifier of the release that the ServiceNow host is running. If the
     * host is not running the <code>LONDON</code> release, use
     * <code>OTHERS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LONDON, OTHERS
     *
     * @param serviceNowBuildVersion <p>
     *            The identifier of the release that the ServiceNow host is
     *            running. If the host is not running the <code>LONDON</code>
     *            release, use <code>OTHERS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceNowBuildVersionType
     */
    public ServiceNowConfiguration withServiceNowBuildVersion(String serviceNowBuildVersion) {
        this.serviceNowBuildVersion = serviceNowBuildVersion;
        return this;
    }

    /**
     * <p>
     * The identifier of the release that the ServiceNow host is running. If the
     * host is not running the <code>LONDON</code> release, use
     * <code>OTHERS</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LONDON, OTHERS
     *
     * @param serviceNowBuildVersion <p>
     *            The identifier of the release that the ServiceNow host is
     *            running. If the host is not running the <code>LONDON</code>
     *            release, use <code>OTHERS</code>.
     *            </p>
     * @see ServiceNowBuildVersionType
     */
    public void setServiceNowBuildVersion(ServiceNowBuildVersionType serviceNowBuildVersion) {
        this.serviceNowBuildVersion = serviceNowBuildVersion.toString();
    }

    /**
     * <p>
     * The identifier of the release that the ServiceNow host is running. If the
     * host is not running the <code>LONDON</code> release, use
     * <code>OTHERS</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LONDON, OTHERS
     *
     * @param serviceNowBuildVersion <p>
     *            The identifier of the release that the ServiceNow host is
     *            running. If the host is not running the <code>LONDON</code>
     *            release, use <code>OTHERS</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceNowBuildVersionType
     */
    public ServiceNowConfiguration withServiceNowBuildVersion(
            ServiceNowBuildVersionType serviceNowBuildVersion) {
        this.serviceNowBuildVersion = serviceNowBuildVersion.toString();
        return this;
    }

    /**
     * <p>
     * Provides configuration information for crawling knowledge articles in the
     * ServiceNow site.
     * </p>
     *
     * @return <p>
     *         Provides configuration information for crawling knowledge
     *         articles in the ServiceNow site.
     *         </p>
     */
    public ServiceNowKnowledgeArticleConfiguration getKnowledgeArticleConfiguration() {
        return knowledgeArticleConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for crawling knowledge articles in the
     * ServiceNow site.
     * </p>
     *
     * @param knowledgeArticleConfiguration <p>
     *            Provides configuration information for crawling knowledge
     *            articles in the ServiceNow site.
     *            </p>
     */
    public void setKnowledgeArticleConfiguration(
            ServiceNowKnowledgeArticleConfiguration knowledgeArticleConfiguration) {
        this.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for crawling knowledge articles in the
     * ServiceNow site.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param knowledgeArticleConfiguration <p>
     *            Provides configuration information for crawling knowledge
     *            articles in the ServiceNow site.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceNowConfiguration withKnowledgeArticleConfiguration(
            ServiceNowKnowledgeArticleConfiguration knowledgeArticleConfiguration) {
        this.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
        return this;
    }

    /**
     * <p>
     * Provides configuration information for crawling service catalogs in the
     * ServiceNow site.
     * </p>
     *
     * @return <p>
     *         Provides configuration information for crawling service catalogs
     *         in the ServiceNow site.
     *         </p>
     */
    public ServiceNowServiceCatalogConfiguration getServiceCatalogConfiguration() {
        return serviceCatalogConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for crawling service catalogs in the
     * ServiceNow site.
     * </p>
     *
     * @param serviceCatalogConfiguration <p>
     *            Provides configuration information for crawling service
     *            catalogs in the ServiceNow site.
     *            </p>
     */
    public void setServiceCatalogConfiguration(
            ServiceNowServiceCatalogConfiguration serviceCatalogConfiguration) {
        this.serviceCatalogConfiguration = serviceCatalogConfiguration;
    }

    /**
     * <p>
     * Provides configuration information for crawling service catalogs in the
     * ServiceNow site.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceCatalogConfiguration <p>
     *            Provides configuration information for crawling service
     *            catalogs in the ServiceNow site.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceNowConfiguration withServiceCatalogConfiguration(
            ServiceNowServiceCatalogConfiguration serviceCatalogConfiguration) {
        this.serviceCatalogConfiguration = serviceCatalogConfiguration;
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
        if (getHostUrl() != null)
            sb.append("HostUrl: " + getHostUrl() + ",");
        if (getSecretArn() != null)
            sb.append("SecretArn: " + getSecretArn() + ",");
        if (getServiceNowBuildVersion() != null)
            sb.append("ServiceNowBuildVersion: " + getServiceNowBuildVersion() + ",");
        if (getKnowledgeArticleConfiguration() != null)
            sb.append("KnowledgeArticleConfiguration: " + getKnowledgeArticleConfiguration() + ",");
        if (getServiceCatalogConfiguration() != null)
            sb.append("ServiceCatalogConfiguration: " + getServiceCatalogConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostUrl() == null) ? 0 : getHostUrl().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceNowBuildVersion() == null) ? 0 : getServiceNowBuildVersion()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getKnowledgeArticleConfiguration() == null) ? 0
                        : getKnowledgeArticleConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceCatalogConfiguration() == null) ? 0
                        : getServiceCatalogConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceNowConfiguration == false)
            return false;
        ServiceNowConfiguration other = (ServiceNowConfiguration) obj;

        if (other.getHostUrl() == null ^ this.getHostUrl() == null)
            return false;
        if (other.getHostUrl() != null && other.getHostUrl().equals(this.getHostUrl()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null
                && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getServiceNowBuildVersion() == null ^ this.getServiceNowBuildVersion() == null)
            return false;
        if (other.getServiceNowBuildVersion() != null
                && other.getServiceNowBuildVersion().equals(this.getServiceNowBuildVersion()) == false)
            return false;
        if (other.getKnowledgeArticleConfiguration() == null
                ^ this.getKnowledgeArticleConfiguration() == null)
            return false;
        if (other.getKnowledgeArticleConfiguration() != null
                && other.getKnowledgeArticleConfiguration().equals(
                        this.getKnowledgeArticleConfiguration()) == false)
            return false;
        if (other.getServiceCatalogConfiguration() == null
                ^ this.getServiceCatalogConfiguration() == null)
            return false;
        if (other.getServiceCatalogConfiguration() != null
                && other.getServiceCatalogConfiguration().equals(
                        this.getServiceCatalogConfiguration()) == false)
            return false;
        return true;
    }
}
