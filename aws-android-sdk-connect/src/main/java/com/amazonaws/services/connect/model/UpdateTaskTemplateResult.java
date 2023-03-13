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

public class UpdateTaskTemplateResult implements Serializable {
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
     * The identifier of the task template resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the task template resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     */
    private String arn;

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
     * Fields that are part of the template.
     * </p>
     */
    private java.util.List<TaskTemplateField> fields;

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
     * The timestamp when the task template was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The timestamp when the task template was created.
     * </p>
     */
    private java.util.Date createdTime;

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
    public UpdateTaskTemplateResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the task template resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         The identifier of the task template resource.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the task template resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param id <p>
     *            The identifier of the task template resource.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the task template resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param id <p>
     *            The identifier of the task template resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTaskTemplateResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the task template resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the task template resource.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the task template resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the task template resource.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the task template resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the task template resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTaskTemplateResult withArn(String arn) {
        this.arn = arn;
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
    public UpdateTaskTemplateResult withName(String name) {
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
    public UpdateTaskTemplateResult withDescription(String description) {
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
    public UpdateTaskTemplateResult withContactFlowId(String contactFlowId) {
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
    public UpdateTaskTemplateResult withConstraints(TaskTemplateConstraints constraints) {
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
    public UpdateTaskTemplateResult withDefaults(TaskTemplateDefaults defaults) {
        this.defaults = defaults;
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
    public UpdateTaskTemplateResult withFields(TaskTemplateField... fields) {
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
    public UpdateTaskTemplateResult withFields(java.util.Collection<TaskTemplateField> fields) {
        setFields(fields);
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
    public UpdateTaskTemplateResult withStatus(String status) {
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
    public UpdateTaskTemplateResult withStatus(TaskTemplateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the task template was last modified.
     * </p>
     *
     * @return <p>
     *         The timestamp when the task template was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the task template was last modified.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The timestamp when the task template was last modified.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the task template was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The timestamp when the task template was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTaskTemplateResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * The timestamp when the task template was created.
     * </p>
     *
     * @return <p>
     *         The timestamp when the task template was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The timestamp when the task template was created.
     * </p>
     *
     * @param createdTime <p>
     *            The timestamp when the task template was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp when the task template was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The timestamp when the task template was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTaskTemplateResult withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
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
        if (getFields() != null)
            sb.append("Fields: " + getFields() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode
                + ((getConstraints() == null) ? 0 : getConstraints().hashCode());
        hashCode = prime * hashCode + ((getDefaults() == null) ? 0 : getDefaults().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTaskTemplateResult == false)
            return false;
        UpdateTaskTemplateResult other = (UpdateTaskTemplateResult) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }
}
