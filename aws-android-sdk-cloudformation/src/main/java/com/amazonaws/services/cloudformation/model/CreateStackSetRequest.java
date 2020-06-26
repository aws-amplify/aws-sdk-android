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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a stack set.
 * </p>
 */
public class CreateStackSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name to associate with the stack set. The name must be unique in the
     * Region where you create your stack set.
     * </p>
     * <note>
     * <p>
     * A stack name can contain only alphanumeric characters (case-sensitive)
     * and hyphens. It must start with an alphabetic character and can't be
     * longer than 128 characters.
     * </p>
     * </note>
     */
    private String stackSetName;

    /**
     * <p>
     * A description of the stack set. You can use the description to identify
     * the stack set's purpose or other important information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The structure that contains the template body, with a minimum length of 1
     * byte and a maximum length of 51,200 bytes. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the TemplateBody or the TemplateURL
     * parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String templateBody;

    /**
     * <p>
     * The location of the file that contains the template body. The URL must
     * point to a template (maximum size: 460,800 bytes) that's located in an
     * Amazon S3 bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the TemplateBody or the TemplateURL
     * parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String templateURL;

    /**
     * <p>
     * The input parameters for the stack set template.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack set
     * template contains certain capabilities in order for AWS CloudFormation to
     * create the stack set and related stack instances.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions
     * in your AWS account; for example, by creating new AWS Identity and Access
     * Management (IAM) users. For those stack sets, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the
     * <code>CAPABILITY_IAM</code> or <code>CAPABILITY_NAMED_IAM</code>
     * capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify
     * <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, AWS CloudFormation
     * returns an <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you
     * review all permissions associated with them and edit their permissions if
     * necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html"
     * > AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     * > AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     * > AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html"
     * > AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     * > AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html"
     * > AWS::IAM::User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html"
     * > AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some templates contain macros. If your stack template contains one or
     * more macros, and you choose to create a stack directly from the processed
     * template, without first reviewing the resulting changes in a change set,
     * you must acknowledge this capability. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     * >Using AWS CloudFormation Macros to Perform Custom Processing on
     * Templates</a>.
     * </p>
     * <note>
     * <p>
     * Stack sets do not currently support macros in stack templates. (This
     * includes the <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS
     * CloudFormation.) Even if you specify this capability, if you include a
     * macro in your template the stack set operation will fail.
     * </p>
     * </note></li>
     * </ul>
     */
    private java.util.List<String> capabilities;

    /**
     * <p>
     * The key-value pairs to associate with this stack set and the stacks
     * created from it. AWS CloudFormation also propagates these tags to
     * supported resources that are created in the stacks. A maximum number of
     * 50 tags can be specified.
     * </p>
     * <p>
     * If you specify tags as part of a <code>CreateStackSet</code> action, AWS
     * CloudFormation checks to see if you have the required IAM permission to
     * tag resources. If you don't, the entire <code>CreateStackSet</code>
     * action fails with an <code>access denied</code> error, and the stack set
     * is not created.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role to use to create this
     * stack set.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized administrator roles
     * to control which users or groups can manage specific stack sets within
     * the same administrator account. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     * >Prerequisites: Granting Permissions for Stack Set Operations</a> in the
     * <i>AWS CloudFormation User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String administrationRoleARN;

    /**
     * <p>
     * The name of the IAM execution role to use to create the stack set. If you
     * do not specify an execution role, AWS CloudFormation uses the
     * <code>AWSCloudFormationStackSetExecutionRole</code> role for the stack
     * set operation.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized execution roles to
     * control which stack resources users and groups can include in their stack
     * sets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z_0-9+=,.@-]+<br/>
     */
    private String executionRoleName;

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created. By default, <code>SELF-MANAGED</code> is specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the
     * administrator and execution roles required to deploy to target accounts.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     * >Grant Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically
     * creates the IAM roles required to deploy to accounts managed by AWS
     * Organizations. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, SELF_MANAGED
     */
    private String permissionModel;

    /**
     * <p>
     * Describes whether StackSets automatically deploys to AWS Organizations
     * accounts that are added to the target organization or organizational unit
     * (OU). Specify only if <code>PermissionModel</code> is
     * <code>SERVICE_MANAGED</code>.
     * </p>
     */
    private AutoDeployment autoDeployment;

    /**
     * <p>
     * A unique identifier for this <code>CreateStackSet</code> request. Specify
     * this token if you plan to retry requests so that AWS CloudFormation knows
     * that you're not attempting to create another stack set with the same
     * name. You might retry <code>CreateStackSet</code> requests to ensure that
     * AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one
     * automatically.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name to associate with the stack set. The name must be unique in the
     * Region where you create your stack set.
     * </p>
     * <note>
     * <p>
     * A stack name can contain only alphanumeric characters (case-sensitive)
     * and hyphens. It must start with an alphabetic character and can't be
     * longer than 128 characters.
     * </p>
     * </note>
     *
     * @return <p>
     *         The name to associate with the stack set. The name must be unique
     *         in the Region where you create your stack set.
     *         </p>
     *         <note>
     *         <p>
     *         A stack name can contain only alphanumeric characters
     *         (case-sensitive) and hyphens. It must start with an alphabetic
     *         character and can't be longer than 128 characters.
     *         </p>
     *         </note>
     */
    public String getStackSetName() {
        return stackSetName;
    }

    /**
     * <p>
     * The name to associate with the stack set. The name must be unique in the
     * Region where you create your stack set.
     * </p>
     * <note>
     * <p>
     * A stack name can contain only alphanumeric characters (case-sensitive)
     * and hyphens. It must start with an alphabetic character and can't be
     * longer than 128 characters.
     * </p>
     * </note>
     *
     * @param stackSetName <p>
     *            The name to associate with the stack set. The name must be
     *            unique in the Region where you create your stack set.
     *            </p>
     *            <note>
     *            <p>
     *            A stack name can contain only alphanumeric characters
     *            (case-sensitive) and hyphens. It must start with an alphabetic
     *            character and can't be longer than 128 characters.
     *            </p>
     *            </note>
     */
    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name to associate with the stack set. The name must be unique in the
     * Region where you create your stack set.
     * </p>
     * <note>
     * <p>
     * A stack name can contain only alphanumeric characters (case-sensitive)
     * and hyphens. It must start with an alphabetic character and can't be
     * longer than 128 characters.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetName <p>
     *            The name to associate with the stack set. The name must be
     *            unique in the Region where you create your stack set.
     *            </p>
     *            <note>
     *            <p>
     *            A stack name can contain only alphanumeric characters
     *            (case-sensitive) and hyphens. It must start with an alphabetic
     *            character and can't be longer than 128 characters.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackSetRequest withStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
        return this;
    }

    /**
     * <p>
     * A description of the stack set. You can use the description to identify
     * the stack set's purpose or other important information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A description of the stack set. You can use the description to
     *         identify the stack set's purpose or other important information.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the stack set. You can use the description to identify
     * the stack set's purpose or other important information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A description of the stack set. You can use the description to
     *            identify the stack set's purpose or other important
     *            information.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the stack set. You can use the description to identify
     * the stack set's purpose or other important information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A description of the stack set. You can use the description to
     *            identify the stack set's purpose or other important
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackSetRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The structure that contains the template body, with a minimum length of 1
     * byte and a maximum length of 51,200 bytes. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the TemplateBody or the TemplateURL
     * parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The structure that contains the template body, with a minimum
     *         length of 1 byte and a maximum length of 51,200 bytes. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *         >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *         </p>
     *         <p>
     *         Conditional: You must specify either the TemplateBody or the
     *         TemplateURL parameter, but not both.
     *         </p>
     */
    public String getTemplateBody() {
        return templateBody;
    }

    /**
     * <p>
     * The structure that contains the template body, with a minimum length of 1
     * byte and a maximum length of 51,200 bytes. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the TemplateBody or the TemplateURL
     * parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody <p>
     *            The structure that contains the template body, with a minimum
     *            length of 1 byte and a maximum length of 51,200 bytes. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *            </p>
     *            <p>
     *            Conditional: You must specify either the TemplateBody or the
     *            TemplateURL parameter, but not both.
     *            </p>
     */
    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The structure that contains the template body, with a minimum length of 1
     * byte and a maximum length of 51,200 bytes. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the TemplateBody or the TemplateURL
     * parameter, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody <p>
     *            The structure that contains the template body, with a minimum
     *            length of 1 byte and a maximum length of 51,200 bytes. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *            </p>
     *            <p>
     *            Conditional: You must specify either the TemplateBody or the
     *            TemplateURL parameter, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackSetRequest withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * <p>
     * The location of the file that contains the template body. The URL must
     * point to a template (maximum size: 460,800 bytes) that's located in an
     * Amazon S3 bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the TemplateBody or the TemplateURL
     * parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The location of the file that contains the template body. The URL
     *         must point to a template (maximum size: 460,800 bytes) that's
     *         located in an Amazon S3 bucket. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *         >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *         </p>
     *         <p>
     *         Conditional: You must specify either the TemplateBody or the
     *         TemplateURL parameter, but not both.
     *         </p>
     */
    public String getTemplateURL() {
        return templateURL;
    }

    /**
     * <p>
     * The location of the file that contains the template body. The URL must
     * point to a template (maximum size: 460,800 bytes) that's located in an
     * Amazon S3 bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the TemplateBody or the TemplateURL
     * parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL <p>
     *            The location of the file that contains the template body. The
     *            URL must point to a template (maximum size: 460,800 bytes)
     *            that's located in an Amazon S3 bucket. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *            </p>
     *            <p>
     *            Conditional: You must specify either the TemplateBody or the
     *            TemplateURL parameter, but not both.
     *            </p>
     */
    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }

    /**
     * <p>
     * The location of the file that contains the template body. The URL must
     * point to a template (maximum size: 460,800 bytes) that's located in an
     * Amazon S3 bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the TemplateBody or the TemplateURL
     * parameter, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL <p>
     *            The location of the file that contains the template body. The
     *            URL must point to a template (maximum size: 460,800 bytes)
     *            that's located in an Amazon S3 bucket. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *            </p>
     *            <p>
     *            Conditional: You must specify either the TemplateBody or the
     *            TemplateURL parameter, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackSetRequest withTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }

    /**
     * <p>
     * The input parameters for the stack set template.
     * </p>
     *
     * @return <p>
     *         The input parameters for the stack set template.
     *         </p>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The input parameters for the stack set template.
     * </p>
     *
     * @param parameters <p>
     *            The input parameters for the stack set template.
     *            </p>
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<Parameter>(parameters);
    }

    /**
     * <p>
     * The input parameters for the stack set template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            The input parameters for the stack set template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackSetRequest withParameters(Parameter... parameters) {
        if (getParameters() == null) {
            this.parameters = new java.util.ArrayList<Parameter>(parameters.length);
        }
        for (Parameter value : parameters) {
            this.parameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The input parameters for the stack set template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            The input parameters for the stack set template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackSetRequest withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack set
     * template contains certain capabilities in order for AWS CloudFormation to
     * create the stack set and related stack instances.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions
     * in your AWS account; for example, by creating new AWS Identity and Access
     * Management (IAM) users. For those stack sets, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the
     * <code>CAPABILITY_IAM</code> or <code>CAPABILITY_NAMED_IAM</code>
     * capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify
     * <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, AWS CloudFormation
     * returns an <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you
     * review all permissions associated with them and edit their permissions if
     * necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html"
     * > AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     * > AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     * > AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html"
     * > AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     * > AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html"
     * > AWS::IAM::User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html"
     * > AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some templates contain macros. If your stack template contains one or
     * more macros, and you choose to create a stack directly from the processed
     * template, without first reviewing the resulting changes in a change set,
     * you must acknowledge this capability. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     * >Using AWS CloudFormation Macros to Perform Custom Processing on
     * Templates</a>.
     * </p>
     * <note>
     * <p>
     * Stack sets do not currently support macros in stack templates. (This
     * includes the <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS
     * CloudFormation.) Even if you specify this capability, if you include a
     * macro in your template the stack set operation will fail.
     * </p>
     * </note></li>
     * </ul>
     *
     * @return <p>
     *         In some cases, you must explicitly acknowledge that your stack
     *         set template contains certain capabilities in order for AWS
     *         CloudFormation to create the stack set and related stack
     *         instances.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *         </p>
     *         <p>
     *         Some stack templates might include resources that can affect
     *         permissions in your AWS account; for example, by creating new AWS
     *         Identity and Access Management (IAM) users. For those stack sets,
     *         you must explicitly acknowledge this by specifying one of these
     *         capabilities.
     *         </p>
     *         <p>
     *         The following IAM resources require you to specify either the
     *         <code>CAPABILITY_IAM</code> or <code>CAPABILITY_NAMED_IAM</code>
     *         capability.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you have IAM resources, you can specify either capability.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you have IAM resources with custom names, you <i>must</i>
     *         specify <code>CAPABILITY_NAMED_IAM</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you don't specify either of these capabilities, AWS
     *         CloudFormation returns an <code>InsufficientCapabilities</code>
     *         error.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If your stack template contains these resources, we recommend
     *         that you review all permissions associated with them and edit
     *         their permissions if necessary.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html"
     *         > AWS::IAM::AccessKey</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     *         > AWS::IAM::Group</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     *         > AWS::IAM::InstanceProfile</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html"
     *         > AWS::IAM::Policy</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     *         > AWS::IAM::Role</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html"
     *         > AWS::IAM::User</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html"
     *         > AWS::IAM::UserToGroupAddition</a>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *         >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CAPABILITY_AUTO_EXPAND</code>
     *         </p>
     *         <p>
     *         Some templates contain macros. If your stack template contains
     *         one or more macros, and you choose to create a stack directly
     *         from the processed template, without first reviewing the
     *         resulting changes in a change set, you must acknowledge this
     *         capability. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     *         >Using AWS CloudFormation Macros to Perform Custom Processing on
     *         Templates</a>.
     *         </p>
     *         <note>
     *         <p>
     *         Stack sets do not currently support macros in stack templates.
     *         (This includes the <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *         >AWS::Include</a> and <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *         >AWS::Serverless</a> transforms, which are macros hosted by AWS
     *         CloudFormation.) Even if you specify this capability, if you
     *         include a macro in your template the stack set operation will
     *         fail.
     *         </p>
     *         </note></li>
     *         </ul>
     */
    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack set
     * template contains certain capabilities in order for AWS CloudFormation to
     * create the stack set and related stack instances.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions
     * in your AWS account; for example, by creating new AWS Identity and Access
     * Management (IAM) users. For those stack sets, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the
     * <code>CAPABILITY_IAM</code> or <code>CAPABILITY_NAMED_IAM</code>
     * capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify
     * <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, AWS CloudFormation
     * returns an <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you
     * review all permissions associated with them and edit their permissions if
     * necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html"
     * > AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     * > AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     * > AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html"
     * > AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     * > AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html"
     * > AWS::IAM::User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html"
     * > AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some templates contain macros. If your stack template contains one or
     * more macros, and you choose to create a stack directly from the processed
     * template, without first reviewing the resulting changes in a change set,
     * you must acknowledge this capability. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     * >Using AWS CloudFormation Macros to Perform Custom Processing on
     * Templates</a>.
     * </p>
     * <note>
     * <p>
     * Stack sets do not currently support macros in stack templates. (This
     * includes the <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS
     * CloudFormation.) Even if you specify this capability, if you include a
     * macro in your template the stack set operation will fail.
     * </p>
     * </note></li>
     * </ul>
     *
     * @param capabilities <p>
     *            In some cases, you must explicitly acknowledge that your stack
     *            set template contains certain capabilities in order for AWS
     *            CloudFormation to create the stack set and related stack
     *            instances.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CAPABILITY_IAM</code> and
     *            <code>CAPABILITY_NAMED_IAM</code>
     *            </p>
     *            <p>
     *            Some stack templates might include resources that can affect
     *            permissions in your AWS account; for example, by creating new
     *            AWS Identity and Access Management (IAM) users. For those
     *            stack sets, you must explicitly acknowledge this by specifying
     *            one of these capabilities.
     *            </p>
     *            <p>
     *            The following IAM resources require you to specify either the
     *            <code>CAPABILITY_IAM</code> or
     *            <code>CAPABILITY_NAMED_IAM</code> capability.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you have IAM resources, you can specify either capability.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you have IAM resources with custom names, you <i>must</i>
     *            specify <code>CAPABILITY_NAMED_IAM</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you don't specify either of these capabilities, AWS
     *            CloudFormation returns an
     *            <code>InsufficientCapabilities</code> error.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If your stack template contains these resources, we recommend
     *            that you review all permissions associated with them and edit
     *            their permissions if necessary.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html"
     *            > AWS::IAM::AccessKey</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     *            > AWS::IAM::Group</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     *            > AWS::IAM::InstanceProfile</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html"
     *            > AWS::IAM::Policy</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     *            > AWS::IAM::Role</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html"
     *            > AWS::IAM::User</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html"
     *            > AWS::IAM::UserToGroupAddition</a>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *            >Acknowledging IAM Resources in AWS CloudFormation
     *            Templates</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CAPABILITY_AUTO_EXPAND</code>
     *            </p>
     *            <p>
     *            Some templates contain macros. If your stack template contains
     *            one or more macros, and you choose to create a stack directly
     *            from the processed template, without first reviewing the
     *            resulting changes in a change set, you must acknowledge this
     *            capability. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     *            >Using AWS CloudFormation Macros to Perform Custom Processing
     *            on Templates</a>.
     *            </p>
     *            <note>
     *            <p>
     *            Stack sets do not currently support macros in stack templates.
     *            (This includes the <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *            >AWS::Include</a> and <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *            >AWS::Serverless</a> transforms, which are macros hosted by
     *            AWS CloudFormation.) Even if you specify this capability, if
     *            you include a macro in your template the stack set operation
     *            will fail.
     *            </p>
     *            </note></li>
     *            </ul>
     */
    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new java.util.ArrayList<String>(capabilities);
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack set
     * template contains certain capabilities in order for AWS CloudFormation to
     * create the stack set and related stack instances.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions
     * in your AWS account; for example, by creating new AWS Identity and Access
     * Management (IAM) users. For those stack sets, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the
     * <code>CAPABILITY_IAM</code> or <code>CAPABILITY_NAMED_IAM</code>
     * capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify
     * <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, AWS CloudFormation
     * returns an <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you
     * review all permissions associated with them and edit their permissions if
     * necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html"
     * > AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     * > AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     * > AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html"
     * > AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     * > AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html"
     * > AWS::IAM::User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html"
     * > AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some templates contain macros. If your stack template contains one or
     * more macros, and you choose to create a stack directly from the processed
     * template, without first reviewing the resulting changes in a change set,
     * you must acknowledge this capability. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     * >Using AWS CloudFormation Macros to Perform Custom Processing on
     * Templates</a>.
     * </p>
     * <note>
     * <p>
     * Stack sets do not currently support macros in stack templates. (This
     * includes the <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS
     * CloudFormation.) Even if you specify this capability, if you include a
     * macro in your template the stack set operation will fail.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            In some cases, you must explicitly acknowledge that your stack
     *            set template contains certain capabilities in order for AWS
     *            CloudFormation to create the stack set and related stack
     *            instances.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CAPABILITY_IAM</code> and
     *            <code>CAPABILITY_NAMED_IAM</code>
     *            </p>
     *            <p>
     *            Some stack templates might include resources that can affect
     *            permissions in your AWS account; for example, by creating new
     *            AWS Identity and Access Management (IAM) users. For those
     *            stack sets, you must explicitly acknowledge this by specifying
     *            one of these capabilities.
     *            </p>
     *            <p>
     *            The following IAM resources require you to specify either the
     *            <code>CAPABILITY_IAM</code> or
     *            <code>CAPABILITY_NAMED_IAM</code> capability.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you have IAM resources, you can specify either capability.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you have IAM resources with custom names, you <i>must</i>
     *            specify <code>CAPABILITY_NAMED_IAM</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you don't specify either of these capabilities, AWS
     *            CloudFormation returns an
     *            <code>InsufficientCapabilities</code> error.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If your stack template contains these resources, we recommend
     *            that you review all permissions associated with them and edit
     *            their permissions if necessary.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html"
     *            > AWS::IAM::AccessKey</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     *            > AWS::IAM::Group</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     *            > AWS::IAM::InstanceProfile</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html"
     *            > AWS::IAM::Policy</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     *            > AWS::IAM::Role</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html"
     *            > AWS::IAM::User</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html"
     *            > AWS::IAM::UserToGroupAddition</a>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *            >Acknowledging IAM Resources in AWS CloudFormation
     *            Templates</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CAPABILITY_AUTO_EXPAND</code>
     *            </p>
     *            <p>
     *            Some templates contain macros. If your stack template contains
     *            one or more macros, and you choose to create a stack directly
     *            from the processed template, without first reviewing the
     *            resulting changes in a change set, you must acknowledge this
     *            capability. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     *            >Using AWS CloudFormation Macros to Perform Custom Processing
     *            on Templates</a>.
     *            </p>
     *            <note>
     *            <p>
     *            Stack sets do not currently support macros in stack templates.
     *            (This includes the <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *            >AWS::Include</a> and <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *            >AWS::Serverless</a> transforms, which are macros hosted by
     *            AWS CloudFormation.) Even if you specify this capability, if
     *            you include a macro in your template the stack set operation
     *            will fail.
     *            </p>
     *            </note></li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackSetRequest withCapabilities(String... capabilities) {
        if (getCapabilities() == null) {
            this.capabilities = new java.util.ArrayList<String>(capabilities.length);
        }
        for (String value : capabilities) {
            this.capabilities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack set
     * template contains certain capabilities in order for AWS CloudFormation to
     * create the stack set and related stack instances.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions
     * in your AWS account; for example, by creating new AWS Identity and Access
     * Management (IAM) users. For those stack sets, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the
     * <code>CAPABILITY_IAM</code> or <code>CAPABILITY_NAMED_IAM</code>
     * capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify
     * <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, AWS CloudFormation
     * returns an <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you
     * review all permissions associated with them and edit their permissions if
     * necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html"
     * > AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     * > AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     * > AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html"
     * > AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     * > AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html"
     * > AWS::IAM::User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html"
     * > AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some templates contain macros. If your stack template contains one or
     * more macros, and you choose to create a stack directly from the processed
     * template, without first reviewing the resulting changes in a change set,
     * you must acknowledge this capability. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     * >Using AWS CloudFormation Macros to Perform Custom Processing on
     * Templates</a>.
     * </p>
     * <note>
     * <p>
     * Stack sets do not currently support macros in stack templates. (This
     * includes the <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS
     * CloudFormation.) Even if you specify this capability, if you include a
     * macro in your template the stack set operation will fail.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            In some cases, you must explicitly acknowledge that your stack
     *            set template contains certain capabilities in order for AWS
     *            CloudFormation to create the stack set and related stack
     *            instances.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CAPABILITY_IAM</code> and
     *            <code>CAPABILITY_NAMED_IAM</code>
     *            </p>
     *            <p>
     *            Some stack templates might include resources that can affect
     *            permissions in your AWS account; for example, by creating new
     *            AWS Identity and Access Management (IAM) users. For those
     *            stack sets, you must explicitly acknowledge this by specifying
     *            one of these capabilities.
     *            </p>
     *            <p>
     *            The following IAM resources require you to specify either the
     *            <code>CAPABILITY_IAM</code> or
     *            <code>CAPABILITY_NAMED_IAM</code> capability.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you have IAM resources, you can specify either capability.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you have IAM resources with custom names, you <i>must</i>
     *            specify <code>CAPABILITY_NAMED_IAM</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you don't specify either of these capabilities, AWS
     *            CloudFormation returns an
     *            <code>InsufficientCapabilities</code> error.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If your stack template contains these resources, we recommend
     *            that you review all permissions associated with them and edit
     *            their permissions if necessary.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html"
     *            > AWS::IAM::AccessKey</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     *            > AWS::IAM::Group</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     *            > AWS::IAM::InstanceProfile</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html"
     *            > AWS::IAM::Policy</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     *            > AWS::IAM::Role</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html"
     *            > AWS::IAM::User</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html"
     *            > AWS::IAM::UserToGroupAddition</a>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *            >Acknowledging IAM Resources in AWS CloudFormation
     *            Templates</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>CAPABILITY_AUTO_EXPAND</code>
     *            </p>
     *            <p>
     *            Some templates contain macros. If your stack template contains
     *            one or more macros, and you choose to create a stack directly
     *            from the processed template, without first reviewing the
     *            resulting changes in a change set, you must acknowledge this
     *            capability. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     *            >Using AWS CloudFormation Macros to Perform Custom Processing
     *            on Templates</a>.
     *            </p>
     *            <note>
     *            <p>
     *            Stack sets do not currently support macros in stack templates.
     *            (This includes the <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *            >AWS::Include</a> and <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *            >AWS::Serverless</a> transforms, which are macros hosted by
     *            AWS CloudFormation.) Even if you specify this capability, if
     *            you include a macro in your template the stack set operation
     *            will fail.
     *            </p>
     *            </note></li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackSetRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The key-value pairs to associate with this stack set and the stacks
     * created from it. AWS CloudFormation also propagates these tags to
     * supported resources that are created in the stacks. A maximum number of
     * 50 tags can be specified.
     * </p>
     * <p>
     * If you specify tags as part of a <code>CreateStackSet</code> action, AWS
     * CloudFormation checks to see if you have the required IAM permission to
     * tag resources. If you don't, the entire <code>CreateStackSet</code>
     * action fails with an <code>access denied</code> error, and the stack set
     * is not created.
     * </p>
     *
     * @return <p>
     *         The key-value pairs to associate with this stack set and the
     *         stacks created from it. AWS CloudFormation also propagates these
     *         tags to supported resources that are created in the stacks. A
     *         maximum number of 50 tags can be specified.
     *         </p>
     *         <p>
     *         If you specify tags as part of a <code>CreateStackSet</code>
     *         action, AWS CloudFormation checks to see if you have the required
     *         IAM permission to tag resources. If you don't, the entire
     *         <code>CreateStackSet</code> action fails with an
     *         <code>access denied</code> error, and the stack set is not
     *         created.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value pairs to associate with this stack set and the stacks
     * created from it. AWS CloudFormation also propagates these tags to
     * supported resources that are created in the stacks. A maximum number of
     * 50 tags can be specified.
     * </p>
     * <p>
     * If you specify tags as part of a <code>CreateStackSet</code> action, AWS
     * CloudFormation checks to see if you have the required IAM permission to
     * tag resources. If you don't, the entire <code>CreateStackSet</code>
     * action fails with an <code>access denied</code> error, and the stack set
     * is not created.
     * </p>
     *
     * @param tags <p>
     *            The key-value pairs to associate with this stack set and the
     *            stacks created from it. AWS CloudFormation also propagates
     *            these tags to supported resources that are created in the
     *            stacks. A maximum number of 50 tags can be specified.
     *            </p>
     *            <p>
     *            If you specify tags as part of a <code>CreateStackSet</code>
     *            action, AWS CloudFormation checks to see if you have the
     *            required IAM permission to tag resources. If you don't, the
     *            entire <code>CreateStackSet</code> action fails with an
     *            <code>access denied</code> error, and the stack set is not
     *            created.
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
     * The key-value pairs to associate with this stack set and the stacks
     * created from it. AWS CloudFormation also propagates these tags to
     * supported resources that are created in the stacks. A maximum number of
     * 50 tags can be specified.
     * </p>
     * <p>
     * If you specify tags as part of a <code>CreateStackSet</code> action, AWS
     * CloudFormation checks to see if you have the required IAM permission to
     * tag resources. If you don't, the entire <code>CreateStackSet</code>
     * action fails with an <code>access denied</code> error, and the stack set
     * is not created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The key-value pairs to associate with this stack set and the
     *            stacks created from it. AWS CloudFormation also propagates
     *            these tags to supported resources that are created in the
     *            stacks. A maximum number of 50 tags can be specified.
     *            </p>
     *            <p>
     *            If you specify tags as part of a <code>CreateStackSet</code>
     *            action, AWS CloudFormation checks to see if you have the
     *            required IAM permission to tag resources. If you don't, the
     *            entire <code>CreateStackSet</code> action fails with an
     *            <code>access denied</code> error, and the stack set is not
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackSetRequest withTags(Tag... tags) {
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
     * The key-value pairs to associate with this stack set and the stacks
     * created from it. AWS CloudFormation also propagates these tags to
     * supported resources that are created in the stacks. A maximum number of
     * 50 tags can be specified.
     * </p>
     * <p>
     * If you specify tags as part of a <code>CreateStackSet</code> action, AWS
     * CloudFormation checks to see if you have the required IAM permission to
     * tag resources. If you don't, the entire <code>CreateStackSet</code>
     * action fails with an <code>access denied</code> error, and the stack set
     * is not created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The key-value pairs to associate with this stack set and the
     *            stacks created from it. AWS CloudFormation also propagates
     *            these tags to supported resources that are created in the
     *            stacks. A maximum number of 50 tags can be specified.
     *            </p>
     *            <p>
     *            If you specify tags as part of a <code>CreateStackSet</code>
     *            action, AWS CloudFormation checks to see if you have the
     *            required IAM permission to tag resources. If you don't, the
     *            entire <code>CreateStackSet</code> action fails with an
     *            <code>access denied</code> error, and the stack set is not
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackSetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role to use to create this
     * stack set.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized administrator roles
     * to control which users or groups can manage specific stack sets within
     * the same administrator account. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     * >Prerequisites: Granting Permissions for Stack Set Operations</a> in the
     * <i>AWS CloudFormation User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of the IAM role to use to create
     *         this stack set.
     *         </p>
     *         <p>
     *         Specify an IAM role only if you are using customized
     *         administrator roles to control which users or groups can manage
     *         specific stack sets within the same administrator account. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     *         >Prerequisites: Granting Permissions for Stack Set Operations</a>
     *         in the <i>AWS CloudFormation User Guide</i>.
     *         </p>
     */
    public String getAdministrationRoleARN() {
        return administrationRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role to use to create this
     * stack set.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized administrator roles
     * to control which users or groups can manage specific stack sets within
     * the same administrator account. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     * >Prerequisites: Granting Permissions for Stack Set Operations</a> in the
     * <i>AWS CloudFormation User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param administrationRoleARN <p>
     *            The Amazon Resource Number (ARN) of the IAM role to use to
     *            create this stack set.
     *            </p>
     *            <p>
     *            Specify an IAM role only if you are using customized
     *            administrator roles to control which users or groups can
     *            manage specific stack sets within the same administrator
     *            account. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     *            >Prerequisites: Granting Permissions for Stack Set
     *            Operations</a> in the <i>AWS CloudFormation User Guide</i>.
     *            </p>
     */
    public void setAdministrationRoleARN(String administrationRoleARN) {
        this.administrationRoleARN = administrationRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role to use to create this
     * stack set.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized administrator roles
     * to control which users or groups can manage specific stack sets within
     * the same administrator account. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     * >Prerequisites: Granting Permissions for Stack Set Operations</a> in the
     * <i>AWS CloudFormation User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param administrationRoleARN <p>
     *            The Amazon Resource Number (ARN) of the IAM role to use to
     *            create this stack set.
     *            </p>
     *            <p>
     *            Specify an IAM role only if you are using customized
     *            administrator roles to control which users or groups can
     *            manage specific stack sets within the same administrator
     *            account. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     *            >Prerequisites: Granting Permissions for Stack Set
     *            Operations</a> in the <i>AWS CloudFormation User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackSetRequest withAdministrationRoleARN(String administrationRoleARN) {
        this.administrationRoleARN = administrationRoleARN;
        return this;
    }

    /**
     * <p>
     * The name of the IAM execution role to use to create the stack set. If you
     * do not specify an execution role, AWS CloudFormation uses the
     * <code>AWSCloudFormationStackSetExecutionRole</code> role for the stack
     * set operation.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized execution roles to
     * control which stack resources users and groups can include in their stack
     * sets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z_0-9+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the IAM execution role to use to create the stack
     *         set. If you do not specify an execution role, AWS CloudFormation
     *         uses the <code>AWSCloudFormationStackSetExecutionRole</code> role
     *         for the stack set operation.
     *         </p>
     *         <p>
     *         Specify an IAM role only if you are using customized execution
     *         roles to control which stack resources users and groups can
     *         include in their stack sets.
     *         </p>
     */
    public String getExecutionRoleName() {
        return executionRoleName;
    }

    /**
     * <p>
     * The name of the IAM execution role to use to create the stack set. If you
     * do not specify an execution role, AWS CloudFormation uses the
     * <code>AWSCloudFormationStackSetExecutionRole</code> role for the stack
     * set operation.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized execution roles to
     * control which stack resources users and groups can include in their stack
     * sets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z_0-9+=,.@-]+<br/>
     *
     * @param executionRoleName <p>
     *            The name of the IAM execution role to use to create the stack
     *            set. If you do not specify an execution role, AWS
     *            CloudFormation uses the
     *            <code>AWSCloudFormationStackSetExecutionRole</code> role for
     *            the stack set operation.
     *            </p>
     *            <p>
     *            Specify an IAM role only if you are using customized execution
     *            roles to control which stack resources users and groups can
     *            include in their stack sets.
     *            </p>
     */
    public void setExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
    }

    /**
     * <p>
     * The name of the IAM execution role to use to create the stack set. If you
     * do not specify an execution role, AWS CloudFormation uses the
     * <code>AWSCloudFormationStackSetExecutionRole</code> role for the stack
     * set operation.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized execution roles to
     * control which stack resources users and groups can include in their stack
     * sets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z_0-9+=,.@-]+<br/>
     *
     * @param executionRoleName <p>
     *            The name of the IAM execution role to use to create the stack
     *            set. If you do not specify an execution role, AWS
     *            CloudFormation uses the
     *            <code>AWSCloudFormationStackSetExecutionRole</code> role for
     *            the stack set operation.
     *            </p>
     *            <p>
     *            Specify an IAM role only if you are using customized execution
     *            roles to control which stack resources users and groups can
     *            include in their stack sets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackSetRequest withExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
        return this;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created. By default, <code>SELF-MANAGED</code> is specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the
     * administrator and execution roles required to deploy to target accounts.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     * >Grant Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically
     * creates the IAM roles required to deploy to accounts managed by AWS
     * Organizations. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, SELF_MANAGED
     *
     * @return <p>
     *         Describes how the IAM roles required for stack set operations are
     *         created. By default, <code>SELF-MANAGED</code> is specified.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         With <code>self-managed</code> permissions, you must create the
     *         administrator and execution roles required to deploy to target
     *         accounts. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     *         >Grant Self-Managed Stack Set Permissions</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         With <code>service-managed</code> permissions, StackSets
     *         automatically creates the IAM roles required to deploy to
     *         accounts managed by AWS Organizations. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *         >Grant Service-Managed Stack Set Permissions</a>.
     *         </p>
     *         </li>
     *         </ul>
     * @see PermissionModels
     */
    public String getPermissionModel() {
        return permissionModel;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created. By default, <code>SELF-MANAGED</code> is specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the
     * administrator and execution roles required to deploy to target accounts.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     * >Grant Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically
     * creates the IAM roles required to deploy to accounts managed by AWS
     * Organizations. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, SELF_MANAGED
     *
     * @param permissionModel <p>
     *            Describes how the IAM roles required for stack set operations
     *            are created. By default, <code>SELF-MANAGED</code> is
     *            specified.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            With <code>self-managed</code> permissions, you must create
     *            the administrator and execution roles required to deploy to
     *            target accounts. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     *            >Grant Self-Managed Stack Set Permissions</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            With <code>service-managed</code> permissions, StackSets
     *            automatically creates the IAM roles required to deploy to
     *            accounts managed by AWS Organizations. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *            >Grant Service-Managed Stack Set Permissions</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @see PermissionModels
     */
    public void setPermissionModel(String permissionModel) {
        this.permissionModel = permissionModel;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created. By default, <code>SELF-MANAGED</code> is specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the
     * administrator and execution roles required to deploy to target accounts.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     * >Grant Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically
     * creates the IAM roles required to deploy to accounts managed by AWS
     * Organizations. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, SELF_MANAGED
     *
     * @param permissionModel <p>
     *            Describes how the IAM roles required for stack set operations
     *            are created. By default, <code>SELF-MANAGED</code> is
     *            specified.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            With <code>self-managed</code> permissions, you must create
     *            the administrator and execution roles required to deploy to
     *            target accounts. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     *            >Grant Self-Managed Stack Set Permissions</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            With <code>service-managed</code> permissions, StackSets
     *            automatically creates the IAM roles required to deploy to
     *            accounts managed by AWS Organizations. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *            >Grant Service-Managed Stack Set Permissions</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PermissionModels
     */
    public CreateStackSetRequest withPermissionModel(String permissionModel) {
        this.permissionModel = permissionModel;
        return this;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created. By default, <code>SELF-MANAGED</code> is specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the
     * administrator and execution roles required to deploy to target accounts.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     * >Grant Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically
     * creates the IAM roles required to deploy to accounts managed by AWS
     * Organizations. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, SELF_MANAGED
     *
     * @param permissionModel <p>
     *            Describes how the IAM roles required for stack set operations
     *            are created. By default, <code>SELF-MANAGED</code> is
     *            specified.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            With <code>self-managed</code> permissions, you must create
     *            the administrator and execution roles required to deploy to
     *            target accounts. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     *            >Grant Self-Managed Stack Set Permissions</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            With <code>service-managed</code> permissions, StackSets
     *            automatically creates the IAM roles required to deploy to
     *            accounts managed by AWS Organizations. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *            >Grant Service-Managed Stack Set Permissions</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @see PermissionModels
     */
    public void setPermissionModel(PermissionModels permissionModel) {
        this.permissionModel = permissionModel.toString();
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created. By default, <code>SELF-MANAGED</code> is specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the
     * administrator and execution roles required to deploy to target accounts.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     * >Grant Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically
     * creates the IAM roles required to deploy to accounts managed by AWS
     * Organizations. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_MANAGED, SELF_MANAGED
     *
     * @param permissionModel <p>
     *            Describes how the IAM roles required for stack set operations
     *            are created. By default, <code>SELF-MANAGED</code> is
     *            specified.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            With <code>self-managed</code> permissions, you must create
     *            the administrator and execution roles required to deploy to
     *            target accounts. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     *            >Grant Self-Managed Stack Set Permissions</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            With <code>service-managed</code> permissions, StackSets
     *            automatically creates the IAM roles required to deploy to
     *            accounts managed by AWS Organizations. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *            >Grant Service-Managed Stack Set Permissions</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PermissionModels
     */
    public CreateStackSetRequest withPermissionModel(PermissionModels permissionModel) {
        this.permissionModel = permissionModel.toString();
        return this;
    }

    /**
     * <p>
     * Describes whether StackSets automatically deploys to AWS Organizations
     * accounts that are added to the target organization or organizational unit
     * (OU). Specify only if <code>PermissionModel</code> is
     * <code>SERVICE_MANAGED</code>.
     * </p>
     *
     * @return <p>
     *         Describes whether StackSets automatically deploys to AWS
     *         Organizations accounts that are added to the target organization
     *         or organizational unit (OU). Specify only if
     *         <code>PermissionModel</code> is <code>SERVICE_MANAGED</code>.
     *         </p>
     */
    public AutoDeployment getAutoDeployment() {
        return autoDeployment;
    }

    /**
     * <p>
     * Describes whether StackSets automatically deploys to AWS Organizations
     * accounts that are added to the target organization or organizational unit
     * (OU). Specify only if <code>PermissionModel</code> is
     * <code>SERVICE_MANAGED</code>.
     * </p>
     *
     * @param autoDeployment <p>
     *            Describes whether StackSets automatically deploys to AWS
     *            Organizations accounts that are added to the target
     *            organization or organizational unit (OU). Specify only if
     *            <code>PermissionModel</code> is <code>SERVICE_MANAGED</code>.
     *            </p>
     */
    public void setAutoDeployment(AutoDeployment autoDeployment) {
        this.autoDeployment = autoDeployment;
    }

    /**
     * <p>
     * Describes whether StackSets automatically deploys to AWS Organizations
     * accounts that are added to the target organization or organizational unit
     * (OU). Specify only if <code>PermissionModel</code> is
     * <code>SERVICE_MANAGED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoDeployment <p>
     *            Describes whether StackSets automatically deploys to AWS
     *            Organizations accounts that are added to the target
     *            organization or organizational unit (OU). Specify only if
     *            <code>PermissionModel</code> is <code>SERVICE_MANAGED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackSetRequest withAutoDeployment(AutoDeployment autoDeployment) {
        this.autoDeployment = autoDeployment;
        return this;
    }

    /**
     * <p>
     * A unique identifier for this <code>CreateStackSet</code> request. Specify
     * this token if you plan to retry requests so that AWS CloudFormation knows
     * that you're not attempting to create another stack set with the same
     * name. You might retry <code>CreateStackSet</code> requests to ensure that
     * AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one
     * automatically.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         A unique identifier for this <code>CreateStackSet</code> request.
     *         Specify this token if you plan to retry requests so that AWS
     *         CloudFormation knows that you're not attempting to create another
     *         stack set with the same name. You might retry
     *         <code>CreateStackSet</code> requests to ensure that AWS
     *         CloudFormation successfully received them.
     *         </p>
     *         <p>
     *         If you don't specify an operation ID, the SDK generates one
     *         automatically.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>CreateStackSet</code> request. Specify
     * this token if you plan to retry requests so that AWS CloudFormation knows
     * that you're not attempting to create another stack set with the same
     * name. You might retry <code>CreateStackSet</code> requests to ensure that
     * AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one
     * automatically.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            A unique identifier for this <code>CreateStackSet</code>
     *            request. Specify this token if you plan to retry requests so
     *            that AWS CloudFormation knows that you're not attempting to
     *            create another stack set with the same name. You might retry
     *            <code>CreateStackSet</code> requests to ensure that AWS
     *            CloudFormation successfully received them.
     *            </p>
     *            <p>
     *            If you don't specify an operation ID, the SDK generates one
     *            automatically.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>CreateStackSet</code> request. Specify
     * this token if you plan to retry requests so that AWS CloudFormation knows
     * that you're not attempting to create another stack set with the same
     * name. You might retry <code>CreateStackSet</code> requests to ensure that
     * AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one
     * automatically.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            A unique identifier for this <code>CreateStackSet</code>
     *            request. Specify this token if you plan to retry requests so
     *            that AWS CloudFormation knows that you're not attempting to
     *            create another stack set with the same name. You might retry
     *            <code>CreateStackSet</code> requests to ensure that AWS
     *            CloudFormation successfully received them.
     *            </p>
     *            <p>
     *            If you don't specify an operation ID, the SDK generates one
     *            automatically.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackSetRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
        if (getStackSetName() != null)
            sb.append("StackSetName: " + getStackSetName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: " + getTemplateBody() + ",");
        if (getTemplateURL() != null)
            sb.append("TemplateURL: " + getTemplateURL() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getCapabilities() != null)
            sb.append("Capabilities: " + getCapabilities() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getAdministrationRoleARN() != null)
            sb.append("AdministrationRoleARN: " + getAdministrationRoleARN() + ",");
        if (getExecutionRoleName() != null)
            sb.append("ExecutionRoleName: " + getExecutionRoleName() + ",");
        if (getPermissionModel() != null)
            sb.append("PermissionModel: " + getPermissionModel() + ",");
        if (getAutoDeployment() != null)
            sb.append("AutoDeployment: " + getAutoDeployment() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateURL() == null) ? 0 : getTemplateURL().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdministrationRoleARN() == null) ? 0 : getAdministrationRoleARN().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionRoleName() == null) ? 0 : getExecutionRoleName().hashCode());
        hashCode = prime * hashCode
                + ((getPermissionModel() == null) ? 0 : getPermissionModel().hashCode());
        hashCode = prime * hashCode
                + ((getAutoDeployment() == null) ? 0 : getAutoDeployment().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStackSetRequest == false)
            return false;
        CreateStackSetRequest other = (CreateStackSetRequest) obj;

        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null
                && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null
                && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getTemplateURL() == null ^ this.getTemplateURL() == null)
            return false;
        if (other.getTemplateURL() != null
                && other.getTemplateURL().equals(this.getTemplateURL()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null
                && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAdministrationRoleARN() == null ^ this.getAdministrationRoleARN() == null)
            return false;
        if (other.getAdministrationRoleARN() != null
                && other.getAdministrationRoleARN().equals(this.getAdministrationRoleARN()) == false)
            return false;
        if (other.getExecutionRoleName() == null ^ this.getExecutionRoleName() == null)
            return false;
        if (other.getExecutionRoleName() != null
                && other.getExecutionRoleName().equals(this.getExecutionRoleName()) == false)
            return false;
        if (other.getPermissionModel() == null ^ this.getPermissionModel() == null)
            return false;
        if (other.getPermissionModel() != null
                && other.getPermissionModel().equals(this.getPermissionModel()) == false)
            return false;
        if (other.getAutoDeployment() == null ^ this.getAutoDeployment() == null)
            return false;
        if (other.getAutoDeployment() != null
                && other.getAutoDeployment().equals(this.getAutoDeployment()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
