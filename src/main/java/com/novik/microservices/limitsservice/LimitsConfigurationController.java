package com.novik.microservices.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.novik.microservices.limitsservice.bean.LimitConfiguration;

/**
 * LimitsConfigurationController.
 * @author Kate Novik
 */
@RestController
public class LimitsConfigurationController {

  @GetMapping("/limits")
  public LimitConfiguration retrieveLimitsFromConfigurations() {
    return new LimitConfiguration(1, 1000);
  }

}
