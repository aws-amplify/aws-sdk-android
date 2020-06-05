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
 * Creates a self-service action.
 * </p>
 */
public class CreateServiceActionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The self-service action name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]*<br/>
     */
    private String name;

    /**
     * <p>
     * The service action definition type. For example,
     * <code>SSM_AUTOMATION</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSM_AUTOMATION
     */
    private String definitionType;

    /**
     * <p>
     * The self-service action definition. Can be one of the following:
     * </p>
     * <dl>
     * <dt>Name</dt>
     * <dd>
     * <p>
     * The name of the AWS Systems Manager document (SSM document). For example,
     * <code>AWS-RestartEC2Instance</code>.
     * </p>
     * <p>
     * If you are using a shared SSM document, you must provide the ARN instead
     * of the name.
     * </p>
     * </dd>
     * <dt>Version</dt>
     * <dd>
     * <p>
     * The AWS Systems Manager automation document version. For example,
     * <code>"Version": "1"</code>
     * </p>
     * </dd>
     * <dt>AssumeRole</dt>
     * <dd>
     * <p>
     * The Amazon Resource Name (ARN) of the role that performs the self-service
     * actions on your behalf. For example,
     * <code>"AssumeRole": "arn:aws:iam::12345678910:role/ActionRole"</code>.
     * </p>
     * <p>
     * To reuse the provisioned product launch role, set to
     * <code>"AssumeRole": "LAUNCH_ROLE"</code>.
     * </p>
     * </dd>
     * <dt>Parameters</dt>
     * <dd>
     * <p>
     * The list of parameters in JSON format.
     * </p>
     * <p>
     * For example: <code>[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]</code>
     * or <code>[{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}]</code>.
     * </p>
     * </dd>
     * </dl>
     */
    private java.util.Map<String, String> definition;

    /**
     * <p>
     * The self-service action description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String description;

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
     * The self-service action name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]*<br/>
     *
     * @return <p>
     *         The self-service action name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The self-service action name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]*<br/>
     *
     * @param name <p>
     *            The self-service action name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The self-service action name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]*<br/>
     *
     * @param name <p>
     *            The self-service action name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceActionRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The service action definition type. For example,
     * <code>SSM_AUTOMATION</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSM_AUTOMATION
     *
     * @return <p>
     *         The service action definition type. For example,
     *         <code>SSM_AUTOMATION</code>.
     *         </p>
     * @see ServiceActionDefinitionType
     */
    public String getDefinitionType() {
        return definitionType;
    }

    /**
     * <p>
     * The service action definition type. For example,
     * <code>SSM_AUTOMATION</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSM_AUTOMATION
     *
     * @param definitionType <p>
     *            The service action definition type. For example,
     *            <code>SSM_AUTOMATION</code>.
     *            </p>
     * @see ServiceActionDefinitionType
     */
    public void setDefinitionType(String definitionType) {
        this.definitionType = definitionType;
    }

    /**
     * <p>
     * The service action definition type. For example,
     * <code>SSM_AUTOMATION</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSM_AUTOMATION
     *
     * @param definitionType <p>
     *            The service action definition type. For example,
     *            <code>SSM_AUTOMATION</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceActionDefinitionType
     */
    public CreateServiceActionRequest withDefinitionType(String definitionType) {
        this.definitionType = definitionType;
        return this;
    }

    /**
     * <p>
     * The service action definition type. For example,
     * <code>SSM_AUTOMATION</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSM_AUTOMATION
     *
     * @param definitionType <p>
     *            The service action definition type. For example,
     *            <code>SSM_AUTOMATION</code>.
     *            </p>
     * @see ServiceActionDefinitionType
     */
    public void setDefinitionType(ServiceActionDefinitionType definitionType) {
        this.definitionType = definitionType.toString();
    }

    /**
     * <p>
     * The service action definition type. For example,
     * <code>SSM_AUTOMATION</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SSM_AUTOMATION
     *
     * @param definitionType <p>
     *            The service action definition type. For example,
     *            <code>SSM_AUTOMATION</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceActionDefinitionType
     */
    public CreateServiceActionRequest withDefinitionType(ServiceActionDefinitionType definitionType) {
        this.definitionType = definitionType.toString();
        return this;
    }

    /**
     * <p>
     * The self-service action definition. Can be one of the following:
     * </p>
     * <dl>
     * <dt>Name</dt>
     * <dd>
     * <p>
     * The name of the AWS Systems Manager document (SSM document). For example,
     * <code>AWS-RestartEC2Instance</code>.
     * </p>
     * <p>
     * If you are using a shared SSM document, you must provide the ARN instead
     * of the name.
     * </p>
     * </dd>
     * <dt>Version</dt>
     * <dd>
     * <p>
     * The AWS Systems Manager automation document version. For example,
     * <code>"Version": "1"</code>
     * </p>
     * </dd>
     * <dt>AssumeRole</dt>
     * <dd>
     * <p>
     * The Amazon Resource Name (ARN) of the role that performs the self-service
     * actions on your behalf. For example,
     * <code>"AssumeRole": "arn:aws:iam::12345678910:role/ActionRole"</code>.
     * </p>
     * <p>
     * To reuse the provisioned product launch role, set to
     * <code>"AssumeRole": "LAUNCH_ROLE"</code>.
     * </p>
     * </dd>
     * <dt>Parameters</dt>
     * <dd>
     * <p>
     * The list of parameters in JSON format.
     * </p>
     * <p>
     * For example: <code>[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]</code>
     * or <code>[{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}]</code>.
     * </p>
     * </dd>
     * </dl>
     *
     * @return <p>
     *         The self-service action definition. Can be one of the following:
     *         </p>
     *         <dl>
     *         <dt>Name</dt>
     *         <dd>
     *         <p>
     *         The name of the AWS Systems Manager document (SSM document). For
     *         example, <code>AWS-RestartEC2Instance</code>.
     *         </p>
     *         <p>
     *         If you are using a shared SSM document, you must provide the ARN
     *         instead of the name.
     *         </p>
     *         </dd>
     *         <dt>Version</dt>
     *         <dd>
     *         <p>
     *         The AWS Systems Manager automation document version. For example,
     *         <code>"Version": "1"</code>
     *         </p>
     *         </dd>
     *         <dt>AssumeRole</dt>
     *         <dd>
     *         <p>
     *         The Amazon Resource Name (ARN) of the role that performs the
     *         self-service actions on your behalf. For example,
     *         <code>"AssumeRole": "arn:aws:iam::12345678910:role/ActionRole"</code>
     *         .
     *         </p>
     *         <p>
     *         To reuse the provisioned product launch role, set to
     *         <code>"AssumeRole": "LAUNCH_ROLE"</code>.
     *         </p>
     *         </dd>
     *         <dt>Parameters</dt>
     *         <dd>
     *         <p>
     *         The list of parameters in JSON format.
     *         </p>
     *         <p>
     *         For example:
     *         <code>[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]</code> or
     *         <code>[{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}]</code>.
     *         </p>
     *         </dd>
     *         </dl>
     */
    public java.util.Map<String, String> getDefinition() {
        return definition;
    }

    /**
     * <p>
     * The self-service action definition. Can be one of the following:
     * </p>
     * <dl>
     * <dt>Name</dt>
     * <dd>
     * <p>
     * The name of the AWS Systems Manager document (SSM document). For example,
     * <code>AWS-RestartEC2Instance</code>.
     * </p>
     * <p>
     * If you are using a shared SSM document, you must provide the ARN instead
     * of the name.
     * </p>
     * </dd>
     * <dt>Version</dt>
     * <dd>
     * <p>
     * The AWS Systems Manager automation document version. For example,
     * <code>"Version": "1"</code>
     * </p>
     * </dd>
     * <dt>AssumeRole</dt>
     * <dd>
     * <p>
     * The Amazon Resource Name (ARN) of the role that performs the self-service
     * actions on your behalf. For example,
     * <code>"AssumeRole": "arn:aws:iam::12345678910:role/ActionRole"</code>.
     * </p>
     * <p>
     * To reuse the provisioned product launch role, set to
     * <code>"AssumeRole": "LAUNCH_ROLE"</code>.
     * </p>
     * </dd>
     * <dt>Parameters</dt>
     * <dd>
     * <p>
     * The list of parameters in JSON format.
     * </p>
     * <p>
     * For example: <code>[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]</code>
     * or <code>[{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}]</code>.
     * </p>
     * </dd>
     * </dl>
     *
     * @param definition <p>
     *            The self-service action definition. Can be one of the
     *            following:
     *            </p>
     *            <dl>
     *            <dt>Name</dt>
     *            <dd>
     *            <p>
     *            The name of the AWS Systems Manager document (SSM document).
     *            For example, <code>AWS-RestartEC2Instance</code>.
     *            </p>
     *            <p>
     *            If you are using a shared SSM document, you must provide the
     *            ARN instead of the name.
     *            </p>
     *            </dd>
     *            <dt>Version</dt>
     *            <dd>
     *            <p>
     *            The AWS Systems Manager automation document version. For
     *            example, <code>"Version": "1"</code>
     *            </p>
     *            </dd>
     *            <dt>AssumeRole</dt>
     *            <dd>
     *            <p>
     *            The Amazon Resource Name (ARN) of the role that performs the
     *            self-service actions on your behalf. For example,
     *            <code>"AssumeRole": "arn:aws:iam::12345678910:role/ActionRole"</code>
     *            .
     *            </p>
     *            <p>
     *            To reuse the provisioned product launch role, set to
     *            <code>"AssumeRole": "LAUNCH_ROLE"</code>.
     *            </p>
     *            </dd>
     *            <dt>Parameters</dt>
     *            <dd>
     *            <p>
     *            The list of parameters in JSON format.
     *            </p>
     *            <p>
     *            For example:
     *            <code>[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]</code>
     *            or
     *            <code>[{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}]</code>
     *            .
     *            </p>
     *            </dd>
     *            </dl>
     */
    public void setDefinition(java.util.Map<String, String> definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The self-service action definition. Can be one of the following:
     * </p>
     * <dl>
     * <dt>Name</dt>
     * <dd>
     * <p>
     * The name of the AWS Systems Manager document (SSM document). For example,
     * <code>AWS-RestartEC2Instance</code>.
     * </p>
     * <p>
     * If you are using a shared SSM document, you must provide the ARN instead
     * of the name.
     * </p>
     * </dd>
     * <dt>Version</dt>
     * <dd>
     * <p>
     * The AWS Systems Manager automation document version. For example,
     * <code>"Version": "1"</code>
     * </p>
     * </dd>
     * <dt>AssumeRole</dt>
     * <dd>
     * <p>
     * The Amazon Resource Name (ARN) of the role that performs the self-service
     * actions on your behalf. For example,
     * <code>"AssumeRole": "arn:aws:iam::12345678910:role/ActionRole"</code>.
     * </p>
     * <p>
     * To reuse the provisioned product launch role, set to
     * <code>"AssumeRole": "LAUNCH_ROLE"</code>.
     * </p>
     * </dd>
     * <dt>Parameters</dt>
     * <dd>
     * <p>
     * The list of parameters in JSON format.
     * </p>
     * <p>
     * For example: <code>[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]</code>
     * or <code>[{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}]</code>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param definition <p>
     *            The self-service action definition. Can be one of the
     *            following:
     *            </p>
     *            <dl>
     *            <dt>Name</dt>
     *            <dd>
     *            <p>
     *            The name of the AWS Systems Manager document (SSM document).
     *            For example, <code>AWS-RestartEC2Instance</code>.
     *            </p>
     *            <p>
     *            If you are using a shared SSM document, you must provide the
     *            ARN instead of the name.
     *            </p>
     *            </dd>
     *            <dt>Version</dt>
     *            <dd>
     *            <p>
     *            The AWS Systems Manager automation document version. For
     *            example, <code>"Version": "1"</code>
     *            </p>
     *            </dd>
     *            <dt>AssumeRole</dt>
     *            <dd>
     *            <p>
     *            The Amazon Resource Name (ARN) of the role that performs the
     *            self-service actions on your behalf. For example,
     *            <code>"AssumeRole": "arn:aws:iam::12345678910:role/ActionRole"</code>
     *            .
     *            </p>
     *            <p>
     *            To reuse the provisioned product launch role, set to
     *            <code>"AssumeRole": "LAUNCH_ROLE"</code>.
     *            </p>
     *            </dd>
     *            <dt>Parameters</dt>
     *            <dd>
     *            <p>
     *            The list of parameters in JSON format.
     *            </p>
     *            <p>
     *            For example:
     *            <code>[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]</code>
     *            or
     *            <code>[{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}]</code>
     *            .
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceActionRequest withDefinition(java.util.Map<String, String> definition) {
        this.definition = definition;
        return this;
    }

    /**
     * <p>
     * The self-service action definition. Can be one of the following:
     * </p>
     * <dl>
     * <dt>Name</dt>
     * <dd>
     * <p>
     * The name of the AWS Systems Manager document (SSM document). For example,
     * <code>AWS-RestartEC2Instance</code>.
     * </p>
     * <p>
     * If you are using a shared SSM document, you must provide the ARN instead
     * of the name.
     * </p>
     * </dd>
     * <dt>Version</dt>
     * <dd>
     * <p>
     * The AWS Systems Manager automation document version. For example,
     * <code>"Version": "1"</code>
     * </p>
     * </dd>
     * <dt>AssumeRole</dt>
     * <dd>
     * <p>
     * The Amazon Resource Name (ARN) of the role that performs the self-service
     * actions on your behalf. For example,
     * <code>"AssumeRole": "arn:aws:iam::12345678910:role/ActionRole"</code>.
     * </p>
     * <p>
     * To reuse the provisioned product launch role, set to
     * <code>"AssumeRole": "LAUNCH_ROLE"</code>.
     * </p>
     * </dd>
     * <dt>Parameters</dt>
     * <dd>
     * <p>
     * The list of parameters in JSON format.
     * </p>
     * <p>
     * For example: <code>[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}]</code>
     * or <code>[{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}]</code>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * The method adds a new key-value pair into Definition parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Definition.
     * @param value The corresponding value of the entry to be added into
     *            Definition.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceActionRequest addDefinitionEntry(String key, String value) {
        if (null == this.definition) {
            this.definition = new java.util.HashMap<String, String>();
        }
        if (this.definition.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.definition.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Definition.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateServiceActionRequest clearDefinitionEntries() {
        this.definition = null;
        return this;
    }

    /**
     * <p>
     * The self-service action description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The self-service action description.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The self-service action description.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param description <p>
     *            The self-service action description.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The self-service action description.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param description <p>
     *            The self-service action description.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateServiceActionRequest withDescription(String description) {
        this.description = description;
        return this;
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
    public CreateServiceActionRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
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
    public CreateServiceActionRequest withIdempotencyToken(String idempotencyToken) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDefinitionType() != null)
            sb.append("DefinitionType: " + getDefinitionType() + ",");
        if (getDefinition() != null)
            sb.append("Definition: " + getDefinition() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: " + getAcceptLanguage() + ",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: " + getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDefinitionType() == null) ? 0 : getDefinitionType().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
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

        if (obj instanceof CreateServiceActionRequest == false)
            return false;
        CreateServiceActionRequest other = (CreateServiceActionRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefinitionType() == null ^ this.getDefinitionType() == null)
            return false;
        if (other.getDefinitionType() != null
                && other.getDefinitionType().equals(this.getDefinitionType()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null
                && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null
                && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null
                && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }
}
