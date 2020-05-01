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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Generates an activation code and activation ID you can use to register your
 * on-premises server or virtual machine (VM) with Systems Manager. Registering
 * these machines with Systems Manager makes it possible to manage them using
 * Systems Manager capabilities. You use the activation code and ID when
 * installing SSM Agent on machines in your hybrid environment. For more
 * information about requirements for managing on-premises instances and VMs
 * using Systems Manager, see <a href=
 * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-managedinstances.html"
 * >Setting up AWS Systems Manager for hybrid environments</a> in the <i>AWS
 * Systems Manager User Guide</i>.
 * </p>
 * <note>
 * <p>
 * On-premises servers or VMs that are registered with Systems Manager and EC2
 * instances that you manage with Systems Manager are all called <i>managed
 * instances</i>.
 * </p>
 * </note>
 */
public class CreateActivationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A user-defined description of the resource that you want to register with
     * Systems Manager.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String description;

    /**
     * <p>
     * The name of the registered, managed instance as it will appear in the
     * Systems Manager console or when you use the AWS command line tools to
     * list Systems Manager resources.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String defaultInstanceName;

    /**
     * <p>
     * The Amazon Identity and Access Management (IAM) role that you want to
     * assign to the managed instance. This IAM role must provide AssumeRole
     * permissions for the Systems Manager service principal
     * <code>ssm.amazonaws.com</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-service-role.html"
     * >Create an IAM service role for a hybrid environment</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String iamRole;

    /**
     * <p>
     * Specify the maximum number of managed instances you want to register. The
     * default value is 1 instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer registrationLimit;

    /**
     * <p>
     * The date by which this activation request should expire. The default
     * value is 24 hours.
     * </p>
     */
    private java.util.Date expirationDate;

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag an activation to identify
     * which servers or virtual machines (VMs) in your on-premises environment
     * you intend to activate. In this case, you could specify the following key
     * name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * When you install SSM Agent on your on-premises servers and VMs, you
     * specify an activation ID and code. When you specify the activation ID and
     * code, tags assigned to the activation are automatically applied to the
     * on-premises servers or VMs.
     * </p>
     * </important>
     * <p>
     * You can't add tags to or delete tags from an existing activation. You can
     * tag your on-premises servers and VMs after they connect to Systems
     * Manager for the first time and are assigned a managed instance ID. This
     * means they are listed in the AWS Systems Manager console with an ID that
     * is prefixed with "mi-". For information about how to add tags to your
     * managed instances, see <a>AddTagsToResource</a>. For information about
     * how to remove tags from your managed instances, see
     * <a>RemoveTagsFromResource</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A user-defined description of the resource that you want to register with
     * Systems Manager.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return <p>
     *         A user-defined description of the resource that you want to
     *         register with Systems Manager.
     *         </p>
     *         <important>
     *         <p>
     *         Do not enter personally identifiable information in this field.
     *         </p>
     *         </important>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A user-defined description of the resource that you want to register with
     * Systems Manager.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description <p>
     *            A user-defined description of the resource that you want to
     *            register with Systems Manager.
     *            </p>
     *            <important>
     *            <p>
     *            Do not enter personally identifiable information in this
     *            field.
     *            </p>
     *            </important>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-defined description of the resource that you want to register with
     * Systems Manager.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description <p>
     *            A user-defined description of the resource that you want to
     *            register with Systems Manager.
     *            </p>
     *            <important>
     *            <p>
     *            Do not enter personally identifiable information in this
     *            field.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateActivationRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The name of the registered, managed instance as it will appear in the
     * Systems Manager console or when you use the AWS command line tools to
     * list Systems Manager resources.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         The name of the registered, managed instance as it will appear in
     *         the Systems Manager console or when you use the AWS command line
     *         tools to list Systems Manager resources.
     *         </p>
     *         <important>
     *         <p>
     *         Do not enter personally identifiable information in this field.
     *         </p>
     *         </important>
     */
    public String getDefaultInstanceName() {
        return defaultInstanceName;
    }

    /**
     * <p>
     * The name of the registered, managed instance as it will appear in the
     * Systems Manager console or when you use the AWS command line tools to
     * list Systems Manager resources.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param defaultInstanceName <p>
     *            The name of the registered, managed instance as it will appear
     *            in the Systems Manager console or when you use the AWS command
     *            line tools to list Systems Manager resources.
     *            </p>
     *            <important>
     *            <p>
     *            Do not enter personally identifiable information in this
     *            field.
     *            </p>
     *            </important>
     */
    public void setDefaultInstanceName(String defaultInstanceName) {
        this.defaultInstanceName = defaultInstanceName;
    }

    /**
     * <p>
     * The name of the registered, managed instance as it will appear in the
     * Systems Manager console or when you use the AWS command line tools to
     * list Systems Manager resources.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param defaultInstanceName <p>
     *            The name of the registered, managed instance as it will appear
     *            in the Systems Manager console or when you use the AWS command
     *            line tools to list Systems Manager resources.
     *            </p>
     *            <important>
     *            <p>
     *            Do not enter personally identifiable information in this
     *            field.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateActivationRequest withDefaultInstanceName(String defaultInstanceName) {
        this.defaultInstanceName = defaultInstanceName;
        return this;
    }

    /**
     * <p>
     * The Amazon Identity and Access Management (IAM) role that you want to
     * assign to the managed instance. This IAM role must provide AssumeRole
     * permissions for the Systems Manager service principal
     * <code>ssm.amazonaws.com</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-service-role.html"
     * >Create an IAM service role for a hybrid environment</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The Amazon Identity and Access Management (IAM) role that you
     *         want to assign to the managed instance. This IAM role must
     *         provide AssumeRole permissions for the Systems Manager service
     *         principal <code>ssm.amazonaws.com</code>. For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-service-role.html"
     *         >Create an IAM service role for a hybrid environment</a> in the
     *         <i>AWS Systems Manager User Guide</i>.
     *         </p>
     */
    public String getIamRole() {
        return iamRole;
    }

    /**
     * <p>
     * The Amazon Identity and Access Management (IAM) role that you want to
     * assign to the managed instance. This IAM role must provide AssumeRole
     * permissions for the Systems Manager service principal
     * <code>ssm.amazonaws.com</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-service-role.html"
     * >Create an IAM service role for a hybrid environment</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param iamRole <p>
     *            The Amazon Identity and Access Management (IAM) role that you
     *            want to assign to the managed instance. This IAM role must
     *            provide AssumeRole permissions for the Systems Manager service
     *            principal <code>ssm.amazonaws.com</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-service-role.html"
     *            >Create an IAM service role for a hybrid environment</a> in
     *            the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     */
    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * The Amazon Identity and Access Management (IAM) role that you want to
     * assign to the managed instance. This IAM role must provide AssumeRole
     * permissions for the Systems Manager service principal
     * <code>ssm.amazonaws.com</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-service-role.html"
     * >Create an IAM service role for a hybrid environment</a> in the <i>AWS
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param iamRole <p>
     *            The Amazon Identity and Access Management (IAM) role that you
     *            want to assign to the managed instance. This IAM role must
     *            provide AssumeRole permissions for the Systems Manager service
     *            principal <code>ssm.amazonaws.com</code>. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-service-role.html"
     *            >Create an IAM service role for a hybrid environment</a> in
     *            the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateActivationRequest withIamRole(String iamRole) {
        this.iamRole = iamRole;
        return this;
    }

    /**
     * <p>
     * Specify the maximum number of managed instances you want to register. The
     * default value is 1 instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         Specify the maximum number of managed instances you want to
     *         register. The default value is 1 instance.
     *         </p>
     */
    public Integer getRegistrationLimit() {
        return registrationLimit;
    }

    /**
     * <p>
     * Specify the maximum number of managed instances you want to register. The
     * default value is 1 instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param registrationLimit <p>
     *            Specify the maximum number of managed instances you want to
     *            register. The default value is 1 instance.
     *            </p>
     */
    public void setRegistrationLimit(Integer registrationLimit) {
        this.registrationLimit = registrationLimit;
    }

    /**
     * <p>
     * Specify the maximum number of managed instances you want to register. The
     * default value is 1 instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param registrationLimit <p>
     *            Specify the maximum number of managed instances you want to
     *            register. The default value is 1 instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateActivationRequest withRegistrationLimit(Integer registrationLimit) {
        this.registrationLimit = registrationLimit;
        return this;
    }

    /**
     * <p>
     * The date by which this activation request should expire. The default
     * value is 24 hours.
     * </p>
     *
     * @return <p>
     *         The date by which this activation request should expire. The
     *         default value is 24 hours.
     *         </p>
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * <p>
     * The date by which this activation request should expire. The default
     * value is 24 hours.
     * </p>
     *
     * @param expirationDate <p>
     *            The date by which this activation request should expire. The
     *            default value is 24 hours.
     *            </p>
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The date by which this activation request should expire. The default
     * value is 24 hours.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expirationDate <p>
     *            The date by which this activation request should expire. The
     *            default value is 24 hours.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateActivationRequest withExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag an activation to identify
     * which servers or virtual machines (VMs) in your on-premises environment
     * you intend to activate. In this case, you could specify the following key
     * name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * When you install SSM Agent on your on-premises servers and VMs, you
     * specify an activation ID and code. When you specify the activation ID and
     * code, tags assigned to the activation are automatically applied to the
     * on-premises servers or VMs.
     * </p>
     * </important>
     * <p>
     * You can't add tags to or delete tags from an existing activation. You can
     * tag your on-premises servers and VMs after they connect to Systems
     * Manager for the first time and are assigned a managed instance ID. This
     * means they are listed in the AWS Systems Manager console with an ID that
     * is prefixed with "mi-". For information about how to add tags to your
     * managed instances, see <a>AddTagsToResource</a>. For information about
     * how to remove tags from your managed instances, see
     * <a>RemoveTagsFromResource</a>.
     * </p>
     *
     * @return <p>
     *         Optional metadata that you assign to a resource. Tags enable you
     *         to categorize a resource in different ways, such as by purpose,
     *         owner, or environment. For example, you might want to tag an
     *         activation to identify which servers or virtual machines (VMs) in
     *         your on-premises environment you intend to activate. In this
     *         case, you could specify the following key name/value pairs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Key=OS,Value=Windows</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Key=Environment,Value=Production</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         When you install SSM Agent on your on-premises servers and VMs,
     *         you specify an activation ID and code. When you specify the
     *         activation ID and code, tags assigned to the activation are
     *         automatically applied to the on-premises servers or VMs.
     *         </p>
     *         </important>
     *         <p>
     *         You can't add tags to or delete tags from an existing activation.
     *         You can tag your on-premises servers and VMs after they connect
     *         to Systems Manager for the first time and are assigned a managed
     *         instance ID. This means they are listed in the AWS Systems
     *         Manager console with an ID that is prefixed with "mi-". For
     *         information about how to add tags to your managed instances, see
     *         <a>AddTagsToResource</a>. For information about how to remove
     *         tags from your managed instances, see
     *         <a>RemoveTagsFromResource</a>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag an activation to identify
     * which servers or virtual machines (VMs) in your on-premises environment
     * you intend to activate. In this case, you could specify the following key
     * name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * When you install SSM Agent on your on-premises servers and VMs, you
     * specify an activation ID and code. When you specify the activation ID and
     * code, tags assigned to the activation are automatically applied to the
     * on-premises servers or VMs.
     * </p>
     * </important>
     * <p>
     * You can't add tags to or delete tags from an existing activation. You can
     * tag your on-premises servers and VMs after they connect to Systems
     * Manager for the first time and are assigned a managed instance ID. This
     * means they are listed in the AWS Systems Manager console with an ID that
     * is prefixed with "mi-". For information about how to add tags to your
     * managed instances, see <a>AddTagsToResource</a>. For information about
     * how to remove tags from your managed instances, see
     * <a>RemoveTagsFromResource</a>.
     * </p>
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag an activation to identify which servers or virtual
     *            machines (VMs) in your on-premises environment you intend to
     *            activate. In this case, you could specify the following key
     *            name/value pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=Environment,Value=Production</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <important>
     *            <p>
     *            When you install SSM Agent on your on-premises servers and
     *            VMs, you specify an activation ID and code. When you specify
     *            the activation ID and code, tags assigned to the activation
     *            are automatically applied to the on-premises servers or VMs.
     *            </p>
     *            </important>
     *            <p>
     *            You can't add tags to or delete tags from an existing
     *            activation. You can tag your on-premises servers and VMs after
     *            they connect to Systems Manager for the first time and are
     *            assigned a managed instance ID. This means they are listed in
     *            the AWS Systems Manager console with an ID that is prefixed
     *            with "mi-". For information about how to add tags to your
     *            managed instances, see <a>AddTagsToResource</a>. For
     *            information about how to remove tags from your managed
     *            instances, see <a>RemoveTagsFromResource</a>.
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
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag an activation to identify
     * which servers or virtual machines (VMs) in your on-premises environment
     * you intend to activate. In this case, you could specify the following key
     * name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * When you install SSM Agent on your on-premises servers and VMs, you
     * specify an activation ID and code. When you specify the activation ID and
     * code, tags assigned to the activation are automatically applied to the
     * on-premises servers or VMs.
     * </p>
     * </important>
     * <p>
     * You can't add tags to or delete tags from an existing activation. You can
     * tag your on-premises servers and VMs after they connect to Systems
     * Manager for the first time and are assigned a managed instance ID. This
     * means they are listed in the AWS Systems Manager console with an ID that
     * is prefixed with "mi-". For information about how to add tags to your
     * managed instances, see <a>AddTagsToResource</a>. For information about
     * how to remove tags from your managed instances, see
     * <a>RemoveTagsFromResource</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag an activation to identify which servers or virtual
     *            machines (VMs) in your on-premises environment you intend to
     *            activate. In this case, you could specify the following key
     *            name/value pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=Environment,Value=Production</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <important>
     *            <p>
     *            When you install SSM Agent on your on-premises servers and
     *            VMs, you specify an activation ID and code. When you specify
     *            the activation ID and code, tags assigned to the activation
     *            are automatically applied to the on-premises servers or VMs.
     *            </p>
     *            </important>
     *            <p>
     *            You can't add tags to or delete tags from an existing
     *            activation. You can tag your on-premises servers and VMs after
     *            they connect to Systems Manager for the first time and are
     *            assigned a managed instance ID. This means they are listed in
     *            the AWS Systems Manager console with an ID that is prefixed
     *            with "mi-". For information about how to add tags to your
     *            managed instances, see <a>AddTagsToResource</a>. For
     *            information about how to remove tags from your managed
     *            instances, see <a>RemoveTagsFromResource</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateActivationRequest withTags(Tag... tags) {
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
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag an activation to identify
     * which servers or virtual machines (VMs) in your on-premises environment
     * you intend to activate. In this case, you could specify the following key
     * name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Environment,Value=Production</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * When you install SSM Agent on your on-premises servers and VMs, you
     * specify an activation ID and code. When you specify the activation ID and
     * code, tags assigned to the activation are automatically applied to the
     * on-premises servers or VMs.
     * </p>
     * </important>
     * <p>
     * You can't add tags to or delete tags from an existing activation. You can
     * tag your on-premises servers and VMs after they connect to Systems
     * Manager for the first time and are assigned a managed instance ID. This
     * means they are listed in the AWS Systems Manager console with an ID that
     * is prefixed with "mi-". For information about how to add tags to your
     * managed instances, see <a>AddTagsToResource</a>. For information about
     * how to remove tags from your managed instances, see
     * <a>RemoveTagsFromResource</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag an activation to identify which servers or virtual
     *            machines (VMs) in your on-premises environment you intend to
     *            activate. In this case, you could specify the following key
     *            name/value pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=Environment,Value=Production</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <important>
     *            <p>
     *            When you install SSM Agent on your on-premises servers and
     *            VMs, you specify an activation ID and code. When you specify
     *            the activation ID and code, tags assigned to the activation
     *            are automatically applied to the on-premises servers or VMs.
     *            </p>
     *            </important>
     *            <p>
     *            You can't add tags to or delete tags from an existing
     *            activation. You can tag your on-premises servers and VMs after
     *            they connect to Systems Manager for the first time and are
     *            assigned a managed instance ID. This means they are listed in
     *            the AWS Systems Manager console with an ID that is prefixed
     *            with "mi-". For information about how to add tags to your
     *            managed instances, see <a>AddTagsToResource</a>. For
     *            information about how to remove tags from your managed
     *            instances, see <a>RemoveTagsFromResource</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateActivationRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDefaultInstanceName() != null)
            sb.append("DefaultInstanceName: " + getDefaultInstanceName() + ",");
        if (getIamRole() != null)
            sb.append("IamRole: " + getIamRole() + ",");
        if (getRegistrationLimit() != null)
            sb.append("RegistrationLimit: " + getRegistrationLimit() + ",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: " + getExpirationDate() + ",");
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
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultInstanceName() == null) ? 0 : getDefaultInstanceName().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode
                + ((getRegistrationLimit() == null) ? 0 : getRegistrationLimit().hashCode());
        hashCode = prime * hashCode
                + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateActivationRequest == false)
            return false;
        CreateActivationRequest other = (CreateActivationRequest) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefaultInstanceName() == null ^ this.getDefaultInstanceName() == null)
            return false;
        if (other.getDefaultInstanceName() != null
                && other.getDefaultInstanceName().equals(this.getDefaultInstanceName()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
            return false;
        if (other.getRegistrationLimit() == null ^ this.getRegistrationLimit() == null)
            return false;
        if (other.getRegistrationLimit() != null
                && other.getRegistrationLimit().equals(this.getRegistrationLimit()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null
                && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
