package com.luandeptrai.configservice.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class JwtConfig {
  @Value("${security.jwt.uri:/auth/**}")
  private String Uri = "/auth/**";

  @Value("${security.jwt.header:Authorization}")
  private String header = "Authorization";

  @Value("${security.jwt.prefix:Bearer }")
  private String prefix = "Bearer ";

  @Value("${security.jwt.expiration:#{24*60*60}}")
  private int expiration = 24 * 60 * 60;

  @Value("${security.jwt.secret:JwtSecretKey}")
  private String secret = "JwtSecretKey";

  public String getUri() {
    return Uri;
  }

  public void setUri(String uri) {
    Uri = uri;
  }

  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public int getExpiration() {
    return expiration;
  }

  public void setExpiration(int expiration) {
    this.expiration = expiration;
  }

  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }
}

