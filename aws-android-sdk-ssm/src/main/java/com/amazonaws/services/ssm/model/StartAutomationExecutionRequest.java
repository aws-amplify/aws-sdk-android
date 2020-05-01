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
 * Initiates execution of an Automation document.
 * </p>
 */
public class StartAutomationExecutionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the Automation document to use for this execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     */
    private String documentName;

    /**
     * <p>
     * The version of the Automation document to use for this execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>
     * A key-value map of execution parameters, which match the declared
     * parameters in the Automation document.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;

    /**
     * <p>
     * User-provided idempotency token. The token must be unique, is case
     * insensitive, enforces the UUID format, and can't be reused.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4
     * }-[a-fA-F0-9]{12}<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The execution mode of the automation. Valid modes include the following:
     * Auto and Interactive. The default mode is Auto.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     */
    private String mode;

    /**
     * <p>
     * The name of the parameter used as the target resource for the
     * rate-controlled execution. Required if you specify targets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String targetParameterName;

    /**
     * <p>
     * A key-value mapping to target resources. Required if you specify
     * TargetParameterName.
     * </p>
     */
    private java.util.List<Target> targets;

    /**
     * <p>
     * A key-value mapping of document parameters to target resources. Both
     * Targets and TargetMaps cannot be specified together.
     * </p>
     */
    private java.util.List<java.util.Map<String, java.util.List<String>>> targetMaps;

    /**
     * <p>
     * The maximum number of targets allowed to run this task in parallel. You
     * can specify a number, such as 10, or a percentage, such as 10%. The
     * default value is 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     */
    private String maxConcurrency;

    /**
     * <p>
     * The number of errors that are allowed before the system stops running the
     * automation on additional targets. You can specify either an absolute
     * number of errors, for example 10, or a percentage of the target set, for
     * example 10%. If you specify 3, for example, the system stops running the
     * automation when the fourth error is received. If you specify 0, then the
     * system stops running the automation on additional targets after the first
     * error result is returned. If you run an automation on 50 resources and
     * set max-errors to 10%, then the system stops running the automation on
     * additional targets when the sixth error is received.
     * </p>
     * <p>
     * Executions that are already running an automation when max-errors is
     * reached are allowed to complete, but some of these executions may fail as
     * well. If you need to ensure that there won't be more than max-errors
     * failed executions, set max-concurrency to 1 so the executions proceed one
     * at a time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     */
    private String maxErrors;

    /**
     * <p>
     * A location is a combination of AWS Regions and/or AWS accounts where you
     * want to run the Automation. Use this action to start an Automation in
     * multiple Regions and multiple accounts. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Running Automation workflows in multiple AWS Regions and accounts</a> in
     * the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private java.util.List<TargetLocation> targetLocations;

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can specify a
     * maximum of five tags for an automation. Tags enable you to categorize a
     * resource in different ways, such as by purpose, owner, or environment.
     * For example, you might want to tag an automation to identify an
     * environment or operating system. In this case, you could specify the
     * following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=environment,Value=test</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing patch baseline, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the Automation document to use for this execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the Automation document to use for this execution.
     *         </p>
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * <p>
     * The name of the Automation document to use for this execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param documentName <p>
     *            The name of the Automation document to use for this execution.
     *            </p>
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the Automation document to use for this execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param documentName <p>
     *            The name of the Automation document to use for this execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAutomationExecutionRequest withDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    /**
     * <p>
     * The version of the Automation document to use for this execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>
     *         The version of the Automation document to use for this execution.
     *         </p>
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * <p>
     * The version of the Automation document to use for this execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The version of the Automation document to use for this
     *            execution.
     *            </p>
     */
    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of the Automation document to use for this execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The version of the Automation document to use for this
     *            execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAutomationExecutionRequest withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>
     * A key-value map of execution parameters, which match the declared
     * parameters in the Automation document.
     * </p>
     *
     * @return <p>
     *         A key-value map of execution parameters, which match the declared
     *         parameters in the Automation document.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A key-value map of execution parameters, which match the declared
     * parameters in the Automation document.
     * </p>
     *
     * @param parameters <p>
     *            A key-value map of execution parameters, which match the
     *            declared parameters in the Automation document.
     *            </p>
     */
    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A key-value map of execution parameters, which match the declared
     * parameters in the Automation document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A key-value map of execution parameters, which match the
     *            declared parameters in the Automation document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAutomationExecutionRequest withParameters(
            java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * A key-value map of execution parameters, which match the declared
     * parameters in the Automation document.
     * </p>
     * <p>
     * The method adds a new key-value pair into Parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Parameters.
     * @param value The corresponding value of the entry to be added into
     *            Parameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAutomationExecutionRequest addParametersEntry(String key,
            java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public StartAutomationExecutionRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * User-provided idempotency token. The token must be unique, is case
     * insensitive, enforces the UUID format, and can't be reused.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4
     * }-[a-fA-F0-9]{12}<br/>
     *
     * @return <p>
     *         User-provided idempotency token. The token must be unique, is
     *         case insensitive, enforces the UUID format, and can't be reused.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token. The token must be unique, is case
     * insensitive, enforces the UUID format, and can't be reused.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4
     * }-[a-fA-F0-9]{12}<br/>
     *
     * @param clientToken <p>
     *            User-provided idempotency token. The token must be unique, is
     *            case insensitive, enforces the UUID format, and can't be
     *            reused.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token. The token must be unique, is case
     * insensitive, enforces the UUID format, and can't be reused.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4
     * }-[a-fA-F0-9]{12}<br/>
     *
     * @param clientToken <p>
     *            User-provided idempotency token. The token must be unique, is
     *            case insensitive, enforces the UUID format, and can't be
     *            reused.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAutomationExecutionRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The execution mode of the automation. Valid modes include the following:
     * Auto and Interactive. The default mode is Auto.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     *
     * @return <p>
     *         The execution mode of the automation. Valid modes include the
     *         following: Auto and Interactive. The default mode is Auto.
     *         </p>
     * @see ExecutionMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * The execution mode of the automation. Valid modes include the following:
     * Auto and Interactive. The default mode is Auto.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     *
     * @param mode <p>
     *            The execution mode of the automation. Valid modes include the
     *            following: Auto and Interactive. The default mode is Auto.
     *            </p>
     * @see ExecutionMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The execution mode of the automation. Valid modes include the following:
     * Auto and Interactive. The default mode is Auto.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     *
     * @param mode <p>
     *            The execution mode of the automation. Valid modes include the
     *            following: Auto and Interactive. The default mode is Auto.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExecutionMode
     */
    public StartAutomationExecutionRequest withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * The execution mode of the automation. Valid modes include the following:
     * Auto and Interactive. The default mode is Auto.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     *
     * @param mode <p>
     *            The execution mode of the automation. Valid modes include the
     *            following: Auto and Interactive. The default mode is Auto.
     *            </p>
     * @see ExecutionMode
     */
    public void setMode(ExecutionMode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * The execution mode of the automation. Valid modes include the following:
     * Auto and Interactive. The default mode is Auto.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Auto, Interactive
     *
     * @param mode <p>
     *            The execution mode of the automation. Valid modes include the
     *            following: Auto and Interactive. The default mode is Auto.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExecutionMode
     */
    public StartAutomationExecutionRequest withMode(ExecutionMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The name of the parameter used as the target resource for the
     * rate-controlled execution. Required if you specify targets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>
     *         The name of the parameter used as the target resource for the
     *         rate-controlled execution. Required if you specify targets.
     *         </p>
     */
    public String getTargetParameterName() {
        return targetParameterName;
    }

    /**
     * <p>
     * The name of the parameter used as the target resource for the
     * rate-controlled execution. Required if you specify targets.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param targetParameterName <p>
     *            The name of the parameter used as the target resource for the
     *            rate-controlled execution. Required if you specify targets.
     *            </p>
     */
    public void setTargetParameterName(String targetParameterName) {
        this.targetParameterName = targetParameterName;
    }

    /**
     * <p>
     * The name of the parameter used as the target resource for the
     * rate-controlled execution. Required if you specify targets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param targetParameterName <p>
     *            The name of the parameter used as the target resource for the
     *            rate-controlled execution. Required if you specify targets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAutomationExecutionRequest withTargetParameterName(String targetParameterName) {
        this.targetParameterName = targetParameterName;
        return this;
    }

    /**
     * <p>
     * A key-value mapping to target resources. Required if you specify
     * TargetParameterName.
     * </p>
     *
     * @return <p>
     *         A key-value mapping to target resources. Required if you specify
     *         TargetParameterName.
     *         </p>
     */
    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * A key-value mapping to target resources. Required if you specify
     * TargetParameterName.
     * </p>
     *
     * @param targets <p>
     *            A key-value mapping to target resources. Required if you
     *            specify TargetParameterName.
     *            </p>
     */
    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<Target>(targets);
    }

    /**
     * <p>
     * A key-value mapping to target resources. Required if you specify
     * TargetParameterName.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            A key-value mapping to target resources. Required if you
     *            specify TargetParameterName.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAutomationExecutionRequest withTargets(Target... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<Target>(targets.length);
        }
        for (Target value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A key-value mapping to target resources. Required if you specify
     * TargetParameterName.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            A key-value mapping to target resources. Required if you
     *            specify TargetParameterName.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAutomationExecutionRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * A key-value mapping of document parameters to target resources. Both
     * Targets and TargetMaps cannot be specified together.
     * </p>
     *
     * @return <p>
     *         A key-value mapping of document parameters to target resources.
     *         Both Targets and TargetMaps cannot be specified together.
     *         </p>
     */
    public java.util.List<java.util.Map<String, java.util.List<String>>> getTargetMaps() {
        return targetMaps;
    }

    /**
     * <p>
     * A key-value mapping of document parameters to target resources. Both
     * Targets and TargetMaps cannot be specified together.
     * </p>
     *
     * @param targetMaps <p>
     *            A key-value mapping of document parameters to target
     *            resources. Both Targets and TargetMaps cannot be specified
     *            together.
     *            </p>
     */
    public void setTargetMaps(
            java.util.Collection<java.util.Map<String, java.util.List<String>>> targetMaps) {
        if (targetMaps == null) {
            this.targetMaps = null;
            return;
        }

        this.targetMaps = new java.util.ArrayList<java.util.Map<String, java.util.List<String>>>(
                targetMaps);
    }

    /**
     * <p>
     * A key-value mapping of document parameters to target resources. Both
     * Targets and TargetMaps cannot be specified together.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetMaps <p>
     *            A key-value mapping of document parameters to target
     *            resources. Both Targets and TargetMaps cannot be specified
     *            together.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAutomationExecutionRequest withTargetMaps(
            java.util.Map<String, java.util.List<String>>... targetMaps) {
        if (getTargetMaps() == null) {
            this.targetMaps = new java.util.ArrayList<java.util.Map<String, java.util.List<String>>>(
                    targetMaps.length);
        }
        for (java.util.Map<String, java.util.List<String>> value : targetMaps) {
            this.targetMaps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A key-value mapping of document parameters to target resources. Both
     * Targets and TargetMaps cannot be specified together.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetMaps <p>
     *            A key-value mapping of document parameters to target
     *            resources. Both Targets and TargetMaps cannot be specified
     *            together.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAutomationExecutionRequest withTargetMaps(
            java.util.Collection<java.util.Map<String, java.util.List<String>>> targetMaps) {
        setTargetMaps(targetMaps);
        return this;
    }

    /**
     * <p>
     * The maximum number of targets allowed to run this task in parallel. You
     * can specify a number, such as 10, or a percentage, such as 10%. The
     * default value is 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @return <p>
     *         The maximum number of targets allowed to run this task in
     *         parallel. You can specify a number, such as 10, or a percentage,
     *         such as 10%. The default value is 10.
     *         </p>
     */
    public String getMaxConcurrency() {
        return maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of targets allowed to run this task in parallel. You
     * can specify a number, such as 10, or a percentage, such as 10%. The
     * default value is 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @param maxConcurrency <p>
     *            The maximum number of targets allowed to run this task in
     *            parallel. You can specify a number, such as 10, or a
     *            percentage, such as 10%. The default value is 10.
     *            </p>
     */
    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of targets allowed to run this task in parallel. You
     * can specify a number, such as 10, or a percentage, such as 10%. The
     * default value is 10.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @param maxConcurrency <p>
     *            The maximum number of targets allowed to run this task in
     *            parallel. You can specify a number, such as 10, or a
     *            percentage, such as 10%. The default value is 10.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAutomationExecutionRequest withMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * <p>
     * The number of errors that are allowed before the system stops running the
     * automation on additional targets. You can specify either an absolute
     * number of errors, for example 10, or a percentage of the target set, for
     * example 10%. If you specify 3, for example, the system stops running the
     * automation when the fourth error is received. If you specify 0, then the
     * system stops running the automation on additional targets after the first
     * error result is returned. If you run an automation on 50 resources and
     * set max-errors to 10%, then the system stops running the automation on
     * additional targets when the sixth error is received.
     * </p>
     * <p>
     * Executions that are already running an automation when max-errors is
     * reached are allowed to complete, but some of these executions may fail as
     * well. If you need to ensure that there won't be more than max-errors
     * failed executions, set max-concurrency to 1 so the executions proceed one
     * at a time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @return <p>
     *         The number of errors that are allowed before the system stops
     *         running the automation on additional targets. You can specify
     *         either an absolute number of errors, for example 10, or a
     *         percentage of the target set, for example 10%. If you specify 3,
     *         for example, the system stops running the automation when the
     *         fourth error is received. If you specify 0, then the system stops
     *         running the automation on additional targets after the first
     *         error result is returned. If you run an automation on 50
     *         resources and set max-errors to 10%, then the system stops
     *         running the automation on additional targets when the sixth error
     *         is received.
     *         </p>
     *         <p>
     *         Executions that are already running an automation when max-errors
     *         is reached are allowed to complete, but some of these executions
     *         may fail as well. If you need to ensure that there won't be more
     *         than max-errors failed executions, set max-concurrency to 1 so
     *         the executions proceed one at a time.
     *         </p>
     */
    public String getMaxErrors() {
        return maxErrors;
    }

    /**
     * <p>
     * The number of errors that are allowed before the system stops running the
     * automation on additional targets. You can specify either an absolute
     * number of errors, for example 10, or a percentage of the target set, for
     * example 10%. If you specify 3, for example, the system stops running the
     * automation when the fourth error is received. If you specify 0, then the
     * system stops running the automation on additional targets after the first
     * error result is returned. If you run an automation on 50 resources and
     * set max-errors to 10%, then the system stops running the automation on
     * additional targets when the sixth error is received.
     * </p>
     * <p>
     * Executions that are already running an automation when max-errors is
     * reached are allowed to complete, but some of these executions may fail as
     * well. If you need to ensure that there won't be more than max-errors
     * failed executions, set max-concurrency to 1 so the executions proceed one
     * at a time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @param maxErrors <p>
     *            The number of errors that are allowed before the system stops
     *            running the automation on additional targets. You can specify
     *            either an absolute number of errors, for example 10, or a
     *            percentage of the target set, for example 10%. If you specify
     *            3, for example, the system stops running the automation when
     *            the fourth error is received. If you specify 0, then the
     *            system stops running the automation on additional targets
     *            after the first error result is returned. If you run an
     *            automation on 50 resources and set max-errors to 10%, then the
     *            system stops running the automation on additional targets when
     *            the sixth error is received.
     *            </p>
     *            <p>
     *            Executions that are already running an automation when
     *            max-errors is reached are allowed to complete, but some of
     *            these executions may fail as well. If you need to ensure that
     *            there won't be more than max-errors failed executions, set
     *            max-concurrency to 1 so the executions proceed one at a time.
     *            </p>
     */
    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The number of errors that are allowed before the system stops running the
     * automation on additional targets. You can specify either an absolute
     * number of errors, for example 10, or a percentage of the target set, for
     * example 10%. If you specify 3, for example, the system stops running the
     * automation when the fourth error is received. If you specify 0, then the
     * system stops running the automation on additional targets after the first
     * error result is returned. If you run an automation on 50 resources and
     * set max-errors to 10%, then the system stops running the automation on
     * additional targets when the sixth error is received.
     * </p>
     * <p>
     * Executions that are already running an automation when max-errors is
     * reached are allowed to complete, but some of these executions may fail as
     * well. If you need to ensure that there won't be more than max-errors
     * failed executions, set max-concurrency to 1 so the executions proceed one
     * at a time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @param maxErrors <p>
     *            The number of errors that are allowed before the system stops
     *            running the automation on additional targets. You can specify
     *            either an absolute number of errors, for example 10, or a
     *            percentage of the target set, for example 10%. If you specify
     *            3, for example, the system stops running the automation when
     *            the fourth error is received. If you specify 0, then the
     *            system stops running the automation on additional targets
     *            after the first error result is returned. If you run an
     *            automation on 50 resources and set max-errors to 10%, then the
     *            system stops running the automation on additional targets when
     *            the sixth error is received.
     *            </p>
     *            <p>
     *            Executions that are already running an automation when
     *            max-errors is reached are allowed to complete, but some of
     *            these executions may fail as well. If you need to ensure that
     *            there won't be more than max-errors failed executions, set
     *            max-concurrency to 1 so the executions proceed one at a time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAutomationExecutionRequest withMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
        return this;
    }

    /**
     * <p>
     * A location is a combination of AWS Regions and/or AWS accounts where you
     * want to run the Automation. Use this action to start an Automation in
     * multiple Regions and multiple accounts. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Running Automation workflows in multiple AWS Regions and accounts</a> in
     * the <i>AWS Systems Manager User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A location is a combination of AWS Regions and/or AWS accounts
     *         where you want to run the Automation. Use this action to start an
     *         Automation in multiple Regions and multiple accounts. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *         >Running Automation workflows in multiple AWS Regions and
     *         accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     *         </p>
     */
    public java.util.List<TargetLocation> getTargetLocations() {
        return targetLocations;
    }

    /**
     * <p>
     * A location is a combination of AWS Regions and/or AWS accounts where you
     * want to run the Automation. Use this action to start an Automation in
     * multiple Regions and multiple accounts. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Running Automation workflows in multiple AWS Regions and accounts</a> in
     * the <i>AWS Systems Manager User Guide</i>.
     * </p>
     *
     * @param targetLocations <p>
     *            A location is a combination of AWS Regions and/or AWS accounts
     *            where you want to run the Automation. Use this action to start
     *            an Automation in multiple Regions and multiple accounts. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *            >Running Automation workflows in multiple AWS Regions and
     *            accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     */
    public void setTargetLocations(java.util.Collection<TargetLocation> targetLocations) {
        if (targetLocations == null) {
            this.targetLocations = null;
            return;
        }

        this.targetLocations = new java.util.ArrayList<TargetLocation>(targetLocations);
    }

    /**
     * <p>
     * A location is a combination of AWS Regions and/or AWS accounts where you
     * want to run the Automation. Use this action to start an Automation in
     * multiple Regions and multiple accounts. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Running Automation workflows in multiple AWS Regions and accounts</a> in
     * the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetLocations <p>
     *            A location is a combination of AWS Regions and/or AWS accounts
     *            where you want to run the Automation. Use this action to start
     *            an Automation in multiple Regions and multiple accounts. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *            >Running Automation workflows in multiple AWS Regions and
     *            accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAutomationExecutionRequest withTargetLocations(TargetLocation... targetLocations) {
        if (getTargetLocations() == null) {
            this.targetLocations = new java.util.ArrayList<TargetLocation>(targetLocations.length);
        }
        for (TargetLocation value : targetLocations) {
            this.targetLocations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A location is a combination of AWS Regions and/or AWS accounts where you
     * want to run the Automation. Use this action to start an Automation in
     * multiple Regions and multiple accounts. For more information, see <a
     * href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     * >Running Automation workflows in multiple AWS Regions and accounts</a> in
     * the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetLocations <p>
     *            A location is a combination of AWS Regions and/or AWS accounts
     *            where you want to run the Automation. Use this action to start
     *            an Automation in multiple Regions and multiple accounts. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-automation-multiple-accounts-and-regions.html"
     *            >Running Automation workflows in multiple AWS Regions and
     *            accounts</a> in the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAutomationExecutionRequest withTargetLocations(
            java.util.Collection<TargetLocation> targetLocations) {
        setTargetLocations(targetLocations);
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can specify a
     * maximum of five tags for an automation. Tags enable you to categorize a
     * resource in different ways, such as by purpose, owner, or environment.
     * For example, you might want to tag an automation to identify an
     * environment or operating system. In this case, you could specify the
     * following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=environment,Value=test</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing patch baseline, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     *
     * @return <p>
     *         Optional metadata that you assign to a resource. You can specify
     *         a maximum of five tags for an automation. Tags enable you to
     *         categorize a resource in different ways, such as by purpose,
     *         owner, or environment. For example, you might want to tag an
     *         automation to identify an environment or operating system. In
     *         this case, you could specify the following key name/value pairs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Key=environment,Value=test</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Key=OS,Value=Windows</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         To add tags to an existing patch baseline, use the
     *         <a>AddTagsToResource</a> action.
     *         </p>
     *         </note>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. You can specify a
     * maximum of five tags for an automation. Tags enable you to categorize a
     * resource in different ways, such as by purpose, owner, or environment.
     * For example, you might want to tag an automation to identify an
     * environment or operating system. In this case, you could specify the
     * following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=environment,Value=test</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing patch baseline, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. You can
     *            specify a maximum of five tags for an automation. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag an automation to identify an environment or operating
     *            system. In this case, you could specify the following key
     *            name/value pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=environment,Value=test</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            To add tags to an existing patch baseline, use the
     *            <a>AddTagsToResource</a> action.
     *            </p>
     *            </note>
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
     * Optional metadata that you assign to a resource. You can specify a
     * maximum of five tags for an automation. Tags enable you to categorize a
     * resource in different ways, such as by purpose, owner, or environment.
     * For example, you might want to tag an automation to identify an
     * environment or operating system. In this case, you could specify the
     * following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=environment,Value=test</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing patch baseline, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. You can
     *            specify a maximum of five tags for an automation. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag an automation to identify an environment or operating
     *            system. In this case, you could specify the following key
     *            name/value pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=environment,Value=test</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            To add tags to an existing patch baseline, use the
     *            <a>AddTagsToResource</a> action.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAutomationExecutionRequest withTags(Tag... tags) {
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
     * Optional metadata that you assign to a resource. You can specify a
     * maximum of five tags for an automation. Tags enable you to categorize a
     * resource in different ways, such as by purpose, owner, or environment.
     * For example, you might want to tag an automation to identify an
     * environment or operating system. In this case, you could specify the
     * following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=environment,Value=test</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing patch baseline, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. You can
     *            specify a maximum of five tags for an automation. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag an automation to identify an environment or operating
     *            system. In this case, you could specify the following key
     *            name/value pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=environment,Value=test</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            To add tags to an existing patch baseline, use the
     *            <a>AddTagsToResource</a> action.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartAutomationExecutionRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDocumentName() != null)
            sb.append("DocumentName: " + getDocumentName() + ",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getMode() != null)
            sb.append("Mode: " + getMode() + ",");
        if (getTargetParameterName() != null)
            sb.append("TargetParameterName: " + getTargetParameterName() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getTargetMaps() != null)
            sb.append("TargetMaps: " + getTargetMaps() + ",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: " + getMaxConcurrency() + ",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: " + getMaxErrors() + ",");
        if (getTargetLocations() != null)
            sb.append("TargetLocations: " + getTargetLocations() + ",");
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
                + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode
                + ((getTargetParameterName() == null) ? 0 : getTargetParameterName().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTargetMaps() == null) ? 0 : getTargetMaps().hashCode());
        hashCode = prime * hashCode
                + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode
                + ((getTargetLocations() == null) ? 0 : getTargetLocations().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAutomationExecutionRequest == false)
            return false;
        StartAutomationExecutionRequest other = (StartAutomationExecutionRequest) obj;

        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null
                && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null
                && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getTargetParameterName() == null ^ this.getTargetParameterName() == null)
            return false;
        if (other.getTargetParameterName() != null
                && other.getTargetParameterName().equals(this.getTargetParameterName()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getTargetMaps() == null ^ this.getTargetMaps() == null)
            return false;
        if (other.getTargetMaps() != null
                && other.getTargetMaps().equals(this.getTargetMaps()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null
                && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null)
            return false;
        if (other.getMaxErrors() != null
                && other.getMaxErrors().equals(this.getMaxErrors()) == false)
            return false;
        if (other.getTargetLocations() == null ^ this.getTargetLocations() == null)
            return false;
        if (other.getTargetLocations() != null
                && other.getTargetLocations().equals(this.getTargetLocations()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
