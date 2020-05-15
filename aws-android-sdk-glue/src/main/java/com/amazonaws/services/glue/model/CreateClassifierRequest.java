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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a classifier in the user's account. This can be a
 * <code>GrokClassifier</code>, an <code>XMLClassifier</code>, a
 * <code>JsonClassifier</code>, or a <code>CsvClassifier</code>, depending on
 * which field of the request is present.
 * </p>
 */
public class CreateClassifierRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A <code>GrokClassifier</code> object specifying the classifier to create.
     * </p>
     */
    private CreateGrokClassifierRequest grokClassifier;

    /**
     * <p>
     * An <code>XMLClassifier</code> object specifying the classifier to create.
     * </p>
     */
    private CreateXMLClassifierRequest xMLClassifier;

    /**
     * <p>
     * A <code>JsonClassifier</code> object specifying the classifier to create.
     * </p>
     */
    private CreateJsonClassifierRequest jsonClassifier;

    /**
     * <p>
     * A <code>CsvClassifier</code> object specifying the classifier to create.
     * </p>
     */
    private CreateCsvClassifierRequest csvClassifier;

    /**
     * <p>
     * A <code>GrokClassifier</code> object specifying the classifier to create.
     * </p>
     *
     * @return <p>
     *         A <code>GrokClassifier</code> object specifying the classifier to
     *         create.
     *         </p>
     */
    public CreateGrokClassifierRequest getGrokClassifier() {
        return grokClassifier;
    }

    /**
     * <p>
     * A <code>GrokClassifier</code> object specifying the classifier to create.
     * </p>
     *
     * @param grokClassifier <p>
     *            A <code>GrokClassifier</code> object specifying the classifier
     *            to create.
     *            </p>
     */
    public void setGrokClassifier(CreateGrokClassifierRequest grokClassifier) {
        this.grokClassifier = grokClassifier;
    }

    /**
     * <p>
     * A <code>GrokClassifier</code> object specifying the classifier to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grokClassifier <p>
     *            A <code>GrokClassifier</code> object specifying the classifier
     *            to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClassifierRequest withGrokClassifier(CreateGrokClassifierRequest grokClassifier) {
        this.grokClassifier = grokClassifier;
        return this;
    }

    /**
     * <p>
     * An <code>XMLClassifier</code> object specifying the classifier to create.
     * </p>
     *
     * @return <p>
     *         An <code>XMLClassifier</code> object specifying the classifier to
     *         create.
     *         </p>
     */
    public CreateXMLClassifierRequest getXMLClassifier() {
        return xMLClassifier;
    }

    /**
     * <p>
     * An <code>XMLClassifier</code> object specifying the classifier to create.
     * </p>
     *
     * @param xMLClassifier <p>
     *            An <code>XMLClassifier</code> object specifying the classifier
     *            to create.
     *            </p>
     */
    public void setXMLClassifier(CreateXMLClassifierRequest xMLClassifier) {
        this.xMLClassifier = xMLClassifier;
    }

    /**
     * <p>
     * An <code>XMLClassifier</code> object specifying the classifier to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param xMLClassifier <p>
     *            An <code>XMLClassifier</code> object specifying the classifier
     *            to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClassifierRequest withXMLClassifier(CreateXMLClassifierRequest xMLClassifier) {
        this.xMLClassifier = xMLClassifier;
        return this;
    }

    /**
     * <p>
     * A <code>JsonClassifier</code> object specifying the classifier to create.
     * </p>
     *
     * @return <p>
     *         A <code>JsonClassifier</code> object specifying the classifier to
     *         create.
     *         </p>
     */
    public CreateJsonClassifierRequest getJsonClassifier() {
        return jsonClassifier;
    }

    /**
     * <p>
     * A <code>JsonClassifier</code> object specifying the classifier to create.
     * </p>
     *
     * @param jsonClassifier <p>
     *            A <code>JsonClassifier</code> object specifying the classifier
     *            to create.
     *            </p>
     */
    public void setJsonClassifier(CreateJsonClassifierRequest jsonClassifier) {
        this.jsonClassifier = jsonClassifier;
    }

    /**
     * <p>
     * A <code>JsonClassifier</code> object specifying the classifier to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jsonClassifier <p>
     *            A <code>JsonClassifier</code> object specifying the classifier
     *            to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClassifierRequest withJsonClassifier(CreateJsonClassifierRequest jsonClassifier) {
        this.jsonClassifier = jsonClassifier;
        return this;
    }

    /**
     * <p>
     * A <code>CsvClassifier</code> object specifying the classifier to create.
     * </p>
     *
     * @return <p>
     *         A <code>CsvClassifier</code> object specifying the classifier to
     *         create.
     *         </p>
     */
    public CreateCsvClassifierRequest getCsvClassifier() {
        return csvClassifier;
    }

    /**
     * <p>
     * A <code>CsvClassifier</code> object specifying the classifier to create.
     * </p>
     *
     * @param csvClassifier <p>
     *            A <code>CsvClassifier</code> object specifying the classifier
     *            to create.
     *            </p>
     */
    public void setCsvClassifier(CreateCsvClassifierRequest csvClassifier) {
        this.csvClassifier = csvClassifier;
    }

    /**
     * <p>
     * A <code>CsvClassifier</code> object specifying the classifier to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param csvClassifier <p>
     *            A <code>CsvClassifier</code> object specifying the classifier
     *            to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClassifierRequest withCsvClassifier(CreateCsvClassifierRequest csvClassifier) {
        this.csvClassifier = csvClassifier;
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
        if (getGrokClassifier() != null)
            sb.append("GrokClassifier: " + getGrokClassifier() + ",");
        if (getXMLClassifier() != null)
            sb.append("XMLClassifier: " + getXMLClassifier() + ",");
        if (getJsonClassifier() != null)
            sb.append("JsonClassifier: " + getJsonClassifier() + ",");
        if (getCsvClassifier() != null)
            sb.append("CsvClassifier: " + getCsvClassifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGrokClassifier() == null) ? 0 : getGrokClassifier().hashCode());
        hashCode = prime * hashCode
                + ((getXMLClassifier() == null) ? 0 : getXMLClassifier().hashCode());
        hashCode = prime * hashCode
                + ((getJsonClassifier() == null) ? 0 : getJsonClassifier().hashCode());
        hashCode = prime * hashCode
                + ((getCsvClassifier() == null) ? 0 : getCsvClassifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClassifierRequest == false)
            return false;
        CreateClassifierRequest other = (CreateClassifierRequest) obj;

        if (other.getGrokClassifier() == null ^ this.getGrokClassifier() == null)
            return false;
        if (other.getGrokClassifier() != null
                && other.getGrokClassifier().equals(this.getGrokClassifier()) == false)
            return false;
        if (other.getXMLClassifier() == null ^ this.getXMLClassifier() == null)
            return false;
        if (other.getXMLClassifier() != null
                && other.getXMLClassifier().equals(this.getXMLClassifier()) == false)
            return false;
        if (other.getJsonClassifier() == null ^ this.getJsonClassifier() == null)
            return false;
        if (other.getJsonClassifier() != null
                && other.getJsonClassifier().equals(this.getJsonClassifier()) == false)
            return false;
        if (other.getCsvClassifier() == null ^ this.getCsvClassifier() == null)
            return false;
        if (other.getCsvClassifier() != null
                && other.getCsvClassifier().equals(this.getCsvClassifier()) == false)
            return false;
        return true;
    }
}
