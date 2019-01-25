package com.amazonaws.mobileconnectors.iot;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.auth.SigningAlgorithm;
import com.amazonaws.regions.Region;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Date;

import static com.amazonaws.util.StringUtils.UTF8;

/**
 * The AWSIotWebSocketUrlSigner class creates the SigV4 signature and builds a connection
 * URL to be used with the Paho MQTT client.
 */
class AWSIotWebSocketUrlSigner {

    /** Constant defining the algorithm specifier in SigV4 parameters. */
    private static final String ALGORITHM = "AWS4-HMAC-SHA256";
    /** Constant defining the key prefix string in SigV4 parameters. */
    private static final String KEY_PREFIX = "AWS4";
    /** Constant defining the terminator string in SigV4 parameters. */
    private static final String TERMINATOR = "aws4_request";
    /** Short date format pattern used in SigV4 parameters. */
    private static final String DATE_PATTERN = "yyyyMMdd";
    /** ISO 8601 date + time format pattern used in SigV4 signature parameters. */
    private static final String TIME_PATTERN = "yyyyMMdd'T'HHmmss'Z'";
    /** Constant defining the HTTP method for initiating a WebSocket connection. */
    private static final String METHOD = "GET";
    /** URI for WebSocket endpoint when doing initial HTTP operation. */
    private static final String CANONICAL_URI = "/mqtt";

    /**
     * Service name used when constructing the endpoint and singing the URL.
     */
    private String signerServiceName;

    /**
     * Create a new AWSIotWebSocketUrlSigner.
     * @param serviceName AWS IoT service name used in SigV4 algorithm.
     */
    public AWSIotWebSocketUrlSigner(String serviceName) {
        signerServiceName = serviceName;
    }

    /**
     * Given the region and service name provided to the client, the endpoint and the current time
     * return a signed connection URL to be used when connecting via WebSocket to AWS IoT.
     * @param endpoint service endpoint with or without customer specific URL prefix.
     * @param awsCredentials credential set to be used in SigV4 signature algorithm.
     * @param currentTimeInMillis time value to be used in SigV4 calculations.  In milliseconds.
     * @return a URL with SigV4 signature formatted to be used with AWS IoT.
     */
    public String getSignedUrl(String endpoint, AWSCredentials awsCredentials, long currentTimeInMillis) {
        // anonymous credentials, don't sign
        if (awsCredentials instanceof AnonymousAWSCredentials) {
            throw new IllegalArgumentException("Credentials cannot be Anonymous");
        }

        Region signerRegion = AwsIotEndpointUtility.getRegionFromIotEndpoint(endpoint);
        String signerRegionName = signerRegion.getName();

        AWSCredentials sanitizedCredentials = sanitizeCredentials(awsCredentials);

        // Create a canonical request for signature version 4

        // SigV4 canonical string uses time in two formats (date and full date/time)
        String amzDate = getAmzDate(currentTimeInMillis);       // full date/time
        String dateStamp = getDateStamp(currentTimeInMillis);   // date
        // Credential scoped to date and region
        String credentialScope = dateStamp + "/" + signerRegionName + "/" + signerServiceName + "/aws4_request";
        // Now build the canonical string
        StringBuilder canonicalQueryStringBuilder = new StringBuilder();
        canonicalQueryStringBuilder.append("X-Amz-Algorithm=").append(ALGORITHM);
        canonicalQueryStringBuilder.append("&X-Amz-Credential=");
        try {
            canonicalQueryStringBuilder.append(URLEncoder.encode(sanitizedCredentials.getAWSAccessKeyId() + "/" + credentialScope, UTF8.name()));
        } catch (UnsupportedEncodingException e) {
            throw new AmazonClientException("Error encoding URL when building WebSocket URL", e);
        }
        canonicalQueryStringBuilder.append("&X-Amz-Date=").append(amzDate);
        canonicalQueryStringBuilder.append("&X-Amz-SignedHeaders=host");

        // headers and payload for the signing request
        // not used in an WebSocket URL, but encoded into the signature string
        String canonicalHeaders = "host:" + endpoint + "\n";
        String payloadHash = BinaryUtils.toHex(hash(""));

        // The request to sign includes the HTTP method, path, query string, headers and payload
        String canonicalRequest = METHOD + "\n"
                + CANONICAL_URI + "\n"
                + canonicalQueryStringBuilder.toString() + "\n"
                + canonicalHeaders + "\nhost\n" + payloadHash;

        // Create a string to sign, generate a signing key...
        String stringToSign = ALGORITHM + "\n" + amzDate + "\n" + credentialScope + "\n" + BinaryUtils.toHex(hash(canonicalRequest));
        byte[] signingKey = getSigningKey(dateStamp, signerRegionName, signerServiceName, sanitizedCredentials);
        // ...and sign the string.
        byte[] signatureBytes = sign(stringToSign.getBytes(), signingKey, SigningAlgorithm.HmacSHA256);
        String signature = BinaryUtils.toHex(signatureBytes);

        // Add the signature to the query string.
        canonicalQueryStringBuilder.append("&X-Amz-Signature=");
        canonicalQueryStringBuilder.append(signature);

        // Now build the URL.
        String requestUrl = "wss://" + endpoint + CANONICAL_URI + "?" + canonicalQueryStringBuilder.toString();

        // If there are session credentials (from an STS server, AssumeRole, or Amazon Cognito),
        // append the session token to the end of the URL string after signing.
        if (awsCredentials instanceof AWSSessionCredentials) {
            String sessionToken = null;
            try {
                sessionToken = URLEncoder.encode(((AWSSessionCredentials) awsCredentials).getSessionToken(), UTF8.name());
            } catch (UnsupportedEncodingException e) {
                throw new AmazonClientException("Error encoding URL when appending session token to URL", e);
            }
            requestUrl += "&X-Amz-Security-Token=" + sessionToken;
        }

        return requestUrl;
    }

    /**
     * The SigV4 signing key is made up by consecutively hashing a number of unique pieces of data.
     * @param dateStamp the current date in short date format.
     * @param regionName AWS region name.
     * @param serviceName service name for IoT service.
     * @param credentials AWS credential set to be used in signing.
     * @return byte array containing the SigV4 signing key.
     */
    private byte[] getSigningKey(String dateStamp, String regionName, String serviceName, AWSCredentials credentials)
    {
        // AWS4 uses a series of derived keys, formed by hashing different pieces of data
        byte[] signingSecret = (KEY_PREFIX + credentials.getAWSSecretKey()).getBytes();
        byte[] signingDate = sign(dateStamp, signingSecret, SigningAlgorithm.HmacSHA256);
        byte[] signingRegion = sign(regionName, signingDate, SigningAlgorithm.HmacSHA256);
        byte[] signingService = sign(serviceName, signingRegion, SigningAlgorithm.HmacSHA256);
        return sign(TERMINATOR, signingService, SigningAlgorithm.HmacSHA256);
    }

    /**
     * Given the input epoch time returns a String of the proper format for the
     * ISO 8601 date + time in SigV4 parameters.
     * @param dateMilli desired date in milliseconds since epoch, UTC.
     * @return date formatted string in ISO 8601 date + time format.
     */
    private String getAmzDate(long dateMilli) {
        return DateUtils.format(TIME_PATTERN, new Date(dateMilli));
    }

    /**
     * Given the input epoch time returns a String of the proper format for the
     * short date in SigV4 parameters.
     * @param dateMilli desired date in milliseconds since epoch, UTC.
     * @return date formatted string in short date format.
     */
    private String getDateStamp(long dateMilli) {
        return DateUtils.format(DATE_PATTERN, new Date(dateMilli));
    }

    /**
     * Loads the individual access key ID and secret key from the specified
     * credentials and trimming any extra whitespace from the credentials.
     *
     * @param credentials AWSCredentials to be sanitized.
     * @return A new credentials object with the sanitized credentials.
     */
    AWSCredentials sanitizeCredentials(AWSCredentials credentials) {
        String accessKeyId = null;
        String secretKey = null;
        String token = null;

        accessKeyId = credentials.getAWSAccessKeyId();
        secretKey = credentials.getAWSSecretKey();
        if (credentials instanceof AWSSessionCredentials) {
            token = ((AWSSessionCredentials) credentials).getSessionToken();
        }

        if (secretKey != null) {
            secretKey = secretKey.trim();
        }
        if (accessKeyId != null) {
            accessKeyId = accessKeyId.trim();
        }
        if (token != null) {
            token = token.trim();
        }

        if (credentials instanceof AWSSessionCredentials) {
            return new BasicSessionCredentials(accessKeyId, secretKey, token);
        }

        return new BasicAWSCredentials(accessKeyId, secretKey);
    }

    /**
     * Hashes the string contents (assumed to be UTF-8) using the SHA-256
     * algorithm.
     *
     * @param text The string to hash.
     * @return The hashed bytes from the specified string.
     * @throws AmazonClientException If the hash cannot be computed.
     */
    byte[] hash(String text) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(text.getBytes(UTF8));
            return md.digest();
        } catch (Exception e) {
            throw new AmazonClientException("Unable to compute hash while signing request: "
                    + e.getMessage(), e);
        }
    }

    /**
     * Sign the given string with the key provide using the specified agorithm.
     *
     * @param stringData String to be signed.
     * @param key the key for signing.
     * @param algorithm the signature algorithm.
     * @return a byte array containing the signed string.
     * @throws AmazonClientException in the case of a signature error.
     */
    byte[] sign(String stringData, byte[] key, SigningAlgorithm algorithm) {
        try {
            byte[] data = stringData.getBytes(UTF8);
            return sign(data, key, algorithm);
        } catch (Exception e) {
            throw new AmazonClientException("Unable to calculate a request signature: "
                    + e.getMessage(), e);
        }
    }

    /**
     * Sign the given data with the key provide using the specified agorithm.
     *
     * @param data byte buffer of data to be signed.
     * @param key the key for signing.
     * @param algorithm the signature algorithm.
     * @return a byte array containing the signed string.
     * @throws AmazonClientException in the case of a signature error.
     */
    byte[] sign(byte[] data, byte[] key, SigningAlgorithm algorithm) {
        try {
            Mac mac = Mac.getInstance(algorithm.toString());
            mac.init(new SecretKeySpec(key, algorithm.toString()));
            return mac.doFinal(data);
        } catch (Exception e) {
            throw new AmazonClientException("Unable to calculate a request signature: "
                    + e.getMessage(), e);
        }
    }
}
