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
 * Contains the drift information for a resource that has been checked for
 * drift. This includes actual and expected property values for resources in
 * which AWS CloudFormation has detected drift. Only resource properties
 * explicitly defined in the stack template are checked for drift. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html"
 * >Detecting Unregulated Configuration Changes to Stacks and Resources</a>.
 * </p>
 * <p>
 * Resources that do not currently support drift detection cannot be checked.
 * For a list of resources that support drift detection, see <a href=
 * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
 * >Resources that Support Drift Detection</a>.
 * </p>
 * <p>
 * Use <a>DetectStackResourceDrift</a> to detect drift on individual resources,
 * or <a>DetectStackDrift</a> to detect drift on all resources in a given stack
 * that support drift detection.
 * </p>
 */
public class StackResourceDrift implements Serializable {
    /**
     * <p>
     * The ID of the stack.
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
     * Context information that enables AWS CloudFormation to uniquely identify
     * a resource. AWS CloudFormation uses context key-value pairs in cases
     * where a resource's logical and physical IDs are not enough to uniquely
     * identify that resource. Each context key-value pair specifies a unique
     * resource that contains the targeted resource.
     * </p>
     */
    private java.util.List<PhysicalResourceIdContextKeyValuePair> physicalResourceIdContext;

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String resourceType;

    /**
     * <p>
     * A JSON structure containing the expected property values of the stack
     * resource, as defined in the stack template and any values specified as
     * template parameters.
     * </p>
     * <p>
     * For resources whose <code>StackResourceDriftStatus</code> is
     * <code>DELETED</code>, this structure will not be present.
     * </p>
     */
    private String expectedProperties;

    /**
     * <p>
     * A JSON structure containing the actual property values of the stack
     * resource.
     * </p>
     * <p>
     * For resources whose <code>StackResourceDriftStatus</code> is
     * <code>DELETED</code>, this structure will not be present.
     * </p>
     */
    private String actualProperties;

    /**
     * <p>
     * A collection of the resource properties whose actual values differ from
     * their expected values. These will be present only for resources whose
     * <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>.
     * </p>
     */
    private java.util.List<PropertyDifference> propertyDifferences;

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected
     * configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template
     * configuration because the resource has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their
     * expected values (as defined in the stack template and any values
     * specified as template parameters).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return
     * this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, MODIFIED, DELETED, NOT_CHECKED
     */
    private String stackResourceDriftStatus;

    /**
     * <p>
     * Time at which AWS CloudFormation performed drift detection on the stack
     * resource.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The ID of the stack.
     * </p>
     *
     * @return <p>
     *         The ID of the stack.
     *         </p>
     */
    public String getStackId() {
        return stackId;
    }

    /**
     * <p>
     * The ID of the stack.
     * </p>
     *
     * @param stackId <p>
     *            The ID of the stack.
     *            </p>
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The ID of the stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackId <p>
     *            The ID of the stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDrift withStackId(String stackId) {
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
    public StackResourceDrift withLogicalResourceId(String logicalResourceId) {
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
    public StackResourceDrift withPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
        return this;
    }

    /**
     * <p>
     * Context information that enables AWS CloudFormation to uniquely identify
     * a resource. AWS CloudFormation uses context key-value pairs in cases
     * where a resource's logical and physical IDs are not enough to uniquely
     * identify that resource. Each context key-value pair specifies a unique
     * resource that contains the targeted resource.
     * </p>
     *
     * @return <p>
     *         Context information that enables AWS CloudFormation to uniquely
     *         identify a resource. AWS CloudFormation uses context key-value
     *         pairs in cases where a resource's logical and physical IDs are
     *         not enough to uniquely identify that resource. Each context
     *         key-value pair specifies a unique resource that contains the
     *         targeted resource.
     *         </p>
     */
    public java.util.List<PhysicalResourceIdContextKeyValuePair> getPhysicalResourceIdContext() {
        return physicalResourceIdContext;
    }

    /**
     * <p>
     * Context information that enables AWS CloudFormation to uniquely identify
     * a resource. AWS CloudFormation uses context key-value pairs in cases
     * where a resource's logical and physical IDs are not enough to uniquely
     * identify that resource. Each context key-value pair specifies a unique
     * resource that contains the targeted resource.
     * </p>
     *
     * @param physicalResourceIdContext <p>
     *            Context information that enables AWS CloudFormation to
     *            uniquely identify a resource. AWS CloudFormation uses context
     *            key-value pairs in cases where a resource's logical and
     *            physical IDs are not enough to uniquely identify that
     *            resource. Each context key-value pair specifies a unique
     *            resource that contains the targeted resource.
     *            </p>
     */
    public void setPhysicalResourceIdContext(
            java.util.Collection<PhysicalResourceIdContextKeyValuePair> physicalResourceIdContext) {
        if (physicalResourceIdContext == null) {
            this.physicalResourceIdContext = null;
            return;
        }

        this.physicalResourceIdContext = new java.util.ArrayList<PhysicalResourceIdContextKeyValuePair>(
                physicalResourceIdContext);
    }

    /**
     * <p>
     * Context information that enables AWS CloudFormation to uniquely identify
     * a resource. AWS CloudFormation uses context key-value pairs in cases
     * where a resource's logical and physical IDs are not enough to uniquely
     * identify that resource. Each context key-value pair specifies a unique
     * resource that contains the targeted resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param physicalResourceIdContext <p>
     *            Context information that enables AWS CloudFormation to
     *            uniquely identify a resource. AWS CloudFormation uses context
     *            key-value pairs in cases where a resource's logical and
     *            physical IDs are not enough to uniquely identify that
     *            resource. Each context key-value pair specifies a unique
     *            resource that contains the targeted resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDrift withPhysicalResourceIdContext(
            PhysicalResourceIdContextKeyValuePair... physicalResourceIdContext) {
        if (getPhysicalResourceIdContext() == null) {
            this.physicalResourceIdContext = new java.util.ArrayList<PhysicalResourceIdContextKeyValuePair>(
                    physicalResourceIdContext.length);
        }
        for (PhysicalResourceIdContextKeyValuePair value : physicalResourceIdContext) {
            this.physicalResourceIdContext.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Context information that enables AWS CloudFormation to uniquely identify
     * a resource. AWS CloudFormation uses context key-value pairs in cases
     * where a resource's logical and physical IDs are not enough to uniquely
     * identify that resource. Each context key-value pair specifies a unique
     * resource that contains the targeted resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param physicalResourceIdContext <p>
     *            Context information that enables AWS CloudFormation to
     *            uniquely identify a resource. AWS CloudFormation uses context
     *            key-value pairs in cases where a resource's logical and
     *            physical IDs are not enough to uniquely identify that
     *            resource. Each context key-value pair specifies a unique
     *            resource that contains the targeted resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDrift withPhysicalResourceIdContext(
            java.util.Collection<PhysicalResourceIdContextKeyValuePair> physicalResourceIdContext) {
        setPhysicalResourceIdContext(physicalResourceIdContext);
        return this;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The type of the resource.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceType <p>
     *            The type of the resource.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceType <p>
     *            The type of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDrift withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * A JSON structure containing the expected property values of the stack
     * resource, as defined in the stack template and any values specified as
     * template parameters.
     * </p>
     * <p>
     * For resources whose <code>StackResourceDriftStatus</code> is
     * <code>DELETED</code>, this structure will not be present.
     * </p>
     *
     * @return <p>
     *         A JSON structure containing the expected property values of the
     *         stack resource, as defined in the stack template and any values
     *         specified as template parameters.
     *         </p>
     *         <p>
     *         For resources whose <code>StackResourceDriftStatus</code> is
     *         <code>DELETED</code>, this structure will not be present.
     *         </p>
     */
    public String getExpectedProperties() {
        return expectedProperties;
    }

    /**
     * <p>
     * A JSON structure containing the expected property values of the stack
     * resource, as defined in the stack template and any values specified as
     * template parameters.
     * </p>
     * <p>
     * For resources whose <code>StackResourceDriftStatus</code> is
     * <code>DELETED</code>, this structure will not be present.
     * </p>
     *
     * @param expectedProperties <p>
     *            A JSON structure containing the expected property values of
     *            the stack resource, as defined in the stack template and any
     *            values specified as template parameters.
     *            </p>
     *            <p>
     *            For resources whose <code>StackResourceDriftStatus</code> is
     *            <code>DELETED</code>, this structure will not be present.
     *            </p>
     */
    public void setExpectedProperties(String expectedProperties) {
        this.expectedProperties = expectedProperties;
    }

    /**
     * <p>
     * A JSON structure containing the expected property values of the stack
     * resource, as defined in the stack template and any values specified as
     * template parameters.
     * </p>
     * <p>
     * For resources whose <code>StackResourceDriftStatus</code> is
     * <code>DELETED</code>, this structure will not be present.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expectedProperties <p>
     *            A JSON structure containing the expected property values of
     *            the stack resource, as defined in the stack template and any
     *            values specified as template parameters.
     *            </p>
     *            <p>
     *            For resources whose <code>StackResourceDriftStatus</code> is
     *            <code>DELETED</code>, this structure will not be present.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDrift withExpectedProperties(String expectedProperties) {
        this.expectedProperties = expectedProperties;
        return this;
    }

    /**
     * <p>
     * A JSON structure containing the actual property values of the stack
     * resource.
     * </p>
     * <p>
     * For resources whose <code>StackResourceDriftStatus</code> is
     * <code>DELETED</code>, this structure will not be present.
     * </p>
     *
     * @return <p>
     *         A JSON structure containing the actual property values of the
     *         stack resource.
     *         </p>
     *         <p>
     *         For resources whose <code>StackResourceDriftStatus</code> is
     *         <code>DELETED</code>, this structure will not be present.
     *         </p>
     */
    public String getActualProperties() {
        return actualProperties;
    }

    /**
     * <p>
     * A JSON structure containing the actual property values of the stack
     * resource.
     * </p>
     * <p>
     * For resources whose <code>StackResourceDriftStatus</code> is
     * <code>DELETED</code>, this structure will not be present.
     * </p>
     *
     * @param actualProperties <p>
     *            A JSON structure containing the actual property values of the
     *            stack resource.
     *            </p>
     *            <p>
     *            For resources whose <code>StackResourceDriftStatus</code> is
     *            <code>DELETED</code>, this structure will not be present.
     *            </p>
     */
    public void setActualProperties(String actualProperties) {
        this.actualProperties = actualProperties;
    }

    /**
     * <p>
     * A JSON structure containing the actual property values of the stack
     * resource.
     * </p>
     * <p>
     * For resources whose <code>StackResourceDriftStatus</code> is
     * <code>DELETED</code>, this structure will not be present.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actualProperties <p>
     *            A JSON structure containing the actual property values of the
     *            stack resource.
     *            </p>
     *            <p>
     *            For resources whose <code>StackResourceDriftStatus</code> is
     *            <code>DELETED</code>, this structure will not be present.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDrift withActualProperties(String actualProperties) {
        this.actualProperties = actualProperties;
        return this;
    }

    /**
     * <p>
     * A collection of the resource properties whose actual values differ from
     * their expected values. These will be present only for resources whose
     * <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>.
     * </p>
     *
     * @return <p>
     *         A collection of the resource properties whose actual values
     *         differ from their expected values. These will be present only for
     *         resources whose <code>StackResourceDriftStatus</code> is
     *         <code>MODIFIED</code>.
     *         </p>
     */
    public java.util.List<PropertyDifference> getPropertyDifferences() {
        return propertyDifferences;
    }

    /**
     * <p>
     * A collection of the resource properties whose actual values differ from
     * their expected values. These will be present only for resources whose
     * <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>.
     * </p>
     *
     * @param propertyDifferences <p>
     *            A collection of the resource properties whose actual values
     *            differ from their expected values. These will be present only
     *            for resources whose <code>StackResourceDriftStatus</code> is
     *            <code>MODIFIED</code>.
     *            </p>
     */
    public void setPropertyDifferences(java.util.Collection<PropertyDifference> propertyDifferences) {
        if (propertyDifferences == null) {
            this.propertyDifferences = null;
            return;
        }

        this.propertyDifferences = new java.util.ArrayList<PropertyDifference>(propertyDifferences);
    }

    /**
     * <p>
     * A collection of the resource properties whose actual values differ from
     * their expected values. These will be present only for resources whose
     * <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propertyDifferences <p>
     *            A collection of the resource properties whose actual values
     *            differ from their expected values. These will be present only
     *            for resources whose <code>StackResourceDriftStatus</code> is
     *            <code>MODIFIED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDrift withPropertyDifferences(PropertyDifference... propertyDifferences) {
        if (getPropertyDifferences() == null) {
            this.propertyDifferences = new java.util.ArrayList<PropertyDifference>(
                    propertyDifferences.length);
        }
        for (PropertyDifference value : propertyDifferences) {
            this.propertyDifferences.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A collection of the resource properties whose actual values differ from
     * their expected values. These will be present only for resources whose
     * <code>StackResourceDriftStatus</code> is <code>MODIFIED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propertyDifferences <p>
     *            A collection of the resource properties whose actual values
     *            differ from their expected values. These will be present only
     *            for resources whose <code>StackResourceDriftStatus</code> is
     *            <code>MODIFIED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDrift withPropertyDifferences(
            java.util.Collection<PropertyDifference> propertyDifferences) {
        setPropertyDifferences(propertyDifferences);
        return this;
    }

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected
     * configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template
     * configuration because the resource has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their
     * expected values (as defined in the stack template and any values
     * specified as template parameters).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return
     * this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, MODIFIED, DELETED, NOT_CHECKED
     *
     * @return <p>
     *         Status of the resource's actual configuration compared to its
     *         expected configuration
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DELETED</code>: The resource differs from its expected
     *         template configuration because the resource has been deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MODIFIED</code>: One or more resource properties differ
     *         from their expected values (as defined in the stack template and
     *         any values specified as template parameters).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code>: The resources's actual configuration
     *         matches its expected template configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_CHECKED</code>: AWS CloudFormation does not currently
     *         return this value.
     *         </p>
     *         </li>
     *         </ul>
     * @see StackResourceDriftStatus
     */
    public String getStackResourceDriftStatus() {
        return stackResourceDriftStatus;
    }

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected
     * configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template
     * configuration because the resource has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their
     * expected values (as defined in the stack template and any values
     * specified as template parameters).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return
     * this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, MODIFIED, DELETED, NOT_CHECKED
     *
     * @param stackResourceDriftStatus <p>
     *            Status of the resource's actual configuration compared to its
     *            expected configuration
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DELETED</code>: The resource differs from its expected
     *            template configuration because the resource has been deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MODIFIED</code>: One or more resource properties differ
     *            from their expected values (as defined in the stack template
     *            and any values specified as template parameters).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The resources's actual configuration
     *            matches its expected template configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation does not
     *            currently return this value.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackResourceDriftStatus
     */
    public void setStackResourceDriftStatus(String stackResourceDriftStatus) {
        this.stackResourceDriftStatus = stackResourceDriftStatus;
    }

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected
     * configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template
     * configuration because the resource has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their
     * expected values (as defined in the stack template and any values
     * specified as template parameters).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return
     * this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, MODIFIED, DELETED, NOT_CHECKED
     *
     * @param stackResourceDriftStatus <p>
     *            Status of the resource's actual configuration compared to its
     *            expected configuration
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DELETED</code>: The resource differs from its expected
     *            template configuration because the resource has been deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MODIFIED</code>: One or more resource properties differ
     *            from their expected values (as defined in the stack template
     *            and any values specified as template parameters).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The resources's actual configuration
     *            matches its expected template configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation does not
     *            currently return this value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackResourceDriftStatus
     */
    public StackResourceDrift withStackResourceDriftStatus(String stackResourceDriftStatus) {
        this.stackResourceDriftStatus = stackResourceDriftStatus;
        return this;
    }

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected
     * configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template
     * configuration because the resource has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their
     * expected values (as defined in the stack template and any values
     * specified as template parameters).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return
     * this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, MODIFIED, DELETED, NOT_CHECKED
     *
     * @param stackResourceDriftStatus <p>
     *            Status of the resource's actual configuration compared to its
     *            expected configuration
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DELETED</code>: The resource differs from its expected
     *            template configuration because the resource has been deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MODIFIED</code>: One or more resource properties differ
     *            from their expected values (as defined in the stack template
     *            and any values specified as template parameters).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The resources's actual configuration
     *            matches its expected template configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation does not
     *            currently return this value.
     *            </p>
     *            </li>
     *            </ul>
     * @see StackResourceDriftStatus
     */
    public void setStackResourceDriftStatus(StackResourceDriftStatus stackResourceDriftStatus) {
        this.stackResourceDriftStatus = stackResourceDriftStatus.toString();
    }

    /**
     * <p>
     * Status of the resource's actual configuration compared to its expected
     * configuration
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template
     * configuration because the resource has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their
     * expected values (as defined in the stack template and any values
     * specified as template parameters).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return
     * this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_SYNC, MODIFIED, DELETED, NOT_CHECKED
     *
     * @param stackResourceDriftStatus <p>
     *            Status of the resource's actual configuration compared to its
     *            expected configuration
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DELETED</code>: The resource differs from its expected
     *            template configuration because the resource has been deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MODIFIED</code>: One or more resource properties differ
     *            from their expected values (as defined in the stack template
     *            and any values specified as template parameters).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The resources's actual configuration
     *            matches its expected template configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation does not
     *            currently return this value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackResourceDriftStatus
     */
    public StackResourceDrift withStackResourceDriftStatus(
            StackResourceDriftStatus stackResourceDriftStatus) {
        this.stackResourceDriftStatus = stackResourceDriftStatus.toString();
        return this;
    }

    /**
     * <p>
     * Time at which AWS CloudFormation performed drift detection on the stack
     * resource.
     * </p>
     *
     * @return <p>
     *         Time at which AWS CloudFormation performed drift detection on the
     *         stack resource.
     *         </p>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * Time at which AWS CloudFormation performed drift detection on the stack
     * resource.
     * </p>
     *
     * @param timestamp <p>
     *            Time at which AWS CloudFormation performed drift detection on
     *            the stack resource.
     *            </p>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Time at which AWS CloudFormation performed drift detection on the stack
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            Time at which AWS CloudFormation performed drift detection on
     *            the stack resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackResourceDrift withTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
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
        if (getStackId() != null)
            sb.append("StackId: " + getStackId() + ",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: " + getLogicalResourceId() + ",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: " + getPhysicalResourceId() + ",");
        if (getPhysicalResourceIdContext() != null)
            sb.append("PhysicalResourceIdContext: " + getPhysicalResourceIdContext() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getExpectedProperties() != null)
            sb.append("ExpectedProperties: " + getExpectedProperties() + ",");
        if (getActualProperties() != null)
            sb.append("ActualProperties: " + getActualProperties() + ",");
        if (getPropertyDifferences() != null)
            sb.append("PropertyDifferences: " + getPropertyDifferences() + ",");
        if (getStackResourceDriftStatus() != null)
            sb.append("StackResourceDriftStatus: " + getStackResourceDriftStatus() + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode
                + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getPhysicalResourceIdContext() == null) ? 0 : getPhysicalResourceIdContext()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode
                + ((getExpectedProperties() == null) ? 0 : getExpectedProperties().hashCode());
        hashCode = prime * hashCode
                + ((getActualProperties() == null) ? 0 : getActualProperties().hashCode());
        hashCode = prime * hashCode
                + ((getPropertyDifferences() == null) ? 0 : getPropertyDifferences().hashCode());
        hashCode = prime
                * hashCode
                + ((getStackResourceDriftStatus() == null) ? 0 : getStackResourceDriftStatus()
                        .hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackResourceDrift == false)
            return false;
        StackResourceDrift other = (StackResourceDrift) obj;

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
        if (other.getPhysicalResourceIdContext() == null
                ^ this.getPhysicalResourceIdContext() == null)
            return false;
        if (other.getPhysicalResourceIdContext() != null
                && other.getPhysicalResourceIdContext().equals(this.getPhysicalResourceIdContext()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getExpectedProperties() == null ^ this.getExpectedProperties() == null)
            return false;
        if (other.getExpectedProperties() != null
                && other.getExpectedProperties().equals(this.getExpectedProperties()) == false)
            return false;
        if (other.getActualProperties() == null ^ this.getActualProperties() == null)
            return false;
        if (other.getActualProperties() != null
                && other.getActualProperties().equals(this.getActualProperties()) == false)
            return false;
        if (other.getPropertyDifferences() == null ^ this.getPropertyDifferences() == null)
            return false;
        if (other.getPropertyDifferences() != null
                && other.getPropertyDifferences().equals(this.getPropertyDifferences()) == false)
            return false;
        if (other.getStackResourceDriftStatus() == null
                ^ this.getStackResourceDriftStatus() == null)
            return false;
        if (other.getStackResourceDriftStatus() != null
                && other.getStackResourceDriftStatus().equals(this.getStackResourceDriftStatus()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }
}
