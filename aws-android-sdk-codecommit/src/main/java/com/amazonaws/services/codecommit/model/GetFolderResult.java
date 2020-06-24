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

public class GetFolderResult implements Serializable {
    /**
     * <p>
     * The full commit ID used as a reference for the returned version of the
     * folder content.
     * </p>
     */
    private String commitId;

    /**
     * <p>
     * The fully qualified path of the folder whose contents are returned.
     * </p>
     */
    private String folderPath;

    /**
     * <p>
     * The full SHA-1 pointer of the tree information for the commit that
     * contains the folder.
     * </p>
     */
    private String treeId;

    /**
     * <p>
     * The list of folders that exist under the specified folder, if any.
     * </p>
     */
    private java.util.List<Folder> subFolders;

    /**
     * <p>
     * The list of files in the specified folder, if any.
     * </p>
     */
    private java.util.List<File> files;

    /**
     * <p>
     * The list of symbolic links to other files and folders in the specified
     * folder, if any.
     * </p>
     */
    private java.util.List<SymbolicLink> symbolicLinks;

    /**
     * <p>
     * The list of submodules in the specified folder, if any.
     * </p>
     */
    private java.util.List<SubModule> subModules;

    /**
     * <p>
     * The full commit ID used as a reference for the returned version of the
     * folder content.
     * </p>
     *
     * @return <p>
     *         The full commit ID used as a reference for the returned version
     *         of the folder content.
     *         </p>
     */
    public String getCommitId() {
        return commitId;
    }

    /**
     * <p>
     * The full commit ID used as a reference for the returned version of the
     * folder content.
     * </p>
     *
     * @param commitId <p>
     *            The full commit ID used as a reference for the returned
     *            version of the folder content.
     *            </p>
     */
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The full commit ID used as a reference for the returned version of the
     * folder content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitId <p>
     *            The full commit ID used as a reference for the returned
     *            version of the folder content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFolderResult withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * <p>
     * The fully qualified path of the folder whose contents are returned.
     * </p>
     *
     * @return <p>
     *         The fully qualified path of the folder whose contents are
     *         returned.
     *         </p>
     */
    public String getFolderPath() {
        return folderPath;
    }

    /**
     * <p>
     * The fully qualified path of the folder whose contents are returned.
     * </p>
     *
     * @param folderPath <p>
     *            The fully qualified path of the folder whose contents are
     *            returned.
     *            </p>
     */
    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    /**
     * <p>
     * The fully qualified path of the folder whose contents are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param folderPath <p>
     *            The fully qualified path of the folder whose contents are
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFolderResult withFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }

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
    public GetFolderResult withTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }

    /**
     * <p>
     * The list of folders that exist under the specified folder, if any.
     * </p>
     *
     * @return <p>
     *         The list of folders that exist under the specified folder, if
     *         any.
     *         </p>
     */
    public java.util.List<Folder> getSubFolders() {
        return subFolders;
    }

    /**
     * <p>
     * The list of folders that exist under the specified folder, if any.
     * </p>
     *
     * @param subFolders <p>
     *            The list of folders that exist under the specified folder, if
     *            any.
     *            </p>
     */
    public void setSubFolders(java.util.Collection<Folder> subFolders) {
        if (subFolders == null) {
            this.subFolders = null;
            return;
        }

        this.subFolders = new java.util.ArrayList<Folder>(subFolders);
    }

    /**
     * <p>
     * The list of folders that exist under the specified folder, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subFolders <p>
     *            The list of folders that exist under the specified folder, if
     *            any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFolderResult withSubFolders(Folder... subFolders) {
        if (getSubFolders() == null) {
            this.subFolders = new java.util.ArrayList<Folder>(subFolders.length);
        }
        for (Folder value : subFolders) {
            this.subFolders.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of folders that exist under the specified folder, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subFolders <p>
     *            The list of folders that exist under the specified folder, if
     *            any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFolderResult withSubFolders(java.util.Collection<Folder> subFolders) {
        setSubFolders(subFolders);
        return this;
    }

    /**
     * <p>
     * The list of files in the specified folder, if any.
     * </p>
     *
     * @return <p>
     *         The list of files in the specified folder, if any.
     *         </p>
     */
    public java.util.List<File> getFiles() {
        return files;
    }

    /**
     * <p>
     * The list of files in the specified folder, if any.
     * </p>
     *
     * @param files <p>
     *            The list of files in the specified folder, if any.
     *            </p>
     */
    public void setFiles(java.util.Collection<File> files) {
        if (files == null) {
            this.files = null;
            return;
        }

        this.files = new java.util.ArrayList<File>(files);
    }

    /**
     * <p>
     * The list of files in the specified folder, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param files <p>
     *            The list of files in the specified folder, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFolderResult withFiles(File... files) {
        if (getFiles() == null) {
            this.files = new java.util.ArrayList<File>(files.length);
        }
        for (File value : files) {
            this.files.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of files in the specified folder, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param files <p>
     *            The list of files in the specified folder, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFolderResult withFiles(java.util.Collection<File> files) {
        setFiles(files);
        return this;
    }

    /**
     * <p>
     * The list of symbolic links to other files and folders in the specified
     * folder, if any.
     * </p>
     *
     * @return <p>
     *         The list of symbolic links to other files and folders in the
     *         specified folder, if any.
     *         </p>
     */
    public java.util.List<SymbolicLink> getSymbolicLinks() {
        return symbolicLinks;
    }

    /**
     * <p>
     * The list of symbolic links to other files and folders in the specified
     * folder, if any.
     * </p>
     *
     * @param symbolicLinks <p>
     *            The list of symbolic links to other files and folders in the
     *            specified folder, if any.
     *            </p>
     */
    public void setSymbolicLinks(java.util.Collection<SymbolicLink> symbolicLinks) {
        if (symbolicLinks == null) {
            this.symbolicLinks = null;
            return;
        }

        this.symbolicLinks = new java.util.ArrayList<SymbolicLink>(symbolicLinks);
    }

    /**
     * <p>
     * The list of symbolic links to other files and folders in the specified
     * folder, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param symbolicLinks <p>
     *            The list of symbolic links to other files and folders in the
     *            specified folder, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFolderResult withSymbolicLinks(SymbolicLink... symbolicLinks) {
        if (getSymbolicLinks() == null) {
            this.symbolicLinks = new java.util.ArrayList<SymbolicLink>(symbolicLinks.length);
        }
        for (SymbolicLink value : symbolicLinks) {
            this.symbolicLinks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of symbolic links to other files and folders in the specified
     * folder, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param symbolicLinks <p>
     *            The list of symbolic links to other files and folders in the
     *            specified folder, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFolderResult withSymbolicLinks(java.util.Collection<SymbolicLink> symbolicLinks) {
        setSymbolicLinks(symbolicLinks);
        return this;
    }

    /**
     * <p>
     * The list of submodules in the specified folder, if any.
     * </p>
     *
     * @return <p>
     *         The list of submodules in the specified folder, if any.
     *         </p>
     */
    public java.util.List<SubModule> getSubModules() {
        return subModules;
    }

    /**
     * <p>
     * The list of submodules in the specified folder, if any.
     * </p>
     *
     * @param subModules <p>
     *            The list of submodules in the specified folder, if any.
     *            </p>
     */
    public void setSubModules(java.util.Collection<SubModule> subModules) {
        if (subModules == null) {
            this.subModules = null;
            return;
        }

        this.subModules = new java.util.ArrayList<SubModule>(subModules);
    }

    /**
     * <p>
     * The list of submodules in the specified folder, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subModules <p>
     *            The list of submodules in the specified folder, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFolderResult withSubModules(SubModule... subModules) {
        if (getSubModules() == null) {
            this.subModules = new java.util.ArrayList<SubModule>(subModules.length);
        }
        for (SubModule value : subModules) {
            this.subModules.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of submodules in the specified folder, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subModules <p>
     *            The list of submodules in the specified folder, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFolderResult withSubModules(java.util.Collection<SubModule> subModules) {
        setSubModules(subModules);
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
        if (getCommitId() != null)
            sb.append("commitId: " + getCommitId() + ",");
        if (getFolderPath() != null)
            sb.append("folderPath: " + getFolderPath() + ",");
        if (getTreeId() != null)
            sb.append("treeId: " + getTreeId() + ",");
        if (getSubFolders() != null)
            sb.append("subFolders: " + getSubFolders() + ",");
        if (getFiles() != null)
            sb.append("files: " + getFiles() + ",");
        if (getSymbolicLinks() != null)
            sb.append("symbolicLinks: " + getSymbolicLinks() + ",");
        if (getSubModules() != null)
            sb.append("subModules: " + getSubModules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getFolderPath() == null) ? 0 : getFolderPath().hashCode());
        hashCode = prime * hashCode + ((getTreeId() == null) ? 0 : getTreeId().hashCode());
        hashCode = prime * hashCode + ((getSubFolders() == null) ? 0 : getSubFolders().hashCode());
        hashCode = prime * hashCode + ((getFiles() == null) ? 0 : getFiles().hashCode());
        hashCode = prime * hashCode
                + ((getSymbolicLinks() == null) ? 0 : getSymbolicLinks().hashCode());
        hashCode = prime * hashCode + ((getSubModules() == null) ? 0 : getSubModules().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFolderResult == false)
            return false;
        GetFolderResult other = (GetFolderResult) obj;

        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getFolderPath() == null ^ this.getFolderPath() == null)
            return false;
        if (other.getFolderPath() != null
                && other.getFolderPath().equals(this.getFolderPath()) == false)
            return false;
        if (other.getTreeId() == null ^ this.getTreeId() == null)
            return false;
        if (other.getTreeId() != null && other.getTreeId().equals(this.getTreeId()) == false)
            return false;
        if (other.getSubFolders() == null ^ this.getSubFolders() == null)
            return false;
        if (other.getSubFolders() != null
                && other.getSubFolders().equals(this.getSubFolders()) == false)
            return false;
        if (other.getFiles() == null ^ this.getFiles() == null)
            return false;
        if (other.getFiles() != null && other.getFiles().equals(this.getFiles()) == false)
            return false;
        if (other.getSymbolicLinks() == null ^ this.getSymbolicLinks() == null)
            return false;
        if (other.getSymbolicLinks() != null
                && other.getSymbolicLinks().equals(this.getSymbolicLinks()) == false)
            return false;
        if (other.getSubModules() == null ^ this.getSubModules() == null)
            return false;
        if (other.getSubModules() != null
                && other.getSubModules().equals(this.getSubModules()) == false)
            return false;
        return true;
    }
}
