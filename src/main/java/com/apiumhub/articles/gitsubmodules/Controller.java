package com.apiumhub.articles.gitsubmodules;

import com.apiumhub.articles.gitsubmodules.api.client.ApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.apiumhub.articles.gitsubmodules.Helper.*;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class Controller {

    private final ApiClient apiClient;

    @GetMapping("/user/info")
    public String userInfo() {
        return USER_JOHN;
    }

    @GetMapping("/bank/info")
    public String getBankInfo() {
        return addToUser(apiClient.get(MSS2_SERVER + "/bank/info", String.class));
    }

    @GetMapping("/api/client/exception")
    public String apiClientException() {
        return apiClient.get(MSS2_SERVER + "/non/existent", String.class);
    }

}
