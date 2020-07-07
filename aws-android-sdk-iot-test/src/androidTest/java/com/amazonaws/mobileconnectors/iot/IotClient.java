/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.iot;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.util.Log;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.iot.AWSIot;
import com.amazonaws.services.iot.AWSIotClient;
import com.amazonaws.services.iot.model.AttachPolicyRequest;
import com.amazonaws.services.iot.model.AuthorizerStatus;
import com.amazonaws.services.iot.model.Certificate;
import com.amazonaws.services.iot.model.CertificateStatus;
import com.amazonaws.services.iot.model.CreateAuthorizerRequest;
import com.amazonaws.services.iot.model.CreateKeysAndCertificateRequest;
import com.amazonaws.services.iot.model.CreateKeysAndCertificateResult;
import com.amazonaws.services.iot.model.CreatePolicyRequest;
import com.amazonaws.services.iot.model.DeleteAuthorizerRequest;
import com.amazonaws.services.iot.model.DeleteCertificateRequest;
import com.amazonaws.services.iot.model.DeletePolicyRequest;
import com.amazonaws.services.iot.model.DescribeEndpointRequest;
import com.amazonaws.services.iot.model.DescribeEndpointResult;
import com.amazonaws.services.iot.model.DetachPolicyRequest;
import com.amazonaws.services.iot.model.ListCertificatesRequest;
import com.amazonaws.services.iot.model.ListCertificatesResult;
import com.amazonaws.services.iot.model.ListTargetsForPolicyRequest;
import com.amazonaws.services.iot.model.ListTargetsForPolicyResult;
import com.amazonaws.services.iot.model.ResourceNotFoundException;
import com.amazonaws.services.iot.model.UpdateAuthorizerRequest;
import com.amazonaws.services.iot.model.UpdateCertificateRequest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Wrapper for the {@link AWSIot} client, to reduce boilerplate in test.
 * This class should only import classes beginning com.amazonaws.services.iot,
 * and the methods here should stick to the script wrt IoT service APIs.
 */
@SuppressWarnings({"SameParameterValue", "UnusedReturnValue"})
final class IotClient {
    private static final String TAG = IotClient.class.getSimpleName();
    private static final int PAGE_SIZE = 100;

    private final AWSIot iot;
    private final Map<String, String> endpointsCache;

    IotClient(AWSCredentialsProvider credentialsProvider) {
        this.iot = new AWSIotClient(credentialsProvider);
        this.endpointsCache = new HashMap<>();
    }

    String getEndpointAddress() {
        return getEndpointAddress(null);
    }

    String getEndpointAddress(@Nullable String endpointType) {
        String cachedValue = endpointsCache.get(endpointType);
        if (cachedValue != null) {
            Log.d(TAG, "Retrieved cached endpoint = " + cachedValue + " for type = " + endpointType);
            return cachedValue;
        }
        Log.d(TAG, "No cached endpoint of type " + endpointType + ", retrieving now.");

        DescribeEndpointRequest request = new DescribeEndpointRequest();
        if (endpointType != null) {
            request.setEndpointType(endpointType);
        }
        DescribeEndpointResult result = iot.describeEndpoint(request);
        String endpointAddress = result.getEndpointAddress();
        endpointsCache.put(endpointType, endpointAddress);
        return endpointAddress;
    }

    String getEndpointPrefix() {
        return getEndpointPrefix(null);
    }

    String getEndpointPrefix(@Nullable String endpointType) {
        return getEndpointAddress(endpointType).split("\\.")[0];
    }

    void deleteCertificate(@NonNull String certificateId) {
        Objects.requireNonNull(certificateId);

        Log.d(TAG, "Deleting certificate with ID = " + certificateId);

        DeleteCertificateRequest deleteCertificateRequest = new DeleteCertificateRequest();
        deleteCertificateRequest.setCertificateId(certificateId);
        iot.deleteCertificate(deleteCertificateRequest);
    }

    void updateCertificate(
            @NonNull String certificateId, @NonNull CertificateStatus certificateStatus) {
        Objects.requireNonNull(certificateId);
        Objects.requireNonNull(certificateStatus);

        Log.d(TAG, "Updating certificate status for = " + certificateId + ", to " + certificateStatus);

        UpdateCertificateRequest updateCertificateRequest = new UpdateCertificateRequest();
        updateCertificateRequest.setCertificateId(certificateId);
        updateCertificateRequest.setNewStatus(certificateStatus);
        iot.updateCertificate(updateCertificateRequest);
    }

    @NonNull
    KeysAndCertificateInfo createActiveKeysAndCertificate() {
        Log.d(TAG, "Creating keys & certificate info.");
        CreateKeysAndCertificateRequest certRequest = new CreateKeysAndCertificateRequest();
        certRequest.setSetAsActive(true);
        CreateKeysAndCertificateResult result = iot.createKeysAndCertificate(certRequest);
        return new KeysAndCertificateInfo(result);
    }

    @NonNull
    KeysAndCertificateInfo createAndAttachPolicy(
            @NonNull String policyName, @NonNull String policyDocument) {
        Objects.requireNonNull(policyName);
        Objects.requireNonNull(policyDocument);

        Log.d(TAG, "Creating & attaching policy, name = " + policyName + ", document = " + policyDocument);

        KeysAndCertificateInfo keysAndCertificateInfo = createActiveKeysAndCertificate();
        createPolicy(policyName, policyDocument);
        attachPolicy(policyName, keysAndCertificateInfo.getCertificateArn());
        return Objects.requireNonNull(keysAndCertificateInfo);
    }

    List<Certificate> listCertificates() {
        Log.d(TAG, "Listing certificates...");
        List<Certificate> certificates = new ArrayList<>();
        String nextToken = null;
        int pageNum = 0;
        do {
            Log.d(TAG, "Processing page " + pageNum++ + " of certificates.");
            ListCertificatesRequest request = new ListCertificatesRequest();
            request.setMarker(nextToken);
            request.setPageSize(PAGE_SIZE);
            ListCertificatesResult result = iot.listCertificates(request);
            certificates.addAll(result.getCertificates());
            nextToken = result.getNextMarker();
        } while (nextToken != null);
        return certificates;
    }

    // Deletes any associated certificates, and detaches/deletes the policy.
    void cleanupPolicy(String policyName) {
        Log.d(TAG, "Cleaning up policy " + policyName + ". Will remove any/all certificates/documents.");
        List<String> certificateArns = listTargetsForPolicy(policyName);
        for (String certificateArn : certificateArns) {
            detachPolicy(policyName, certificateArn);
        }
        for (Certificate certificate : listCertificates()) {
            updateCertificate(certificate.getCertificateId(), CertificateStatus.INACTIVE);
            deleteCertificate(certificate.getCertificateId());
        }
        deletePolicy(policyName);
    }

    List<String> listTargetsForPolicy(String policyName) {
        Log.d(TAG, "Listing all targets for policy named = " + policyName);
        List<String> targets = new ArrayList<>();
        String nextToken = null;
        int pageNum = 0;
        do {
            ListTargetsForPolicyRequest request = new ListTargetsForPolicyRequest();
            request.setPolicyName(policyName);
            request.setPageSize(PAGE_SIZE);
            request.setMarker(nextToken);
            ListTargetsForPolicyResult result;
            try {
                Log.d(TAG, "Processing page " + pageNum++ + " of policy targets.");
                result = iot.listTargetsForPolicy(request);
                targets.addAll(result.getTargets());
                nextToken = result.getNextMarker();
            } catch (ResourceNotFoundException noSuchPolicyException) {
                nextToken = null;
            }
        } while (nextToken != null);
        return targets;
    }

    void createPolicy(String policyName, String policyDocument) {
        Log.d(TAG, "Creating policy " + policyName + " with document = " + policyDocument);
        CreatePolicyRequest createPolicyRequest;
        createPolicyRequest = new CreatePolicyRequest();
        createPolicyRequest.setPolicyName(policyName);
        createPolicyRequest.setPolicyDocument(policyDocument);
        iot.createPolicy(createPolicyRequest);
    }

    void attachPolicy(String policyName, String certificateArn) {
        Log.d(TAG, "Attaching policy " + policyName + " from certificate ARN = " + certificateArn);
        AttachPolicyRequest attachPolicyRequest = new AttachPolicyRequest();
        attachPolicyRequest.setPolicyName(policyName);
        attachPolicyRequest.setTarget(certificateArn);
        iot.attachPolicy(attachPolicyRequest);
    }

    void detachPolicy(@NonNull String policyName, @NonNull String certificateArn) {
        Objects.requireNonNull(policyName);
        Log.d(TAG, "Detaching policy " + policyName + " from certificate ARN = " + certificateArn);
        DetachPolicyRequest detachPolicyRequest = new DetachPolicyRequest();
        detachPolicyRequest.setPolicyName(policyName);
        detachPolicyRequest.setTarget(certificateArn);
        iot.detachPolicy(detachPolicyRequest);
    }

    // Returns true if there was a policy and it was deleted;
    // returns false if there was not a policy and so there was nothing to delete
    // throws exceptions in other cases where there was something to delete, but
    // that process failed for some reason.
    boolean deletePolicy(String policyName) {
        Log.d(TAG, "Deleting policy: " + policyName);
        DeletePolicyRequest deletePolicyRequest = new DeletePolicyRequest();
        deletePolicyRequest.setPolicyName(policyName);
        try {
            iot.deletePolicy(deletePolicyRequest);
            return true;
        } catch (ResourceNotFoundException noSuchPolicy) {
            return false;
        }
    }

    void createAuthorizer(
            @NonNull String authorizerName,
            @NonNull String authorizerFunctionArn,
            @NonNull String tokenKeyName,
            @NonNull String publicKey) {
        Objects.requireNonNull(authorizerName);
        Objects.requireNonNull(authorizerFunctionArn);
        Objects.requireNonNull(tokenKeyName);
        Objects.requireNonNull(publicKey);

        CreateAuthorizerRequest request = new CreateAuthorizerRequest();
        request.setSigningDisabled(false);
        request.setAuthorizerName(authorizerName);
        request.setAuthorizerFunctionArn(authorizerFunctionArn);
        request.setTokenKeyName(tokenKeyName);
        request.setStatus(AuthorizerStatus.ACTIVE);
        request.setTokenSigningPublicKeys(Collections.singletonMap("FIRST_KEY", publicKey));
        iot.createAuthorizer(request);
    }

    // Returns true if the authorizer existed and was cleaned up.
    // Returns false if there was no such authorizer.
    // Throws an exception if there was an authorizer, but cleanup failed.
    boolean cleanupAuthorizer(String authorizerName) {
        try {
            updateAuthorizer(authorizerName, AuthorizerStatus.INACTIVE);
            deleteAuthorizer(authorizerName);
            return true;
        } catch (ResourceNotFoundException noSuchAuthorizer) {
            return false;
        }
    }

    private void updateAuthorizer(String authorizerName, AuthorizerStatus status) {
        UpdateAuthorizerRequest request = new UpdateAuthorizerRequest();
        request.setAuthorizerName(authorizerName);
        request.setStatus(status);
        iot.updateAuthorizer(request);
    }

    private void deleteAuthorizer(String authorizerName) {
        DeleteAuthorizerRequest request = new DeleteAuthorizerRequest();
        request.setAuthorizerName(authorizerName);
        iot.deleteAuthorizer(request);
    }

    /**
     * A wrapper around the {@link CreateKeysAndCertificateResult}, so that we
     * fully encapsulate interactions with the {@link AWSIotClient} and its input/output types.
     */
    static final class KeysAndCertificateInfo {
        private CreateKeysAndCertificateResult result;

        KeysAndCertificateInfo(CreateKeysAndCertificateResult result) {
            this.result = Objects.requireNonNull(result);
        }

        String getCertificatePem() {
            return result.getCertificatePem();
        }

        String getCertificateArn() {
            return result.getCertificateArn();
        }

        String getCertificateId() {
            return result.getCertificateId();
        }

        String getPrivateKey() {
            return result.getKeyPair().getPrivateKey();
        }

        String getPublicKey() {
            return result.getKeyPair().getPublicKey();
        }
    }
}
