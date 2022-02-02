/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class ClassifyDocumentResult implements Serializable {
    /**
     * <p>
     * The classes used by the document being analyzed. These are used for
     * multi-class trained models. Individual classes are mutually exclusive and
     * each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     */
    private java.util.List<DocumentClass> classes;

    /**
     * <p>
     * The labels used the document being analyzed. These are used for
     * multi-label trained models. Individual labels represent different
     * categories that are related in some manner and are not mutually
     * exclusive. For example, a movie can be just an action movie, or it can be
     * an action movie, a science fiction movie, and a comedy, all at the same
     * time.
     * </p>
     */
    private java.util.List<DocumentLabel> labels;

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for
     * multi-class trained models. Individual classes are mutually exclusive and
     * each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     *
     * @return <p>
     *         The classes used by the document being analyzed. These are used
     *         for multi-class trained models. Individual classes are mutually
     *         exclusive and each document is expected to have only a single
     *         class assigned to it. For example, an animal can be a dog or a
     *         cat, but not both at the same time.
     *         </p>
     */
    public java.util.List<DocumentClass> getClasses() {
        return classes;
    }

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for
     * multi-class trained models. Individual classes are mutually exclusive and
     * each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     *
     * @param classes <p>
     *            The classes used by the document being analyzed. These are
     *            used for multi-class trained models. Individual classes are
     *            mutually exclusive and each document is expected to have only
     *            a single class assigned to it. For example, an animal can be a
     *            dog or a cat, but not both at the same time.
     *            </p>
     */
    public void setClasses(java.util.Collection<DocumentClass> classes) {
        if (classes == null) {
            this.classes = null;
            return;
        }

        this.classes = new java.util.ArrayList<DocumentClass>(classes);
    }

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for
     * multi-class trained models. Individual classes are mutually exclusive and
     * each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classes <p>
     *            The classes used by the document being analyzed. These are
     *            used for multi-class trained models. Individual classes are
     *            mutually exclusive and each document is expected to have only
     *            a single class assigned to it. For example, an animal can be a
     *            dog or a cat, but not both at the same time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentResult withClasses(DocumentClass... classes) {
        if (getClasses() == null) {
            this.classes = new java.util.ArrayList<DocumentClass>(classes.length);
        }
        for (DocumentClass value : classes) {
            this.classes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The classes used by the document being analyzed. These are used for
     * multi-class trained models. Individual classes are mutually exclusive and
     * each document is expected to have only a single class assigned to it. For
     * example, an animal can be a dog or a cat, but not both at the same time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classes <p>
     *            The classes used by the document being analyzed. These are
     *            used for multi-class trained models. Individual classes are
     *            mutually exclusive and each document is expected to have only
     *            a single class assigned to it. For example, an animal can be a
     *            dog or a cat, but not both at the same time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentResult withClasses(java.util.Collection<DocumentClass> classes) {
        setClasses(classes);
        return this;
    }

    /**
     * <p>
     * The labels used the document being analyzed. These are used for
     * multi-label trained models. Individual labels represent different
     * categories that are related in some manner and are not mutually
     * exclusive. For example, a movie can be just an action movie, or it can be
     * an action movie, a science fiction movie, and a comedy, all at the same
     * time.
     * </p>
     *
     * @return <p>
     *         The labels used the document being analyzed. These are used for
     *         multi-label trained models. Individual labels represent different
     *         categories that are related in some manner and are not mutually
     *         exclusive. For example, a movie can be just an action movie, or
     *         it can be an action movie, a science fiction movie, and a comedy,
     *         all at the same time.
     *         </p>
     */
    public java.util.List<DocumentLabel> getLabels() {
        return labels;
    }

    /**
     * <p>
     * The labels used the document being analyzed. These are used for
     * multi-label trained models. Individual labels represent different
     * categories that are related in some manner and are not mutually
     * exclusive. For example, a movie can be just an action movie, or it can be
     * an action movie, a science fiction movie, and a comedy, all at the same
     * time.
     * </p>
     *
     * @param labels <p>
     *            The labels used the document being analyzed. These are used
     *            for multi-label trained models. Individual labels represent
     *            different categories that are related in some manner and are
     *            not mutually exclusive. For example, a movie can be just an
     *            action movie, or it can be an action movie, a science fiction
     *            movie, and a comedy, all at the same time.
     *            </p>
     */
    public void setLabels(java.util.Collection<DocumentLabel> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<DocumentLabel>(labels);
    }

    /**
     * <p>
     * The labels used the document being analyzed. These are used for
     * multi-label trained models. Individual labels represent different
     * categories that are related in some manner and are not mutually
     * exclusive. For example, a movie can be just an action movie, or it can be
     * an action movie, a science fiction movie, and a comedy, all at the same
     * time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            The labels used the document being analyzed. These are used
     *            for multi-label trained models. Individual labels represent
     *            different categories that are related in some manner and are
     *            not mutually exclusive. For example, a movie can be just an
     *            action movie, or it can be an action movie, a science fiction
     *            movie, and a comedy, all at the same time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentResult withLabels(DocumentLabel... labels) {
        if (getLabels() == null) {
            this.labels = new java.util.ArrayList<DocumentLabel>(labels.length);
        }
        for (DocumentLabel value : labels) {
            this.labels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The labels used the document being analyzed. These are used for
     * multi-label trained models. Individual labels represent different
     * categories that are related in some manner and are not mutually
     * exclusive. For example, a movie can be just an action movie, or it can be
     * an action movie, a science fiction movie, and a comedy, all at the same
     * time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            The labels used the document being analyzed. These are used
     *            for multi-label trained models. Individual labels represent
     *            different categories that are related in some manner and are
     *            not mutually exclusive. For example, a movie can be just an
     *            action movie, or it can be an action movie, a science fiction
     *            movie, and a comedy, all at the same time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifyDocumentResult withLabels(java.util.Collection<DocumentLabel> labels) {
        setLabels(labels);
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
        if (getClasses() != null)
            sb.append("Classes: " + getClasses() + ",");
        if (getLabels() != null)
            sb.append("Labels: " + getLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClasses() == null) ? 0 : getClasses().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassifyDocumentResult == false)
            return false;
        ClassifyDocumentResult other = (ClassifyDocumentResult) obj;

        if (other.getClasses() == null ^ this.getClasses() == null)
            return false;
        if (other.getClasses() != null && other.getClasses().equals(this.getClasses()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        return true;
    }
}
