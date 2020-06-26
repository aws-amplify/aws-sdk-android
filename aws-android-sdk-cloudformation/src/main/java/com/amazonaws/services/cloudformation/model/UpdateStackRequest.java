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
 * Updates a stack as specified in the template. After the call completes
 * successfully, the stack update starts. You can check the status of the stack
 * via the <a>DescribeStacks</a> action.
 * </p>
 * <p>
 * To get a copy of the template for an existing stack, you can use the
 * <a>GetTemplate</a> action.
 * </p>
 * <p>
 * For more information about creating an update template, updating a stack, and
 * monitoring the progress of the update, see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html"
 * >Updating a Stack</a>.
 * </p>
 */
public class UpdateStackRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name or unique stack ID of the stack to update.
     * </p>
     */
    private String stackName;

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte
     * and a maximum length of 51,200 bytes. (For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code>, <code>TemplateURL</code>, or set the
     * <code>UsePreviousTemplate</code> to <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String templateBody;

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a
     * template that is located in an Amazon S3 bucket. For more information, go
     * to <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code>, <code>TemplateURL</code>, or set the
     * <code>UsePreviousTemplate</code> to <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String templateURL;

    /**
     * <p>
     * Reuse the existing template that is associated with the stack that you
     * are updating.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code>, <code>TemplateURL</code>, or set the
     * <code>UsePreviousTemplate</code> to <code>true</code>.
     * </p>
     */
    private Boolean usePreviousTemplate;

    /**
     * <p>
     * Structure containing the temporary overriding stack policy body. You can
     * specify either the <code>StackPolicyDuringUpdateBody</code> or the
     * <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     * </p>
     * <p>
     * If you want to update protected resources, specify a temporary overriding
     * stack policy during this update. If you do not specify a stack policy,
     * the current policy that is associated with the stack will be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     */
    private String stackPolicyDuringUpdateBody;

    /**
     * <p>
     * Location of a file containing the temporary overriding stack policy. The
     * URL must point to a policy (max size: 16KB) located in an S3 bucket in
     * the same Region as the stack. You can specify either the
     * <code>StackPolicyDuringUpdateBody</code> or the
     * <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     * </p>
     * <p>
     * If you want to update protected resources, specify a temporary overriding
     * stack policy during this update. If you do not specify a stack policy,
     * the current policy that is associated with the stack will be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     */
    private String stackPolicyDuringUpdateURL;

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input parameters
     * for the stack. For more information, see the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     * >Parameter</a> data type.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template
     * contains certain capabilities in order for AWS CloudFormation to update
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
     * before actually updating the stack. If your stack template contains one
     * or more macros, and you choose to update a stack directly from the
     * processed template, without first reviewing the resulting changes in a
     * change set, you must acknowledge this capability. This includes the <a
     * href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS
     * CloudFormation.
     * </p>
     * <p>
     * Change sets do not currently support nested stacks. If you want to update
     * a stack from a stack template that contains macros <i>and</i> nested
     * stacks, you must update the stack directly from the template using this
     * capability.
     * </p>
     * <important>
     * <p>
     * You should only update stacks directly from a stack template that
     * contains macros if you know what processing the macro performs.
     * </p>
     * <p>
     * Each macro relies on an underlying Lambda service function for processing
     * stack templates. Be aware that the Lambda function owner can update the
     * function operation without AWS CloudFormation being notified.
     * </p>
     * </important>
     * <p>
     * For more information, see <a href=
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
     * The template resource types that you have permissions to work with for
     * this update stack action, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're
     * updating, the stack update fails. By default, AWS CloudFormation grants
     * permissions to all resource types. AWS Identity and Access Management
     * (IAM) uses this parameter for AWS CloudFormation-specific condition keys
     * in IAM policies. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     * >Controlling Access with AWS Identity and Access Management</a>.
     * </p>
     */
    private java.util.List<String> resourceTypes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that AWS CloudFormation assumes to update the stack. AWS
     * CloudFormation uses the role's credentials to make calls on your behalf.
     * AWS CloudFormation always uses this role for all future operations on the
     * stack. As long as users have permission to operate on the stack, AWS
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
     * Structure containing a new stack policy body. You can specify either the
     * <code>StackPolicyBody</code> or the <code>StackPolicyURL</code>
     * parameter, but not both.
     * </p>
     * <p>
     * You might update the stack policy, for example, in order to protect a new
     * resource that you created during a stack update. If you do not specify a
     * stack policy, the current policy that is associated with the stack is
     * unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     */
    private String stackPolicyBody;

    /**
     * <p>
     * Location of a file containing the updated stack policy. The URL must
     * point to a policy (max size: 16KB) located in an S3 bucket in the same
     * Region as the stack. You can specify either the
     * <code>StackPolicyBody</code> or the <code>StackPolicyURL</code>
     * parameter, but not both.
     * </p>
     * <p>
     * You might update the stack policy, for example, in order to protect a new
     * resource that you created during a stack update. If you do not specify a
     * stack policy, the current policy that is associated with the stack is
     * unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     */
    private String stackPolicyURL;

    /**
     * <p>
     * Amazon Simple Notification Service topic Amazon Resource Names (ARNs)
     * that AWS CloudFormation associates with the stack. Specify an empty list
     * to remove all notification topics.
     * </p>
     */
    private java.util.List<String> notificationARNs;

    /**
     * <p>
     * Key-value pairs to associate with this stack. AWS CloudFormation also
     * propagates these tags to supported resources in the stack. You can
     * specify a maximum number of 50 tags.
     * </p>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify
     * the stack's tags. If you specify an empty value, AWS CloudFormation
     * removes all associated tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique identifier for this <code>UpdateStack</code> request. Specify
     * this token if you plan to retry requests so that AWS CloudFormation knows
     * that you're not attempting to update a stack with the same name. You
     * might retry <code>UpdateStack</code> requests to ensure that AWS
     * CloudFormation successfully received them.
     * </p>
     * <p>
     * All events triggered by a given stack operation are assigned the same
     * client request token, which you can use to track operations. For example,
     * if you execute a <code>CreateStack</code> operation with the token
     * <code>token1</code>, then all the <code>StackEvents</code> generated by
     * that operation will have <code>ClientRequestToken</code> set as
     * <code>token1</code>.
     * </p>
     * <p>
     * In the console, stack operations display the client request token on the
     * Events tab. Stack operations that are initiated from the console use the
     * token format <i>Console-StackOperation-ID</i>, which helps you easily
     * identify the stack operation . For example, if you create a stack using
     * the console, each stack event would be assigned the same token in the
     * following format:
     * <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name or unique stack ID of the stack to update.
     * </p>
     *
     * @return <p>
     *         The name or unique stack ID of the stack to update.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The name or unique stack ID of the stack to update.
     * </p>
     *
     * @param stackName <p>
     *            The name or unique stack ID of the stack to update.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or unique stack ID of the stack to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackName <p>
     *            The name or unique stack ID of the stack to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte
     * and a maximum length of 51,200 bytes. (For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code>, <code>TemplateURL</code>, or set the
     * <code>UsePreviousTemplate</code> to <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Structure containing the template body with a minimum length of 1
     *         byte and a maximum length of 51,200 bytes. (For more information,
     *         go to <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *         >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     *         </p>
     *         <p>
     *         Conditional: You must specify only one of the following
     *         parameters: <code>TemplateBody</code>, <code>TemplateURL</code>,
     *         or set the <code>UsePreviousTemplate</code> to <code>true</code>.
     *         </p>
     */
    public String getTemplateBody() {
        return templateBody;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte
     * and a maximum length of 51,200 bytes. (For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code>, <code>TemplateURL</code>, or set the
     * <code>UsePreviousTemplate</code> to <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody <p>
     *            Structure containing the template body with a minimum length
     *            of 1 byte and a maximum length of 51,200 bytes. (For more
     *            information, go to <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     *            </p>
     *            <p>
     *            Conditional: You must specify only one of the following
     *            parameters: <code>TemplateBody</code>,
     *            <code>TemplateURL</code>, or set the
     *            <code>UsePreviousTemplate</code> to <code>true</code>.
     *            </p>
     */
    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte
     * and a maximum length of 51,200 bytes. (For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code>, <code>TemplateURL</code>, or set the
     * <code>UsePreviousTemplate</code> to <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody <p>
     *            Structure containing the template body with a minimum length
     *            of 1 byte and a maximum length of 51,200 bytes. (For more
     *            information, go to <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.)
     *            </p>
     *            <p>
     *            Conditional: You must specify only one of the following
     *            parameters: <code>TemplateBody</code>,
     *            <code>TemplateURL</code>, or set the
     *            <code>UsePreviousTemplate</code> to <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a
     * template that is located in an Amazon S3 bucket. For more information, go
     * to <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code>, <code>TemplateURL</code>, or set the
     * <code>UsePreviousTemplate</code> to <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Location of file containing the template body. The URL must point
     *         to a template that is located in an Amazon S3 bucket. For more
     *         information, go to <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *         >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *         </p>
     *         <p>
     *         Conditional: You must specify only one of the following
     *         parameters: <code>TemplateBody</code>, <code>TemplateURL</code>,
     *         or set the <code>UsePreviousTemplate</code> to <code>true</code>.
     *         </p>
     */
    public String getTemplateURL() {
        return templateURL;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a
     * template that is located in an Amazon S3 bucket. For more information, go
     * to <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code>, <code>TemplateURL</code>, or set the
     * <code>UsePreviousTemplate</code> to <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL <p>
     *            Location of file containing the template body. The URL must
     *            point to a template that is located in an Amazon S3 bucket.
     *            For more information, go to <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *            </p>
     *            <p>
     *            Conditional: You must specify only one of the following
     *            parameters: <code>TemplateBody</code>,
     *            <code>TemplateURL</code>, or set the
     *            <code>UsePreviousTemplate</code> to <code>true</code>.
     *            </p>
     */
    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a
     * template that is located in an Amazon S3 bucket. For more information, go
     * to <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code>, <code>TemplateURL</code>, or set the
     * <code>UsePreviousTemplate</code> to <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL <p>
     *            Location of file containing the template body. The URL must
     *            point to a template that is located in an Amazon S3 bucket.
     *            For more information, go to <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *            </p>
     *            <p>
     *            Conditional: You must specify only one of the following
     *            parameters: <code>TemplateBody</code>,
     *            <code>TemplateURL</code>, or set the
     *            <code>UsePreviousTemplate</code> to <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }

    /**
     * <p>
     * Reuse the existing template that is associated with the stack that you
     * are updating.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code>, <code>TemplateURL</code>, or set the
     * <code>UsePreviousTemplate</code> to <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Reuse the existing template that is associated with the stack
     *         that you are updating.
     *         </p>
     *         <p>
     *         Conditional: You must specify only one of the following
     *         parameters: <code>TemplateBody</code>, <code>TemplateURL</code>,
     *         or set the <code>UsePreviousTemplate</code> to <code>true</code>.
     *         </p>
     */
    public Boolean isUsePreviousTemplate() {
        return usePreviousTemplate;
    }

    /**
     * <p>
     * Reuse the existing template that is associated with the stack that you
     * are updating.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code>, <code>TemplateURL</code>, or set the
     * <code>UsePreviousTemplate</code> to <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Reuse the existing template that is associated with the stack
     *         that you are updating.
     *         </p>
     *         <p>
     *         Conditional: You must specify only one of the following
     *         parameters: <code>TemplateBody</code>, <code>TemplateURL</code>,
     *         or set the <code>UsePreviousTemplate</code> to <code>true</code>.
     *         </p>
     */
    public Boolean getUsePreviousTemplate() {
        return usePreviousTemplate;
    }

    /**
     * <p>
     * Reuse the existing template that is associated with the stack that you
     * are updating.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code>, <code>TemplateURL</code>, or set the
     * <code>UsePreviousTemplate</code> to <code>true</code>.
     * </p>
     *
     * @param usePreviousTemplate <p>
     *            Reuse the existing template that is associated with the stack
     *            that you are updating.
     *            </p>
     *            <p>
     *            Conditional: You must specify only one of the following
     *            parameters: <code>TemplateBody</code>,
     *            <code>TemplateURL</code>, or set the
     *            <code>UsePreviousTemplate</code> to <code>true</code>.
     *            </p>
     */
    public void setUsePreviousTemplate(Boolean usePreviousTemplate) {
        this.usePreviousTemplate = usePreviousTemplate;
    }

    /**
     * <p>
     * Reuse the existing template that is associated with the stack that you
     * are updating.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters:
     * <code>TemplateBody</code>, <code>TemplateURL</code>, or set the
     * <code>UsePreviousTemplate</code> to <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usePreviousTemplate <p>
     *            Reuse the existing template that is associated with the stack
     *            that you are updating.
     *            </p>
     *            <p>
     *            Conditional: You must specify only one of the following
     *            parameters: <code>TemplateBody</code>,
     *            <code>TemplateURL</code>, or set the
     *            <code>UsePreviousTemplate</code> to <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withUsePreviousTemplate(Boolean usePreviousTemplate) {
        this.usePreviousTemplate = usePreviousTemplate;
        return this;
    }

    /**
     * <p>
     * Structure containing the temporary overriding stack policy body. You can
     * specify either the <code>StackPolicyDuringUpdateBody</code> or the
     * <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     * </p>
     * <p>
     * If you want to update protected resources, specify a temporary overriding
     * stack policy during this update. If you do not specify a stack policy,
     * the current policy that is associated with the stack will be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @return <p>
     *         Structure containing the temporary overriding stack policy body.
     *         You can specify either the
     *         <code>StackPolicyDuringUpdateBody</code> or the
     *         <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     *         </p>
     *         <p>
     *         If you want to update protected resources, specify a temporary
     *         overriding stack policy during this update. If you do not specify
     *         a stack policy, the current policy that is associated with the
     *         stack will be used.
     *         </p>
     */
    public String getStackPolicyDuringUpdateBody() {
        return stackPolicyDuringUpdateBody;
    }

    /**
     * <p>
     * Structure containing the temporary overriding stack policy body. You can
     * specify either the <code>StackPolicyDuringUpdateBody</code> or the
     * <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     * </p>
     * <p>
     * If you want to update protected resources, specify a temporary overriding
     * stack policy during this update. If you do not specify a stack policy,
     * the current policy that is associated with the stack will be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param stackPolicyDuringUpdateBody <p>
     *            Structure containing the temporary overriding stack policy
     *            body. You can specify either the
     *            <code>StackPolicyDuringUpdateBody</code> or the
     *            <code>StackPolicyDuringUpdateURL</code> parameter, but not
     *            both.
     *            </p>
     *            <p>
     *            If you want to update protected resources, specify a temporary
     *            overriding stack policy during this update. If you do not
     *            specify a stack policy, the current policy that is associated
     *            with the stack will be used.
     *            </p>
     */
    public void setStackPolicyDuringUpdateBody(String stackPolicyDuringUpdateBody) {
        this.stackPolicyDuringUpdateBody = stackPolicyDuringUpdateBody;
    }

    /**
     * <p>
     * Structure containing the temporary overriding stack policy body. You can
     * specify either the <code>StackPolicyDuringUpdateBody</code> or the
     * <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     * </p>
     * <p>
     * If you want to update protected resources, specify a temporary overriding
     * stack policy during this update. If you do not specify a stack policy,
     * the current policy that is associated with the stack will be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param stackPolicyDuringUpdateBody <p>
     *            Structure containing the temporary overriding stack policy
     *            body. You can specify either the
     *            <code>StackPolicyDuringUpdateBody</code> or the
     *            <code>StackPolicyDuringUpdateURL</code> parameter, but not
     *            both.
     *            </p>
     *            <p>
     *            If you want to update protected resources, specify a temporary
     *            overriding stack policy during this update. If you do not
     *            specify a stack policy, the current policy that is associated
     *            with the stack will be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withStackPolicyDuringUpdateBody(String stackPolicyDuringUpdateBody) {
        this.stackPolicyDuringUpdateBody = stackPolicyDuringUpdateBody;
        return this;
    }

    /**
     * <p>
     * Location of a file containing the temporary overriding stack policy. The
     * URL must point to a policy (max size: 16KB) located in an S3 bucket in
     * the same Region as the stack. You can specify either the
     * <code>StackPolicyDuringUpdateBody</code> or the
     * <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     * </p>
     * <p>
     * If you want to update protected resources, specify a temporary overriding
     * stack policy during this update. If you do not specify a stack policy,
     * the current policy that is associated with the stack will be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @return <p>
     *         Location of a file containing the temporary overriding stack
     *         policy. The URL must point to a policy (max size: 16KB) located
     *         in an S3 bucket in the same Region as the stack. You can specify
     *         either the <code>StackPolicyDuringUpdateBody</code> or the
     *         <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     *         </p>
     *         <p>
     *         If you want to update protected resources, specify a temporary
     *         overriding stack policy during this update. If you do not specify
     *         a stack policy, the current policy that is associated with the
     *         stack will be used.
     *         </p>
     */
    public String getStackPolicyDuringUpdateURL() {
        return stackPolicyDuringUpdateURL;
    }

    /**
     * <p>
     * Location of a file containing the temporary overriding stack policy. The
     * URL must point to a policy (max size: 16KB) located in an S3 bucket in
     * the same Region as the stack. You can specify either the
     * <code>StackPolicyDuringUpdateBody</code> or the
     * <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     * </p>
     * <p>
     * If you want to update protected resources, specify a temporary overriding
     * stack policy during this update. If you do not specify a stack policy,
     * the current policy that is associated with the stack will be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param stackPolicyDuringUpdateURL <p>
     *            Location of a file containing the temporary overriding stack
     *            policy. The URL must point to a policy (max size: 16KB)
     *            located in an S3 bucket in the same Region as the stack. You
     *            can specify either the
     *            <code>StackPolicyDuringUpdateBody</code> or the
     *            <code>StackPolicyDuringUpdateURL</code> parameter, but not
     *            both.
     *            </p>
     *            <p>
     *            If you want to update protected resources, specify a temporary
     *            overriding stack policy during this update. If you do not
     *            specify a stack policy, the current policy that is associated
     *            with the stack will be used.
     *            </p>
     */
    public void setStackPolicyDuringUpdateURL(String stackPolicyDuringUpdateURL) {
        this.stackPolicyDuringUpdateURL = stackPolicyDuringUpdateURL;
    }

    /**
     * <p>
     * Location of a file containing the temporary overriding stack policy. The
     * URL must point to a policy (max size: 16KB) located in an S3 bucket in
     * the same Region as the stack. You can specify either the
     * <code>StackPolicyDuringUpdateBody</code> or the
     * <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     * </p>
     * <p>
     * If you want to update protected resources, specify a temporary overriding
     * stack policy during this update. If you do not specify a stack policy,
     * the current policy that is associated with the stack will be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param stackPolicyDuringUpdateURL <p>
     *            Location of a file containing the temporary overriding stack
     *            policy. The URL must point to a policy (max size: 16KB)
     *            located in an S3 bucket in the same Region as the stack. You
     *            can specify either the
     *            <code>StackPolicyDuringUpdateBody</code> or the
     *            <code>StackPolicyDuringUpdateURL</code> parameter, but not
     *            both.
     *            </p>
     *            <p>
     *            If you want to update protected resources, specify a temporary
     *            overriding stack policy during this update. If you do not
     *            specify a stack policy, the current policy that is associated
     *            with the stack will be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withStackPolicyDuringUpdateURL(String stackPolicyDuringUpdateURL) {
        this.stackPolicyDuringUpdateURL = stackPolicyDuringUpdateURL;
        return this;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input parameters
     * for the stack. For more information, see the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     * >Parameter</a> data type.
     * </p>
     *
     * @return <p>
     *         A list of <code>Parameter</code> structures that specify input
     *         parameters for the stack. For more information, see the <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     *         >Parameter</a> data type.
     *         </p>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input parameters
     * for the stack. For more information, see the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     * >Parameter</a> data type.
     * </p>
     *
     * @param parameters <p>
     *            A list of <code>Parameter</code> structures that specify input
     *            parameters for the stack. For more information, see the <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     *            >Parameter</a> data type.
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
     * for the stack. For more information, see the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     * >Parameter</a> data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of <code>Parameter</code> structures that specify input
     *            parameters for the stack. For more information, see the <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     *            >Parameter</a> data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withParameters(Parameter... parameters) {
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
     * for the stack. For more information, see the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     * >Parameter</a> data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of <code>Parameter</code> structures that specify input
     *            parameters for the stack. For more information, see the <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html"
     *            >Parameter</a> data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template
     * contains certain capabilities in order for AWS CloudFormation to update
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
     * before actually updating the stack. If your stack template contains one
     * or more macros, and you choose to update a stack directly from the
     * processed template, without first reviewing the resulting changes in a
     * change set, you must acknowledge this capability. This includes the <a
     * href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS
     * CloudFormation.
     * </p>
     * <p>
     * Change sets do not currently support nested stacks. If you want to update
     * a stack from a stack template that contains macros <i>and</i> nested
     * stacks, you must update the stack directly from the template using this
     * capability.
     * </p>
     * <important>
     * <p>
     * You should only update stacks directly from a stack template that
     * contains macros if you know what processing the macro performs.
     * </p>
     * <p>
     * Each macro relies on an underlying Lambda service function for processing
     * stack templates. Be aware that the Lambda function owner can update the
     * function operation without AWS CloudFormation being notified.
     * </p>
     * </important>
     * <p>
     * For more information, see <a href=
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
     *         CloudFormation to update the stack.
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
     *         resulting from the macros before actually updating the stack. If
     *         your stack template contains one or more macros, and you choose
     *         to update a stack directly from the processed template, without
     *         first reviewing the resulting changes in a change set, you must
     *         acknowledge this capability. This includes the <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *         >AWS::Include</a> and <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *         >AWS::Serverless</a> transforms, which are macros hosted by AWS
     *         CloudFormation.
     *         </p>
     *         <p>
     *         Change sets do not currently support nested stacks. If you want
     *         to update a stack from a stack template that contains macros
     *         <i>and</i> nested stacks, you must update the stack directly from
     *         the template using this capability.
     *         </p>
     *         <important>
     *         <p>
     *         You should only update stacks directly from a stack template that
     *         contains macros if you know what processing the macro performs.
     *         </p>
     *         <p>
     *         Each macro relies on an underlying Lambda service function for
     *         processing stack templates. Be aware that the Lambda function
     *         owner can update the function operation without AWS
     *         CloudFormation being notified.
     *         </p>
     *         </important>
     *         <p>
     *         For more information, see <a href=
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
     * contains certain capabilities in order for AWS CloudFormation to update
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
     * before actually updating the stack. If your stack template contains one
     * or more macros, and you choose to update a stack directly from the
     * processed template, without first reviewing the resulting changes in a
     * change set, you must acknowledge this capability. This includes the <a
     * href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS
     * CloudFormation.
     * </p>
     * <p>
     * Change sets do not currently support nested stacks. If you want to update
     * a stack from a stack template that contains macros <i>and</i> nested
     * stacks, you must update the stack directly from the template using this
     * capability.
     * </p>
     * <important>
     * <p>
     * You should only update stacks directly from a stack template that
     * contains macros if you know what processing the macro performs.
     * </p>
     * <p>
     * Each macro relies on an underlying Lambda service function for processing
     * stack templates. Be aware that the Lambda function owner can update the
     * function operation without AWS CloudFormation being notified.
     * </p>
     * </important>
     * <p>
     * For more information, see <a href=
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
     *            CloudFormation to update the stack.
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
     *            before actually updating the stack. If your stack template
     *            contains one or more macros, and you choose to update a stack
     *            directly from the processed template, without first reviewing
     *            the resulting changes in a change set, you must acknowledge
     *            this capability. This includes the <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *            >AWS::Include</a> and <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *            >AWS::Serverless</a> transforms, which are macros hosted by
     *            AWS CloudFormation.
     *            </p>
     *            <p>
     *            Change sets do not currently support nested stacks. If you
     *            want to update a stack from a stack template that contains
     *            macros <i>and</i> nested stacks, you must update the stack
     *            directly from the template using this capability.
     *            </p>
     *            <important>
     *            <p>
     *            You should only update stacks directly from a stack template
     *            that contains macros if you know what processing the macro
     *            performs.
     *            </p>
     *            <p>
     *            Each macro relies on an underlying Lambda service function for
     *            processing stack templates. Be aware that the Lambda function
     *            owner can update the function operation without AWS
     *            CloudFormation being notified.
     *            </p>
     *            </important>
     *            <p>
     *            For more information, see <a href=
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
     * contains certain capabilities in order for AWS CloudFormation to update
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
     * before actually updating the stack. If your stack template contains one
     * or more macros, and you choose to update a stack directly from the
     * processed template, without first reviewing the resulting changes in a
     * change set, you must acknowledge this capability. This includes the <a
     * href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS
     * CloudFormation.
     * </p>
     * <p>
     * Change sets do not currently support nested stacks. If you want to update
     * a stack from a stack template that contains macros <i>and</i> nested
     * stacks, you must update the stack directly from the template using this
     * capability.
     * </p>
     * <important>
     * <p>
     * You should only update stacks directly from a stack template that
     * contains macros if you know what processing the macro performs.
     * </p>
     * <p>
     * Each macro relies on an underlying Lambda service function for processing
     * stack templates. Be aware that the Lambda function owner can update the
     * function operation without AWS CloudFormation being notified.
     * </p>
     * </important>
     * <p>
     * For more information, see <a href=
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
     *            CloudFormation to update the stack.
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
     *            before actually updating the stack. If your stack template
     *            contains one or more macros, and you choose to update a stack
     *            directly from the processed template, without first reviewing
     *            the resulting changes in a change set, you must acknowledge
     *            this capability. This includes the <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *            >AWS::Include</a> and <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *            >AWS::Serverless</a> transforms, which are macros hosted by
     *            AWS CloudFormation.
     *            </p>
     *            <p>
     *            Change sets do not currently support nested stacks. If you
     *            want to update a stack from a stack template that contains
     *            macros <i>and</i> nested stacks, you must update the stack
     *            directly from the template using this capability.
     *            </p>
     *            <important>
     *            <p>
     *            You should only update stacks directly from a stack template
     *            that contains macros if you know what processing the macro
     *            performs.
     *            </p>
     *            <p>
     *            Each macro relies on an underlying Lambda service function for
     *            processing stack templates. Be aware that the Lambda function
     *            owner can update the function operation without AWS
     *            CloudFormation being notified.
     *            </p>
     *            </important>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     *            >Using AWS CloudFormation Macros to Perform Custom Processing
     *            on Templates</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withCapabilities(String... capabilities) {
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
     * before actually updating the stack. If your stack template contains one
     * or more macros, and you choose to update a stack directly from the
     * processed template, without first reviewing the resulting changes in a
     * change set, you must acknowledge this capability. This includes the <a
     * href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS
     * CloudFormation.
     * </p>
     * <p>
     * Change sets do not currently support nested stacks. If you want to update
     * a stack from a stack template that contains macros <i>and</i> nested
     * stacks, you must update the stack directly from the template using this
     * capability.
     * </p>
     * <important>
     * <p>
     * You should only update stacks directly from a stack template that
     * contains macros if you know what processing the macro performs.
     * </p>
     * <p>
     * Each macro relies on an underlying Lambda service function for processing
     * stack templates. Be aware that the Lambda function owner can update the
     * function operation without AWS CloudFormation being notified.
     * </p>
     * </important>
     * <p>
     * For more information, see <a href=
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
     *            CloudFormation to update the stack.
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
     *            before actually updating the stack. If your stack template
     *            contains one or more macros, and you choose to update a stack
     *            directly from the processed template, without first reviewing
     *            the resulting changes in a change set, you must acknowledge
     *            this capability. This includes the <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *            >AWS::Include</a> and <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *            >AWS::Serverless</a> transforms, which are macros hosted by
     *            AWS CloudFormation.
     *            </p>
     *            <p>
     *            Change sets do not currently support nested stacks. If you
     *            want to update a stack from a stack template that contains
     *            macros <i>and</i> nested stacks, you must update the stack
     *            directly from the template using this capability.
     *            </p>
     *            <important>
     *            <p>
     *            You should only update stacks directly from a stack template
     *            that contains macros if you know what processing the macro
     *            performs.
     *            </p>
     *            <p>
     *            Each macro relies on an underlying Lambda service function for
     *            processing stack templates. Be aware that the Lambda function
     *            owner can update the function operation without AWS
     *            CloudFormation being notified.
     *            </p>
     *            </important>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html"
     *            >Using AWS CloudFormation Macros to Perform Custom Processing
     *            on Templates</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The template resource types that you have permissions to work with for
     * this update stack action, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're
     * updating, the stack update fails. By default, AWS CloudFormation grants
     * permissions to all resource types. AWS Identity and Access Management
     * (IAM) uses this parameter for AWS CloudFormation-specific condition keys
     * in IAM policies. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     * >Controlling Access with AWS Identity and Access Management</a>.
     * </p>
     *
     * @return <p>
     *         The template resource types that you have permissions to work
     *         with for this update stack action, such as
     *         <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or
     *         <code>Custom::MyCustomInstance</code>.
     *         </p>
     *         <p>
     *         If the list of resource types doesn't include a resource that
     *         you're updating, the stack update fails. By default, AWS
     *         CloudFormation grants permissions to all resource types. AWS
     *         Identity and Access Management (IAM) uses this parameter for AWS
     *         CloudFormation-specific condition keys in IAM policies. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     *         >Controlling Access with AWS Identity and Access Management</a>.
     *         </p>
     */
    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * The template resource types that you have permissions to work with for
     * this update stack action, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're
     * updating, the stack update fails. By default, AWS CloudFormation grants
     * permissions to all resource types. AWS Identity and Access Management
     * (IAM) uses this parameter for AWS CloudFormation-specific condition keys
     * in IAM policies. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     * >Controlling Access with AWS Identity and Access Management</a>.
     * </p>
     *
     * @param resourceTypes <p>
     *            The template resource types that you have permissions to work
     *            with for this update stack action, such as
     *            <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or
     *            <code>Custom::MyCustomInstance</code>.
     *            </p>
     *            <p>
     *            If the list of resource types doesn't include a resource that
     *            you're updating, the stack update fails. By default, AWS
     *            CloudFormation grants permissions to all resource types. AWS
     *            Identity and Access Management (IAM) uses this parameter for
     *            AWS CloudFormation-specific condition keys in IAM policies.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     *            >Controlling Access with AWS Identity and Access
     *            Management</a>.
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
     * The template resource types that you have permissions to work with for
     * this update stack action, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're
     * updating, the stack update fails. By default, AWS CloudFormation grants
     * permissions to all resource types. AWS Identity and Access Management
     * (IAM) uses this parameter for AWS CloudFormation-specific condition keys
     * in IAM policies. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     * >Controlling Access with AWS Identity and Access Management</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypes <p>
     *            The template resource types that you have permissions to work
     *            with for this update stack action, such as
     *            <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or
     *            <code>Custom::MyCustomInstance</code>.
     *            </p>
     *            <p>
     *            If the list of resource types doesn't include a resource that
     *            you're updating, the stack update fails. By default, AWS
     *            CloudFormation grants permissions to all resource types. AWS
     *            Identity and Access Management (IAM) uses this parameter for
     *            AWS CloudFormation-specific condition keys in IAM policies.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     *            >Controlling Access with AWS Identity and Access
     *            Management</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withResourceTypes(String... resourceTypes) {
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
     * The template resource types that you have permissions to work with for
     * this update stack action, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're
     * updating, the stack update fails. By default, AWS CloudFormation grants
     * permissions to all resource types. AWS Identity and Access Management
     * (IAM) uses this parameter for AWS CloudFormation-specific condition keys
     * in IAM policies. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     * >Controlling Access with AWS Identity and Access Management</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypes <p>
     *            The template resource types that you have permissions to work
     *            with for this update stack action, such as
     *            <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or
     *            <code>Custom::MyCustomInstance</code>.
     *            </p>
     *            <p>
     *            If the list of resource types doesn't include a resource that
     *            you're updating, the stack update fails. By default, AWS
     *            CloudFormation grants permissions to all resource types. AWS
     *            Identity and Access Management (IAM) uses this parameter for
     *            AWS CloudFormation-specific condition keys in IAM policies.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     *            >Controlling Access with AWS Identity and Access
     *            Management</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that AWS CloudFormation assumes to update the stack. AWS
     * CloudFormation uses the role's credentials to make calls on your behalf.
     * AWS CloudFormation always uses this role for all future operations on the
     * stack. As long as users have permission to operate on the stack, AWS
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
     *         Management (IAM) role that AWS CloudFormation assumes to update
     *         the stack. AWS CloudFormation uses the role's credentials to make
     *         calls on your behalf. AWS CloudFormation always uses this role
     *         for all future operations on the stack. As long as users have
     *         permission to operate on the stack, AWS CloudFormation uses this
     *         role even if the users don't have permission to pass it. Ensure
     *         that the role grants least privilege.
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
     * (IAM) role that AWS CloudFormation assumes to update the stack. AWS
     * CloudFormation uses the role's credentials to make calls on your behalf.
     * AWS CloudFormation always uses this role for all future operations on the
     * stack. As long as users have permission to operate on the stack, AWS
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
     *            Management (IAM) role that AWS CloudFormation assumes to
     *            update the stack. AWS CloudFormation uses the role's
     *            credentials to make calls on your behalf. AWS CloudFormation
     *            always uses this role for all future operations on the stack.
     *            As long as users have permission to operate on the stack, AWS
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
     * (IAM) role that AWS CloudFormation assumes to update the stack. AWS
     * CloudFormation uses the role's credentials to make calls on your behalf.
     * AWS CloudFormation always uses this role for all future operations on the
     * stack. As long as users have permission to operate on the stack, AWS
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
     *            Management (IAM) role that AWS CloudFormation assumes to
     *            update the stack. AWS CloudFormation uses the role's
     *            credentials to make calls on your behalf. AWS CloudFormation
     *            always uses this role for all future operations on the stack.
     *            As long as users have permission to operate on the stack, AWS
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
    public UpdateStackRequest withRoleARN(String roleARN) {
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
    public UpdateStackRequest withRollbackConfiguration(RollbackConfiguration rollbackConfiguration) {
        this.rollbackConfiguration = rollbackConfiguration;
        return this;
    }

    /**
     * <p>
     * Structure containing a new stack policy body. You can specify either the
     * <code>StackPolicyBody</code> or the <code>StackPolicyURL</code>
     * parameter, but not both.
     * </p>
     * <p>
     * You might update the stack policy, for example, in order to protect a new
     * resource that you created during a stack update. If you do not specify a
     * stack policy, the current policy that is associated with the stack is
     * unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @return <p>
     *         Structure containing a new stack policy body. You can specify
     *         either the <code>StackPolicyBody</code> or the
     *         <code>StackPolicyURL</code> parameter, but not both.
     *         </p>
     *         <p>
     *         You might update the stack policy, for example, in order to
     *         protect a new resource that you created during a stack update. If
     *         you do not specify a stack policy, the current policy that is
     *         associated with the stack is unchanged.
     *         </p>
     */
    public String getStackPolicyBody() {
        return stackPolicyBody;
    }

    /**
     * <p>
     * Structure containing a new stack policy body. You can specify either the
     * <code>StackPolicyBody</code> or the <code>StackPolicyURL</code>
     * parameter, but not both.
     * </p>
     * <p>
     * You might update the stack policy, for example, in order to protect a new
     * resource that you created during a stack update. If you do not specify a
     * stack policy, the current policy that is associated with the stack is
     * unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param stackPolicyBody <p>
     *            Structure containing a new stack policy body. You can specify
     *            either the <code>StackPolicyBody</code> or the
     *            <code>StackPolicyURL</code> parameter, but not both.
     *            </p>
     *            <p>
     *            You might update the stack policy, for example, in order to
     *            protect a new resource that you created during a stack update.
     *            If you do not specify a stack policy, the current policy that
     *            is associated with the stack is unchanged.
     *            </p>
     */
    public void setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
    }

    /**
     * <p>
     * Structure containing a new stack policy body. You can specify either the
     * <code>StackPolicyBody</code> or the <code>StackPolicyURL</code>
     * parameter, but not both.
     * </p>
     * <p>
     * You might update the stack policy, for example, in order to protect a new
     * resource that you created during a stack update. If you do not specify a
     * stack policy, the current policy that is associated with the stack is
     * unchanged.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param stackPolicyBody <p>
     *            Structure containing a new stack policy body. You can specify
     *            either the <code>StackPolicyBody</code> or the
     *            <code>StackPolicyURL</code> parameter, but not both.
     *            </p>
     *            <p>
     *            You might update the stack policy, for example, in order to
     *            protect a new resource that you created during a stack update.
     *            If you do not specify a stack policy, the current policy that
     *            is associated with the stack is unchanged.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }

    /**
     * <p>
     * Location of a file containing the updated stack policy. The URL must
     * point to a policy (max size: 16KB) located in an S3 bucket in the same
     * Region as the stack. You can specify either the
     * <code>StackPolicyBody</code> or the <code>StackPolicyURL</code>
     * parameter, but not both.
     * </p>
     * <p>
     * You might update the stack policy, for example, in order to protect a new
     * resource that you created during a stack update. If you do not specify a
     * stack policy, the current policy that is associated with the stack is
     * unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @return <p>
     *         Location of a file containing the updated stack policy. The URL
     *         must point to a policy (max size: 16KB) located in an S3 bucket
     *         in the same Region as the stack. You can specify either the
     *         <code>StackPolicyBody</code> or the <code>StackPolicyURL</code>
     *         parameter, but not both.
     *         </p>
     *         <p>
     *         You might update the stack policy, for example, in order to
     *         protect a new resource that you created during a stack update. If
     *         you do not specify a stack policy, the current policy that is
     *         associated with the stack is unchanged.
     *         </p>
     */
    public String getStackPolicyURL() {
        return stackPolicyURL;
    }

    /**
     * <p>
     * Location of a file containing the updated stack policy. The URL must
     * point to a policy (max size: 16KB) located in an S3 bucket in the same
     * Region as the stack. You can specify either the
     * <code>StackPolicyBody</code> or the <code>StackPolicyURL</code>
     * parameter, but not both.
     * </p>
     * <p>
     * You might update the stack policy, for example, in order to protect a new
     * resource that you created during a stack update. If you do not specify a
     * stack policy, the current policy that is associated with the stack is
     * unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param stackPolicyURL <p>
     *            Location of a file containing the updated stack policy. The
     *            URL must point to a policy (max size: 16KB) located in an S3
     *            bucket in the same Region as the stack. You can specify either
     *            the <code>StackPolicyBody</code> or the
     *            <code>StackPolicyURL</code> parameter, but not both.
     *            </p>
     *            <p>
     *            You might update the stack policy, for example, in order to
     *            protect a new resource that you created during a stack update.
     *            If you do not specify a stack policy, the current policy that
     *            is associated with the stack is unchanged.
     *            </p>
     */
    public void setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
    }

    /**
     * <p>
     * Location of a file containing the updated stack policy. The URL must
     * point to a policy (max size: 16KB) located in an S3 bucket in the same
     * Region as the stack. You can specify either the
     * <code>StackPolicyBody</code> or the <code>StackPolicyURL</code>
     * parameter, but not both.
     * </p>
     * <p>
     * You might update the stack policy, for example, in order to protect a new
     * resource that you created during a stack update. If you do not specify a
     * stack policy, the current policy that is associated with the stack is
     * unchanged.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param stackPolicyURL <p>
     *            Location of a file containing the updated stack policy. The
     *            URL must point to a policy (max size: 16KB) located in an S3
     *            bucket in the same Region as the stack. You can specify either
     *            the <code>StackPolicyBody</code> or the
     *            <code>StackPolicyURL</code> parameter, but not both.
     *            </p>
     *            <p>
     *            You might update the stack policy, for example, in order to
     *            protect a new resource that you created during a stack update.
     *            If you do not specify a stack policy, the current policy that
     *            is associated with the stack is unchanged.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }

    /**
     * <p>
     * Amazon Simple Notification Service topic Amazon Resource Names (ARNs)
     * that AWS CloudFormation associates with the stack. Specify an empty list
     * to remove all notification topics.
     * </p>
     *
     * @return <p>
     *         Amazon Simple Notification Service topic Amazon Resource Names
     *         (ARNs) that AWS CloudFormation associates with the stack. Specify
     *         an empty list to remove all notification topics.
     *         </p>
     */
    public java.util.List<String> getNotificationARNs() {
        return notificationARNs;
    }

    /**
     * <p>
     * Amazon Simple Notification Service topic Amazon Resource Names (ARNs)
     * that AWS CloudFormation associates with the stack. Specify an empty list
     * to remove all notification topics.
     * </p>
     *
     * @param notificationARNs <p>
     *            Amazon Simple Notification Service topic Amazon Resource Names
     *            (ARNs) that AWS CloudFormation associates with the stack.
     *            Specify an empty list to remove all notification topics.
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
     * Amazon Simple Notification Service topic Amazon Resource Names (ARNs)
     * that AWS CloudFormation associates with the stack. Specify an empty list
     * to remove all notification topics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationARNs <p>
     *            Amazon Simple Notification Service topic Amazon Resource Names
     *            (ARNs) that AWS CloudFormation associates with the stack.
     *            Specify an empty list to remove all notification topics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withNotificationARNs(String... notificationARNs) {
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
     * Amazon Simple Notification Service topic Amazon Resource Names (ARNs)
     * that AWS CloudFormation associates with the stack. Specify an empty list
     * to remove all notification topics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationARNs <p>
     *            Amazon Simple Notification Service topic Amazon Resource Names
     *            (ARNs) that AWS CloudFormation associates with the stack.
     *            Specify an empty list to remove all notification topics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withNotificationARNs(java.util.Collection<String> notificationARNs) {
        setNotificationARNs(notificationARNs);
        return this;
    }

    /**
     * <p>
     * Key-value pairs to associate with this stack. AWS CloudFormation also
     * propagates these tags to supported resources in the stack. You can
     * specify a maximum number of 50 tags.
     * </p>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify
     * the stack's tags. If you specify an empty value, AWS CloudFormation
     * removes all associated tags.
     * </p>
     *
     * @return <p>
     *         Key-value pairs to associate with this stack. AWS CloudFormation
     *         also propagates these tags to supported resources in the stack.
     *         You can specify a maximum number of 50 tags.
     *         </p>
     *         <p>
     *         If you don't specify this parameter, AWS CloudFormation doesn't
     *         modify the stack's tags. If you specify an empty value, AWS
     *         CloudFormation removes all associated tags.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs to associate with this stack. AWS CloudFormation also
     * propagates these tags to supported resources in the stack. You can
     * specify a maximum number of 50 tags.
     * </p>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify
     * the stack's tags. If you specify an empty value, AWS CloudFormation
     * removes all associated tags.
     * </p>
     *
     * @param tags <p>
     *            Key-value pairs to associate with this stack. AWS
     *            CloudFormation also propagates these tags to supported
     *            resources in the stack. You can specify a maximum number of 50
     *            tags.
     *            </p>
     *            <p>
     *            If you don't specify this parameter, AWS CloudFormation
     *            doesn't modify the stack's tags. If you specify an empty
     *            value, AWS CloudFormation removes all associated tags.
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
     * propagates these tags to supported resources in the stack. You can
     * specify a maximum number of 50 tags.
     * </p>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify
     * the stack's tags. If you specify an empty value, AWS CloudFormation
     * removes all associated tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Key-value pairs to associate with this stack. AWS
     *            CloudFormation also propagates these tags to supported
     *            resources in the stack. You can specify a maximum number of 50
     *            tags.
     *            </p>
     *            <p>
     *            If you don't specify this parameter, AWS CloudFormation
     *            doesn't modify the stack's tags. If you specify an empty
     *            value, AWS CloudFormation removes all associated tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withTags(Tag... tags) {
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
     * propagates these tags to supported resources in the stack. You can
     * specify a maximum number of 50 tags.
     * </p>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify
     * the stack's tags. If you specify an empty value, AWS CloudFormation
     * removes all associated tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Key-value pairs to associate with this stack. AWS
     *            CloudFormation also propagates these tags to supported
     *            resources in the stack. You can specify a maximum number of 50
     *            tags.
     *            </p>
     *            <p>
     *            If you don't specify this parameter, AWS CloudFormation
     *            doesn't modify the stack's tags. If you specify an empty
     *            value, AWS CloudFormation removes all associated tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A unique identifier for this <code>UpdateStack</code> request. Specify
     * this token if you plan to retry requests so that AWS CloudFormation knows
     * that you're not attempting to update a stack with the same name. You
     * might retry <code>UpdateStack</code> requests to ensure that AWS
     * CloudFormation successfully received them.
     * </p>
     * <p>
     * All events triggered by a given stack operation are assigned the same
     * client request token, which you can use to track operations. For example,
     * if you execute a <code>CreateStack</code> operation with the token
     * <code>token1</code>, then all the <code>StackEvents</code> generated by
     * that operation will have <code>ClientRequestToken</code> set as
     * <code>token1</code>.
     * </p>
     * <p>
     * In the console, stack operations display the client request token on the
     * Events tab. Stack operations that are initiated from the console use the
     * token format <i>Console-StackOperation-ID</i>, which helps you easily
     * identify the stack operation . For example, if you create a stack using
     * the console, each stack event would be assigned the same token in the
     * following format:
     * <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         A unique identifier for this <code>UpdateStack</code> request.
     *         Specify this token if you plan to retry requests so that AWS
     *         CloudFormation knows that you're not attempting to update a stack
     *         with the same name. You might retry <code>UpdateStack</code>
     *         requests to ensure that AWS CloudFormation successfully received
     *         them.
     *         </p>
     *         <p>
     *         All events triggered by a given stack operation are assigned the
     *         same client request token, which you can use to track operations.
     *         For example, if you execute a <code>CreateStack</code> operation
     *         with the token <code>token1</code>, then all the
     *         <code>StackEvents</code> generated by that operation will have
     *         <code>ClientRequestToken</code> set as <code>token1</code>.
     *         </p>
     *         <p>
     *         In the console, stack operations display the client request token
     *         on the Events tab. Stack operations that are initiated from the
     *         console use the token format <i>Console-StackOperation-ID</i>,
     *         which helps you easily identify the stack operation . For
     *         example, if you create a stack using the console, each stack
     *         event would be assigned the same token in the following format:
     *         <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>
     *         .
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>UpdateStack</code> request. Specify
     * this token if you plan to retry requests so that AWS CloudFormation knows
     * that you're not attempting to update a stack with the same name. You
     * might retry <code>UpdateStack</code> requests to ensure that AWS
     * CloudFormation successfully received them.
     * </p>
     * <p>
     * All events triggered by a given stack operation are assigned the same
     * client request token, which you can use to track operations. For example,
     * if you execute a <code>CreateStack</code> operation with the token
     * <code>token1</code>, then all the <code>StackEvents</code> generated by
     * that operation will have <code>ClientRequestToken</code> set as
     * <code>token1</code>.
     * </p>
     * <p>
     * In the console, stack operations display the client request token on the
     * Events tab. Stack operations that are initiated from the console use the
     * token format <i>Console-StackOperation-ID</i>, which helps you easily
     * identify the stack operation . For example, if you create a stack using
     * the console, each stack event would be assigned the same token in the
     * following format:
     * <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            A unique identifier for this <code>UpdateStack</code> request.
     *            Specify this token if you plan to retry requests so that AWS
     *            CloudFormation knows that you're not attempting to update a
     *            stack with the same name. You might retry
     *            <code>UpdateStack</code> requests to ensure that AWS
     *            CloudFormation successfully received them.
     *            </p>
     *            <p>
     *            All events triggered by a given stack operation are assigned
     *            the same client request token, which you can use to track
     *            operations. For example, if you execute a
     *            <code>CreateStack</code> operation with the token
     *            <code>token1</code>, then all the <code>StackEvents</code>
     *            generated by that operation will have
     *            <code>ClientRequestToken</code> set as <code>token1</code>.
     *            </p>
     *            <p>
     *            In the console, stack operations display the client request
     *            token on the Events tab. Stack operations that are initiated
     *            from the console use the token format
     *            <i>Console-StackOperation-ID</i>, which helps you easily
     *            identify the stack operation . For example, if you create a
     *            stack using the console, each stack event would be assigned
     *            the same token in the following format:
     *            <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>
     *            .
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>UpdateStack</code> request. Specify
     * this token if you plan to retry requests so that AWS CloudFormation knows
     * that you're not attempting to update a stack with the same name. You
     * might retry <code>UpdateStack</code> requests to ensure that AWS
     * CloudFormation successfully received them.
     * </p>
     * <p>
     * All events triggered by a given stack operation are assigned the same
     * client request token, which you can use to track operations. For example,
     * if you execute a <code>CreateStack</code> operation with the token
     * <code>token1</code>, then all the <code>StackEvents</code> generated by
     * that operation will have <code>ClientRequestToken</code> set as
     * <code>token1</code>.
     * </p>
     * <p>
     * In the console, stack operations display the client request token on the
     * Events tab. Stack operations that are initiated from the console use the
     * token format <i>Console-StackOperation-ID</i>, which helps you easily
     * identify the stack operation . For example, if you create a stack using
     * the console, each stack event would be assigned the same token in the
     * following format:
     * <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
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
     *            A unique identifier for this <code>UpdateStack</code> request.
     *            Specify this token if you plan to retry requests so that AWS
     *            CloudFormation knows that you're not attempting to update a
     *            stack with the same name. You might retry
     *            <code>UpdateStack</code> requests to ensure that AWS
     *            CloudFormation successfully received them.
     *            </p>
     *            <p>
     *            All events triggered by a given stack operation are assigned
     *            the same client request token, which you can use to track
     *            operations. For example, if you execute a
     *            <code>CreateStack</code> operation with the token
     *            <code>token1</code>, then all the <code>StackEvents</code>
     *            generated by that operation will have
     *            <code>ClientRequestToken</code> set as <code>token1</code>.
     *            </p>
     *            <p>
     *            In the console, stack operations display the client request
     *            token on the Events tab. Stack operations that are initiated
     *            from the console use the token format
     *            <i>Console-StackOperation-ID</i>, which helps you easily
     *            identify the stack operation . For example, if you create a
     *            stack using the console, each stack event would be assigned
     *            the same token in the following format:
     *            <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackRequest withClientRequestToken(String clientRequestToken) {
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
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: " + getTemplateBody() + ",");
        if (getTemplateURL() != null)
            sb.append("TemplateURL: " + getTemplateURL() + ",");
        if (getUsePreviousTemplate() != null)
            sb.append("UsePreviousTemplate: " + getUsePreviousTemplate() + ",");
        if (getStackPolicyDuringUpdateBody() != null)
            sb.append("StackPolicyDuringUpdateBody: " + getStackPolicyDuringUpdateBody() + ",");
        if (getStackPolicyDuringUpdateURL() != null)
            sb.append("StackPolicyDuringUpdateURL: " + getStackPolicyDuringUpdateURL() + ",");
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
        if (getStackPolicyBody() != null)
            sb.append("StackPolicyBody: " + getStackPolicyBody() + ",");
        if (getStackPolicyURL() != null)
            sb.append("StackPolicyURL: " + getStackPolicyURL() + ",");
        if (getNotificationARNs() != null)
            sb.append("NotificationARNs: " + getNotificationARNs() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken());
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
        hashCode = prime
                * hashCode
                + ((getStackPolicyDuringUpdateBody() == null) ? 0
                        : getStackPolicyDuringUpdateBody().hashCode());
        hashCode = prime
                * hashCode
                + ((getStackPolicyDuringUpdateURL() == null) ? 0 : getStackPolicyDuringUpdateURL()
                        .hashCode());
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
                + ((getStackPolicyBody() == null) ? 0 : getStackPolicyBody().hashCode());
        hashCode = prime * hashCode
                + ((getStackPolicyURL() == null) ? 0 : getStackPolicyURL().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationARNs() == null) ? 0 : getNotificationARNs().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
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

        if (obj instanceof UpdateStackRequest == false)
            return false;
        UpdateStackRequest other = (UpdateStackRequest) obj;

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
        if (other.getStackPolicyDuringUpdateBody() == null
                ^ this.getStackPolicyDuringUpdateBody() == null)
            return false;
        if (other.getStackPolicyDuringUpdateBody() != null
                && other.getStackPolicyDuringUpdateBody().equals(
                        this.getStackPolicyDuringUpdateBody()) == false)
            return false;
        if (other.getStackPolicyDuringUpdateURL() == null
                ^ this.getStackPolicyDuringUpdateURL() == null)
            return false;
        if (other.getStackPolicyDuringUpdateURL() != null
                && other.getStackPolicyDuringUpdateURL().equals(
                        this.getStackPolicyDuringUpdateURL()) == false)
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
        if (other.getStackPolicyBody() == null ^ this.getStackPolicyBody() == null)
            return false;
        if (other.getStackPolicyBody() != null
                && other.getStackPolicyBody().equals(this.getStackPolicyBody()) == false)
            return false;
        if (other.getStackPolicyURL() == null ^ this.getStackPolicyURL() == null)
            return false;
        if (other.getStackPolicyURL() != null
                && other.getStackPolicyURL().equals(this.getStackPolicyURL()) == false)
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
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
