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
 * Receive information about a configuration.
 * </p>
 * <important>
 * <p>
 * AWS AppConfig uses the value of the <code>ClientConfigurationVersion</code>
 * parameter to identify the configuration version on your clients. If you don’t
 * send <code>ClientConfigurationVersion</code> with each call to
 * <code>GetConfiguration</code>, your clients receive the current
 * configuration. You are charged each time your clients receive a
 * configuration.
 * </p>
 * <p>
 * To avoid excess charges, we recommend that you include the
 * <code>ClientConfigurationVersion</code> value with every call to
 * <code>GetConfiguration</code>. This value must be saved on your client.
 * Subsequent calls to <code>GetConfiguration</code> must pass this value by
 * using the <code>ClientConfigurationVersion</code> parameter.
 * </p>
 * </important>
 */
public class GetConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The application to get. Specify either the application name or the
     * application ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String application;

    /**
     * <p>
     * The environment to get. Specify either the environment name or the
     * environment ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String environment;

    /**
     * <p>
     * The configuration to get. Specify either the configuration name or the
     * configuration ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String configuration;

    /**
     * <p>
     * A unique ID to identify the client for the configuration. This ID enables
     * AppConfig to deploy the configuration in intervals, as defined in the
     * deployment strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String clientId;

    /**
     * <p>
     * The configuration version returned in the most recent
     * <code>GetConfiguration</code> response.
     * </p>
     * <important>
     * <p>
     * AWS AppConfig uses the value of the
     * <code>ClientConfigurationVersion</code> parameter to identify the
     * configuration version on your clients. If you don’t send
     * <code>ClientConfigurationVersion</code> with each call to
     * <code>GetConfiguration</code>, your clients receive the current
     * configuration. You are charged each time your clients receive a
     * configuration.
     * </p>
     * <p>
     * To avoid excess charges, we recommend that you include the
     * <code>ClientConfigurationVersion</code> value with every call to
     * <code>GetConfiguration</code>. This value must be saved on your client.
     * Subsequent calls to <code>GetConfiguration</code> must pass this value by
     * using the <code>ClientConfigurationVersion</code> parameter.
     * </p>
     * </important>
     * <p>
     * For more information about working with configurations, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig-retrieving-the-configuration.html"
     * >Retrieving the Configuration</a> in the <i>AWS AppConfig User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String clientConfigurationVersion;

    /**
     * <p>
     * The application to get. Specify either the application name or the
     * application ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The application to get. Specify either the application name or
     *         the application ID.
     *         </p>
     */
    public String getApplication() {
        return application;
    }

    /**
     * <p>
     * The application to get. Specify either the application name or the
     * application ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param application <p>
     *            The application to get. Specify either the application name or
     *            the application ID.
     *            </p>
     */
    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * <p>
     * The application to get. Specify either the application name or the
     * application ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param application <p>
     *            The application to get. Specify either the application name or
     *            the application ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConfigurationRequest withApplication(String application) {
        this.application = application;
        return this;
    }

    /**
     * <p>
     * The environment to get. Specify either the environment name or the
     * environment ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The environment to get. Specify either the environment name or
     *         the environment ID.
     *         </p>
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment to get. Specify either the environment name or the
     * environment ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param environment <p>
     *            The environment to get. Specify either the environment name or
     *            the environment ID.
     *            </p>
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * The environment to get. Specify either the environment name or the
     * environment ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param environment <p>
     *            The environment to get. Specify either the environment name or
     *            the environment ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConfigurationRequest withEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * <p>
     * The configuration to get. Specify either the configuration name or the
     * configuration ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The configuration to get. Specify either the configuration name
     *         or the configuration ID.
     *         </p>
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * The configuration to get. Specify either the configuration name or the
     * configuration ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param configuration <p>
     *            The configuration to get. Specify either the configuration
     *            name or the configuration ID.
     *            </p>
     */
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration to get. Specify either the configuration name or the
     * configuration ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param configuration <p>
     *            The configuration to get. Specify either the configuration
     *            name or the configuration ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConfigurationRequest withConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * <p>
     * A unique ID to identify the client for the configuration. This ID enables
     * AppConfig to deploy the configuration in intervals, as defined in the
     * deployment strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         A unique ID to identify the client for the configuration. This ID
     *         enables AppConfig to deploy the configuration in intervals, as
     *         defined in the deployment strategy.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * A unique ID to identify the client for the configuration. This ID enables
     * AppConfig to deploy the configuration in intervals, as defined in the
     * deployment strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clientId <p>
     *            A unique ID to identify the client for the configuration. This
     *            ID enables AppConfig to deploy the configuration in intervals,
     *            as defined in the deployment strategy.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * A unique ID to identify the client for the configuration. This ID enables
     * AppConfig to deploy the configuration in intervals, as defined in the
     * deployment strategy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clientId <p>
     *            A unique ID to identify the client for the configuration. This
     *            ID enables AppConfig to deploy the configuration in intervals,
     *            as defined in the deployment strategy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConfigurationRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * <p>
     * The configuration version returned in the most recent
     * <code>GetConfiguration</code> response.
     * </p>
     * <important>
     * <p>
     * AWS AppConfig uses the value of the
     * <code>ClientConfigurationVersion</code> parameter to identify the
     * configuration version on your clients. If you don’t send
     * <code>ClientConfigurationVersion</code> with each call to
     * <code>GetConfiguration</code>, your clients receive the current
     * configuration. You are charged each time your clients receive a
     * configuration.
     * </p>
     * <p>
     * To avoid excess charges, we recommend that you include the
     * <code>ClientConfigurationVersion</code> value with every call to
     * <code>GetConfiguration</code>. This value must be saved on your client.
     * Subsequent calls to <code>GetConfiguration</code> must pass this value by
     * using the <code>ClientConfigurationVersion</code> parameter.
     * </p>
     * </important>
     * <p>
     * For more information about working with configurations, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig-retrieving-the-configuration.html"
     * >Retrieving the Configuration</a> in the <i>AWS AppConfig User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The configuration version returned in the most recent
     *         <code>GetConfiguration</code> response.
     *         </p>
     *         <important>
     *         <p>
     *         AWS AppConfig uses the value of the
     *         <code>ClientConfigurationVersion</code> parameter to identify the
     *         configuration version on your clients. If you don’t send
     *         <code>ClientConfigurationVersion</code> with each call to
     *         <code>GetConfiguration</code>, your clients receive the current
     *         configuration. You are charged each time your clients receive a
     *         configuration.
     *         </p>
     *         <p>
     *         To avoid excess charges, we recommend that you include the
     *         <code>ClientConfigurationVersion</code> value with every call to
     *         <code>GetConfiguration</code>. This value must be saved on your
     *         client. Subsequent calls to <code>GetConfiguration</code> must
     *         pass this value by using the
     *         <code>ClientConfigurationVersion</code> parameter.
     *         </p>
     *         </important>
     *         <p>
     *         For more information about working with configurations, see <a
     *         href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig-retrieving-the-configuration.html"
     *         >Retrieving the Configuration</a> in the <i>AWS AppConfig User
     *         Guide</i>.
     *         </p>
     */
    public String getClientConfigurationVersion() {
        return clientConfigurationVersion;
    }

    /**
     * <p>
     * The configuration version returned in the most recent
     * <code>GetConfiguration</code> response.
     * </p>
     * <important>
     * <p>
     * AWS AppConfig uses the value of the
     * <code>ClientConfigurationVersion</code> parameter to identify the
     * configuration version on your clients. If you don’t send
     * <code>ClientConfigurationVersion</code> with each call to
     * <code>GetConfiguration</code>, your clients receive the current
     * configuration. You are charged each time your clients receive a
     * configuration.
     * </p>
     * <p>
     * To avoid excess charges, we recommend that you include the
     * <code>ClientConfigurationVersion</code> value with every call to
     * <code>GetConfiguration</code>. This value must be saved on your client.
     * Subsequent calls to <code>GetConfiguration</code> must pass this value by
     * using the <code>ClientConfigurationVersion</code> parameter.
     * </p>
     * </important>
     * <p>
     * For more information about working with configurations, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig-retrieving-the-configuration.html"
     * >Retrieving the Configuration</a> in the <i>AWS AppConfig User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param clientConfigurationVersion <p>
     *            The configuration version returned in the most recent
     *            <code>GetConfiguration</code> response.
     *            </p>
     *            <important>
     *            <p>
     *            AWS AppConfig uses the value of the
     *            <code>ClientConfigurationVersion</code> parameter to identify
     *            the configuration version on your clients. If you don’t send
     *            <code>ClientConfigurationVersion</code> with each call to
     *            <code>GetConfiguration</code>, your clients receive the
     *            current configuration. You are charged each time your clients
     *            receive a configuration.
     *            </p>
     *            <p>
     *            To avoid excess charges, we recommend that you include the
     *            <code>ClientConfigurationVersion</code> value with every call
     *            to <code>GetConfiguration</code>. This value must be saved on
     *            your client. Subsequent calls to <code>GetConfiguration</code>
     *            must pass this value by using the
     *            <code>ClientConfigurationVersion</code> parameter.
     *            </p>
     *            </important>
     *            <p>
     *            For more information about working with configurations, see <a
     *            href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig-retrieving-the-configuration.html"
     *            >Retrieving the Configuration</a> in the <i>AWS AppConfig User
     *            Guide</i>.
     *            </p>
     */
    public void setClientConfigurationVersion(String clientConfigurationVersion) {
        this.clientConfigurationVersion = clientConfigurationVersion;
    }

    /**
     * <p>
     * The configuration version returned in the most recent
     * <code>GetConfiguration</code> response.
     * </p>
     * <important>
     * <p>
     * AWS AppConfig uses the value of the
     * <code>ClientConfigurationVersion</code> parameter to identify the
     * configuration version on your clients. If you don’t send
     * <code>ClientConfigurationVersion</code> with each call to
     * <code>GetConfiguration</code>, your clients receive the current
     * configuration. You are charged each time your clients receive a
     * configuration.
     * </p>
     * <p>
     * To avoid excess charges, we recommend that you include the
     * <code>ClientConfigurationVersion</code> value with every call to
     * <code>GetConfiguration</code>. This value must be saved on your client.
     * Subsequent calls to <code>GetConfiguration</code> must pass this value by
     * using the <code>ClientConfigurationVersion</code> parameter.
     * </p>
     * </important>
     * <p>
     * For more information about working with configurations, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig-retrieving-the-configuration.html"
     * >Retrieving the Configuration</a> in the <i>AWS AppConfig User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param clientConfigurationVersion <p>
     *            The configuration version returned in the most recent
     *            <code>GetConfiguration</code> response.
     *            </p>
     *            <important>
     *            <p>
     *            AWS AppConfig uses the value of the
     *            <code>ClientConfigurationVersion</code> parameter to identify
     *            the configuration version on your clients. If you don’t send
     *            <code>ClientConfigurationVersion</code> with each call to
     *            <code>GetConfiguration</code>, your clients receive the
     *            current configuration. You are charged each time your clients
     *            receive a configuration.
     *            </p>
     *            <p>
     *            To avoid excess charges, we recommend that you include the
     *            <code>ClientConfigurationVersion</code> value with every call
     *            to <code>GetConfiguration</code>. This value must be saved on
     *            your client. Subsequent calls to <code>GetConfiguration</code>
     *            must pass this value by using the
     *            <code>ClientConfigurationVersion</code> parameter.
     *            </p>
     *            </important>
     *            <p>
     *            For more information about working with configurations, see <a
     *            href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig-retrieving-the-configuration.html"
     *            >Retrieving the Configuration</a> in the <i>AWS AppConfig User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConfigurationRequest withClientConfigurationVersion(String clientConfigurationVersion) {
        this.clientConfigurationVersion = clientConfigurationVersion;
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
        if (getApplication() != null)
            sb.append("Application: " + getApplication() + ",");
        if (getEnvironment() != null)
            sb.append("Environment: " + getEnvironment() + ",");
        if (getConfiguration() != null)
            sb.append("Configuration: " + getConfiguration() + ",");
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getClientConfigurationVersion() != null)
            sb.append("ClientConfigurationVersion: " + getClientConfigurationVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplication() == null) ? 0 : getApplication().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode
                + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime
                * hashCode
                + ((getClientConfigurationVersion() == null) ? 0 : getClientConfigurationVersion()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConfigurationRequest == false)
            return false;
        GetConfigurationRequest other = (GetConfigurationRequest) obj;

        if (other.getApplication() == null ^ this.getApplication() == null)
            return false;
        if (other.getApplication() != null
                && other.getApplication().equals(this.getApplication()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null
                && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null
                && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientConfigurationVersion() == null
                ^ this.getClientConfigurationVersion() == null)
            return false;
        if (other.getClientConfigurationVersion() != null
                && other.getClientConfigurationVersion().equals(
                        this.getClientConfigurationVersion()) == false)
            return false;
        return true;
    }
}
