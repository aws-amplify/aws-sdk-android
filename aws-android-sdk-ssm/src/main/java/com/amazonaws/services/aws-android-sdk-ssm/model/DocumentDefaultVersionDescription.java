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


/**
 * <p>A default version of a document.</p>
 */
public class DocumentDefaultVersionDescription implements Serializable {
    /**
     * <p>The name of the document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>The default version of the document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     */
    private String defaultVersion;

    /**
     * <p>The default version of the artifact associated with the document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     */
    private String defaultVersionName;

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
    public DocumentDefaultVersionDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The default version of the document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @return <p>The default version of the document.</p>
     */
    public String getDefaultVersion() {
        return defaultVersion;
    }

    /**
     * <p>The default version of the document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param defaultVersion <p>The default version of the document.</p>
     */
    public void setDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    /**
     * <p>The default version of the document.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)<br/>
     *
     * @param defaultVersion <p>The default version of the document.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentDefaultVersionDescription withDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
        return this;
    }

    /**
     * <p>The default version of the artifact associated with the document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @return <p>The default version of the artifact associated with the document.</p>
     */
    public String getDefaultVersionName() {
        return defaultVersionName;
    }

    /**
     * <p>The default version of the artifact associated with the document.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param defaultVersionName <p>The default version of the artifact associated with the document.</p>
     */
    public void setDefaultVersionName(String defaultVersionName) {
        this.defaultVersionName = defaultVersionName;
    }

    /**
     * <p>The default version of the artifact associated with the document.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{1,128}$<br/>
     *
     * @param defaultVersionName <p>The default version of the artifact associated with the document.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DocumentDefaultVersionDescription withDefaultVersionName(String defaultVersionName) {
        this.defaultVersionName = defaultVersionName;
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
        if (getDefaultVersion() != null) sb.append("DefaultVersion: " + getDefaultVersion() + ",");
        if (getDefaultVersionName() != null) sb.append("DefaultVersionName: " + getDefaultVersionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersion() == null) ? 0 : getDefaultVersion().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersionName() == null) ? 0 : getDefaultVersionName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DocumentDefaultVersionDescription == false) return false;
        DocumentDefaultVersionDescription other = (DocumentDefaultVersionDescription)obj;

        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getDefaultVersion() == null ^ this.getDefaultVersion() == null) return false;
        if (other.getDefaultVersion() != null && other.getDefaultVersion().equals(this.getDefaultVersion()) == false) return false;
        if (other.getDefaultVersionName() == null ^ this.getDefaultVersionName() == null) return false;
        if (other.getDefaultVersionName() != null && other.getDefaultVersionName().equals(this.getDefaultVersionName()) == false) return false;
        return true;
    }
}
