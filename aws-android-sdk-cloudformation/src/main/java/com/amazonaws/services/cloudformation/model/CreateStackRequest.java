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
 * Creates a stack as specified in the template. After the call completes
 * successfully, the stack creation starts. You can check the status of the
 * stack via the <a>DescribeStacks</a> API.
 * </p>
 */
public class CreateStackRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name that is associated with the stack. The name must be unique in
     * the Region in which you are creating the stack.
     * </p>
     * <note>
     * <p>
     * A stack name can contain only alphanumeric characters (case sensitive)
     * and hyphens. It must start with an alphabetic character and cannot be
     * longer than 128 characters.
     * </p>
     * </note>
     */
    private String stackName;

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte
     * and a maximum length of 51,200 bytes. For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the
     * <code>TemplateURL</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String templateBody;

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a
     * template (max size: 460,800 bytes) that is located in an Amazon S3
     * bucket. For more information, go to the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the
     * <code>TemplateURL</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String templateURL;

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
     * Set to <code>true</code> to disable rollback of the stack if stack
     * creation failed. You can specify either <code>DisableRollback</code> or
     * <code>OnFailure</code>, but not both.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean disableRollback;

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
     * The amount of time that can pass before the stack status becomes
     * CREATE_FAILED; if <code>DisableRollback</code> is not set or is set to
     * <code>false</code>, the stack will be rolled back.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer timeoutInMinutes;

    /**
     * <p>
     * The Simple Notification Service (SNS) topic ARNs to publish stack related
     * events. You can find your SNS topic ARNs using the SNS console or your
     * Command Line Interface (CLI).
     * </p>
     */
    private java.util.List<String> notificationARNs;

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
     * <p>
     * Change sets do not currently support nested stacks. If you want to create
     * a stack from a stack template that contains macros <i>and</i> nested
     * stacks, you must create the stack directly from the template using this
     * capability.
     * </p>
     * <important>
     * <p>
     * You should only create stacks directly from a stack template that
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
     * this create stack action, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>. Use
     * the following syntax to describe template resource types:
     * <code>AWS::*</code> (for all AWS resource), <code>Custom::*</code> (for
     * all custom resources), <code>Custom::<i>logical_ID</i> </code> (for a
     * specific custom resource), <code>AWS::<i>service_name</i>::*</code> (for
     * all resources of a particular AWS service), and
     * <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code> (for a
     * specific AWS resource).
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're
     * creating, the stack creation fails. By default, AWS CloudFormation grants
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
     * (IAM) role that AWS CloudFormation assumes to create the stack. AWS
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
     * Determines what action will be taken if stack creation fails. This must
     * be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify either
     * <code>OnFailure</code> or <code>DisableRollback</code>, but not both.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOTHING, ROLLBACK, DELETE
     */
    private String onFailure;

    /**
     * <p>
     * Structure containing the stack policy body. For more information, go to
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"
     * > Prevent Updates to Stack Resources</a> in the <i>AWS CloudFormation
     * User Guide</i>. You can specify either the <code>StackPolicyBody</code>
     * or the <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     */
    private String stackPolicyBody;

    /**
     * <p>
     * Location of a file containing the stack policy. The URL must point to a
     * policy (maximum size: 16 KB) located in an S3 bucket in the same Region
     * as the stack. You can specify either the <code>StackPolicyBody</code> or
     * the <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     */
    private String stackPolicyURL;

    /**
     * <p>
     * Key-value pairs to associate with this stack. AWS CloudFormation also
     * propagates these tags to the resources created in the stack. A maximum
     * number of 50 tags can be specified.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique identifier for this <code>CreateStack</code> request. Specify
     * this token if you plan to retry requests so that AWS CloudFormation knows
     * that you're not attempting to create a stack with the same name. You
     * might retry <code>CreateStack</code> requests to ensure that AWS
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
     * Whether to enable termination protection on the specified stack. If a
     * user attempts to delete a stack with termination protection enabled, the
     * operation fails and the stack remains unchanged. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     * >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation
     * User Guide</i>. Termination protection is disabled on stacks by default.
     * </p>
     * <p>
     * For <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >nested stacks</a>, termination protection is set on the root stack and
     * cannot be changed directly on the nested stack.
     * </p>
     */
    private Boolean enableTerminationProtection;

    /**
     * <p>
     * The name that is associated with the stack. The name must be unique in
     * the Region in which you are creating the stack.
     * </p>
     * <note>
     * <p>
     * A stack name can contain only alphanumeric characters (case sensitive)
     * and hyphens. It must start with an alphabetic character and cannot be
     * longer than 128 characters.
     * </p>
     * </note>
     *
     * @return <p>
     *         The name that is associated with the stack. The name must be
     *         unique in the Region in which you are creating the stack.
     *         </p>
     *         <note>
     *         <p>
     *         A stack name can contain only alphanumeric characters (case
     *         sensitive) and hyphens. It must start with an alphabetic
     *         character and cannot be longer than 128 characters.
     *         </p>
     *         </note>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The name that is associated with the stack. The name must be unique in
     * the Region in which you are creating the stack.
     * </p>
     * <note>
     * <p>
     * A stack name can contain only alphanumeric characters (case sensitive)
     * and hyphens. It must start with an alphabetic character and cannot be
     * longer than 128 characters.
     * </p>
     * </note>
     *
     * @param stackName <p>
     *            The name that is associated with the stack. The name must be
     *            unique in the Region in which you are creating the stack.
     *            </p>
     *            <note>
     *            <p>
     *            A stack name can contain only alphanumeric characters (case
     *            sensitive) and hyphens. It must start with an alphabetic
     *            character and cannot be longer than 128 characters.
     *            </p>
     *            </note>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name that is associated with the stack. The name must be unique in
     * the Region in which you are creating the stack.
     * </p>
     * <note>
     * <p>
     * A stack name can contain only alphanumeric characters (case sensitive)
     * and hyphens. It must start with an alphabetic character and cannot be
     * longer than 128 characters.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackName <p>
     *            The name that is associated with the stack. The name must be
     *            unique in the Region in which you are creating the stack.
     *            </p>
     *            <note>
     *            <p>
     *            A stack name can contain only alphanumeric characters (case
     *            sensitive) and hyphens. It must start with an alphabetic
     *            character and cannot be longer than 128 characters.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte
     * and a maximum length of 51,200 bytes. For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the
     * <code>TemplateURL</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Structure containing the template body with a minimum length of 1
     *         byte and a maximum length of 51,200 bytes. For more information,
     *         go to <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *         >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *         </p>
     *         <p>
     *         Conditional: You must specify either the
     *         <code>TemplateBody</code> or the <code>TemplateURL</code>
     *         parameter, but not both.
     *         </p>
     */
    public String getTemplateBody() {
        return templateBody;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte
     * and a maximum length of 51,200 bytes. For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the
     * <code>TemplateURL</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody <p>
     *            Structure containing the template body with a minimum length
     *            of 1 byte and a maximum length of 51,200 bytes. For more
     *            information, go to <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *            </p>
     *            <p>
     *            Conditional: You must specify either the
     *            <code>TemplateBody</code> or the <code>TemplateURL</code>
     *            parameter, but not both.
     *            </p>
     */
    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte
     * and a maximum length of 51,200 bytes. For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the
     * <code>TemplateURL</code> parameter, but not both.
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
     *            of 1 byte and a maximum length of 51,200 bytes. For more
     *            information, go to <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *            </p>
     *            <p>
     *            Conditional: You must specify either the
     *            <code>TemplateBody</code> or the <code>TemplateURL</code>
     *            parameter, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackRequest withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a
     * template (max size: 460,800 bytes) that is located in an Amazon S3
     * bucket. For more information, go to the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the
     * <code>TemplateURL</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         Location of file containing the template body. The URL must point
     *         to a template (max size: 460,800 bytes) that is located in an
     *         Amazon S3 bucket. For more information, go to the <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *         >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *         </p>
     *         <p>
     *         Conditional: You must specify either the
     *         <code>TemplateBody</code> or the <code>TemplateURL</code>
     *         parameter, but not both.
     *         </p>
     */
    public String getTemplateURL() {
        return templateURL;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a
     * template (max size: 460,800 bytes) that is located in an Amazon S3
     * bucket. For more information, go to the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the
     * <code>TemplateURL</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL <p>
     *            Location of file containing the template body. The URL must
     *            point to a template (max size: 460,800 bytes) that is located
     *            in an Amazon S3 bucket. For more information, go to the <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *            </p>
     *            <p>
     *            Conditional: You must specify either the
     *            <code>TemplateBody</code> or the <code>TemplateURL</code>
     *            parameter, but not both.
     *            </p>
     */
    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a
     * template (max size: 460,800 bytes) that is located in an Amazon S3
     * bucket. For more information, go to the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     * >Template Anatomy</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the
     * <code>TemplateURL</code> parameter, but not both.
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
     *            point to a template (max size: 460,800 bytes) that is located
     *            in an Amazon S3 bucket. For more information, go to the <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html"
     *            >Template Anatomy</a> in the AWS CloudFormation User Guide.
     *            </p>
     *            <p>
     *            Conditional: You must specify either the
     *            <code>TemplateBody</code> or the <code>TemplateURL</code>
     *            parameter, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackRequest withTemplateURL(String templateURL) {
        this.templateURL = templateURL;
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
    public CreateStackRequest withParameters(Parameter... parameters) {
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
    public CreateStackRequest withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to disable rollback of the stack if stack
     * creation failed. You can specify either <code>DisableRollback</code> or
     * <code>OnFailure</code>, but not both.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to disable rollback of the stack if
     *         stack creation failed. You can specify either
     *         <code>DisableRollback</code> or <code>OnFailure</code>, but not
     *         both.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean isDisableRollback() {
        return disableRollback;
    }

    /**
     * <p>
     * Set to <code>true</code> to disable rollback of the stack if stack
     * creation failed. You can specify either <code>DisableRollback</code> or
     * <code>OnFailure</code>, but not both.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to disable rollback of the stack if
     *         stack creation failed. You can specify either
     *         <code>DisableRollback</code> or <code>OnFailure</code>, but not
     *         both.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     */
    public Boolean getDisableRollback() {
        return disableRollback;
    }

    /**
     * <p>
     * Set to <code>true</code> to disable rollback of the stack if stack
     * creation failed. You can specify either <code>DisableRollback</code> or
     * <code>OnFailure</code>, but not both.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     *
     * @param disableRollback <p>
     *            Set to <code>true</code> to disable rollback of the stack if
     *            stack creation failed. You can specify either
     *            <code>DisableRollback</code> or <code>OnFailure</code>, but
     *            not both.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     */
    public void setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
    }

    /**
     * <p>
     * Set to <code>true</code> to disable rollback of the stack if stack
     * creation failed. You can specify either <code>DisableRollback</code> or
     * <code>OnFailure</code>, but not both.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableRollback <p>
     *            Set to <code>true</code> to disable rollback of the stack if
     *            stack creation failed. You can specify either
     *            <code>DisableRollback</code> or <code>OnFailure</code>, but
     *            not both.
     *            </p>
     *            <p>
     *            Default: <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackRequest withDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
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
    public CreateStackRequest withRollbackConfiguration(RollbackConfiguration rollbackConfiguration) {
        this.rollbackConfiguration = rollbackConfiguration;
        return this;
    }

    /**
     * <p>
     * The amount of time that can pass before the stack status becomes
     * CREATE_FAILED; if <code>DisableRollback</code> is not set or is set to
     * <code>false</code>, the stack will be rolled back.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The amount of time that can pass before the stack status becomes
     *         CREATE_FAILED; if <code>DisableRollback</code> is not set or is
     *         set to <code>false</code>, the stack will be rolled back.
     *         </p>
     */
    public Integer getTimeoutInMinutes() {
        return timeoutInMinutes;
    }

    /**
     * <p>
     * The amount of time that can pass before the stack status becomes
     * CREATE_FAILED; if <code>DisableRollback</code> is not set or is set to
     * <code>false</code>, the stack will be rolled back.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeoutInMinutes <p>
     *            The amount of time that can pass before the stack status
     *            becomes CREATE_FAILED; if <code>DisableRollback</code> is not
     *            set or is set to <code>false</code>, the stack will be rolled
     *            back.
     *            </p>
     */
    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    /**
     * <p>
     * The amount of time that can pass before the stack status becomes
     * CREATE_FAILED; if <code>DisableRollback</code> is not set or is set to
     * <code>false</code>, the stack will be rolled back.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeoutInMinutes <p>
     *            The amount of time that can pass before the stack status
     *            becomes CREATE_FAILED; if <code>DisableRollback</code> is not
     *            set or is set to <code>false</code>, the stack will be rolled
     *            back.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackRequest withTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }

    /**
     * <p>
     * The Simple Notification Service (SNS) topic ARNs to publish stack related
     * events. You can find your SNS topic ARNs using the SNS console or your
     * Command Line Interface (CLI).
     * </p>
     *
     * @return <p>
     *         The Simple Notification Service (SNS) topic ARNs to publish stack
     *         related events. You can find your SNS topic ARNs using the SNS
     *         console or your Command Line Interface (CLI).
     *         </p>
     */
    public java.util.List<String> getNotificationARNs() {
        return notificationARNs;
    }

    /**
     * <p>
     * The Simple Notification Service (SNS) topic ARNs to publish stack related
     * events. You can find your SNS topic ARNs using the SNS console or your
     * Command Line Interface (CLI).
     * </p>
     *
     * @param notificationARNs <p>
     *            The Simple Notification Service (SNS) topic ARNs to publish
     *            stack related events. You can find your SNS topic ARNs using
     *            the SNS console or your Command Line Interface (CLI).
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
     * The Simple Notification Service (SNS) topic ARNs to publish stack related
     * events. You can find your SNS topic ARNs using the SNS console or your
     * Command Line Interface (CLI).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationARNs <p>
     *            The Simple Notification Service (SNS) topic ARNs to publish
     *            stack related events. You can find your SNS topic ARNs using
     *            the SNS console or your Command Line Interface (CLI).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackRequest withNotificationARNs(String... notificationARNs) {
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
     * The Simple Notification Service (SNS) topic ARNs to publish stack related
     * events. You can find your SNS topic ARNs using the SNS console or your
     * Command Line Interface (CLI).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationARNs <p>
     *            The Simple Notification Service (SNS) topic ARNs to publish
     *            stack related events. You can find your SNS topic ARNs using
     *            the SNS console or your Command Line Interface (CLI).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackRequest withNotificationARNs(java.util.Collection<String> notificationARNs) {
        setNotificationARNs(notificationARNs);
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
     * <p>
     * Change sets do not currently support nested stacks. If you want to create
     * a stack from a stack template that contains macros <i>and</i> nested
     * stacks, you must create the stack directly from the template using this
     * capability.
     * </p>
     * <important>
     * <p>
     * You should only create stacks directly from a stack template that
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
     *         <p>
     *         Change sets do not currently support nested stacks. If you want
     *         to create a stack from a stack template that contains macros
     *         <i>and</i> nested stacks, you must create the stack directly from
     *         the template using this capability.
     *         </p>
     *         <important>
     *         <p>
     *         You should only create stacks directly from a stack template that
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
     * <p>
     * Change sets do not currently support nested stacks. If you want to create
     * a stack from a stack template that contains macros <i>and</i> nested
     * stacks, you must create the stack directly from the template using this
     * capability.
     * </p>
     * <important>
     * <p>
     * You should only create stacks directly from a stack template that
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
     *            <p>
     *            Change sets do not currently support nested stacks. If you
     *            want to create a stack from a stack template that contains
     *            macros <i>and</i> nested stacks, you must create the stack
     *            directly from the template using this capability.
     *            </p>
     *            <important>
     *            <p>
     *            You should only create stacks directly from a stack template
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
     * <p>
     * Change sets do not currently support nested stacks. If you want to create
     * a stack from a stack template that contains macros <i>and</i> nested
     * stacks, you must create the stack directly from the template using this
     * capability.
     * </p>
     * <important>
     * <p>
     * You should only create stacks directly from a stack template that
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
     *            <p>
     *            Change sets do not currently support nested stacks. If you
     *            want to create a stack from a stack template that contains
     *            macros <i>and</i> nested stacks, you must create the stack
     *            directly from the template using this capability.
     *            </p>
     *            <important>
     *            <p>
     *            You should only create stacks directly from a stack template
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
    public CreateStackRequest withCapabilities(String... capabilities) {
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
     * <p>
     * Change sets do not currently support nested stacks. If you want to create
     * a stack from a stack template that contains macros <i>and</i> nested
     * stacks, you must create the stack directly from the template using this
     * capability.
     * </p>
     * <important>
     * <p>
     * You should only create stacks directly from a stack template that
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
     *            <p>
     *            Change sets do not currently support nested stacks. If you
     *            want to create a stack from a stack template that contains
     *            macros <i>and</i> nested stacks, you must create the stack
     *            directly from the template using this capability.
     *            </p>
     *            <important>
     *            <p>
     *            You should only create stacks directly from a stack template
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
    public CreateStackRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The template resource types that you have permissions to work with for
     * this create stack action, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>. Use
     * the following syntax to describe template resource types:
     * <code>AWS::*</code> (for all AWS resource), <code>Custom::*</code> (for
     * all custom resources), <code>Custom::<i>logical_ID</i> </code> (for a
     * specific custom resource), <code>AWS::<i>service_name</i>::*</code> (for
     * all resources of a particular AWS service), and
     * <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code> (for a
     * specific AWS resource).
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're
     * creating, the stack creation fails. By default, AWS CloudFormation grants
     * permissions to all resource types. AWS Identity and Access Management
     * (IAM) uses this parameter for AWS CloudFormation-specific condition keys
     * in IAM policies. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     * >Controlling Access with AWS Identity and Access Management</a>.
     * </p>
     *
     * @return <p>
     *         The template resource types that you have permissions to work
     *         with for this create stack action, such as
     *         <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or
     *         <code>Custom::MyCustomInstance</code>. Use the following syntax
     *         to describe template resource types: <code>AWS::*</code> (for all
     *         AWS resource), <code>Custom::*</code> (for all custom resources),
     *         <code>Custom::<i>logical_ID</i> </code> (for a specific custom
     *         resource), <code>AWS::<i>service_name</i>::*</code> (for all
     *         resources of a particular AWS service), and
     *         <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code>
     *         (for a specific AWS resource).
     *         </p>
     *         <p>
     *         If the list of resource types doesn't include a resource that
     *         you're creating, the stack creation fails. By default, AWS
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
     * this create stack action, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>. Use
     * the following syntax to describe template resource types:
     * <code>AWS::*</code> (for all AWS resource), <code>Custom::*</code> (for
     * all custom resources), <code>Custom::<i>logical_ID</i> </code> (for a
     * specific custom resource), <code>AWS::<i>service_name</i>::*</code> (for
     * all resources of a particular AWS service), and
     * <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code> (for a
     * specific AWS resource).
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're
     * creating, the stack creation fails. By default, AWS CloudFormation grants
     * permissions to all resource types. AWS Identity and Access Management
     * (IAM) uses this parameter for AWS CloudFormation-specific condition keys
     * in IAM policies. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html"
     * >Controlling Access with AWS Identity and Access Management</a>.
     * </p>
     *
     * @param resourceTypes <p>
     *            The template resource types that you have permissions to work
     *            with for this create stack action, such as
     *            <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or
     *            <code>Custom::MyCustomInstance</code>. Use the following
     *            syntax to describe template resource types:
     *            <code>AWS::*</code> (for all AWS resource),
     *            <code>Custom::*</code> (for all custom resources),
     *            <code>Custom::<i>logical_ID</i> </code> (for a specific custom
     *            resource), <code>AWS::<i>service_name</i>::*</code> (for all
     *            resources of a particular AWS service), and
     *            <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code>
     *            (for a specific AWS resource).
     *            </p>
     *            <p>
     *            If the list of resource types doesn't include a resource that
     *            you're creating, the stack creation fails. By default, AWS
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
     * this create stack action, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>. Use
     * the following syntax to describe template resource types:
     * <code>AWS::*</code> (for all AWS resource), <code>Custom::*</code> (for
     * all custom resources), <code>Custom::<i>logical_ID</i> </code> (for a
     * specific custom resource), <code>AWS::<i>service_name</i>::*</code> (for
     * all resources of a particular AWS service), and
     * <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code> (for a
     * specific AWS resource).
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're
     * creating, the stack creation fails. By default, AWS CloudFormation grants
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
     *            with for this create stack action, such as
     *            <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or
     *            <code>Custom::MyCustomInstance</code>. Use the following
     *            syntax to describe template resource types:
     *            <code>AWS::*</code> (for all AWS resource),
     *            <code>Custom::*</code> (for all custom resources),
     *            <code>Custom::<i>logical_ID</i> </code> (for a specific custom
     *            resource), <code>AWS::<i>service_name</i>::*</code> (for all
     *            resources of a particular AWS service), and
     *            <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code>
     *            (for a specific AWS resource).
     *            </p>
     *            <p>
     *            If the list of resource types doesn't include a resource that
     *            you're creating, the stack creation fails. By default, AWS
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
    public CreateStackRequest withResourceTypes(String... resourceTypes) {
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
     * this create stack action, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>. Use
     * the following syntax to describe template resource types:
     * <code>AWS::*</code> (for all AWS resource), <code>Custom::*</code> (for
     * all custom resources), <code>Custom::<i>logical_ID</i> </code> (for a
     * specific custom resource), <code>AWS::<i>service_name</i>::*</code> (for
     * all resources of a particular AWS service), and
     * <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code> (for a
     * specific AWS resource).
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're
     * creating, the stack creation fails. By default, AWS CloudFormation grants
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
     *            with for this create stack action, such as
     *            <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or
     *            <code>Custom::MyCustomInstance</code>. Use the following
     *            syntax to describe template resource types:
     *            <code>AWS::*</code> (for all AWS resource),
     *            <code>Custom::*</code> (for all custom resources),
     *            <code>Custom::<i>logical_ID</i> </code> (for a specific custom
     *            resource), <code>AWS::<i>service_name</i>::*</code> (for all
     *            resources of a particular AWS service), and
     *            <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code>
     *            (for a specific AWS resource).
     *            </p>
     *            <p>
     *            If the list of resource types doesn't include a resource that
     *            you're creating, the stack creation fails. By default, AWS
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
    public CreateStackRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management
     * (IAM) role that AWS CloudFormation assumes to create the stack. AWS
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
     *         Management (IAM) role that AWS CloudFormation assumes to create
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
     * (IAM) role that AWS CloudFormation assumes to create the stack. AWS
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
     *            create the stack. AWS CloudFormation uses the role's
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
     * (IAM) role that AWS CloudFormation assumes to create the stack. AWS
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
     *            create the stack. AWS CloudFormation uses the role's
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
    public CreateStackRequest withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * <p>
     * Determines what action will be taken if stack creation fails. This must
     * be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify either
     * <code>OnFailure</code> or <code>DisableRollback</code>, but not both.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOTHING, ROLLBACK, DELETE
     *
     * @return <p>
     *         Determines what action will be taken if stack creation fails.
     *         This must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can
     *         specify either <code>OnFailure</code> or
     *         <code>DisableRollback</code>, but not both.
     *         </p>
     *         <p>
     *         Default: <code>ROLLBACK</code>
     *         </p>
     * @see OnFailure
     */
    public String getOnFailure() {
        return onFailure;
    }

    /**
     * <p>
     * Determines what action will be taken if stack creation fails. This must
     * be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify either
     * <code>OnFailure</code> or <code>DisableRollback</code>, but not both.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOTHING, ROLLBACK, DELETE
     *
     * @param onFailure <p>
     *            Determines what action will be taken if stack creation fails.
     *            This must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can
     *            specify either <code>OnFailure</code> or
     *            <code>DisableRollback</code>, but not both.
     *            </p>
     *            <p>
     *            Default: <code>ROLLBACK</code>
     *            </p>
     * @see OnFailure
     */
    public void setOnFailure(String onFailure) {
        this.onFailure = onFailure;
    }

    /**
     * <p>
     * Determines what action will be taken if stack creation fails. This must
     * be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify either
     * <code>OnFailure</code> or <code>DisableRollback</code>, but not both.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOTHING, ROLLBACK, DELETE
     *
     * @param onFailure <p>
     *            Determines what action will be taken if stack creation fails.
     *            This must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can
     *            specify either <code>OnFailure</code> or
     *            <code>DisableRollback</code>, but not both.
     *            </p>
     *            <p>
     *            Default: <code>ROLLBACK</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OnFailure
     */
    public CreateStackRequest withOnFailure(String onFailure) {
        this.onFailure = onFailure;
        return this;
    }

    /**
     * <p>
     * Determines what action will be taken if stack creation fails. This must
     * be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify either
     * <code>OnFailure</code> or <code>DisableRollback</code>, but not both.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOTHING, ROLLBACK, DELETE
     *
     * @param onFailure <p>
     *            Determines what action will be taken if stack creation fails.
     *            This must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can
     *            specify either <code>OnFailure</code> or
     *            <code>DisableRollback</code>, but not both.
     *            </p>
     *            <p>
     *            Default: <code>ROLLBACK</code>
     *            </p>
     * @see OnFailure
     */
    public void setOnFailure(OnFailure onFailure) {
        this.onFailure = onFailure.toString();
    }

    /**
     * <p>
     * Determines what action will be taken if stack creation fails. This must
     * be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify either
     * <code>OnFailure</code> or <code>DisableRollback</code>, but not both.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOTHING, ROLLBACK, DELETE
     *
     * @param onFailure <p>
     *            Determines what action will be taken if stack creation fails.
     *            This must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can
     *            specify either <code>OnFailure</code> or
     *            <code>DisableRollback</code>, but not both.
     *            </p>
     *            <p>
     *            Default: <code>ROLLBACK</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OnFailure
     */
    public CreateStackRequest withOnFailure(OnFailure onFailure) {
        this.onFailure = onFailure.toString();
        return this;
    }

    /**
     * <p>
     * Structure containing the stack policy body. For more information, go to
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"
     * > Prevent Updates to Stack Resources</a> in the <i>AWS CloudFormation
     * User Guide</i>. You can specify either the <code>StackPolicyBody</code>
     * or the <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @return <p>
     *         Structure containing the stack policy body. For more information,
     *         go to <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"
     *         > Prevent Updates to Stack Resources</a> in the <i>AWS
     *         CloudFormation User Guide</i>. You can specify either the
     *         <code>StackPolicyBody</code> or the <code>StackPolicyURL</code>
     *         parameter, but not both.
     *         </p>
     */
    public String getStackPolicyBody() {
        return stackPolicyBody;
    }

    /**
     * <p>
     * Structure containing the stack policy body. For more information, go to
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"
     * > Prevent Updates to Stack Resources</a> in the <i>AWS CloudFormation
     * User Guide</i>. You can specify either the <code>StackPolicyBody</code>
     * or the <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param stackPolicyBody <p>
     *            Structure containing the stack policy body. For more
     *            information, go to <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"
     *            > Prevent Updates to Stack Resources</a> in the <i>AWS
     *            CloudFormation User Guide</i>. You can specify either the
     *            <code>StackPolicyBody</code> or the
     *            <code>StackPolicyURL</code> parameter, but not both.
     *            </p>
     */
    public void setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
    }

    /**
     * <p>
     * Structure containing the stack policy body. For more information, go to
     * <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"
     * > Prevent Updates to Stack Resources</a> in the <i>AWS CloudFormation
     * User Guide</i>. You can specify either the <code>StackPolicyBody</code>
     * or the <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param stackPolicyBody <p>
     *            Structure containing the stack policy body. For more
     *            information, go to <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"
     *            > Prevent Updates to Stack Resources</a> in the <i>AWS
     *            CloudFormation User Guide</i>. You can specify either the
     *            <code>StackPolicyBody</code> or the
     *            <code>StackPolicyURL</code> parameter, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackRequest withStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }

    /**
     * <p>
     * Location of a file containing the stack policy. The URL must point to a
     * policy (maximum size: 16 KB) located in an S3 bucket in the same Region
     * as the stack. You can specify either the <code>StackPolicyBody</code> or
     * the <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @return <p>
     *         Location of a file containing the stack policy. The URL must
     *         point to a policy (maximum size: 16 KB) located in an S3 bucket
     *         in the same Region as the stack. You can specify either the
     *         <code>StackPolicyBody</code> or the <code>StackPolicyURL</code>
     *         parameter, but not both.
     *         </p>
     */
    public String getStackPolicyURL() {
        return stackPolicyURL;
    }

    /**
     * <p>
     * Location of a file containing the stack policy. The URL must point to a
     * policy (maximum size: 16 KB) located in an S3 bucket in the same Region
     * as the stack. You can specify either the <code>StackPolicyBody</code> or
     * the <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param stackPolicyURL <p>
     *            Location of a file containing the stack policy. The URL must
     *            point to a policy (maximum size: 16 KB) located in an S3
     *            bucket in the same Region as the stack. You can specify either
     *            the <code>StackPolicyBody</code> or the
     *            <code>StackPolicyURL</code> parameter, but not both.
     *            </p>
     */
    public void setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
    }

    /**
     * <p>
     * Location of a file containing the stack policy. The URL must point to a
     * policy (maximum size: 16 KB) located in an S3 bucket in the same Region
     * as the stack. You can specify either the <code>StackPolicyBody</code> or
     * the <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param stackPolicyURL <p>
     *            Location of a file containing the stack policy. The URL must
     *            point to a policy (maximum size: 16 KB) located in an S3
     *            bucket in the same Region as the stack. You can specify either
     *            the <code>StackPolicyBody</code> or the
     *            <code>StackPolicyURL</code> parameter, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackRequest withStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }

    /**
     * <p>
     * Key-value pairs to associate with this stack. AWS CloudFormation also
     * propagates these tags to the resources created in the stack. A maximum
     * number of 50 tags can be specified.
     * </p>
     *
     * @return <p>
     *         Key-value pairs to associate with this stack. AWS CloudFormation
     *         also propagates these tags to the resources created in the stack.
     *         A maximum number of 50 tags can be specified.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs to associate with this stack. AWS CloudFormation also
     * propagates these tags to the resources created in the stack. A maximum
     * number of 50 tags can be specified.
     * </p>
     *
     * @param tags <p>
     *            Key-value pairs to associate with this stack. AWS
     *            CloudFormation also propagates these tags to the resources
     *            created in the stack. A maximum number of 50 tags can be
     *            specified.
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
     * propagates these tags to the resources created in the stack. A maximum
     * number of 50 tags can be specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Key-value pairs to associate with this stack. AWS
     *            CloudFormation also propagates these tags to the resources
     *            created in the stack. A maximum number of 50 tags can be
     *            specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackRequest withTags(Tag... tags) {
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
     * propagates these tags to the resources created in the stack. A maximum
     * number of 50 tags can be specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Key-value pairs to associate with this stack. AWS
     *            CloudFormation also propagates these tags to the resources
     *            created in the stack. A maximum number of 50 tags can be
     *            specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A unique identifier for this <code>CreateStack</code> request. Specify
     * this token if you plan to retry requests so that AWS CloudFormation knows
     * that you're not attempting to create a stack with the same name. You
     * might retry <code>CreateStack</code> requests to ensure that AWS
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
     *         A unique identifier for this <code>CreateStack</code> request.
     *         Specify this token if you plan to retry requests so that AWS
     *         CloudFormation knows that you're not attempting to create a stack
     *         with the same name. You might retry <code>CreateStack</code>
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
     * A unique identifier for this <code>CreateStack</code> request. Specify
     * this token if you plan to retry requests so that AWS CloudFormation knows
     * that you're not attempting to create a stack with the same name. You
     * might retry <code>CreateStack</code> requests to ensure that AWS
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
     *            A unique identifier for this <code>CreateStack</code> request.
     *            Specify this token if you plan to retry requests so that AWS
     *            CloudFormation knows that you're not attempting to create a
     *            stack with the same name. You might retry
     *            <code>CreateStack</code> requests to ensure that AWS
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
     * A unique identifier for this <code>CreateStack</code> request. Specify
     * this token if you plan to retry requests so that AWS CloudFormation knows
     * that you're not attempting to create a stack with the same name. You
     * might retry <code>CreateStack</code> requests to ensure that AWS
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
     *            A unique identifier for this <code>CreateStack</code> request.
     *            Specify this token if you plan to retry requests so that AWS
     *            CloudFormation knows that you're not attempting to create a
     *            stack with the same name. You might retry
     *            <code>CreateStack</code> requests to ensure that AWS
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
    public CreateStackRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * Whether to enable termination protection on the specified stack. If a
     * user attempts to delete a stack with termination protection enabled, the
     * operation fails and the stack remains unchanged. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     * >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation
     * User Guide</i>. Termination protection is disabled on stacks by default.
     * </p>
     * <p>
     * For <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >nested stacks</a>, termination protection is set on the root stack and
     * cannot be changed directly on the nested stack.
     * </p>
     *
     * @return <p>
     *         Whether to enable termination protection on the specified stack.
     *         If a user attempts to delete a stack with termination protection
     *         enabled, the operation fails and the stack remains unchanged. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     *         >Protecting a Stack From Being Deleted</a> in the <i>AWS
     *         CloudFormation User Guide</i>. Termination protection is disabled
     *         on stacks by default.
     *         </p>
     *         <p>
     *         For <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *         >nested stacks</a>, termination protection is set on the root
     *         stack and cannot be changed directly on the nested stack.
     *         </p>
     */
    public Boolean isEnableTerminationProtection() {
        return enableTerminationProtection;
    }

    /**
     * <p>
     * Whether to enable termination protection on the specified stack. If a
     * user attempts to delete a stack with termination protection enabled, the
     * operation fails and the stack remains unchanged. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     * >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation
     * User Guide</i>. Termination protection is disabled on stacks by default.
     * </p>
     * <p>
     * For <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >nested stacks</a>, termination protection is set on the root stack and
     * cannot be changed directly on the nested stack.
     * </p>
     *
     * @return <p>
     *         Whether to enable termination protection on the specified stack.
     *         If a user attempts to delete a stack with termination protection
     *         enabled, the operation fails and the stack remains unchanged. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     *         >Protecting a Stack From Being Deleted</a> in the <i>AWS
     *         CloudFormation User Guide</i>. Termination protection is disabled
     *         on stacks by default.
     *         </p>
     *         <p>
     *         For <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *         >nested stacks</a>, termination protection is set on the root
     *         stack and cannot be changed directly on the nested stack.
     *         </p>
     */
    public Boolean getEnableTerminationProtection() {
        return enableTerminationProtection;
    }

    /**
     * <p>
     * Whether to enable termination protection on the specified stack. If a
     * user attempts to delete a stack with termination protection enabled, the
     * operation fails and the stack remains unchanged. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     * >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation
     * User Guide</i>. Termination protection is disabled on stacks by default.
     * </p>
     * <p>
     * For <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >nested stacks</a>, termination protection is set on the root stack and
     * cannot be changed directly on the nested stack.
     * </p>
     *
     * @param enableTerminationProtection <p>
     *            Whether to enable termination protection on the specified
     *            stack. If a user attempts to delete a stack with termination
     *            protection enabled, the operation fails and the stack remains
     *            unchanged. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     *            >Protecting a Stack From Being Deleted</a> in the <i>AWS
     *            CloudFormation User Guide</i>. Termination protection is
     *            disabled on stacks by default.
     *            </p>
     *            <p>
     *            For <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *            >nested stacks</a>, termination protection is set on the root
     *            stack and cannot be changed directly on the nested stack.
     *            </p>
     */
    public void setEnableTerminationProtection(Boolean enableTerminationProtection) {
        this.enableTerminationProtection = enableTerminationProtection;
    }

    /**
     * <p>
     * Whether to enable termination protection on the specified stack. If a
     * user attempts to delete a stack with termination protection enabled, the
     * operation fails and the stack remains unchanged. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     * >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation
     * User Guide</i>. Termination protection is disabled on stacks by default.
     * </p>
     * <p>
     * For <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     * >nested stacks</a>, termination protection is set on the root stack and
     * cannot be changed directly on the nested stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableTerminationProtection <p>
     *            Whether to enable termination protection on the specified
     *            stack. If a user attempts to delete a stack with termination
     *            protection enabled, the operation fails and the stack remains
     *            unchanged. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     *            >Protecting a Stack From Being Deleted</a> in the <i>AWS
     *            CloudFormation User Guide</i>. Termination protection is
     *            disabled on stacks by default.
     *            </p>
     *            <p>
     *            For <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html"
     *            >nested stacks</a>, termination protection is set on the root
     *            stack and cannot be changed directly on the nested stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStackRequest withEnableTerminationProtection(Boolean enableTerminationProtection) {
        this.enableTerminationProtection = enableTerminationProtection;
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
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getDisableRollback() != null)
            sb.append("DisableRollback: " + getDisableRollback() + ",");
        if (getRollbackConfiguration() != null)
            sb.append("RollbackConfiguration: " + getRollbackConfiguration() + ",");
        if (getTimeoutInMinutes() != null)
            sb.append("TimeoutInMinutes: " + getTimeoutInMinutes() + ",");
        if (getNotificationARNs() != null)
            sb.append("NotificationARNs: " + getNotificationARNs() + ",");
        if (getCapabilities() != null)
            sb.append("Capabilities: " + getCapabilities() + ",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: " + getResourceTypes() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getOnFailure() != null)
            sb.append("OnFailure: " + getOnFailure() + ",");
        if (getStackPolicyBody() != null)
            sb.append("StackPolicyBody: " + getStackPolicyBody() + ",");
        if (getStackPolicyURL() != null)
            sb.append("StackPolicyURL: " + getStackPolicyURL() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getEnableTerminationProtection() != null)
            sb.append("EnableTerminationProtection: " + getEnableTerminationProtection());
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
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getDisableRollback() == null) ? 0 : getDisableRollback().hashCode());
        hashCode = prime
                * hashCode
                + ((getRollbackConfiguration() == null) ? 0 : getRollbackConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationARNs() == null) ? 0 : getNotificationARNs().hashCode());
        hashCode = prime * hashCode
                + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode
                + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getOnFailure() == null) ? 0 : getOnFailure().hashCode());
        hashCode = prime * hashCode
                + ((getStackPolicyBody() == null) ? 0 : getStackPolicyBody().hashCode());
        hashCode = prime * hashCode
                + ((getStackPolicyURL() == null) ? 0 : getStackPolicyURL().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableTerminationProtection() == null) ? 0
                        : getEnableTerminationProtection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStackRequest == false)
            return false;
        CreateStackRequest other = (CreateStackRequest) obj;

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
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getDisableRollback() == null ^ this.getDisableRollback() == null)
            return false;
        if (other.getDisableRollback() != null
                && other.getDisableRollback().equals(this.getDisableRollback()) == false)
            return false;
        if (other.getRollbackConfiguration() == null ^ this.getRollbackConfiguration() == null)
            return false;
        if (other.getRollbackConfiguration() != null
                && other.getRollbackConfiguration().equals(this.getRollbackConfiguration()) == false)
            return false;
        if (other.getTimeoutInMinutes() == null ^ this.getTimeoutInMinutes() == null)
            return false;
        if (other.getTimeoutInMinutes() != null
                && other.getTimeoutInMinutes().equals(this.getTimeoutInMinutes()) == false)
            return false;
        if (other.getNotificationARNs() == null ^ this.getNotificationARNs() == null)
            return false;
        if (other.getNotificationARNs() != null
                && other.getNotificationARNs().equals(this.getNotificationARNs()) == false)
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
        if (other.getOnFailure() == null ^ this.getOnFailure() == null)
            return false;
        if (other.getOnFailure() != null
                && other.getOnFailure().equals(this.getOnFailure()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getEnableTerminationProtection() == null
                ^ this.getEnableTerminationProtection() == null)
            return false;
        if (other.getEnableTerminationProtection() != null
                && other.getEnableTerminationProtection().equals(
                        this.getEnableTerminationProtection()) == false)
            return false;
        return true;
    }
}
