package org.jdp.structural.proxy;

import javafx.geometry.Point2D;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class Client implements CommandLineRunner {

  private final ImageFactory imageFactory;
  
  public static void main(String[] args) {
    SpringApplication.run(org.jdp.structural.proxy.Client.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Image image = imageFactory.getImage("A1.bmp");

    image.setLocation(new Point2D(10, 10));
    log.info("Image location is: {}", image.getLocation());
    log.info("rendering image now");
    image.render();
  }

}
