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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a constraint.
 * </p>
 */
public class CreateConstraintRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String acceptLanguage;

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String portfolioId;

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String productId;

    /**
     * <p>
     * The constraint parameters, in JSON format. The syntax depends on the
     * constraint type as follows:
     * </p>
     * <dl>
     * <dt>LAUNCH</dt>
     * <dd>
     * <p>
     * You are required to specify either the <code>RoleArn</code> or the
     * <code>LocalRoleName</code> but can't use both.
     * </p>
     * <p>
     * Specify the <code>RoleArn</code> property as follows:
     * </p>
     * <p>
     * <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     * </p>
     * <p>
     * Specify the <code>LocalRoleName</code> property as follows:
     * </p>
     * <p>
     * <code>{"LocalRoleName": "SCBasicLaunchRole"}</code>
     * </p>
     * <p>
     * If you specify the <code>LocalRoleName</code> property, when an account
     * uses the launch constraint, the IAM role with that name in the account
     * will be used. This allows launch-role constraints to be account-agnostic
     * so the administrator can create fewer resources per shared account.
     * </p>
     * <note>
     * <p>
     * The given role name must exist in the account used to create the launch
     * constraint and the account of the user who launches a product with this
     * launch constraint.
     * </p>
     * </note>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code>
     * constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>LAUNCH</code> constraint on a
     * product and portfolio.
     * </p>
     * </dd>
     * <dt>NOTIFICATION</dt>
     * <dd>
     * <p>
     * Specify the <code>NotificationArns</code> property as follows:
     * </p>
     * <p>
     * <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     * </p>
     * </dd>
     * <dt>RESOURCE_UPDATE</dt>
     * <dd>
     * <p>
     * Specify the <code>TagUpdatesOnProvisionedProduct</code> property as
     * follows:
     * </p>
     * <p>
     * <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     * </p>
     * <p>
     * The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string
     * value of <code>ALLOWED</code> or <code>NOT_ALLOWED</code>.
     * </p>
     * </dd>
     * <dt>STACKSET</dt>
     * <dd>
     * <p>
     * Specify the <code>Parameters</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     * </p>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code>
     * constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>STACKSET</code> constraint on a
     * product and portfolio.
     * </p>
     * <p>
     * Products with a <code>STACKSET</code> constraint will launch an AWS
     * CloudFormation stack set.
     * </p>
     * </dd>
     * <dt>TEMPLATE</dt>
     * <dd>
     * <p>
     * Specify the <code>Rules</code> property. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     * >Template Constraint Rules</a>.
     * </p>
     * </dd>
     * </dl>
     */
    private String parameters;

    /**
     * <p>
     * The type of constraint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_UPDATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKSET</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPLATE</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String type;

    /**
     * <p>
     * The description of the constraint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     */
    private String description;

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
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @return <p>
     *         The language code.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param acceptLanguage <p>
     *            The language code.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>en</code> - English (default)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>jp</code> - Japanese
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zh</code> - Chinese
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param acceptLanguage <p>
     *            The language code.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>en</code> - English (default)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>jp</code> - Japanese
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>zh</code> - Chinese
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConstraintRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The portfolio identifier.
     *         </p>
     */
    public String getPortfolioId() {
        return portfolioId;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param portfolioId <p>
     *            The portfolio identifier.
     *            </p>
     */
    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param portfolioId <p>
     *            The portfolio identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConstraintRequest withPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The product identifier.
     *         </p>
     */
    public String getProductId() {
        return productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param productId <p>
     *            The product identifier.
     *            </p>
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier.
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
     *            The product identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConstraintRequest withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * <p>
     * The constraint parameters, in JSON format. The syntax depends on the
     * constraint type as follows:
     * </p>
     * <dl>
     * <dt>LAUNCH</dt>
     * <dd>
     * <p>
     * You are required to specify either the <code>RoleArn</code> or the
     * <code>LocalRoleName</code> but can't use both.
     * </p>
     * <p>
     * Specify the <code>RoleArn</code> property as follows:
     * </p>
     * <p>
     * <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     * </p>
     * <p>
     * Specify the <code>LocalRoleName</code> property as follows:
     * </p>
     * <p>
     * <code>{"LocalRoleName": "SCBasicLaunchRole"}</code>
     * </p>
     * <p>
     * If you specify the <code>LocalRoleName</code> property, when an account
     * uses the launch constraint, the IAM role with that name in the account
     * will be used. This allows launch-role constraints to be account-agnostic
     * so the administrator can create fewer resources per shared account.
     * </p>
     * <note>
     * <p>
     * The given role name must exist in the account used to create the launch
     * constraint and the account of the user who launches a product with this
     * launch constraint.
     * </p>
     * </note>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code>
     * constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>LAUNCH</code> constraint on a
     * product and portfolio.
     * </p>
     * </dd>
     * <dt>NOTIFICATION</dt>
     * <dd>
     * <p>
     * Specify the <code>NotificationArns</code> property as follows:
     * </p>
     * <p>
     * <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     * </p>
     * </dd>
     * <dt>RESOURCE_UPDATE</dt>
     * <dd>
     * <p>
     * Specify the <code>TagUpdatesOnProvisionedProduct</code> property as
     * follows:
     * </p>
     * <p>
     * <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     * </p>
     * <p>
     * The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string
     * value of <code>ALLOWED</code> or <code>NOT_ALLOWED</code>.
     * </p>
     * </dd>
     * <dt>STACKSET</dt>
     * <dd>
     * <p>
     * Specify the <code>Parameters</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     * </p>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code>
     * constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>STACKSET</code> constraint on a
     * product and portfolio.
     * </p>
     * <p>
     * Products with a <code>STACKSET</code> constraint will launch an AWS
     * CloudFormation stack set.
     * </p>
     * </dd>
     * <dt>TEMPLATE</dt>
     * <dd>
     * <p>
     * Specify the <code>Rules</code> property. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     * >Template Constraint Rules</a>.
     * </p>
     * </dd>
     * </dl>
     *
     * @return <p>
     *         The constraint parameters, in JSON format. The syntax depends on
     *         the constraint type as follows:
     *         </p>
     *         <dl>
     *         <dt>LAUNCH</dt>
     *         <dd>
     *         <p>
     *         You are required to specify either the <code>RoleArn</code> or
     *         the <code>LocalRoleName</code> but can't use both.
     *         </p>
     *         <p>
     *         Specify the <code>RoleArn</code> property as follows:
     *         </p>
     *         <p>
     *         <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     *         </p>
     *         <p>
     *         Specify the <code>LocalRoleName</code> property as follows:
     *         </p>
     *         <p>
     *         <code>{"LocalRoleName": "SCBasicLaunchRole"}</code>
     *         </p>
     *         <p>
     *         If you specify the <code>LocalRoleName</code> property, when an
     *         account uses the launch constraint, the IAM role with that name
     *         in the account will be used. This allows launch-role constraints
     *         to be account-agnostic so the administrator can create fewer
     *         resources per shared account.
     *         </p>
     *         <note>
     *         <p>
     *         The given role name must exist in the account used to create the
     *         launch constraint and the account of the user who launches a
     *         product with this launch constraint.
     *         </p>
     *         </note>
     *         <p>
     *         You cannot have both a <code>LAUNCH</code> and a
     *         <code>STACKSET</code> constraint.
     *         </p>
     *         <p>
     *         You also cannot have more than one <code>LAUNCH</code> constraint
     *         on a product and portfolio.
     *         </p>
     *         </dd>
     *         <dt>NOTIFICATION</dt>
     *         <dd>
     *         <p>
     *         Specify the <code>NotificationArns</code> property as follows:
     *         </p>
     *         <p>
     *         <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     *         </p>
     *         </dd>
     *         <dt>RESOURCE_UPDATE</dt>
     *         <dd>
     *         <p>
     *         Specify the <code>TagUpdatesOnProvisionedProduct</code> property
     *         as follows:
     *         </p>
     *         <p>
     *         <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     *         </p>
     *         <p>
     *         The <code>TagUpdatesOnProvisionedProduct</code> property accepts
     *         a string value of <code>ALLOWED</code> or
     *         <code>NOT_ALLOWED</code>.
     *         </p>
     *         </dd>
     *         <dt>STACKSET</dt>
     *         <dd>
     *         <p>
     *         Specify the <code>Parameters</code> property as follows:
     *         </p>
     *         <p>
     *         <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     *         </p>
     *         <p>
     *         You cannot have both a <code>LAUNCH</code> and a
     *         <code>STACKSET</code> constraint.
     *         </p>
     *         <p>
     *         You also cannot have more than one <code>STACKSET</code>
     *         constraint on a product and portfolio.
     *         </p>
     *         <p>
     *         Products with a <code>STACKSET</code> constraint will launch an
     *         AWS CloudFormation stack set.
     *         </p>
     *         </dd>
     *         <dt>TEMPLATE</dt>
     *         <dd>
     *         <p>
     *         Specify the <code>Rules</code> property. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     *         >Template Constraint Rules</a>.
     *         </p>
     *         </dd>
     *         </dl>
     */
    public String getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The constraint parameters, in JSON format. The syntax depends on the
     * constraint type as follows:
     * </p>
     * <dl>
     * <dt>LAUNCH</dt>
     * <dd>
     * <p>
     * You are required to specify either the <code>RoleArn</code> or the
     * <code>LocalRoleName</code> but can't use both.
     * </p>
     * <p>
     * Specify the <code>RoleArn</code> property as follows:
     * </p>
     * <p>
     * <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     * </p>
     * <p>
     * Specify the <code>LocalRoleName</code> property as follows:
     * </p>
     * <p>
     * <code>{"LocalRoleName": "SCBasicLaunchRole"}</code>
     * </p>
     * <p>
     * If you specify the <code>LocalRoleName</code> property, when an account
     * uses the launch constraint, the IAM role with that name in the account
     * will be used. This allows launch-role constraints to be account-agnostic
     * so the administrator can create fewer resources per shared account.
     * </p>
     * <note>
     * <p>
     * The given role name must exist in the account used to create the launch
     * constraint and the account of the user who launches a product with this
     * launch constraint.
     * </p>
     * </note>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code>
     * constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>LAUNCH</code> constraint on a
     * product and portfolio.
     * </p>
     * </dd>
     * <dt>NOTIFICATION</dt>
     * <dd>
     * <p>
     * Specify the <code>NotificationArns</code> property as follows:
     * </p>
     * <p>
     * <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     * </p>
     * </dd>
     * <dt>RESOURCE_UPDATE</dt>
     * <dd>
     * <p>
     * Specify the <code>TagUpdatesOnProvisionedProduct</code> property as
     * follows:
     * </p>
     * <p>
     * <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     * </p>
     * <p>
     * The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string
     * value of <code>ALLOWED</code> or <code>NOT_ALLOWED</code>.
     * </p>
     * </dd>
     * <dt>STACKSET</dt>
     * <dd>
     * <p>
     * Specify the <code>Parameters</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     * </p>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code>
     * constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>STACKSET</code> constraint on a
     * product and portfolio.
     * </p>
     * <p>
     * Products with a <code>STACKSET</code> constraint will launch an AWS
     * CloudFormation stack set.
     * </p>
     * </dd>
     * <dt>TEMPLATE</dt>
     * <dd>
     * <p>
     * Specify the <code>Rules</code> property. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     * >Template Constraint Rules</a>.
     * </p>
     * </dd>
     * </dl>
     *
     * @param parameters <p>
     *            The constraint parameters, in JSON format. The syntax depends
     *            on the constraint type as follows:
     *            </p>
     *            <dl>
     *            <dt>LAUNCH</dt>
     *            <dd>
     *            <p>
     *            You are required to specify either the <code>RoleArn</code> or
     *            the <code>LocalRoleName</code> but can't use both.
     *            </p>
     *            <p>
     *            Specify the <code>RoleArn</code> property as follows:
     *            </p>
     *            <p>
     *            <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     *            </p>
     *            <p>
     *            Specify the <code>LocalRoleName</code> property as follows:
     *            </p>
     *            <p>
     *            <code>{"LocalRoleName": "SCBasicLaunchRole"}</code>
     *            </p>
     *            <p>
     *            If you specify the <code>LocalRoleName</code> property, when
     *            an account uses the launch constraint, the IAM role with that
     *            name in the account will be used. This allows launch-role
     *            constraints to be account-agnostic so the administrator can
     *            create fewer resources per shared account.
     *            </p>
     *            <note>
     *            <p>
     *            The given role name must exist in the account used to create
     *            the launch constraint and the account of the user who launches
     *            a product with this launch constraint.
     *            </p>
     *            </note>
     *            <p>
     *            You cannot have both a <code>LAUNCH</code> and a
     *            <code>STACKSET</code> constraint.
     *            </p>
     *            <p>
     *            You also cannot have more than one <code>LAUNCH</code>
     *            constraint on a product and portfolio.
     *            </p>
     *            </dd>
     *            <dt>NOTIFICATION</dt>
     *            <dd>
     *            <p>
     *            Specify the <code>NotificationArns</code> property as follows:
     *            </p>
     *            <p>
     *            <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     *            </p>
     *            </dd>
     *            <dt>RESOURCE_UPDATE</dt>
     *            <dd>
     *            <p>
     *            Specify the <code>TagUpdatesOnProvisionedProduct</code>
     *            property as follows:
     *            </p>
     *            <p>
     *            <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     *            </p>
     *            <p>
     *            The <code>TagUpdatesOnProvisionedProduct</code> property
     *            accepts a string value of <code>ALLOWED</code> or
     *            <code>NOT_ALLOWED</code>.
     *            </p>
     *            </dd>
     *            <dt>STACKSET</dt>
     *            <dd>
     *            <p>
     *            Specify the <code>Parameters</code> property as follows:
     *            </p>
     *            <p>
     *            <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     *            </p>
     *            <p>
     *            You cannot have both a <code>LAUNCH</code> and a
     *            <code>STACKSET</code> constraint.
     *            </p>
     *            <p>
     *            You also cannot have more than one <code>STACKSET</code>
     *            constraint on a product and portfolio.
     *            </p>
     *            <p>
     *            Products with a <code>STACKSET</code> constraint will launch
     *            an AWS CloudFormation stack set.
     *            </p>
     *            </dd>
     *            <dt>TEMPLATE</dt>
     *            <dd>
     *            <p>
     *            Specify the <code>Rules</code> property. For more information,
     *            see <a href=
     *            "http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     *            >Template Constraint Rules</a>.
     *            </p>
     *            </dd>
     *            </dl>
     */
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The constraint parameters, in JSON format. The syntax depends on the
     * constraint type as follows:
     * </p>
     * <dl>
     * <dt>LAUNCH</dt>
     * <dd>
     * <p>
     * You are required to specify either the <code>RoleArn</code> or the
     * <code>LocalRoleName</code> but can't use both.
     * </p>
     * <p>
     * Specify the <code>RoleArn</code> property as follows:
     * </p>
     * <p>
     * <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     * </p>
     * <p>
     * Specify the <code>LocalRoleName</code> property as follows:
     * </p>
     * <p>
     * <code>{"LocalRoleName": "SCBasicLaunchRole"}</code>
     * </p>
     * <p>
     * If you specify the <code>LocalRoleName</code> property, when an account
     * uses the launch constraint, the IAM role with that name in the account
     * will be used. This allows launch-role constraints to be account-agnostic
     * so the administrator can create fewer resources per shared account.
     * </p>
     * <note>
     * <p>
     * The given role name must exist in the account used to create the launch
     * constraint and the account of the user who launches a product with this
     * launch constraint.
     * </p>
     * </note>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code>
     * constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>LAUNCH</code> constraint on a
     * product and portfolio.
     * </p>
     * </dd>
     * <dt>NOTIFICATION</dt>
     * <dd>
     * <p>
     * Specify the <code>NotificationArns</code> property as follows:
     * </p>
     * <p>
     * <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     * </p>
     * </dd>
     * <dt>RESOURCE_UPDATE</dt>
     * <dd>
     * <p>
     * Specify the <code>TagUpdatesOnProvisionedProduct</code> property as
     * follows:
     * </p>
     * <p>
     * <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     * </p>
     * <p>
     * The <code>TagUpdatesOnProvisionedProduct</code> property accepts a string
     * value of <code>ALLOWED</code> or <code>NOT_ALLOWED</code>.
     * </p>
     * </dd>
     * <dt>STACKSET</dt>
     * <dd>
     * <p>
     * Specify the <code>Parameters</code> property as follows:
     * </p>
     * <p>
     * <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     * </p>
     * <p>
     * You cannot have both a <code>LAUNCH</code> and a <code>STACKSET</code>
     * constraint.
     * </p>
     * <p>
     * You also cannot have more than one <code>STACKSET</code> constraint on a
     * product and portfolio.
     * </p>
     * <p>
     * Products with a <code>STACKSET</code> constraint will launch an AWS
     * CloudFormation stack set.
     * </p>
     * </dd>
     * <dt>TEMPLATE</dt>
     * <dd>
     * <p>
     * Specify the <code>Rules</code> property. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     * >Template Constraint Rules</a>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            The constraint parameters, in JSON format. The syntax depends
     *            on the constraint type as follows:
     *            </p>
     *            <dl>
     *            <dt>LAUNCH</dt>
     *            <dd>
     *            <p>
     *            You are required to specify either the <code>RoleArn</code> or
     *            the <code>LocalRoleName</code> but can't use both.
     *            </p>
     *            <p>
     *            Specify the <code>RoleArn</code> property as follows:
     *            </p>
     *            <p>
     *            <code>{"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}</code>
     *            </p>
     *            <p>
     *            Specify the <code>LocalRoleName</code> property as follows:
     *            </p>
     *            <p>
     *            <code>{"LocalRoleName": "SCBasicLaunchRole"}</code>
     *            </p>
     *            <p>
     *            If you specify the <code>LocalRoleName</code> property, when
     *            an account uses the launch constraint, the IAM role with that
     *            name in the account will be used. This allows launch-role
     *            constraints to be account-agnostic so the administrator can
     *            create fewer resources per shared account.
     *            </p>
     *            <note>
     *            <p>
     *            The given role name must exist in the account used to create
     *            the launch constraint and the account of the user who launches
     *            a product with this launch constraint.
     *            </p>
     *            </note>
     *            <p>
     *            You cannot have both a <code>LAUNCH</code> and a
     *            <code>STACKSET</code> constraint.
     *            </p>
     *            <p>
     *            You also cannot have more than one <code>LAUNCH</code>
     *            constraint on a product and portfolio.
     *            </p>
     *            </dd>
     *            <dt>NOTIFICATION</dt>
     *            <dd>
     *            <p>
     *            Specify the <code>NotificationArns</code> property as follows:
     *            </p>
     *            <p>
     *            <code>{"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}</code>
     *            </p>
     *            </dd>
     *            <dt>RESOURCE_UPDATE</dt>
     *            <dd>
     *            <p>
     *            Specify the <code>TagUpdatesOnProvisionedProduct</code>
     *            property as follows:
     *            </p>
     *            <p>
     *            <code>{"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}</code>
     *            </p>
     *            <p>
     *            The <code>TagUpdatesOnProvisionedProduct</code> property
     *            accepts a string value of <code>ALLOWED</code> or
     *            <code>NOT_ALLOWED</code>.
     *            </p>
     *            </dd>
     *            <dt>STACKSET</dt>
     *            <dd>
     *            <p>
     *            Specify the <code>Parameters</code> property as follows:
     *            </p>
     *            <p>
     *            <code>{"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}</code>
     *            </p>
     *            <p>
     *            You cannot have both a <code>LAUNCH</code> and a
     *            <code>STACKSET</code> constraint.
     *            </p>
     *            <p>
     *            You also cannot have more than one <code>STACKSET</code>
     *            constraint on a product and portfolio.
     *            </p>
     *            <p>
     *            Products with a <code>STACKSET</code> constraint will launch
     *            an AWS CloudFormation stack set.
     *            </p>
     *            </dd>
     *            <dt>TEMPLATE</dt>
     *            <dd>
     *            <p>
     *            Specify the <code>Rules</code> property. For more information,
     *            see <a href=
     *            "http://docs.aws.amazon.com/servicecatalog/latest/adminguide/reference-template_constraint_rules.html"
     *            >Template Constraint Rules</a>.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConstraintRequest withParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * The type of constraint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_UPDATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKSET</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPLATE</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The type of constraint.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LAUNCH</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOTIFICATION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESOURCE_UPDATE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STACKSET</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TEMPLATE</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of constraint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_UPDATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKSET</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPLATE</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param type <p>
     *            The type of constraint.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LAUNCH</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOTIFICATION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESOURCE_UPDATE</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STACKSET</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TEMPLATE</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of constraint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESOURCE_UPDATE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STACKSET</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPLATE</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param type <p>
     *            The type of constraint.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LAUNCH</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOTIFICATION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESOURCE_UPDATE</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>STACKSET</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TEMPLATE</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConstraintRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The description of the constraint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @return <p>
     *         The description of the constraint.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the constraint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param description <p>
     *            The description of the constraint.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the constraint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param description <p>
     *            The description of the constraint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateConstraintRequest withDescription(String description) {
        this.description = description;
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
    public CreateConstraintRequest withIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: " + getAcceptLanguage() + ",");
        if (getPortfolioId() != null)
            sb.append("PortfolioId: " + getPortfolioId() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: " + getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode
                + ((getPortfolioId() == null) ? 0 : getPortfolioId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConstraintRequest == false)
            return false;
        CreateConstraintRequest other = (CreateConstraintRequest) obj;

        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getPortfolioId() == null ^ this.getPortfolioId() == null)
            return false;
        if (other.getPortfolioId() != null
                && other.getPortfolioId().equals(this.getPortfolioId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null
                && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null
                && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }
}
