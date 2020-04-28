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

/**
 * <p>
 * Describes the association of a Systems Manager SSM document and an instance.
 * </p>
 */
public class CreateAssociationBatchRequestEntry implements Serializable {
    /**
     * <p>
     * The name of the SSM document that contains the configuration information
     * for the instance. You can specify Command or Automation documents.
     * </p>
     * <p>
     * You can specify AWS-predefined documents, documents you created, or a
     * document that is shared with you from another account.
     * </p>
     * <p>
     * For SSM documents that are shared with you from other AWS accounts, you
     * must specify the complete SSM document ARN, in the following format:
     * </p>
     * <p>
     * <code>arn:aws:ssm:<i>region</i>:<i>account-id</i>:document/<i>document-name</i> </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document</code>
     * </p>
     * <p>
     * For AWS-predefined documents and SSM documents you created in your
     * account, you only need to specify the document name. For example,
     * <code>AWS-ApplyPatchBaseline</code> or <code>My-Document</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     */
    private String instanceId;

    /**
     * <p>
     * A description of the parameters for a document.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;

    /**
     * <p>
     * Specify the target for the association. This target is required for
     * associations that use an Automation document and target resources by
     * using rate controls.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String automationTargetParameterName;

    /**
     * <p>
     * The document version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>
     * The instances targeted by the request.
     * </p>
     */
    private java.util.List<Target> targets;

    /**
     * <p>
     * A cron expression that specifies a schedule when the association runs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String scheduleExpression;

    /**
     * <p>
     * An S3 bucket where you want to store the results of this request.
     * </p>
     */
    private InstanceAssociationOutputLocation outputLocation;

    /**
     * <p>
     * Specify a descriptive name for the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String associationName;

    /**
     * <p>
     * The number of errors that are allowed before the system stops sending
     * requests to run the association on additional targets. You can specify
     * either an absolute number of errors, for example 10, or a percentage of
     * the target set, for example 10%. If you specify 3, for example, the
     * system stops sending requests when the fourth error is received. If you
     * specify 0, then the system stops sending requests after the first error
     * is returned. If you run an association on 50 instances and set MaxError
     * to 10%, then the system stops sending the request when the sixth error is
     * received.
     * </p>
     * <p>
     * Executions that are already running an association when MaxErrors is
     * reached are allowed to complete, but some of these executions may fail as
     * well. If you need to ensure that there won't be more than max-errors
     * failed executions, set MaxConcurrency to 1 so that executions proceed one
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
     * The maximum number of targets allowed to run the association at the same
     * time. You can specify a number, for example 10, or a percentage of the
     * target set, for example 10%. The default value is 100%, which means all
     * targets run the association at the same time.
     * </p>
     * <p>
     * If a new instance starts and attempts to run an association while Systems
     * Manager is running MaxConcurrency associations, the association is
     * allowed to run. During the next association interval, the new instance
     * will process its association within the limit specified for
     * MaxConcurrency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     */
    private String maxConcurrency;

    /**
     * <p>
     * The severity level to assign to the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, UNSPECIFIED
     */
    private String complianceSeverity;

    /**
     * <p>
     * The mode for generating association compliance. You can specify
     * <code>AUTO</code> or <code>MANUAL</code>. In <code>AUTO</code> mode, the
     * system uses the status of the association execution to determine the
     * compliance status. If the association execution runs successfully, then
     * the association is <code>COMPLIANT</code>. If the association execution
     * doesn't run successfully, the association is <code>NON-COMPLIANT</code>.
     * </p>
     * <p>
     * In <code>MANUAL</code> mode, you must specify the
     * <code>AssociationId</code> as a parameter for the
     * <a>PutComplianceItems</a> API action. In this case, compliance data is
     * not managed by State Manager. It is managed by your direct call to the
     * <a>PutComplianceItems</a> API action.
     * </p>
     * <p>
     * By default, all associations use <code>AUTO</code> mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, MANUAL
     */
    private String syncCompliance;

    /**
     * <p>
     * The name of the SSM document that contains the configuration information
     * for the instance. You can specify Command or Automation documents.
     * </p>
     * <p>
     * You can specify AWS-predefined documents, documents you created, or a
     * document that is shared with you from another account.
     * </p>
     * <p>
     * For SSM documents that are shared with you from other AWS accounts, you
     * must specify the complete SSM document ARN, in the following format:
     * </p>
     * <p>
     * <code>arn:aws:ssm:<i>region</i>:<i>account-id</i>:document/<i>document-name</i> </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document</code>
     * </p>
     * <p>
     * For AWS-predefined documents and SSM documents you created in your
     * account, you only need to specify the document name. For example,
     * <code>AWS-ApplyPatchBaseline</code> or <code>My-Document</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the SSM document that contains the configuration
     *         information for the instance. You can specify Command or
     *         Automation documents.
     *         </p>
     *         <p>
     *         You can specify AWS-predefined documents, documents you created,
     *         or a document that is shared with you from another account.
     *         </p>
     *         <p>
     *         For SSM documents that are shared with you from other AWS
     *         accounts, you must specify the complete SSM document ARN, in the
     *         following format:
     *         </p>
     *         <p>
     *         <code>arn:aws:ssm:<i>region</i>:<i>account-id</i>:document/<i>document-name</i> </code>
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <p>
     *         <code>arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document</code>
     *         </p>
     *         <p>
     *         For AWS-predefined documents and SSM documents you created in
     *         your account, you only need to specify the document name. For
     *         example, <code>AWS-ApplyPatchBaseline</code> or
     *         <code>My-Document</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the SSM document that contains the configuration information
     * for the instance. You can specify Command or Automation documents.
     * </p>
     * <p>
     * You can specify AWS-predefined documents, documents you created, or a
     * document that is shared with you from another account.
     * </p>
     * <p>
     * For SSM documents that are shared with you from other AWS accounts, you
     * must specify the complete SSM document ARN, in the following format:
     * </p>
     * <p>
     * <code>arn:aws:ssm:<i>region</i>:<i>account-id</i>:document/<i>document-name</i> </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document</code>
     * </p>
     * <p>
     * For AWS-predefined documents and SSM documents you created in your
     * account, you only need to specify the document name. For example,
     * <code>AWS-ApplyPatchBaseline</code> or <code>My-Document</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the SSM document that contains the configuration
     *            information for the instance. You can specify Command or
     *            Automation documents.
     *            </p>
     *            <p>
     *            You can specify AWS-predefined documents, documents you
     *            created, or a document that is shared with you from another
     *            account.
     *            </p>
     *            <p>
     *            For SSM documents that are shared with you from other AWS
     *            accounts, you must specify the complete SSM document ARN, in
     *            the following format:
     *            </p>
     *            <p>
     *            <code>arn:aws:ssm:<i>region</i>:<i>account-id</i>:document/<i>document-name</i> </code>
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <p>
     *            <code>arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document</code>
     *            </p>
     *            <p>
     *            For AWS-predefined documents and SSM documents you created in
     *            your account, you only need to specify the document name. For
     *            example, <code>AWS-ApplyPatchBaseline</code> or
     *            <code>My-Document</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SSM document that contains the configuration information
     * for the instance. You can specify Command or Automation documents.
     * </p>
     * <p>
     * You can specify AWS-predefined documents, documents you created, or a
     * document that is shared with you from another account.
     * </p>
     * <p>
     * For SSM documents that are shared with you from other AWS accounts, you
     * must specify the complete SSM document ARN, in the following format:
     * </p>
     * <p>
     * <code>arn:aws:ssm:<i>region</i>:<i>account-id</i>:document/<i>document-name</i> </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document</code>
     * </p>
     * <p>
     * For AWS-predefined documents and SSM documents you created in your
     * account, you only need to specify the document name. For example,
     * <code>AWS-ApplyPatchBaseline</code> or <code>My-Document</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the SSM document that contains the configuration
     *            information for the instance. You can specify Command or
     *            Automation documents.
     *            </p>
     *            <p>
     *            You can specify AWS-predefined documents, documents you
     *            created, or a document that is shared with you from another
     *            account.
     *            </p>
     *            <p>
     *            For SSM documents that are shared with you from other AWS
     *            accounts, you must specify the complete SSM document ARN, in
     *            the following format:
     *            </p>
     *            <p>
     *            <code>arn:aws:ssm:<i>region</i>:<i>account-id</i>:document/<i>document-name</i> </code>
     *            </p>
     *            <p>
     *            For example:
     *            </p>
     *            <p>
     *            <code>arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document</code>
     *            </p>
     *            <p>
     *            For AWS-predefined documents and SSM documents you created in
     *            your account, you only need to specify the document name. For
     *            example, <code>AWS-ApplyPatchBaseline</code> or
     *            <code>My-Document</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequestEntry withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)<br/>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequestEntry withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * A description of the parameters for a document.
     * </p>
     *
     * @return <p>
     *         A description of the parameters for a document.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A description of the parameters for a document.
     * </p>
     *
     * @param parameters <p>
     *            A description of the parameters for a document.
     *            </p>
     */
    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A description of the parameters for a document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            A description of the parameters for a document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequestEntry withParameters(
            java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * A description of the parameters for a document.
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
    public CreateAssociationBatchRequestEntry addParametersEntry(String key,
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
    public CreateAssociationBatchRequestEntry clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * Specify the target for the association. This target is required for
     * associations that use an Automation document and target resources by
     * using rate controls.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>
     *         Specify the target for the association. This target is required
     *         for associations that use an Automation document and target
     *         resources by using rate controls.
     *         </p>
     */
    public String getAutomationTargetParameterName() {
        return automationTargetParameterName;
    }

    /**
     * <p>
     * Specify the target for the association. This target is required for
     * associations that use an Automation document and target resources by
     * using rate controls.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param automationTargetParameterName <p>
     *            Specify the target for the association. This target is
     *            required for associations that use an Automation document and
     *            target resources by using rate controls.
     *            </p>
     */
    public void setAutomationTargetParameterName(String automationTargetParameterName) {
        this.automationTargetParameterName = automationTargetParameterName;
    }

    /**
     * <p>
     * Specify the target for the association. This target is required for
     * associations that use an Automation document and target resources by
     * using rate controls.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param automationTargetParameterName <p>
     *            Specify the target for the association. This target is
     *            required for associations that use an Automation document and
     *            target resources by using rate controls.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequestEntry withAutomationTargetParameterName(
            String automationTargetParameterName) {
        this.automationTargetParameterName = automationTargetParameterName;
        return this;
    }

    /**
     * <p>
     * The document version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>
     *         The document version.
     *         </p>
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * <p>
     * The document version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The document version.
     *            </p>
     */
    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The document version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The document version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequestEntry withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>
     * The instances targeted by the request.
     * </p>
     *
     * @return <p>
     *         The instances targeted by the request.
     *         </p>
     */
    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The instances targeted by the request.
     * </p>
     *
     * @param targets <p>
     *            The instances targeted by the request.
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
     * The instances targeted by the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The instances targeted by the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequestEntry withTargets(Target... targets) {
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
     * The instances targeted by the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The instances targeted by the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequestEntry withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * A cron expression that specifies a schedule when the association runs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         A cron expression that specifies a schedule when the association
     *         runs.
     *         </p>
     */
    public String getScheduleExpression() {
        return scheduleExpression;
    }

    /**
     * <p>
     * A cron expression that specifies a schedule when the association runs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param scheduleExpression <p>
     *            A cron expression that specifies a schedule when the
     *            association runs.
     *            </p>
     */
    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * A cron expression that specifies a schedule when the association runs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param scheduleExpression <p>
     *            A cron expression that specifies a schedule when the
     *            association runs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequestEntry withScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }

    /**
     * <p>
     * An S3 bucket where you want to store the results of this request.
     * </p>
     *
     * @return <p>
     *         An S3 bucket where you want to store the results of this request.
     *         </p>
     */
    public InstanceAssociationOutputLocation getOutputLocation() {
        return outputLocation;
    }

    /**
     * <p>
     * An S3 bucket where you want to store the results of this request.
     * </p>
     *
     * @param outputLocation <p>
     *            An S3 bucket where you want to store the results of this
     *            request.
     *            </p>
     */
    public void setOutputLocation(InstanceAssociationOutputLocation outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * An S3 bucket where you want to store the results of this request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputLocation <p>
     *            An S3 bucket where you want to store the results of this
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequestEntry withOutputLocation(
            InstanceAssociationOutputLocation outputLocation) {
        this.outputLocation = outputLocation;
        return this;
    }

    /**
     * <p>
     * Specify a descriptive name for the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         Specify a descriptive name for the association.
     *         </p>
     */
    public String getAssociationName() {
        return associationName;
    }

    /**
     * <p>
     * Specify a descriptive name for the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param associationName <p>
     *            Specify a descriptive name for the association.
     *            </p>
     */
    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    /**
     * <p>
     * Specify a descriptive name for the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param associationName <p>
     *            Specify a descriptive name for the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequestEntry withAssociationName(String associationName) {
        this.associationName = associationName;
        return this;
    }

    /**
     * <p>
     * The number of errors that are allowed before the system stops sending
     * requests to run the association on additional targets. You can specify
     * either an absolute number of errors, for example 10, or a percentage of
     * the target set, for example 10%. If you specify 3, for example, the
     * system stops sending requests when the fourth error is received. If you
     * specify 0, then the system stops sending requests after the first error
     * is returned. If you run an association on 50 instances and set MaxError
     * to 10%, then the system stops sending the request when the sixth error is
     * received.
     * </p>
     * <p>
     * Executions that are already running an association when MaxErrors is
     * reached are allowed to complete, but some of these executions may fail as
     * well. If you need to ensure that there won't be more than max-errors
     * failed executions, set MaxConcurrency to 1 so that executions proceed one
     * at a time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @return <p>
     *         The number of errors that are allowed before the system stops
     *         sending requests to run the association on additional targets.
     *         You can specify either an absolute number of errors, for example
     *         10, or a percentage of the target set, for example 10%. If you
     *         specify 3, for example, the system stops sending requests when
     *         the fourth error is received. If you specify 0, then the system
     *         stops sending requests after the first error is returned. If you
     *         run an association on 50 instances and set MaxError to 10%, then
     *         the system stops sending the request when the sixth error is
     *         received.
     *         </p>
     *         <p>
     *         Executions that are already running an association when MaxErrors
     *         is reached are allowed to complete, but some of these executions
     *         may fail as well. If you need to ensure that there won't be more
     *         than max-errors failed executions, set MaxConcurrency to 1 so
     *         that executions proceed one at a time.
     *         </p>
     */
    public String getMaxErrors() {
        return maxErrors;
    }

    /**
     * <p>
     * The number of errors that are allowed before the system stops sending
     * requests to run the association on additional targets. You can specify
     * either an absolute number of errors, for example 10, or a percentage of
     * the target set, for example 10%. If you specify 3, for example, the
     * system stops sending requests when the fourth error is received. If you
     * specify 0, then the system stops sending requests after the first error
     * is returned. If you run an association on 50 instances and set MaxError
     * to 10%, then the system stops sending the request when the sixth error is
     * received.
     * </p>
     * <p>
     * Executions that are already running an association when MaxErrors is
     * reached are allowed to complete, but some of these executions may fail as
     * well. If you need to ensure that there won't be more than max-errors
     * failed executions, set MaxConcurrency to 1 so that executions proceed one
     * at a time.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$<br/>
     *
     * @param maxErrors <p>
     *            The number of errors that are allowed before the system stops
     *            sending requests to run the association on additional targets.
     *            You can specify either an absolute number of errors, for
     *            example 10, or a percentage of the target set, for example
     *            10%. If you specify 3, for example, the system stops sending
     *            requests when the fourth error is received. If you specify 0,
     *            then the system stops sending requests after the first error
     *            is returned. If you run an association on 50 instances and set
     *            MaxError to 10%, then the system stops sending the request
     *            when the sixth error is received.
     *            </p>
     *            <p>
     *            Executions that are already running an association when
     *            MaxErrors is reached are allowed to complete, but some of
     *            these executions may fail as well. If you need to ensure that
     *            there won't be more than max-errors failed executions, set
     *            MaxConcurrency to 1 so that executions proceed one at a time.
     *            </p>
     */
    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The number of errors that are allowed before the system stops sending
     * requests to run the association on additional targets. You can specify
     * either an absolute number of errors, for example 10, or a percentage of
     * the target set, for example 10%. If you specify 3, for example, the
     * system stops sending requests when the fourth error is received. If you
     * specify 0, then the system stops sending requests after the first error
     * is returned. If you run an association on 50 instances and set MaxError
     * to 10%, then the system stops sending the request when the sixth error is
     * received.
     * </p>
     * <p>
     * Executions that are already running an association when MaxErrors is
     * reached are allowed to complete, but some of these executions may fail as
     * well. If you need to ensure that there won't be more than max-errors
     * failed executions, set MaxConcurrency to 1 so that executions proceed one
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
     *            sending requests to run the association on additional targets.
     *            You can specify either an absolute number of errors, for
     *            example 10, or a percentage of the target set, for example
     *            10%. If you specify 3, for example, the system stops sending
     *            requests when the fourth error is received. If you specify 0,
     *            then the system stops sending requests after the first error
     *            is returned. If you run an association on 50 instances and set
     *            MaxError to 10%, then the system stops sending the request
     *            when the sixth error is received.
     *            </p>
     *            <p>
     *            Executions that are already running an association when
     *            MaxErrors is reached are allowed to complete, but some of
     *            these executions may fail as well. If you need to ensure that
     *            there won't be more than max-errors failed executions, set
     *            MaxConcurrency to 1 so that executions proceed one at a time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequestEntry withMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
        return this;
    }

    /**
     * <p>
     * The maximum number of targets allowed to run the association at the same
     * time. You can specify a number, for example 10, or a percentage of the
     * target set, for example 10%. The default value is 100%, which means all
     * targets run the association at the same time.
     * </p>
     * <p>
     * If a new instance starts and attempts to run an association while Systems
     * Manager is running MaxConcurrency associations, the association is
     * allowed to run. During the next association interval, the new instance
     * will process its association within the limit specified for
     * MaxConcurrency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @return <p>
     *         The maximum number of targets allowed to run the association at
     *         the same time. You can specify a number, for example 10, or a
     *         percentage of the target set, for example 10%. The default value
     *         is 100%, which means all targets run the association at the same
     *         time.
     *         </p>
     *         <p>
     *         If a new instance starts and attempts to run an association while
     *         Systems Manager is running MaxConcurrency associations, the
     *         association is allowed to run. During the next association
     *         interval, the new instance will process its association within
     *         the limit specified for MaxConcurrency.
     *         </p>
     */
    public String getMaxConcurrency() {
        return maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of targets allowed to run the association at the same
     * time. You can specify a number, for example 10, or a percentage of the
     * target set, for example 10%. The default value is 100%, which means all
     * targets run the association at the same time.
     * </p>
     * <p>
     * If a new instance starts and attempts to run an association while Systems
     * Manager is running MaxConcurrency associations, the association is
     * allowed to run. During the next association interval, the new instance
     * will process its association within the limit specified for
     * MaxConcurrency.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 7<br/>
     * <b>Pattern: </b>^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$<br/>
     *
     * @param maxConcurrency <p>
     *            The maximum number of targets allowed to run the association
     *            at the same time. You can specify a number, for example 10, or
     *            a percentage of the target set, for example 10%. The default
     *            value is 100%, which means all targets run the association at
     *            the same time.
     *            </p>
     *            <p>
     *            If a new instance starts and attempts to run an association
     *            while Systems Manager is running MaxConcurrency associations,
     *            the association is allowed to run. During the next association
     *            interval, the new instance will process its association within
     *            the limit specified for MaxConcurrency.
     *            </p>
     */
    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The maximum number of targets allowed to run the association at the same
     * time. You can specify a number, for example 10, or a percentage of the
     * target set, for example 10%. The default value is 100%, which means all
     * targets run the association at the same time.
     * </p>
     * <p>
     * If a new instance starts and attempts to run an association while Systems
     * Manager is running MaxConcurrency associations, the association is
     * allowed to run. During the next association interval, the new instance
     * will process its association within the limit specified for
     * MaxConcurrency.
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
     *            The maximum number of targets allowed to run the association
     *            at the same time. You can specify a number, for example 10, or
     *            a percentage of the target set, for example 10%. The default
     *            value is 100%, which means all targets run the association at
     *            the same time.
     *            </p>
     *            <p>
     *            If a new instance starts and attempts to run an association
     *            while Systems Manager is running MaxConcurrency associations,
     *            the association is allowed to run. During the next association
     *            interval, the new instance will process its association within
     *            the limit specified for MaxConcurrency.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequestEntry withMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * <p>
     * The severity level to assign to the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, UNSPECIFIED
     *
     * @return <p>
     *         The severity level to assign to the association.
     *         </p>
     * @see AssociationComplianceSeverity
     */
    public String getComplianceSeverity() {
        return complianceSeverity;
    }

    /**
     * <p>
     * The severity level to assign to the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, UNSPECIFIED
     *
     * @param complianceSeverity <p>
     *            The severity level to assign to the association.
     *            </p>
     * @see AssociationComplianceSeverity
     */
    public void setComplianceSeverity(String complianceSeverity) {
        this.complianceSeverity = complianceSeverity;
    }

    /**
     * <p>
     * The severity level to assign to the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, UNSPECIFIED
     *
     * @param complianceSeverity <p>
     *            The severity level to assign to the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssociationComplianceSeverity
     */
    public CreateAssociationBatchRequestEntry withComplianceSeverity(String complianceSeverity) {
        this.complianceSeverity = complianceSeverity;
        return this;
    }

    /**
     * <p>
     * The severity level to assign to the association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, UNSPECIFIED
     *
     * @param complianceSeverity <p>
     *            The severity level to assign to the association.
     *            </p>
     * @see AssociationComplianceSeverity
     */
    public void setComplianceSeverity(AssociationComplianceSeverity complianceSeverity) {
        this.complianceSeverity = complianceSeverity.toString();
    }

    /**
     * <p>
     * The severity level to assign to the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, UNSPECIFIED
     *
     * @param complianceSeverity <p>
     *            The severity level to assign to the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssociationComplianceSeverity
     */
    public CreateAssociationBatchRequestEntry withComplianceSeverity(
            AssociationComplianceSeverity complianceSeverity) {
        this.complianceSeverity = complianceSeverity.toString();
        return this;
    }

    /**
     * <p>
     * The mode for generating association compliance. You can specify
     * <code>AUTO</code> or <code>MANUAL</code>. In <code>AUTO</code> mode, the
     * system uses the status of the association execution to determine the
     * compliance status. If the association execution runs successfully, then
     * the association is <code>COMPLIANT</code>. If the association execution
     * doesn't run successfully, the association is <code>NON-COMPLIANT</code>.
     * </p>
     * <p>
     * In <code>MANUAL</code> mode, you must specify the
     * <code>AssociationId</code> as a parameter for the
     * <a>PutComplianceItems</a> API action. In this case, compliance data is
     * not managed by State Manager. It is managed by your direct call to the
     * <a>PutComplianceItems</a> API action.
     * </p>
     * <p>
     * By default, all associations use <code>AUTO</code> mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, MANUAL
     *
     * @return <p>
     *         The mode for generating association compliance. You can specify
     *         <code>AUTO</code> or <code>MANUAL</code>. In <code>AUTO</code>
     *         mode, the system uses the status of the association execution to
     *         determine the compliance status. If the association execution
     *         runs successfully, then the association is <code>COMPLIANT</code>
     *         . If the association execution doesn't run successfully, the
     *         association is <code>NON-COMPLIANT</code>.
     *         </p>
     *         <p>
     *         In <code>MANUAL</code> mode, you must specify the
     *         <code>AssociationId</code> as a parameter for the
     *         <a>PutComplianceItems</a> API action. In this case, compliance
     *         data is not managed by State Manager. It is managed by your
     *         direct call to the <a>PutComplianceItems</a> API action.
     *         </p>
     *         <p>
     *         By default, all associations use <code>AUTO</code> mode.
     *         </p>
     * @see AssociationSyncCompliance
     */
    public String getSyncCompliance() {
        return syncCompliance;
    }

    /**
     * <p>
     * The mode for generating association compliance. You can specify
     * <code>AUTO</code> or <code>MANUAL</code>. In <code>AUTO</code> mode, the
     * system uses the status of the association execution to determine the
     * compliance status. If the association execution runs successfully, then
     * the association is <code>COMPLIANT</code>. If the association execution
     * doesn't run successfully, the association is <code>NON-COMPLIANT</code>.
     * </p>
     * <p>
     * In <code>MANUAL</code> mode, you must specify the
     * <code>AssociationId</code> as a parameter for the
     * <a>PutComplianceItems</a> API action. In this case, compliance data is
     * not managed by State Manager. It is managed by your direct call to the
     * <a>PutComplianceItems</a> API action.
     * </p>
     * <p>
     * By default, all associations use <code>AUTO</code> mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, MANUAL
     *
     * @param syncCompliance <p>
     *            The mode for generating association compliance. You can
     *            specify <code>AUTO</code> or <code>MANUAL</code>. In
     *            <code>AUTO</code> mode, the system uses the status of the
     *            association execution to determine the compliance status. If
     *            the association execution runs successfully, then the
     *            association is <code>COMPLIANT</code>. If the association
     *            execution doesn't run successfully, the association is
     *            <code>NON-COMPLIANT</code>.
     *            </p>
     *            <p>
     *            In <code>MANUAL</code> mode, you must specify the
     *            <code>AssociationId</code> as a parameter for the
     *            <a>PutComplianceItems</a> API action. In this case, compliance
     *            data is not managed by State Manager. It is managed by your
     *            direct call to the <a>PutComplianceItems</a> API action.
     *            </p>
     *            <p>
     *            By default, all associations use <code>AUTO</code> mode.
     *            </p>
     * @see AssociationSyncCompliance
     */
    public void setSyncCompliance(String syncCompliance) {
        this.syncCompliance = syncCompliance;
    }

    /**
     * <p>
     * The mode for generating association compliance. You can specify
     * <code>AUTO</code> or <code>MANUAL</code>. In <code>AUTO</code> mode, the
     * system uses the status of the association execution to determine the
     * compliance status. If the association execution runs successfully, then
     * the association is <code>COMPLIANT</code>. If the association execution
     * doesn't run successfully, the association is <code>NON-COMPLIANT</code>.
     * </p>
     * <p>
     * In <code>MANUAL</code> mode, you must specify the
     * <code>AssociationId</code> as a parameter for the
     * <a>PutComplianceItems</a> API action. In this case, compliance data is
     * not managed by State Manager. It is managed by your direct call to the
     * <a>PutComplianceItems</a> API action.
     * </p>
     * <p>
     * By default, all associations use <code>AUTO</code> mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, MANUAL
     *
     * @param syncCompliance <p>
     *            The mode for generating association compliance. You can
     *            specify <code>AUTO</code> or <code>MANUAL</code>. In
     *            <code>AUTO</code> mode, the system uses the status of the
     *            association execution to determine the compliance status. If
     *            the association execution runs successfully, then the
     *            association is <code>COMPLIANT</code>. If the association
     *            execution doesn't run successfully, the association is
     *            <code>NON-COMPLIANT</code>.
     *            </p>
     *            <p>
     *            In <code>MANUAL</code> mode, you must specify the
     *            <code>AssociationId</code> as a parameter for the
     *            <a>PutComplianceItems</a> API action. In this case, compliance
     *            data is not managed by State Manager. It is managed by your
     *            direct call to the <a>PutComplianceItems</a> API action.
     *            </p>
     *            <p>
     *            By default, all associations use <code>AUTO</code> mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssociationSyncCompliance
     */
    public CreateAssociationBatchRequestEntry withSyncCompliance(String syncCompliance) {
        this.syncCompliance = syncCompliance;
        return this;
    }

    /**
     * <p>
     * The mode for generating association compliance. You can specify
     * <code>AUTO</code> or <code>MANUAL</code>. In <code>AUTO</code> mode, the
     * system uses the status of the association execution to determine the
     * compliance status. If the association execution runs successfully, then
     * the association is <code>COMPLIANT</code>. If the association execution
     * doesn't run successfully, the association is <code>NON-COMPLIANT</code>.
     * </p>
     * <p>
     * In <code>MANUAL</code> mode, you must specify the
     * <code>AssociationId</code> as a parameter for the
     * <a>PutComplianceItems</a> API action. In this case, compliance data is
     * not managed by State Manager. It is managed by your direct call to the
     * <a>PutComplianceItems</a> API action.
     * </p>
     * <p>
     * By default, all associations use <code>AUTO</code> mode.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, MANUAL
     *
     * @param syncCompliance <p>
     *            The mode for generating association compliance. You can
     *            specify <code>AUTO</code> or <code>MANUAL</code>. In
     *            <code>AUTO</code> mode, the system uses the status of the
     *            association execution to determine the compliance status. If
     *            the association execution runs successfully, then the
     *            association is <code>COMPLIANT</code>. If the association
     *            execution doesn't run successfully, the association is
     *            <code>NON-COMPLIANT</code>.
     *            </p>
     *            <p>
     *            In <code>MANUAL</code> mode, you must specify the
     *            <code>AssociationId</code> as a parameter for the
     *            <a>PutComplianceItems</a> API action. In this case, compliance
     *            data is not managed by State Manager. It is managed by your
     *            direct call to the <a>PutComplianceItems</a> API action.
     *            </p>
     *            <p>
     *            By default, all associations use <code>AUTO</code> mode.
     *            </p>
     * @see AssociationSyncCompliance
     */
    public void setSyncCompliance(AssociationSyncCompliance syncCompliance) {
        this.syncCompliance = syncCompliance.toString();
    }

    /**
     * <p>
     * The mode for generating association compliance. You can specify
     * <code>AUTO</code> or <code>MANUAL</code>. In <code>AUTO</code> mode, the
     * system uses the status of the association execution to determine the
     * compliance status. If the association execution runs successfully, then
     * the association is <code>COMPLIANT</code>. If the association execution
     * doesn't run successfully, the association is <code>NON-COMPLIANT</code>.
     * </p>
     * <p>
     * In <code>MANUAL</code> mode, you must specify the
     * <code>AssociationId</code> as a parameter for the
     * <a>PutComplianceItems</a> API action. In this case, compliance data is
     * not managed by State Manager. It is managed by your direct call to the
     * <a>PutComplianceItems</a> API action.
     * </p>
     * <p>
     * By default, all associations use <code>AUTO</code> mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, MANUAL
     *
     * @param syncCompliance <p>
     *            The mode for generating association compliance. You can
     *            specify <code>AUTO</code> or <code>MANUAL</code>. In
     *            <code>AUTO</code> mode, the system uses the status of the
     *            association execution to determine the compliance status. If
     *            the association execution runs successfully, then the
     *            association is <code>COMPLIANT</code>. If the association
     *            execution doesn't run successfully, the association is
     *            <code>NON-COMPLIANT</code>.
     *            </p>
     *            <p>
     *            In <code>MANUAL</code> mode, you must specify the
     *            <code>AssociationId</code> as a parameter for the
     *            <a>PutComplianceItems</a> API action. In this case, compliance
     *            data is not managed by State Manager. It is managed by your
     *            direct call to the <a>PutComplianceItems</a> API action.
     *            </p>
     *            <p>
     *            By default, all associations use <code>AUTO</code> mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AssociationSyncCompliance
     */
    public CreateAssociationBatchRequestEntry withSyncCompliance(
            AssociationSyncCompliance syncCompliance) {
        this.syncCompliance = syncCompliance.toString();
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getAutomationTargetParameterName() != null)
            sb.append("AutomationTargetParameterName: " + getAutomationTargetParameterName() + ",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getTargets() != null)
            sb.append("Targets: " + getTargets() + ",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: " + getScheduleExpression() + ",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: " + getOutputLocation() + ",");
        if (getAssociationName() != null)
            sb.append("AssociationName: " + getAssociationName() + ",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: " + getMaxErrors() + ",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: " + getMaxConcurrency() + ",");
        if (getComplianceSeverity() != null)
            sb.append("ComplianceSeverity: " + getComplianceSeverity() + ",");
        if (getSyncCompliance() != null)
            sb.append("SyncCompliance: " + getSyncCompliance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutomationTargetParameterName() == null) ? 0
                        : getAutomationTargetParameterName().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode
                + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode
                + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode
                + ((getAssociationName() == null) ? 0 : getAssociationName().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode
                + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode
                + ((getComplianceSeverity() == null) ? 0 : getComplianceSeverity().hashCode());
        hashCode = prime * hashCode
                + ((getSyncCompliance() == null) ? 0 : getSyncCompliance().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssociationBatchRequestEntry == false)
            return false;
        CreateAssociationBatchRequestEntry other = (CreateAssociationBatchRequestEntry) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getAutomationTargetParameterName() == null
                ^ this.getAutomationTargetParameterName() == null)
            return false;
        if (other.getAutomationTargetParameterName() != null
                && other.getAutomationTargetParameterName().equals(
                        this.getAutomationTargetParameterName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null
                && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null
                && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null
                && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getAssociationName() == null ^ this.getAssociationName() == null)
            return false;
        if (other.getAssociationName() != null
                && other.getAssociationName().equals(this.getAssociationName()) == false)
            return false;
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null)
            return false;
        if (other.getMaxErrors() != null
                && other.getMaxErrors().equals(this.getMaxErrors()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null
                && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getComplianceSeverity() == null ^ this.getComplianceSeverity() == null)
            return false;
        if (other.getComplianceSeverity() != null
                && other.getComplianceSeverity().equals(this.getComplianceSeverity()) == false)
            return false;
        if (other.getSyncCompliance() == null ^ this.getSyncCompliance() == null)
            return false;
        if (other.getSyncCompliance() != null
                && other.getSyncCompliance().equals(this.getSyncCompliance()) == false)
            return false;
        return true;
    }
}
