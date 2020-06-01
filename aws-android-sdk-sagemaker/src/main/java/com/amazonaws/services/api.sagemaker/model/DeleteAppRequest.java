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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Used to stop and delete an app.
 * </p>
 */
public class DeleteAppRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The domain ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     */
    private String domainId;

    /**
     * <p>
     * The user profile name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String userProfileName;

    /**
     * <p>
     * The type of app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JupyterServer, KernelGateway, TensorBoard
     */
    private String appType;

    /**
     * <p>
     * The name of the app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String appName;

    /**
     * <p>
     * The domain ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @return <p>
     *         The domain ID.
     *         </p>
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * <p>
     * The domain ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @param domainId <p>
     *            The domain ID.
     *            </p>
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The domain ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @param domainId <p>
     *            The domain ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAppRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * <p>
     * The user profile name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The user profile name.
     *         </p>
     */
    public String getUserProfileName() {
        return userProfileName;
    }

    /**
     * <p>
     * The user profile name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param userProfileName <p>
     *            The user profile name.
     *            </p>
     */
    public void setUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
    }

    /**
     * <p>
     * The user profile name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param userProfileName <p>
     *            The user profile name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAppRequest withUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
        return this;
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JupyterServer, KernelGateway, TensorBoard
     *
     * @return <p>
     *         The type of app.
     *         </p>
     * @see AppType
     */
    public String getAppType() {
        return appType;
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JupyterServer, KernelGateway, TensorBoard
     *
     * @param appType <p>
     *            The type of app.
     *            </p>
     * @see AppType
     */
    public void setAppType(String appType) {
        this.appType = appType;
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JupyterServer, KernelGateway, TensorBoard
     *
     * @param appType <p>
     *            The type of app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AppType
     */
    public DeleteAppRequest withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JupyterServer, KernelGateway, TensorBoard
     *
     * @param appType <p>
     *            The type of app.
     *            </p>
     * @see AppType
     */
    public void setAppType(AppType appType) {
        this.appType = appType.toString();
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>JupyterServer, KernelGateway, TensorBoard
     *
     * @param appType <p>
     *            The type of app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AppType
     */
    public DeleteAppRequest withAppType(AppType appType) {
        this.appType = appType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the app.
     *         </p>
     */
    public String getAppName() {
        return appName;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param appName <p>
     *            The name of the app.
     *            </p>
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param appName <p>
     *            The name of the app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAppRequest withAppName(String appName) {
        this.appName = appName;
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
        if (getDomainId() != null)
            sb.append("DomainId: " + getDomainId() + ",");
        if (getUserProfileName() != null)
            sb.append("UserProfileName: " + getUserProfileName() + ",");
        if (getAppType() != null)
            sb.append("AppType: " + getAppType() + ",");
        if (getAppName() != null)
            sb.append("AppName: " + getAppName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode
                + ((getUserProfileName() == null) ? 0 : getUserProfileName().hashCode());
        hashCode = prime * hashCode + ((getAppType() == null) ? 0 : getAppType().hashCode());
        hashCode = prime * hashCode + ((getAppName() == null) ? 0 : getAppName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAppRequest == false)
            return false;
        DeleteAppRequest other = (DeleteAppRequest) obj;

        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getUserProfileName() == null ^ this.getUserProfileName() == null)
            return false;
        if (other.getUserProfileName() != null
                && other.getUserProfileName().equals(this.getUserProfileName()) == false)
            return false;
        if (other.getAppType() == null ^ this.getAppType() == null)
            return false;
        if (other.getAppType() != null && other.getAppType().equals(this.getAppType()) == false)
            return false;
        if (other.getAppName() == null ^ this.getAppName() == null)
            return false;
        if (other.getAppName() != null && other.getAppName().equals(this.getAppName()) == false)
            return false;
        return true;
    }
}
