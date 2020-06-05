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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an application that has one configuration template named
 * <code>default</code> and no application versions.
 * </p>
 */
public class CreateApplicationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the application. Must be unique within your account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * Your description of the application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     */
    private String description;

    /**
     * <p>
     * Specifies an application resource lifecycle configuration to prevent your
     * application from accumulating too many versions.
     * </p>
     */
    private ApplicationResourceLifecycleConfig resourceLifecycleConfig;

    /**
     * <p>
     * Specifies the tags applied to the application.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application.
     * Environments that you create in the application don't inherit the tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the application. Must be unique within your account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application. Must be unique within your account.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the application. Must be unique within your account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application. Must be unique within your
     *            account.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application. Must be unique within your account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application. Must be unique within your
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * Your description of the application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @return <p>
     *         Your description of the application.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Your description of the application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            Your description of the application.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Your description of the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            Your description of the application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Specifies an application resource lifecycle configuration to prevent your
     * application from accumulating too many versions.
     * </p>
     *
     * @return <p>
     *         Specifies an application resource lifecycle configuration to
     *         prevent your application from accumulating too many versions.
     *         </p>
     */
    public ApplicationResourceLifecycleConfig getResourceLifecycleConfig() {
        return resourceLifecycleConfig;
    }

    /**
     * <p>
     * Specifies an application resource lifecycle configuration to prevent your
     * application from accumulating too many versions.
     * </p>
     *
     * @param resourceLifecycleConfig <p>
     *            Specifies an application resource lifecycle configuration to
     *            prevent your application from accumulating too many versions.
     *            </p>
     */
    public void setResourceLifecycleConfig(
            ApplicationResourceLifecycleConfig resourceLifecycleConfig) {
        this.resourceLifecycleConfig = resourceLifecycleConfig;
    }

    /**
     * <p>
     * Specifies an application resource lifecycle configuration to prevent your
     * application from accumulating too many versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceLifecycleConfig <p>
     *            Specifies an application resource lifecycle configuration to
     *            prevent your application from accumulating too many versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationRequest withResourceLifecycleConfig(
            ApplicationResourceLifecycleConfig resourceLifecycleConfig) {
        this.resourceLifecycleConfig = resourceLifecycleConfig;
        return this;
    }

    /**
     * <p>
     * Specifies the tags applied to the application.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application.
     * Environments that you create in the application don't inherit the tags.
     * </p>
     *
     * @return <p>
     *         Specifies the tags applied to the application.
     *         </p>
     *         <p>
     *         Elastic Beanstalk applies these tags only to the application.
     *         Environments that you create in the application don't inherit the
     *         tags.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies the tags applied to the application.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application.
     * Environments that you create in the application don't inherit the tags.
     * </p>
     *
     * @param tags <p>
     *            Specifies the tags applied to the application.
     *            </p>
     *            <p>
     *            Elastic Beanstalk applies these tags only to the application.
     *            Environments that you create in the application don't inherit
     *            the tags.
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
     * Specifies the tags applied to the application.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application.
     * Environments that you create in the application don't inherit the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Specifies the tags applied to the application.
     *            </p>
     *            <p>
     *            Elastic Beanstalk applies these tags only to the application.
     *            Environments that you create in the application don't inherit
     *            the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationRequest withTags(Tag... tags) {
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
     * Specifies the tags applied to the application.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application.
     * Environments that you create in the application don't inherit the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Specifies the tags applied to the application.
     *            </p>
     *            <p>
     *            Elastic Beanstalk applies these tags only to the application.
     *            Environments that you create in the application don't inherit
     *            the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getResourceLifecycleConfig() != null)
            sb.append("ResourceLifecycleConfig: " + getResourceLifecycleConfig() + ",");
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
                + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceLifecycleConfig() == null) ? 0 : getResourceLifecycleConfig()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getResourceLifecycleConfig() == null ^ this.getResourceLifecycleConfig() == null)
            return false;
        if (other.getResourceLifecycleConfig() != null
                && other.getResourceLifecycleConfig().equals(this.getResourceLifecycleConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
