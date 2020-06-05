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
 * Launches an AWS Elastic Beanstalk environment for the specified application
 * using the specified configuration.
 * </p>
 */
public class CreateEnvironmentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the application that is associated with this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * A unique name for the environment.
     * </p>
     * <p>
     * Constraint: Must be from 4 to 40 characters in length. The name can
     * contain only letters, numbers, and hyphens. It can't start or end with a
     * hyphen. This name must be unique within a region in your account. If the
     * specified name already exists in the region, Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * If you don't specify the <code>CNAMEPrefix</code> parameter, the
     * environment name becomes part of the CNAME, and therefore part of the
     * visible URL for your application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     */
    private String environmentName;

    /**
     * <p>
     * The name of the group to which the target environment belongs. Specify a
     * group name only if the environment's name is specified in an environment
     * manifest and not with the environment name parameter. See <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     * >Environment Manifest (env.yaml)</a> for details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     */
    private String groupName;

    /**
     * <p>
     * Your description for this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     */
    private String description;

    /**
     * <p>
     * If specified, the environment attempts to use this value as the prefix
     * for the CNAME in your Elastic Beanstalk environment URL. If not
     * specified, the CNAME is generated automatically by appending a random
     * alphanumeric string to the environment name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 63<br/>
     */
    private String cNAMEPrefix;

    /**
     * <p>
     * Specifies the tier to use in creating this environment. The environment
     * tier that you choose determines whether Elastic Beanstalk provisions
     * resources to support a web application that handles HTTP(S) requests or a
     * web application that handles background-processing tasks.
     * </p>
     */
    private EnvironmentTier tier;

    /**
     * <p>
     * Specifies the tags applied to resources in the environment.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the application version to deploy.
     * </p>
     * <p>
     * Default: If not specified, Elastic Beanstalk attempts to deploy the
     * sample application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * <p>
     * The name of the Elastic Beanstalk configuration template to use with the
     * environment.
     * </p>
     * <note>
     * <p>
     * If you specify <code>TemplateName</code>, then don't specify
     * <code>SolutionStackName</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * <p>
     * The name of an Elastic Beanstalk solution stack (platform version) to use
     * with the environment. If specified, Elastic Beanstalk sets the
     * configuration values to the default values associated with the specified
     * solution stack. For a list of current solution stacks, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/platforms/platforms-supported.html"
     * >Elastic Beanstalk Supported Platforms</a> in the <i>AWS Elastic
     * Beanstalk Platforms</i> guide.
     * </p>
     * <note>
     * <p>
     * If you specify <code>SolutionStackName</code>, don't specify
     * <code>PlatformArn</code> or <code>TemplateName</code>.
     * </p>
     * </note>
     */
    private String solutionStackName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom platform to use with the
     * environment. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html"
     * >Custom Platforms</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you specify <code>PlatformArn</code>, don't specify
     * <code>SolutionStackName</code>.
     * </p>
     * </note>
     */
    private String platformArn;

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk sets the specified configuration
     * options to the requested value in the configuration set for the new
     * environment. These override the values obtained from the solution stack
     * or the configuration template.
     * </p>
     */
    private java.util.List<ConfigurationOptionSetting> optionSettings;

    /**
     * <p>
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this new environment.
     * </p>
     */
    private java.util.List<OptionSpecification> optionsToRemove;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an existing IAM role to be used as the
     * environment's operations role. If specified, Elastic Beanstalk uses the
     * operations role for permissions to downstream services during this call
     * and during subsequent calls acting on this environment. To specify an
     * operations role, you must have the <code>iam:PassRole</code> permission
     * for the role. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     * >Operations roles</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String operationsRole;

    /**
     * <p>
     * The name of the application that is associated with this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application that is associated with this
     *         environment.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the application that is associated with this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application that is associated with this
     *            environment.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application that is associated with this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application that is associated with this
     *            environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * A unique name for the environment.
     * </p>
     * <p>
     * Constraint: Must be from 4 to 40 characters in length. The name can
     * contain only letters, numbers, and hyphens. It can't start or end with a
     * hyphen. This name must be unique within a region in your account. If the
     * specified name already exists in the region, Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * If you don't specify the <code>CNAMEPrefix</code> parameter, the
     * environment name becomes part of the CNAME, and therefore part of the
     * visible URL for your application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @return <p>
     *         A unique name for the environment.
     *         </p>
     *         <p>
     *         Constraint: Must be from 4 to 40 characters in length. The name
     *         can contain only letters, numbers, and hyphens. It can't start or
     *         end with a hyphen. This name must be unique within a region in
     *         your account. If the specified name already exists in the region,
     *         Elastic Beanstalk returns an <code>InvalidParameterValue</code>
     *         error.
     *         </p>
     *         <p>
     *         If you don't specify the <code>CNAMEPrefix</code> parameter, the
     *         environment name becomes part of the CNAME, and therefore part of
     *         the visible URL for your application.
     *         </p>
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * <p>
     * A unique name for the environment.
     * </p>
     * <p>
     * Constraint: Must be from 4 to 40 characters in length. The name can
     * contain only letters, numbers, and hyphens. It can't start or end with a
     * hyphen. This name must be unique within a region in your account. If the
     * specified name already exists in the region, Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * If you don't specify the <code>CNAMEPrefix</code> parameter, the
     * environment name becomes part of the CNAME, and therefore part of the
     * visible URL for your application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            A unique name for the environment.
     *            </p>
     *            <p>
     *            Constraint: Must be from 4 to 40 characters in length. The
     *            name can contain only letters, numbers, and hyphens. It can't
     *            start or end with a hyphen. This name must be unique within a
     *            region in your account. If the specified name already exists
     *            in the region, Elastic Beanstalk returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     *            <p>
     *            If you don't specify the <code>CNAMEPrefix</code> parameter,
     *            the environment name becomes part of the CNAME, and therefore
     *            part of the visible URL for your application.
     *            </p>
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * A unique name for the environment.
     * </p>
     * <p>
     * Constraint: Must be from 4 to 40 characters in length. The name can
     * contain only letters, numbers, and hyphens. It can't start or end with a
     * hyphen. This name must be unique within a region in your account. If the
     * specified name already exists in the region, Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * If you don't specify the <code>CNAMEPrefix</code> parameter, the
     * environment name becomes part of the CNAME, and therefore part of the
     * visible URL for your application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param environmentName <p>
     *            A unique name for the environment.
     *            </p>
     *            <p>
     *            Constraint: Must be from 4 to 40 characters in length. The
     *            name can contain only letters, numbers, and hyphens. It can't
     *            start or end with a hyphen. This name must be unique within a
     *            region in your account. If the specified name already exists
     *            in the region, Elastic Beanstalk returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     *            <p>
     *            If you don't specify the <code>CNAMEPrefix</code> parameter,
     *            the environment name becomes part of the CNAME, and therefore
     *            part of the visible URL for your application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * <p>
     * The name of the group to which the target environment belongs. Specify a
     * group name only if the environment's name is specified in an environment
     * manifest and not with the environment name parameter. See <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     * >Environment Manifest (env.yaml)</a> for details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     *
     * @return <p>
     *         The name of the group to which the target environment belongs.
     *         Specify a group name only if the environment's name is specified
     *         in an environment manifest and not with the environment name
     *         parameter. See <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     *         >Environment Manifest (env.yaml)</a> for details.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The name of the group to which the target environment belongs. Specify a
     * group name only if the environment's name is specified in an environment
     * manifest and not with the environment name parameter. See <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     * >Environment Manifest (env.yaml)</a> for details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     *
     * @param groupName <p>
     *            The name of the group to which the target environment belongs.
     *            Specify a group name only if the environment's name is
     *            specified in an environment manifest and not with the
     *            environment name parameter. See <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     *            >Environment Manifest (env.yaml)</a> for details.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group to which the target environment belongs. Specify a
     * group name only if the environment's name is specified in an environment
     * manifest and not with the environment name parameter. See <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     * >Environment Manifest (env.yaml)</a> for details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     *
     * @param groupName <p>
     *            The name of the group to which the target environment belongs.
     *            Specify a group name only if the environment's name is
     *            specified in an environment manifest and not with the
     *            environment name parameter. See <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     *            >Environment Manifest (env.yaml)</a> for details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * Your description for this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @return <p>
     *         Your description for this environment.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Your description for this environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            Your description for this environment.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Your description for this environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            Your description for this environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * If specified, the environment attempts to use this value as the prefix
     * for the CNAME in your Elastic Beanstalk environment URL. If not
     * specified, the CNAME is generated automatically by appending a random
     * alphanumeric string to the environment name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 63<br/>
     *
     * @return <p>
     *         If specified, the environment attempts to use this value as the
     *         prefix for the CNAME in your Elastic Beanstalk environment URL.
     *         If not specified, the CNAME is generated automatically by
     *         appending a random alphanumeric string to the environment name.
     *         </p>
     */
    public String getCNAMEPrefix() {
        return cNAMEPrefix;
    }

    /**
     * <p>
     * If specified, the environment attempts to use this value as the prefix
     * for the CNAME in your Elastic Beanstalk environment URL. If not
     * specified, the CNAME is generated automatically by appending a random
     * alphanumeric string to the environment name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 63<br/>
     *
     * @param cNAMEPrefix <p>
     *            If specified, the environment attempts to use this value as
     *            the prefix for the CNAME in your Elastic Beanstalk environment
     *            URL. If not specified, the CNAME is generated automatically by
     *            appending a random alphanumeric string to the environment
     *            name.
     *            </p>
     */
    public void setCNAMEPrefix(String cNAMEPrefix) {
        this.cNAMEPrefix = cNAMEPrefix;
    }

    /**
     * <p>
     * If specified, the environment attempts to use this value as the prefix
     * for the CNAME in your Elastic Beanstalk environment URL. If not
     * specified, the CNAME is generated automatically by appending a random
     * alphanumeric string to the environment name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 63<br/>
     *
     * @param cNAMEPrefix <p>
     *            If specified, the environment attempts to use this value as
     *            the prefix for the CNAME in your Elastic Beanstalk environment
     *            URL. If not specified, the CNAME is generated automatically by
     *            appending a random alphanumeric string to the environment
     *            name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withCNAMEPrefix(String cNAMEPrefix) {
        this.cNAMEPrefix = cNAMEPrefix;
        return this;
    }

    /**
     * <p>
     * Specifies the tier to use in creating this environment. The environment
     * tier that you choose determines whether Elastic Beanstalk provisions
     * resources to support a web application that handles HTTP(S) requests or a
     * web application that handles background-processing tasks.
     * </p>
     *
     * @return <p>
     *         Specifies the tier to use in creating this environment. The
     *         environment tier that you choose determines whether Elastic
     *         Beanstalk provisions resources to support a web application that
     *         handles HTTP(S) requests or a web application that handles
     *         background-processing tasks.
     *         </p>
     */
    public EnvironmentTier getTier() {
        return tier;
    }

    /**
     * <p>
     * Specifies the tier to use in creating this environment. The environment
     * tier that you choose determines whether Elastic Beanstalk provisions
     * resources to support a web application that handles HTTP(S) requests or a
     * web application that handles background-processing tasks.
     * </p>
     *
     * @param tier <p>
     *            Specifies the tier to use in creating this environment. The
     *            environment tier that you choose determines whether Elastic
     *            Beanstalk provisions resources to support a web application
     *            that handles HTTP(S) requests or a web application that
     *            handles background-processing tasks.
     *            </p>
     */
    public void setTier(EnvironmentTier tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * Specifies the tier to use in creating this environment. The environment
     * tier that you choose determines whether Elastic Beanstalk provisions
     * resources to support a web application that handles HTTP(S) requests or a
     * web application that handles background-processing tasks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tier <p>
     *            Specifies the tier to use in creating this environment. The
     *            environment tier that you choose determines whether Elastic
     *            Beanstalk provisions resources to support a web application
     *            that handles HTTP(S) requests or a web application that
     *            handles background-processing tasks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withTier(EnvironmentTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * <p>
     * Specifies the tags applied to resources in the environment.
     * </p>
     *
     * @return <p>
     *         Specifies the tags applied to resources in the environment.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies the tags applied to resources in the environment.
     * </p>
     *
     * @param tags <p>
     *            Specifies the tags applied to resources in the environment.
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
     * Specifies the tags applied to resources in the environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Specifies the tags applied to resources in the environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withTags(Tag... tags) {
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
     * Specifies the tags applied to resources in the environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Specifies the tags applied to resources in the environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the application version to deploy.
     * </p>
     * <p>
     * Default: If not specified, Elastic Beanstalk attempts to deploy the
     * sample application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application version to deploy.
     *         </p>
     *         <p>
     *         Default: If not specified, Elastic Beanstalk attempts to deploy
     *         the sample application.
     *         </p>
     */
    public String getVersionLabel() {
        return versionLabel;
    }

    /**
     * <p>
     * The name of the application version to deploy.
     * </p>
     * <p>
     * Default: If not specified, Elastic Beanstalk attempts to deploy the
     * sample application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            The name of the application version to deploy.
     *            </p>
     *            <p>
     *            Default: If not specified, Elastic Beanstalk attempts to
     *            deploy the sample application.
     *            </p>
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * The name of the application version to deploy.
     * </p>
     * <p>
     * Default: If not specified, Elastic Beanstalk attempts to deploy the
     * sample application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            The name of the application version to deploy.
     *            </p>
     *            <p>
     *            Default: If not specified, Elastic Beanstalk attempts to
     *            deploy the sample application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }

    /**
     * <p>
     * The name of the Elastic Beanstalk configuration template to use with the
     * environment.
     * </p>
     * <note>
     * <p>
     * If you specify <code>TemplateName</code>, then don't specify
     * <code>SolutionStackName</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the Elastic Beanstalk configuration template to use
     *         with the environment.
     *         </p>
     *         <note>
     *         <p>
     *         If you specify <code>TemplateName</code>, then don't specify
     *         <code>SolutionStackName</code>.
     *         </p>
     *         </note>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the Elastic Beanstalk configuration template to use with the
     * environment.
     * </p>
     * <note>
     * <p>
     * If you specify <code>TemplateName</code>, then don't specify
     * <code>SolutionStackName</code>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            The name of the Elastic Beanstalk configuration template to
     *            use with the environment.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify <code>TemplateName</code>, then don't specify
     *            <code>SolutionStackName</code>.
     *            </p>
     *            </note>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the Elastic Beanstalk configuration template to use with the
     * environment.
     * </p>
     * <note>
     * <p>
     * If you specify <code>TemplateName</code>, then don't specify
     * <code>SolutionStackName</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName <p>
     *            The name of the Elastic Beanstalk configuration template to
     *            use with the environment.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify <code>TemplateName</code>, then don't specify
     *            <code>SolutionStackName</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The name of an Elastic Beanstalk solution stack (platform version) to use
     * with the environment. If specified, Elastic Beanstalk sets the
     * configuration values to the default values associated with the specified
     * solution stack. For a list of current solution stacks, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/platforms/platforms-supported.html"
     * >Elastic Beanstalk Supported Platforms</a> in the <i>AWS Elastic
     * Beanstalk Platforms</i> guide.
     * </p>
     * <note>
     * <p>
     * If you specify <code>SolutionStackName</code>, don't specify
     * <code>PlatformArn</code> or <code>TemplateName</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The name of an Elastic Beanstalk solution stack (platform
     *         version) to use with the environment. If specified, Elastic
     *         Beanstalk sets the configuration values to the default values
     *         associated with the specified solution stack. For a list of
     *         current solution stacks, see <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/platforms/platforms-supported.html"
     *         >Elastic Beanstalk Supported Platforms</a> in the <i>AWS Elastic
     *         Beanstalk Platforms</i> guide.
     *         </p>
     *         <note>
     *         <p>
     *         If you specify <code>SolutionStackName</code>, don't specify
     *         <code>PlatformArn</code> or <code>TemplateName</code>.
     *         </p>
     *         </note>
     */
    public String getSolutionStackName() {
        return solutionStackName;
    }

    /**
     * <p>
     * The name of an Elastic Beanstalk solution stack (platform version) to use
     * with the environment. If specified, Elastic Beanstalk sets the
     * configuration values to the default values associated with the specified
     * solution stack. For a list of current solution stacks, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/platforms/platforms-supported.html"
     * >Elastic Beanstalk Supported Platforms</a> in the <i>AWS Elastic
     * Beanstalk Platforms</i> guide.
     * </p>
     * <note>
     * <p>
     * If you specify <code>SolutionStackName</code>, don't specify
     * <code>PlatformArn</code> or <code>TemplateName</code>.
     * </p>
     * </note>
     *
     * @param solutionStackName <p>
     *            The name of an Elastic Beanstalk solution stack (platform
     *            version) to use with the environment. If specified, Elastic
     *            Beanstalk sets the configuration values to the default values
     *            associated with the specified solution stack. For a list of
     *            current solution stacks, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/platforms/platforms-supported.html"
     *            >Elastic Beanstalk Supported Platforms</a> in the <i>AWS
     *            Elastic Beanstalk Platforms</i> guide.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify <code>SolutionStackName</code>, don't specify
     *            <code>PlatformArn</code> or <code>TemplateName</code>.
     *            </p>
     *            </note>
     */
    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * The name of an Elastic Beanstalk solution stack (platform version) to use
     * with the environment. If specified, Elastic Beanstalk sets the
     * configuration values to the default values associated with the specified
     * solution stack. For a list of current solution stacks, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/platforms/platforms-supported.html"
     * >Elastic Beanstalk Supported Platforms</a> in the <i>AWS Elastic
     * Beanstalk Platforms</i> guide.
     * </p>
     * <note>
     * <p>
     * If you specify <code>SolutionStackName</code>, don't specify
     * <code>PlatformArn</code> or <code>TemplateName</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutionStackName <p>
     *            The name of an Elastic Beanstalk solution stack (platform
     *            version) to use with the environment. If specified, Elastic
     *            Beanstalk sets the configuration values to the default values
     *            associated with the specified solution stack. For a list of
     *            current solution stacks, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/platforms/platforms-supported.html"
     *            >Elastic Beanstalk Supported Platforms</a> in the <i>AWS
     *            Elastic Beanstalk Platforms</i> guide.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify <code>SolutionStackName</code>, don't specify
     *            <code>PlatformArn</code> or <code>TemplateName</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom platform to use with the
     * environment. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html"
     * >Custom Platforms</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you specify <code>PlatformArn</code>, don't specify
     * <code>SolutionStackName</code>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the custom platform to use with
     *         the environment. For more information, see <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html"
     *         >Custom Platforms</a> in the <i>AWS Elastic Beanstalk Developer
     *         Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         If you specify <code>PlatformArn</code>, don't specify
     *         <code>SolutionStackName</code>.
     *         </p>
     *         </note>
     */
    public String getPlatformArn() {
        return platformArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom platform to use with the
     * environment. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html"
     * >Custom Platforms</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you specify <code>PlatformArn</code>, don't specify
     * <code>SolutionStackName</code>.
     * </p>
     * </note>
     *
     * @param platformArn <p>
     *            The Amazon Resource Name (ARN) of the custom platform to use
     *            with the environment. For more information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html"
     *            >Custom Platforms</a> in the <i>AWS Elastic Beanstalk
     *            Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify <code>PlatformArn</code>, don't specify
     *            <code>SolutionStackName</code>.
     *            </p>
     *            </note>
     */
    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom platform to use with the
     * environment. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html"
     * >Custom Platforms</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you specify <code>PlatformArn</code>, don't specify
     * <code>SolutionStackName</code>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformArn <p>
     *            The Amazon Resource Name (ARN) of the custom platform to use
     *            with the environment. For more information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/custom-platforms.html"
     *            >Custom Platforms</a> in the <i>AWS Elastic Beanstalk
     *            Developer Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            If you specify <code>PlatformArn</code>, don't specify
     *            <code>SolutionStackName</code>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withPlatformArn(String platformArn) {
        this.platformArn = platformArn;
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk sets the specified configuration
     * options to the requested value in the configuration set for the new
     * environment. These override the values obtained from the solution stack
     * or the configuration template.
     * </p>
     *
     * @return <p>
     *         If specified, AWS Elastic Beanstalk sets the specified
     *         configuration options to the requested value in the configuration
     *         set for the new environment. These override the values obtained
     *         from the solution stack or the configuration template.
     *         </p>
     */
    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        return optionSettings;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk sets the specified configuration
     * options to the requested value in the configuration set for the new
     * environment. These override the values obtained from the solution stack
     * or the configuration template.
     * </p>
     *
     * @param optionSettings <p>
     *            If specified, AWS Elastic Beanstalk sets the specified
     *            configuration options to the requested value in the
     *            configuration set for the new environment. These override the
     *            values obtained from the solution stack or the configuration
     *            template.
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
     * If specified, AWS Elastic Beanstalk sets the specified configuration
     * options to the requested value in the configuration set for the new
     * environment. These override the values obtained from the solution stack
     * or the configuration template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            If specified, AWS Elastic Beanstalk sets the specified
     *            configuration options to the requested value in the
     *            configuration set for the new environment. These override the
     *            values obtained from the solution stack or the configuration
     *            template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withOptionSettings(ConfigurationOptionSetting... optionSettings) {
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
     * If specified, AWS Elastic Beanstalk sets the specified configuration
     * options to the requested value in the configuration set for the new
     * environment. These override the values obtained from the solution stack
     * or the configuration template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionSettings <p>
     *            If specified, AWS Elastic Beanstalk sets the specified
     *            configuration options to the requested value in the
     *            configuration set for the new environment. These override the
     *            values obtained from the solution stack or the configuration
     *            template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withOptionSettings(
            java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
        return this;
    }

    /**
     * <p>
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this new environment.
     * </p>
     *
     * @return <p>
     *         A list of custom user-defined configuration options to remove
     *         from the configuration set for this new environment.
     *         </p>
     */
    public java.util.List<OptionSpecification> getOptionsToRemove() {
        return optionsToRemove;
    }

    /**
     * <p>
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this new environment.
     * </p>
     *
     * @param optionsToRemove <p>
     *            A list of custom user-defined configuration options to remove
     *            from the configuration set for this new environment.
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
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this new environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionsToRemove <p>
     *            A list of custom user-defined configuration options to remove
     *            from the configuration set for this new environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withOptionsToRemove(OptionSpecification... optionsToRemove) {
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
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this new environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionsToRemove <p>
     *            A list of custom user-defined configuration options to remove
     *            from the configuration set for this new environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withOptionsToRemove(
            java.util.Collection<OptionSpecification> optionsToRemove) {
        setOptionsToRemove(optionsToRemove);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an existing IAM role to be used as the
     * environment's operations role. If specified, Elastic Beanstalk uses the
     * operations role for permissions to downstream services during this call
     * and during subsequent calls acting on this environment. To specify an
     * operations role, you must have the <code>iam:PassRole</code> permission
     * for the role. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     * >Operations roles</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an existing IAM role to be used
     *         as the environment's operations role. If specified, Elastic
     *         Beanstalk uses the operations role for permissions to downstream
     *         services during this call and during subsequent calls acting on
     *         this environment. To specify an operations role, you must have
     *         the <code>iam:PassRole</code> permission for the role. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     *         >Operations roles</a> in the <i>AWS Elastic Beanstalk Developer
     *         Guide</i>.
     *         </p>
     */
    public String getOperationsRole() {
        return operationsRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an existing IAM role to be used as the
     * environment's operations role. If specified, Elastic Beanstalk uses the
     * operations role for permissions to downstream services during this call
     * and during subsequent calls acting on this environment. To specify an
     * operations role, you must have the <code>iam:PassRole</code> permission
     * for the role. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     * >Operations roles</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param operationsRole <p>
     *            The Amazon Resource Name (ARN) of an existing IAM role to be
     *            used as the environment's operations role. If specified,
     *            Elastic Beanstalk uses the operations role for permissions to
     *            downstream services during this call and during subsequent
     *            calls acting on this environment. To specify an operations
     *            role, you must have the <code>iam:PassRole</code> permission
     *            for the role. For more information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     *            >Operations roles</a> in the <i>AWS Elastic Beanstalk
     *            Developer Guide</i>.
     *            </p>
     */
    public void setOperationsRole(String operationsRole) {
        this.operationsRole = operationsRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an existing IAM role to be used as the
     * environment's operations role. If specified, Elastic Beanstalk uses the
     * operations role for permissions to downstream services during this call
     * and during subsequent calls acting on this environment. To specify an
     * operations role, you must have the <code>iam:PassRole</code> permission
     * for the role. For more information, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     * >Operations roles</a> in the <i>AWS Elastic Beanstalk Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param operationsRole <p>
     *            The Amazon Resource Name (ARN) of an existing IAM role to be
     *            used as the environment's operations role. If specified,
     *            Elastic Beanstalk uses the operations role for permissions to
     *            downstream services during this call and during subsequent
     *            calls acting on this environment. To specify an operations
     *            role, you must have the <code>iam:PassRole</code> permission
     *            for the role. For more information, see <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/iam-operationsrole.html"
     *            >Operations roles</a> in the <i>AWS Elastic Beanstalk
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateEnvironmentRequest withOperationsRole(String operationsRole) {
        this.operationsRole = operationsRole;
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCNAMEPrefix() != null)
            sb.append("CNAMEPrefix: " + getCNAMEPrefix() + ",");
        if (getTier() != null)
            sb.append("Tier: " + getTier() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getVersionLabel() != null)
            sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
        if (getSolutionStackName() != null)
            sb.append("SolutionStackName: " + getSolutionStackName() + ",");
        if (getPlatformArn() != null)
            sb.append("PlatformArn: " + getPlatformArn() + ",");
        if (getOptionSettings() != null)
            sb.append("OptionSettings: " + getOptionSettings() + ",");
        if (getOptionsToRemove() != null)
            sb.append("OptionsToRemove: " + getOptionsToRemove() + ",");
        if (getOperationsRole() != null)
            sb.append("OperationsRole: " + getOperationsRole());
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
                + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCNAMEPrefix() == null) ? 0 : getCNAMEPrefix().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode
                + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        hashCode = prime * hashCode
                + ((getOptionsToRemove() == null) ? 0 : getOptionsToRemove().hashCode());
        hashCode = prime * hashCode
                + ((getOperationsRole() == null) ? 0 : getOperationsRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEnvironmentRequest == false)
            return false;
        CreateEnvironmentRequest other = (CreateEnvironmentRequest) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null
                && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCNAMEPrefix() == null ^ this.getCNAMEPrefix() == null)
            return false;
        if (other.getCNAMEPrefix() != null
                && other.getCNAMEPrefix().equals(this.getCNAMEPrefix()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null
                && other.getVersionLabel().equals(this.getVersionLabel()) == false)
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
        if (other.getOperationsRole() == null ^ this.getOperationsRole() == null)
            return false;
        if (other.getOperationsRole() != null
                && other.getOperationsRole().equals(this.getOperationsRole()) == false)
            return false;
        return true;
    }
}
