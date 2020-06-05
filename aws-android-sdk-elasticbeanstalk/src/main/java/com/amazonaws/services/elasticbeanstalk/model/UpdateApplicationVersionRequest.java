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
 * Updates the specified application version to have the specified properties.
 * </p>
 * <note>
 * <p>
 * If a property (for example, <code>description</code>) is not provided, the
 * value remains unchanged. To clear properties, specify an empty string.
 * </p>
 * </note>
 */
public class UpdateApplicationVersionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the application associated with this version.
     * </p>
     * <p>
     * If no application is found with this name, <code>UpdateApplication</code>
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The name of the version to update.
     * </p>
     * <p>
     * If no application version is found with this label,
     * <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * <p>
     * A new description for this version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     */
    private String description;

    /**
     * <p>
     * The name of the application associated with this version.
     * </p>
     * <p>
     * If no application is found with this name, <code>UpdateApplication</code>
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application associated with this version.
     *         </p>
     *         <p>
     *         If no application is found with this name,
     *         <code>UpdateApplication</code> returns an
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the application associated with this version.
     * </p>
     * <p>
     * If no application is found with this name, <code>UpdateApplication</code>
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application associated with this version.
     *            </p>
     *            <p>
     *            If no application is found with this name,
     *            <code>UpdateApplication</code> returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application associated with this version.
     * </p>
     * <p>
     * If no application is found with this name, <code>UpdateApplication</code>
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application associated with this version.
     *            </p>
     *            <p>
     *            If no application is found with this name,
     *            <code>UpdateApplication</code> returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApplicationVersionRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The name of the version to update.
     * </p>
     * <p>
     * If no application version is found with this label,
     * <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the version to update.
     *         </p>
     *         <p>
     *         If no application version is found with this label,
     *         <code>UpdateApplication</code> returns an
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     */
    public String getVersionLabel() {
        return versionLabel;
    }

    /**
     * <p>
     * The name of the version to update.
     * </p>
     * <p>
     * If no application version is found with this label,
     * <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            The name of the version to update.
     *            </p>
     *            <p>
     *            If no application version is found with this label,
     *            <code>UpdateApplication</code> returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * The name of the version to update.
     * </p>
     * <p>
     * If no application version is found with this label,
     * <code>UpdateApplication</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel <p>
     *            The name of the version to update.
     *            </p>
     *            <p>
     *            If no application version is found with this label,
     *            <code>UpdateApplication</code> returns an
     *            <code>InvalidParameterValue</code> error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApplicationVersionRequest withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }

    /**
     * <p>
     * A new description for this version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @return <p>
     *         A new description for this version.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A new description for this version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            A new description for this version.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description for this version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            A new description for this version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApplicationVersionRequest withDescription(String description) {
        this.description = description;
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
        if (getVersionLabel() != null)
            sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
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
                + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationVersionRequest == false)
            return false;
        UpdateApplicationVersionRequest other = (UpdateApplicationVersionRequest) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null
                && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
