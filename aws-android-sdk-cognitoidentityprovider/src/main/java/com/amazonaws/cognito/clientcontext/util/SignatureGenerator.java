package com.amazonaws.cognito.clientcontext.util;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.amazonaws.cognito.clientcontext.data.ConfigurationConstant;

import com.amazonaws.android.util.Base64;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Create the signature for context data. It create HMAC_SHA256 for the
 * stringified JSON payload data and then encode it in Base64. Payload contains
 * username, userpoolId and timestamp so these are already factored in the
 * generated signature.
 */
public class SignatureGenerator {
    private static final String TAG = "HMAC_SHA256_Signature";
    private static final String ALGORITHM = "HmacSHA256";
    private static final Log LOGGER = LogFactory.getLog(SignatureGenerator.class);

    /**
     * Generates the signature for the JSON data payload.
     * 
     * @param data
     *            JSON payload for contextData.
     * @param secret
     *            secret key used for generating the signature.
     * @return signature string for the payload.
     */
    public String getSignature(String data, String secret, String version) {
        String signature = "";
        try {
            Mac sha256Hmac = Mac.getInstance(ALGORITHM);
            SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes(ConfigurationConstant.DEFAULT_CHARSET), ALGORITHM);
            sha256Hmac.init(secretKey);
            
            byte[] versionBytes = version.getBytes(ConfigurationConstant.DEFAULT_CHARSET);
            sha256Hmac.update(versionBytes);

            byte[] dataBytes = data.getBytes(ConfigurationConstant.DEFAULT_CHARSET);
            signature = Base64.encodeToString(sha256Hmac.doFinal(dataBytes), Base64.DEFAULT);
        } catch (Exception e) {
            logWarning(e);
        }
        return signature;
    }

    private void logWarning(Exception e) {
        LOGGER.warn("Exception while completing context data signature", e);
    }
}

