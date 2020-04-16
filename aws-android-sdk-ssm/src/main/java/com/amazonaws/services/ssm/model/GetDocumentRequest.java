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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the contents of the specified Systems Manager document.
 * </p>
 */
public class GetDocumentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>
     * An optional field specifying the version of the artifact associated with
     * the document. For example, "Release 12, Update 6". This value is unique
     * across all versions of a document, and cannot be changed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     */
    private String versionName;

    /**
     * <p>
     * The document version for which you want information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String documentVersion;

    /**
     * <p>
     * Returns the document in the specified format. The document format can be
     * either JSON or YAML. JSON is the default format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     */
    private String documentFormat;

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the Systems Manager document.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the Systems Manager document.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.:/]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the Systems Manager document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * An optional field specifying the version of the artifact associated with
     * the document. For example, "Release 12, Update 6". This value is unique
     * across all versions of a document, and cannot be changed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @return <p>
     *         An optional field specifying the version of the artifact
     *         associated with the document. For example,
     *         "Release 12, Update 6". This value is unique across all versions
     *         of a document, and cannot be changed.
     *         </p>
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * <p>
     * An optional field specifying the version of the artifact associated with
     * the document. For example, "Release 12, Update 6". This value is unique
     * across all versions of a document, and cannot be changed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param versionName <p>
     *            An optional field specifying the version of the artifact
     *            associated with the document. For example,
     *            "Release 12, Update 6". This value is unique across all
     *            versions of a document, and cannot be changed.
     *            </p>
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * An optional field specifying the version of the artifact associated with
     * the document. For example, "Release 12, Update 6". This value is unique
     * across all versions of a document, and cannot be changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param versionName <p>
     *            An optional field specifying the version of the artifact
     *            associated with the document. For example,
     *            "Release 12, Update 6". This value is unique across all
     *            versions of a document, and cannot be changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentRequest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * <p>
     * The document version for which you want information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>
     *         The document version for which you want information.
     *         </p>
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    /**
     * <p>
     * The document version for which you want information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The document version for which you want information.
     *            </p>
     */
    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The document version for which you want information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param documentVersion <p>
     *            The document version for which you want information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentRequest withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * <p>
     * Returns the document in the specified format. The document format can be
     * either JSON or YAML. JSON is the default format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @return <p>
     *         Returns the document in the specified format. The document format
     *         can be either JSON or YAML. JSON is the default format.
     *         </p>
     * @see DocumentFormat
     */
    public String getDocumentFormat() {
        return documentFormat;
    }

    /**
     * <p>
     * Returns the document in the specified format. The document format can be
     * either JSON or YAML. JSON is the default format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>
     *            Returns the document in the specified format. The document
     *            format can be either JSON or YAML. JSON is the default format.
     *            </p>
     * @see DocumentFormat
     */
    public void setDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
    }

    /**
     * <p>
     * Returns the document in the specified format. The document format can be
     * either JSON or YAML. JSON is the default format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>
     *            Returns the document in the specified format. The document
     *            format can be either JSON or YAML. JSON is the default format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentFormat
     */
    public GetDocumentRequest withDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
        return this;
    }

    /**
     * <p>
     * Returns the document in the specified format. The document format can be
     * either JSON or YAML. JSON is the default format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>
     *            Returns the document in the specified format. The document
     *            format can be either JSON or YAML. JSON is the default format.
     *            </p>
     * @see DocumentFormat
     */
    public void setDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat.toString();
    }

    /**
     * <p>
     * Returns the document in the specified format. The document format can be
     * either JSON or YAML. JSON is the default format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>YAML, JSON, TEXT
     *
     * @param documentFormat <p>
     *            Returns the document in the specified format. The document
     *            format can be either JSON or YAML. JSON is the default format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DocumentFormat
     */
    public GetDocumentRequest withDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat.toString();
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getVersionName() != null)
            sb.append("VersionName: " + getVersionName() + ",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: " + getDocumentVersion() + ",");
        if (getDocumentFormat() != null)
            sb.append("DocumentFormat: " + getDocumentFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentFormat() == null) ? 0 : getDocumentFormat().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDocumentRequest == false)
            return false;
        GetDocumentRequest other = (GetDocumentRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null
                && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null
                && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getDocumentFormat() == null ^ this.getDocumentFormat() == null)
            return false;
        if (other.getDocumentFormat() != null
                && other.getDocumentFormat().equals(this.getDocumentFormat()) == false)
            return false;
        return true;
    }
}
