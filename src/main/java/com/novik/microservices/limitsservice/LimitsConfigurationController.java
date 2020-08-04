package com.novik.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.annotation.JacksonInject;
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

}
