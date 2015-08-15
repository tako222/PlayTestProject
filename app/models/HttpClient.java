package models;

import java.io.IOException;

import models.result.WeatherResult;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.apache.ApacheHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;

public class HttpClient {

    private HttpClient() {
    }

    public static WeatherResult searchURL(String url) {

        ApacheHttpTransport transport = new ApacheHttpTransport();
        HttpRequestFactory factory = transport
                .createRequestFactory(new HttpRequestInitializer() {
                    public void initialize(HttpRequest request)
                            throws IOException {
                        request.setConnectTimeout(0);
                        request.setReadTimeout(0);
                        request.setParser(new JacksonFactory()
                                .createJsonObjectParser());
                    }
                });

        try {
            HttpRequest request = factory.buildGetRequest(new GenericUrl(url));
            HttpResponse response = request.execute();
            WeatherResult result = response.parseAs(WeatherResult.class);
            return result;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
