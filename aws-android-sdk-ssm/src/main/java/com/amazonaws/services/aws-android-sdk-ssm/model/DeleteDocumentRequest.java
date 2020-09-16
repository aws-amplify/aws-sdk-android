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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Deletes the Systems Manager document and all instance associations to the document.</p> <p>Before you delete the document, we recommend that you use <a>DeleteAssociation</a> to disassociate all instances that are associated with the document.</p>
 */
public class DeleteDocumentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The name of the document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>The version of the document that you want to delete. If not provided, all versions of the document are deleted.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>The version name of the document that you want to delete. If not provided, all versions of the document are deleted.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     */
    private String versionName;

    /**
     * <p>Some SSM document types require that you specify a <code>Force</code> flag before you can delete the document. For example, you must specify a <code>Force</code> flag to delete a document of type <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an AWS Identity and Access Management (IAM) policy.</p>
     */
    private Boolean force;

    /**
     * <p>The name of the document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>The name of the document.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The name of the document.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the document.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>The name of the document.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeleteDocumentRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The version of the document that you want to delete. If not provided, all versions of the document are deleted.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>The version of the document that you want to delete. If not provided, all versions of the document are deleted.</p>
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * <p>The version of the document that you want to delete. If not provided, all versions of the document are deleted.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>The version of the document that you want to delete. If not provided, all versions of the document are deleted.</p>
     */
    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>The version of the document that you want to delete. If not provided, all versions of the document are deleted.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>The version of the document that you want to delete. If not provided, all versions of the document are deleted.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeleteDocumentRequest withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>The version name of the document that you want to delete. If not provided, all versions of the document are deleted.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @return <p>The version name of the document that you want to delete. If not provided, all versions of the document are deleted.</p>
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * <p>The version name of the document that you want to delete. If not provided, all versions of the document are deleted.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param versionName <p>The version name of the document that you want to delete. If not provided, all versions of the document are deleted.</p>
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>The version name of the document that you want to delete. If not provided, all versions of the document are deleted.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param versionName <p>The version name of the document that you want to delete. If not provided, all versions of the document are deleted.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeleteDocumentRequest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * <p>Some SSM document types require that you specify a <code>Force</code> flag before you can delete the document. For example, you must specify a <code>Force</code> flag to delete a document of type <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an AWS Identity and Access Management (IAM) policy.</p>
     *
     * @return <p>Some SSM document types require that you specify a <code>Force</code> flag before you can delete the document. For example, you must specify a <code>Force</code> flag to delete a document of type <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an AWS Identity and Access Management (IAM) policy.</p>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>Some SSM document types require that you specify a <code>Force</code> flag before you can delete the document. For example, you must specify a <code>Force</code> flag to delete a document of type <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an AWS Identity and Access Management (IAM) policy.</p>
     *
     * @return <p>Some SSM document types require that you specify a <code>Force</code> flag before you can delete the document. For example, you must specify a <code>Force</code> flag to delete a document of type <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an AWS Identity and Access Management (IAM) policy.</p>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>Some SSM document types require that you specify a <code>Force</code> flag before you can delete the document. For example, you must specify a <code>Force</code> flag to delete a document of type <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an AWS Identity and Access Management (IAM) policy.</p>
     *
     * @param force <p>Some SSM document types require that you specify a <code>Force</code> flag before you can delete the document. For example, you must specify a <code>Force</code> flag to delete a document of type <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an AWS Identity and Access Management (IAM) policy.</p>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>Some SSM document types require that you specify a <code>Force</code> flag before you can delete the document. For example, you must specify a <code>Force</code> flag to delete a document of type <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an AWS Identity and Access Management (IAM) policy.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param force <p>Some SSM document types require that you specify a <code>Force</code> flag before you can delete the document. For example, you must specify a <code>Force</code> flag to delete a document of type <code>ApplicationConfigurationSchema</code>. You can restrict access to the <code>Force</code> flag in an AWS Identity and Access Management (IAM) policy.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeleteDocumentRequest withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDocumentVersion() != null) sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getVersionName() != null) sb.append("VersionName: " + getVersionName() + ",");
        if (getForce() != null) sb.append("Force: " + getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteDocumentRequest == false) return false;
        DeleteDocumentRequest other = (DeleteDocumentRequest)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null) return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false) return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null) return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false) return false;
        if (other.getForce() == null ^ this.getForce() == null) return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false) return false;
        return true;
    }
}
