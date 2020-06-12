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
 * Classifiers are triggered during a crawl task. A classifier checks whether a
 * given file is in a format it can handle. If it is, the classifier creates a
 * schema in the form of a <code>StructType</code> object that matches that data
 * format.
 * </p>
 * <p>
 * You can use the standard classifiers that AWS Glue provides, or you can write
 * your own classifiers to best categorize your data sources and specify the
 * appropriate schemas to use for them. A classifier can be a <code>grok</code>
 * classifier, an <code>XML</code> classifier, a <code>JSON</code> classifier,
 * or a custom <code>CSV</code> classifier, as specified in one of the fields in
 * the <code>Classifier</code> object.
 * </p>
 */
public class Classifier implements Serializable {
    /**
     * <p>
     * A classifier that uses <code>grok</code>.
     * </p>
     */
    private GrokClassifier grokClassifier;

    /**
     * <p>
     * A classifier for XML content.
     * </p>
     */
    private XMLClassifier xMLClassifier;

    /**
     * <p>
     * A classifier for JSON content.
     * </p>
     */
    private JsonClassifier jsonClassifier;

    /**
     * <p>
     * A classifier for comma-separated values (CSV).
     * </p>
     */
    private CsvClassifier csvClassifier;

    /**
     * <p>
     * A classifier that uses <code>grok</code>.
     * </p>
     *
     * @return <p>
     *         A classifier that uses <code>grok</code>.
     *         </p>
     */
    public GrokClassifier getGrokClassifier() {
        return grokClassifier;
    }

    /**
     * <p>
     * A classifier that uses <code>grok</code>.
     * </p>
     *
     * @param grokClassifier <p>
     *            A classifier that uses <code>grok</code>.
     *            </p>
     */
    public void setGrokClassifier(GrokClassifier grokClassifier) {
        this.grokClassifier = grokClassifier;
    }

    /**
     * <p>
     * A classifier that uses <code>grok</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grokClassifier <p>
     *            A classifier that uses <code>grok</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Classifier withGrokClassifier(GrokClassifier grokClassifier) {
        this.grokClassifier = grokClassifier;
        return this;
    }

    /**
     * <p>
     * A classifier for XML content.
     * </p>
     *
     * @return <p>
     *         A classifier for XML content.
     *         </p>
     */
    public XMLClassifier getXMLClassifier() {
        return xMLClassifier;
    }

    /**
     * <p>
     * A classifier for XML content.
     * </p>
     *
     * @param xMLClassifier <p>
     *            A classifier for XML content.
     *            </p>
     */
    public void setXMLClassifier(XMLClassifier xMLClassifier) {
        this.xMLClassifier = xMLClassifier;
    }

    /**
     * <p>
     * A classifier for XML content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param xMLClassifier <p>
     *            A classifier for XML content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Classifier withXMLClassifier(XMLClassifier xMLClassifier) {
        this.xMLClassifier = xMLClassifier;
        return this;
    }

    /**
     * <p>
     * A classifier for JSON content.
     * </p>
     *
     * @return <p>
     *         A classifier for JSON content.
     *         </p>
     */
    public JsonClassifier getJsonClassifier() {
        return jsonClassifier;
    }

    /**
     * <p>
     * A classifier for JSON content.
     * </p>
     *
     * @param jsonClassifier <p>
     *            A classifier for JSON content.
     *            </p>
     */
    public void setJsonClassifier(JsonClassifier jsonClassifier) {
        this.jsonClassifier = jsonClassifier;
    }

    /**
     * <p>
     * A classifier for JSON content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jsonClassifier <p>
     *            A classifier for JSON content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Classifier withJsonClassifier(JsonClassifier jsonClassifier) {
        this.jsonClassifier = jsonClassifier;
        return this;
    }

    /**
     * <p>
     * A classifier for comma-separated values (CSV).
     * </p>
     *
     * @return <p>
     *         A classifier for comma-separated values (CSV).
     *         </p>
     */
    public CsvClassifier getCsvClassifier() {
        return csvClassifier;
    }

    /**
     * <p>
     * A classifier for comma-separated values (CSV).
     * </p>
     *
     * @param csvClassifier <p>
     *            A classifier for comma-separated values (CSV).
     *            </p>
     */
    public void setCsvClassifier(CsvClassifier csvClassifier) {
        this.csvClassifier = csvClassifier;
    }

    /**
     * <p>
     * A classifier for comma-separated values (CSV).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param csvClassifier <p>
     *            A classifier for comma-separated values (CSV).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Classifier withCsvClassifier(CsvClassifier csvClassifier) {
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

        if (obj instanceof Classifier == false)
            return false;
        Classifier other = (Classifier) obj;

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
