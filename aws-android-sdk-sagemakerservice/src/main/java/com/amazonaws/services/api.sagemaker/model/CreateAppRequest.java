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
 * Creates a running App for the specified UserProfile. Supported Apps are
 * <code>JupyterServer</code>, <code>KernelGateway</code>, and
 * <code>TensorBoard</code>. This operation is automatically invoked by Amazon
 * SageMaker Studio upon access to the associated Studio Domain, and when new
 * kernel configurations are selected by the user. A user may have multiple Apps
 * active simultaneously. Apps will automatically terminate and be deleted when
 * stopped from within Studio, or when the DeleteApp API is manually called.
 * UserProfiles are limited to 5 concurrently running Apps at a time.
 * </p>
 */
public class CreateAppRequest extends AmazonWebServiceRequest implements Serializable {
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
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The instance type and the Amazon Resource Name (ARN) of the SageMaker
     * image created on the instance.
     * </p>
     */
    private ResourceSpec resourceSpec;

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
    public CreateAppRequest withDomainId(String domainId) {
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
    public CreateAppRequest withUserProfileName(String userProfileName) {
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
    public CreateAppRequest withAppType(String appType) {
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
    public CreateAppRequest withAppType(AppType appType) {
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
    public CreateAppRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource.
     * </p>
     *
     * @return <p>
     *         Each tag consists of a key and an optional value. Tag keys must
     *         be unique per resource.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource.
     * </p>
     *
     * @param tags <p>
     *            Each tag consists of a key and an optional value. Tag keys
     *            must be unique per resource.
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
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Each tag consists of a key and an optional value. Tag keys
     *            must be unique per resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAppRequest withTags(Tag... tags) {
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
     * Each tag consists of a key and an optional value. Tag keys must be unique
     * per resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Each tag consists of a key and an optional value. Tag keys
     *            must be unique per resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAppRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The instance type and the Amazon Resource Name (ARN) of the SageMaker
     * image created on the instance.
     * </p>
     *
     * @return <p>
     *         The instance type and the Amazon Resource Name (ARN) of the
     *         SageMaker image created on the instance.
     *         </p>
     */
    public ResourceSpec getResourceSpec() {
        return resourceSpec;
    }

    /**
     * <p>
     * The instance type and the Amazon Resource Name (ARN) of the SageMaker
     * image created on the instance.
     * </p>
     *
     * @param resourceSpec <p>
     *            The instance type and the Amazon Resource Name (ARN) of the
     *            SageMaker image created on the instance.
     *            </p>
     */
    public void setResourceSpec(ResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
    }

    /**
     * <p>
     * The instance type and the Amazon Resource Name (ARN) of the SageMaker
     * image created on the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceSpec <p>
     *            The instance type and the Amazon Resource Name (ARN) of the
     *            SageMaker image created on the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAppRequest withResourceSpec(ResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
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
            sb.append("AppName: " + getAppName() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getResourceSpec() != null)
            sb.append("ResourceSpec: " + getResourceSpec());
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getResourceSpec() == null) ? 0 : getResourceSpec().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAppRequest == false)
            return false;
        CreateAppRequest other = (CreateAppRequest) obj;

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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getResourceSpec() == null ^ this.getResourceSpec() == null)
            return false;
        if (other.getResourceSpec() != null
                && other.getResourceSpec().equals(this.getResourceSpec()) == false)
            return false;
        return true;
    }
}
