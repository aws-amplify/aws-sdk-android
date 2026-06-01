/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Allows you to retrieve metadata about multiple attached files on an
 * associated resource. Each attached file provided in the input list must be
 * associated with the input AssociatedResourceArn.
 * </p>
 */
public class BatchGetAttachedFileMetadataRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique identifiers of the attached file resource.
     * </p>
     */
    private java.util.List<String> fileIds;

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     * >Cases</a> are the only current supported resource.
     * </p>
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     */
    private String associatedResourceArn;

    /**
     * <p>
     * The unique identifiers of the attached file resource.
     * </p>
     *
     * @return <p>
     *         The unique identifiers of the attached file resource.
     *         </p>
     */
    public java.util.List<String> getFileIds() {
        return fileIds;
    }

    /**
     * <p>
     * The unique identifiers of the attached file resource.
     * </p>
     *
     * @param fileIds <p>
     *            The unique identifiers of the attached file resource.
     *            </p>
     */
    public void setFileIds(java.util.Collection<String> fileIds) {
        if (fileIds == null) {
            this.fileIds = null;
            return;
        }

        this.fileIds = new java.util.ArrayList<String>(fileIds);
    }

    /**
     * <p>
     * The unique identifiers of the attached file resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileIds <p>
     *            The unique identifiers of the attached file resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetAttachedFileMetadataRequest withFileIds(String... fileIds) {
        if (getFileIds() == null) {
            this.fileIds = new java.util.ArrayList<String>(fileIds.length);
        }
        for (String value : fileIds) {
            this.fileIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the attached file resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileIds <p>
     *            The unique identifiers of the attached file resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetAttachedFileMetadataRequest withFileIds(java.util.Collection<String> fileIds) {
        setFileIds(fileIds);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The unique identifier of the Connect instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The unique identifier of the Connect instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The unique identifier of the Connect instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetAttachedFileMetadataRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     * >Cases</a> are the only current supported resource.
     * </p>
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     *
     * @return <p>
     *         The resource to which the attached file is (being) uploaded to.
     *         <a href=
     *         "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     *         >Cases</a> are the only current supported resource.
     *         </p>
     *         <note>
     *         <p>
     *         This value must be a valid ARN.
     *         </p>
     *         </note>
     */
    public String getAssociatedResourceArn() {
        return associatedResourceArn;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     * >Cases</a> are the only current supported resource.
     * </p>
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     *
     * @param associatedResourceArn <p>
     *            The resource to which the attached file is (being) uploaded
     *            to. <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     *            >Cases</a> are the only current supported resource.
     *            </p>
     *            <note>
     *            <p>
     *            This value must be a valid ARN.
     *            </p>
     *            </note>
     */
    public void setAssociatedResourceArn(String associatedResourceArn) {
        this.associatedResourceArn = associatedResourceArn;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a href=
     * "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     * >Cases</a> are the only current supported resource.
     * </p>
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedResourceArn <p>
     *            The resource to which the attached file is (being) uploaded
     *            to. <a href=
     *            "https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     *            >Cases</a> are the only current supported resource.
     *            </p>
     *            <note>
     *            <p>
     *            This value must be a valid ARN.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetAttachedFileMetadataRequest withAssociatedResourceArn(
            String associatedResourceArn) {
        this.associatedResourceArn = associatedResourceArn;
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
        if (getFileIds() != null)
            sb.append("FileIds: " + getFileIds() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getAssociatedResourceArn() != null)
            sb.append("AssociatedResourceArn: " + getAssociatedResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileIds() == null) ? 0 : getFileIds().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssociatedResourceArn() == null) ? 0 : getAssociatedResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetAttachedFileMetadataRequest == false)
            return false;
        BatchGetAttachedFileMetadataRequest other = (BatchGetAttachedFileMetadataRequest) obj;

        if (other.getFileIds() == null ^ this.getFileIds() == null)
            return false;
        if (other.getFileIds() != null && other.getFileIds().equals(this.getFileIds()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAssociatedResourceArn() == null ^ this.getAssociatedResourceArn() == null)
            return false;
        if (other.getAssociatedResourceArn() != null
                && other.getAssociatedResourceArn().equals(this.getAssociatedResourceArn()) == false)
            return false;
        return true;
    }
}
