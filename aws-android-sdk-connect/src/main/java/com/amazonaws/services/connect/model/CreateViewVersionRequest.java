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
 * Publishes a new version of the view identifier.
 * </p>
 * <p>
 * Versions are immutable and monotonically increasing.
 * </p>
 * <p>
 * It returns the highest version if there is no change in content compared to
 * that version. An error is displayed if the supplied ViewContentSha256 is
 * different from the ViewContentSha256 of the <code>$LATEST</code> alias.
 * </p>
 */
public class CreateViewVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/]+$<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The identifier of the view. Both <code>ViewArn</code> and
     * <code>ViewId</code> can be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     */
    private String viewId;

    /**
     * <p>
     * The description for the version being published.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     */
    private String versionDescription;

    /**
     * <p>
     * Indicates the checksum value of the latest published view content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9]$<br/>
     */
    private String viewContentSha256;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/]+$<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/]+$<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/]+$<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateViewVersionRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The identifier of the view. Both <code>ViewArn</code> and
     * <code>ViewId</code> can be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     *
     * @return <p>
     *         The identifier of the view. Both <code>ViewArn</code> and
     *         <code>ViewId</code> can be used.
     *         </p>
     */
    public String getViewId() {
        return viewId;
    }

    /**
     * <p>
     * The identifier of the view. Both <code>ViewArn</code> and
     * <code>ViewId</code> can be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     *
     * @param viewId <p>
     *            The identifier of the view. Both <code>ViewArn</code> and
     *            <code>ViewId</code> can be used.
     *            </p>
     */
    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    /**
     * <p>
     * The identifier of the view. Both <code>ViewArn</code> and
     * <code>ViewId</code> can be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 500<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\_\-:\/$]+$<br/>
     *
     * @param viewId <p>
     *            The identifier of the view. Both <code>ViewArn</code> and
     *            <code>ViewId</code> can be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateViewVersionRequest withViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }

    /**
     * <p>
     * The description for the version being published.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @return <p>
     *         The description for the version being published.
     *         </p>
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    /**
     * <p>
     * The description for the version being published.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @param versionDescription <p>
     *            The description for the version being published.
     *            </p>
     */
    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * The description for the version being published.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern:
     * </b>^([\p{L}\p{N}_.:\/=+\-@,()']+[\p{L}\p{Z}\p{N}_.:\/=+\-@,()']*)$<br/>
     *
     * @param versionDescription <p>
     *            The description for the version being published.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateViewVersionRequest withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    /**
     * <p>
     * Indicates the checksum value of the latest published view content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9]$<br/>
     *
     * @return <p>
     *         Indicates the checksum value of the latest published view
     *         content.
     *         </p>
     */
    public String getViewContentSha256() {
        return viewContentSha256;
    }

    /**
     * <p>
     * Indicates the checksum value of the latest published view content.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9]$<br/>
     *
     * @param viewContentSha256 <p>
     *            Indicates the checksum value of the latest published view
     *            content.
     *            </p>
     */
    public void setViewContentSha256(String viewContentSha256) {
        this.viewContentSha256 = viewContentSha256;
    }

    /**
     * <p>
     * Indicates the checksum value of the latest published view content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9]$<br/>
     *
     * @param viewContentSha256 <p>
     *            Indicates the checksum value of the latest published view
     *            content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateViewVersionRequest withViewContentSha256(String viewContentSha256) {
        this.viewContentSha256 = viewContentSha256;
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
        if (getViewId() != null)
            sb.append("ViewId: " + getViewId() + ",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: " + getVersionDescription() + ",");
        if (getViewContentSha256() != null)
            sb.append("ViewContentSha256: " + getViewContentSha256());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getViewId() == null) ? 0 : getViewId().hashCode());
        hashCode = prime * hashCode
                + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        hashCode = prime * hashCode
                + ((getViewContentSha256() == null) ? 0 : getViewContentSha256().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateViewVersionRequest == false)
            return false;
        CreateViewVersionRequest other = (CreateViewVersionRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getViewId() == null ^ this.getViewId() == null)
            return false;
        if (other.getViewId() != null && other.getViewId().equals(this.getViewId()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null
                && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        if (other.getViewContentSha256() == null ^ this.getViewContentSha256() == null)
            return false;
        if (other.getViewContentSha256() != null
                && other.getViewContentSha256().equals(this.getViewContentSha256()) == false)
            return false;
        return true;
    }
}
