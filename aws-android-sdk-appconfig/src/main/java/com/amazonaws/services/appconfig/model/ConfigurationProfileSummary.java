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

package com.amazonaws.services.appconfig.model;

import java.io.Serializable;

/**
 * <p>
 * A summary of a configuration profile.
 * </p>
 */
public class ConfigurationProfileSummary implements Serializable {
    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     */
    private String applicationId;

    /**
     * <p>
     * The ID of the configuration profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     */
    private String id;

    /**
     * <p>
     * The name of the configuration profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String name;

    /**
     * <p>
     * The URI location of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String locationUri;

    /**
     * <p>
     * The types of validators in the configuration profile.
     * </p>
     */
    private java.util.List<String> validatorTypes;

    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @return <p>
     *         The application ID.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param applicationId <p>
     *            The application ID.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param applicationId <p>
     *            The application ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigurationProfileSummary withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The ID of the configuration profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @return <p>
     *         The ID of the configuration profile.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the configuration profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param id <p>
     *            The ID of the configuration profile.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the configuration profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param id <p>
     *            The ID of the configuration profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigurationProfileSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the configuration profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The name of the configuration profile.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the configuration profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            The name of the configuration profile.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configuration profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param name <p>
     *            The name of the configuration profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigurationProfileSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The URI location of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The URI location of the configuration.
     *         </p>
     */
    public String getLocationUri() {
        return locationUri;
    }

    /**
     * <p>
     * The URI location of the configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param locationUri <p>
     *            The URI location of the configuration.
     *            </p>
     */
    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * The URI location of the configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param locationUri <p>
     *            The URI location of the configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigurationProfileSummary withLocationUri(String locationUri) {
        this.locationUri = locationUri;
        return this;
    }

    /**
     * <p>
     * The types of validators in the configuration profile.
     * </p>
     *
     * @return <p>
     *         The types of validators in the configuration profile.
     *         </p>
     */
    public java.util.List<String> getValidatorTypes() {
        return validatorTypes;
    }

    /**
     * <p>
     * The types of validators in the configuration profile.
     * </p>
     *
     * @param validatorTypes <p>
     *            The types of validators in the configuration profile.
     *            </p>
     */
    public void setValidatorTypes(java.util.Collection<String> validatorTypes) {
        if (validatorTypes == null) {
            this.validatorTypes = null;
            return;
        }

        this.validatorTypes = new java.util.ArrayList<String>(validatorTypes);
    }

    /**
     * <p>
     * The types of validators in the configuration profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validatorTypes <p>
     *            The types of validators in the configuration profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigurationProfileSummary withValidatorTypes(String... validatorTypes) {
        if (getValidatorTypes() == null) {
            this.validatorTypes = new java.util.ArrayList<String>(validatorTypes.length);
        }
        for (String value : validatorTypes) {
            this.validatorTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The types of validators in the configuration profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validatorTypes <p>
     *            The types of validators in the configuration profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigurationProfileSummary withValidatorTypes(
            java.util.Collection<String> validatorTypes) {
        setValidatorTypes(validatorTypes);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getLocationUri() != null)
            sb.append("LocationUri: " + getLocationUri() + ",");
        if (getValidatorTypes() != null)
            sb.append("ValidatorTypes: " + getValidatorTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode
                + ((getValidatorTypes() == null) ? 0 : getValidatorTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationProfileSummary == false)
            return false;
        ConfigurationProfileSummary other = (ConfigurationProfileSummary) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null
                && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        if (other.getValidatorTypes() == null ^ this.getValidatorTypes() == null)
            return false;
        if (other.getValidatorTypes() != null
                && other.getValidatorTypes().equals(this.getValidatorTypes()) == false)
            return false;
        return true;
    }
}
