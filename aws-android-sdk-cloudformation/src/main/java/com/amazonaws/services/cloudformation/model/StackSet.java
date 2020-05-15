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

/**
 * <p>
 * A structure that contains information about a stack set. A stack set enables
 * you to provision stacks into AWS accounts and across Regions by using a
 * single CloudFormation template. In the stack set, you specify the template to
 * use, as well as any parameters and capabilities that the template requires.
 * </p>
 */
public class StackSet implements Serializable {
    /**
     * <p>
     * The name that's associated with the stack set.
     * </p>
     */
    private String stackSetName;

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     */
    private String stackSetId;

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is
     * created or updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     */
    private String status;

    /**
     * <p>
     * The structure that contains the body of the template that was used to
     * create or update the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String templateBody;

    /**
     * <p>
     * A list of input parameters for a stack set.
     * </p>
     */
    private java.util.List<Parameter> parameters;

    /**
     * <p>
     * The capabilities that are allowed in the stack set. Some stack set
     * templates might include resources that can affect permissions in your AWS
     * account—for example, by creating new AWS Identity and Access Management
     * (IAM) users. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     */
    private java.util.List<String> capabilities;

    /**
     * <p>
     * A list of tags that specify information about the stack set. A maximum
     * number of 50 tags can be specified.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the stack set.
     * </p>
     */
    private String stackSetARN;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role used to create or update
     * the stack set.
     * </p>
     * <p>
     * Use customized administrator roles to control which users or groups can
     * manage specific stack sets within the same administrator account. For
     * more information, see <a href=
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
     * The name of the IAM execution role used to create or update the stack
     * set.
     * </p>
     * <p>
     * Use customized execution roles to control which stack resources users and
     * groups can include in their stack sets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z_0-9+=,.@-]+<br/>
     */
    private String executionRoleName;

    /**
     * <p>
     * Detailed information about the drift status of the stack set.
     * </p>
     * <p>
     * For stack sets, contains information about the last <i>completed</i>
     * drift operation performed on the stack set. Information about drift
     * operations currently in progress is not included.
     * </p>
     */
    private StackSetDriftDetectionDetails stackSetDriftDetectionDetails;

    /**
     * <p>
     * [<code>Service-managed</code> permissions] Describes whether StackSets
     * automatically deploys to AWS Organizations accounts that are added to a
     * target organization or organizational unit (OU).
     * </p>
     */
    private AutoDeployment autoDeployment;

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created.
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
     * Reserved for internal use. No data returned.
     * </p>
     */
    private java.util.List<String> organizationalUnitIds;

    /**
     * <p>
     * The name that's associated with the stack set.
     * </p>
     *
     * @return <p>
     *         The name that's associated with the stack set.
     *         </p>
     */
    public String getStackSetName() {
        return stackSetName;
    }

    /**
     * <p>
     * The name that's associated with the stack set.
     * </p>
     *
     * @param stackSetName <p>
     *            The name that's associated with the stack set.
     *            </p>
     */
    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name that's associated with the stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetName <p>
     *            The name that's associated with the stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
        return this;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     *
     * @return <p>
     *         The ID of the stack set.
     *         </p>
     */
    public String getStackSetId() {
        return stackSetId;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     *
     * @param stackSetId <p>
     *            The ID of the stack set.
     *            </p>
     */
    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetId <p>
     *            The ID of the stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
        return this;
    }

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is
     * created or updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A description of the stack set that you specify when the stack
     *         set is created or updated.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is
     * created or updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A description of the stack set that you specify when the stack
     *            set is created or updated.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is
     * created or updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A description of the stack set that you specify when the stack
     *            set is created or updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     *
     * @return <p>
     *         The status of the stack set.
     *         </p>
     * @see StackSetStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     *
     * @param status <p>
     *            The status of the stack set.
     *            </p>
     * @see StackSetStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     *
     * @param status <p>
     *            The status of the stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetStatus
     */
    public StackSet withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     *
     * @param status <p>
     *            The status of the stack set.
     *            </p>
     * @see StackSetStatus
     */
    public void setStatus(StackSetStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, DELETED
     *
     * @param status <p>
     *            The status of the stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetStatus
     */
    public StackSet withStatus(StackSetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The structure that contains the body of the template that was used to
     * create or update the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The structure that contains the body of the template that was
     *         used to create or update the stack set.
     *         </p>
     */
    public String getTemplateBody() {
        return templateBody;
    }

    /**
     * <p>
     * The structure that contains the body of the template that was used to
     * create or update the stack set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody <p>
     *            The structure that contains the body of the template that was
     *            used to create or update the stack set.
     *            </p>
     */
    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The structure that contains the body of the template that was used to
     * create or update the stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody <p>
     *            The structure that contains the body of the template that was
     *            used to create or update the stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * <p>
     * A list of input parameters for a stack set.
     * </p>
     *
     * @return <p>
     *         A list of input parameters for a stack set.
     *         </p>
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A list of input parameters for a stack set.
     * </p>
     *
     * @param parameters <p>
     *            A list of input parameters for a stack set.
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
     * A list of input parameters for a stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of input parameters for a stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withParameters(Parameter... parameters) {
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
     * A list of input parameters for a stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A list of input parameters for a stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The capabilities that are allowed in the stack set. Some stack set
     * templates might include resources that can affect permissions in your AWS
     * account—for example, by creating new AWS Identity and Access Management
     * (IAM) users. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     *
     * @return <p>
     *         The capabilities that are allowed in the stack set. Some stack
     *         set templates might include resources that can affect permissions
     *         in your AWS account—for example, by creating new AWS Identity and
     *         Access Management (IAM) users. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *         >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     *         </p>
     */
    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * The capabilities that are allowed in the stack set. Some stack set
     * templates might include resources that can affect permissions in your AWS
     * account—for example, by creating new AWS Identity and Access Management
     * (IAM) users. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     *
     * @param capabilities <p>
     *            The capabilities that are allowed in the stack set. Some stack
     *            set templates might include resources that can affect
     *            permissions in your AWS account—for example, by creating new
     *            AWS Identity and Access Management (IAM) users. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *            >Acknowledging IAM Resources in AWS CloudFormation
     *            Templates.</a>
     *            </p>
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
     * The capabilities that are allowed in the stack set. Some stack set
     * templates might include resources that can affect permissions in your AWS
     * account—for example, by creating new AWS Identity and Access Management
     * (IAM) users. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            The capabilities that are allowed in the stack set. Some stack
     *            set templates might include resources that can affect
     *            permissions in your AWS account—for example, by creating new
     *            AWS Identity and Access Management (IAM) users. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *            >Acknowledging IAM Resources in AWS CloudFormation
     *            Templates.</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withCapabilities(String... capabilities) {
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
     * The capabilities that are allowed in the stack set. Some stack set
     * templates might include resources that can affect permissions in your AWS
     * account—for example, by creating new AWS Identity and Access Management
     * (IAM) users. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capabilities <p>
     *            The capabilities that are allowed in the stack set. Some stack
     *            set templates might include resources that can affect
     *            permissions in your AWS account—for example, by creating new
     *            AWS Identity and Access Management (IAM) users. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *            >Acknowledging IAM Resources in AWS CloudFormation
     *            Templates.</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * A list of tags that specify information about the stack set. A maximum
     * number of 50 tags can be specified.
     * </p>
     *
     * @return <p>
     *         A list of tags that specify information about the stack set. A
     *         maximum number of 50 tags can be specified.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags that specify information about the stack set. A maximum
     * number of 50 tags can be specified.
     * </p>
     *
     * @param tags <p>
     *            A list of tags that specify information about the stack set. A
     *            maximum number of 50 tags can be specified.
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
     * A list of tags that specify information about the stack set. A maximum
     * number of 50 tags can be specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags that specify information about the stack set. A
     *            maximum number of 50 tags can be specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withTags(Tag... tags) {
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
     * A list of tags that specify information about the stack set. A maximum
     * number of 50 tags can be specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags that specify information about the stack set. A
     *            maximum number of 50 tags can be specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the stack set.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of the stack set.
     *         </p>
     */
    public String getStackSetARN() {
        return stackSetARN;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the stack set.
     * </p>
     *
     * @param stackSetARN <p>
     *            The Amazon Resource Number (ARN) of the stack set.
     *            </p>
     */
    public void setStackSetARN(String stackSetARN) {
        this.stackSetARN = stackSetARN;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the stack set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetARN <p>
     *            The Amazon Resource Number (ARN) of the stack set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withStackSetARN(String stackSetARN) {
        this.stackSetARN = stackSetARN;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role used to create or update
     * the stack set.
     * </p>
     * <p>
     * Use customized administrator roles to control which users or groups can
     * manage specific stack sets within the same administrator account. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     * >Prerequisites: Granting Permissions for Stack Set Operations</a> in the
     * <i>AWS CloudFormation User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Number (ARN) of the IAM role used to create
     *         or update the stack set.
     *         </p>
     *         <p>
     *         Use customized administrator roles to control which users or
     *         groups can manage specific stack sets within the same
     *         administrator account. For more information, see <a href=
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
     * The Amazon Resource Number (ARN) of the IAM role used to create or update
     * the stack set.
     * </p>
     * <p>
     * Use customized administrator roles to control which users or groups can
     * manage specific stack sets within the same administrator account. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     * >Prerequisites: Granting Permissions for Stack Set Operations</a> in the
     * <i>AWS CloudFormation User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param administrationRoleARN <p>
     *            The Amazon Resource Number (ARN) of the IAM role used to
     *            create or update the stack set.
     *            </p>
     *            <p>
     *            Use customized administrator roles to control which users or
     *            groups can manage specific stack sets within the same
     *            administrator account. For more information, see <a href=
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
     * The Amazon Resource Number (ARN) of the IAM role used to create or update
     * the stack set.
     * </p>
     * <p>
     * Use customized administrator roles to control which users or groups can
     * manage specific stack sets within the same administrator account. For
     * more information, see <a href=
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
     *            The Amazon Resource Number (ARN) of the IAM role used to
     *            create or update the stack set.
     *            </p>
     *            <p>
     *            Use customized administrator roles to control which users or
     *            groups can manage specific stack sets within the same
     *            administrator account. For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     *            >Prerequisites: Granting Permissions for Stack Set
     *            Operations</a> in the <i>AWS CloudFormation User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withAdministrationRoleARN(String administrationRoleARN) {
        this.administrationRoleARN = administrationRoleARN;
        return this;
    }

    /**
     * <p>
     * The name of the IAM execution role used to create or update the stack
     * set.
     * </p>
     * <p>
     * Use customized execution roles to control which stack resources users and
     * groups can include in their stack sets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z_0-9+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the IAM execution role used to create or update the
     *         stack set.
     *         </p>
     *         <p>
     *         Use customized execution roles to control which stack resources
     *         users and groups can include in their stack sets.
     *         </p>
     */
    public String getExecutionRoleName() {
        return executionRoleName;
    }

    /**
     * <p>
     * The name of the IAM execution role used to create or update the stack
     * set.
     * </p>
     * <p>
     * Use customized execution roles to control which stack resources users and
     * groups can include in their stack sets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z_0-9+=,.@-]+<br/>
     *
     * @param executionRoleName <p>
     *            The name of the IAM execution role used to create or update
     *            the stack set.
     *            </p>
     *            <p>
     *            Use customized execution roles to control which stack
     *            resources users and groups can include in their stack sets.
     *            </p>
     */
    public void setExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
    }

    /**
     * <p>
     * The name of the IAM execution role used to create or update the stack
     * set.
     * </p>
     * <p>
     * Use customized execution roles to control which stack resources users and
     * groups can include in their stack sets.
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
     *            The name of the IAM execution role used to create or update
     *            the stack set.
     *            </p>
     *            <p>
     *            Use customized execution roles to control which stack
     *            resources users and groups can include in their stack sets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
        return this;
    }

    /**
     * <p>
     * Detailed information about the drift status of the stack set.
     * </p>
     * <p>
     * For stack sets, contains information about the last <i>completed</i>
     * drift operation performed on the stack set. Information about drift
     * operations currently in progress is not included.
     * </p>
     *
     * @return <p>
     *         Detailed information about the drift status of the stack set.
     *         </p>
     *         <p>
     *         For stack sets, contains information about the last
     *         <i>completed</i> drift operation performed on the stack set.
     *         Information about drift operations currently in progress is not
     *         included.
     *         </p>
     */
    public StackSetDriftDetectionDetails getStackSetDriftDetectionDetails() {
        return stackSetDriftDetectionDetails;
    }

    /**
     * <p>
     * Detailed information about the drift status of the stack set.
     * </p>
     * <p>
     * For stack sets, contains information about the last <i>completed</i>
     * drift operation performed on the stack set. Information about drift
     * operations currently in progress is not included.
     * </p>
     *
     * @param stackSetDriftDetectionDetails <p>
     *            Detailed information about the drift status of the stack set.
     *            </p>
     *            <p>
     *            For stack sets, contains information about the last
     *            <i>completed</i> drift operation performed on the stack set.
     *            Information about drift operations currently in progress is
     *            not included.
     *            </p>
     */
    public void setStackSetDriftDetectionDetails(
            StackSetDriftDetectionDetails stackSetDriftDetectionDetails) {
        this.stackSetDriftDetectionDetails = stackSetDriftDetectionDetails;
    }

    /**
     * <p>
     * Detailed information about the drift status of the stack set.
     * </p>
     * <p>
     * For stack sets, contains information about the last <i>completed</i>
     * drift operation performed on the stack set. Information about drift
     * operations currently in progress is not included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetDriftDetectionDetails <p>
     *            Detailed information about the drift status of the stack set.
     *            </p>
     *            <p>
     *            For stack sets, contains information about the last
     *            <i>completed</i> drift operation performed on the stack set.
     *            Information about drift operations currently in progress is
     *            not included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withStackSetDriftDetectionDetails(
            StackSetDriftDetectionDetails stackSetDriftDetectionDetails) {
        this.stackSetDriftDetectionDetails = stackSetDriftDetectionDetails;
        return this;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] Describes whether StackSets
     * automatically deploys to AWS Organizations accounts that are added to a
     * target organization or organizational unit (OU).
     * </p>
     *
     * @return <p>
     *         [<code>Service-managed</code> permissions] Describes whether
     *         StackSets automatically deploys to AWS Organizations accounts
     *         that are added to a target organization or organizational unit
     *         (OU).
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
     *
     * @param autoDeployment <p>
     *            [<code>Service-managed</code> permissions] Describes whether
     *            StackSets automatically deploys to AWS Organizations accounts
     *            that are added to a target organization or organizational unit
     *            (OU).
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoDeployment <p>
     *            [<code>Service-managed</code> permissions] Describes whether
     *            StackSets automatically deploys to AWS Organizations accounts
     *            that are added to a target organization or organizational unit
     *            (OU).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withAutoDeployment(AutoDeployment autoDeployment) {
        this.autoDeployment = autoDeployment;
        return this;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created.
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
     *         created.
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
     * created.
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
     *            are created.
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
     * created.
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
     *            are created.
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
    public StackSet withPermissionModel(String permissionModel) {
        this.permissionModel = permissionModel;
        return this;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are
     * created.
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
     *            are created.
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
     * created.
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
     *            are created.
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
    public StackSet withPermissionModel(PermissionModels permissionModel) {
        this.permissionModel = permissionModel.toString();
        return this;
    }

    /**
     * <p>
     * Reserved for internal use. No data returned.
     * </p>
     *
     * @return <p>
     *         Reserved for internal use. No data returned.
     *         </p>
     */
    public java.util.List<String> getOrganizationalUnitIds() {
        return organizationalUnitIds;
    }

    /**
     * <p>
     * Reserved for internal use. No data returned.
     * </p>
     *
     * @param organizationalUnitIds <p>
     *            Reserved for internal use. No data returned.
     *            </p>
     */
    public void setOrganizationalUnitIds(java.util.Collection<String> organizationalUnitIds) {
        if (organizationalUnitIds == null) {
            this.organizationalUnitIds = null;
            return;
        }

        this.organizationalUnitIds = new java.util.ArrayList<String>(organizationalUnitIds);
    }

    /**
     * <p>
     * Reserved for internal use. No data returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organizationalUnitIds <p>
     *            Reserved for internal use. No data returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withOrganizationalUnitIds(String... organizationalUnitIds) {
        if (getOrganizationalUnitIds() == null) {
            this.organizationalUnitIds = new java.util.ArrayList<String>(
                    organizationalUnitIds.length);
        }
        for (String value : organizationalUnitIds) {
            this.organizationalUnitIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Reserved for internal use. No data returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organizationalUnitIds <p>
     *            Reserved for internal use. No data returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSet withOrganizationalUnitIds(java.util.Collection<String> organizationalUnitIds) {
        setOrganizationalUnitIds(organizationalUnitIds);
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
        if (getStackSetId() != null)
            sb.append("StackSetId: " + getStackSetId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: " + getTemplateBody() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getCapabilities() != null)
            sb.append("Capabilities: " + getCapabilities() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getStackSetARN() != null)
            sb.append("StackSetARN: " + getStackSetARN() + ",");
        if (getAdministrationRoleARN() != null)
            sb.append("AdministrationRoleARN: " + getAdministrationRoleARN() + ",");
        if (getExecutionRoleName() != null)
            sb.append("ExecutionRoleName: " + getExecutionRoleName() + ",");
        if (getStackSetDriftDetectionDetails() != null)
            sb.append("StackSetDriftDetectionDetails: " + getStackSetDriftDetectionDetails() + ",");
        if (getAutoDeployment() != null)
            sb.append("AutoDeployment: " + getAutoDeployment() + ",");
        if (getPermissionModel() != null)
            sb.append("PermissionModel: " + getPermissionModel() + ",");
        if (getOrganizationalUnitIds() != null)
            sb.append("OrganizationalUnitIds: " + getOrganizationalUnitIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getStackSetId() == null) ? 0 : getStackSetId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getStackSetARN() == null) ? 0 : getStackSetARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdministrationRoleARN() == null) ? 0 : getAdministrationRoleARN().hashCode());
        hashCode = prime * hashCode
                + ((getExecutionRoleName() == null) ? 0 : getExecutionRoleName().hashCode());
        hashCode = prime
                * hashCode
                + ((getStackSetDriftDetectionDetails() == null) ? 0
                        : getStackSetDriftDetectionDetails().hashCode());
        hashCode = prime * hashCode
                + ((getAutoDeployment() == null) ? 0 : getAutoDeployment().hashCode());
        hashCode = prime * hashCode
                + ((getPermissionModel() == null) ? 0 : getPermissionModel().hashCode());
        hashCode = prime
                * hashCode
                + ((getOrganizationalUnitIds() == null) ? 0 : getOrganizationalUnitIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSet == false)
            return false;
        StackSet other = (StackSet) obj;

        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null
                && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getStackSetId() == null ^ this.getStackSetId() == null)
            return false;
        if (other.getStackSetId() != null
                && other.getStackSetId().equals(this.getStackSetId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null
                && other.getTemplateBody().equals(this.getTemplateBody()) == false)
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
        if (other.getStackSetARN() == null ^ this.getStackSetARN() == null)
            return false;
        if (other.getStackSetARN() != null
                && other.getStackSetARN().equals(this.getStackSetARN()) == false)
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
        if (other.getStackSetDriftDetectionDetails() == null
                ^ this.getStackSetDriftDetectionDetails() == null)
            return false;
        if (other.getStackSetDriftDetectionDetails() != null
                && other.getStackSetDriftDetectionDetails().equals(
                        this.getStackSetDriftDetectionDetails()) == false)
            return false;
        if (other.getAutoDeployment() == null ^ this.getAutoDeployment() == null)
            return false;
        if (other.getAutoDeployment() != null
                && other.getAutoDeployment().equals(this.getAutoDeployment()) == false)
            return false;
        if (other.getPermissionModel() == null ^ this.getPermissionModel() == null)
            return false;
        if (other.getPermissionModel() != null
                && other.getPermissionModel().equals(this.getPermissionModel()) == false)
            return false;
        if (other.getOrganizationalUnitIds() == null ^ this.getOrganizationalUnitIds() == null)
            return false;
        if (other.getOrganizationalUnitIds() != null
                && other.getOrganizationalUnitIds().equals(this.getOrganizationalUnitIds()) == false)
            return false;
        return true;
    }
}
