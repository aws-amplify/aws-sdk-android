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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Exports a running or stopped instance to an Amazon S3 bucket.
 * </p>
 * <p>
 * For information about the supported operating systems, image formats, and
 * known limitations for the types of instances you can export, see <a
 * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmexport.html"
 * >Exporting an Instance as a VM Using VM Import/Export</a> in the <i>VM
 * Import/Export User Guide</i>.
 * </p>
 */
public class CreateInstanceExportTaskRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A description for the conversion task or the resource being exported. The
     * maximum length is 255 characters.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The format and location for an instance export task.
     * </p>
     */
    private ExportToS3TaskSpecification exportToS3Task;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The target virtualization environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>citrix, vmware, microsoft
     */
    private String targetEnvironment;

    /**
     * <p>
     * The tags to apply to the instance export task during creation.
     * </p>
     */
    private java.util.List<TagSpecification> tagSpecifications;

    /**
     * <p>
     * A description for the conversion task or the resource being exported. The
     * maximum length is 255 characters.
     * </p>
     *
     * @return <p>
     *         A description for the conversion task or the resource being
     *         exported. The maximum length is 255 characters.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the conversion task or the resource being exported. The
     * maximum length is 255 characters.
     * </p>
     *
     * @param description <p>
     *            A description for the conversion task or the resource being
     *            exported. The maximum length is 255 characters.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the conversion task or the resource being exported. The
     * maximum length is 255 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description for the conversion task or the resource being
     *            exported. The maximum length is 255 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstanceExportTaskRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The format and location for an instance export task.
     * </p>
     *
     * @return <p>
     *         The format and location for an instance export task.
     *         </p>
     */
    public ExportToS3TaskSpecification getExportToS3Task() {
        return exportToS3Task;
    }

    /**
     * <p>
     * The format and location for an instance export task.
     * </p>
     *
     * @param exportToS3Task <p>
     *            The format and location for an instance export task.
     *            </p>
     */
    public void setExportToS3Task(ExportToS3TaskSpecification exportToS3Task) {
        this.exportToS3Task = exportToS3Task;
    }

    /**
     * <p>
     * The format and location for an instance export task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportToS3Task <p>
     *            The format and location for an instance export task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstanceExportTaskRequest withExportToS3Task(
            ExportToS3TaskSpecification exportToS3Task) {
        this.exportToS3Task = exportToS3Task;
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
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
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstanceExportTaskRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The target virtualization environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>citrix, vmware, microsoft
     *
     * @return <p>
     *         The target virtualization environment.
     *         </p>
     * @see ExportEnvironment
     */
    public String getTargetEnvironment() {
        return targetEnvironment;
    }

    /**
     * <p>
     * The target virtualization environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>citrix, vmware, microsoft
     *
     * @param targetEnvironment <p>
     *            The target virtualization environment.
     *            </p>
     * @see ExportEnvironment
     */
    public void setTargetEnvironment(String targetEnvironment) {
        this.targetEnvironment = targetEnvironment;
    }

    /**
     * <p>
     * The target virtualization environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>citrix, vmware, microsoft
     *
     * @param targetEnvironment <p>
     *            The target virtualization environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExportEnvironment
     */
    public CreateInstanceExportTaskRequest withTargetEnvironment(String targetEnvironment) {
        this.targetEnvironment = targetEnvironment;
        return this;
    }

    /**
     * <p>
     * The target virtualization environment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>citrix, vmware, microsoft
     *
     * @param targetEnvironment <p>
     *            The target virtualization environment.
     *            </p>
     * @see ExportEnvironment
     */
    public void setTargetEnvironment(ExportEnvironment targetEnvironment) {
        this.targetEnvironment = targetEnvironment.toString();
    }

    /**
     * <p>
     * The target virtualization environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>citrix, vmware, microsoft
     *
     * @param targetEnvironment <p>
     *            The target virtualization environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExportEnvironment
     */
    public CreateInstanceExportTaskRequest withTargetEnvironment(ExportEnvironment targetEnvironment) {
        this.targetEnvironment = targetEnvironment.toString();
        return this;
    }

    /**
     * <p>
     * The tags to apply to the instance export task during creation.
     * </p>
     *
     * @return <p>
     *         The tags to apply to the instance export task during creation.
     *         </p>
     */
    public java.util.List<TagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the instance export task during creation.
     * </p>
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the instance export task during creation.
     *            </p>
     */
    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new java.util.ArrayList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the instance export task during creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the instance export task during creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstanceExportTaskRequest withTagSpecifications(
            TagSpecification... tagSpecifications) {
        if (getTagSpecifications() == null) {
            this.tagSpecifications = new java.util.ArrayList<TagSpecification>(
                    tagSpecifications.length);
        }
        for (TagSpecification value : tagSpecifications) {
            this.tagSpecifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the instance export task during creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSpecifications <p>
     *            The tags to apply to the instance export task during creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateInstanceExportTaskRequest withTagSpecifications(
            java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
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
        if (getExportToS3Task() != null)
            sb.append("ExportToS3Task: " + getExportToS3Task() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getTargetEnvironment() != null)
            sb.append("TargetEnvironment: " + getTargetEnvironment() + ",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: " + getTagSpecifications());
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
                + ((getExportToS3Task() == null) ? 0 : getExportToS3Task().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getTargetEnvironment() == null) ? 0 : getTargetEnvironment().hashCode());
        hashCode = prime * hashCode
                + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstanceExportTaskRequest == false)
            return false;
        CreateInstanceExportTaskRequest other = (CreateInstanceExportTaskRequest) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExportToS3Task() == null ^ this.getExportToS3Task() == null)
            return false;
        if (other.getExportToS3Task() != null
                && other.getExportToS3Task().equals(this.getExportToS3Task()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getTargetEnvironment() == null ^ this.getTargetEnvironment() == null)
            return false;
        if (other.getTargetEnvironment() != null
                && other.getTargetEnvironment().equals(this.getTargetEnvironment()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null
                && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }
}
