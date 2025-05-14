package com.flagship.backend

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class FeatureConfigController {

    @GetMapping("/feature-config")
    fun featureConfig(): FeatureConfig {
        return FeatureConfig(10, 5)
    }


}
