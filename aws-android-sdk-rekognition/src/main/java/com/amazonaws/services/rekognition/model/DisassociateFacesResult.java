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

public class DisassociateFacesResult implements Serializable {
    /**
     * <p>
     * An array of DissociatedFace objects containing FaceIds that are
     * successfully disassociated with the UserID is returned. Returned if the
     * DisassociatedFaces action is successful.
     * </p>
     */
    private java.util.List<DisassociatedFace> disassociatedFaces;

    /**
     * <p>
     * An array of UnsuccessfulDisassociation objects containing FaceIds that
     * are not successfully associated, along with the reasons for the failure
     * to associate. Returned if the DisassociateFaces action is successful.
     * </p>
     */
    private java.util.List<UnsuccessfulFaceDisassociation> unsuccessfulFaceDisassociations;

    /**
     * <p>
     * The status of an update made to a User. Reflects if the User has been
     * updated for every requested change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, UPDATING, CREATING, CREATED
     */
    private String userStatus;

    /**
     * <p>
     * An array of DissociatedFace objects containing FaceIds that are
     * successfully disassociated with the UserID is returned. Returned if the
     * DisassociatedFaces action is successful.
     * </p>
     *
     * @return <p>
     *         An array of DissociatedFace objects containing FaceIds that are
     *         successfully disassociated with the UserID is returned. Returned
     *         if the DisassociatedFaces action is successful.
     *         </p>
     */
    public java.util.List<DisassociatedFace> getDisassociatedFaces() {
        return disassociatedFaces;
    }

    /**
     * <p>
     * An array of DissociatedFace objects containing FaceIds that are
     * successfully disassociated with the UserID is returned. Returned if the
     * DisassociatedFaces action is successful.
     * </p>
     *
     * @param disassociatedFaces <p>
     *            An array of DissociatedFace objects containing FaceIds that
     *            are successfully disassociated with the UserID is returned.
     *            Returned if the DisassociatedFaces action is successful.
     *            </p>
     */
    public void setDisassociatedFaces(java.util.Collection<DisassociatedFace> disassociatedFaces) {
        if (disassociatedFaces == null) {
            this.disassociatedFaces = null;
            return;
        }

        this.disassociatedFaces = new java.util.ArrayList<DisassociatedFace>(disassociatedFaces);
    }

    /**
     * <p>
     * An array of DissociatedFace objects containing FaceIds that are
     * successfully disassociated with the UserID is returned. Returned if the
     * DisassociatedFaces action is successful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disassociatedFaces <p>
     *            An array of DissociatedFace objects containing FaceIds that
     *            are successfully disassociated with the UserID is returned.
     *            Returned if the DisassociatedFaces action is successful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateFacesResult withDisassociatedFaces(DisassociatedFace... disassociatedFaces) {
        if (getDisassociatedFaces() == null) {
            this.disassociatedFaces = new java.util.ArrayList<DisassociatedFace>(
                    disassociatedFaces.length);
        }
        for (DisassociatedFace value : disassociatedFaces) {
            this.disassociatedFaces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of DissociatedFace objects containing FaceIds that are
     * successfully disassociated with the UserID is returned. Returned if the
     * DisassociatedFaces action is successful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disassociatedFaces <p>
     *            An array of DissociatedFace objects containing FaceIds that
     *            are successfully disassociated with the UserID is returned.
     *            Returned if the DisassociatedFaces action is successful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateFacesResult withDisassociatedFaces(
            java.util.Collection<DisassociatedFace> disassociatedFaces) {
        setDisassociatedFaces(disassociatedFaces);
        return this;
    }

    /**
     * <p>
     * An array of UnsuccessfulDisassociation objects containing FaceIds that
     * are not successfully associated, along with the reasons for the failure
     * to associate. Returned if the DisassociateFaces action is successful.
     * </p>
     *
     * @return <p>
     *         An array of UnsuccessfulDisassociation objects containing FaceIds
     *         that are not successfully associated, along with the reasons for
     *         the failure to associate. Returned if the DisassociateFaces
     *         action is successful.
     *         </p>
     */
    public java.util.List<UnsuccessfulFaceDisassociation> getUnsuccessfulFaceDisassociations() {
        return unsuccessfulFaceDisassociations;
    }

    /**
     * <p>
     * An array of UnsuccessfulDisassociation objects containing FaceIds that
     * are not successfully associated, along with the reasons for the failure
     * to associate. Returned if the DisassociateFaces action is successful.
     * </p>
     *
     * @param unsuccessfulFaceDisassociations <p>
     *            An array of UnsuccessfulDisassociation objects containing
     *            FaceIds that are not successfully associated, along with the
     *            reasons for the failure to associate. Returned if the
     *            DisassociateFaces action is successful.
     *            </p>
     */
    public void setUnsuccessfulFaceDisassociations(
            java.util.Collection<UnsuccessfulFaceDisassociation> unsuccessfulFaceDisassociations) {
        if (unsuccessfulFaceDisassociations == null) {
            this.unsuccessfulFaceDisassociations = null;
            return;
        }

        this.unsuccessfulFaceDisassociations = new java.util.ArrayList<UnsuccessfulFaceDisassociation>(
                unsuccessfulFaceDisassociations);
    }

    /**
     * <p>
     * An array of UnsuccessfulDisassociation objects containing FaceIds that
     * are not successfully associated, along with the reasons for the failure
     * to associate. Returned if the DisassociateFaces action is successful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessfulFaceDisassociations <p>
     *            An array of UnsuccessfulDisassociation objects containing
     *            FaceIds that are not successfully associated, along with the
     *            reasons for the failure to associate. Returned if the
     *            DisassociateFaces action is successful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateFacesResult withUnsuccessfulFaceDisassociations(
            UnsuccessfulFaceDisassociation... unsuccessfulFaceDisassociations) {
        if (getUnsuccessfulFaceDisassociations() == null) {
            this.unsuccessfulFaceDisassociations = new java.util.ArrayList<UnsuccessfulFaceDisassociation>(
                    unsuccessfulFaceDisassociations.length);
        }
        for (UnsuccessfulFaceDisassociation value : unsuccessfulFaceDisassociations) {
            this.unsuccessfulFaceDisassociations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of UnsuccessfulDisassociation objects containing FaceIds that
     * are not successfully associated, along with the reasons for the failure
     * to associate. Returned if the DisassociateFaces action is successful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param unsuccessfulFaceDisassociations <p>
     *            An array of UnsuccessfulDisassociation objects containing
     *            FaceIds that are not successfully associated, along with the
     *            reasons for the failure to associate. Returned if the
     *            DisassociateFaces action is successful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateFacesResult withUnsuccessfulFaceDisassociations(
            java.util.Collection<UnsuccessfulFaceDisassociation> unsuccessfulFaceDisassociations) {
        setUnsuccessfulFaceDisassociations(unsuccessfulFaceDisassociations);
        return this;
    }

    /**
     * <p>
     * The status of an update made to a User. Reflects if the User has been
     * updated for every requested change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, UPDATING, CREATING, CREATED
     *
     * @return <p>
     *         The status of an update made to a User. Reflects if the User has
     *         been updated for every requested change.
     *         </p>
     * @see UserStatus
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * <p>
     * The status of an update made to a User. Reflects if the User has been
     * updated for every requested change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, UPDATING, CREATING, CREATED
     *
     * @param userStatus <p>
     *            The status of an update made to a User. Reflects if the User
     *            has been updated for every requested change.
     *            </p>
     * @see UserStatus
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * <p>
     * The status of an update made to a User. Reflects if the User has been
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
     *            The status of an update made to a User. Reflects if the User
     *            has been updated for every requested change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserStatus
     */
    public DisassociateFacesResult withUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    /**
     * <p>
     * The status of an update made to a User. Reflects if the User has been
     * updated for every requested change.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, UPDATING, CREATING, CREATED
     *
     * @param userStatus <p>
     *            The status of an update made to a User. Reflects if the User
     *            has been updated for every requested change.
     *            </p>
     * @see UserStatus
     */
    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus.toString();
    }

    /**
     * <p>
     * The status of an update made to a User. Reflects if the User has been
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
     *            The status of an update made to a User. Reflects if the User
     *            has been updated for every requested change.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserStatus
     */
    public DisassociateFacesResult withUserStatus(UserStatus userStatus) {
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
        if (getDisassociatedFaces() != null)
            sb.append("DisassociatedFaces: " + getDisassociatedFaces() + ",");
        if (getUnsuccessfulFaceDisassociations() != null)
            sb.append("UnsuccessfulFaceDisassociations: " + getUnsuccessfulFaceDisassociations()
                    + ",");
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
                + ((getDisassociatedFaces() == null) ? 0 : getDisassociatedFaces().hashCode());
        hashCode = prime
                * hashCode
                + ((getUnsuccessfulFaceDisassociations() == null) ? 0
                        : getUnsuccessfulFaceDisassociations().hashCode());
        hashCode = prime * hashCode + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateFacesResult == false)
            return false;
        DisassociateFacesResult other = (DisassociateFacesResult) obj;

        if (other.getDisassociatedFaces() == null ^ this.getDisassociatedFaces() == null)
            return false;
        if (other.getDisassociatedFaces() != null
                && other.getDisassociatedFaces().equals(this.getDisassociatedFaces()) == false)
            return false;
        if (other.getUnsuccessfulFaceDisassociations() == null
                ^ this.getUnsuccessfulFaceDisassociations() == null)
            return false;
        if (other.getUnsuccessfulFaceDisassociations() != null
                && other.getUnsuccessfulFaceDisassociations().equals(
                        this.getUnsuccessfulFaceDisassociations()) == false)
            return false;
        if (other.getUserStatus() == null ^ this.getUserStatus() == null)
            return false;
        if (other.getUserStatus() != null
                && other.getUserStatus().equals(this.getUserStatus()) == false)
            return false;
        return true;
    }
}
