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
 * Updates the specified configuration template to have the specified properties
 * or configuration option values.
 * </p>
 * <note>
 * <p>
 * If a property (for example, <code>ApplicationName</code>) is not provided,
 * its value remains unchanged. To clear such properties, specify an empty
 * string.
 * </p>
 * </note>
 * <p>
 * Related Topics
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeConfigurationOptions</a>
 * </p>
 * </li>
 * </ul>
 */
public class UpdateConfigurationTemplateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the application associated with the configuration template to
     * update.
     * </p>
     * <p>
     * If no application is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The name of the configuration template to update.
     * </p>
     * <p>
     * If no configuration template is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * <p>
     * A new description for the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     */
    private String description;

    /**
     * <p>
     * A list of configuration option settings to update with the new specified
     * option value.
     * </p>
     */
    private java.util.List<ConfigurationOptionSetting> optionSettings;

    /**
     * <p>
     * A list of configuration options to remove from the configuration set.
     * </p>
     * <p>
     * Constraint: You can remove only <code>UserDefined</code> configuration
     * options.
     * </p>
     */
    private java.util.List<OptionSpecification> optionsToRemove;

    /**
     * <p>
     * The name of the application associated with the configuration template to
     * update.
     * </p>
     * <p>
     * If no application is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application associated with the configuration
     *         template to update.
     *         </p>
     *         <p>
     *         If no application is found with this name,
     *         <code>UpdateConfigurationTemplate</code> returns an
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the application associated with the configuration template to
     * update.
     * </p>
     * <p>
     * If no application is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application associated with the configuration
     *            template to update.
     *            </p>
     *            <p>
     *            If no application is found with this name,
     *            <code>UpdateConfigurationTemplate</code> returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application associated with the configuration template to
     * update.
     * </p>
     * <p>
     * If no application is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application associated with the configuration
     *            template to update.
     *            </p>
     *            <p>
     *            If no application is found with this name,
     *            <code>UpdateConfigurationTemplate</code> returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationTemplateRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The name of the configuration template to update.
     * </p>
     * <p>
     * If no configuration template is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the configuration template to update.
     *         </p>
     *         <p>
     *         If no configuration template is found with this name,
     *         <code>UpdateConfigurationTemplate</code> returns an
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the configuration template to update.
     * </p>
     * <p>
     * If no configuration template is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            The name of the configuration template to update.
     *            </p>
     *            <p>
     *            If no configuration template is found with this name,
     *            <code>UpdateConfigurationTemplate</code> returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the configuration template to update.
     * </p>
     * <p>
     * If no configuration template is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            The name of the configuration template to update.
     *            </p>
     *            <p>
     *            If no configuration template is found with this name,
     *            <code>UpdateConfigurationTemplate</code> returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationTemplateRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * A new description for the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @return <p>
     *         A new description for the configuration.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A new description for the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            A new description for the configuration.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description for the configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            A new description for the configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationTemplateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of configuration option settings to update with the new specified
     * option value.
     * </p>
     *
     * @return <p>
     *         A list of configuration option settings to update with the new
     *         specified option value.
     *         </p>
     */
    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        return optionSettings;
    }

    /**
     * <p>
     * A list of configuration option settings to update with the new specified
     * option value.
     * </p>
     *
     * @param optionSettings <p>
     *            A list of configuration option settings to update with the new
     *            specified option value.
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
     * A list of configuration option settings to update with the new specified
     * option value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            A list of configuration option settings to update with the new
     *            specified option value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationTemplateRequest withOptionSettings(
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
     * A list of configuration option settings to update with the new specified
     * option value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            A list of configuration option settings to update with the new
     *            specified option value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationTemplateRequest withOptionSettings(
            java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
        return this;
    }

    /**
     * <p>
     * A list of configuration options to remove from the configuration set.
     * </p>
     * <p>
     * Constraint: You can remove only <code>UserDefined</code> configuration
     * options.
     * </p>
     *
     * @return <p>
     *         A list of configuration options to remove from the configuration
     *         set.
     *         </p>
     *         <p>
     *         Constraint: You can remove only <code>UserDefined</code>
     *         configuration options.
     *         </p>
     */
    public java.util.List<OptionSpecification> getOptionsToRemove() {
        return optionsToRemove;
    }

    /**
     * <p>
     * A list of configuration options to remove from the configuration set.
     * </p>
     * <p>
     * Constraint: You can remove only <code>UserDefined</code> configuration
     * options.
     * </p>
     *
     * @param optionsToRemove <p>
     *            A list of configuration options to remove from the
     *            configuration set.
     *            </p>
     *            <p>
     *            Constraint: You can remove only <code>UserDefined</code>
     *            configuration options.
     *            </p>
     */
    public void setOptionsToRemove(java.util.Collection<OptionSpecification> optionsToRemove) {
        if (optionsToRemove == null) {
            this.optionsToRemove = null;
            return;
        }

        this.optionsToRemove = new java.util.ArrayList<OptionSpecification>(optionsToRemove);
    }

    /**
     * <p>
     * A list of configuration options to remove from the configuration set.
     * </p>
     * <p>
     * Constraint: You can remove only <code>UserDefined</code> configuration
     * options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionsToRemove <p>
     *            A list of configuration options to remove from the
     *            configuration set.
     *            </p>
     *            <p>
     *            Constraint: You can remove only <code>UserDefined</code>
     *            configuration options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationTemplateRequest withOptionsToRemove(
            OptionSpecification... optionsToRemove) {
        if (getOptionsToRemove() == null) {
            this.optionsToRemove = new java.util.ArrayList<OptionSpecification>(
                    optionsToRemove.length);
        }
        for (OptionSpecification value : optionsToRemove) {
            this.optionsToRemove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of configuration options to remove from the configuration set.
     * </p>
     * <p>
     * Constraint: You can remove only <code>UserDefined</code> configuration
     * options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionsToRemove <p>
     *            A list of configuration options to remove from the
     *            configuration set.
     *            </p>
     *            <p>
     *            Constraint: You can remove only <code>UserDefined</code>
     *            configuration options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateConfigurationTemplateRequest withOptionsToRemove(
            java.util.Collection<OptionSpecification> optionsToRemove) {
        setOptionsToRemove(optionsToRemove);
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getOptionSettings() != null)
            sb.append("OptionSettings: " + getOptionSettings() + ",");
        if (getOptionsToRemove() != null)
            sb.append("OptionsToRemove: " + getOptionsToRemove());
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
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        hashCode = prime * hashCode
                + ((getOptionsToRemove() == null) ? 0 : getOptionsToRemove().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConfigurationTemplateRequest == false)
            return false;
        UpdateConfigurationTemplateRequest other = (UpdateConfigurationTemplateRequest) obj;

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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null)
            return false;
        if (other.getOptionSettings() != null
                && other.getOptionSettings().equals(this.getOptionSettings()) == false)
            return false;
        if (other.getOptionsToRemove() == null ^ this.getOptionsToRemove() == null)
            return false;
        if (other.getOptionsToRemove() != null
                && other.getOptionsToRemove().equals(this.getOptionsToRemove()) == false)
            return false;
        return true;
    }
}
