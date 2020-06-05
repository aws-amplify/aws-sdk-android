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
 * Returns a description of the settings for the specified configuration set,
 * that is, either a configuration template or the configuration set associated
 * with a running environment.
 * </p>
 * <p>
 * When describing the settings for the configuration set associated with a
 * running environment, it is possible to receive two sets of setting
 * descriptions. One is the deployed configuration set, and the other is a draft
 * configuration of an environment that is either in the process of deployment
 * or that failed to deploy.
 * </p>
 * <p>
 * Related Topics
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteEnvironmentConfiguration</a>
 * </p>
 * </li>
 * </ul>
 */
public class DescribeConfigurationSettingsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The application for the environment or configuration template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The name of the configuration template to describe.
     * </p>
     * <p>
     * Conditional: You must specify either this parameter or an
     * EnvironmentName, but not both. If you specify both, AWS Elastic Beanstalk
     * returns an <code>InvalidParameterCombination</code> error. If you do not
     * specify either, AWS Elastic Beanstalk returns a
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * <p>
     * The name of the environment to describe.
     * </p>
     * <p>
     * Condition: You must specify either this or a TemplateName, but not both.
     * If you specify both, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error. If you do not specify
     * either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     */
    private String environmentName;

    /**
     * <p>
     * The application for the environment or configuration template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The application for the environment or configuration template.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The application for the environment or configuration template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The application for the environment or configuration template.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The application for the environment or configuration template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The application for the environment or configuration template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConfigurationSettingsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The name of the configuration template to describe.
     * </p>
     * <p>
     * Conditional: You must specify either this parameter or an
     * EnvironmentName, but not both. If you specify both, AWS Elastic Beanstalk
     * returns an <code>InvalidParameterCombination</code> error. If you do not
     * specify either, AWS Elastic Beanstalk returns a
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the configuration template to describe.
     *         </p>
     *         <p>
     *         Conditional: You must specify either this parameter or an
     *         EnvironmentName, but not both. If you specify both, AWS Elastic
     *         Beanstalk returns an <code>InvalidParameterCombination</code>
     *         error. If you do not specify either, AWS Elastic Beanstalk
     *         returns a <code>MissingRequiredParameter</code> error.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the configuration template to describe.
     * </p>
     * <p>
     * Conditional: You must specify either this parameter or an
     * EnvironmentName, but not both. If you specify both, AWS Elastic Beanstalk
     * returns an <code>InvalidParameterCombination</code> error. If you do not
     * specify either, AWS Elastic Beanstalk returns a
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            The name of the configuration template to describe.
     *            </p>
     *            <p>
     *            Conditional: You must specify either this parameter or an
     *            EnvironmentName, but not both. If you specify both, AWS
     *            Elastic Beanstalk returns an
     *            <code>InvalidParameterCombination</code> error. If you do not
     *            specify either, AWS Elastic Beanstalk returns a
     *            <code>MissingRequiredParameter</code> error.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the configuration template to describe.
     * </p>
     * <p>
     * Conditional: You must specify either this parameter or an
     * EnvironmentName, but not both. If you specify both, AWS Elastic Beanstalk
     * returns an <code>InvalidParameterCombination</code> error. If you do not
     * specify either, AWS Elastic Beanstalk returns a
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            The name of the configuration template to describe.
     *            </p>
     *            <p>
     *            Conditional: You must specify either this parameter or an
     *            EnvironmentName, but not both. If you specify both, AWS
     *            Elastic Beanstalk returns an
     *            <code>InvalidParameterCombination</code> error. If you do not
     *            specify either, AWS Elastic Beanstalk returns a
     *            <code>MissingRequiredParameter</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConfigurationSettingsRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The name of the environment to describe.
     * </p>
     * <p>
     * Condition: You must specify either this or a TemplateName, but not both.
     * If you specify both, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error. If you do not specify
     * either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @return <p>
     *         The name of the environment to describe.
     *         </p>
     *         <p>
     *         Condition: You must specify either this or a TemplateName, but
     *         not both. If you specify both, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterCombination</code> error. If you do not
     *         specify either, AWS Elastic Beanstalk returns
     *         <code>MissingRequiredParameter</code> error.
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * The name of the environment to describe.
     * </p>
     * <p>
     * Condition: You must specify either this or a TemplateName, but not both.
     * If you specify both, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error. If you do not specify
     * either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The name of the environment to describe.
     *            </p>
     *            <p>
     *            Condition: You must specify either this or a TemplateName, but
     *            not both. If you specify both, AWS Elastic Beanstalk returns
     *            an <code>InvalidParameterCombination</code> error. If you do
     *            not specify either, AWS Elastic Beanstalk returns
     *            <code>MissingRequiredParameter</code> error.
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment to describe.
     * </p>
     * <p>
     * Condition: You must specify either this or a TemplateName, but not both.
     * If you specify both, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error. If you do not specify
     * either, AWS Elastic Beanstalk returns
     * <code>MissingRequiredParameter</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            The name of the environment to describe.
     *            </p>
     *            <p>
     *            Condition: You must specify either this or a TemplateName, but
     *            not both. If you specify both, AWS Elastic Beanstalk returns
     *            an <code>InvalidParameterCombination</code> error. If you do
     *            not specify either, AWS Elastic Beanstalk returns
     *            <code>MissingRequiredParameter</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConfigurationSettingsRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
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
            sb.append("EnvironmentName: " + getEnvironmentName());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationSettingsRequest == false)
            return false;
        DescribeConfigurationSettingsRequest other = (DescribeConfigurationSettingsRequest) obj;

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
        return true;
    }
}
