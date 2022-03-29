package io.shopee.jenkins.plugins.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author huanglh
 */
public class HttpPostQex {

    public static String sendWithBody(String body) throws MalformedURLException, ProtocolException, IOException {
        URL url = new URL("http://example.com/qex/v1/jenkins/upload");
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("POST");
        http.setDoOutput(true);
        http.setRequestProperty("Content-Type", "application/json");

        byte[] out = body.getBytes(StandardCharsets.UTF_8);

        OutputStream stream = http.getOutputStream();
        stream.write(out);

        http.disconnect();
        return http.getResponseCode() + " " + http.getResponseMessage();

    }
}
