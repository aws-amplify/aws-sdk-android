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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration properties for the task run.
 * </p>
 */
public class TaskRunProperties implements Serializable {
    /**
     * <p>
     * The type of task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVALUATION, LABELING_SET_GENERATION,
     * IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES
     */
    private String taskType;

    /**
     * <p>
     * The configuration properties for an importing labels task run.
     * </p>
     */
    private ImportLabelsTaskRunProperties importLabelsTaskRunProperties;

    /**
     * <p>
     * The configuration properties for an exporting labels task run.
     * </p>
     */
    private ExportLabelsTaskRunProperties exportLabelsTaskRunProperties;

    /**
     * <p>
     * The configuration properties for a labeling set generation task run.
     * </p>
     */
    private LabelingSetGenerationTaskRunProperties labelingSetGenerationTaskRunProperties;

    /**
     * <p>
     * The configuration properties for a find matches task run.
     * </p>
     */
    private FindMatchesTaskRunProperties findMatchesTaskRunProperties;

    /**
     * <p>
     * The type of task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVALUATION, LABELING_SET_GENERATION,
     * IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES
     *
     * @return <p>
     *         The type of task run.
     *         </p>
     * @see TaskType
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * <p>
     * The type of task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVALUATION, LABELING_SET_GENERATION,
     * IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES
     *
     * @param taskType <p>
     *            The type of task run.
     *            </p>
     * @see TaskType
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * <p>
     * The type of task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVALUATION, LABELING_SET_GENERATION,
     * IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES
     *
     * @param taskType <p>
     *            The type of task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskType
     */
    public TaskRunProperties withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * <p>
     * The type of task run.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVALUATION, LABELING_SET_GENERATION,
     * IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES
     *
     * @param taskType <p>
     *            The type of task run.
     *            </p>
     * @see TaskType
     */
    public void setTaskType(TaskType taskType) {
        this.taskType = taskType.toString();
    }

    /**
     * <p>
     * The type of task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EVALUATION, LABELING_SET_GENERATION,
     * IMPORT_LABELS, EXPORT_LABELS, FIND_MATCHES
     *
     * @param taskType <p>
     *            The type of task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskType
     */
    public TaskRunProperties withTaskType(TaskType taskType) {
        this.taskType = taskType.toString();
        return this;
    }

    /**
     * <p>
     * The configuration properties for an importing labels task run.
     * </p>
     *
     * @return <p>
     *         The configuration properties for an importing labels task run.
     *         </p>
     */
    public ImportLabelsTaskRunProperties getImportLabelsTaskRunProperties() {
        return importLabelsTaskRunProperties;
    }

    /**
     * <p>
     * The configuration properties for an importing labels task run.
     * </p>
     *
     * @param importLabelsTaskRunProperties <p>
     *            The configuration properties for an importing labels task run.
     *            </p>
     */
    public void setImportLabelsTaskRunProperties(
            ImportLabelsTaskRunProperties importLabelsTaskRunProperties) {
        this.importLabelsTaskRunProperties = importLabelsTaskRunProperties;
    }

    /**
     * <p>
     * The configuration properties for an importing labels task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importLabelsTaskRunProperties <p>
     *            The configuration properties for an importing labels task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskRunProperties withImportLabelsTaskRunProperties(
            ImportLabelsTaskRunProperties importLabelsTaskRunProperties) {
        this.importLabelsTaskRunProperties = importLabelsTaskRunProperties;
        return this;
    }

    /**
     * <p>
     * The configuration properties for an exporting labels task run.
     * </p>
     *
     * @return <p>
     *         The configuration properties for an exporting labels task run.
     *         </p>
     */
    public ExportLabelsTaskRunProperties getExportLabelsTaskRunProperties() {
        return exportLabelsTaskRunProperties;
    }

    /**
     * <p>
     * The configuration properties for an exporting labels task run.
     * </p>
     *
     * @param exportLabelsTaskRunProperties <p>
     *            The configuration properties for an exporting labels task run.
     *            </p>
     */
    public void setExportLabelsTaskRunProperties(
            ExportLabelsTaskRunProperties exportLabelsTaskRunProperties) {
        this.exportLabelsTaskRunProperties = exportLabelsTaskRunProperties;
    }

    /**
     * <p>
     * The configuration properties for an exporting labels task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportLabelsTaskRunProperties <p>
     *            The configuration properties for an exporting labels task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskRunProperties withExportLabelsTaskRunProperties(
            ExportLabelsTaskRunProperties exportLabelsTaskRunProperties) {
        this.exportLabelsTaskRunProperties = exportLabelsTaskRunProperties;
        return this;
    }

    /**
     * <p>
     * The configuration properties for a labeling set generation task run.
     * </p>
     *
     * @return <p>
     *         The configuration properties for a labeling set generation task
     *         run.
     *         </p>
     */
    public LabelingSetGenerationTaskRunProperties getLabelingSetGenerationTaskRunProperties() {
        return labelingSetGenerationTaskRunProperties;
    }

    /**
     * <p>
     * The configuration properties for a labeling set generation task run.
     * </p>
     *
     * @param labelingSetGenerationTaskRunProperties <p>
     *            The configuration properties for a labeling set generation
     *            task run.
     *            </p>
     */
    public void setLabelingSetGenerationTaskRunProperties(
            LabelingSetGenerationTaskRunProperties labelingSetGenerationTaskRunProperties) {
        this.labelingSetGenerationTaskRunProperties = labelingSetGenerationTaskRunProperties;
    }

    /**
     * <p>
     * The configuration properties for a labeling set generation task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelingSetGenerationTaskRunProperties <p>
     *            The configuration properties for a labeling set generation
     *            task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskRunProperties withLabelingSetGenerationTaskRunProperties(
            LabelingSetGenerationTaskRunProperties labelingSetGenerationTaskRunProperties) {
        this.labelingSetGenerationTaskRunProperties = labelingSetGenerationTaskRunProperties;
        return this;
    }

    /**
     * <p>
     * The configuration properties for a find matches task run.
     * </p>
     *
     * @return <p>
     *         The configuration properties for a find matches task run.
     *         </p>
     */
    public FindMatchesTaskRunProperties getFindMatchesTaskRunProperties() {
        return findMatchesTaskRunProperties;
    }

    /**
     * <p>
     * The configuration properties for a find matches task run.
     * </p>
     *
     * @param findMatchesTaskRunProperties <p>
     *            The configuration properties for a find matches task run.
     *            </p>
     */
    public void setFindMatchesTaskRunProperties(
            FindMatchesTaskRunProperties findMatchesTaskRunProperties) {
        this.findMatchesTaskRunProperties = findMatchesTaskRunProperties;
    }

    /**
     * <p>
     * The configuration properties for a find matches task run.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findMatchesTaskRunProperties <p>
     *            The configuration properties for a find matches task run.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskRunProperties withFindMatchesTaskRunProperties(
            FindMatchesTaskRunProperties findMatchesTaskRunProperties) {
        this.findMatchesTaskRunProperties = findMatchesTaskRunProperties;
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
        if (getTaskType() != null)
            sb.append("TaskType: " + getTaskType() + ",");
        if (getImportLabelsTaskRunProperties() != null)
            sb.append("ImportLabelsTaskRunProperties: " + getImportLabelsTaskRunProperties() + ",");
        if (getExportLabelsTaskRunProperties() != null)
            sb.append("ExportLabelsTaskRunProperties: " + getExportLabelsTaskRunProperties() + ",");
        if (getLabelingSetGenerationTaskRunProperties() != null)
            sb.append("LabelingSetGenerationTaskRunProperties: "
                    + getLabelingSetGenerationTaskRunProperties() + ",");
        if (getFindMatchesTaskRunProperties() != null)
            sb.append("FindMatchesTaskRunProperties: " + getFindMatchesTaskRunProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        hashCode = prime
                * hashCode
                + ((getImportLabelsTaskRunProperties() == null) ? 0
                        : getImportLabelsTaskRunProperties().hashCode());
        hashCode = prime
                * hashCode
                + ((getExportLabelsTaskRunProperties() == null) ? 0
                        : getExportLabelsTaskRunProperties().hashCode());
        hashCode = prime
                * hashCode
                + ((getLabelingSetGenerationTaskRunProperties() == null) ? 0
                        : getLabelingSetGenerationTaskRunProperties().hashCode());
        hashCode = prime
                * hashCode
                + ((getFindMatchesTaskRunProperties() == null) ? 0
                        : getFindMatchesTaskRunProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskRunProperties == false)
            return false;
        TaskRunProperties other = (TaskRunProperties) obj;

        if (other.getTaskType() == null ^ this.getTaskType() == null)
            return false;
        if (other.getTaskType() != null && other.getTaskType().equals(this.getTaskType()) == false)
            return false;
        if (other.getImportLabelsTaskRunProperties() == null
                ^ this.getImportLabelsTaskRunProperties() == null)
            return false;
        if (other.getImportLabelsTaskRunProperties() != null
                && other.getImportLabelsTaskRunProperties().equals(
                        this.getImportLabelsTaskRunProperties()) == false)
            return false;
        if (other.getExportLabelsTaskRunProperties() == null
                ^ this.getExportLabelsTaskRunProperties() == null)
            return false;
        if (other.getExportLabelsTaskRunProperties() != null
                && other.getExportLabelsTaskRunProperties().equals(
                        this.getExportLabelsTaskRunProperties()) == false)
            return false;
        if (other.getLabelingSetGenerationTaskRunProperties() == null
                ^ this.getLabelingSetGenerationTaskRunProperties() == null)
            return false;
        if (other.getLabelingSetGenerationTaskRunProperties() != null
                && other.getLabelingSetGenerationTaskRunProperties().equals(
                        this.getLabelingSetGenerationTaskRunProperties()) == false)
            return false;
        if (other.getFindMatchesTaskRunProperties() == null
                ^ this.getFindMatchesTaskRunProperties() == null)
            return false;
        if (other.getFindMatchesTaskRunProperties() != null
                && other.getFindMatchesTaskRunProperties().equals(
                        this.getFindMatchesTaskRunProperties()) == false)
            return false;
        return true;
    }
}
