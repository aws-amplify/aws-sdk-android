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
 * Specifies a JSON classifier for <code>CreateClassifier</code> to create.
 * </p>
 */
public class CreateJsonClassifierRequest implements Serializable {
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
    public CreateJsonClassifierRequest withName(String name) {
        this.name = name;
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
    public CreateJsonClassifierRequest withJsonPath(String jsonPath) {
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
        hashCode = prime * hashCode + ((getJsonPath() == null) ? 0 : getJsonPath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJsonClassifierRequest == false)
            return false;
        CreateJsonClassifierRequest other = (CreateJsonClassifierRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getJsonPath() == null ^ this.getJsonPath() == null)
            return false;
        if (other.getJsonPath() != null && other.getJsonPath().equals(this.getJsonPath()) == false)
            return false;
        return true;
    }
}
