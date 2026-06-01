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
 * Deletes the particular version specified in <code>ViewVersion</code>
 * identifier.
 * </p>
 */
public class DeleteViewVersionRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The version number of the view.
     * </p>
     */
    private Integer viewVersion;

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
    public DeleteViewVersionRequest withInstanceId(String instanceId) {
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
    public DeleteViewVersionRequest withViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }

    /**
     * <p>
     * The version number of the view.
     * </p>
     *
     * @return <p>
     *         The version number of the view.
     *         </p>
     */
    public Integer getViewVersion() {
        return viewVersion;
    }

    /**
     * <p>
     * The version number of the view.
     * </p>
     *
     * @param viewVersion <p>
     *            The version number of the view.
     *            </p>
     */
    public void setViewVersion(Integer viewVersion) {
        this.viewVersion = viewVersion;
    }

    /**
     * <p>
     * The version number of the view.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param viewVersion <p>
     *            The version number of the view.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteViewVersionRequest withViewVersion(Integer viewVersion) {
        this.viewVersion = viewVersion;
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
        if (getViewVersion() != null)
            sb.append("ViewVersion: " + getViewVersion());
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
                + ((getViewVersion() == null) ? 0 : getViewVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteViewVersionRequest == false)
            return false;
        DeleteViewVersionRequest other = (DeleteViewVersionRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getViewId() == null ^ this.getViewId() == null)
            return false;
        if (other.getViewId() != null && other.getViewId().equals(this.getViewId()) == false)
            return false;
        if (other.getViewVersion() == null ^ this.getViewVersion() == null)
            return false;
        if (other.getViewVersion() != null
                && other.getViewVersion().equals(this.getViewVersion()) == false)
            return false;
        return true;
    }
}
