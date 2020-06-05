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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a provisioned product.
 * </p>
 */
public class ProvisionedProductDetail implements Serializable {
    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-
     * 9._-]{0,127}|arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023
     * }<br/>
     */
    private String name;

    /**
     * <p>
     * The ARN of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-
     * 9._-]{0,127}|arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023
     * }<br/>
     */
    private String arn;

    /**
     * <p>
     * The type of provisioned product. The supported values are
     * <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The current status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Stable state, ready to perform any operation.
     * The most recent operation succeeded and completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code> - Transitive state. Operations performed might
     * not have valid results. Wait for an <code>AVAILABLE</code> status before
     * performing operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TAINTED</code> - Stable state, ready to perform any operation. The
     * stack has completed the requested operation but is not exactly what was
     * requested. For example, a request to update to a new version failed and
     * the stack rolled back to the current version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An unexpected error occurred. The provisioned
     * product exists but the stack is not running. For example, CloudFormation
     * received a parameter value that was not valid and could not launch the
     * stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations
     * were performed to provision a new product, but resources have not yet
     * been created. After reviewing the list of resources to be created,
     * execute the plan. Wait for an <code>AVAILABLE</code> status before
     * performing operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNDER_CHANGE, TAINTED, ERROR,
     * PLAN_IN_PROGRESS
     */
    private String status;

    /**
     * <p>
     * The current status message of the provisioned product.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple
     * requests differ only by the idempotency token, the same response is
     * returned for each repeated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The record identifier of the last request performed on this provisioned
     * product.
     * </p>
     */
    private String lastRecordId;

    /**
     * <p>
     * The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String productId;

    /**
     * <p>
     * The identifier of the provisioning artifact. For example,
     * <code>pa-4abcdjnxjj6ne</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String provisioningArtifactId;

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-
     * 9._-]{0,127}|arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023
     * }<br/>
     *
     * @return <p>
     *         The user-friendly name of the provisioned product.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-
     * 9._-]{0,127}|arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023
     * }<br/>
     *
     * @param name <p>
     *            The user-friendly name of the provisioned product.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The user-friendly name of the provisioned product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-
     * 9._-]{0,127}|arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023
     * }<br/>
     *
     * @param name <p>
     *            The user-friendly name of the provisioned product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ARN of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-
     * 9._-]{0,127}|arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023
     * }<br/>
     *
     * @return <p>
     *         The ARN of the provisioned product.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN of the provisioned product.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-
     * 9._-]{0,127}|arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023
     * }<br/>
     *
     * @param arn <p>
     *            The ARN of the provisioned product.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the provisioned product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-
     * 9._-]{0,127}|arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023
     * }<br/>
     *
     * @param arn <p>
     *            The ARN of the provisioned product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductDetail withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The type of provisioned product. The supported values are
     * <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     * </p>
     *
     * @return <p>
     *         The type of provisioned product. The supported values are
     *         <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of provisioned product. The supported values are
     * <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     * </p>
     *
     * @param type <p>
     *            The type of provisioned product. The supported values are
     *            <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of provisioned product. The supported values are
     * <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The type of provisioned product. The supported values are
     *            <code>CFN_STACK</code> and <code>CFN_STACKSET</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     *
     * @return <p>
     *         The identifier of the provisioned product.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     *
     * @param id <p>
     *            The identifier of the provisioned product.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier of the provisioned product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The current status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Stable state, ready to perform any operation.
     * The most recent operation succeeded and completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code> - Transitive state. Operations performed might
     * not have valid results. Wait for an <code>AVAILABLE</code> status before
     * performing operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TAINTED</code> - Stable state, ready to perform any operation. The
     * stack has completed the requested operation but is not exactly what was
     * requested. For example, a request to update to a new version failed and
     * the stack rolled back to the current version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An unexpected error occurred. The provisioned
     * product exists but the stack is not running. For example, CloudFormation
     * received a parameter value that was not valid and could not launch the
     * stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations
     * were performed to provision a new product, but resources have not yet
     * been created. After reviewing the list of resources to be created,
     * execute the plan. Wait for an <code>AVAILABLE</code> status before
     * performing operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNDER_CHANGE, TAINTED, ERROR,
     * PLAN_IN_PROGRESS
     *
     * @return <p>
     *         The current status of the provisioned product.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - Stable state, ready to perform any
     *         operation. The most recent operation succeeded and completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNDER_CHANGE</code> - Transitive state. Operations
     *         performed might not have valid results. Wait for an
     *         <code>AVAILABLE</code> status before performing operations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TAINTED</code> - Stable state, ready to perform any
     *         operation. The stack has completed the requested operation but is
     *         not exactly what was requested. For example, a request to update
     *         to a new version failed and the stack rolled back to the current
     *         version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ERROR</code> - An unexpected error occurred. The
     *         provisioned product exists but the stack is not running. For
     *         example, CloudFormation received a parameter value that was not
     *         valid and could not launch the stack.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan
     *         operations were performed to provision a new product, but
     *         resources have not yet been created. After reviewing the list of
     *         resources to be created, execute the plan. Wait for an
     *         <code>AVAILABLE</code> status before performing operations.
     *         </p>
     *         </li>
     *         </ul>
     * @see ProvisionedProductStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Stable state, ready to perform any operation.
     * The most recent operation succeeded and completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code> - Transitive state. Operations performed might
     * not have valid results. Wait for an <code>AVAILABLE</code> status before
     * performing operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TAINTED</code> - Stable state, ready to perform any operation. The
     * stack has completed the requested operation but is not exactly what was
     * requested. For example, a request to update to a new version failed and
     * the stack rolled back to the current version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An unexpected error occurred. The provisioned
     * product exists but the stack is not running. For example, CloudFormation
     * received a parameter value that was not valid and could not launch the
     * stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations
     * were performed to provision a new product, but resources have not yet
     * been created. After reviewing the list of resources to be created,
     * execute the plan. Wait for an <code>AVAILABLE</code> status before
     * performing operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNDER_CHANGE, TAINTED, ERROR,
     * PLAN_IN_PROGRESS
     *
     * @param status <p>
     *            The current status of the provisioned product.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AVAILABLE</code> - Stable state, ready to perform any
     *            operation. The most recent operation succeeded and completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UNDER_CHANGE</code> - Transitive state. Operations
     *            performed might not have valid results. Wait for an
     *            <code>AVAILABLE</code> status before performing operations.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TAINTED</code> - Stable state, ready to perform any
     *            operation. The stack has completed the requested operation but
     *            is not exactly what was requested. For example, a request to
     *            update to a new version failed and the stack rolled back to
     *            the current version.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ERROR</code> - An unexpected error occurred. The
     *            provisioned product exists but the stack is not running. For
     *            example, CloudFormation received a parameter value that was
     *            not valid and could not launch the stack.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan
     *            operations were performed to provision a new product, but
     *            resources have not yet been created. After reviewing the list
     *            of resources to be created, execute the plan. Wait for an
     *            <code>AVAILABLE</code> status before performing operations.
     *            </p>
     *            </li>
     *            </ul>
     * @see ProvisionedProductStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Stable state, ready to perform any operation.
     * The most recent operation succeeded and completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code> - Transitive state. Operations performed might
     * not have valid results. Wait for an <code>AVAILABLE</code> status before
     * performing operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TAINTED</code> - Stable state, ready to perform any operation. The
     * stack has completed the requested operation but is not exactly what was
     * requested. For example, a request to update to a new version failed and
     * the stack rolled back to the current version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An unexpected error occurred. The provisioned
     * product exists but the stack is not running. For example, CloudFormation
     * received a parameter value that was not valid and could not launch the
     * stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations
     * were performed to provision a new product, but resources have not yet
     * been created. After reviewing the list of resources to be created,
     * execute the plan. Wait for an <code>AVAILABLE</code> status before
     * performing operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNDER_CHANGE, TAINTED, ERROR,
     * PLAN_IN_PROGRESS
     *
     * @param status <p>
     *            The current status of the provisioned product.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AVAILABLE</code> - Stable state, ready to perform any
     *            operation. The most recent operation succeeded and completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UNDER_CHANGE</code> - Transitive state. Operations
     *            performed might not have valid results. Wait for an
     *            <code>AVAILABLE</code> status before performing operations.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TAINTED</code> - Stable state, ready to perform any
     *            operation. The stack has completed the requested operation but
     *            is not exactly what was requested. For example, a request to
     *            update to a new version failed and the stack rolled back to
     *            the current version.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ERROR</code> - An unexpected error occurred. The
     *            provisioned product exists but the stack is not running. For
     *            example, CloudFormation received a parameter value that was
     *            not valid and could not launch the stack.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan
     *            operations were performed to provision a new product, but
     *            resources have not yet been created. After reviewing the list
     *            of resources to be created, execute the plan. Wait for an
     *            <code>AVAILABLE</code> status before performing operations.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProvisionedProductStatus
     */
    public ProvisionedProductDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Stable state, ready to perform any operation.
     * The most recent operation succeeded and completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code> - Transitive state. Operations performed might
     * not have valid results. Wait for an <code>AVAILABLE</code> status before
     * performing operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TAINTED</code> - Stable state, ready to perform any operation. The
     * stack has completed the requested operation but is not exactly what was
     * requested. For example, a request to update to a new version failed and
     * the stack rolled back to the current version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An unexpected error occurred. The provisioned
     * product exists but the stack is not running. For example, CloudFormation
     * received a parameter value that was not valid and could not launch the
     * stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations
     * were performed to provision a new product, but resources have not yet
     * been created. After reviewing the list of resources to be created,
     * execute the plan. Wait for an <code>AVAILABLE</code> status before
     * performing operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNDER_CHANGE, TAINTED, ERROR,
     * PLAN_IN_PROGRESS
     *
     * @param status <p>
     *            The current status of the provisioned product.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AVAILABLE</code> - Stable state, ready to perform any
     *            operation. The most recent operation succeeded and completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UNDER_CHANGE</code> - Transitive state. Operations
     *            performed might not have valid results. Wait for an
     *            <code>AVAILABLE</code> status before performing operations.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TAINTED</code> - Stable state, ready to perform any
     *            operation. The stack has completed the requested operation but
     *            is not exactly what was requested. For example, a request to
     *            update to a new version failed and the stack rolled back to
     *            the current version.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ERROR</code> - An unexpected error occurred. The
     *            provisioned product exists but the stack is not running. For
     *            example, CloudFormation received a parameter value that was
     *            not valid and could not launch the stack.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan
     *            operations were performed to provision a new product, but
     *            resources have not yet been created. After reviewing the list
     *            of resources to be created, execute the plan. Wait for an
     *            <code>AVAILABLE</code> status before performing operations.
     *            </p>
     *            </li>
     *            </ul>
     * @see ProvisionedProductStatus
     */
    public void setStatus(ProvisionedProductStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the provisioned product.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Stable state, ready to perform any operation.
     * The most recent operation succeeded and completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code> - Transitive state. Operations performed might
     * not have valid results. Wait for an <code>AVAILABLE</code> status before
     * performing operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TAINTED</code> - Stable state, ready to perform any operation. The
     * stack has completed the requested operation but is not exactly what was
     * requested. For example, a request to update to a new version failed and
     * the stack rolled back to the current version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ERROR</code> - An unexpected error occurred. The provisioned
     * product exists but the stack is not running. For example, CloudFormation
     * received a parameter value that was not valid and could not launch the
     * stack.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan operations
     * were performed to provision a new product, but resources have not yet
     * been created. After reviewing the list of resources to be created,
     * execute the plan. Wait for an <code>AVAILABLE</code> status before
     * performing operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNDER_CHANGE, TAINTED, ERROR,
     * PLAN_IN_PROGRESS
     *
     * @param status <p>
     *            The current status of the provisioned product.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>AVAILABLE</code> - Stable state, ready to perform any
     *            operation. The most recent operation succeeded and completed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UNDER_CHANGE</code> - Transitive state. Operations
     *            performed might not have valid results. Wait for an
     *            <code>AVAILABLE</code> status before performing operations.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TAINTED</code> - Stable state, ready to perform any
     *            operation. The stack has completed the requested operation but
     *            is not exactly what was requested. For example, a request to
     *            update to a new version failed and the stack rolled back to
     *            the current version.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ERROR</code> - An unexpected error occurred. The
     *            provisioned product exists but the stack is not running. For
     *            example, CloudFormation received a parameter value that was
     *            not valid and could not launch the stack.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PLAN_IN_PROGRESS</code> - Transitive state. The plan
     *            operations were performed to provision a new product, but
     *            resources have not yet been created. After reviewing the list
     *            of resources to be created, execute the plan. Wait for an
     *            <code>AVAILABLE</code> status before performing operations.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProvisionedProductStatus
     */
    public ProvisionedProductDetail withStatus(ProvisionedProductStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The current status message of the provisioned product.
     * </p>
     *
     * @return <p>
     *         The current status message of the provisioned product.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * The current status message of the provisioned product.
     * </p>
     *
     * @param statusMessage <p>
     *            The current status message of the provisioned product.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The current status message of the provisioned product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            The current status message of the provisioned product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductDetail withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     *
     * @return <p>
     *         The UTC time stamp of the creation time.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     *
     * @param createdTime <p>
     *            The UTC time stamp of the creation time.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The UTC time stamp of the creation time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductDetail withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple
     * requests differ only by the idempotency token, the same response is
     * returned for each repeated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @return <p>
     *         A unique identifier that you provide to ensure idempotency. If
     *         multiple requests differ only by the idempotency token, the same
     *         response is returned for each repeated request.
     *         </p>
     */
    public String getIdempotencyToken() {
        return idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple
     * requests differ only by the idempotency token, the same response is
     * returned for each repeated request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param idempotencyToken <p>
     *            A unique identifier that you provide to ensure idempotency. If
     *            multiple requests differ only by the idempotency token, the
     *            same response is returned for each repeated request.
     *            </p>
     */
    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If multiple
     * requests differ only by the idempotency token, the same response is
     * returned for each repeated request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9_-]*<br/>
     *
     * @param idempotencyToken <p>
     *            A unique identifier that you provide to ensure idempotency. If
     *            multiple requests differ only by the idempotency token, the
     *            same response is returned for each repeated request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductDetail withIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
        return this;
    }

    /**
     * <p>
     * The record identifier of the last request performed on this provisioned
     * product.
     * </p>
     *
     * @return <p>
     *         The record identifier of the last request performed on this
     *         provisioned product.
     *         </p>
     */
    public String getLastRecordId() {
        return lastRecordId;
    }

    /**
     * <p>
     * The record identifier of the last request performed on this provisioned
     * product.
     * </p>
     *
     * @param lastRecordId <p>
     *            The record identifier of the last request performed on this
     *            provisioned product.
     *            </p>
     */
    public void setLastRecordId(String lastRecordId) {
        this.lastRecordId = lastRecordId;
    }

    /**
     * <p>
     * The record identifier of the last request performed on this provisioned
     * product.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastRecordId <p>
     *            The record identifier of the last request performed on this
     *            provisioned product.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductDetail withLastRecordId(String lastRecordId) {
        this.lastRecordId = lastRecordId;
        return this;
    }

    /**
     * <p>
     * The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The product identifier. For example,
     *         <code>prod-abcdzk7xy33qa</code>.
     *         </p>
     */
    public String getProductId() {
        return productId;
    }

    /**
     * <p>
     * The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param productId <p>
     *            The product identifier. For example,
     *            <code>prod-abcdzk7xy33qa</code>.
     *            </p>
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier. For example, <code>prod-abcdzk7xy33qa</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param productId <p>
     *            The product identifier. For example,
     *            <code>prod-abcdzk7xy33qa</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductDetail withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. For example,
     * <code>pa-4abcdjnxjj6ne</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the provisioning artifact. For example,
     *         <code>pa-4abcdjnxjj6ne</code>.
     *         </p>
     */
    public String getProvisioningArtifactId() {
        return provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. For example,
     * <code>pa-4abcdjnxjj6ne</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisioningArtifactId <p>
     *            The identifier of the provisioning artifact. For example,
     *            <code>pa-4abcdjnxjj6ne</code>.
     *            </p>
     */
    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact. For example,
     * <code>pa-4abcdjnxjj6ne</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisioningArtifactId <p>
     *            The identifier of the provisioning artifact. For example,
     *            <code>pa-4abcdjnxjj6ne</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedProductDetail withProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: " + getIdempotencyToken() + ",");
        if (getLastRecordId() != null)
            sb.append("LastRecordId: " + getLastRecordId() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: " + getProvisioningArtifactId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode
                + ((getLastRecordId() == null) ? 0 : getLastRecordId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionedProductDetail == false)
            return false;
        ProvisionedProductDetail other = (ProvisionedProductDetail) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null
                && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        if (other.getLastRecordId() == null ^ this.getLastRecordId() == null)
            return false;
        if (other.getLastRecordId() != null
                && other.getLastRecordId().equals(this.getLastRecordId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null
                && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null
                && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        return true;
    }
}
