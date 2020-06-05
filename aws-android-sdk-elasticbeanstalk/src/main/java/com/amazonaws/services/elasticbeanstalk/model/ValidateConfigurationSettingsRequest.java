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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Takes a set of configuration settings and either a configuration template or
 * environment, and determines whether those values are valid.
 * </p>
 * <p>
 * This action returns a list of messages indicating any errors or warnings
 * associated with the selection of option values.
 * </p>
 */
public class ValidateConfigurationSettingsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the application that the configuration template or
     * environment belongs to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The name of the configuration template to validate the settings against.
     * </p>
     * <p>
     * Condition: You cannot specify both this and an environment name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * <p>
     * The name of the environment to validate the settings against.
     * </p>
     * <p>
     * Condition: You cannot specify both this and a configuration template
     * name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     */
    private String environmentName;

    /**
     * <p>
     * A list of the options and desired values to evaluate.
     * </p>
     */
    private java.util.List<ConfigurationOptionSetting> optionSettings;

    /**
     * <p>
     * The name of the application that the configuration template or
     * environment belongs to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application that the configuration template or
     *         environment belongs to.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the application that the configuration template or
     * environment belongs to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application that the configuration template or
     *            environment belongs to.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application that the configuration template or
     * environment belongs to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application that the configuration template or
     *            environment belongs to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidateConfigurationSettingsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The name of the configuration template to validate the settings against.
     * </p>
     * <p>
     * Condition: You cannot specify both this and an environment name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the configuration template to validate the settings
     *         against.
     *         </p>
     *         <p>
     *         Condition: You cannot specify both this and an environment name.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the configuration template to validate the settings against.
     * </p>
     * <p>
     * Condition: You cannot specify both this and an environment name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            The name of the configuration template to validate the
     *            settings against.
     *            </p>
     *            <p>
     *            Condition: You cannot specify both this and an environment
     *            name.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the configuration template to validate the settings against.
     * </p>
     * <p>
     * Condition: You cannot specify both this and an environment name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            The name of the configuration template to validate the
     *            settings against.
     *            </p>
     *            <p>
     *            Condition: You cannot specify both this and an environment
     *            name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidateConfigurationSettingsRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The name of the environment to validate the settings against.
     * </p>
     * <p>
     * Condition: You cannot specify both this and a configuration template
     * name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @return <p>
     *         The name of the environment to validate the settings against.
     *         </p>
     *         <p>
     *         Condition: You cannot specify both this and a configuration
     *         template name.
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * The name of the environment to validate the settings against.
     * </p>
     * <p>
     * Condition: You cannot specify both this and a configuration template
     * name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The name of the environment to validate the settings against.
     *            </p>
     *            <p>
     *            Condition: You cannot specify both this and a configuration
     *            template name.
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment to validate the settings against.
     * </p>
     * <p>
     * Condition: You cannot specify both this and a configuration template
     * name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The name of the environment to validate the settings against.
     *            </p>
     *            <p>
     *            Condition: You cannot specify both this and a configuration
     *            template name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidateConfigurationSettingsRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * <p>
     * A list of the options and desired values to evaluate.
     * </p>
     *
     * @return <p>
     *         A list of the options and desired values to evaluate.
     *         </p>
     */
    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        return optionSettings;
    }

    /**
     * <p>
     * A list of the options and desired values to evaluate.
     * </p>
     *
     * @param optionSettings <p>
     *            A list of the options and desired values to evaluate.
     *            </p>
     */
    public void setOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        if (optionSettings == null) {
            this.optionSettings = null;
            return;
        }

        this.optionSettings = new java.util.ArrayList<ConfigurationOptionSetting>(optionSettings);
    }

    /**
     * <p>
     * A list of the options and desired values to evaluate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            A list of the options and desired values to evaluate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidateConfigurationSettingsRequest withOptionSettings(
            ConfigurationOptionSetting... optionSettings) {
        if (getOptionSettings() == null) {
            this.optionSettings = new java.util.ArrayList<ConfigurationOptionSetting>(
                    optionSettings.length);
        }
        for (ConfigurationOptionSetting value : optionSettings) {
            this.optionSettings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the options and desired values to evaluate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            A list of the options and desired values to evaluate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidateConfigurationSettingsRequest withOptionSettings(
            java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getOptionSettings() != null)
            sb.append("OptionSettings: " + getOptionSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode
                + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateConfigurationSettingsRequest == false)
            return false;
        ValidateConfigurationSettingsRequest other = (ValidateConfigurationSettingsRequest) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null
                && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null)
            return false;
        if (other.getOptionSettings() != null
                && other.getOptionSettings().equals(this.getOptionSettings()) == false)
            return false;
        return true;
    }
}
