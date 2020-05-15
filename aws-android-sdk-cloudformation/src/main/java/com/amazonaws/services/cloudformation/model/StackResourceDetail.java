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
 * Contains detailed information about the specified stack resource.
 * </p>
 */
public class StackResourceDetail implements Serializable {
    /**
     * <p>
     * The name associated with the stack.
     * </p>
     */
    private String stackName;

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     */
    private String stackId;

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     */
    private String logicalResourceId;

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID
     * of a resource supported by AWS CloudFormation.
     * </p>
     */
    private String physicalResourceId;

    /**
     * <p>
     * Type of resource. ((For more information, go to <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * > AWS Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String resourceType;

    /**
     * <p>
     * Time the status was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * DELETE_SKIPPED, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE,
     * IMPORT_FAILED, IMPORT_COMPLETE, IMPORT_IN_PROGRESS,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     */
    private String resourceStatus;

    /**
     * <p>
     * Success/failure message associated with the resource.
     * </p>
     */
    private String resourceStatusReason;

    /**
     * <p>
     * User defined description associated with the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The content of the <code>Metadata</code> attribute declared for the
     * resource. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html"
     * >Metadata Attribute</a> in the AWS CloudFormation User Guide.
     * </p>
     */
    private String metadata;

    /**
     * <p>
     * Information about whether the resource's actual configuration differs, or
     * has <i>drifted</i>, from its expected configuration, as defined in the
     * stack template and any values specified as template parameters. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     */
    private StackResourceDriftInformation driftInformation;

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     *
     * @return <p>
     *         The name associated with the stack.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     *
     * @param stackName <p>
     *            The name associated with the stack.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackName <p>
     *            The name associated with the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDetail withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     *
     * @return <p>
     *         Unique identifier of the stack.
     *         </p>
     */
    public String getStackId() {
        return stackId;
    }

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     *
     * @param stackId <p>
     *            Unique identifier of the stack.
     *            </p>
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackId <p>
     *            Unique identifier of the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDetail withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     *
     * @return <p>
     *         The logical name of the resource specified in the template.
     *         </p>
     */
    public String getLogicalResourceId() {
        return logicalResourceId;
    }

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     *
     * @param logicalResourceId <p>
     *            The logical name of the resource specified in the template.
     *            </p>
     */
    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logicalResourceId <p>
     *            The logical name of the resource specified in the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDetail withLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID
     * of a resource supported by AWS CloudFormation.
     * </p>
     *
     * @return <p>
     *         The name or unique identifier that corresponds to a physical
     *         instance ID of a resource supported by AWS CloudFormation.
     *         </p>
     */
    public String getPhysicalResourceId() {
        return physicalResourceId;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID
     * of a resource supported by AWS CloudFormation.
     * </p>
     *
     * @param physicalResourceId <p>
     *            The name or unique identifier that corresponds to a physical
     *            instance ID of a resource supported by AWS CloudFormation.
     *            </p>
     */
    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID
     * of a resource supported by AWS CloudFormation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param physicalResourceId <p>
     *            The name or unique identifier that corresponds to a physical
     *            instance ID of a resource supported by AWS CloudFormation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDetail withPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
        return this;
    }

    /**
     * <p>
     * Type of resource. ((For more information, go to <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * > AWS Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         Type of resource. ((For more information, go to <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *         > AWS Resource Types Reference</a> in the AWS CloudFormation User
     *         Guide.)
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * Type of resource. ((For more information, go to <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * > AWS Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceType <p>
     *            Type of resource. ((For more information, go to <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *            > AWS Resource Types Reference</a> in the AWS CloudFormation
     *            User Guide.)
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Type of resource. ((For more information, go to <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * > AWS Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceType <p>
     *            Type of resource. ((For more information, go to <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *            > AWS Resource Types Reference</a> in the AWS CloudFormation
     *            User Guide.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDetail withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * Time the status was updated.
     * </p>
     *
     * @return <p>
     *         Time the status was updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    /**
     * <p>
     * Time the status was updated.
     * </p>
     *
     * @param lastUpdatedTimestamp <p>
     *            Time the status was updated.
     *            </p>
     */
    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * Time the status was updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTimestamp <p>
     *            Time the status was updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDetail withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * DELETE_SKIPPED, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE,
     * IMPORT_FAILED, IMPORT_COMPLETE, IMPORT_IN_PROGRESS,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     *
     * @return <p>
     *         Current status of the resource.
     *         </p>
     * @see ResourceStatus
     */
    public String getResourceStatus() {
        return resourceStatus;
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * DELETE_SKIPPED, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE,
     * IMPORT_FAILED, IMPORT_COMPLETE, IMPORT_IN_PROGRESS,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     *
     * @param resourceStatus <p>
     *            Current status of the resource.
     *            </p>
     * @see ResourceStatus
     */
    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * DELETE_SKIPPED, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE,
     * IMPORT_FAILED, IMPORT_COMPLETE, IMPORT_IN_PROGRESS,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     *
     * @param resourceStatus <p>
     *            Current status of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceStatus
     */
    public StackResourceDetail withResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
        return this;
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * DELETE_SKIPPED, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE,
     * IMPORT_FAILED, IMPORT_COMPLETE, IMPORT_IN_PROGRESS,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     *
     * @param resourceStatus <p>
     *            Current status of the resource.
     *            </p>
     * @see ResourceStatus
     */
    public void setResourceStatus(ResourceStatus resourceStatus) {
        this.resourceStatus = resourceStatus.toString();
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED,
     * CREATE_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
     * DELETE_SKIPPED, UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE,
     * IMPORT_FAILED, IMPORT_COMPLETE, IMPORT_IN_PROGRESS,
     * IMPORT_ROLLBACK_IN_PROGRESS, IMPORT_ROLLBACK_FAILED,
     * IMPORT_ROLLBACK_COMPLETE
     *
     * @param resourceStatus <p>
     *            Current status of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceStatus
     */
    public StackResourceDetail withResourceStatus(ResourceStatus resourceStatus) {
        this.resourceStatus = resourceStatus.toString();
        return this;
    }

    /**
     * <p>
     * Success/failure message associated with the resource.
     * </p>
     *
     * @return <p>
     *         Success/failure message associated with the resource.
     *         </p>
     */
    public String getResourceStatusReason() {
        return resourceStatusReason;
    }

    /**
     * <p>
     * Success/failure message associated with the resource.
     * </p>
     *
     * @param resourceStatusReason <p>
     *            Success/failure message associated with the resource.
     *            </p>
     */
    public void setResourceStatusReason(String resourceStatusReason) {
        this.resourceStatusReason = resourceStatusReason;
    }

    /**
     * <p>
     * Success/failure message associated with the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceStatusReason <p>
     *            Success/failure message associated with the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDetail withResourceStatusReason(String resourceStatusReason) {
        this.resourceStatusReason = resourceStatusReason;
        return this;
    }

    /**
     * <p>
     * User defined description associated with the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         User defined description associated with the resource.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * User defined description associated with the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            User defined description associated with the resource.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * User defined description associated with the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            User defined description associated with the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The content of the <code>Metadata</code> attribute declared for the
     * resource. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html"
     * >Metadata Attribute</a> in the AWS CloudFormation User Guide.
     * </p>
     *
     * @return <p>
     *         The content of the <code>Metadata</code> attribute declared for
     *         the resource. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html"
     *         >Metadata Attribute</a> in the AWS CloudFormation User Guide.
     *         </p>
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The content of the <code>Metadata</code> attribute declared for the
     * resource. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html"
     * >Metadata Attribute</a> in the AWS CloudFormation User Guide.
     * </p>
     *
     * @param metadata <p>
     *            The content of the <code>Metadata</code> attribute declared
     *            for the resource. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html"
     *            >Metadata Attribute</a> in the AWS CloudFormation User Guide.
     *            </p>
     */
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The content of the <code>Metadata</code> attribute declared for the
     * resource. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html"
     * >Metadata Attribute</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            The content of the <code>Metadata</code> attribute declared
     *            for the resource. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html"
     *            >Metadata Attribute</a> in the AWS CloudFormation User Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDetail withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * <p>
     * Information about whether the resource's actual configuration differs, or
     * has <i>drifted</i>, from its expected configuration, as defined in the
     * stack template and any values specified as template parameters. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     *
     * @return <p>
     *         Information about whether the resource's actual configuration
     *         differs, or has <i>drifted</i>, from its expected configuration,
     *         as defined in the stack template and any values specified as
     *         template parameters. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     *         >Detecting Unregulated Configuration Changes to Stacks and
     *         Resources</a>.
     *         </p>
     */
    public StackResourceDriftInformation getDriftInformation() {
        return driftInformation;
    }

    /**
     * <p>
     * Information about whether the resource's actual configuration differs, or
     * has <i>drifted</i>, from its expected configuration, as defined in the
     * stack template and any values specified as template parameters. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     *
     * @param driftInformation <p>
     *            Information about whether the resource's actual configuration
     *            differs, or has <i>drifted</i>, from its expected
     *            configuration, as defined in the stack template and any values
     *            specified as template parameters. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     *            >Detecting Unregulated Configuration Changes to Stacks and
     *            Resources</a>.
     *            </p>
     */
    public void setDriftInformation(StackResourceDriftInformation driftInformation) {
        this.driftInformation = driftInformation;
    }

    /**
     * <p>
     * Information about whether the resource's actual configuration differs, or
     * has <i>drifted</i>, from its expected configuration, as defined in the
     * stack template and any values specified as template parameters. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param driftInformation <p>
     *            Information about whether the resource's actual configuration
     *            differs, or has <i>drifted</i>, from its expected
     *            configuration, as defined in the stack template and any values
     *            specified as template parameters. For more information, see <a
     *            href=
     *            "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
     *            >Detecting Unregulated Configuration Changes to Stacks and
     *            Resources</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDetail withDriftInformation(StackResourceDriftInformation driftInformation) {
        this.driftInformation = driftInformation;
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
        if (getStackId() != null)
            sb.append("StackId: " + getStackId() + ",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: " + getLogicalResourceId() + ",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: " + getPhysicalResourceId() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: " + getLastUpdatedTimestamp() + ",");
        if (getResourceStatus() != null)
            sb.append("ResourceStatus: " + getResourceStatus() + ",");
        if (getResourceStatusReason() != null)
            sb.append("ResourceStatusReason: " + getResourceStatusReason() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getMetadata() != null)
            sb.append("Metadata: " + getMetadata() + ",");
        if (getDriftInformation() != null)
            sb.append("DriftInformation: " + getDriftInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode
                + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getResourceStatus() == null) ? 0 : getResourceStatus().hashCode());
        hashCode = prime * hashCode
                + ((getResourceStatusReason() == null) ? 0 : getResourceStatusReason().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getDriftInformation() == null) ? 0 : getDriftInformation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackResourceDetail == false)
            return false;
        StackResourceDetail other = (StackResourceDetail) obj;

        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null
                && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null
                && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null
                && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getResourceStatus() == null ^ this.getResourceStatus() == null)
            return false;
        if (other.getResourceStatus() != null
                && other.getResourceStatus().equals(this.getResourceStatus()) == false)
            return false;
        if (other.getResourceStatusReason() == null ^ this.getResourceStatusReason() == null)
            return false;
        if (other.getResourceStatusReason() != null
                && other.getResourceStatusReason().equals(this.getResourceStatusReason()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getDriftInformation() == null ^ this.getDriftInformation() == null)
            return false;
        if (other.getDriftInformation() != null
                && other.getDriftInformation().equals(this.getDriftInformation()) == false)
            return false;
        return true;
    }
}
