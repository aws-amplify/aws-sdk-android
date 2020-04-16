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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

public class GetClassifiersResult implements Serializable {
    /**
     * <p>
     * The requested list of classifier objects.
     * </p>
     */
    private java.util.List<Classifier> classifiers;

    /**
     * <p>
     * A continuation token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The requested list of classifier objects.
     * </p>
     *
     * @return <p>
     *         The requested list of classifier objects.
     *         </p>
     */
    public java.util.List<Classifier> getClassifiers() {
        return classifiers;
    }

    /**
     * <p>
     * The requested list of classifier objects.
     * </p>
     *
     * @param classifiers <p>
     *            The requested list of classifier objects.
     *            </p>
     */
    public void setClassifiers(java.util.Collection<Classifier> classifiers) {
        if (classifiers == null) {
            this.classifiers = null;
            return;
        }

        this.classifiers = new java.util.ArrayList<Classifier>(classifiers);
    }

    /**
     * <p>
     * The requested list of classifier objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classifiers <p>
     *            The requested list of classifier objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetClassifiersResult withClassifiers(Classifier... classifiers) {
        if (getClassifiers() == null) {
            this.classifiers = new java.util.ArrayList<Classifier>(classifiers.length);
        }
        for (Classifier value : classifiers) {
            this.classifiers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The requested list of classifier objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classifiers <p>
     *            The requested list of classifier objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetClassifiersResult withClassifiers(java.util.Collection<Classifier> classifiers) {
        setClassifiers(classifiers);
        return this;
    }

    /**
     * <p>
     * A continuation token.
     * </p>
     *
     * @return <p>
     *         A continuation token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetClassifiersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getClassifiers() != null)
            sb.append("Classifiers: " + getClassifiers() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClassifiers() == null) ? 0 : getClassifiers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetClassifiersResult == false)
            return false;
        GetClassifiersResult other = (GetClassifiersResult) obj;

        if (other.getClassifiers() == null ^ this.getClassifiers() == null)
            return false;
        if (other.getClassifiers() != null
                && other.getClassifiers().equals(this.getClassifiers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
