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
 * Updates the stack set, and associated stack instances in the specified
 * accounts and Regions.
 * </p>
 * <p>
 * Even if the stack set operation created by updating the stack set fails
 * (completely or partially, below or above a specified failure tolerance), the
 * stack set is updated with your changes. Subsequent
 * <a>CreateStackInstances</a> calls on the specified stack set use the updated
 * stack set.
 * </p>
 */
public class UpdateStackSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name or unique ID of the stack set that you want to update.
     * </p>
     */
    private String stackSetName;

    /**
     * <p>
     * A brief description of updates that you are making.
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
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code> or <code>TemplateURL</code>—or set
     * <code>UsePreviousTemplate</code> to true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String templateBody;

    /**
     * <p>
     * The location of the file that contains the template body. The URL must
     * point to a template (maximum size: 460,800 bytes) that is located in an
     * Amazon S3 bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code> or <code>TemplateURL</code>—or set
     * <code>UsePreviousTemplate</code> to true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String templateURL;

    /**
     * <p>
     * Use the existing template that's associated with the stack set that
     * you're updating.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code> or <code>TemplateURL</code>—or set
     * <code>UsePreviousTemplate</code> to true.
     * </p>
     */
    private Boolean usePreviousTemplate;

    /**
     * <p>
     * A list of input parameters for the stack set template.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template
     * contains certain capabilities in order for AWS CloudFormation to update
     * the stack set and its associated stack instances.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions
     * in your AWS account; for example, by creating new AWS Identity and Access
     * Management (IAM) users. For those stacks sets, you must explicitly
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
     * more macros, and you choose to update a stack directly from the processed
     * template, without first reviewing the resulting changes in a change set,
     * you must acknowledge this capability. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     * >Using AWS CloudFormation Macros to Perform Custom Processing on
     * Templates</a>.
     * </p>
     * <important>
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
     * </important></li>
     * </ul>
     */
    private java.util.List<String> capabilities;

    /**
     * <p>
     * The key-value pairs to associate with this stack set and the stacks
     * created from it. AWS CloudFormation also propagates these tags to
     * supported resources that are created in the stacks. You can specify a
     * maximum number of 50 tags.
     * </p>
     * <p>
     * If you specify tags for this parameter, those tags replace any list of
     * tags that are currently associated with this stack set. This means:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify
     * the stack's tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <i>any</i> tags using this parameter, you must specify
     * <i>all</i> the tags that you want associated with this stack set, even
     * tags you've specifed before (for example, when creating the stack set or
     * during a previous update of the stack set.). Any tags that you don't
     * include in the updated list of tags are removed from the stack set, and
     * therefore from the stacks and resources as well.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an empty value, AWS CloudFormation removes all currently
     * associated tags.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify new tags as part of an <code>UpdateStackSet</code> action,
     * AWS CloudFormation checks to see if you have the required IAM permission
     * to tag resources. If you omit tags that are currently associated with the
     * stack set from the list of tags you specify, AWS CloudFormation assumes
     * that you want to remove those tags from the stack set, and checks to see
     * if you have permission to untag resources. If you don't have the
     * necessary permission(s), the entire <code>UpdateStackSet</code> action
     * fails with an <code>access denied</code> error, and the stack set is not
     * updated.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     */
    private StackSetOperationPreferences operationPreferences;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role to use to update this
     * stack set.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized administrator roles
     * to control which users or groups can manage specific stack sets within
     * the same administrator account. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     * >Granting Permissions for Stack Set Operations</a> in the <i>AWS
     * CloudFormation User Guide</i>.
     * </p>
     * <p>
     * If you specified a customized administrator role when you created the
     * stack set, you must specify a customized administrator role, even if it
     * is the same customized administrator role used with this stack set
     * previously.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String administrationRoleARN;

    /**
     * <p>
     * The name of the IAM execution role to use to update the stack set. If you
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
     * If you specify a customized execution role, AWS CloudFormation uses that
     * role to update the stack. If you do not specify a customized execution
     * role, AWS CloudFormation performs the update using the role previously
     * associated with the stack set, so long as you have permissions to perform
     * operations on the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z_0-9+=,.@-]+<br/>
     */
    private String executionRoleName;

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The AWS Organizations accounts
     * in which to update associated stack instances.
     * </p>
     * <p>
     * To update all the stack instances associated with this stack set, do not
     * specify <code>DeploymentTargets</code> or <code>Regions</code>.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if
     * <code>TemplateBody</code> or <code>TemplateURL</code> is specified), or
     * the <code>Parameters</code>, AWS CloudFormation marks all stack instances
     * with a status of <code>OUTDATED</code> prior to updating the stack
     * instances in the specified accounts and Regions. If the stack set update
     * does not include changes to the template or parameters, AWS
     * CloudFormation updates the stack instances in the specified accounts and
     * Regions, while leaving all other stack instances with their existing
     * stack instance status.
     * </p>
     */
    private DeploymentTargets deploymentTargets;

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created. You cannot modify <code>PermissionModel</code> if there are
     * stack instances associated with your stack set.
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
     * [<code>Service-managed</code> permissions] Describes whether StackSets
     * automatically deploys to AWS Organizations accounts that are added to a
     * target organization or organizational unit (OU).
     * </p>
     * <p>
     * If you specify <code>AutoDeployment</code>, do not specify
     * <code>DeploymentTargets</code> or <code>Regions</code>.
     * </p>
     */
    private AutoDeployment autoDeployment;

    /**
     * <p>
     * The unique ID for this stack set operation.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that
     * AWS CloudFormation performs the stack set operation only once, even if
     * you retry the request multiple times. You might retry stack set operation
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, AWS CloudFormation generates one
     * automatically.
     * </p>
     * <p>
     * Repeating this stack set operation with a new operation ID retries all
     * stack instances whose status is <code>OUTDATED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     */
    private String operationId;

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The accounts in which to update
     * associated stack instances. If you specify accounts, you must also
     * specify the Regions in which to update stack set instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set,
     * do not specify the <code>Accounts</code> or <code>Regions</code>
     * properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the
     * <code>TemplateBody</code> or <code>TemplateURL</code> properties are
     * specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to
     * updating the stack instances in the specified accounts and Regions. If
     * the stack set update does not include changes to the template or
     * parameters, AWS CloudFormation updates the stack instances in the
     * specified accounts and Regions, while leaving all other stack instances
     * with their existing stack instance status.
     * </p>
     */
    private java.util.List<String> accounts;

    /**
     * <p>
     * The Regions in which to update associated stack instances. If you specify
     * Regions, you must also specify accounts in which to update stack set
     * instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set,
     * do not specify the <code>Accounts</code> or <code>Regions</code>
     * properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the
     * <code>TemplateBody</code> or <code>TemplateURL</code> properties are
     * specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to
     * updating the stack instances in the specified accounts and Regions. If
     * the stack set update does not include changes to the template or
     * parameters, AWS CloudFormation updates the stack instances in the
     * specified accounts and Regions, while leaving all other stack instances
     * with their existing stack instance status.
     * </p>
     */
    private java.util.List<String> regions;

    /**
     * <p>
     * The name or unique ID of the stack set that you want to update.
     * </p>
     *
     * @return <p>
     *         The name or unique ID of the stack set that you want to update.
     *         </p>
     */
    public String getStackSetName() {
        return stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you want to update.
     * </p>
     *
     * @param stackSetName <p>
     *            The name or unique ID of the stack set that you want to
     *            update.
     *            </p>
     */
    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetName <p>
     *            The name or unique ID of the stack set that you want to
     *            update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
        return this;
    }

    /**
     * <p>
     * A brief description of updates that you are making.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A brief description of updates that you are making.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A brief description of updates that you are making.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A brief description of updates that you are making.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of updates that you are making.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A brief description of updates that you are making.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withDescription(String description) {
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
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code> or <code>TemplateURL</code>—or set
     * <code>UsePreviousTemplate</code> to true.
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
     *         Conditional: You must specify only one of the following
     *         parameters: <code>TemplateBody</code> or <code>TemplateURL</code>
     *         —or set <code>UsePreviousTemplate</code> to true.
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
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code> or <code>TemplateURL</code>—or set
     * <code>UsePreviousTemplate</code> to true.
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
     *            Conditional: You must specify only one of the following
     *            parameters: <code>TemplateBody</code> or
     *            <code>TemplateURL</code>—or set
     *            <code>UsePreviousTemplate</code> to true.
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
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code> or <code>TemplateURL</code>—or set
     * <code>UsePreviousTemplate</code> to true.
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
     *            Conditional: You must specify only one of the following
     *            parameters: <code>TemplateBody</code> or
     *            <code>TemplateURL</code>—or set
     *            <code>UsePreviousTemplate</code> to true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * <p>
     * The location of the file that contains the template body. The URL must
     * point to a template (maximum size: 460,800 bytes) that is located in an
     * Amazon S3 bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code> or <code>TemplateURL</code>—or set
     * <code>UsePreviousTemplate</code> to true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The location of the file that contains the template body. The URL
     *         must point to a template (maximum size: 460,800 bytes) that is
     *         located in an Amazon S3 bucket. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *         >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *         </p>
     *         <p>
     *         Conditional: You must specify only one of the following
     *         parameters: <code>TemplateBody</code> or <code>TemplateURL</code>
     *         —or set <code>UsePreviousTemplate</code> to true.
     *         </p>
     */
    public String getTemplateURL() {
        return templateURL;
    }

    /**
     * <p>
     * The location of the file that contains the template body. The URL must
     * point to a template (maximum size: 460,800 bytes) that is located in an
     * Amazon S3 bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code> or <code>TemplateURL</code>—or set
     * <code>UsePreviousTemplate</code> to true.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL <p>
     *            The location of the file that contains the template body. The
     *            URL must point to a template (maximum size: 460,800 bytes)
     *            that is located in an Amazon S3 bucket. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *            </p>
     *            <p>
     *            Conditional: You must specify only one of the following
     *            parameters: <code>TemplateBody</code> or
     *            <code>TemplateURL</code>—or set
     *            <code>UsePreviousTemplate</code> to true.
     *            </p>
     */
    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }

    /**
     * <p>
     * The location of the file that contains the template body. The URL must
     * point to a template (maximum size: 460,800 bytes) that is located in an
     * Amazon S3 bucket. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code> or <code>TemplateURL</code>—or set
     * <code>UsePreviousTemplate</code> to true.
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
     *            that is located in an Amazon S3 bucket. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *            </p>
     *            <p>
     *            Conditional: You must specify only one of the following
     *            parameters: <code>TemplateBody</code> or
     *            <code>TemplateURL</code>—or set
     *            <code>UsePreviousTemplate</code> to true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }

    /**
     * <p>
     * Use the existing template that's associated with the stack set that
     * you're updating.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code> or <code>TemplateURL</code>—or set
     * <code>UsePreviousTemplate</code> to true.
     * </p>
     *
     * @return <p>
     *         Use the existing template that's associated with the stack set
     *         that you're updating.
     *         </p>
     *         <p>
     *         Conditional: You must specify only one of the following
     *         parameters: <code>TemplateBody</code> or <code>TemplateURL</code>
     *         —or set <code>UsePreviousTemplate</code> to true.
     *         </p>
     */
    public Boolean isUsePreviousTemplate() {
        return usePreviousTemplate;
    }

    /**
     * <p>
     * Use the existing template that's associated with the stack set that
     * you're updating.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code> or <code>TemplateURL</code>—or set
     * <code>UsePreviousTemplate</code> to true.
     * </p>
     *
     * @return <p>
     *         Use the existing template that's associated with the stack set
     *         that you're updating.
     *         </p>
     *         <p>
     *         Conditional: You must specify only one of the following
     *         parameters: <code>TemplateBody</code> or <code>TemplateURL</code>
     *         —or set <code>UsePreviousTemplate</code> to true.
     *         </p>
     */
    public Boolean getUsePreviousTemplate() {
        return usePreviousTemplate;
    }

    /**
     * <p>
     * Use the existing template that's associated with the stack set that
     * you're updating.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code> or <code>TemplateURL</code>—or set
     * <code>UsePreviousTemplate</code> to true.
     * </p>
     *
     * @param usePreviousTemplate <p>
     *            Use the existing template that's associated with the stack set
     *            that you're updating.
     *            </p>
     *            <p>
     *            Conditional: You must specify only one of the following
     *            parameters: <code>TemplateBody</code> or
     *            <code>TemplateURL</code>—or set
     *            <code>UsePreviousTemplate</code> to true.
     *            </p>
     */
    public void setUsePreviousTemplate(Boolean usePreviousTemplate) {
        this.usePreviousTemplate = usePreviousTemplate;
    }

    /**
     * <p>
     * Use the existing template that's associated with the stack set that
     * you're updating.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code> or <code>TemplateURL</code>—or set
     * <code>UsePreviousTemplate</code> to true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usePreviousTemplate <p>
     *            Use the existing template that's associated with the stack set
     *            that you're updating.
     *            </p>
     *            <p>
     *            Conditional: You must specify only one of the following
     *            parameters: <code>TemplateBody</code> or
     *            <code>TemplateURL</code>—or set
     *            <code>UsePreviousTemplate</code> to true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withUsePreviousTemplate(Boolean usePreviousTemplate) {
        this.usePreviousTemplate = usePreviousTemplate;
        return this;
    }

    /**
     * <p>
     * A list of input parameters for the stack set template.
     * </p>
     *
     * @return <p>
     *         A list of input parameters for the stack set template.
     *         </p>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A list of input parameters for the stack set template.
     * </p>
     *
     * @param parameters <p>
     *            A list of input parameters for the stack set template.
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
     * A list of input parameters for the stack set template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of input parameters for the stack set template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withParameters(Parameter... parameters) {
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
     * A list of input parameters for the stack set template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of input parameters for the stack set template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template
     * contains certain capabilities in order for AWS CloudFormation to update
     * the stack set and its associated stack instances.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions
     * in your AWS account; for example, by creating new AWS Identity and Access
     * Management (IAM) users. For those stacks sets, you must explicitly
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
     * more macros, and you choose to update a stack directly from the processed
     * template, without first reviewing the resulting changes in a change set,
     * you must acknowledge this capability. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     * >Using AWS CloudFormation Macros to Perform Custom Processing on
     * Templates</a>.
     * </p>
     * <important>
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
     * </important></li>
     * </ul>
     *
     * @return <p>
     *         In some cases, you must explicitly acknowledge that your stack
     *         template contains certain capabilities in order for AWS
     *         CloudFormation to update the stack set and its associated stack
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
     *         Identity and Access Management (IAM) users. For those stacks
     *         sets, you must explicitly acknowledge this by specifying one of
     *         these capabilities.
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
     *         one or more macros, and you choose to update a stack directly
     *         from the processed template, without first reviewing the
     *         resulting changes in a change set, you must acknowledge this
     *         capability. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     *         >Using AWS CloudFormation Macros to Perform Custom Processing on
     *         Templates</a>.
     *         </p>
     *         <important>
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
     *         </important></li>
     *         </ul>
     */
    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template
     * contains certain capabilities in order for AWS CloudFormation to update
     * the stack set and its associated stack instances.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions
     * in your AWS account; for example, by creating new AWS Identity and Access
     * Management (IAM) users. For those stacks sets, you must explicitly
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
     * more macros, and you choose to update a stack directly from the processed
     * template, without first reviewing the resulting changes in a change set,
     * you must acknowledge this capability. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     * >Using AWS CloudFormation Macros to Perform Custom Processing on
     * Templates</a>.
     * </p>
     * <important>
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
     * </important></li>
     * </ul>
     *
     * @param capabilities <p>
     *            In some cases, you must explicitly acknowledge that your stack
     *            template contains certain capabilities in order for AWS
     *            CloudFormation to update the stack set and its associated
     *            stack instances.
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
     *            stacks sets, you must explicitly acknowledge this by
     *            specifying one of these capabilities.
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
     *            one or more macros, and you choose to update a stack directly
     *            from the processed template, without first reviewing the
     *            resulting changes in a change set, you must acknowledge this
     *            capability. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     *            >Using AWS CloudFormation Macros to Perform Custom Processing
     *            on Templates</a>.
     *            </p>
     *            <important>
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
     *            </important></li>
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
     * In some cases, you must explicitly acknowledge that your stack template
     * contains certain capabilities in order for AWS CloudFormation to update
     * the stack set and its associated stack instances.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions
     * in your AWS account; for example, by creating new AWS Identity and Access
     * Management (IAM) users. For those stacks sets, you must explicitly
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
     * more macros, and you choose to update a stack directly from the processed
     * template, without first reviewing the resulting changes in a change set,
     * you must acknowledge this capability. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     * >Using AWS CloudFormation Macros to Perform Custom Processing on
     * Templates</a>.
     * </p>
     * <important>
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
     * </important></li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            In some cases, you must explicitly acknowledge that your stack
     *            template contains certain capabilities in order for AWS
     *            CloudFormation to update the stack set and its associated
     *            stack instances.
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
     *            stacks sets, you must explicitly acknowledge this by
     *            specifying one of these capabilities.
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
     *            one or more macros, and you choose to update a stack directly
     *            from the processed template, without first reviewing the
     *            resulting changes in a change set, you must acknowledge this
     *            capability. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     *            >Using AWS CloudFormation Macros to Perform Custom Processing
     *            on Templates</a>.
     *            </p>
     *            <important>
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
     *            </important></li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withCapabilities(String... capabilities) {
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
     * In some cases, you must explicitly acknowledge that your stack template
     * contains certain capabilities in order for AWS CloudFormation to update
     * the stack set and its associated stack instances.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions
     * in your AWS account; for example, by creating new AWS Identity and Access
     * Management (IAM) users. For those stacks sets, you must explicitly
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
     * more macros, and you choose to update a stack directly from the processed
     * template, without first reviewing the resulting changes in a change set,
     * you must acknowledge this capability. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     * >Using AWS CloudFormation Macros to Perform Custom Processing on
     * Templates</a>.
     * </p>
     * <important>
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
     * </important></li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            In some cases, you must explicitly acknowledge that your stack
     *            template contains certain capabilities in order for AWS
     *            CloudFormation to update the stack set and its associated
     *            stack instances.
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
     *            stacks sets, you must explicitly acknowledge this by
     *            specifying one of these capabilities.
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
     *            one or more macros, and you choose to update a stack directly
     *            from the processed template, without first reviewing the
     *            resulting changes in a change set, you must acknowledge this
     *            capability. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     *            >Using AWS CloudFormation Macros to Perform Custom Processing
     *            on Templates</a>.
     *            </p>
     *            <important>
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
     *            </important></li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The key-value pairs to associate with this stack set and the stacks
     * created from it. AWS CloudFormation also propagates these tags to
     * supported resources that are created in the stacks. You can specify a
     * maximum number of 50 tags.
     * </p>
     * <p>
     * If you specify tags for this parameter, those tags replace any list of
     * tags that are currently associated with this stack set. This means:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify
     * the stack's tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <i>any</i> tags using this parameter, you must specify
     * <i>all</i> the tags that you want associated with this stack set, even
     * tags you've specifed before (for example, when creating the stack set or
     * during a previous update of the stack set.). Any tags that you don't
     * include in the updated list of tags are removed from the stack set, and
     * therefore from the stacks and resources as well.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an empty value, AWS CloudFormation removes all currently
     * associated tags.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify new tags as part of an <code>UpdateStackSet</code> action,
     * AWS CloudFormation checks to see if you have the required IAM permission
     * to tag resources. If you omit tags that are currently associated with the
     * stack set from the list of tags you specify, AWS CloudFormation assumes
     * that you want to remove those tags from the stack set, and checks to see
     * if you have permission to untag resources. If you don't have the
     * necessary permission(s), the entire <code>UpdateStackSet</code> action
     * fails with an <code>access denied</code> error, and the stack set is not
     * updated.
     * </p>
     *
     * @return <p>
     *         The key-value pairs to associate with this stack set and the
     *         stacks created from it. AWS CloudFormation also propagates these
     *         tags to supported resources that are created in the stacks. You
     *         can specify a maximum number of 50 tags.
     *         </p>
     *         <p>
     *         If you specify tags for this parameter, those tags replace any
     *         list of tags that are currently associated with this stack set.
     *         This means:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you don't specify this parameter, AWS CloudFormation doesn't
     *         modify the stack's tags.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify <i>any</i> tags using this parameter, you must
     *         specify <i>all</i> the tags that you want associated with this
     *         stack set, even tags you've specifed before (for example, when
     *         creating the stack set or during a previous update of the stack
     *         set.). Any tags that you don't include in the updated list of
     *         tags are removed from the stack set, and therefore from the
     *         stacks and resources as well.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify an empty value, AWS CloudFormation removes all
     *         currently associated tags.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify new tags as part of an <code>UpdateStackSet</code>
     *         action, AWS CloudFormation checks to see if you have the required
     *         IAM permission to tag resources. If you omit tags that are
     *         currently associated with the stack set from the list of tags you
     *         specify, AWS CloudFormation assumes that you want to remove those
     *         tags from the stack set, and checks to see if you have permission
     *         to untag resources. If you don't have the necessary
     *         permission(s), the entire <code>UpdateStackSet</code> action
     *         fails with an <code>access denied</code> error, and the stack set
     *         is not updated.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value pairs to associate with this stack set and the stacks
     * created from it. AWS CloudFormation also propagates these tags to
     * supported resources that are created in the stacks. You can specify a
     * maximum number of 50 tags.
     * </p>
     * <p>
     * If you specify tags for this parameter, those tags replace any list of
     * tags that are currently associated with this stack set. This means:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify
     * the stack's tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <i>any</i> tags using this parameter, you must specify
     * <i>all</i> the tags that you want associated with this stack set, even
     * tags you've specifed before (for example, when creating the stack set or
     * during a previous update of the stack set.). Any tags that you don't
     * include in the updated list of tags are removed from the stack set, and
     * therefore from the stacks and resources as well.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an empty value, AWS CloudFormation removes all currently
     * associated tags.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify new tags as part of an <code>UpdateStackSet</code> action,
     * AWS CloudFormation checks to see if you have the required IAM permission
     * to tag resources. If you omit tags that are currently associated with the
     * stack set from the list of tags you specify, AWS CloudFormation assumes
     * that you want to remove those tags from the stack set, and checks to see
     * if you have permission to untag resources. If you don't have the
     * necessary permission(s), the entire <code>UpdateStackSet</code> action
     * fails with an <code>access denied</code> error, and the stack set is not
     * updated.
     * </p>
     *
     * @param tags <p>
     *            The key-value pairs to associate with this stack set and the
     *            stacks created from it. AWS CloudFormation also propagates
     *            these tags to supported resources that are created in the
     *            stacks. You can specify a maximum number of 50 tags.
     *            </p>
     *            <p>
     *            If you specify tags for this parameter, those tags replace any
     *            list of tags that are currently associated with this stack
     *            set. This means:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you don't specify this parameter, AWS CloudFormation
     *            doesn't modify the stack's tags.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify <i>any</i> tags using this parameter, you must
     *            specify <i>all</i> the tags that you want associated with this
     *            stack set, even tags you've specifed before (for example, when
     *            creating the stack set or during a previous update of the
     *            stack set.). Any tags that you don't include in the updated
     *            list of tags are removed from the stack set, and therefore
     *            from the stacks and resources as well.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify an empty value, AWS CloudFormation removes all
     *            currently associated tags.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you specify new tags as part of an
     *            <code>UpdateStackSet</code> action, AWS CloudFormation checks
     *            to see if you have the required IAM permission to tag
     *            resources. If you omit tags that are currently associated with
     *            the stack set from the list of tags you specify, AWS
     *            CloudFormation assumes that you want to remove those tags from
     *            the stack set, and checks to see if you have permission to
     *            untag resources. If you don't have the necessary
     *            permission(s), the entire <code>UpdateStackSet</code> action
     *            fails with an <code>access denied</code> error, and the stack
     *            set is not updated.
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
     * supported resources that are created in the stacks. You can specify a
     * maximum number of 50 tags.
     * </p>
     * <p>
     * If you specify tags for this parameter, those tags replace any list of
     * tags that are currently associated with this stack set. This means:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify
     * the stack's tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <i>any</i> tags using this parameter, you must specify
     * <i>all</i> the tags that you want associated with this stack set, even
     * tags you've specifed before (for example, when creating the stack set or
     * during a previous update of the stack set.). Any tags that you don't
     * include in the updated list of tags are removed from the stack set, and
     * therefore from the stacks and resources as well.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an empty value, AWS CloudFormation removes all currently
     * associated tags.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify new tags as part of an <code>UpdateStackSet</code> action,
     * AWS CloudFormation checks to see if you have the required IAM permission
     * to tag resources. If you omit tags that are currently associated with the
     * stack set from the list of tags you specify, AWS CloudFormation assumes
     * that you want to remove those tags from the stack set, and checks to see
     * if you have permission to untag resources. If you don't have the
     * necessary permission(s), the entire <code>UpdateStackSet</code> action
     * fails with an <code>access denied</code> error, and the stack set is not
     * updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The key-value pairs to associate with this stack set and the
     *            stacks created from it. AWS CloudFormation also propagates
     *            these tags to supported resources that are created in the
     *            stacks. You can specify a maximum number of 50 tags.
     *            </p>
     *            <p>
     *            If you specify tags for this parameter, those tags replace any
     *            list of tags that are currently associated with this stack
     *            set. This means:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you don't specify this parameter, AWS CloudFormation
     *            doesn't modify the stack's tags.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify <i>any</i> tags using this parameter, you must
     *            specify <i>all</i> the tags that you want associated with this
     *            stack set, even tags you've specifed before (for example, when
     *            creating the stack set or during a previous update of the
     *            stack set.). Any tags that you don't include in the updated
     *            list of tags are removed from the stack set, and therefore
     *            from the stacks and resources as well.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify an empty value, AWS CloudFormation removes all
     *            currently associated tags.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you specify new tags as part of an
     *            <code>UpdateStackSet</code> action, AWS CloudFormation checks
     *            to see if you have the required IAM permission to tag
     *            resources. If you omit tags that are currently associated with
     *            the stack set from the list of tags you specify, AWS
     *            CloudFormation assumes that you want to remove those tags from
     *            the stack set, and checks to see if you have permission to
     *            untag resources. If you don't have the necessary
     *            permission(s), the entire <code>UpdateStackSet</code> action
     *            fails with an <code>access denied</code> error, and the stack
     *            set is not updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withTags(Tag... tags) {
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
     * supported resources that are created in the stacks. You can specify a
     * maximum number of 50 tags.
     * </p>
     * <p>
     * If you specify tags for this parameter, those tags replace any list of
     * tags that are currently associated with this stack set. This means:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify
     * the stack's tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <i>any</i> tags using this parameter, you must specify
     * <i>all</i> the tags that you want associated with this stack set, even
     * tags you've specifed before (for example, when creating the stack set or
     * during a previous update of the stack set.). Any tags that you don't
     * include in the updated list of tags are removed from the stack set, and
     * therefore from the stacks and resources as well.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an empty value, AWS CloudFormation removes all currently
     * associated tags.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify new tags as part of an <code>UpdateStackSet</code> action,
     * AWS CloudFormation checks to see if you have the required IAM permission
     * to tag resources. If you omit tags that are currently associated with the
     * stack set from the list of tags you specify, AWS CloudFormation assumes
     * that you want to remove those tags from the stack set, and checks to see
     * if you have permission to untag resources. If you don't have the
     * necessary permission(s), the entire <code>UpdateStackSet</code> action
     * fails with an <code>access denied</code> error, and the stack set is not
     * updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The key-value pairs to associate with this stack set and the
     *            stacks created from it. AWS CloudFormation also propagates
     *            these tags to supported resources that are created in the
     *            stacks. You can specify a maximum number of 50 tags.
     *            </p>
     *            <p>
     *            If you specify tags for this parameter, those tags replace any
     *            list of tags that are currently associated with this stack
     *            set. This means:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If you don't specify this parameter, AWS CloudFormation
     *            doesn't modify the stack's tags.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify <i>any</i> tags using this parameter, you must
     *            specify <i>all</i> the tags that you want associated with this
     *            stack set, even tags you've specifed before (for example, when
     *            creating the stack set or during a previous update of the
     *            stack set.). Any tags that you don't include in the updated
     *            list of tags are removed from the stack set, and therefore
     *            from the stacks and resources as well.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you specify an empty value, AWS CloudFormation removes all
     *            currently associated tags.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you specify new tags as part of an
     *            <code>UpdateStackSet</code> action, AWS CloudFormation checks
     *            to see if you have the required IAM permission to tag
     *            resources. If you omit tags that are currently associated with
     *            the stack set from the list of tags you specify, AWS
     *            CloudFormation assumes that you want to remove those tags from
     *            the stack set, and checks to see if you have permission to
     *            untag resources. If you don't have the necessary
     *            permission(s), the entire <code>UpdateStackSet</code> action
     *            fails with an <code>access denied</code> error, and the stack
     *            set is not updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     *
     * @return <p>
     *         Preferences for how AWS CloudFormation performs this stack set
     *         operation.
     *         </p>
     */
    public StackSetOperationPreferences getOperationPreferences() {
        return operationPreferences;
    }

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     *
     * @param operationPreferences <p>
     *            Preferences for how AWS CloudFormation performs this stack set
     *            operation.
     *            </p>
     */
    public void setOperationPreferences(StackSetOperationPreferences operationPreferences) {
        this.operationPreferences = operationPreferences;
    }

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationPreferences <p>
     *            Preferences for how AWS CloudFormation performs this stack set
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withOperationPreferences(
            StackSetOperationPreferences operationPreferences) {
        this.operationPreferences = operationPreferences;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role to use to update this
     * stack set.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized administrator roles
     * to control which users or groups can manage specific stack sets within
     * the same administrator account. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     * >Granting Permissions for Stack Set Operations</a> in the <i>AWS
     * CloudFormation User Guide</i>.
     * </p>
     * <p>
     * If you specified a customized administrator role when you created the
     * stack set, you must specify a customized administrator role, even if it
     * is the same customized administrator role used with this stack set
     * previously.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of the IAM role to use to update
     *         this stack set.
     *         </p>
     *         <p>
     *         Specify an IAM role only if you are using customized
     *         administrator roles to control which users or groups can manage
     *         specific stack sets within the same administrator account. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     *         >Granting Permissions for Stack Set Operations</a> in the <i>AWS
     *         CloudFormation User Guide</i>.
     *         </p>
     *         <p>
     *         If you specified a customized administrator role when you created
     *         the stack set, you must specify a customized administrator role,
     *         even if it is the same customized administrator role used with
     *         this stack set previously.
     *         </p>
     */
    public String getAdministrationRoleARN() {
        return administrationRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role to use to update this
     * stack set.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized administrator roles
     * to control which users or groups can manage specific stack sets within
     * the same administrator account. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     * >Granting Permissions for Stack Set Operations</a> in the <i>AWS
     * CloudFormation User Guide</i>.
     * </p>
     * <p>
     * If you specified a customized administrator role when you created the
     * stack set, you must specify a customized administrator role, even if it
     * is the same customized administrator role used with this stack set
     * previously.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param administrationRoleARN <p>
     *            The Amazon Resource Number (ARN) of the IAM role to use to
     *            update this stack set.
     *            </p>
     *            <p>
     *            Specify an IAM role only if you are using customized
     *            administrator roles to control which users or groups can
     *            manage specific stack sets within the same administrator
     *            account. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     *            >Granting Permissions for Stack Set Operations</a> in the
     *            <i>AWS CloudFormation User Guide</i>.
     *            </p>
     *            <p>
     *            If you specified a customized administrator role when you
     *            created the stack set, you must specify a customized
     *            administrator role, even if it is the same customized
     *            administrator role used with this stack set previously.
     *            </p>
     */
    public void setAdministrationRoleARN(String administrationRoleARN) {
        this.administrationRoleARN = administrationRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role to use to update this
     * stack set.
     * </p>
     * <p>
     * Specify an IAM role only if you are using customized administrator roles
     * to control which users or groups can manage specific stack sets within
     * the same administrator account. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     * >Granting Permissions for Stack Set Operations</a> in the <i>AWS
     * CloudFormation User Guide</i>.
     * </p>
     * <p>
     * If you specified a customized administrator role when you created the
     * stack set, you must specify a customized administrator role, even if it
     * is the same customized administrator role used with this stack set
     * previously.
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
     *            update this stack set.
     *            </p>
     *            <p>
     *            Specify an IAM role only if you are using customized
     *            administrator roles to control which users or groups can
     *            manage specific stack sets within the same administrator
     *            account. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     *            >Granting Permissions for Stack Set Operations</a> in the
     *            <i>AWS CloudFormation User Guide</i>.
     *            </p>
     *            <p>
     *            If you specified a customized administrator role when you
     *            created the stack set, you must specify a customized
     *            administrator role, even if it is the same customized
     *            administrator role used with this stack set previously.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withAdministrationRoleARN(String administrationRoleARN) {
        this.administrationRoleARN = administrationRoleARN;
        return this;
    }

    /**
     * <p>
     * The name of the IAM execution role to use to update the stack set. If you
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
     * If you specify a customized execution role, AWS CloudFormation uses that
     * role to update the stack. If you do not specify a customized execution
     * role, AWS CloudFormation performs the update using the role previously
     * associated with the stack set, so long as you have permissions to perform
     * operations on the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z_0-9+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the IAM execution role to use to update the stack
     *         set. If you do not specify an execution role, AWS CloudFormation
     *         uses the <code>AWSCloudFormationStackSetExecutionRole</code> role
     *         for the stack set operation.
     *         </p>
     *         <p>
     *         Specify an IAM role only if you are using customized execution
     *         roles to control which stack resources users and groups can
     *         include in their stack sets.
     *         </p>
     *         <p>
     *         If you specify a customized execution role, AWS CloudFormation
     *         uses that role to update the stack. If you do not specify a
     *         customized execution role, AWS CloudFormation performs the update
     *         using the role previously associated with the stack set, so long
     *         as you have permissions to perform operations on the stack set.
     *         </p>
     */
    public String getExecutionRoleName() {
        return executionRoleName;
    }

    /**
     * <p>
     * The name of the IAM execution role to use to update the stack set. If you
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
     * If you specify a customized execution role, AWS CloudFormation uses that
     * role to update the stack. If you do not specify a customized execution
     * role, AWS CloudFormation performs the update using the role previously
     * associated with the stack set, so long as you have permissions to perform
     * operations on the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z_0-9+=,.@-]+<br/>
     *
     * @param executionRoleName <p>
     *            The name of the IAM execution role to use to update the stack
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
     *            <p>
     *            If you specify a customized execution role, AWS CloudFormation
     *            uses that role to update the stack. If you do not specify a
     *            customized execution role, AWS CloudFormation performs the
     *            update using the role previously associated with the stack
     *            set, so long as you have permissions to perform operations on
     *            the stack set.
     *            </p>
     */
    public void setExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
    }

    /**
     * <p>
     * The name of the IAM execution role to use to update the stack set. If you
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
     * If you specify a customized execution role, AWS CloudFormation uses that
     * role to update the stack. If you do not specify a customized execution
     * role, AWS CloudFormation performs the update using the role previously
     * associated with the stack set, so long as you have permissions to perform
     * operations on the stack set.
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
     *            The name of the IAM execution role to use to update the stack
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
     *            <p>
     *            If you specify a customized execution role, AWS CloudFormation
     *            uses that role to update the stack. If you do not specify a
     *            customized execution role, AWS CloudFormation performs the
     *            update using the role previously associated with the stack
     *            set, so long as you have permissions to perform operations on
     *            the stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
        return this;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The AWS Organizations accounts
     * in which to update associated stack instances.
     * </p>
     * <p>
     * To update all the stack instances associated with this stack set, do not
     * specify <code>DeploymentTargets</code> or <code>Regions</code>.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if
     * <code>TemplateBody</code> or <code>TemplateURL</code> is specified), or
     * the <code>Parameters</code>, AWS CloudFormation marks all stack instances
     * with a status of <code>OUTDATED</code> prior to updating the stack
     * instances in the specified accounts and Regions. If the stack set update
     * does not include changes to the template or parameters, AWS
     * CloudFormation updates the stack instances in the specified accounts and
     * Regions, while leaving all other stack instances with their existing
     * stack instance status.
     * </p>
     *
     * @return <p>
     *         [<code>Service-managed</code> permissions] The AWS Organizations
     *         accounts in which to update associated stack instances.
     *         </p>
     *         <p>
     *         To update all the stack instances associated with this stack set,
     *         do not specify <code>DeploymentTargets</code> or
     *         <code>Regions</code>.
     *         </p>
     *         <p>
     *         If the stack set update includes changes to the template (that
     *         is, if <code>TemplateBody</code> or <code>TemplateURL</code> is
     *         specified), or the <code>Parameters</code>, AWS CloudFormation
     *         marks all stack instances with a status of <code>OUTDATED</code>
     *         prior to updating the stack instances in the specified accounts
     *         and Regions. If the stack set update does not include changes to
     *         the template or parameters, AWS CloudFormation updates the stack
     *         instances in the specified accounts and Regions, while leaving
     *         all other stack instances with their existing stack instance
     *         status.
     *         </p>
     */
    public DeploymentTargets getDeploymentTargets() {
        return deploymentTargets;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The AWS Organizations accounts
     * in which to update associated stack instances.
     * </p>
     * <p>
     * To update all the stack instances associated with this stack set, do not
     * specify <code>DeploymentTargets</code> or <code>Regions</code>.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if
     * <code>TemplateBody</code> or <code>TemplateURL</code> is specified), or
     * the <code>Parameters</code>, AWS CloudFormation marks all stack instances
     * with a status of <code>OUTDATED</code> prior to updating the stack
     * instances in the specified accounts and Regions. If the stack set update
     * does not include changes to the template or parameters, AWS
     * CloudFormation updates the stack instances in the specified accounts and
     * Regions, while leaving all other stack instances with their existing
     * stack instance status.
     * </p>
     *
     * @param deploymentTargets <p>
     *            [<code>Service-managed</code> permissions] The AWS
     *            Organizations accounts in which to update associated stack
     *            instances.
     *            </p>
     *            <p>
     *            To update all the stack instances associated with this stack
     *            set, do not specify <code>DeploymentTargets</code> or
     *            <code>Regions</code>.
     *            </p>
     *            <p>
     *            If the stack set update includes changes to the template (that
     *            is, if <code>TemplateBody</code> or <code>TemplateURL</code>
     *            is specified), or the <code>Parameters</code>, AWS
     *            CloudFormation marks all stack instances with a status of
     *            <code>OUTDATED</code> prior to updating the stack instances in
     *            the specified accounts and Regions. If the stack set update
     *            does not include changes to the template or parameters, AWS
     *            CloudFormation updates the stack instances in the specified
     *            accounts and Regions, while leaving all other stack instances
     *            with their existing stack instance status.
     *            </p>
     */
    public void setDeploymentTargets(DeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The AWS Organizations accounts
     * in which to update associated stack instances.
     * </p>
     * <p>
     * To update all the stack instances associated with this stack set, do not
     * specify <code>DeploymentTargets</code> or <code>Regions</code>.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if
     * <code>TemplateBody</code> or <code>TemplateURL</code> is specified), or
     * the <code>Parameters</code>, AWS CloudFormation marks all stack instances
     * with a status of <code>OUTDATED</code> prior to updating the stack
     * instances in the specified accounts and Regions. If the stack set update
     * does not include changes to the template or parameters, AWS
     * CloudFormation updates the stack instances in the specified accounts and
     * Regions, while leaving all other stack instances with their existing
     * stack instance status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentTargets <p>
     *            [<code>Service-managed</code> permissions] The AWS
     *            Organizations accounts in which to update associated stack
     *            instances.
     *            </p>
     *            <p>
     *            To update all the stack instances associated with this stack
     *            set, do not specify <code>DeploymentTargets</code> or
     *            <code>Regions</code>.
     *            </p>
     *            <p>
     *            If the stack set update includes changes to the template (that
     *            is, if <code>TemplateBody</code> or <code>TemplateURL</code>
     *            is specified), or the <code>Parameters</code>, AWS
     *            CloudFormation marks all stack instances with a status of
     *            <code>OUTDATED</code> prior to updating the stack instances in
     *            the specified accounts and Regions. If the stack set update
     *            does not include changes to the template or parameters, AWS
     *            CloudFormation updates the stack instances in the specified
     *            accounts and Regions, while leaving all other stack instances
     *            with their existing stack instance status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withDeploymentTargets(DeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
        return this;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created. You cannot modify <code>PermissionModel</code> if there are
     * stack instances associated with your stack set.
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
     *         created. You cannot modify <code>PermissionModel</code> if there
     *         are stack instances associated with your stack set.
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
     * created. You cannot modify <code>PermissionModel</code> if there are
     * stack instances associated with your stack set.
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
     *            are created. You cannot modify <code>PermissionModel</code> if
     *            there are stack instances associated with your stack set.
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
     * created. You cannot modify <code>PermissionModel</code> if there are
     * stack instances associated with your stack set.
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
     *            are created. You cannot modify <code>PermissionModel</code> if
     *            there are stack instances associated with your stack set.
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
    public UpdateStackSetRequest withPermissionModel(String permissionModel) {
        this.permissionModel = permissionModel;
        return this;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created. You cannot modify <code>PermissionModel</code> if there are
     * stack instances associated with your stack set.
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
     *            are created. You cannot modify <code>PermissionModel</code> if
     *            there are stack instances associated with your stack set.
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
     * created. You cannot modify <code>PermissionModel</code> if there are
     * stack instances associated with your stack set.
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
     *            are created. You cannot modify <code>PermissionModel</code> if
     *            there are stack instances associated with your stack set.
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
    public UpdateStackSetRequest withPermissionModel(PermissionModels permissionModel) {
        this.permissionModel = permissionModel.toString();
        return this;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] Describes whether StackSets
     * automatically deploys to AWS Organizations accounts that are added to a
     * target organization or organizational unit (OU).
     * </p>
     * <p>
     * If you specify <code>AutoDeployment</code>, do not specify
     * <code>DeploymentTargets</code> or <code>Regions</code>.
     * </p>
     *
     * @return <p>
     *         [<code>Service-managed</code> permissions] Describes whether
     *         StackSets automatically deploys to AWS Organizations accounts
     *         that are added to a target organization or organizational unit
     *         (OU).
     *         </p>
     *         <p>
     *         If you specify <code>AutoDeployment</code>, do not specify
     *         <code>DeploymentTargets</code> or <code>Regions</code>.
     *         </p>
     */
    public AutoDeployment getAutoDeployment() {
        return autoDeployment;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] Describes whether StackSets
     * automatically deploys to AWS Organizations accounts that are added to a
     * target organization or organizational unit (OU).
     * </p>
     * <p>
     * If you specify <code>AutoDeployment</code>, do not specify
     * <code>DeploymentTargets</code> or <code>Regions</code>.
     * </p>
     *
     * @param autoDeployment <p>
     *            [<code>Service-managed</code> permissions] Describes whether
     *            StackSets automatically deploys to AWS Organizations accounts
     *            that are added to a target organization or organizational unit
     *            (OU).
     *            </p>
     *            <p>
     *            If you specify <code>AutoDeployment</code>, do not specify
     *            <code>DeploymentTargets</code> or <code>Regions</code>.
     *            </p>
     */
    public void setAutoDeployment(AutoDeployment autoDeployment) {
        this.autoDeployment = autoDeployment;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] Describes whether StackSets
     * automatically deploys to AWS Organizations accounts that are added to a
     * target organization or organizational unit (OU).
     * </p>
     * <p>
     * If you specify <code>AutoDeployment</code>, do not specify
     * <code>DeploymentTargets</code> or <code>Regions</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoDeployment <p>
     *            [<code>Service-managed</code> permissions] Describes whether
     *            StackSets automatically deploys to AWS Organizations accounts
     *            that are added to a target organization or organizational unit
     *            (OU).
     *            </p>
     *            <p>
     *            If you specify <code>AutoDeployment</code>, do not specify
     *            <code>DeploymentTargets</code> or <code>Regions</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withAutoDeployment(AutoDeployment autoDeployment) {
        this.autoDeployment = autoDeployment;
        return this;
    }

    /**
     * <p>
     * The unique ID for this stack set operation.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that
     * AWS CloudFormation performs the stack set operation only once, even if
     * you retry the request multiple times. You might retry stack set operation
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, AWS CloudFormation generates one
     * automatically.
     * </p>
     * <p>
     * Repeating this stack set operation with a new operation ID retries all
     * stack instances whose status is <code>OUTDATED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The unique ID for this stack set operation.
     *         </p>
     *         <p>
     *         The operation ID also functions as an idempotency token, to
     *         ensure that AWS CloudFormation performs the stack set operation
     *         only once, even if you retry the request multiple times. You
     *         might retry stack set operation requests to ensure that AWS
     *         CloudFormation successfully received them.
     *         </p>
     *         <p>
     *         If you don't specify an operation ID, AWS CloudFormation
     *         generates one automatically.
     *         </p>
     *         <p>
     *         Repeating this stack set operation with a new operation ID
     *         retries all stack instances whose status is <code>OUTDATED</code>
     *         .
     *         </p>
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * <p>
     * The unique ID for this stack set operation.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that
     * AWS CloudFormation performs the stack set operation only once, even if
     * you retry the request multiple times. You might retry stack set operation
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, AWS CloudFormation generates one
     * automatically.
     * </p>
     * <p>
     * Repeating this stack set operation with a new operation ID retries all
     * stack instances whose status is <code>OUTDATED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param operationId <p>
     *            The unique ID for this stack set operation.
     *            </p>
     *            <p>
     *            The operation ID also functions as an idempotency token, to
     *            ensure that AWS CloudFormation performs the stack set
     *            operation only once, even if you retry the request multiple
     *            times. You might retry stack set operation requests to ensure
     *            that AWS CloudFormation successfully received them.
     *            </p>
     *            <p>
     *            If you don't specify an operation ID, AWS CloudFormation
     *            generates one automatically.
     *            </p>
     *            <p>
     *            Repeating this stack set operation with a new operation ID
     *            retries all stack instances whose status is
     *            <code>OUTDATED</code>.
     *            </p>
     */
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The unique ID for this stack set operation.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that
     * AWS CloudFormation performs the stack set operation only once, even if
     * you retry the request multiple times. You might retry stack set operation
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, AWS CloudFormation generates one
     * automatically.
     * </p>
     * <p>
     * Repeating this stack set operation with a new operation ID retries all
     * stack instances whose status is <code>OUTDATED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param operationId <p>
     *            The unique ID for this stack set operation.
     *            </p>
     *            <p>
     *            The operation ID also functions as an idempotency token, to
     *            ensure that AWS CloudFormation performs the stack set
     *            operation only once, even if you retry the request multiple
     *            times. You might retry stack set operation requests to ensure
     *            that AWS CloudFormation successfully received them.
     *            </p>
     *            <p>
     *            If you don't specify an operation ID, AWS CloudFormation
     *            generates one automatically.
     *            </p>
     *            <p>
     *            Repeating this stack set operation with a new operation ID
     *            retries all stack instances whose status is
     *            <code>OUTDATED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The accounts in which to update
     * associated stack instances. If you specify accounts, you must also
     * specify the Regions in which to update stack set instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set,
     * do not specify the <code>Accounts</code> or <code>Regions</code>
     * properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the
     * <code>TemplateBody</code> or <code>TemplateURL</code> properties are
     * specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to
     * updating the stack instances in the specified accounts and Regions. If
     * the stack set update does not include changes to the template or
     * parameters, AWS CloudFormation updates the stack instances in the
     * specified accounts and Regions, while leaving all other stack instances
     * with their existing stack instance status.
     * </p>
     *
     * @return <p>
     *         [<code>Self-managed</code> permissions] The accounts in which to
     *         update associated stack instances. If you specify accounts, you
     *         must also specify the Regions in which to update stack set
     *         instances.
     *         </p>
     *         <p>
     *         To update <i>all</i> the stack instances associated with this
     *         stack set, do not specify the <code>Accounts</code> or
     *         <code>Regions</code> properties.
     *         </p>
     *         <p>
     *         If the stack set update includes changes to the template (that
     *         is, if the <code>TemplateBody</code> or <code>TemplateURL</code>
     *         properties are specified), or the <code>Parameters</code>
     *         property, AWS CloudFormation marks all stack instances with a
     *         status of <code>OUTDATED</code> prior to updating the stack
     *         instances in the specified accounts and Regions. If the stack set
     *         update does not include changes to the template or parameters,
     *         AWS CloudFormation updates the stack instances in the specified
     *         accounts and Regions, while leaving all other stack instances
     *         with their existing stack instance status.
     *         </p>
     */
    public java.util.List<String> getAccounts() {
        return accounts;
    }

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The accounts in which to update
     * associated stack instances. If you specify accounts, you must also
     * specify the Regions in which to update stack set instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set,
     * do not specify the <code>Accounts</code> or <code>Regions</code>
     * properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the
     * <code>TemplateBody</code> or <code>TemplateURL</code> properties are
     * specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to
     * updating the stack instances in the specified accounts and Regions. If
     * the stack set update does not include changes to the template or
     * parameters, AWS CloudFormation updates the stack instances in the
     * specified accounts and Regions, while leaving all other stack instances
     * with their existing stack instance status.
     * </p>
     *
     * @param accounts <p>
     *            [<code>Self-managed</code> permissions] The accounts in which
     *            to update associated stack instances. If you specify accounts,
     *            you must also specify the Regions in which to update stack set
     *            instances.
     *            </p>
     *            <p>
     *            To update <i>all</i> the stack instances associated with this
     *            stack set, do not specify the <code>Accounts</code> or
     *            <code>Regions</code> properties.
     *            </p>
     *            <p>
     *            If the stack set update includes changes to the template (that
     *            is, if the <code>TemplateBody</code> or
     *            <code>TemplateURL</code> properties are specified), or the
     *            <code>Parameters</code> property, AWS CloudFormation marks all
     *            stack instances with a status of <code>OUTDATED</code> prior
     *            to updating the stack instances in the specified accounts and
     *            Regions. If the stack set update does not include changes to
     *            the template or parameters, AWS CloudFormation updates the
     *            stack instances in the specified accounts and Regions, while
     *            leaving all other stack instances with their existing stack
     *            instance status.
     *            </p>
     */
    public void setAccounts(java.util.Collection<String> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new java.util.ArrayList<String>(accounts);
    }

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The accounts in which to update
     * associated stack instances. If you specify accounts, you must also
     * specify the Regions in which to update stack set instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set,
     * do not specify the <code>Accounts</code> or <code>Regions</code>
     * properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the
     * <code>TemplateBody</code> or <code>TemplateURL</code> properties are
     * specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to
     * updating the stack instances in the specified accounts and Regions. If
     * the stack set update does not include changes to the template or
     * parameters, AWS CloudFormation updates the stack instances in the
     * specified accounts and Regions, while leaving all other stack instances
     * with their existing stack instance status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accounts <p>
     *            [<code>Self-managed</code> permissions] The accounts in which
     *            to update associated stack instances. If you specify accounts,
     *            you must also specify the Regions in which to update stack set
     *            instances.
     *            </p>
     *            <p>
     *            To update <i>all</i> the stack instances associated with this
     *            stack set, do not specify the <code>Accounts</code> or
     *            <code>Regions</code> properties.
     *            </p>
     *            <p>
     *            If the stack set update includes changes to the template (that
     *            is, if the <code>TemplateBody</code> or
     *            <code>TemplateURL</code> properties are specified), or the
     *            <code>Parameters</code> property, AWS CloudFormation marks all
     *            stack instances with a status of <code>OUTDATED</code> prior
     *            to updating the stack instances in the specified accounts and
     *            Regions. If the stack set update does not include changes to
     *            the template or parameters, AWS CloudFormation updates the
     *            stack instances in the specified accounts and Regions, while
     *            leaving all other stack instances with their existing stack
     *            instance status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withAccounts(String... accounts) {
        if (getAccounts() == null) {
            this.accounts = new java.util.ArrayList<String>(accounts.length);
        }
        for (String value : accounts) {
            this.accounts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The accounts in which to update
     * associated stack instances. If you specify accounts, you must also
     * specify the Regions in which to update stack set instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set,
     * do not specify the <code>Accounts</code> or <code>Regions</code>
     * properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the
     * <code>TemplateBody</code> or <code>TemplateURL</code> properties are
     * specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to
     * updating the stack instances in the specified accounts and Regions. If
     * the stack set update does not include changes to the template or
     * parameters, AWS CloudFormation updates the stack instances in the
     * specified accounts and Regions, while leaving all other stack instances
     * with their existing stack instance status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accounts <p>
     *            [<code>Self-managed</code> permissions] The accounts in which
     *            to update associated stack instances. If you specify accounts,
     *            you must also specify the Regions in which to update stack set
     *            instances.
     *            </p>
     *            <p>
     *            To update <i>all</i> the stack instances associated with this
     *            stack set, do not specify the <code>Accounts</code> or
     *            <code>Regions</code> properties.
     *            </p>
     *            <p>
     *            If the stack set update includes changes to the template (that
     *            is, if the <code>TemplateBody</code> or
     *            <code>TemplateURL</code> properties are specified), or the
     *            <code>Parameters</code> property, AWS CloudFormation marks all
     *            stack instances with a status of <code>OUTDATED</code> prior
     *            to updating the stack instances in the specified accounts and
     *            Regions. If the stack set update does not include changes to
     *            the template or parameters, AWS CloudFormation updates the
     *            stack instances in the specified accounts and Regions, while
     *            leaving all other stack instances with their existing stack
     *            instance status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * The Regions in which to update associated stack instances. If you specify
     * Regions, you must also specify accounts in which to update stack set
     * instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set,
     * do not specify the <code>Accounts</code> or <code>Regions</code>
     * properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the
     * <code>TemplateBody</code> or <code>TemplateURL</code> properties are
     * specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to
     * updating the stack instances in the specified accounts and Regions. If
     * the stack set update does not include changes to the template or
     * parameters, AWS CloudFormation updates the stack instances in the
     * specified accounts and Regions, while leaving all other stack instances
     * with their existing stack instance status.
     * </p>
     *
     * @return <p>
     *         The Regions in which to update associated stack instances. If you
     *         specify Regions, you must also specify accounts in which to
     *         update stack set instances.
     *         </p>
     *         <p>
     *         To update <i>all</i> the stack instances associated with this
     *         stack set, do not specify the <code>Accounts</code> or
     *         <code>Regions</code> properties.
     *         </p>
     *         <p>
     *         If the stack set update includes changes to the template (that
     *         is, if the <code>TemplateBody</code> or <code>TemplateURL</code>
     *         properties are specified), or the <code>Parameters</code>
     *         property, AWS CloudFormation marks all stack instances with a
     *         status of <code>OUTDATED</code> prior to updating the stack
     *         instances in the specified accounts and Regions. If the stack set
     *         update does not include changes to the template or parameters,
     *         AWS CloudFormation updates the stack instances in the specified
     *         accounts and Regions, while leaving all other stack instances
     *         with their existing stack instance status.
     *         </p>
     */
    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * The Regions in which to update associated stack instances. If you specify
     * Regions, you must also specify accounts in which to update stack set
     * instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set,
     * do not specify the <code>Accounts</code> or <code>Regions</code>
     * properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the
     * <code>TemplateBody</code> or <code>TemplateURL</code> properties are
     * specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to
     * updating the stack instances in the specified accounts and Regions. If
     * the stack set update does not include changes to the template or
     * parameters, AWS CloudFormation updates the stack instances in the
     * specified accounts and Regions, while leaving all other stack instances
     * with their existing stack instance status.
     * </p>
     *
     * @param regions <p>
     *            The Regions in which to update associated stack instances. If
     *            you specify Regions, you must also specify accounts in which
     *            to update stack set instances.
     *            </p>
     *            <p>
     *            To update <i>all</i> the stack instances associated with this
     *            stack set, do not specify the <code>Accounts</code> or
     *            <code>Regions</code> properties.
     *            </p>
     *            <p>
     *            If the stack set update includes changes to the template (that
     *            is, if the <code>TemplateBody</code> or
     *            <code>TemplateURL</code> properties are specified), or the
     *            <code>Parameters</code> property, AWS CloudFormation marks all
     *            stack instances with a status of <code>OUTDATED</code> prior
     *            to updating the stack instances in the specified accounts and
     *            Regions. If the stack set update does not include changes to
     *            the template or parameters, AWS CloudFormation updates the
     *            stack instances in the specified accounts and Regions, while
     *            leaving all other stack instances with their existing stack
     *            instance status.
     *            </p>
     */
    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<String>(regions);
    }

    /**
     * <p>
     * The Regions in which to update associated stack instances. If you specify
     * Regions, you must also specify accounts in which to update stack set
     * instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set,
     * do not specify the <code>Accounts</code> or <code>Regions</code>
     * properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the
     * <code>TemplateBody</code> or <code>TemplateURL</code> properties are
     * specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to
     * updating the stack instances in the specified accounts and Regions. If
     * the stack set update does not include changes to the template or
     * parameters, AWS CloudFormation updates the stack instances in the
     * specified accounts and Regions, while leaving all other stack instances
     * with their existing stack instance status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regions <p>
     *            The Regions in which to update associated stack instances. If
     *            you specify Regions, you must also specify accounts in which
     *            to update stack set instances.
     *            </p>
     *            <p>
     *            To update <i>all</i> the stack instances associated with this
     *            stack set, do not specify the <code>Accounts</code> or
     *            <code>Regions</code> properties.
     *            </p>
     *            <p>
     *            If the stack set update includes changes to the template (that
     *            is, if the <code>TemplateBody</code> or
     *            <code>TemplateURL</code> properties are specified), or the
     *            <code>Parameters</code> property, AWS CloudFormation marks all
     *            stack instances with a status of <code>OUTDATED</code> prior
     *            to updating the stack instances in the specified accounts and
     *            Regions. If the stack set update does not include changes to
     *            the template or parameters, AWS CloudFormation updates the
     *            stack instances in the specified accounts and Regions, while
     *            leaving all other stack instances with their existing stack
     *            instance status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withRegions(String... regions) {
        if (getRegions() == null) {
            this.regions = new java.util.ArrayList<String>(regions.length);
        }
        for (String value : regions) {
            this.regions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Regions in which to update associated stack instances. If you specify
     * Regions, you must also specify accounts in which to update stack set
     * instances.
     * </p>
     * <p>
     * To update <i>all</i> the stack instances associated with this stack set,
     * do not specify the <code>Accounts</code> or <code>Regions</code>
     * properties.
     * </p>
     * <p>
     * If the stack set update includes changes to the template (that is, if the
     * <code>TemplateBody</code> or <code>TemplateURL</code> properties are
     * specified), or the <code>Parameters</code> property, AWS CloudFormation
     * marks all stack instances with a status of <code>OUTDATED</code> prior to
     * updating the stack instances in the specified accounts and Regions. If
     * the stack set update does not include changes to the template or
     * parameters, AWS CloudFormation updates the stack instances in the
     * specified accounts and Regions, while leaving all other stack instances
     * with their existing stack instance status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regions <p>
     *            The Regions in which to update associated stack instances. If
     *            you specify Regions, you must also specify accounts in which
     *            to update stack set instances.
     *            </p>
     *            <p>
     *            To update <i>all</i> the stack instances associated with this
     *            stack set, do not specify the <code>Accounts</code> or
     *            <code>Regions</code> properties.
     *            </p>
     *            <p>
     *            If the stack set update includes changes to the template (that
     *            is, if the <code>TemplateBody</code> or
     *            <code>TemplateURL</code> properties are specified), or the
     *            <code>Parameters</code> property, AWS CloudFormation marks all
     *            stack instances with a status of <code>OUTDATED</code> prior
     *            to updating the stack instances in the specified accounts and
     *            Regions. If the stack set update does not include changes to
     *            the template or parameters, AWS CloudFormation updates the
     *            stack instances in the specified accounts and Regions, while
     *            leaving all other stack instances with their existing stack
     *            instance status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackSetRequest withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
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
        if (getUsePreviousTemplate() != null)
            sb.append("UsePreviousTemplate: " + getUsePreviousTemplate() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getCapabilities() != null)
            sb.append("Capabilities: " + getCapabilities() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getOperationPreferences() != null)
            sb.append("OperationPreferences: " + getOperationPreferences() + ",");
        if (getAdministrationRoleARN() != null)
            sb.append("AdministrationRoleARN: " + getAdministrationRoleARN() + ",");
        if (getExecutionRoleName() != null)
            sb.append("ExecutionRoleName: " + getExecutionRoleName() + ",");
        if (getDeploymentTargets() != null)
            sb.append("DeploymentTargets: " + getDeploymentTargets() + ",");
        if (getPermissionModel() != null)
            sb.append("PermissionModel: " + getPermissionModel() + ",");
        if (getAutoDeployment() != null)
            sb.append("AutoDeployment: " + getAutoDeployment() + ",");
        if (getOperationId() != null)
            sb.append("OperationId: " + getOperationId() + ",");
        if (getAccounts() != null)
            sb.append("Accounts: " + getAccounts() + ",");
        if (getRegions() != null)
            sb.append("Regions: " + getRegions());
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
        hashCode = prime * hashCode
                + ((getUsePreviousTemplate() == null) ? 0 : getUsePreviousTemplate().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getOperationPreferences() == null) ? 0 : getOperationPreferences().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdministrationRoleARN() == null) ? 0 : getAdministrationRoleARN().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionRoleName() == null) ? 0 : getExecutionRoleName().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentTargets() == null) ? 0 : getDeploymentTargets().hashCode());
        hashCode = prime * hashCode
                + ((getPermissionModel() == null) ? 0 : getPermissionModel().hashCode());
        hashCode = prime * hashCode
                + ((getAutoDeployment() == null) ? 0 : getAutoDeployment().hashCode());
        hashCode = prime * hashCode
                + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStackSetRequest == false)
            return false;
        UpdateStackSetRequest other = (UpdateStackSetRequest) obj;

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
        if (other.getUsePreviousTemplate() == null ^ this.getUsePreviousTemplate() == null)
            return false;
        if (other.getUsePreviousTemplate() != null
                && other.getUsePreviousTemplate().equals(this.getUsePreviousTemplate()) == false)
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
        if (other.getOperationPreferences() == null ^ this.getOperationPreferences() == null)
            return false;
        if (other.getOperationPreferences() != null
                && other.getOperationPreferences().equals(this.getOperationPreferences()) == false)
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
        if (other.getDeploymentTargets() == null ^ this.getDeploymentTargets() == null)
            return false;
        if (other.getDeploymentTargets() != null
                && other.getDeploymentTargets().equals(this.getDeploymentTargets()) == false)
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
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null
                && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        return true;
    }
}
