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

/**
 * <p>
 * Describes a conversion task.
 * </p>
 */
public class ConversionTask implements Serializable {
    /**
     * <p>
     * The ID of the conversion task.
     * </p>
     */
    private String conversionTaskId;

    /**
     * <p>
     * The time when the task expires. If the upload isn't complete before the
     * expiration time, we automatically cancel the task.
     * </p>
     */
    private String expirationTime;

    /**
     * <p>
     * If the task is for importing an instance, this contains information about
     * the import instance task.
     * </p>
     */
    private ImportInstanceTaskDetails importInstance;

    /**
     * <p>
     * If the task is for importing a volume, this contains information about
     * the import volume task.
     * </p>
     */
    private ImportVolumeTaskDetails importVolume;

    /**
     * <p>
     * The state of the conversion task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     */
    private String state;

    /**
     * <p>
     * The status message related to the conversion task.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * Any tags assigned to the task.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the conversion task.
     * </p>
     *
     * @return <p>
     *         The ID of the conversion task.
     *         </p>
     */
    public String getConversionTaskId() {
        return conversionTaskId;
    }

    /**
     * <p>
     * The ID of the conversion task.
     * </p>
     *
     * @param conversionTaskId <p>
     *            The ID of the conversion task.
     *            </p>
     */
    public void setConversionTaskId(String conversionTaskId) {
        this.conversionTaskId = conversionTaskId;
    }

    /**
     * <p>
     * The ID of the conversion task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conversionTaskId <p>
     *            The ID of the conversion task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConversionTask withConversionTaskId(String conversionTaskId) {
        this.conversionTaskId = conversionTaskId;
        return this;
    }

    /**
     * <p>
     * The time when the task expires. If the upload isn't complete before the
     * expiration time, we automatically cancel the task.
     * </p>
     *
     * @return <p>
     *         The time when the task expires. If the upload isn't complete
     *         before the expiration time, we automatically cancel the task.
     *         </p>
     */
    public String getExpirationTime() {
        return expirationTime;
    }

    /**
     * <p>
     * The time when the task expires. If the upload isn't complete before the
     * expiration time, we automatically cancel the task.
     * </p>
     *
     * @param expirationTime <p>
     *            The time when the task expires. If the upload isn't complete
     *            before the expiration time, we automatically cancel the task.
     *            </p>
     */
    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * <p>
     * The time when the task expires. If the upload isn't complete before the
     * expiration time, we automatically cancel the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expirationTime <p>
     *            The time when the task expires. If the upload isn't complete
     *            before the expiration time, we automatically cancel the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConversionTask withExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * <p>
     * If the task is for importing an instance, this contains information about
     * the import instance task.
     * </p>
     *
     * @return <p>
     *         If the task is for importing an instance, this contains
     *         information about the import instance task.
     *         </p>
     */
    public ImportInstanceTaskDetails getImportInstance() {
        return importInstance;
    }

    /**
     * <p>
     * If the task is for importing an instance, this contains information about
     * the import instance task.
     * </p>
     *
     * @param importInstance <p>
     *            If the task is for importing an instance, this contains
     *            information about the import instance task.
     *            </p>
     */
    public void setImportInstance(ImportInstanceTaskDetails importInstance) {
        this.importInstance = importInstance;
    }

    /**
     * <p>
     * If the task is for importing an instance, this contains information about
     * the import instance task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importInstance <p>
     *            If the task is for importing an instance, this contains
     *            information about the import instance task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConversionTask withImportInstance(ImportInstanceTaskDetails importInstance) {
        this.importInstance = importInstance;
        return this;
    }

    /**
     * <p>
     * If the task is for importing a volume, this contains information about
     * the import volume task.
     * </p>
     *
     * @return <p>
     *         If the task is for importing a volume, this contains information
     *         about the import volume task.
     *         </p>
     */
    public ImportVolumeTaskDetails getImportVolume() {
        return importVolume;
    }

    /**
     * <p>
     * If the task is for importing a volume, this contains information about
     * the import volume task.
     * </p>
     *
     * @param importVolume <p>
     *            If the task is for importing a volume, this contains
     *            information about the import volume task.
     *            </p>
     */
    public void setImportVolume(ImportVolumeTaskDetails importVolume) {
        this.importVolume = importVolume;
    }

    /**
     * <p>
     * If the task is for importing a volume, this contains information about
     * the import volume task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importVolume <p>
     *            If the task is for importing a volume, this contains
     *            information about the import volume task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConversionTask withImportVolume(ImportVolumeTaskDetails importVolume) {
        this.importVolume = importVolume;
        return this;
    }

    /**
     * <p>
     * The state of the conversion task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @return <p>
     *         The state of the conversion task.
     *         </p>
     * @see ConversionTaskState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the conversion task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state <p>
     *            The state of the conversion task.
     *            </p>
     * @see ConversionTaskState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the conversion task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state <p>
     *            The state of the conversion task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConversionTaskState
     */
    public ConversionTask withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the conversion task.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state <p>
     *            The state of the conversion task.
     *            </p>
     * @see ConversionTaskState
     */
    public void setState(ConversionTaskState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the conversion task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>active, cancelling, cancelled, completed
     *
     * @param state <p>
     *            The state of the conversion task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConversionTaskState
     */
    public ConversionTask withState(ConversionTaskState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The status message related to the conversion task.
     * </p>
     *
     * @return <p>
     *         The status message related to the conversion task.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * The status message related to the conversion task.
     * </p>
     *
     * @param statusMessage <p>
     *            The status message related to the conversion task.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message related to the conversion task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            The status message related to the conversion task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConversionTask withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the task.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the task.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the task.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the task.
     *            </p>
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
     * Any tags assigned to the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConversionTask withTags(Tag... tags) {
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
     * Any tags assigned to the task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConversionTask withTags(java.util.Collection<Tag> tags) {
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
        if (getConversionTaskId() != null)
            sb.append("ConversionTaskId: " + getConversionTaskId() + ",");
        if (getExpirationTime() != null)
            sb.append("ExpirationTime: " + getExpirationTime() + ",");
        if (getImportInstance() != null)
            sb.append("ImportInstance: " + getImportInstance() + ",");
        if (getImportVolume() != null)
            sb.append("ImportVolume: " + getImportVolume() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
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
                + ((getConversionTaskId() == null) ? 0 : getConversionTaskId().hashCode());
        hashCode = prime * hashCode
                + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode());
        hashCode = prime * hashCode
                + ((getImportInstance() == null) ? 0 : getImportInstance().hashCode());
        hashCode = prime * hashCode
                + ((getImportVolume() == null) ? 0 : getImportVolume().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConversionTask == false)
            return false;
        ConversionTask other = (ConversionTask) obj;

        if (other.getConversionTaskId() == null ^ this.getConversionTaskId() == null)
            return false;
        if (other.getConversionTaskId() != null
                && other.getConversionTaskId().equals(this.getConversionTaskId()) == false)
            return false;
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null)
            return false;
        if (other.getExpirationTime() != null
                && other.getExpirationTime().equals(this.getExpirationTime()) == false)
            return false;
        if (other.getImportInstance() == null ^ this.getImportInstance() == null)
            return false;
        if (other.getImportInstance() != null
                && other.getImportInstance().equals(this.getImportInstance()) == false)
            return false;
        if (other.getImportVolume() == null ^ this.getImportVolume() == null)
            return false;
        if (other.getImportVolume() != null
                && other.getImportVolume().equals(this.getImportVolume()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
