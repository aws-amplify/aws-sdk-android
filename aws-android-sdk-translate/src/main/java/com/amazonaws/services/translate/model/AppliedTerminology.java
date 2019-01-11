/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

/**
 * <p>
 * The custom terminology applied to the input text by Amazon Translate for the
 * translated text response. This is optional in the response and will only be
 * present if you specified terminology input in the request. Currently, only
 * one terminology can be applied per TranslateText request.
 * </p>
 */
public class AppliedTerminology implements Serializable {
    /**
     * <p>
     * The name of the custom terminology applied to the input text by Amazon
     * Translate for the translated text response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * The specific terms of the custom terminology applied to the input text by
     * Amazon Translate for the translated text response. A maximum of 250 terms
     * will be returned, and the specific terms applied will be the first 250
     * terms in the source text.
     * </p>
     */
    private java.util.List<Term> terms;

    /**
     * <p>
     * The name of the custom terminology applied to the input text by Amazon
     * Translate for the translated text response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @return <p>
     *         The name of the custom terminology applied to the input text by
     *         Amazon Translate for the translated text response.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the custom terminology applied to the input text by Amazon
     * Translate for the translated text response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the custom terminology applied to the input text
     *            by Amazon Translate for the translated text response.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom terminology applied to the input text by Amazon
     * Translate for the translated text response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the custom terminology applied to the input text
     *            by Amazon Translate for the translated text response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppliedTerminology withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The specific terms of the custom terminology applied to the input text by
     * Amazon Translate for the translated text response. A maximum of 250 terms
     * will be returned, and the specific terms applied will be the first 250
     * terms in the source text.
     * </p>
     *
     * @return <p>
     *         The specific terms of the custom terminology applied to the input
     *         text by Amazon Translate for the translated text response. A
     *         maximum of 250 terms will be returned, and the specific terms
     *         applied will be the first 250 terms in the source text.
     *         </p>
     */
    public java.util.List<Term> getTerms() {
        return terms;
    }

    /**
     * <p>
     * The specific terms of the custom terminology applied to the input text by
     * Amazon Translate for the translated text response. A maximum of 250 terms
     * will be returned, and the specific terms applied will be the first 250
     * terms in the source text.
     * </p>
     *
     * @param terms <p>
     *            The specific terms of the custom terminology applied to the
     *            input text by Amazon Translate for the translated text
     *            response. A maximum of 250 terms will be returned, and the
     *            specific terms applied will be the first 250 terms in the
     *            source text.
     *            </p>
     */
    public void setTerms(java.util.Collection<Term> terms) {
        if (terms == null) {
            this.terms = null;
            return;
        }

        this.terms = new java.util.ArrayList<Term>(terms);
    }

    /**
     * <p>
     * The specific terms of the custom terminology applied to the input text by
     * Amazon Translate for the translated text response. A maximum of 250 terms
     * will be returned, and the specific terms applied will be the first 250
     * terms in the source text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terms <p>
     *            The specific terms of the custom terminology applied to the
     *            input text by Amazon Translate for the translated text
     *            response. A maximum of 250 terms will be returned, and the
     *            specific terms applied will be the first 250 terms in the
     *            source text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppliedTerminology withTerms(Term... terms) {
        if (getTerms() == null) {
            this.terms = new java.util.ArrayList<Term>(terms.length);
        }
        for (Term value : terms) {
            this.terms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The specific terms of the custom terminology applied to the input text by
     * Amazon Translate for the translated text response. A maximum of 250 terms
     * will be returned, and the specific terms applied will be the first 250
     * terms in the source text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terms <p>
     *            The specific terms of the custom terminology applied to the
     *            input text by Amazon Translate for the translated text
     *            response. A maximum of 250 terms will be returned, and the
     *            specific terms applied will be the first 250 terms in the
     *            source text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AppliedTerminology withTerms(java.util.Collection<Term> terms) {
        setTerms(terms);
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
        if (getTerms() != null)
            sb.append("Terms: " + getTerms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTerms() == null) ? 0 : getTerms().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppliedTerminology == false)
            return false;
        AppliedTerminology other = (AppliedTerminology) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTerms() == null ^ this.getTerms() == null)
            return false;
        if (other.getTerms() != null && other.getTerms().equals(this.getTerms()) == false)
            return false;
        return true;
    }
}
