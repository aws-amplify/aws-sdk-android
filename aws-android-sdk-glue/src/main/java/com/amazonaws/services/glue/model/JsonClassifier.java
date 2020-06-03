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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * A classifier for <code>JSON</code> content.
 * </p>
 */
public class JsonClassifier implements Serializable {
    /**
     * <p>
     * The name of the classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * The time that this classifier was registered.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The time that this classifier was last updated.
     * </p>
     */
    private java.util.Date lastUpdated;

    /**
     * <p>
     * The version of this classifier.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * A <code>JsonPath</code> string defining the JSON data for the classifier
     * to classify. AWS Glue supports a subset of <code>JsonPath</code>, as
     * described in <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json"
     * >Writing JsonPath Custom Classifiers</a>.
     * </p>
     */
    private String jsonPath;

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the classifier.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the classifier.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the classifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JsonClassifier withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The time that this classifier was registered.
     * </p>
     *
     * @return <p>
     *         The time that this classifier was registered.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The time that this classifier was registered.
     * </p>
     *
     * @param creationTime <p>
     *            The time that this classifier was registered.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that this classifier was registered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time that this classifier was registered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JsonClassifier withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The time that this classifier was last updated.
     * </p>
     *
     * @return <p>
     *         The time that this classifier was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * <p>
     * The time that this classifier was last updated.
     * </p>
     *
     * @param lastUpdated <p>
     *            The time that this classifier was last updated.
     *            </p>
     */
    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The time that this classifier was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdated <p>
     *            The time that this classifier was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JsonClassifier withLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * <p>
     * The version of this classifier.
     * </p>
     *
     * @return <p>
     *         The version of this classifier.
     *         </p>
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of this classifier.
     * </p>
     *
     * @param version <p>
     *            The version of this classifier.
     *            </p>
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of this classifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version of this classifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JsonClassifier withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * A <code>JsonPath</code> string defining the JSON data for the classifier
     * to classify. AWS Glue supports a subset of <code>JsonPath</code>, as
     * described in <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json"
     * >Writing JsonPath Custom Classifiers</a>.
     * </p>
     *
     * @return <p>
     *         A <code>JsonPath</code> string defining the JSON data for the
     *         classifier to classify. AWS Glue supports a subset of
     *         <code>JsonPath</code>, as described in <a href=
     *         "https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json"
     *         >Writing JsonPath Custom Classifiers</a>.
     *         </p>
     */
    public String getJsonPath() {
        return jsonPath;
    }

    /**
     * <p>
     * A <code>JsonPath</code> string defining the JSON data for the classifier
     * to classify. AWS Glue supports a subset of <code>JsonPath</code>, as
     * described in <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json"
     * >Writing JsonPath Custom Classifiers</a>.
     * </p>
     *
     * @param jsonPath <p>
     *            A <code>JsonPath</code> string defining the JSON data for the
     *            classifier to classify. AWS Glue supports a subset of
     *            <code>JsonPath</code>, as described in <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json"
     *            >Writing JsonPath Custom Classifiers</a>.
     *            </p>
     */
    public void setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    /**
     * <p>
     * A <code>JsonPath</code> string defining the JSON data for the classifier
     * to classify. AWS Glue supports a subset of <code>JsonPath</code>, as
     * described in <a href=
     * "https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json"
     * >Writing JsonPath Custom Classifiers</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jsonPath <p>
     *            A <code>JsonPath</code> string defining the JSON data for the
     *            classifier to classify. AWS Glue supports a subset of
     *            <code>JsonPath</code>, as described in <a href=
     *            "https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json"
     *            >Writing JsonPath Custom Classifiers</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JsonClassifier withJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
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
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: " + getLastUpdated() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getJsonPath() != null)
            sb.append("JsonPath: " + getJsonPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getJsonPath() == null) ? 0 : getJsonPath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JsonClassifier == false)
            return false;
        JsonClassifier other = (JsonClassifier) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null
                && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getJsonPath() == null ^ this.getJsonPath() == null)
            return false;
        if (other.getJsonPath() != null && other.getJsonPath().equals(this.getJsonPath()) == false)
            return false;
        return true;
    }
}
