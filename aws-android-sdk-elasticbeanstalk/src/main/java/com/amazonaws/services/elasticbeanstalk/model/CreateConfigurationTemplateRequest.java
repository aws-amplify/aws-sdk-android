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
 * Creates an AWS Elastic Beanstalk configuration template, associated with a
 * specific Elastic Beanstalk application. You define application configuration
 * settings in a configuration template. You can then use the configuration
 * template to deploy different versions of the application with the same
 * configuration settings.
 * </p>
 * <p>
 * Templates aren't associated with any environment. The
 * <code>EnvironmentName</code> response element is always <code>null</code>.
 * </p>
 * <p>
 * Related Topics
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeConfigurationOptions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeConfigurationSettings</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListAvailableSolutionStacks</a>
 * </p>
 * </li>
 * </ul>
 */
public class CreateConfigurationTemplateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the Elastic Beanstalk application to associate with this
     * configuration template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The name of the configuration template.
     * </p>
     * <p>
     * Constraint: This name must be unique per application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * <p>
     * The name of an Elastic Beanstalk solution stack (platform version) that
     * this configuration uses. For example,
     * <code>64bit Amazon Linux 2013.09 running Tomcat 7 Java 7</code>. A
     * solution stack specifies the operating system, runtime, and application
     * server for a configuration template. It also determines the set of
     * configuration options as well as the possible and default values. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html"
     * >Supported Platforms</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <p>
     * You must specify <code>SolutionStackName</code> if you don't specify
     * <code>PlatformArn</code>, <code>EnvironmentId</code>, or
     * <code>SourceConfiguration</code>.
     * </p>
     * <p>
     * Use the <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_ListAvailableSolutionStacks.html"
     * > <code>ListAvailableSolutionStacks</code> </a> API to obtain a list of
     * available solution stacks.
     * </p>
     */
    private String solutionStackName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom platform. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html"
     * > Custom Platforms</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you specify <code>PlatformArn</code>, then don't specify
     * <code>SolutionStackName</code>.
     * </p>
     * </note>
     */
    private String platformArn;

    /**
     * <p>
     * An Elastic Beanstalk configuration template to base this one on. If
     * specified, Elastic Beanstalk uses the configuration values from the
     * specified configuration template to create a new configuration.
     * </p>
     * <p>
     * Values specified in <code>OptionSettings</code> override any values
     * obtained from the <code>SourceConfiguration</code>.
     * </p>
     * <p>
     * You must specify <code>SourceConfiguration</code> if you don't specify
     * <code>PlatformArn</code>, <code>EnvironmentId</code>, or
     * <code>SolutionStackName</code>.
     * </p>
     * <p>
     * Constraint: If both solution stack name and source configuration are
     * specified, the solution stack of the source configuration template must
     * match the specified solution stack name.
     * </p>
     */
    private SourceConfiguration sourceConfiguration;

    /**
     * <p>
     * The ID of an environment whose settings you want to use to create the
     * configuration template. You must specify <code>EnvironmentId</code> if
     * you don't specify <code>PlatformArn</code>,
     * <code>SolutionStackName</code>, or <code>SourceConfiguration</code>.
     * </p>
     */
    private String environmentId;

    /**
     * <p>
     * An optional description for this configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     */
    private String description;

    /**
     * <p>
     * Option values for the Elastic Beanstalk configuration, such as the
     * instance type. If specified, these values override the values obtained
     * from the solution stack or the source configuration template. For a
     * complete list of Elastic Beanstalk configuration options, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html"
     * >Option Values</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     * </p>
     */
    private java.util.List<ConfigurationOptionSetting> optionSettings;

    /**
     * <p>
     * Specifies the tags applied to the configuration template.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the Elastic Beanstalk application to associate with this
     * configuration template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the Elastic Beanstalk application to associate with
     *         this configuration template.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the Elastic Beanstalk application to associate with this
     * configuration template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the Elastic Beanstalk application to associate
     *            with this configuration template.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the Elastic Beanstalk application to associate with this
     * configuration template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the Elastic Beanstalk application to associate
     *            with this configuration template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationTemplateRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The name of the configuration template.
     * </p>
     * <p>
     * Constraint: This name must be unique per application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the configuration template.
     *         </p>
     *         <p>
     *         Constraint: This name must be unique per application.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the configuration template.
     * </p>
     * <p>
     * Constraint: This name must be unique per application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            The name of the configuration template.
     *            </p>
     *            <p>
     *            Constraint: This name must be unique per application.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the configuration template.
     * </p>
     * <p>
     * Constraint: This name must be unique per application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            The name of the configuration template.
     *            </p>
     *            <p>
     *            Constraint: This name must be unique per application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationTemplateRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The name of an Elastic Beanstalk solution stack (platform version) that
     * this configuration uses. For example,
     * <code>64bit Amazon Linux 2013.09 running Tomcat 7 Java 7</code>. A
     * solution stack specifies the operating system, runtime, and application
     * server for a configuration template. It also determines the set of
     * configuration options as well as the possible and default values. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html"
     * >Supported Platforms</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <p>
     * You must specify <code>SolutionStackName</code> if you don't specify
     * <code>PlatformArn</code>, <code>EnvironmentId</code>, or
     * <code>SourceConfiguration</code>.
     * </p>
     * <p>
     * Use the <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_ListAvailableSolutionStacks.html"
     * > <code>ListAvailableSolutionStacks</code> </a> API to obtain a list of
     * available solution stacks.
     * </p>
     *
     * @return <p>
     *         The name of an Elastic Beanstalk solution stack (platform
     *         version) that this configuration uses. For example,
     *         <code>64bit Amazon Linux 2013.09 running Tomcat 7 Java 7</code>.
     *         A solution stack specifies the operating system, runtime, and
     *         application server for a configuration template. It also
     *         determines the set of configuration options as well as the
     *         possible and default values. For more information, see <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html"
     *         >Supported Platforms</a> in the <i>AWS Elastic Beanstalk
     *         Developer Guide</i>.
     *         </p>
     *         <p>
     *         You must specify <code>SolutionStackName</code> if you don't
     *         specify <code>PlatformArn</code>, <code>EnvironmentId</code>, or
     *         <code>SourceConfiguration</code>.
     *         </p>
     *         <p>
     *         Use the <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_ListAvailableSolutionStacks.html"
     *         > <code>ListAvailableSolutionStacks</code> </a> API to obtain a
     *         list of available solution stacks.
     *         </p>
     */
    public String getSolutionStackName() {
        return solutionStackName;
    }

    /**
     * <p>
     * The name of an Elastic Beanstalk solution stack (platform version) that
     * this configuration uses. For example,
     * <code>64bit Amazon Linux 2013.09 running Tomcat 7 Java 7</code>. A
     * solution stack specifies the operating system, runtime, and application
     * server for a configuration template. It also determines the set of
     * configuration options as well as the possible and default values. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html"
     * >Supported Platforms</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <p>
     * You must specify <code>SolutionStackName</code> if you don't specify
     * <code>PlatformArn</code>, <code>EnvironmentId</code>, or
     * <code>SourceConfiguration</code>.
     * </p>
     * <p>
     * Use the <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_ListAvailableSolutionStacks.html"
     * > <code>ListAvailableSolutionStacks</code> </a> API to obtain a list of
     * available solution stacks.
     * </p>
     *
     * @param solutionStackName <p>
     *            The name of an Elastic Beanstalk solution stack (platform
     *            version) that this configuration uses. For example,
     *            <code>64bit Amazon Linux 2013.09 running Tomcat 7 Java 7</code>
     *            . A solution stack specifies the operating system, runtime,
     *            and application server for a configuration template. It also
     *            determines the set of configuration options as well as the
     *            possible and default values. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html"
     *            >Supported Platforms</a> in the <i>AWS Elastic Beanstalk
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            You must specify <code>SolutionStackName</code> if you don't
     *            specify <code>PlatformArn</code>, <code>EnvironmentId</code>,
     *            or <code>SourceConfiguration</code>.
     *            </p>
     *            <p>
     *            Use the <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_ListAvailableSolutionStacks.html"
     *            > <code>ListAvailableSolutionStacks</code> </a> API to obtain
     *            a list of available solution stacks.
     *            </p>
     */
    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * The name of an Elastic Beanstalk solution stack (platform version) that
     * this configuration uses. For example,
     * <code>64bit Amazon Linux 2013.09 running Tomcat 7 Java 7</code>. A
     * solution stack specifies the operating system, runtime, and application
     * server for a configuration template. It also determines the set of
     * configuration options as well as the possible and default values. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html"
     * >Supported Platforms</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <p>
     * You must specify <code>SolutionStackName</code> if you don't specify
     * <code>PlatformArn</code>, <code>EnvironmentId</code>, or
     * <code>SourceConfiguration</code>.
     * </p>
     * <p>
     * Use the <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_ListAvailableSolutionStacks.html"
     * > <code>ListAvailableSolutionStacks</code> </a> API to obtain a list of
     * available solution stacks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutionStackName <p>
     *            The name of an Elastic Beanstalk solution stack (platform
     *            version) that this configuration uses. For example,
     *            <code>64bit Amazon Linux 2013.09 running Tomcat 7 Java 7</code>
     *            . A solution stack specifies the operating system, runtime,
     *            and application server for a configuration template. It also
     *            determines the set of configuration options as well as the
     *            possible and default values. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html"
     *            >Supported Platforms</a> in the <i>AWS Elastic Beanstalk
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            You must specify <code>SolutionStackName</code> if you don't
     *            specify <code>PlatformArn</code>, <code>EnvironmentId</code>,
     *            or <code>SourceConfiguration</code>.
     *            </p>
     *            <p>
     *            Use the <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_ListAvailableSolutionStacks.html"
     *            > <code>ListAvailableSolutionStacks</code> </a> API to obtain
     *            a list of available solution stacks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationTemplateRequest withSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom platform. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html"
     * > Custom Platforms</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you specify <code>PlatformArn</code>, then don't specify
     * <code>SolutionStackName</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the custom platform. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html"
     *         > Custom Platforms</a> in the <i>AWS Elastic Beanstalk Developer
     *         Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         If you specify <code>PlatformArn</code>, then don't specify
     *         <code>SolutionStackName</code>.
     *         </p>
     *         </note>
     */
    public String getPlatformArn() {
        return platformArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom platform. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html"
     * > Custom Platforms</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you specify <code>PlatformArn</code>, then don't specify
     * <code>SolutionStackName</code>.
     * </p>
     * </note>
     *
     * @param platformArn <p>
     *            The Amazon Resource Name (ARN) of the custom platform. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html"
     *            > Custom Platforms</a> in the <i>AWS Elastic Beanstalk
     *            Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify <code>PlatformArn</code>, then don't specify
     *            <code>SolutionStackName</code>.
     *            </p>
     *            </note>
     */
    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom platform. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html"
     * > Custom Platforms</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you specify <code>PlatformArn</code>, then don't specify
     * <code>SolutionStackName</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformArn <p>
     *            The Amazon Resource Name (ARN) of the custom platform. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html"
     *            > Custom Platforms</a> in the <i>AWS Elastic Beanstalk
     *            Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify <code>PlatformArn</code>, then don't specify
     *            <code>SolutionStackName</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationTemplateRequest withPlatformArn(String platformArn) {
        this.platformArn = platformArn;
        return this;
    }

    /**
     * <p>
     * An Elastic Beanstalk configuration template to base this one on. If
     * specified, Elastic Beanstalk uses the configuration values from the
     * specified configuration template to create a new configuration.
     * </p>
     * <p>
     * Values specified in <code>OptionSettings</code> override any values
     * obtained from the <code>SourceConfiguration</code>.
     * </p>
     * <p>
     * You must specify <code>SourceConfiguration</code> if you don't specify
     * <code>PlatformArn</code>, <code>EnvironmentId</code>, or
     * <code>SolutionStackName</code>.
     * </p>
     * <p>
     * Constraint: If both solution stack name and source configuration are
     * specified, the solution stack of the source configuration template must
     * match the specified solution stack name.
     * </p>
     *
     * @return <p>
     *         An Elastic Beanstalk configuration template to base this one on.
     *         If specified, Elastic Beanstalk uses the configuration values
     *         from the specified configuration template to create a new
     *         configuration.
     *         </p>
     *         <p>
     *         Values specified in <code>OptionSettings</code> override any
     *         values obtained from the <code>SourceConfiguration</code>.
     *         </p>
     *         <p>
     *         You must specify <code>SourceConfiguration</code> if you don't
     *         specify <code>PlatformArn</code>, <code>EnvironmentId</code>, or
     *         <code>SolutionStackName</code>.
     *         </p>
     *         <p>
     *         Constraint: If both solution stack name and source configuration
     *         are specified, the solution stack of the source configuration
     *         template must match the specified solution stack name.
     *         </p>
     */
    public SourceConfiguration getSourceConfiguration() {
        return sourceConfiguration;
    }

    /**
     * <p>
     * An Elastic Beanstalk configuration template to base this one on. If
     * specified, Elastic Beanstalk uses the configuration values from the
     * specified configuration template to create a new configuration.
     * </p>
     * <p>
     * Values specified in <code>OptionSettings</code> override any values
     * obtained from the <code>SourceConfiguration</code>.
     * </p>
     * <p>
     * You must specify <code>SourceConfiguration</code> if you don't specify
     * <code>PlatformArn</code>, <code>EnvironmentId</code>, or
     * <code>SolutionStackName</code>.
     * </p>
     * <p>
     * Constraint: If both solution stack name and source configuration are
     * specified, the solution stack of the source configuration template must
     * match the specified solution stack name.
     * </p>
     *
     * @param sourceConfiguration <p>
     *            An Elastic Beanstalk configuration template to base this one
     *            on. If specified, Elastic Beanstalk uses the configuration
     *            values from the specified configuration template to create a
     *            new configuration.
     *            </p>
     *            <p>
     *            Values specified in <code>OptionSettings</code> override any
     *            values obtained from the <code>SourceConfiguration</code>.
     *            </p>
     *            <p>
     *            You must specify <code>SourceConfiguration</code> if you don't
     *            specify <code>PlatformArn</code>, <code>EnvironmentId</code>,
     *            or <code>SolutionStackName</code>.
     *            </p>
     *            <p>
     *            Constraint: If both solution stack name and source
     *            configuration are specified, the solution stack of the source
     *            configuration template must match the specified solution stack
     *            name.
     *            </p>
     */
    public void setSourceConfiguration(SourceConfiguration sourceConfiguration) {
        this.sourceConfiguration = sourceConfiguration;
    }

    /**
     * <p>
     * An Elastic Beanstalk configuration template to base this one on. If
     * specified, Elastic Beanstalk uses the configuration values from the
     * specified configuration template to create a new configuration.
     * </p>
     * <p>
     * Values specified in <code>OptionSettings</code> override any values
     * obtained from the <code>SourceConfiguration</code>.
     * </p>
     * <p>
     * You must specify <code>SourceConfiguration</code> if you don't specify
     * <code>PlatformArn</code>, <code>EnvironmentId</code>, or
     * <code>SolutionStackName</code>.
     * </p>
     * <p>
     * Constraint: If both solution stack name and source configuration are
     * specified, the solution stack of the source configuration template must
     * match the specified solution stack name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceConfiguration <p>
     *            An Elastic Beanstalk configuration template to base this one
     *            on. If specified, Elastic Beanstalk uses the configuration
     *            values from the specified configuration template to create a
     *            new configuration.
     *            </p>
     *            <p>
     *            Values specified in <code>OptionSettings</code> override any
     *            values obtained from the <code>SourceConfiguration</code>.
     *            </p>
     *            <p>
     *            You must specify <code>SourceConfiguration</code> if you don't
     *            specify <code>PlatformArn</code>, <code>EnvironmentId</code>,
     *            or <code>SolutionStackName</code>.
     *            </p>
     *            <p>
     *            Constraint: If both solution stack name and source
     *            configuration are specified, the solution stack of the source
     *            configuration template must match the specified solution stack
     *            name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationTemplateRequest withSourceConfiguration(
            SourceConfiguration sourceConfiguration) {
        this.sourceConfiguration = sourceConfiguration;
        return this;
    }

    /**
     * <p>
     * The ID of an environment whose settings you want to use to create the
     * configuration template. You must specify <code>EnvironmentId</code> if
     * you don't specify <code>PlatformArn</code>,
     * <code>SolutionStackName</code>, or <code>SourceConfiguration</code>.
     * </p>
     *
     * @return <p>
     *         The ID of an environment whose settings you want to use to create
     *         the configuration template. You must specify
     *         <code>EnvironmentId</code> if you don't specify
     *         <code>PlatformArn</code>, <code>SolutionStackName</code>, or
     *         <code>SourceConfiguration</code>.
     *         </p>
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    /**
     * <p>
     * The ID of an environment whose settings you want to use to create the
     * configuration template. You must specify <code>EnvironmentId</code> if
     * you don't specify <code>PlatformArn</code>,
     * <code>SolutionStackName</code>, or <code>SourceConfiguration</code>.
     * </p>
     *
     * @param environmentId <p>
     *            The ID of an environment whose settings you want to use to
     *            create the configuration template. You must specify
     *            <code>EnvironmentId</code> if you don't specify
     *            <code>PlatformArn</code>, <code>SolutionStackName</code>, or
     *            <code>SourceConfiguration</code>.
     *            </p>
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of an environment whose settings you want to use to create the
     * configuration template. You must specify <code>EnvironmentId</code> if
     * you don't specify <code>PlatformArn</code>,
     * <code>SolutionStackName</code>, or <code>SourceConfiguration</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environmentId <p>
     *            The ID of an environment whose settings you want to use to
     *            create the configuration template. You must specify
     *            <code>EnvironmentId</code> if you don't specify
     *            <code>PlatformArn</code>, <code>SolutionStackName</code>, or
     *            <code>SourceConfiguration</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationTemplateRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * <p>
     * An optional description for this configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @return <p>
     *         An optional description for this configuration.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * An optional description for this configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            An optional description for this configuration.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for this configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            An optional description for this configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationTemplateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Option values for the Elastic Beanstalk configuration, such as the
     * instance type. If specified, these values override the values obtained
     * from the solution stack or the source configuration template. For a
     * complete list of Elastic Beanstalk configuration options, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html"
     * >Option Values</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Option values for the Elastic Beanstalk configuration, such as
     *         the instance type. If specified, these values override the values
     *         obtained from the solution stack or the source configuration
     *         template. For a complete list of Elastic Beanstalk configuration
     *         options, see <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html"
     *         >Option Values</a> in the <i>AWS Elastic Beanstalk Developer
     *         Guide</i>.
     *         </p>
     */
    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        return optionSettings;
    }

    /**
     * <p>
     * Option values for the Elastic Beanstalk configuration, such as the
     * instance type. If specified, these values override the values obtained
     * from the solution stack or the source configuration template. For a
     * complete list of Elastic Beanstalk configuration options, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html"
     * >Option Values</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     * </p>
     *
     * @param optionSettings <p>
     *            Option values for the Elastic Beanstalk configuration, such as
     *            the instance type. If specified, these values override the
     *            values obtained from the solution stack or the source
     *            configuration template. For a complete list of Elastic
     *            Beanstalk configuration options, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html"
     *            >Option Values</a> in the <i>AWS Elastic Beanstalk Developer
     *            Guide</i>.
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
     * Option values for the Elastic Beanstalk configuration, such as the
     * instance type. If specified, these values override the values obtained
     * from the solution stack or the source configuration template. For a
     * complete list of Elastic Beanstalk configuration options, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html"
     * >Option Values</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            Option values for the Elastic Beanstalk configuration, such as
     *            the instance type. If specified, these values override the
     *            values obtained from the solution stack or the source
     *            configuration template. For a complete list of Elastic
     *            Beanstalk configuration options, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html"
     *            >Option Values</a> in the <i>AWS Elastic Beanstalk Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationTemplateRequest withOptionSettings(
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
     * Option values for the Elastic Beanstalk configuration, such as the
     * instance type. If specified, these values override the values obtained
     * from the solution stack or the source configuration template. For a
     * complete list of Elastic Beanstalk configuration options, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html"
     * >Option Values</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            Option values for the Elastic Beanstalk configuration, such as
     *            the instance type. If specified, these values override the
     *            values obtained from the solution stack or the source
     *            configuration template. For a complete list of Elastic
     *            Beanstalk configuration options, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html"
     *            >Option Values</a> in the <i>AWS Elastic Beanstalk Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationTemplateRequest withOptionSettings(
            java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
        return this;
    }

    /**
     * <p>
     * Specifies the tags applied to the configuration template.
     * </p>
     *
     * @return <p>
     *         Specifies the tags applied to the configuration template.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies the tags applied to the configuration template.
     * </p>
     *
     * @param tags <p>
     *            Specifies the tags applied to the configuration template.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Specifies the tags applied to the configuration template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Specifies the tags applied to the configuration template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationTemplateRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the tags applied to the configuration template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Specifies the tags applied to the configuration template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConfigurationTemplateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getSolutionStackName() != null)
            sb.append("SolutionStackName: " + getSolutionStackName() + ",");
        if (getPlatformArn() != null)
            sb.append("PlatformArn: " + getPlatformArn() + ",");
        if (getSourceConfiguration() != null)
            sb.append("SourceConfiguration: " + getSourceConfiguration() + ",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: " + getEnvironmentId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getOptionSettings() != null)
            sb.append("OptionSettings: " + getOptionSettings() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
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
                + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode
                + ((getSourceConfiguration() == null) ? 0 : getSourceConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConfigurationTemplateRequest == false)
            return false;
        CreateConfigurationTemplateRequest other = (CreateConfigurationTemplateRequest) obj;

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
        if (other.getSolutionStackName() == null ^ this.getSolutionStackName() == null)
            return false;
        if (other.getSolutionStackName() != null
                && other.getSolutionStackName().equals(this.getSolutionStackName()) == false)
            return false;
        if (other.getPlatformArn() == null ^ this.getPlatformArn() == null)
            return false;
        if (other.getPlatformArn() != null
                && other.getPlatformArn().equals(this.getPlatformArn()) == false)
            return false;
        if (other.getSourceConfiguration() == null ^ this.getSourceConfiguration() == null)
            return false;
        if (other.getSourceConfiguration() != null
                && other.getSourceConfiguration().equals(this.getSourceConfiguration()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null
                && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
