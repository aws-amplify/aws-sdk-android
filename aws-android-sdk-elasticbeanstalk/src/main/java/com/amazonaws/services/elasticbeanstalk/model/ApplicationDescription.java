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

/**
 * <p>
 * Describes the properties of an application.
 * </p>
 */
public class ApplicationDescription implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     */
    private String applicationArn;

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * User-defined description of the application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     */
    private String description;

    /**
     * <p>
     * The date when the application was created.
     * </p>
     */
    private java.util.Date dateCreated;

    /**
     * <p>
     * The date when the application was last modified.
     * </p>
     */
    private java.util.Date dateUpdated;

    /**
     * <p>
     * The names of the versions for this application.
     * </p>
     */
    private java.util.List<String> versions;

    /**
     * <p>
     * The names of the configuration templates associated with this
     * application.
     * </p>
     */
    private java.util.List<String> configurationTemplates;

    /**
     * <p>
     * The lifecycle settings for the application.
     * </p>
     */
    private ApplicationResourceLifecycleConfig resourceLifecycleConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the application.
     *         </p>
     */
    public String getApplicationArn() {
        return applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     *
     * @param applicationArn <p>
     *            The Amazon Resource Name (ARN) of the application.
     *            </p>
     */
    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationArn <p>
     *            The Amazon Resource Name (ARN) of the application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationDescription withApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
        return this;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationDescription withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * User-defined description of the application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @return <p>
     *         User-defined description of the application.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * User-defined description of the application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            User-defined description of the application.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * User-defined description of the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 200<br/>
     *
     * @param description <p>
     *            User-defined description of the application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationDescription withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The date when the application was created.
     * </p>
     *
     * @return <p>
     *         The date when the application was created.
     *         </p>
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /**
     * <p>
     * The date when the application was created.
     * </p>
     *
     * @param dateCreated <p>
     *            The date when the application was created.
     *            </p>
     */
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date when the application was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateCreated <p>
     *            The date when the application was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationDescription withDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * <p>
     * The date when the application was last modified.
     * </p>
     *
     * @return <p>
     *         The date when the application was last modified.
     *         </p>
     */
    public java.util.Date getDateUpdated() {
        return dateUpdated;
    }

    /**
     * <p>
     * The date when the application was last modified.
     * </p>
     *
     * @param dateUpdated <p>
     *            The date when the application was last modified.
     *            </p>
     */
    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The date when the application was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateUpdated <p>
     *            The date when the application was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationDescription withDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * <p>
     * The names of the versions for this application.
     * </p>
     *
     * @return <p>
     *         The names of the versions for this application.
     *         </p>
     */
    public java.util.List<String> getVersions() {
        return versions;
    }

    /**
     * <p>
     * The names of the versions for this application.
     * </p>
     *
     * @param versions <p>
     *            The names of the versions for this application.
     *            </p>
     */
    public void setVersions(java.util.Collection<String> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<String>(versions);
    }

    /**
     * <p>
     * The names of the versions for this application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versions <p>
     *            The names of the versions for this application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationDescription withVersions(String... versions) {
        if (getVersions() == null) {
            this.versions = new java.util.ArrayList<String>(versions.length);
        }
        for (String value : versions) {
            this.versions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the versions for this application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versions <p>
     *            The names of the versions for this application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationDescription withVersions(java.util.Collection<String> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * <p>
     * The names of the configuration templates associated with this
     * application.
     * </p>
     *
     * @return <p>
     *         The names of the configuration templates associated with this
     *         application.
     *         </p>
     */
    public java.util.List<String> getConfigurationTemplates() {
        return configurationTemplates;
    }

    /**
     * <p>
     * The names of the configuration templates associated with this
     * application.
     * </p>
     *
     * @param configurationTemplates <p>
     *            The names of the configuration templates associated with this
     *            application.
     *            </p>
     */
    public void setConfigurationTemplates(java.util.Collection<String> configurationTemplates) {
        if (configurationTemplates == null) {
            this.configurationTemplates = null;
            return;
        }

        this.configurationTemplates = new java.util.ArrayList<String>(configurationTemplates);
    }

    /**
     * <p>
     * The names of the configuration templates associated with this
     * application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationTemplates <p>
     *            The names of the configuration templates associated with this
     *            application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationDescription withConfigurationTemplates(String... configurationTemplates) {
        if (getConfigurationTemplates() == null) {
            this.configurationTemplates = new java.util.ArrayList<String>(
                    configurationTemplates.length);
        }
        for (String value : configurationTemplates) {
            this.configurationTemplates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the configuration templates associated with this
     * application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationTemplates <p>
     *            The names of the configuration templates associated with this
     *            application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationDescription withConfigurationTemplates(
            java.util.Collection<String> configurationTemplates) {
        setConfigurationTemplates(configurationTemplates);
        return this;
    }

    /**
     * <p>
     * The lifecycle settings for the application.
     * </p>
     *
     * @return <p>
     *         The lifecycle settings for the application.
     *         </p>
     */
    public ApplicationResourceLifecycleConfig getResourceLifecycleConfig() {
        return resourceLifecycleConfig;
    }

    /**
     * <p>
     * The lifecycle settings for the application.
     * </p>
     *
     * @param resourceLifecycleConfig <p>
     *            The lifecycle settings for the application.
     *            </p>
     */
    public void setResourceLifecycleConfig(
            ApplicationResourceLifecycleConfig resourceLifecycleConfig) {
        this.resourceLifecycleConfig = resourceLifecycleConfig;
    }

    /**
     * <p>
     * The lifecycle settings for the application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceLifecycleConfig <p>
     *            The lifecycle settings for the application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationDescription withResourceLifecycleConfig(
            ApplicationResourceLifecycleConfig resourceLifecycleConfig) {
        this.resourceLifecycleConfig = resourceLifecycleConfig;
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
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: " + getApplicationArn() + ",");
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDateCreated() != null)
            sb.append("DateCreated: " + getDateCreated() + ",");
        if (getDateUpdated() != null)
            sb.append("DateUpdated: " + getDateUpdated() + ",");
        if (getVersions() != null)
            sb.append("Versions: " + getVersions() + ",");
        if (getConfigurationTemplates() != null)
            sb.append("ConfigurationTemplates: " + getConfigurationTemplates() + ",");
        if (getResourceLifecycleConfig() != null)
            sb.append("ResourceLifecycleConfig: " + getResourceLifecycleConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode
                + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime
                * hashCode
                + ((getConfigurationTemplates() == null) ? 0 : getConfigurationTemplates()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceLifecycleConfig() == null) ? 0 : getResourceLifecycleConfig()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationDescription == false)
            return false;
        ApplicationDescription other = (ApplicationDescription) obj;

        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null
                && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
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
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null
                && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null)
            return false;
        if (other.getDateUpdated() != null
                && other.getDateUpdated().equals(this.getDateUpdated()) == false)
            return false;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        if (other.getConfigurationTemplates() == null ^ this.getConfigurationTemplates() == null)
            return false;
        if (other.getConfigurationTemplates() != null
                && other.getConfigurationTemplates().equals(this.getConfigurationTemplates()) == false)
            return false;
        if (other.getResourceLifecycleConfig() == null ^ this.getResourceLifecycleConfig() == null)
            return false;
        if (other.getResourceLifecycleConfig() != null
                && other.getResourceLifecycleConfig().equals(this.getResourceLifecycleConfig()) == false)
            return false;
        return true;
    }
}
