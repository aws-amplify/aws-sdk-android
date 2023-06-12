/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

public class AssociateFacesResult implements Serializable {
    /**
     * <p>
     * An array of AssociatedFace objects containing FaceIDs that are
     * successfully associated with the UserID is returned. Returned if the
     * AssociateFaces action is successful.
     * </p>
     */
    private java.util.List<AssociatedFace> associatedFaces;

    /**
     * <p>
     * An array of UnsuccessfulAssociation objects containing FaceIDs that are
     * not successfully associated along with the reasons. Returned if the
     * AssociateFaces action is successful.
     * </p>
     */
    private java.util.List<UnsuccessfulFaceAssociation> unsuccessfulFaceAssociations;

    /**
     * <p>
     * The status of an update made to a UserID. Reflects if the UserID has been
     * updated for every requested change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, UPDATING, CREATING, CREATED
     */
    private String userStatus;

    /**
     * <p>
     * An array of AssociatedFace objects containing FaceIDs that are
     * successfully associated with the UserID is returned. Returned if the
     * AssociateFaces action is successful.
     * </p>
     *
     * @return <p>
     *         An array of AssociatedFace objects containing FaceIDs that are
     *         successfully associated with the UserID is returned. Returned if
     *         the AssociateFaces action is successful.
     *         </p>
     */
    public java.util.List<AssociatedFace> getAssociatedFaces() {
        return associatedFaces;
    }

    /**
     * <p>
     * An array of AssociatedFace objects containing FaceIDs that are
     * successfully associated with the UserID is returned. Returned if the
     * AssociateFaces action is successful.
     * </p>
     *
     * @param associatedFaces <p>
     *            An array of AssociatedFace objects containing FaceIDs that are
     *            successfully associated with the UserID is returned. Returned
     *            if the AssociateFaces action is successful.
     *            </p>
     */
    public void setAssociatedFaces(java.util.Collection<AssociatedFace> associatedFaces) {
        if (associatedFaces == null) {
            this.associatedFaces = null;
            return;
        }

        this.associatedFaces = new java.util.ArrayList<AssociatedFace>(associatedFaces);
    }

    /**
     * <p>
     * An array of AssociatedFace objects containing FaceIDs that are
     * successfully associated with the UserID is returned. Returned if the
     * AssociateFaces action is successful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedFaces <p>
     *            An array of AssociatedFace objects containing FaceIDs that are
     *            successfully associated with the UserID is returned. Returned
     *            if the AssociateFaces action is successful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateFacesResult withAssociatedFaces(AssociatedFace... associatedFaces) {
        if (getAssociatedFaces() == null) {
            this.associatedFaces = new java.util.ArrayList<AssociatedFace>(associatedFaces.length);
        }
        for (AssociatedFace value : associatedFaces) {
            this.associatedFaces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of AssociatedFace objects containing FaceIDs that are
     * successfully associated with the UserID is returned. Returned if the
     * AssociateFaces action is successful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associatedFaces <p>
     *            An array of AssociatedFace objects containing FaceIDs that are
     *            successfully associated with the UserID is returned. Returned
     *            if the AssociateFaces action is successful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateFacesResult withAssociatedFaces(
            java.util.Collection<AssociatedFace> associatedFaces) {
        setAssociatedFaces(associatedFaces);
        return this;
    }

    /**
     * <p>
     * An array of UnsuccessfulAssociation objects containing FaceIDs that are
     * not successfully associated along with the reasons. Returned if the
     * AssociateFaces action is successful.
     * </p>
     *
     * @return <p>
     *         An array of UnsuccessfulAssociation objects containing FaceIDs
     *         that are not successfully associated along with the reasons.
     *         Returned if the AssociateFaces action is successful.
     *         </p>
     */
    public java.util.List<UnsuccessfulFaceAssociation> getUnsuccessfulFaceAssociations() {
        return unsuccessfulFaceAssociations;
    }

    /**
     * <p>
     * An array of UnsuccessfulAssociation objects containing FaceIDs that are
     * not successfully associated along with the reasons. Returned if the
     * AssociateFaces action is successful.
     * </p>
     *
     * @param unsuccessfulFaceAssociations <p>
     *            An array of UnsuccessfulAssociation objects containing FaceIDs
     *            that are not successfully associated along with the reasons.
     *            Returned if the AssociateFaces action is successful.
     *            </p>
     */
    public void setUnsuccessfulFaceAssociations(
            java.util.Collection<UnsuccessfulFaceAssociation> unsuccessfulFaceAssociations) {
        if (unsuccessfulFaceAssociations == null) {
            this.unsuccessfulFaceAssociations = null;
            return;
        }

        this.unsuccessfulFaceAssociations = new java.util.ArrayList<UnsuccessfulFaceAssociation>(
                unsuccessfulFaceAssociations);
    }

    /**
     * <p>
     * An array of UnsuccessfulAssociation objects containing FaceIDs that are
     * not successfully associated along with the reasons. Returned if the
     * AssociateFaces action is successful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessfulFaceAssociations <p>
     *            An array of UnsuccessfulAssociation objects containing FaceIDs
     *            that are not successfully associated along with the reasons.
     *            Returned if the AssociateFaces action is successful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateFacesResult withUnsuccessfulFaceAssociations(
            UnsuccessfulFaceAssociation... unsuccessfulFaceAssociations) {
        if (getUnsuccessfulFaceAssociations() == null) {
            this.unsuccessfulFaceAssociations = new java.util.ArrayList<UnsuccessfulFaceAssociation>(
                    unsuccessfulFaceAssociations.length);
        }
        for (UnsuccessfulFaceAssociation value : unsuccessfulFaceAssociations) {
            this.unsuccessfulFaceAssociations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of UnsuccessfulAssociation objects containing FaceIDs that are
     * not successfully associated along with the reasons. Returned if the
     * AssociateFaces action is successful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessfulFaceAssociations <p>
     *            An array of UnsuccessfulAssociation objects containing FaceIDs
     *            that are not successfully associated along with the reasons.
     *            Returned if the AssociateFaces action is successful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateFacesResult withUnsuccessfulFaceAssociations(
            java.util.Collection<UnsuccessfulFaceAssociation> unsuccessfulFaceAssociations) {
        setUnsuccessfulFaceAssociations(unsuccessfulFaceAssociations);
        return this;
    }

    /**
     * <p>
     * The status of an update made to a UserID. Reflects if the UserID has been
     * updated for every requested change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, UPDATING, CREATING, CREATED
     *
     * @return <p>
     *         The status of an update made to a UserID. Reflects if the UserID
     *         has been updated for every requested change.
     *         </p>
     * @see UserStatus
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * <p>
     * The status of an update made to a UserID. Reflects if the UserID has been
     * updated for every requested change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, UPDATING, CREATING, CREATED
     *
     * @param userStatus <p>
     *            The status of an update made to a UserID. Reflects if the
     *            UserID has been updated for every requested change.
     *            </p>
     * @see UserStatus
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * <p>
     * The status of an update made to a UserID. Reflects if the UserID has been
     * updated for every requested change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, UPDATING, CREATING, CREATED
     *
     * @param userStatus <p>
     *            The status of an update made to a UserID. Reflects if the
     *            UserID has been updated for every requested change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserStatus
     */
    public AssociateFacesResult withUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    /**
     * <p>
     * The status of an update made to a UserID. Reflects if the UserID has been
     * updated for every requested change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, UPDATING, CREATING, CREATED
     *
     * @param userStatus <p>
     *            The status of an update made to a UserID. Reflects if the
     *            UserID has been updated for every requested change.
     *            </p>
     * @see UserStatus
     */
    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus.toString();
    }

    /**
     * <p>
     * The status of an update made to a UserID. Reflects if the UserID has been
     * updated for every requested change.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, UPDATING, CREATING, CREATED
     *
     * @param userStatus <p>
     *            The status of an update made to a UserID. Reflects if the
     *            UserID has been updated for every requested change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserStatus
     */
    public AssociateFacesResult withUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus.toString();
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
        if (getAssociatedFaces() != null)
            sb.append("AssociatedFaces: " + getAssociatedFaces() + ",");
        if (getUnsuccessfulFaceAssociations() != null)
            sb.append("UnsuccessfulFaceAssociations: " + getUnsuccessfulFaceAssociations() + ",");
        if (getUserStatus() != null)
            sb.append("UserStatus: " + getUserStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociatedFaces() == null) ? 0 : getAssociatedFaces().hashCode());
        hashCode = prime
                * hashCode
                + ((getUnsuccessfulFaceAssociations() == null) ? 0
                        : getUnsuccessfulFaceAssociations().hashCode());
        hashCode = prime * hashCode + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateFacesResult == false)
            return false;
        AssociateFacesResult other = (AssociateFacesResult) obj;

        if (other.getAssociatedFaces() == null ^ this.getAssociatedFaces() == null)
            return false;
        if (other.getAssociatedFaces() != null
                && other.getAssociatedFaces().equals(this.getAssociatedFaces()) == false)
            return false;
        if (other.getUnsuccessfulFaceAssociations() == null
                ^ this.getUnsuccessfulFaceAssociations() == null)
            return false;
        if (other.getUnsuccessfulFaceAssociations() != null
                && other.getUnsuccessfulFaceAssociations().equals(
                        this.getUnsuccessfulFaceAssociations()) == false)
            return false;
        if (other.getUserStatus() == null ^ this.getUserStatus() == null)
            return false;
        if (other.getUserStatus() != null
                && other.getUserStatus().equals(this.getUserStatus()) == false)
            return false;
        return true;
    }
}
