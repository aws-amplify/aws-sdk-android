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
 * Information about the metadata for a conflict in a merge operation.
 * </p>
 */
public class ConflictMetadata implements Serializable {
    /**
     * <p>
     * The path of the file that contains conflicts.
     * </p>
     */
    private String filePath;

    /**
     * <p>
     * The file sizes of the file in the source, destination, and base of the
     * merge.
     * </p>
     */
    private FileSizes fileSizes;

    /**
     * <p>
     * The file modes of the file in the source, destination, and base of the
     * merge.
     * </p>
     */
    private FileModes fileModes;

    /**
     * <p>
     * Information about any object type conflicts in a merge operation.
     * </p>
     */
    private ObjectTypes objectTypes;

    /**
     * <p>
     * The number of conflicts, including both hunk conflicts and metadata
     * conflicts.
     * </p>
     */
    private Integer numberOfConflicts;

    /**
     * <p>
     * A boolean value (true or false) indicating whether the file is binary or
     * textual in the source, destination, and base of the merge.
     * </p>
     */
    private IsBinaryFile isBinaryFile;

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the content of
     * a file.
     * </p>
     */
    private Boolean contentConflict;

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the file mode
     * of a file.
     * </p>
     */
    private Boolean fileModeConflict;

    /**
     * <p>
     * A boolean value (true or false) indicating whether there are conflicts
     * between the branches in the object type of a file, folder, or submodule.
     * </p>
     */
    private Boolean objectTypeConflict;

    /**
     * <p>
     * Whether an add, modify, or delete operation caused the conflict between
     * the source and destination of the merge.
     * </p>
     */
    private MergeOperations mergeOperations;

    /**
     * <p>
     * The path of the file that contains conflicts.
     * </p>
     *
     * @return <p>
     *         The path of the file that contains conflicts.
     *         </p>
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * <p>
     * The path of the file that contains conflicts.
     * </p>
     *
     * @param filePath <p>
     *            The path of the file that contains conflicts.
     *            </p>
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The path of the file that contains conflicts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filePath <p>
     *            The path of the file that contains conflicts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConflictMetadata withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * <p>
     * The file sizes of the file in the source, destination, and base of the
     * merge.
     * </p>
     *
     * @return <p>
     *         The file sizes of the file in the source, destination, and base
     *         of the merge.
     *         </p>
     */
    public FileSizes getFileSizes() {
        return fileSizes;
    }

    /**
     * <p>
     * The file sizes of the file in the source, destination, and base of the
     * merge.
     * </p>
     *
     * @param fileSizes <p>
     *            The file sizes of the file in the source, destination, and
     *            base of the merge.
     *            </p>
     */
    public void setFileSizes(FileSizes fileSizes) {
        this.fileSizes = fileSizes;
    }

    /**
     * <p>
     * The file sizes of the file in the source, destination, and base of the
     * merge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileSizes <p>
     *            The file sizes of the file in the source, destination, and
     *            base of the merge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConflictMetadata withFileSizes(FileSizes fileSizes) {
        this.fileSizes = fileSizes;
        return this;
    }

    /**
     * <p>
     * The file modes of the file in the source, destination, and base of the
     * merge.
     * </p>
     *
     * @return <p>
     *         The file modes of the file in the source, destination, and base
     *         of the merge.
     *         </p>
     */
    public FileModes getFileModes() {
        return fileModes;
    }

    /**
     * <p>
     * The file modes of the file in the source, destination, and base of the
     * merge.
     * </p>
     *
     * @param fileModes <p>
     *            The file modes of the file in the source, destination, and
     *            base of the merge.
     *            </p>
     */
    public void setFileModes(FileModes fileModes) {
        this.fileModes = fileModes;
    }

    /**
     * <p>
     * The file modes of the file in the source, destination, and base of the
     * merge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileModes <p>
     *            The file modes of the file in the source, destination, and
     *            base of the merge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConflictMetadata withFileModes(FileModes fileModes) {
        this.fileModes = fileModes;
        return this;
    }

    /**
     * <p>
     * Information about any object type conflicts in a merge operation.
     * </p>
     *
     * @return <p>
     *         Information about any object type conflicts in a merge operation.
     *         </p>
     */
    public ObjectTypes getObjectTypes() {
        return objectTypes;
    }

    /**
     * <p>
     * Information about any object type conflicts in a merge operation.
     * </p>
     *
     * @param objectTypes <p>
     *            Information about any object type conflicts in a merge
     *            operation.
     *            </p>
     */
    public void setObjectTypes(ObjectTypes objectTypes) {
        this.objectTypes = objectTypes;
    }

    /**
     * <p>
     * Information about any object type conflicts in a merge operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param objectTypes <p>
     *            Information about any object type conflicts in a merge
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConflictMetadata withObjectTypes(ObjectTypes objectTypes) {
        this.objectTypes = objectTypes;
        return this;
    }

    /**
     * <p>
     * The number of conflicts, including both hunk conflicts and metadata
     * conflicts.
     * </p>
     *
     * @return <p>
     *         The number of conflicts, including both hunk conflicts and
     *         metadata conflicts.
     *         </p>
     */
    public Integer getNumberOfConflicts() {
        return numberOfConflicts;
    }

    /**
     * <p>
     * The number of conflicts, including both hunk conflicts and metadata
     * conflicts.
     * </p>
     *
     * @param numberOfConflicts <p>
     *            The number of conflicts, including both hunk conflicts and
     *            metadata conflicts.
     *            </p>
     */
    public void setNumberOfConflicts(Integer numberOfConflicts) {
        this.numberOfConflicts = numberOfConflicts;
    }

    /**
     * <p>
     * The number of conflicts, including both hunk conflicts and metadata
     * conflicts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfConflicts <p>
     *            The number of conflicts, including both hunk conflicts and
     *            metadata conflicts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConflictMetadata withNumberOfConflicts(Integer numberOfConflicts) {
        this.numberOfConflicts = numberOfConflicts;
        return this;
    }

    /**
     * <p>
     * A boolean value (true or false) indicating whether the file is binary or
     * textual in the source, destination, and base of the merge.
     * </p>
     *
     * @return <p>
     *         A boolean value (true or false) indicating whether the file is
     *         binary or textual in the source, destination, and base of the
     *         merge.
     *         </p>
     */
    public IsBinaryFile getIsBinaryFile() {
        return isBinaryFile;
    }

    /**
     * <p>
     * A boolean value (true or false) indicating whether the file is binary or
     * textual in the source, destination, and base of the merge.
     * </p>
     *
     * @param isBinaryFile <p>
     *            A boolean value (true or false) indicating whether the file is
     *            binary or textual in the source, destination, and base of the
     *            merge.
     *            </p>
     */
    public void setIsBinaryFile(IsBinaryFile isBinaryFile) {
        this.isBinaryFile = isBinaryFile;
    }

    /**
     * <p>
     * A boolean value (true or false) indicating whether the file is binary or
     * textual in the source, destination, and base of the merge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isBinaryFile <p>
     *            A boolean value (true or false) indicating whether the file is
     *            binary or textual in the source, destination, and base of the
     *            merge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConflictMetadata withIsBinaryFile(IsBinaryFile isBinaryFile) {
        this.isBinaryFile = isBinaryFile;
        return this;
    }

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the content of
     * a file.
     * </p>
     *
     * @return <p>
     *         A boolean value indicating whether there are conflicts in the
     *         content of a file.
     *         </p>
     */
    public Boolean isContentConflict() {
        return contentConflict;
    }

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the content of
     * a file.
     * </p>
     *
     * @return <p>
     *         A boolean value indicating whether there are conflicts in the
     *         content of a file.
     *         </p>
     */
    public Boolean getContentConflict() {
        return contentConflict;
    }

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the content of
     * a file.
     * </p>
     *
     * @param contentConflict <p>
     *            A boolean value indicating whether there are conflicts in the
     *            content of a file.
     *            </p>
     */
    public void setContentConflict(Boolean contentConflict) {
        this.contentConflict = contentConflict;
    }

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the content of
     * a file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentConflict <p>
     *            A boolean value indicating whether there are conflicts in the
     *            content of a file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConflictMetadata withContentConflict(Boolean contentConflict) {
        this.contentConflict = contentConflict;
        return this;
    }

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the file mode
     * of a file.
     * </p>
     *
     * @return <p>
     *         A boolean value indicating whether there are conflicts in the
     *         file mode of a file.
     *         </p>
     */
    public Boolean isFileModeConflict() {
        return fileModeConflict;
    }

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the file mode
     * of a file.
     * </p>
     *
     * @return <p>
     *         A boolean value indicating whether there are conflicts in the
     *         file mode of a file.
     *         </p>
     */
    public Boolean getFileModeConflict() {
        return fileModeConflict;
    }

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the file mode
     * of a file.
     * </p>
     *
     * @param fileModeConflict <p>
     *            A boolean value indicating whether there are conflicts in the
     *            file mode of a file.
     *            </p>
     */
    public void setFileModeConflict(Boolean fileModeConflict) {
        this.fileModeConflict = fileModeConflict;
    }

    /**
     * <p>
     * A boolean value indicating whether there are conflicts in the file mode
     * of a file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileModeConflict <p>
     *            A boolean value indicating whether there are conflicts in the
     *            file mode of a file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConflictMetadata withFileModeConflict(Boolean fileModeConflict) {
        this.fileModeConflict = fileModeConflict;
        return this;
    }

    /**
     * <p>
     * A boolean value (true or false) indicating whether there are conflicts
     * between the branches in the object type of a file, folder, or submodule.
     * </p>
     *
     * @return <p>
     *         A boolean value (true or false) indicating whether there are
     *         conflicts between the branches in the object type of a file,
     *         folder, or submodule.
     *         </p>
     */
    public Boolean isObjectTypeConflict() {
        return objectTypeConflict;
    }

    /**
     * <p>
     * A boolean value (true or false) indicating whether there are conflicts
     * between the branches in the object type of a file, folder, or submodule.
     * </p>
     *
     * @return <p>
     *         A boolean value (true or false) indicating whether there are
     *         conflicts between the branches in the object type of a file,
     *         folder, or submodule.
     *         </p>
     */
    public Boolean getObjectTypeConflict() {
        return objectTypeConflict;
    }

    /**
     * <p>
     * A boolean value (true or false) indicating whether there are conflicts
     * between the branches in the object type of a file, folder, or submodule.
     * </p>
     *
     * @param objectTypeConflict <p>
     *            A boolean value (true or false) indicating whether there are
     *            conflicts between the branches in the object type of a file,
     *            folder, or submodule.
     *            </p>
     */
    public void setObjectTypeConflict(Boolean objectTypeConflict) {
        this.objectTypeConflict = objectTypeConflict;
    }

    /**
     * <p>
     * A boolean value (true or false) indicating whether there are conflicts
     * between the branches in the object type of a file, folder, or submodule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param objectTypeConflict <p>
     *            A boolean value (true or false) indicating whether there are
     *            conflicts between the branches in the object type of a file,
     *            folder, or submodule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConflictMetadata withObjectTypeConflict(Boolean objectTypeConflict) {
        this.objectTypeConflict = objectTypeConflict;
        return this;
    }

    /**
     * <p>
     * Whether an add, modify, or delete operation caused the conflict between
     * the source and destination of the merge.
     * </p>
     *
     * @return <p>
     *         Whether an add, modify, or delete operation caused the conflict
     *         between the source and destination of the merge.
     *         </p>
     */
    public MergeOperations getMergeOperations() {
        return mergeOperations;
    }

    /**
     * <p>
     * Whether an add, modify, or delete operation caused the conflict between
     * the source and destination of the merge.
     * </p>
     *
     * @param mergeOperations <p>
     *            Whether an add, modify, or delete operation caused the
     *            conflict between the source and destination of the merge.
     *            </p>
     */
    public void setMergeOperations(MergeOperations mergeOperations) {
        this.mergeOperations = mergeOperations;
    }

    /**
     * <p>
     * Whether an add, modify, or delete operation caused the conflict between
     * the source and destination of the merge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mergeOperations <p>
     *            Whether an add, modify, or delete operation caused the
     *            conflict between the source and destination of the merge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConflictMetadata withMergeOperations(MergeOperations mergeOperations) {
        this.mergeOperations = mergeOperations;
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
        if (getFilePath() != null)
            sb.append("filePath: " + getFilePath() + ",");
        if (getFileSizes() != null)
            sb.append("fileSizes: " + getFileSizes() + ",");
        if (getFileModes() != null)
            sb.append("fileModes: " + getFileModes() + ",");
        if (getObjectTypes() != null)
            sb.append("objectTypes: " + getObjectTypes() + ",");
        if (getNumberOfConflicts() != null)
            sb.append("numberOfConflicts: " + getNumberOfConflicts() + ",");
        if (getIsBinaryFile() != null)
            sb.append("isBinaryFile: " + getIsBinaryFile() + ",");
        if (getContentConflict() != null)
            sb.append("contentConflict: " + getContentConflict() + ",");
        if (getFileModeConflict() != null)
            sb.append("fileModeConflict: " + getFileModeConflict() + ",");
        if (getObjectTypeConflict() != null)
            sb.append("objectTypeConflict: " + getObjectTypeConflict() + ",");
        if (getMergeOperations() != null)
            sb.append("mergeOperations: " + getMergeOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getFileSizes() == null) ? 0 : getFileSizes().hashCode());
        hashCode = prime * hashCode + ((getFileModes() == null) ? 0 : getFileModes().hashCode());
        hashCode = prime * hashCode
                + ((getObjectTypes() == null) ? 0 : getObjectTypes().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfConflicts() == null) ? 0 : getNumberOfConflicts().hashCode());
        hashCode = prime * hashCode
                + ((getIsBinaryFile() == null) ? 0 : getIsBinaryFile().hashCode());
        hashCode = prime * hashCode
                + ((getContentConflict() == null) ? 0 : getContentConflict().hashCode());
        hashCode = prime * hashCode
                + ((getFileModeConflict() == null) ? 0 : getFileModeConflict().hashCode());
        hashCode = prime * hashCode
                + ((getObjectTypeConflict() == null) ? 0 : getObjectTypeConflict().hashCode());
        hashCode = prime * hashCode
                + ((getMergeOperations() == null) ? 0 : getMergeOperations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConflictMetadata == false)
            return false;
        ConflictMetadata other = (ConflictMetadata) obj;

        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getFileSizes() == null ^ this.getFileSizes() == null)
            return false;
        if (other.getFileSizes() != null
                && other.getFileSizes().equals(this.getFileSizes()) == false)
            return false;
        if (other.getFileModes() == null ^ this.getFileModes() == null)
            return false;
        if (other.getFileModes() != null
                && other.getFileModes().equals(this.getFileModes()) == false)
            return false;
        if (other.getObjectTypes() == null ^ this.getObjectTypes() == null)
            return false;
        if (other.getObjectTypes() != null
                && other.getObjectTypes().equals(this.getObjectTypes()) == false)
            return false;
        if (other.getNumberOfConflicts() == null ^ this.getNumberOfConflicts() == null)
            return false;
        if (other.getNumberOfConflicts() != null
                && other.getNumberOfConflicts().equals(this.getNumberOfConflicts()) == false)
            return false;
        if (other.getIsBinaryFile() == null ^ this.getIsBinaryFile() == null)
            return false;
        if (other.getIsBinaryFile() != null
                && other.getIsBinaryFile().equals(this.getIsBinaryFile()) == false)
            return false;
        if (other.getContentConflict() == null ^ this.getContentConflict() == null)
            return false;
        if (other.getContentConflict() != null
                && other.getContentConflict().equals(this.getContentConflict()) == false)
            return false;
        if (other.getFileModeConflict() == null ^ this.getFileModeConflict() == null)
            return false;
        if (other.getFileModeConflict() != null
                && other.getFileModeConflict().equals(this.getFileModeConflict()) == false)
            return false;
        if (other.getObjectTypeConflict() == null ^ this.getObjectTypeConflict() == null)
            return false;
        if (other.getObjectTypeConflict() != null
                && other.getObjectTypeConflict().equals(this.getObjectTypeConflict()) == false)
            return false;
        if (other.getMergeOperations() == null ^ this.getMergeOperations() == null)
            return false;
        if (other.getMergeOperations() != null
                && other.getMergeOperations().equals(this.getMergeOperations()) == false)
            return false;
        return true;
    }
}
