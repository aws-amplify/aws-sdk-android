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
 * Creates a list of changes that will be applied to a stack so that you can
 * review the changes before executing them. You can create a change set for a
 * stack that doesn't exist or an existing stack. If you create a change set for
 * a stack that doesn't exist, the change set shows all of the resources that
 * AWS CloudFormation will create. If you create a change set for an existing
 * stack, AWS CloudFormation compares the stack's information with the
 * information that you submit in the change set and lists the differences. Use
 * change sets to understand which resources AWS CloudFormation will create or
 * change, and how it will change resources in an existing stack, before you
 * create or update a stack.
 * </p>
 * <p>
 * To create a change set for a stack that doesn't exist, for the
 * <code>ChangeSetType</code> parameter, specify <code>CREATE</code>. To create
 * a change set for an existing stack, specify <code>UPDATE</code> for the
 * <code>ChangeSetType</code> parameter. To create a change set for an import
 * operation, specify <code>IMPORT</code> for the <code>ChangeSetType</code>
 * parameter. After the <code>CreateChangeSet</code> call successfully
 * completes, AWS CloudFormation starts creating the change set. To check the
 * status of the change set or to review it, use the <a>DescribeChangeSet</a>
 * action.
 * </p>
 * <p>
 * When you are satisfied with the changes the change set will make, execute the
 * change set by using the <a>ExecuteChangeSet</a> action. AWS CloudFormation
 * doesn't make changes until you execute the change set.
 * </p>
 */
public class CreateChangeSetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name or the unique ID of the stack for which you are creating a
     * change set. AWS CloudFormation generates the change set by comparing this
     * stack's information with the information that you submit, such as a
     * modified template or different parameter input values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     */
    private String stackName;

    /**
     * <p>
     * A structure that contains the body of the revised template, with a
     * minimum length of 1 byte and a maximum length of 51,200 bytes. AWS
     * CloudFormation generates the change set by comparing this template with
     * the template of the stack that you specified.
     * </p>
     * <p>
     * Conditional: You must specify only <code>TemplateBody</code> or
     * <code>TemplateURL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String templateBody;

    /**
     * <p>
     * The location of the file that contains the revised template. The URL must
     * point to a template (max size: 460,800 bytes) that is located in an S3
     * bucket. AWS CloudFormation generates the change set by comparing this
     * template with the stack that you specified.
     * </p>
     * <p>
     * Conditional: You must specify only <code>TemplateBody</code> or
     * <code>TemplateURL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String templateURL;

    /**
     * <p>
     * Whether to reuse the template that is associated with the stack to create
     * the change set.
     * </p>
     */
    private Boolean usePreviousTemplate;

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input parameters
     * for the change set. For more information, see the <a>Parameter</a> data
     * type.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template
     * contains certain capabilities in order for AWS CloudFormation to create
     * the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions
     * in your AWS account; for example, by creating new AWS Identity and Access
     * Management (IAM) users. For those stacks, you must explicitly acknowledge
     * this by specifying one of these capabilities.
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
     * Some template contain macros. Macros perform custom processing on
     * templates; this can include simple actions like find-and-replace
     * operations, all the way to extensive transformations of entire templates.
     * Because of this, users typically create a change set from the processed
     * template, so that they can review the changes resulting from the macros
     * before actually creating the stack. If your stack template contains one
     * or more macros, and you choose to create a stack directly from the
     * processed template, without first reviewing the resulting changes in a
     * change set, you must acknowledge this capability. This includes the <a
     * href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS
     * CloudFormation.
     * </p>
     * <note>
     * <p>
     * This capacity does not apply to creating change sets, and specifying it
     * when creating change sets has no effect.
     * </p>
     * <p>
     * Also, change sets do not currently support nested stacks. If you want to
     * create a stack from a stack template that contains macros <i>and</i>
     * nested stacks, you must create or update the stack directly from the
     * template using the <a>CreateStack</a> or <a>UpdateStack</a> action, and
     * specifying this capability.
     * </p>
     * </note>
     * <p>
     * For more information on macros, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     * >Using AWS CloudFormation Macros to Perform Custom Processing on
     * Templates</a>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> capabilities;

    /**
     * <p>
     * The template resource types that you have permissions to work with if you
     * execute this change set, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource type that you're
     * updating, the stack update fails. By default, AWS CloudFormation grants
     * permissions to all resource types. AWS Identity and Access Management
     * (IAM) uses this parameter for condition keys in IAM policies for AWS
     * CloudFormation. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     * >Controlling Access with AWS Identity and Access Management</a> in the
     * AWS CloudFormation User Guide.
     * </p>
     */
    private java.util.List<String> resourceTypes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that AWS CloudFormation assumes when executing the change set.
     * AWS CloudFormation uses the role's credentials to make calls on your
     * behalf. AWS CloudFormation uses this role for all future operations on
     * the stack. As long as users have permission to operate on the stack, AWS
     * CloudFormation uses this role even if the users don't have permission to
     * pass it. Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was
     * previously associated with the stack. If no role is available, AWS
     * CloudFormation uses a temporary session that is generated from your user
     * credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleARN;

    /**
     * <p>
     * The rollback triggers for AWS CloudFormation to monitor during stack
     * creation and updating operations, and for the specified monitoring period
     * afterwards.
     * </p>
     */
    private RollbackConfiguration rollbackConfiguration;

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Amazon Simple Notification Service
     * (Amazon SNS) topics that AWS CloudFormation associates with the stack. To
     * remove all associated notification topics, specify an empty list.
     * </p>
     */
    private java.util.List<String> notificationARNs;

    /**
     * <p>
     * Key-value pairs to associate with this stack. AWS CloudFormation also
     * propagates these tags to resources in the stack. You can specify a
     * maximum of 50 tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the change set. The name must be unique among all change sets
     * that are associated with the specified stack.
     * </p>
     * <p>
     * A change set name can contain only alphanumeric, case sensitive
     * characters and hyphens. It must start with an alphabetic character and
     * cannot exceed 128 characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*<br/>
     */
    private String changeSetName;

    /**
     * <p>
     * A unique identifier for this <code>CreateChangeSet</code> request.
     * Specify this token if you plan to retry requests so that AWS
     * CloudFormation knows that you're not attempting to create another change
     * set with the same name. You might retry <code>CreateChangeSet</code>
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String clientToken;

    /**
     * <p>
     * A description to help you identify this change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The type of change set operation. To create a change set for a new stack,
     * specify <code>CREATE</code>. To create a change set for an existing
     * stack, specify <code>UPDATE</code>. To create a change set for an import
     * operation, specify <code>IMPORT</code>.
     * </p>
     * <p>
     * If you create a change set for a new stack, AWS Cloudformation creates a
     * stack with a unique stack ID, but no template or resources. The stack
     * will be in the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995"
     * > <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change
     * set.
     * </p>
     * <p>
     * By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't
     * use the <code>UPDATE</code> type to create a change set for a new stack
     * or the <code>CREATE</code> type to create a change set for an existing
     * stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, IMPORT
     */
    private String changeSetType;

    /**
     * <p>
     * The resources to import into your stack.
     * </p>
     */
    private java.util.List<ResourceToImport> resourcesToImport;

    /**
     * <p>
     * The name or the unique ID of the stack for which you are creating a
     * change set. AWS CloudFormation generates the change set by comparing this
     * stack's information with the information that you submit, such as a
     * modified template or different parameter input values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @return <p>
     *         The name or the unique ID of the stack for which you are creating
     *         a change set. AWS CloudFormation generates the change set by
     *         comparing this stack's information with the information that you
     *         submit, such as a modified template or different parameter input
     *         values.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The name or the unique ID of the stack for which you are creating a
     * change set. AWS CloudFormation generates the change set by comparing this
     * stack's information with the information that you submit, such as a
     * modified template or different parameter input values.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName <p>
     *            The name or the unique ID of the stack for which you are
     *            creating a change set. AWS CloudFormation generates the change
     *            set by comparing this stack's information with the information
     *            that you submit, such as a modified template or different
     *            parameter input values.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or the unique ID of the stack for which you are creating a
     * change set. AWS CloudFormation generates the change set by comparing this
     * stack's information with the information that you submit, such as a
     * modified template or different parameter input values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName <p>
     *            The name or the unique ID of the stack for which you are
     *            creating a change set. AWS CloudFormation generates the change
     *            set by comparing this stack's information with the information
     *            that you submit, such as a modified template or different
     *            parameter input values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * A structure that contains the body of the revised template, with a
     * minimum length of 1 byte and a maximum length of 51,200 bytes. AWS
     * CloudFormation generates the change set by comparing this template with
     * the template of the stack that you specified.
     * </p>
     * <p>
     * Conditional: You must specify only <code>TemplateBody</code> or
     * <code>TemplateURL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         A structure that contains the body of the revised template, with
     *         a minimum length of 1 byte and a maximum length of 51,200 bytes.
     *         AWS CloudFormation generates the change set by comparing this
     *         template with the template of the stack that you specified.
     *         </p>
     *         <p>
     *         Conditional: You must specify only <code>TemplateBody</code> or
     *         <code>TemplateURL</code>.
     *         </p>
     */
    public String getTemplateBody() {
        return templateBody;
    }

    /**
     * <p>
     * A structure that contains the body of the revised template, with a
     * minimum length of 1 byte and a maximum length of 51,200 bytes. AWS
     * CloudFormation generates the change set by comparing this template with
     * the template of the stack that you specified.
     * </p>
     * <p>
     * Conditional: You must specify only <code>TemplateBody</code> or
     * <code>TemplateURL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody <p>
     *            A structure that contains the body of the revised template,
     *            with a minimum length of 1 byte and a maximum length of 51,200
     *            bytes. AWS CloudFormation generates the change set by
     *            comparing this template with the template of the stack that
     *            you specified.
     *            </p>
     *            <p>
     *            Conditional: You must specify only <code>TemplateBody</code>
     *            or <code>TemplateURL</code>.
     *            </p>
     */
    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * A structure that contains the body of the revised template, with a
     * minimum length of 1 byte and a maximum length of 51,200 bytes. AWS
     * CloudFormation generates the change set by comparing this template with
     * the template of the stack that you specified.
     * </p>
     * <p>
     * Conditional: You must specify only <code>TemplateBody</code> or
     * <code>TemplateURL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody <p>
     *            A structure that contains the body of the revised template,
     *            with a minimum length of 1 byte and a maximum length of 51,200
     *            bytes. AWS CloudFormation generates the change set by
     *            comparing this template with the template of the stack that
     *            you specified.
     *            </p>
     *            <p>
     *            Conditional: You must specify only <code>TemplateBody</code>
     *            or <code>TemplateURL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * <p>
     * The location of the file that contains the revised template. The URL must
     * point to a template (max size: 460,800 bytes) that is located in an S3
     * bucket. AWS CloudFormation generates the change set by comparing this
     * template with the stack that you specified.
     * </p>
     * <p>
     * Conditional: You must specify only <code>TemplateBody</code> or
     * <code>TemplateURL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The location of the file that contains the revised template. The
     *         URL must point to a template (max size: 460,800 bytes) that is
     *         located in an S3 bucket. AWS CloudFormation generates the change
     *         set by comparing this template with the stack that you specified.
     *         </p>
     *         <p>
     *         Conditional: You must specify only <code>TemplateBody</code> or
     *         <code>TemplateURL</code>.
     *         </p>
     */
    public String getTemplateURL() {
        return templateURL;
    }

    /**
     * <p>
     * The location of the file that contains the revised template. The URL must
     * point to a template (max size: 460,800 bytes) that is located in an S3
     * bucket. AWS CloudFormation generates the change set by comparing this
     * template with the stack that you specified.
     * </p>
     * <p>
     * Conditional: You must specify only <code>TemplateBody</code> or
     * <code>TemplateURL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL <p>
     *            The location of the file that contains the revised template.
     *            The URL must point to a template (max size: 460,800 bytes)
     *            that is located in an S3 bucket. AWS CloudFormation generates
     *            the change set by comparing this template with the stack that
     *            you specified.
     *            </p>
     *            <p>
     *            Conditional: You must specify only <code>TemplateBody</code>
     *            or <code>TemplateURL</code>.
     *            </p>
     */
    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }

    /**
     * <p>
     * The location of the file that contains the revised template. The URL must
     * point to a template (max size: 460,800 bytes) that is located in an S3
     * bucket. AWS CloudFormation generates the change set by comparing this
     * template with the stack that you specified.
     * </p>
     * <p>
     * Conditional: You must specify only <code>TemplateBody</code> or
     * <code>TemplateURL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL <p>
     *            The location of the file that contains the revised template.
     *            The URL must point to a template (max size: 460,800 bytes)
     *            that is located in an S3 bucket. AWS CloudFormation generates
     *            the change set by comparing this template with the stack that
     *            you specified.
     *            </p>
     *            <p>
     *            Conditional: You must specify only <code>TemplateBody</code>
     *            or <code>TemplateURL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }

    /**
     * <p>
     * Whether to reuse the template that is associated with the stack to create
     * the change set.
     * </p>
     *
     * @return <p>
     *         Whether to reuse the template that is associated with the stack
     *         to create the change set.
     *         </p>
     */
    public Boolean isUsePreviousTemplate() {
        return usePreviousTemplate;
    }

    /**
     * <p>
     * Whether to reuse the template that is associated with the stack to create
     * the change set.
     * </p>
     *
     * @return <p>
     *         Whether to reuse the template that is associated with the stack
     *         to create the change set.
     *         </p>
     */
    public Boolean getUsePreviousTemplate() {
        return usePreviousTemplate;
    }

    /**
     * <p>
     * Whether to reuse the template that is associated with the stack to create
     * the change set.
     * </p>
     *
     * @param usePreviousTemplate <p>
     *            Whether to reuse the template that is associated with the
     *            stack to create the change set.
     *            </p>
     */
    public void setUsePreviousTemplate(Boolean usePreviousTemplate) {
        this.usePreviousTemplate = usePreviousTemplate;
    }

    /**
     * <p>
     * Whether to reuse the template that is associated with the stack to create
     * the change set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usePreviousTemplate <p>
     *            Whether to reuse the template that is associated with the
     *            stack to create the change set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withUsePreviousTemplate(Boolean usePreviousTemplate) {
        this.usePreviousTemplate = usePreviousTemplate;
        return this;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input parameters
     * for the change set. For more information, see the <a>Parameter</a> data
     * type.
     * </p>
     *
     * @return <p>
     *         A list of <code>Parameter</code> structures that specify input
     *         parameters for the change set. For more information, see the
     *         <a>Parameter</a> data type.
     *         </p>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input parameters
     * for the change set. For more information, see the <a>Parameter</a> data
     * type.
     * </p>
     *
     * @param parameters <p>
     *            A list of <code>Parameter</code> structures that specify input
     *            parameters for the change set. For more information, see the
     *            <a>Parameter</a> data type.
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
     * A list of <code>Parameter</code> structures that specify input parameters
     * for the change set. For more information, see the <a>Parameter</a> data
     * type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of <code>Parameter</code> structures that specify input
     *            parameters for the change set. For more information, see the
     *            <a>Parameter</a> data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withParameters(Parameter... parameters) {
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
     * A list of <code>Parameter</code> structures that specify input parameters
     * for the change set. For more information, see the <a>Parameter</a> data
     * type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of <code>Parameter</code> structures that specify input
     *            parameters for the change set. For more information, see the
     *            <a>Parameter</a> data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template
     * contains certain capabilities in order for AWS CloudFormation to create
     * the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions
     * in your AWS account; for example, by creating new AWS Identity and Access
     * Management (IAM) users. For those stacks, you must explicitly acknowledge
     * this by specifying one of these capabilities.
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
     * Some template contain macros. Macros perform custom processing on
     * templates; this can include simple actions like find-and-replace
     * operations, all the way to extensive transformations of entire templates.
     * Because of this, users typically create a change set from the processed
     * template, so that they can review the changes resulting from the macros
     * before actually creating the stack. If your stack template contains one
     * or more macros, and you choose to create a stack directly from the
     * processed template, without first reviewing the resulting changes in a
     * change set, you must acknowledge this capability. This includes the <a
     * href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS
     * CloudFormation.
     * </p>
     * <note>
     * <p>
     * This capacity does not apply to creating change sets, and specifying it
     * when creating change sets has no effect.
     * </p>
     * <p>
     * Also, change sets do not currently support nested stacks. If you want to
     * create a stack from a stack template that contains macros <i>and</i>
     * nested stacks, you must create or update the stack directly from the
     * template using the <a>CreateStack</a> or <a>UpdateStack</a> action, and
     * specifying this capability.
     * </p>
     * </note>
     * <p>
     * For more information on macros, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     * >Using AWS CloudFormation Macros to Perform Custom Processing on
     * Templates</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         In some cases, you must explicitly acknowledge that your stack
     *         template contains certain capabilities in order for AWS
     *         CloudFormation to create the stack.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *         </p>
     *         <p>
     *         Some stack templates might include resources that can affect
     *         permissions in your AWS account; for example, by creating new AWS
     *         Identity and Access Management (IAM) users. For those stacks, you
     *         must explicitly acknowledge this by specifying one of these
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
     *         Some template contain macros. Macros perform custom processing on
     *         templates; this can include simple actions like find-and-replace
     *         operations, all the way to extensive transformations of entire
     *         templates. Because of this, users typically create a change set
     *         from the processed template, so that they can review the changes
     *         resulting from the macros before actually creating the stack. If
     *         your stack template contains one or more macros, and you choose
     *         to create a stack directly from the processed template, without
     *         first reviewing the resulting changes in a change set, you must
     *         acknowledge this capability. This includes the <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *         >AWS::Include</a> and <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *         >AWS::Serverless</a> transforms, which are macros hosted by AWS
     *         CloudFormation.
     *         </p>
     *         <note>
     *         <p>
     *         This capacity does not apply to creating change sets, and
     *         specifying it when creating change sets has no effect.
     *         </p>
     *         <p>
     *         Also, change sets do not currently support nested stacks. If you
     *         want to create a stack from a stack template that contains macros
     *         <i>and</i> nested stacks, you must create or update the stack
     *         directly from the template using the <a>CreateStack</a> or
     *         <a>UpdateStack</a> action, and specifying this capability.
     *         </p>
     *         </note>
     *         <p>
     *         For more information on macros, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     *         >Using AWS CloudFormation Macros to Perform Custom Processing on
     *         Templates</a>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template
     * contains certain capabilities in order for AWS CloudFormation to create
     * the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions
     * in your AWS account; for example, by creating new AWS Identity and Access
     * Management (IAM) users. For those stacks, you must explicitly acknowledge
     * this by specifying one of these capabilities.
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
     * Some template contain macros. Macros perform custom processing on
     * templates; this can include simple actions like find-and-replace
     * operations, all the way to extensive transformations of entire templates.
     * Because of this, users typically create a change set from the processed
     * template, so that they can review the changes resulting from the macros
     * before actually creating the stack. If your stack template contains one
     * or more macros, and you choose to create a stack directly from the
     * processed template, without first reviewing the resulting changes in a
     * change set, you must acknowledge this capability. This includes the <a
     * href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS
     * CloudFormation.
     * </p>
     * <note>
     * <p>
     * This capacity does not apply to creating change sets, and specifying it
     * when creating change sets has no effect.
     * </p>
     * <p>
     * Also, change sets do not currently support nested stacks. If you want to
     * create a stack from a stack template that contains macros <i>and</i>
     * nested stacks, you must create or update the stack directly from the
     * template using the <a>CreateStack</a> or <a>UpdateStack</a> action, and
     * specifying this capability.
     * </p>
     * </note>
     * <p>
     * For more information on macros, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     * >Using AWS CloudFormation Macros to Perform Custom Processing on
     * Templates</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @param capabilities <p>
     *            In some cases, you must explicitly acknowledge that your stack
     *            template contains certain capabilities in order for AWS
     *            CloudFormation to create the stack.
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
     *            stacks, you must explicitly acknowledge this by specifying one
     *            of these capabilities.
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
     *            Some template contain macros. Macros perform custom processing
     *            on templates; this can include simple actions like
     *            find-and-replace operations, all the way to extensive
     *            transformations of entire templates. Because of this, users
     *            typically create a change set from the processed template, so
     *            that they can review the changes resulting from the macros
     *            before actually creating the stack. If your stack template
     *            contains one or more macros, and you choose to create a stack
     *            directly from the processed template, without first reviewing
     *            the resulting changes in a change set, you must acknowledge
     *            this capability. This includes the <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *            >AWS::Include</a> and <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *            >AWS::Serverless</a> transforms, which are macros hosted by
     *            AWS CloudFormation.
     *            </p>
     *            <note>
     *            <p>
     *            This capacity does not apply to creating change sets, and
     *            specifying it when creating change sets has no effect.
     *            </p>
     *            <p>
     *            Also, change sets do not currently support nested stacks. If
     *            you want to create a stack from a stack template that contains
     *            macros <i>and</i> nested stacks, you must create or update the
     *            stack directly from the template using the <a>CreateStack</a>
     *            or <a>UpdateStack</a> action, and specifying this capability.
     *            </p>
     *            </note>
     *            <p>
     *            For more information on macros, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     *            >Using AWS CloudFormation Macros to Perform Custom Processing
     *            on Templates</a>.
     *            </p>
     *            </li>
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
     * contains certain capabilities in order for AWS CloudFormation to create
     * the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions
     * in your AWS account; for example, by creating new AWS Identity and Access
     * Management (IAM) users. For those stacks, you must explicitly acknowledge
     * this by specifying one of these capabilities.
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
     * Some template contain macros. Macros perform custom processing on
     * templates; this can include simple actions like find-and-replace
     * operations, all the way to extensive transformations of entire templates.
     * Because of this, users typically create a change set from the processed
     * template, so that they can review the changes resulting from the macros
     * before actually creating the stack. If your stack template contains one
     * or more macros, and you choose to create a stack directly from the
     * processed template, without first reviewing the resulting changes in a
     * change set, you must acknowledge this capability. This includes the <a
     * href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS
     * CloudFormation.
     * </p>
     * <note>
     * <p>
     * This capacity does not apply to creating change sets, and specifying it
     * when creating change sets has no effect.
     * </p>
     * <p>
     * Also, change sets do not currently support nested stacks. If you want to
     * create a stack from a stack template that contains macros <i>and</i>
     * nested stacks, you must create or update the stack directly from the
     * template using the <a>CreateStack</a> or <a>UpdateStack</a> action, and
     * specifying this capability.
     * </p>
     * </note>
     * <p>
     * For more information on macros, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     * >Using AWS CloudFormation Macros to Perform Custom Processing on
     * Templates</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            In some cases, you must explicitly acknowledge that your stack
     *            template contains certain capabilities in order for AWS
     *            CloudFormation to create the stack.
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
     *            stacks, you must explicitly acknowledge this by specifying one
     *            of these capabilities.
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
     *            Some template contain macros. Macros perform custom processing
     *            on templates; this can include simple actions like
     *            find-and-replace operations, all the way to extensive
     *            transformations of entire templates. Because of this, users
     *            typically create a change set from the processed template, so
     *            that they can review the changes resulting from the macros
     *            before actually creating the stack. If your stack template
     *            contains one or more macros, and you choose to create a stack
     *            directly from the processed template, without first reviewing
     *            the resulting changes in a change set, you must acknowledge
     *            this capability. This includes the <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *            >AWS::Include</a> and <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *            >AWS::Serverless</a> transforms, which are macros hosted by
     *            AWS CloudFormation.
     *            </p>
     *            <note>
     *            <p>
     *            This capacity does not apply to creating change sets, and
     *            specifying it when creating change sets has no effect.
     *            </p>
     *            <p>
     *            Also, change sets do not currently support nested stacks. If
     *            you want to create a stack from a stack template that contains
     *            macros <i>and</i> nested stacks, you must create or update the
     *            stack directly from the template using the <a>CreateStack</a>
     *            or <a>UpdateStack</a> action, and specifying this capability.
     *            </p>
     *            </note>
     *            <p>
     *            For more information on macros, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     *            >Using AWS CloudFormation Macros to Perform Custom Processing
     *            on Templates</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withCapabilities(String... capabilities) {
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
     * contains certain capabilities in order for AWS CloudFormation to create
     * the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions
     * in your AWS account; for example, by creating new AWS Identity and Access
     * Management (IAM) users. For those stacks, you must explicitly acknowledge
     * this by specifying one of these capabilities.
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
     * Some template contain macros. Macros perform custom processing on
     * templates; this can include simple actions like find-and-replace
     * operations, all the way to extensive transformations of entire templates.
     * Because of this, users typically create a change set from the processed
     * template, so that they can review the changes resulting from the macros
     * before actually creating the stack. If your stack template contains one
     * or more macros, and you choose to create a stack directly from the
     * processed template, without first reviewing the resulting changes in a
     * change set, you must acknowledge this capability. This includes the <a
     * href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS
     * CloudFormation.
     * </p>
     * <note>
     * <p>
     * This capacity does not apply to creating change sets, and specifying it
     * when creating change sets has no effect.
     * </p>
     * <p>
     * Also, change sets do not currently support nested stacks. If you want to
     * create a stack from a stack template that contains macros <i>and</i>
     * nested stacks, you must create or update the stack directly from the
     * template using the <a>CreateStack</a> or <a>UpdateStack</a> action, and
     * specifying this capability.
     * </p>
     * </note>
     * <p>
     * For more information on macros, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     * >Using AWS CloudFormation Macros to Perform Custom Processing on
     * Templates</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            In some cases, you must explicitly acknowledge that your stack
     *            template contains certain capabilities in order for AWS
     *            CloudFormation to create the stack.
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
     *            stacks, you must explicitly acknowledge this by specifying one
     *            of these capabilities.
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
     *            Some template contain macros. Macros perform custom processing
     *            on templates; this can include simple actions like
     *            find-and-replace operations, all the way to extensive
     *            transformations of entire templates. Because of this, users
     *            typically create a change set from the processed template, so
     *            that they can review the changes resulting from the macros
     *            before actually creating the stack. If your stack template
     *            contains one or more macros, and you choose to create a stack
     *            directly from the processed template, without first reviewing
     *            the resulting changes in a change set, you must acknowledge
     *            this capability. This includes the <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *            >AWS::Include</a> and <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *            >AWS::Serverless</a> transforms, which are macros hosted by
     *            AWS CloudFormation.
     *            </p>
     *            <note>
     *            <p>
     *            This capacity does not apply to creating change sets, and
     *            specifying it when creating change sets has no effect.
     *            </p>
     *            <p>
     *            Also, change sets do not currently support nested stacks. If
     *            you want to create a stack from a stack template that contains
     *            macros <i>and</i> nested stacks, you must create or update the
     *            stack directly from the template using the <a>CreateStack</a>
     *            or <a>UpdateStack</a> action, and specifying this capability.
     *            </p>
     *            </note>
     *            <p>
     *            For more information on macros, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     *            >Using AWS CloudFormation Macros to Perform Custom Processing
     *            on Templates</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The template resource types that you have permissions to work with if you
     * execute this change set, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource type that you're
     * updating, the stack update fails. By default, AWS CloudFormation grants
     * permissions to all resource types. AWS Identity and Access Management
     * (IAM) uses this parameter for condition keys in IAM policies for AWS
     * CloudFormation. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     * >Controlling Access with AWS Identity and Access Management</a> in the
     * AWS CloudFormation User Guide.
     * </p>
     *
     * @return <p>
     *         The template resource types that you have permissions to work
     *         with if you execute this change set, such as
     *         <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or
     *         <code>Custom::MyCustomInstance</code>.
     *         </p>
     *         <p>
     *         If the list of resource types doesn't include a resource type
     *         that you're updating, the stack update fails. By default, AWS
     *         CloudFormation grants permissions to all resource types. AWS
     *         Identity and Access Management (IAM) uses this parameter for
     *         condition keys in IAM policies for AWS CloudFormation. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     *         >Controlling Access with AWS Identity and Access Management</a>
     *         in the AWS CloudFormation User Guide.
     *         </p>
     */
    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * The template resource types that you have permissions to work with if you
     * execute this change set, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource type that you're
     * updating, the stack update fails. By default, AWS CloudFormation grants
     * permissions to all resource types. AWS Identity and Access Management
     * (IAM) uses this parameter for condition keys in IAM policies for AWS
     * CloudFormation. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     * >Controlling Access with AWS Identity and Access Management</a> in the
     * AWS CloudFormation User Guide.
     * </p>
     *
     * @param resourceTypes <p>
     *            The template resource types that you have permissions to work
     *            with if you execute this change set, such as
     *            <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or
     *            <code>Custom::MyCustomInstance</code>.
     *            </p>
     *            <p>
     *            If the list of resource types doesn't include a resource type
     *            that you're updating, the stack update fails. By default, AWS
     *            CloudFormation grants permissions to all resource types. AWS
     *            Identity and Access Management (IAM) uses this parameter for
     *            condition keys in IAM policies for AWS CloudFormation. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     *            >Controlling Access with AWS Identity and Access
     *            Management</a> in the AWS CloudFormation User Guide.
     *            </p>
     */
    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * The template resource types that you have permissions to work with if you
     * execute this change set, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource type that you're
     * updating, the stack update fails. By default, AWS CloudFormation grants
     * permissions to all resource types. AWS Identity and Access Management
     * (IAM) uses this parameter for condition keys in IAM policies for AWS
     * CloudFormation. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     * >Controlling Access with AWS Identity and Access Management</a> in the
     * AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypes <p>
     *            The template resource types that you have permissions to work
     *            with if you execute this change set, such as
     *            <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or
     *            <code>Custom::MyCustomInstance</code>.
     *            </p>
     *            <p>
     *            If the list of resource types doesn't include a resource type
     *            that you're updating, the stack update fails. By default, AWS
     *            CloudFormation grants permissions to all resource types. AWS
     *            Identity and Access Management (IAM) uses this parameter for
     *            condition keys in IAM policies for AWS CloudFormation. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     *            >Controlling Access with AWS Identity and Access
     *            Management</a> in the AWS CloudFormation User Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withResourceTypes(String... resourceTypes) {
        if (getResourceTypes() == null) {
            this.resourceTypes = new java.util.ArrayList<String>(resourceTypes.length);
        }
        for (String value : resourceTypes) {
            this.resourceTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The template resource types that you have permissions to work with if you
     * execute this change set, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource type that you're
     * updating, the stack update fails. By default, AWS CloudFormation grants
     * permissions to all resource types. AWS Identity and Access Management
     * (IAM) uses this parameter for condition keys in IAM policies for AWS
     * CloudFormation. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     * >Controlling Access with AWS Identity and Access Management</a> in the
     * AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypes <p>
     *            The template resource types that you have permissions to work
     *            with if you execute this change set, such as
     *            <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or
     *            <code>Custom::MyCustomInstance</code>.
     *            </p>
     *            <p>
     *            If the list of resource types doesn't include a resource type
     *            that you're updating, the stack update fails. By default, AWS
     *            CloudFormation grants permissions to all resource types. AWS
     *            Identity and Access Management (IAM) uses this parameter for
     *            condition keys in IAM policies for AWS CloudFormation. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     *            >Controlling Access with AWS Identity and Access
     *            Management</a> in the AWS CloudFormation User Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that AWS CloudFormation assumes when executing the change set.
     * AWS CloudFormation uses the role's credentials to make calls on your
     * behalf. AWS CloudFormation uses this role for all future operations on
     * the stack. As long as users have permission to operate on the stack, AWS
     * CloudFormation uses this role even if the users don't have permission to
     * pass it. Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was
     * previously associated with the stack. If no role is available, AWS
     * CloudFormation uses a temporary session that is generated from your user
     * credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an AWS Identity and Access
     *         Management (IAM) role that AWS CloudFormation assumes when
     *         executing the change set. AWS CloudFormation uses the role's
     *         credentials to make calls on your behalf. AWS CloudFormation uses
     *         this role for all future operations on the stack. As long as
     *         users have permission to operate on the stack, AWS CloudFormation
     *         uses this role even if the users don't have permission to pass
     *         it. Ensure that the role grants least privilege.
     *         </p>
     *         <p>
     *         If you don't specify a value, AWS CloudFormation uses the role
     *         that was previously associated with the stack. If no role is
     *         available, AWS CloudFormation uses a temporary session that is
     *         generated from your user credentials.
     *         </p>
     */
    public String getRoleARN() {
        return roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that AWS CloudFormation assumes when executing the change set.
     * AWS CloudFormation uses the role's credentials to make calls on your
     * behalf. AWS CloudFormation uses this role for all future operations on
     * the stack. As long as users have permission to operate on the stack, AWS
     * CloudFormation uses this role even if the users don't have permission to
     * pass it. Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was
     * previously associated with the stack. If no role is available, AWS
     * CloudFormation uses a temporary session that is generated from your user
     * credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleARN <p>
     *            The Amazon Resource Name (ARN) of an AWS Identity and Access
     *            Management (IAM) role that AWS CloudFormation assumes when
     *            executing the change set. AWS CloudFormation uses the role's
     *            credentials to make calls on your behalf. AWS CloudFormation
     *            uses this role for all future operations on the stack. As long
     *            as users have permission to operate on the stack, AWS
     *            CloudFormation uses this role even if the users don't have
     *            permission to pass it. Ensure that the role grants least
     *            privilege.
     *            </p>
     *            <p>
     *            If you don't specify a value, AWS CloudFormation uses the role
     *            that was previously associated with the stack. If no role is
     *            available, AWS CloudFormation uses a temporary session that is
     *            generated from your user credentials.
     *            </p>
     */
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that AWS CloudFormation assumes when executing the change set.
     * AWS CloudFormation uses the role's credentials to make calls on your
     * behalf. AWS CloudFormation uses this role for all future operations on
     * the stack. As long as users have permission to operate on the stack, AWS
     * CloudFormation uses this role even if the users don't have permission to
     * pass it. Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was
     * previously associated with the stack. If no role is available, AWS
     * CloudFormation uses a temporary session that is generated from your user
     * credentials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleARN <p>
     *            The Amazon Resource Name (ARN) of an AWS Identity and Access
     *            Management (IAM) role that AWS CloudFormation assumes when
     *            executing the change set. AWS CloudFormation uses the role's
     *            credentials to make calls on your behalf. AWS CloudFormation
     *            uses this role for all future operations on the stack. As long
     *            as users have permission to operate on the stack, AWS
     *            CloudFormation uses this role even if the users don't have
     *            permission to pass it. Ensure that the role grants least
     *            privilege.
     *            </p>
     *            <p>
     *            If you don't specify a value, AWS CloudFormation uses the role
     *            that was previously associated with the stack. If no role is
     *            available, AWS CloudFormation uses a temporary session that is
     *            generated from your user credentials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * <p>
     * The rollback triggers for AWS CloudFormation to monitor during stack
     * creation and updating operations, and for the specified monitoring period
     * afterwards.
     * </p>
     *
     * @return <p>
     *         The rollback triggers for AWS CloudFormation to monitor during
     *         stack creation and updating operations, and for the specified
     *         monitoring period afterwards.
     *         </p>
     */
    public RollbackConfiguration getRollbackConfiguration() {
        return rollbackConfiguration;
    }

    /**
     * <p>
     * The rollback triggers for AWS CloudFormation to monitor during stack
     * creation and updating operations, and for the specified monitoring period
     * afterwards.
     * </p>
     *
     * @param rollbackConfiguration <p>
     *            The rollback triggers for AWS CloudFormation to monitor during
     *            stack creation and updating operations, and for the specified
     *            monitoring period afterwards.
     *            </p>
     */
    public void setRollbackConfiguration(RollbackConfiguration rollbackConfiguration) {
        this.rollbackConfiguration = rollbackConfiguration;
    }

    /**
     * <p>
     * The rollback triggers for AWS CloudFormation to monitor during stack
     * creation and updating operations, and for the specified monitoring period
     * afterwards.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rollbackConfiguration <p>
     *            The rollback triggers for AWS CloudFormation to monitor during
     *            stack creation and updating operations, and for the specified
     *            monitoring period afterwards.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withRollbackConfiguration(
            RollbackConfiguration rollbackConfiguration) {
        this.rollbackConfiguration = rollbackConfiguration;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Amazon Simple Notification Service
     * (Amazon SNS) topics that AWS CloudFormation associates with the stack. To
     * remove all associated notification topics, specify an empty list.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARNs) of Amazon Simple Notification
     *         Service (Amazon SNS) topics that AWS CloudFormation associates
     *         with the stack. To remove all associated notification topics,
     *         specify an empty list.
     *         </p>
     */
    public java.util.List<String> getNotificationARNs() {
        return notificationARNs;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Amazon Simple Notification Service
     * (Amazon SNS) topics that AWS CloudFormation associates with the stack. To
     * remove all associated notification topics, specify an empty list.
     * </p>
     *
     * @param notificationARNs <p>
     *            The Amazon Resource Names (ARNs) of Amazon Simple Notification
     *            Service (Amazon SNS) topics that AWS CloudFormation associates
     *            with the stack. To remove all associated notification topics,
     *            specify an empty list.
     *            </p>
     */
    public void setNotificationARNs(java.util.Collection<String> notificationARNs) {
        if (notificationARNs == null) {
            this.notificationARNs = null;
            return;
        }

        this.notificationARNs = new java.util.ArrayList<String>(notificationARNs);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Amazon Simple Notification Service
     * (Amazon SNS) topics that AWS CloudFormation associates with the stack. To
     * remove all associated notification topics, specify an empty list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationARNs <p>
     *            The Amazon Resource Names (ARNs) of Amazon Simple Notification
     *            Service (Amazon SNS) topics that AWS CloudFormation associates
     *            with the stack. To remove all associated notification topics,
     *            specify an empty list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withNotificationARNs(String... notificationARNs) {
        if (getNotificationARNs() == null) {
            this.notificationARNs = new java.util.ArrayList<String>(notificationARNs.length);
        }
        for (String value : notificationARNs) {
            this.notificationARNs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Amazon Simple Notification Service
     * (Amazon SNS) topics that AWS CloudFormation associates with the stack. To
     * remove all associated notification topics, specify an empty list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationARNs <p>
     *            The Amazon Resource Names (ARNs) of Amazon Simple Notification
     *            Service (Amazon SNS) topics that AWS CloudFormation associates
     *            with the stack. To remove all associated notification topics,
     *            specify an empty list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withNotificationARNs(java.util.Collection<String> notificationARNs) {
        setNotificationARNs(notificationARNs);
        return this;
    }

    /**
     * <p>
     * Key-value pairs to associate with this stack. AWS CloudFormation also
     * propagates these tags to resources in the stack. You can specify a
     * maximum of 50 tags.
     * </p>
     *
     * @return <p>
     *         Key-value pairs to associate with this stack. AWS CloudFormation
     *         also propagates these tags to resources in the stack. You can
     *         specify a maximum of 50 tags.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs to associate with this stack. AWS CloudFormation also
     * propagates these tags to resources in the stack. You can specify a
     * maximum of 50 tags.
     * </p>
     *
     * @param tags <p>
     *            Key-value pairs to associate with this stack. AWS
     *            CloudFormation also propagates these tags to resources in the
     *            stack. You can specify a maximum of 50 tags.
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
     * Key-value pairs to associate with this stack. AWS CloudFormation also
     * propagates these tags to resources in the stack. You can specify a
     * maximum of 50 tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Key-value pairs to associate with this stack. AWS
     *            CloudFormation also propagates these tags to resources in the
     *            stack. You can specify a maximum of 50 tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withTags(Tag... tags) {
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
     * Key-value pairs to associate with this stack. AWS CloudFormation also
     * propagates these tags to resources in the stack. You can specify a
     * maximum of 50 tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Key-value pairs to associate with this stack. AWS
     *            CloudFormation also propagates these tags to resources in the
     *            stack. You can specify a maximum of 50 tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the change set. The name must be unique among all change sets
     * that are associated with the specified stack.
     * </p>
     * <p>
     * A change set name can contain only alphanumeric, case sensitive
     * characters and hyphens. It must start with an alphabetic character and
     * cannot exceed 128 characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The name of the change set. The name must be unique among all
     *         change sets that are associated with the specified stack.
     *         </p>
     *         <p>
     *         A change set name can contain only alphanumeric, case sensitive
     *         characters and hyphens. It must start with an alphabetic
     *         character and cannot exceed 128 characters.
     *         </p>
     */
    public String getChangeSetName() {
        return changeSetName;
    }

    /**
     * <p>
     * The name of the change set. The name must be unique among all change sets
     * that are associated with the specified stack.
     * </p>
     * <p>
     * A change set name can contain only alphanumeric, case sensitive
     * characters and hyphens. It must start with an alphabetic character and
     * cannot exceed 128 characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*<br/>
     *
     * @param changeSetName <p>
     *            The name of the change set. The name must be unique among all
     *            change sets that are associated with the specified stack.
     *            </p>
     *            <p>
     *            A change set name can contain only alphanumeric, case
     *            sensitive characters and hyphens. It must start with an
     *            alphabetic character and cannot exceed 128 characters.
     *            </p>
     */
    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * The name of the change set. The name must be unique among all change sets
     * that are associated with the specified stack.
     * </p>
     * <p>
     * A change set name can contain only alphanumeric, case sensitive
     * characters and hyphens. It must start with an alphabetic character and
     * cannot exceed 128 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*<br/>
     *
     * @param changeSetName <p>
     *            The name of the change set. The name must be unique among all
     *            change sets that are associated with the specified stack.
     *            </p>
     *            <p>
     *            A change set name can contain only alphanumeric, case
     *            sensitive characters and hyphens. It must start with an
     *            alphabetic character and cannot exceed 128 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }

    /**
     * <p>
     * A unique identifier for this <code>CreateChangeSet</code> request.
     * Specify this token if you plan to retry requests so that AWS
     * CloudFormation knows that you're not attempting to create another change
     * set with the same name. You might retry <code>CreateChangeSet</code>
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         A unique identifier for this <code>CreateChangeSet</code>
     *         request. Specify this token if you plan to retry requests so that
     *         AWS CloudFormation knows that you're not attempting to create
     *         another change set with the same name. You might retry
     *         <code>CreateChangeSet</code> requests to ensure that AWS
     *         CloudFormation successfully received them.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>CreateChangeSet</code> request.
     * Specify this token if you plan to retry requests so that AWS
     * CloudFormation knows that you're not attempting to create another change
     * set with the same name. You might retry <code>CreateChangeSet</code>
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param clientToken <p>
     *            A unique identifier for this <code>CreateChangeSet</code>
     *            request. Specify this token if you plan to retry requests so
     *            that AWS CloudFormation knows that you're not attempting to
     *            create another change set with the same name. You might retry
     *            <code>CreateChangeSet</code> requests to ensure that AWS
     *            CloudFormation successfully received them.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>CreateChangeSet</code> request.
     * Specify this token if you plan to retry requests so that AWS
     * CloudFormation knows that you're not attempting to create another change
     * set with the same name. You might retry <code>CreateChangeSet</code>
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param clientToken <p>
     *            A unique identifier for this <code>CreateChangeSet</code>
     *            request. Specify this token if you plan to retry requests so
     *            that AWS CloudFormation knows that you're not attempting to
     *            create another change set with the same name. You might retry
     *            <code>CreateChangeSet</code> requests to ensure that AWS
     *            CloudFormation successfully received them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * A description to help you identify this change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A description to help you identify this change set.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description to help you identify this change set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A description to help you identify this change set.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description to help you identify this change set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A description to help you identify this change set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The type of change set operation. To create a change set for a new stack,
     * specify <code>CREATE</code>. To create a change set for an existing
     * stack, specify <code>UPDATE</code>. To create a change set for an import
     * operation, specify <code>IMPORT</code>.
     * </p>
     * <p>
     * If you create a change set for a new stack, AWS Cloudformation creates a
     * stack with a unique stack ID, but no template or resources. The stack
     * will be in the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995"
     * > <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change
     * set.
     * </p>
     * <p>
     * By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't
     * use the <code>UPDATE</code> type to create a change set for a new stack
     * or the <code>CREATE</code> type to create a change set for an existing
     * stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, IMPORT
     *
     * @return <p>
     *         The type of change set operation. To create a change set for a
     *         new stack, specify <code>CREATE</code>. To create a change set
     *         for an existing stack, specify <code>UPDATE</code>. To create a
     *         change set for an import operation, specify <code>IMPORT</code>.
     *         </p>
     *         <p>
     *         If you create a change set for a new stack, AWS Cloudformation
     *         creates a stack with a unique stack ID, but no template or
     *         resources. The stack will be in the <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995"
     *         > <code>REVIEW_IN_PROGRESS</code> </a> state until you execute
     *         the change set.
     *         </p>
     *         <p>
     *         By default, AWS CloudFormation specifies <code>UPDATE</code>. You
     *         can't use the <code>UPDATE</code> type to create a change set for
     *         a new stack or the <code>CREATE</code> type to create a change
     *         set for an existing stack.
     *         </p>
     * @see ChangeSetType
     */
    public String getChangeSetType() {
        return changeSetType;
    }

    /**
     * <p>
     * The type of change set operation. To create a change set for a new stack,
     * specify <code>CREATE</code>. To create a change set for an existing
     * stack, specify <code>UPDATE</code>. To create a change set for an import
     * operation, specify <code>IMPORT</code>.
     * </p>
     * <p>
     * If you create a change set for a new stack, AWS Cloudformation creates a
     * stack with a unique stack ID, but no template or resources. The stack
     * will be in the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995"
     * > <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change
     * set.
     * </p>
     * <p>
     * By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't
     * use the <code>UPDATE</code> type to create a change set for a new stack
     * or the <code>CREATE</code> type to create a change set for an existing
     * stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, IMPORT
     *
     * @param changeSetType <p>
     *            The type of change set operation. To create a change set for a
     *            new stack, specify <code>CREATE</code>. To create a change set
     *            for an existing stack, specify <code>UPDATE</code>. To create
     *            a change set for an import operation, specify
     *            <code>IMPORT</code>.
     *            </p>
     *            <p>
     *            If you create a change set for a new stack, AWS Cloudformation
     *            creates a stack with a unique stack ID, but no template or
     *            resources. The stack will be in the <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995"
     *            > <code>REVIEW_IN_PROGRESS</code> </a> state until you execute
     *            the change set.
     *            </p>
     *            <p>
     *            By default, AWS CloudFormation specifies <code>UPDATE</code>.
     *            You can't use the <code>UPDATE</code> type to create a change
     *            set for a new stack or the <code>CREATE</code> type to create
     *            a change set for an existing stack.
     *            </p>
     * @see ChangeSetType
     */
    public void setChangeSetType(String changeSetType) {
        this.changeSetType = changeSetType;
    }

    /**
     * <p>
     * The type of change set operation. To create a change set for a new stack,
     * specify <code>CREATE</code>. To create a change set for an existing
     * stack, specify <code>UPDATE</code>. To create a change set for an import
     * operation, specify <code>IMPORT</code>.
     * </p>
     * <p>
     * If you create a change set for a new stack, AWS Cloudformation creates a
     * stack with a unique stack ID, but no template or resources. The stack
     * will be in the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995"
     * > <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change
     * set.
     * </p>
     * <p>
     * By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't
     * use the <code>UPDATE</code> type to create a change set for a new stack
     * or the <code>CREATE</code> type to create a change set for an existing
     * stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, IMPORT
     *
     * @param changeSetType <p>
     *            The type of change set operation. To create a change set for a
     *            new stack, specify <code>CREATE</code>. To create a change set
     *            for an existing stack, specify <code>UPDATE</code>. To create
     *            a change set for an import operation, specify
     *            <code>IMPORT</code>.
     *            </p>
     *            <p>
     *            If you create a change set for a new stack, AWS Cloudformation
     *            creates a stack with a unique stack ID, but no template or
     *            resources. The stack will be in the <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995"
     *            > <code>REVIEW_IN_PROGRESS</code> </a> state until you execute
     *            the change set.
     *            </p>
     *            <p>
     *            By default, AWS CloudFormation specifies <code>UPDATE</code>.
     *            You can't use the <code>UPDATE</code> type to create a change
     *            set for a new stack or the <code>CREATE</code> type to create
     *            a change set for an existing stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeSetType
     */
    public CreateChangeSetRequest withChangeSetType(String changeSetType) {
        this.changeSetType = changeSetType;
        return this;
    }

    /**
     * <p>
     * The type of change set operation. To create a change set for a new stack,
     * specify <code>CREATE</code>. To create a change set for an existing
     * stack, specify <code>UPDATE</code>. To create a change set for an import
     * operation, specify <code>IMPORT</code>.
     * </p>
     * <p>
     * If you create a change set for a new stack, AWS Cloudformation creates a
     * stack with a unique stack ID, but no template or resources. The stack
     * will be in the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995"
     * > <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change
     * set.
     * </p>
     * <p>
     * By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't
     * use the <code>UPDATE</code> type to create a change set for a new stack
     * or the <code>CREATE</code> type to create a change set for an existing
     * stack.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, IMPORT
     *
     * @param changeSetType <p>
     *            The type of change set operation. To create a change set for a
     *            new stack, specify <code>CREATE</code>. To create a change set
     *            for an existing stack, specify <code>UPDATE</code>. To create
     *            a change set for an import operation, specify
     *            <code>IMPORT</code>.
     *            </p>
     *            <p>
     *            If you create a change set for a new stack, AWS Cloudformation
     *            creates a stack with a unique stack ID, but no template or
     *            resources. The stack will be in the <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995"
     *            > <code>REVIEW_IN_PROGRESS</code> </a> state until you execute
     *            the change set.
     *            </p>
     *            <p>
     *            By default, AWS CloudFormation specifies <code>UPDATE</code>.
     *            You can't use the <code>UPDATE</code> type to create a change
     *            set for a new stack or the <code>CREATE</code> type to create
     *            a change set for an existing stack.
     *            </p>
     * @see ChangeSetType
     */
    public void setChangeSetType(ChangeSetType changeSetType) {
        this.changeSetType = changeSetType.toString();
    }

    /**
     * <p>
     * The type of change set operation. To create a change set for a new stack,
     * specify <code>CREATE</code>. To create a change set for an existing
     * stack, specify <code>UPDATE</code>. To create a change set for an import
     * operation, specify <code>IMPORT</code>.
     * </p>
     * <p>
     * If you create a change set for a new stack, AWS Cloudformation creates a
     * stack with a unique stack ID, but no template or resources. The stack
     * will be in the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995"
     * > <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change
     * set.
     * </p>
     * <p>
     * By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't
     * use the <code>UPDATE</code> type to create a change set for a new stack
     * or the <code>CREATE</code> type to create a change set for an existing
     * stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, IMPORT
     *
     * @param changeSetType <p>
     *            The type of change set operation. To create a change set for a
     *            new stack, specify <code>CREATE</code>. To create a change set
     *            for an existing stack, specify <code>UPDATE</code>. To create
     *            a change set for an import operation, specify
     *            <code>IMPORT</code>.
     *            </p>
     *            <p>
     *            If you create a change set for a new stack, AWS Cloudformation
     *            creates a stack with a unique stack ID, but no template or
     *            resources. The stack will be in the <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995"
     *            > <code>REVIEW_IN_PROGRESS</code> </a> state until you execute
     *            the change set.
     *            </p>
     *            <p>
     *            By default, AWS CloudFormation specifies <code>UPDATE</code>.
     *            You can't use the <code>UPDATE</code> type to create a change
     *            set for a new stack or the <code>CREATE</code> type to create
     *            a change set for an existing stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeSetType
     */
    public CreateChangeSetRequest withChangeSetType(ChangeSetType changeSetType) {
        this.changeSetType = changeSetType.toString();
        return this;
    }

    /**
     * <p>
     * The resources to import into your stack.
     * </p>
     *
     * @return <p>
     *         The resources to import into your stack.
     *         </p>
     */
    public java.util.List<ResourceToImport> getResourcesToImport() {
        return resourcesToImport;
    }

    /**
     * <p>
     * The resources to import into your stack.
     * </p>
     *
     * @param resourcesToImport <p>
     *            The resources to import into your stack.
     *            </p>
     */
    public void setResourcesToImport(java.util.Collection<ResourceToImport> resourcesToImport) {
        if (resourcesToImport == null) {
            this.resourcesToImport = null;
            return;
        }

        this.resourcesToImport = new java.util.ArrayList<ResourceToImport>(resourcesToImport);
    }

    /**
     * <p>
     * The resources to import into your stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourcesToImport <p>
     *            The resources to import into your stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withResourcesToImport(ResourceToImport... resourcesToImport) {
        if (getResourcesToImport() == null) {
            this.resourcesToImport = new java.util.ArrayList<ResourceToImport>(
                    resourcesToImport.length);
        }
        for (ResourceToImport value : resourcesToImport) {
            this.resourcesToImport.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The resources to import into your stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourcesToImport <p>
     *            The resources to import into your stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateChangeSetRequest withResourcesToImport(
            java.util.Collection<ResourceToImport> resourcesToImport) {
        setResourcesToImport(resourcesToImport);
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
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
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
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: " + getResourceTypes() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getRollbackConfiguration() != null)
            sb.append("RollbackConfiguration: " + getRollbackConfiguration() + ",");
        if (getNotificationARNs() != null)
            sb.append("NotificationARNs: " + getNotificationARNs() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: " + getChangeSetName() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getChangeSetType() != null)
            sb.append("ChangeSetType: " + getChangeSetType() + ",");
        if (getResourcesToImport() != null)
            sb.append("ResourcesToImport: " + getResourcesToImport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateURL() == null) ? 0 : getTemplateURL().hashCode());
        hashCode = prime * hashCode
                + ((getUsePreviousTemplate() == null) ? 0 : getUsePreviousTemplate().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode
                + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getRollbackConfiguration() == null) ? 0 : getRollbackConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationARNs() == null) ? 0 : getNotificationARNs().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getChangeSetType() == null) ? 0 : getChangeSetType().hashCode());
        hashCode = prime * hashCode
                + ((getResourcesToImport() == null) ? 0 : getResourcesToImport().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChangeSetRequest == false)
            return false;
        CreateChangeSetRequest other = (CreateChangeSetRequest) obj;

        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
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
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null
                && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getRollbackConfiguration() == null ^ this.getRollbackConfiguration() == null)
            return false;
        if (other.getRollbackConfiguration() != null
                && other.getRollbackConfiguration().equals(this.getRollbackConfiguration()) == false)
            return false;
        if (other.getNotificationARNs() == null ^ this.getNotificationARNs() == null)
            return false;
        if (other.getNotificationARNs() != null
                && other.getNotificationARNs().equals(this.getNotificationARNs()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null
                && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getChangeSetType() == null ^ this.getChangeSetType() == null)
            return false;
        if (other.getChangeSetType() != null
                && other.getChangeSetType().equals(this.getChangeSetType()) == false)
            return false;
        if (other.getResourcesToImport() == null ^ this.getResourcesToImport() == null)
            return false;
        if (other.getResourcesToImport() != null
                && other.getResourcesToImport().equals(this.getResourcesToImport()) == false)
            return false;
        return true;
    }
}
