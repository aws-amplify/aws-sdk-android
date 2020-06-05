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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

/**
 * <p>
 * Provides feature transformation information. Feature transformation is the
 * process of modifying raw input data into a form more suitable for model
 * training.
 * </p>
 */
public class FeatureTransformation implements Serializable {
    /**
     * <p>
     * The name of the feature transformation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the FeatureTransformation object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String featureTransformationArn;

    /**
     * <p>
     * Provides the default parameters for feature transformation.
     * </p>
     */
    private java.util.Map<String, String> defaultParameters;

    /**
     * <p>
     * The creation date and time (in Unix time) of the feature transformation.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The last update date and time (in Unix time) of the feature
     * transformation.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The status of the feature transformation.
     * </p>
     * <p>
     * A feature transformation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String status;

    /**
     * <p>
     * The name of the feature transformation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         The name of the feature transformation.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the feature transformation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name of the feature transformation.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the feature transformation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name of the feature transformation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FeatureTransformation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the FeatureTransformation object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the FeatureTransformation
     *         object.
     *         </p>
     */
    public String getFeatureTransformationArn() {
        return featureTransformationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the FeatureTransformation object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param featureTransformationArn <p>
     *            The Amazon Resource Name (ARN) of the FeatureTransformation
     *            object.
     *            </p>
     */
    public void setFeatureTransformationArn(String featureTransformationArn) {
        this.featureTransformationArn = featureTransformationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the FeatureTransformation object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param featureTransformationArn <p>
     *            The Amazon Resource Name (ARN) of the FeatureTransformation
     *            object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FeatureTransformation withFeatureTransformationArn(String featureTransformationArn) {
        this.featureTransformationArn = featureTransformationArn;
        return this;
    }

    /**
     * <p>
     * Provides the default parameters for feature transformation.
     * </p>
     *
     * @return <p>
     *         Provides the default parameters for feature transformation.
     *         </p>
     */
    public java.util.Map<String, String> getDefaultParameters() {
        return defaultParameters;
    }

    /**
     * <p>
     * Provides the default parameters for feature transformation.
     * </p>
     *
     * @param defaultParameters <p>
     *            Provides the default parameters for feature transformation.
     *            </p>
     */
    public void setDefaultParameters(java.util.Map<String, String> defaultParameters) {
        this.defaultParameters = defaultParameters;
    }

    /**
     * <p>
     * Provides the default parameters for feature transformation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultParameters <p>
     *            Provides the default parameters for feature transformation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FeatureTransformation withDefaultParameters(
            java.util.Map<String, String> defaultParameters) {
        this.defaultParameters = defaultParameters;
        return this;
    }

    /**
     * <p>
     * Provides the default parameters for feature transformation.
     * </p>
     * <p>
     * The method adds a new key-value pair into defaultParameters parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into defaultParameters.
     * @param value The corresponding value of the entry to be added into
     *            defaultParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FeatureTransformation adddefaultParametersEntry(String key, String value) {
        if (null == this.defaultParameters) {
            this.defaultParameters = new java.util.HashMap<String, String>();
        }
        if (this.defaultParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.defaultParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into defaultParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public FeatureTransformation cleardefaultParametersEntries() {
        this.defaultParameters = null;
        return this;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the feature transformation.
     * </p>
     *
     * @return <p>
     *         The creation date and time (in Unix time) of the feature
     *         transformation.
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the feature transformation.
     * </p>
     *
     * @param creationDateTime <p>
     *            The creation date and time (in Unix time) of the feature
     *            transformation.
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time (in Unix time) of the feature transformation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The creation date and time (in Unix time) of the feature
     *            transformation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FeatureTransformation withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * <p>
     * The last update date and time (in Unix time) of the feature
     * transformation.
     * </p>
     *
     * @return <p>
     *         The last update date and time (in Unix time) of the feature
     *         transformation.
     *         </p>
     */
    public java.util.Date getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    /**
     * <p>
     * The last update date and time (in Unix time) of the feature
     * transformation.
     * </p>
     *
     * @param lastUpdatedDateTime <p>
     *            The last update date and time (in Unix time) of the feature
     *            transformation.
     *            </p>
     */
    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The last update date and time (in Unix time) of the feature
     * transformation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedDateTime <p>
     *            The last update date and time (in Unix time) of the feature
     *            transformation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FeatureTransformation withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
        return this;
    }

    /**
     * <p>
     * The status of the feature transformation.
     * </p>
     * <p>
     * A feature transformation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The status of the feature transformation.
     *         </p>
     *         <p>
     *         A feature transformation can be in one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE
     *         FAILED
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the feature transformation.
     * </p>
     * <p>
     * A feature transformation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param status <p>
     *            The status of the feature transformation.
     *            </p>
     *            <p>
     *            A feature transformation can be in one of the following
     *            states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE
     *            FAILED
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the feature transformation.
     * </p>
     * <p>
     * A feature transformation can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param status <p>
     *            The status of the feature transformation.
     *            </p>
     *            <p>
     *            A feature transformation can be in one of the following
     *            states:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE
     *            FAILED
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FeatureTransformation withStatus(String status) {
        this.status = status;
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
            sb.append("name: " + getName() + ",");
        if (getFeatureTransformationArn() != null)
            sb.append("featureTransformationArn: " + getFeatureTransformationArn() + ",");
        if (getDefaultParameters() != null)
            sb.append("defaultParameters: " + getDefaultParameters() + ",");
        if (getCreationDateTime() != null)
            sb.append("creationDateTime: " + getCreationDateTime() + ",");
        if (getLastUpdatedDateTime() != null)
            sb.append("lastUpdatedDateTime: " + getLastUpdatedDateTime() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getFeatureTransformationArn() == null) ? 0 : getFeatureTransformationArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDefaultParameters() == null) ? 0 : getDefaultParameters().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FeatureTransformation == false)
            return false;
        FeatureTransformation other = (FeatureTransformation) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFeatureTransformationArn() == null
                ^ this.getFeatureTransformationArn() == null)
            return false;
        if (other.getFeatureTransformationArn() != null
                && other.getFeatureTransformationArn().equals(this.getFeatureTransformationArn()) == false)
            return false;
        if (other.getDefaultParameters() == null ^ this.getDefaultParameters() == null)
            return false;
        if (other.getDefaultParameters() != null
                && other.getDefaultParameters().equals(this.getDefaultParameters()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null
                && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null
                && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
