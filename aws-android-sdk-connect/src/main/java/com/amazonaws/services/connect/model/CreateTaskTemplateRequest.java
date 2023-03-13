/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new task template in the specified Amazon Connect instance.
 * </p>
 */
public class CreateTaskTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The name of the task template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the task template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String description;

    /**
     * <p>
     * The identifier of the flow that runs by default when a task is created by
     * referencing this template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String contactFlowId;

    /**
     * <p>
     * Constraints that are applicable to the fields listed.
     * </p>
     */
    private TaskTemplateConstraints constraints;

    /**
     * <p>
     * The default values for fields when a task is created by referencing this
     * template.
     * </p>
     */
    private TaskTemplateDefaults defaults;

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a
     * task to refer to it. Tasks can only be created from <code>ACTIVE</code>
     * templates. If a template is marked as <code>INACTIVE</code>, then a task
     * that refers to this template cannot be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     */
    private String status;

    /**
     * <p>
     * Fields that are part of the template.
     * </p>
     */
    private java.util.List<TaskTemplateField> fields;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *         >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *         the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskTemplateRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The name of the task template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the task template.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the task template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param name <p>
     *            The name of the task template.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the task template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param name <p>
     *            The name of the task template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskTemplateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the task template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The description of the task template.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the task template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param description <p>
     *            The description of the task template.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the task template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param description <p>
     *            The description of the task template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskTemplateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The identifier of the flow that runs by default when a task is created by
     * referencing this template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The identifier of the flow that runs by default when a task is
     *         created by referencing this template.
     *         </p>
     */
    public String getContactFlowId() {
        return contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow that runs by default when a task is created by
     * referencing this template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param contactFlowId <p>
     *            The identifier of the flow that runs by default when a task is
     *            created by referencing this template.
     *            </p>
     */
    public void setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow that runs by default when a task is created by
     * referencing this template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param contactFlowId <p>
     *            The identifier of the flow that runs by default when a task is
     *            created by referencing this template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskTemplateRequest withContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }

    /**
     * <p>
     * Constraints that are applicable to the fields listed.
     * </p>
     *
     * @return <p>
     *         Constraints that are applicable to the fields listed.
     *         </p>
     */
    public TaskTemplateConstraints getConstraints() {
        return constraints;
    }

    /**
     * <p>
     * Constraints that are applicable to the fields listed.
     * </p>
     *
     * @param constraints <p>
     *            Constraints that are applicable to the fields listed.
     *            </p>
     */
    public void setConstraints(TaskTemplateConstraints constraints) {
        this.constraints = constraints;
    }

    /**
     * <p>
     * Constraints that are applicable to the fields listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param constraints <p>
     *            Constraints that are applicable to the fields listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskTemplateRequest withConstraints(TaskTemplateConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * <p>
     * The default values for fields when a task is created by referencing this
     * template.
     * </p>
     *
     * @return <p>
     *         The default values for fields when a task is created by
     *         referencing this template.
     *         </p>
     */
    public TaskTemplateDefaults getDefaults() {
        return defaults;
    }

    /**
     * <p>
     * The default values for fields when a task is created by referencing this
     * template.
     * </p>
     *
     * @param defaults <p>
     *            The default values for fields when a task is created by
     *            referencing this template.
     *            </p>
     */
    public void setDefaults(TaskTemplateDefaults defaults) {
        this.defaults = defaults;
    }

    /**
     * <p>
     * The default values for fields when a task is created by referencing this
     * template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaults <p>
     *            The default values for fields when a task is created by
     *            referencing this template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskTemplateRequest withDefaults(TaskTemplateDefaults defaults) {
        this.defaults = defaults;
        return this;
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a
     * task to refer to it. Tasks can only be created from <code>ACTIVE</code>
     * templates. If a template is marked as <code>INACTIVE</code>, then a task
     * that refers to this template cannot be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @return <p>
     *         Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code>
     *         for a task to refer to it. Tasks can only be created from
     *         <code>ACTIVE</code> templates. If a template is marked as
     *         <code>INACTIVE</code>, then a task that refers to this template
     *         cannot be created.
     *         </p>
     * @see TaskTemplateStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a
     * task to refer to it. Tasks can only be created from <code>ACTIVE</code>
     * templates. If a template is marked as <code>INACTIVE</code>, then a task
     * that refers to this template cannot be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            Marks a template as <code>ACTIVE</code> or
     *            <code>INACTIVE</code> for a task to refer to it. Tasks can
     *            only be created from <code>ACTIVE</code> templates. If a
     *            template is marked as <code>INACTIVE</code>, then a task that
     *            refers to this template cannot be created.
     *            </p>
     * @see TaskTemplateStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a
     * task to refer to it. Tasks can only be created from <code>ACTIVE</code>
     * templates. If a template is marked as <code>INACTIVE</code>, then a task
     * that refers to this template cannot be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            Marks a template as <code>ACTIVE</code> or
     *            <code>INACTIVE</code> for a task to refer to it. Tasks can
     *            only be created from <code>ACTIVE</code> templates. If a
     *            template is marked as <code>INACTIVE</code>, then a task that
     *            refers to this template cannot be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskTemplateStatus
     */
    public CreateTaskTemplateRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a
     * task to refer to it. Tasks can only be created from <code>ACTIVE</code>
     * templates. If a template is marked as <code>INACTIVE</code>, then a task
     * that refers to this template cannot be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            Marks a template as <code>ACTIVE</code> or
     *            <code>INACTIVE</code> for a task to refer to it. Tasks can
     *            only be created from <code>ACTIVE</code> templates. If a
     *            template is marked as <code>INACTIVE</code>, then a task that
     *            refers to this template cannot be created.
     *            </p>
     * @see TaskTemplateStatus
     */
    public void setStatus(TaskTemplateStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a
     * task to refer to it. Tasks can only be created from <code>ACTIVE</code>
     * templates. If a template is marked as <code>INACTIVE</code>, then a task
     * that refers to this template cannot be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            Marks a template as <code>ACTIVE</code> or
     *            <code>INACTIVE</code> for a task to refer to it. Tasks can
     *            only be created from <code>ACTIVE</code> templates. If a
     *            template is marked as <code>INACTIVE</code>, then a task that
     *            refers to this template cannot be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskTemplateStatus
     */
    public CreateTaskTemplateRequest withStatus(TaskTemplateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Fields that are part of the template.
     * </p>
     *
     * @return <p>
     *         Fields that are part of the template.
     *         </p>
     */
    public java.util.List<TaskTemplateField> getFields() {
        return fields;
    }

    /**
     * <p>
     * Fields that are part of the template.
     * </p>
     *
     * @param fields <p>
     *            Fields that are part of the template.
     *            </p>
     */
    public void setFields(java.util.Collection<TaskTemplateField> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<TaskTemplateField>(fields);
    }

    /**
     * <p>
     * Fields that are part of the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fields <p>
     *            Fields that are part of the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskTemplateRequest withFields(TaskTemplateField... fields) {
        if (getFields() == null) {
            this.fields = new java.util.ArrayList<TaskTemplateField>(fields.length);
        }
        for (TaskTemplateField value : fields) {
            this.fields.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Fields that are part of the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fields <p>
     *            Fields that are part of the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskTemplateRequest withFields(java.util.Collection<TaskTemplateField> fields) {
        setFields(fields);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         A unique, case-sensitive identifier that you provide to ensure
     *         the idempotency of the request. If not provided, the Amazon Web
     *         Services SDK populates this field. For more information about
     *         idempotency, see <a href=
     *         "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *         >Making retries safe with idempotent APIs</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. If not provided, the Amazon
     *            Web Services SDK populates this field. For more information
     *            about idempotency, see <a href=
     *            "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *            >Making retries safe with idempotent APIs</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. If not provided, the Amazon
     *            Web Services SDK populates this field. For more information
     *            about idempotency, see <a href=
     *            "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *            >Making retries safe with idempotent APIs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTaskTemplateRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: " + getContactFlowId() + ",");
        if (getConstraints() != null)
            sb.append("Constraints: " + getConstraints() + ",");
        if (getDefaults() != null)
            sb.append("Defaults: " + getDefaults() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getFields() != null)
            sb.append("Fields: " + getFields() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode
                + ((getConstraints() == null) ? 0 : getConstraints().hashCode());
        hashCode = prime * hashCode + ((getDefaults() == null) ? 0 : getDefaults().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTaskTemplateRequest == false)
            return false;
        CreateTaskTemplateRequest other = (CreateTaskTemplateRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getContactFlowId() == null ^ this.getContactFlowId() == null)
            return false;
        if (other.getContactFlowId() != null
                && other.getContactFlowId().equals(this.getContactFlowId()) == false)
            return false;
        if (other.getConstraints() == null ^ this.getConstraints() == null)
            return false;
        if (other.getConstraints() != null
                && other.getConstraints().equals(this.getConstraints()) == false)
            return false;
        if (other.getDefaults() == null ^ this.getDefaults() == null)
            return false;
        if (other.getDefaults() != null && other.getDefaults().equals(this.getDefaults()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
