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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an application.
 * </p>
 */
public class CreateApplicationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the application. This name must be unique with the applicable
     * IAM user or AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     */
    private String computePlatform;

    /**
     * <p>
     * The metadata that you apply to CodeDeploy applications to help you
     * organize and categorize them. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the application. This name must be unique with the applicable
     * IAM user or AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application. This name must be unique with the
     *         applicable IAM user or AWS account.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the application. This name must be unique with the applicable
     * IAM user or AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application. This name must be unique with the
     *            applicable IAM user or AWS account.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application. This name must be unique with the applicable
     * IAM user or AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application. This name must be unique with the
     *            applicable IAM user or AWS account.
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
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @return <p>
     *         The destination platform type for the deployment (
     *         <code>Lambda</code>, <code>Server</code>, or <code>ECS</code>).
     *         </p>
     * @see ComputePlatform
     */
    public String getComputePlatform() {
        return computePlatform;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @param computePlatform <p>
     *            The destination platform type for the deployment (
     *            <code>Lambda</code>, <code>Server</code>, or <code>ECS</code>
     *            ).
     *            </p>
     * @see ComputePlatform
     */
    public void setComputePlatform(String computePlatform) {
        this.computePlatform = computePlatform;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @param computePlatform <p>
     *            The destination platform type for the deployment (
     *            <code>Lambda</code>, <code>Server</code>, or <code>ECS</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComputePlatform
     */
    public CreateApplicationRequest withComputePlatform(String computePlatform) {
        this.computePlatform = computePlatform;
        return this;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @param computePlatform <p>
     *            The destination platform type for the deployment (
     *            <code>Lambda</code>, <code>Server</code>, or <code>ECS</code>
     *            ).
     *            </p>
     * @see ComputePlatform
     */
    public void setComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform.toString();
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @param computePlatform <p>
     *            The destination platform type for the deployment (
     *            <code>Lambda</code>, <code>Server</code>, or <code>ECS</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComputePlatform
     */
    public CreateApplicationRequest withComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform.toString();
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to CodeDeploy applications to help you
     * organize and categorize them. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     *
     * @return <p>
     *         The metadata that you apply to CodeDeploy applications to help
     *         you organize and categorize them. Each tag consists of a key and
     *         an optional value, both of which you define.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata that you apply to CodeDeploy applications to help you
     * organize and categorize them. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     *
     * @param tags <p>
     *            The metadata that you apply to CodeDeploy applications to help
     *            you organize and categorize them. Each tag consists of a key
     *            and an optional value, both of which you define.
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
     * The metadata that you apply to CodeDeploy applications to help you
     * organize and categorize them. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The metadata that you apply to CodeDeploy applications to help
     *            you organize and categorize them. Each tag consists of a key
     *            and an optional value, both of which you define.
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
     * The metadata that you apply to CodeDeploy applications to help you
     * organize and categorize them. Each tag consists of a key and an optional
     * value, both of which you define.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The metadata that you apply to CodeDeploy applications to help
     *            you organize and categorize them. Each tag consists of a key
     *            and an optional value, both of which you define.
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
            sb.append("applicationName: " + getApplicationName() + ",");
        if (getComputePlatform() != null)
            sb.append("computePlatform: " + getComputePlatform() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
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
                + ((getComputePlatform() == null) ? 0 : getComputePlatform().hashCode());
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
        if (other.getComputePlatform() == null ^ this.getComputePlatform() == null)
            return false;
        if (other.getComputePlatform() != null
                && other.getComputePlatform().equals(this.getComputePlatform()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
