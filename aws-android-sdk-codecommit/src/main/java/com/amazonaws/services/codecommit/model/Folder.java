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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Returns information about a folder in a repository.
 * </p>
 */
public class Folder implements Serializable {
    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that
     * contains the folder.
     * </p>
     */
    private String treeId;

    /**
     * <p>
     * The fully qualified path of the folder in the repository.
     * </p>
     */
    private String absolutePath;

    /**
     * <p>
     * The relative path of the specified folder from the folder where the query
     * originated.
     * </p>
     */
    private String relativePath;

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that
     * contains the folder.
     * </p>
     *
     * @return <p>
     *         The full SHA-1 pointer of the tree information for the commit
     *         that contains the folder.
     *         </p>
     */
    public String getTreeId() {
        return treeId;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that
     * contains the folder.
     * </p>
     *
     * @param treeId <p>
     *            The full SHA-1 pointer of the tree information for the commit
     *            that contains the folder.
     *            </p>
     */
    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that
     * contains the folder.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param treeId <p>
     *            The full SHA-1 pointer of the tree information for the commit
     *            that contains the folder.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Folder withTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }

    /**
     * <p>
     * The fully qualified path of the folder in the repository.
     * </p>
     *
     * @return <p>
     *         The fully qualified path of the folder in the repository.
     *         </p>
     */
    public String getAbsolutePath() {
        return absolutePath;
    }

    /**
     * <p>
     * The fully qualified path of the folder in the repository.
     * </p>
     *
     * @param absolutePath <p>
     *            The fully qualified path of the folder in the repository.
     *            </p>
     */
    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    /**
     * <p>
     * The fully qualified path of the folder in the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param absolutePath <p>
     *            The fully qualified path of the folder in the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Folder withAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
        return this;
    }

    /**
     * <p>
     * The relative path of the specified folder from the folder where the query
     * originated.
     * </p>
     *
     * @return <p>
     *         The relative path of the specified folder from the folder where
     *         the query originated.
     *         </p>
     */
    public String getRelativePath() {
        return relativePath;
    }

    /**
     * <p>
     * The relative path of the specified folder from the folder where the query
     * originated.
     * </p>
     *
     * @param relativePath <p>
     *            The relative path of the specified folder from the folder
     *            where the query originated.
     *            </p>
     */
    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    /**
     * <p>
     * The relative path of the specified folder from the folder where the query
     * originated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relativePath <p>
     *            The relative path of the specified folder from the folder
     *            where the query originated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Folder withRelativePath(String relativePath) {
        this.relativePath = relativePath;
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
        if (getTreeId() != null)
            sb.append("treeId: " + getTreeId() + ",");
        if (getAbsolutePath() != null)
            sb.append("absolutePath: " + getAbsolutePath() + ",");
        if (getRelativePath() != null)
            sb.append("relativePath: " + getRelativePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTreeId() == null) ? 0 : getTreeId().hashCode());
        hashCode = prime * hashCode
                + ((getAbsolutePath() == null) ? 0 : getAbsolutePath().hashCode());
        hashCode = prime * hashCode
                + ((getRelativePath() == null) ? 0 : getRelativePath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Folder == false)
            return false;
        Folder other = (Folder) obj;

        if (other.getTreeId() == null ^ this.getTreeId() == null)
            return false;
        if (other.getTreeId() != null && other.getTreeId().equals(this.getTreeId()) == false)
            return false;
        if (other.getAbsolutePath() == null ^ this.getAbsolutePath() == null)
            return false;
        if (other.getAbsolutePath() != null
                && other.getAbsolutePath().equals(this.getAbsolutePath()) == false)
            return false;
        if (other.getRelativePath() == null ^ this.getRelativePath() == null)
            return false;
        if (other.getRelativePath() != null
                && other.getRelativePath().equals(this.getRelativePath()) == false)
            return false;
        return true;
    }
}
