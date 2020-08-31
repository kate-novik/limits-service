package com.novik.microservices.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.novik.microservices.limitsservice.bean.LimitConfiguration;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * LimitsConfigurationController.
 * @author Kate Novik
 */
@Slf4j
@RequiredArgsConstructor
@RestController
public class LimitsConfigurationController {

  @NonNull
  private final Configuration configuration;

  @GetMapping("/limits")
  public LimitConfiguration retrieveLimitsFromConfigurations() {
    return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
  }

  @GetMapping("/fault-tolerance-example")
  @HystrixCommand(fallbackMethod = "fallbackRetrieveConfiguration")
  public LimitConfiguration retrieveConfiguration() {
    throw new RuntimeException("Not available.");
  }

  public LimitConfiguration fallbackRetrieveConfiguration() {
    return new LimitConfiguration(9, 999);
  }

}
