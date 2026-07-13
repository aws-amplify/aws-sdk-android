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
 * Provides a pre-signed URL for download of an approved attached file. This API
 * also returns metadata about the attached file. It will only return a
 * downloadURL if the status of the attached file is <code>APPROVED</code>.
 * </p>
 */
public class GetAttachedFileRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The unique identifier of the attached file resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String fileId;

    /**
     * <p>
     * Optional override for the expiry of the pre-signed S3 URL in seconds. The
     * default value is 300.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 300<br/>
     */
    private Integer urlExpiryInSeconds;

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
    public GetAttachedFileRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The unique identifier of the attached file resource.
     *         </p>
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param fileId <p>
     *            The unique identifier of the attached file resource.
     *            </p>
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param fileId <p>
     *            The unique identifier of the attached file resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAttachedFileRequest withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * <p>
     * Optional override for the expiry of the pre-signed S3 URL in seconds. The
     * default value is 300.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 300<br/>
     *
     * @return <p>
     *         Optional override for the expiry of the pre-signed S3 URL in
     *         seconds. The default value is 300.
     *         </p>
     */
    public Integer getUrlExpiryInSeconds() {
        return urlExpiryInSeconds;
    }

    /**
     * <p>
     * Optional override for the expiry of the pre-signed S3 URL in seconds. The
     * default value is 300.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 300<br/>
     *
     * @param urlExpiryInSeconds <p>
     *            Optional override for the expiry of the pre-signed S3 URL in
     *            seconds. The default value is 300.
     *            </p>
     */
    public void setUrlExpiryInSeconds(Integer urlExpiryInSeconds) {
        this.urlExpiryInSeconds = urlExpiryInSeconds;
    }

    /**
     * <p>
     * Optional override for the expiry of the pre-signed S3 URL in seconds. The
     * default value is 300.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 300<br/>
     *
     * @param urlExpiryInSeconds <p>
     *            Optional override for the expiry of the pre-signed S3 URL in
     *            seconds. The default value is 300.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAttachedFileRequest withUrlExpiryInSeconds(Integer urlExpiryInSeconds) {
        this.urlExpiryInSeconds = urlExpiryInSeconds;
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
    public GetAttachedFileRequest withAssociatedResourceArn(String associatedResourceArn) {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getFileId() != null)
            sb.append("FileId: " + getFileId() + ",");
        if (getUrlExpiryInSeconds() != null)
            sb.append("UrlExpiryInSeconds: " + getUrlExpiryInSeconds() + ",");
        if (getAssociatedResourceArn() != null)
            sb.append("AssociatedResourceArn: " + getAssociatedResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getFileId() == null) ? 0 : getFileId().hashCode());
        hashCode = prime * hashCode
                + ((getUrlExpiryInSeconds() == null) ? 0 : getUrlExpiryInSeconds().hashCode());
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

        if (obj instanceof GetAttachedFileRequest == false)
            return false;
        GetAttachedFileRequest other = (GetAttachedFileRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getFileId() == null ^ this.getFileId() == null)
            return false;
        if (other.getFileId() != null && other.getFileId().equals(this.getFileId()) == false)
            return false;
        if (other.getUrlExpiryInSeconds() == null ^ this.getUrlExpiryInSeconds() == null)
            return false;
        if (other.getUrlExpiryInSeconds() != null
                && other.getUrlExpiryInSeconds().equals(this.getUrlExpiryInSeconds()) == false)
            return false;
        if (other.getAssociatedResourceArn() == null ^ this.getAssociatedResourceArn() == null)
            return false;
        if (other.getAssociatedResourceArn() != null
                && other.getAssociatedResourceArn().equals(this.getAssociatedResourceArn()) == false)
            return false;
        return true;
    }
}
